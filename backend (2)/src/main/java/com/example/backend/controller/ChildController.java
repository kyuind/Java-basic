package com.example.backend.controller;

import com.example.backend.domain.Child;
import com.example.backend.dto.request.ChildModifyRequestDTO;
import com.example.backend.dto.response.ChildTotalGetDTOResponse;
import com.example.backend.service.ChildService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ChildController {
    private final ChildService childService;

    public ChildController(ChildService childService) {
        this.childService = childService;
    }

    @GetMapping("/child/{id}")
    public ResponseEntity<ChildTotalGetDTOResponse> getDTOResponseEntity(@PathVariable Long id){
        ChildTotalGetDTOResponse response = childService.childTotalGetDTOResponse(id);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/modify/{id}")
    public ResponseEntity updateChild(@PathVariable Long id,
                            @RequestBody ChildModifyRequestDTO requestDTO){
        Child updateChild = childService.updateChild(id,requestDTO);
        return ResponseEntity.ok(updateChild);
    }
}
