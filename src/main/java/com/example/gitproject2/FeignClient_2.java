package com.example.gitproject2;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "Client_2", url="http://localhost:8081")
public interface FeignClient_2 {

}
