package io.datadynamics.demo.spring.rest.books.models;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WebsiteUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private String email;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    Timestamp createDate;

    @UpdateTimestamp
    @Column(nullable = false)
    Timestamp updateDate;

}
