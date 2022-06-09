package com.mi.customer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

@Service
public class CustomerService {

    final private static Logger log = LoggerFactory.getLogger(CustomerService.class);

    @Value("${data.location}")
    private String dataLocation;

    @Value("${data.filename}")
    private String dataFilename;

    public List<Customer> getCustomers(String factory) {
        List<Customer> result = null;

        List<Customer> customers = null;
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Type type = new TypeToken<List<Customer>>() {
        }.getType();

        InputStream stream = null;
        try {
            if (Files.exists(Paths.get(dataLocation + File.separator + dataFilename))) {
                stream = new FileInputStream(dataLocation + File.separator + dataFilename);
            } else {
                stream = this.getClass().getClassLoader().getResourceAsStream(dataFilename);
            }

            customers = gson.fromJson(new InputStreamReader(stream, StandardCharsets.UTF_8), type);
        } catch (FileNotFoundException e) {
            result = new ArrayList<>();
        }

        result = customers.stream().filter(c -> c.getFactory().equals(factory)).collect(Collectors.toList());

        log.info("loaded: {}", gson.toJson(result));
        return result;
    }

}
