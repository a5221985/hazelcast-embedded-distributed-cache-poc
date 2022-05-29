package com.example.hazelcastembeddeddistributedcachepoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class HazelcastEmbeddedDistributedCachePocApplication {

    public static void main(String[] args) {
        SpringApplication.run(HazelcastEmbeddedDistributedCachePocApplication.class, args);
    }

}
