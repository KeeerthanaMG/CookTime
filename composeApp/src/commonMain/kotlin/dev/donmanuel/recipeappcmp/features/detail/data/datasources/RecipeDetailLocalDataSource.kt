package dev.donmanuel.recipeappcmp.features.detail.data.datasources

import dev.donmanuel.recipeappcmp.features.common.domain.entities.RecipeItem

interface RecipeDetailLocalDataSource {

    suspend fun getRecipeDetail(id: Long): RecipeItem?
    suspend fun saveRecipe(recipe: RecipeItem)
    suspend fun addFavorite(recipeId: Long)
    suspend fun removeFavorite(recipeId: Long)
    suspend fun isFavorite(recipeId: Long): Boolean

}