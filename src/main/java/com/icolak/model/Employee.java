package com.icolak.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

//    @NotNull        -->   Field shouldn't be null
//    @NotEmpty       -->   Field shouldn't be ""
//    @NotBlank       -->   Field shouldn't be "     "  NotBlank covering all of them

//    @NotNull        -->   @NotNull
//    @NotEmpty       -->   @NotNull + @NotEmpty
//    @NotBlank       -->   @NotNull + @NotEmpty + @NotBlank

    @NotBlank
    @NotEmpty
    @NotNull
    @Size(max = 12, min = 2)
    private String firstName;
    private String lastName;
    // Thymeleaf accepts yyyy-MM-dd which is different from LocalDate
    // so we should put here pattern
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;
    private String email;
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;
}
