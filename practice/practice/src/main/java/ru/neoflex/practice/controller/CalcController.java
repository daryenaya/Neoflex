package ru.neoflex.practice.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.neoflex.practice.controller.ResultOfCalculation;

@RestController
@SpringBootApplication
public class CalcController {

    @GetMapping("/plus/{a}/{b}")
    public Integer calculateSum(@PathVariable Integer a, @PathVariable Integer b) {
        int result = a + b;
        System.out.println("Результат сложения чисел " + a + " и " + b + " равен: " + result);
        return result;
    }

    @GetMapping("/minus/{a}/{b}")
    public Integer calculateDifference(@PathVariable Integer a, @PathVariable Integer b) {
        int result = a - b;
        System.out.println("Результат вычитания числа " + b + " из числа " + a + " равен: " + result);
        return result;
    }
}