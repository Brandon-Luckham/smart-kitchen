package com.bluckham.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "blogs")
public class Blog {
    @Id
    @Lob
    @Column(name = "name", nullable = false)
    private String name;

    @Lob
    @Column(name = "url")
    private String url;

}