package com.example.todo.dto;

import com.example.todo.domain.Todo;
import com.example.todo.enums.Priority;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TodoDto {

    private Integer id;
    private String title;
    private String description;

    @JsonFormat(pattern = "dd/mm/yyyy")
    private Date dataClose;
    private Boolean finish = false;

    private Priority priority;

    public TodoDto(Todo todo) {
        this.id = todo.getId();
        this.title = todo.getTitle();
        this.description = todo.getDescription();
        this.dataClose = todo.getDataClose();
        this.finish = todo.getFinish();
        this.priority = todo.getPriority();
    }
}
