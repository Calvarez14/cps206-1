package edu.jalc.inclass.cocacola.recipe.store;

/*

		This is a store of secret recipes.

		There can only be one instance of the store!
		The store houses a collection of recipes that require a pin number to access.
		This pin number belongs to an employee, so only that employee, using their pin, can access the recipe!
		Make sure your `getRecipe` method checks for the employee's pin against the recipes pin! If the pins do not
		match, throw an exception.
 */
public class SecretRecipeStore {

  private static SecretRecipeStore secretRecipeStore = null;
  private static HashMap<PinNumber, Recipe> secretStore;

  private SecretRecipeStore(){
    this.secretStore = new HashMap<>();
  }

  public static SecretRecipeStore getInstance(){
    if(secretRecipeStore == null) secretRecipeStore = new SecretRecipeStore();
    return secretRecipeStore;
  }

  public SecretRecipeStore addRecipe(){
    this.secretStore.put(employee, recipe.getPinNumber());
    return.this;
  }

  public Recipe getRecipe(){
    this.secretRecipeStore = secretRecipeStore;
  }
}
