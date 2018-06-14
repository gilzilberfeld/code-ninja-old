namespace CleanCode
{
    public class Ingredient
    {
        public Ingredient(bool isPastaType)
        {
            IsPastaType = isPastaType;
        }
        public bool IsPastaType { get; private set; }
    }
}
