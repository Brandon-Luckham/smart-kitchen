package com.bluckham.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "saved_recipes")
public class SavedRecipe {
    @Id
    @Lob
    @Column(name = "blog", nullable = false)
    private String blog;

    @Lob
    @Column(name = "recipe_name")
    private String recipeName;

    @Lob
    @Column(name = "url", nullable = false)
    private String url;

    @Column(name = "favorite")
    private Boolean favorite;

    @Column(name = "dislike")
    private Boolean dislike;

    @Lob
    @Column(name = "category")
    private String category;

    @Lob
    @Column(name = "cook_time")
    private String cookTime;

}