package com.xetius;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class CommandLineService {
    static final Logger LOG = LoggerFactory.getLogger(CommandLineService.class);

    public String run() {
        LOG.debug("Starting Application");
        return "Running SpringCommandLineService!";
    }
}
