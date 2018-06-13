using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CleanCode
{
    class PastaMaker
    {
        public void Cook(SauceType sauce, PastaType pastaType)
        {
            List<Ingredient> ingredients = new List<Ingredient>();
            if (sauce == SauceType.Alfredo)
            {
                ingredients.Add(GetIngredient(IngredientTypes.Cream, Places.Refrigarator));
            }
            else if (sauce == SauceType.Bolognese || sauce == SauceType.Marinara)
            {
                ingredients.Add(GetIngredient(IngredientTypes.Tomato, Places.Garden));
            }
            else if (pastaType == PastaType.Ravioly)
            {
                List<Ingredient> tempIngredients = ingredients.ToList();
                ingredients.Clear();
                ingredients.Add(GetPasta(PastaType.Ravioly, Places.Freezer));
                ingredients.AddRange(tempIngredients);
            }
            else if (sauce == SauceType.Pesto || sauce == SauceType.Marinara)
            {
                ingredients.Add(GetIngredient(IngredientTypes.Basil, Places.Garden));
            }
            else if (sauce == SauceType.Marinara)
            {
                ingredients.Add(GetIngredient(IngredientTypes.Onion, Places.Garden));
            }
            else if (pastaType == PastaType.FreshSpaghetti)
            {
                ingredients.Add(GetPasta(PastaType.FreshSpaghetti, Places.Freezer));
            }
            if (ingredients[0].IsPastaType)
            {
                List<Ingredient> fillingIngredients = ingredients.GetRange(1, ingredients.Count - 1).ToList();
                Prepare(ingredients[0]);
                Fill(fillingIngredients);
                CookPasta();
            }
            else
            {
                CookPasta();
                List<Ingredient> sauceIngredients = ingredients.GetRange(0, ingredients.Count - 1).ToList();
                Prepare(ingredients[ingredients.Count - 1]);
                Fill(sauceIngredients);
                AddSauce();
            }
        }

        private void Fill(List<Ingredient> sauceIngredients) { throw new NotImplementedException(); }
        private void Prepare(Ingredient ingredient) { throw new NotImplementedException(); }
        private void CookPasta() { throw new NotImplementedException(); }
        private void AddSauce() { throw new NotImplementedException(); }
        private Ingredient GetIngredient(IngredientTypes cream, Places refrigarator) { throw new NotImplementedException(); }
        private Ingredient GetPasta(PastaType ravioly, object pantry) { throw new NotImplementedException(); }
    }
}
