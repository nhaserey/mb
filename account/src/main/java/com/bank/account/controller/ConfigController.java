package com.bank.account.controller;
import com.bank.account.config.AccountServiceConfig;
import com.bank.account.property.Properties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

@RestController
@RequestMapping("api/accounts/config")
public class ConfigController {
    @Autowired
	private AccountServiceConfig serviceConfig;

    @GetMapping("/properties")
    public String getProperties() throws JsonProcessingException {
        ObjectWriter objectWriter = new ObjectMapper().writer().withDefaultPrettyPrinter();
        Properties properties = new Properties(serviceConfig.getMsg(), serviceConfig.getBuildVersion(),
                serviceConfig.getMailDetails(), serviceConfig.getActiveBranches());
        return objectWriter.writeValueAsString(properties);
    }
}