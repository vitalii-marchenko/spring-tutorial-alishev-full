package ua.vitalii.marchenko.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
public class Person {
    private int id;
    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, max = 30, message = "Name should be between 2 and 30 chars")
    private String name;
    @Min(value = 0, message = "Age should be greater than 0")
    private int age;
    @NotEmpty(message = "Email should not be empty")
    @Email(message = "Email should be valid")
    private String email;

    // Country, City, Zip (6 digits)
    @Pattern(regexp = "[A-Z]\\w+, [A-Z]\\w+, \\d{6}", message = "Your address should match next pattern Country, City, Zip (6 digits)")
    private String address;

    public Person() {

    }
}
