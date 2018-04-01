package com.next.learning.spring.boot.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author nextbin
 * @since 2018-04-01.
 */
@Component
public class DemoConfiguration {

    @Value("${com.next.project}")
    private String project;

    @Value("${com.next.file.tmp.dir}")
    private String fileTmpDir;

//    @Value("${com.next.ref.url}")
    private List<String> refUrls;

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getFileTmpDir() {
        return fileTmpDir;
    }

    public void setFileTmpDir(String fileTmpDir) {
        this.fileTmpDir = fileTmpDir;
    }

    public List<String> getRefUrls() {
        return refUrls;
    }

    public void setRefUrls(List<String> refUrls) {
        this.refUrls = refUrls;
    }
}
