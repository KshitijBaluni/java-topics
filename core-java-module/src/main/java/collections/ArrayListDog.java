package collections;
/**
 * Arraylist
 *
 * @author Ankit Rawat
 * @since 14 Dec 2022
 */
public class ArrayListDog {
    /**
     *Create an arraylist of Dog's breed name
     */
    public static class Dog {
        String breed;
        public Dog(String breed)
        {
            this.breed=breed;
        }

        public Dog(){

        }
        /**
         * Get breed name
         *
         * @return breed
         */
        public String getBreed() {

            return breed;
        }
        /**
         * Set breed name
         *
         * @param breed
         */
        public void setBreed(String breed)
        {
            this.breed = breed;
        }

        /**
         *Parameterized Constructor
         *
         * @param breed
         */


    }
}