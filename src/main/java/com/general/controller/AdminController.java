package com.general.controller;

import com.general.model.CacheStats;
import com.general.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/cache-cleanup")
    public ResponseEntity<String> cacheCleanUp() {
        return new ResponseEntity<String>(adminService.performCacheCleanup(), HttpStatus.OK);

    }
    @GetMapping("/cache-stats")
    public ResponseEntity<List<CacheStats>> cacheStats() {
        return new ResponseEntity<List<CacheStats>>(adminService.getCacheStats(), HttpStatus.OK);

    }
}
