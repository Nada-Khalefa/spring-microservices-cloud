package com.spring.Team.config;

import com.spring.Team.model.Team;
//import org.springframework.cloud.netflix.ribbon.RibbonClient;
//import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//(Optional) name of service you need
// url of same service
//@FeignClient(name = "football-players",url = "localhost:8589")
@FeignClient(name = "football-players")// http://localhost:4444
//@FeignClient(name = "zuul-service")// http://localhost:9055
//@RibbonClient(name = "football-players")
public interface Proxy {

    @GetMapping("/football-players/buy/{from}/player/{to}")
    //@GetMapping("/football-players/football-players/buy/{from}/player/{to}")
    Team getFootballPlayer(@PathVariable String from, @PathVariable String to);
}
