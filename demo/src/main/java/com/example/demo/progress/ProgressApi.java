package com.example.demo.progress;

import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.demo.common.CommonConstants.API_ID;
import static com.example.demo.common.CommonConstants.API_PROGRESSES;

@RequestMapping(API_PROGRESSES)
public interface ProgressApi {

    @GetMapping
    List<Progress> findAll();

    @GetMapping(API_ID)
    Progress findById(@PathVariable Long id);

    @PostMapping
    Progress save(@RequestBody Progress progress);

    @DeleteMapping(API_ID)
    String remove(@PathVariable Long id);

}