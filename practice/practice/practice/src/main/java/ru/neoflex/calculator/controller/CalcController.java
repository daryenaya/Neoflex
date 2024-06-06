package ru.neoflex.calculator.controller;

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
import ru.neoflex.calculator.model.ResultOfCalculation;
import ru.neoflex.calculator.repository.Repository;

@RestController
public class CalcController {
    @Autowired
    private Repository repository;

    @GetMapping("/plus/{a}/{b}")
    public ResultOfCalculation plus(@PathVariable("a") Integer a, @PathVariable("b") Integer b)
    {
        ResultOfCalculation result;
        result = new ResultOfCalculation(null, a.toString()+" + " + b.toString(), a+b);

        if (repository.findByExpression(a.toString()+" + " + b.toString()).isEmpty())
        {
            repository.save(result);
        }

        return repository.findByExpression(a.toString()+" + " + b.toString()).get();
    }

    @GetMapping("/minus/{a}/{b}")
    public ResponseEntity<String> minus(@PathVariable("a") String a,
                                        @PathVariable("b") String b)
    {
        try
        {
            return ResponseEntity.ok().contentType(MediaType.TEXT_PLAIN).body("" + (Integer.parseInt(a) - Integer.parseInt(b)));
        }

        catch(Exception e)
        {
            return ResponseEntity.badRequest().contentType(MediaType.TEXT_PLAIN).body("Неверные входные параметры!");
        }

    }
}