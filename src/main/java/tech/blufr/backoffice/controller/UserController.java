package tech.blufr.backoffice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import tech.blufr.backoffice.domain.User;
import tech.blufr.backoffice.util.DateUtil;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("user")
@Log4j2
@RequiredArgsConstructor
public class UserController {
    private final DateUtil dateUtil;

    @GetMapping(path = "list")
    public List<User> list() {
        log.info(dateUtil.formatDateTimeToDatabaseStyle(LocalDateTime.now()));
        return List.of(new User("Franklin"), new User("Jéssica"));
    }
}
