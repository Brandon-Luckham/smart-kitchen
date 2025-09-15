package com.bluckham.repository;

import com.bluckham.dto.SavedRecipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SavedRecipeRepository extends JpaRepository<SavedRecipe, String> {
    SavedRecipe findByBlogAndRecipeName(String blogName, String recipeName);

    List<SavedRecipe> findAllByFavorite(boolean favorite);
}
