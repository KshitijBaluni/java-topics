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

        public Dog(){

        }

        public String getBreed() {
            return breed;
        }

        public void setBreed(String breed) {
            this.breed = breed;
        }

        /**
         *Parameterized Constructor
         *
         * @param breed
         */
        public Dog(String breed){
            this.breed=breed;
        }

    }
}