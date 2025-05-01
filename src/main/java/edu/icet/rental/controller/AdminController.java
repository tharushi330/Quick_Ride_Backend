package edu.icet.rental.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //api return karana data json format ekakata convert karanwa
@RequiredArgsConstructor
@RequestMapping("api/admin")
@CrossOrigin
@Slf4j //lombok ekata login feature ekak add karanwa
public class AdminController {

}
