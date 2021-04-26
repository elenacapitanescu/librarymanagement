package com.librarymanagement.controller;
//import com.siit.nationalgrupa3.hr.employee.domain.model.EmployeeDtoResponse;
//import com.siit.nationalgrupa3.hr.employee.domain.model.EmployeeDtoCreateRequest;
//import com.siit.nationalgrupa3.hr.employee.domain.model.EmployeeDtoUpdateRequest;
//import com.siit.nationalgrupa3.hr.employee.service.EmployeeService;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.Valid;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import static java.time.LocalDateTime.now;

//@Controller
@Slf4j
@RestController
@RequiredArgsConstructor
//@RequestMapping("api/v1/employees")
public class BookController {
    private final BookService bookService;
}
