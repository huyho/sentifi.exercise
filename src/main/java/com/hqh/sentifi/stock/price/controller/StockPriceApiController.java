package com.hqh.sentifi.stock.price.controller;

import com.hqh.sentifi.stock.price.model.Greeting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@RestController
@RequestMapping("/api/v2")
public class StockPriceApiController {

    public static final Logger logger = LoggerFactory.getLogger(StockPriceApiController.class);

    private static final String DATE_PARTERN = "yyyy-MM-dd";

    @RequestMapping(value = "/{tickerSymbol}/{actionName}", method = RequestMethod.GET)
    public Greeting sayHello(@RequestParam(value = "startDate") @DateTimeFormat(pattern = DATE_PARTERN) Date startDate,
                             @RequestParam(value = "endDate", required = false) @DateTimeFormat(pattern = DATE_PARTERN) Date endDate,
                             @PathVariable("actionName") String actionName,
                             @PathVariable("tickerSymbol") String tickerSymbol) {
        System.out.println(startDate);
        System.out.println(endDate);
        System.out.println(actionName);
        System.out.println(tickerSymbol);

        final String uri = "https://www.quandl.com/api/v3/datasets/WIKI/FB.json";
        final
        final RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        System.out.println(result);

        return new Greeting(1, "sdsd");
    }
}
