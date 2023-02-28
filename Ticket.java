// @GetMapping("/trainticket")
// 	public String train() {
//         // Save the user in the database
//         Appointment appointment = new Appointment();



// 		return "trainticket";
// 	}


package com.sheridancollege.security.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
public class Ticket {

    private String firstName;
    private String lastName;
    private String busTicket;
    private String code;
    private String seat;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate appointmentDate;
    @DateTimeFormat(pattern = "HH:mm")
    private LocalTime appointmentTime;


}
