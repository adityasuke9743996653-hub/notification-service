//package com.example.demo.controller;
//
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import com.example.demo.DTO.NotificationDTO;
//import com.example.demo.service.EmailNotificationService;
//
//
//
//
//@RestController
//@RequestMapping("/notifications")
//public class NotificationController {
//
//    private final EmailNotificationService emailService;
//
//    public NotificationController(EmailNotificationService emailService) {
//        this.emailService = emailService;
//    }
//
//    @PostMapping("/send")
//    public ResponseEntity<String> sendNotification(@RequestBody NotificationDTO notification) {
//        // Send email
//        emailService.sendEmail(
//                notification.getRecipient(),
//                notification.getSubject(),
//                notification.getMessage()
//        );
//        return ResponseEntity.ok("Notification sent successfully to " + notification.getRecipient());
//    }
//}