package me.ifight.wab_ifight.controller;

import me.ifight.wab_ifight.constant.URLConstant;
import me.ifight.wab_ifight.model.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/cityId/{cityId}")
    public WeatherResponse getReportByCityId(@PathVariable("cityId") String cityId){

        System.out.println(URLConstant.cityId);
        ResponseEntity<WeatherResponse> respone = restTemplate.getForEntity(URLConstant.cityId+"/101280601", WeatherResponse.class);

        return respone.getBody();
    }

}
