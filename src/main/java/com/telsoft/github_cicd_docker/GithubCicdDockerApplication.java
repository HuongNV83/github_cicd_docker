package com.telsoft.github_cicd_docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCicdDockerApplication {
    @GetMapping("/")
    public String getMessage() {
        return "Xin chao!";
    }

    public static void main(String[] args) {
        SpringApplication.run(GithubCicdDockerApplication.class, args);
    }

    /*
    * echo "# github_cicd_docker" >> README.md
    git init
    git add README.md
    git commit -m "first commit"
    git branch -M main
    git remote add origin https://github.com/HuongNV83/github_cicd_docker.git
    git push -u origin main
    * */
}
