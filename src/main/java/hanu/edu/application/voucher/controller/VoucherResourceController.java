package hanu.edu.application.voucher.controller;

import hanu.edu.domain.voucher.model.Voucher;
import hanu.edu.domain.voucher.model.VoucherDTO;
import hanu.edu.domain.voucher.service.VoucherResourceService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class VoucherResourceController {
    private final VoucherResourceService voucherResourceService;

    @PostMapping("/admin/voucher")
    public ResponseEntity<String> create(@RequestBody VoucherDTO voucherDTO) {
        voucherResourceService.create(new Voucher(voucherDTO.getTitle(), voucherDTO.getRate(), voucherDTO.getDueDate()));
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }

    @GetMapping("/admin/voucher/{id}")
    public Voucher getById(@PathVariable long id) {
        return voucherResourceService.getById(id);
    }

    @DeleteMapping("/admin/voucher/{id}")
    public ResponseEntity<String> deleteById(@PathVariable long id) {
        voucherResourceService.deleteById(id);
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }
}