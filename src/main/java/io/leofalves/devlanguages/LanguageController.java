package io.leofalves.devlanguages;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LanguageController {

    @Autowired
    private LanguageRepository repository;

    @GetMapping(value = "/languages")
    public List<Language> findAllLanguages() {
        return repository.findAll();
    }

    @PostMapping(value = "/languages")
    public Language insertLanguage(@RequestBody Language language) {
        Language result = repository.save(language);
        return result;
    }
}
