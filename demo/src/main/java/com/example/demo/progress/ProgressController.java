package com.example.demo.progress;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class ProgressController implements ProgressApi {

    private final ProgressInterface progressInterface;

    @Override
    public List<Progress> findAll() {
        return progressInterface.findAll();
    }

    @Override
    public Progress findById(@PathVariable Long id) {
        return progressInterface.findById(id);
    }

    @Override
    public Progress save(@RequestBody Progress progress) {
        return progressInterface.save(progress);
    }

    @Override
    public String remove(@PathVariable Long id) {
        try {
            progressInterface.remove(id);
            return "Progress deleted successfully";
        } catch (Exception e) {
            return "Progress not found";
        }
    }

}