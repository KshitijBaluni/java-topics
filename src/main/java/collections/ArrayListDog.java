package collections;

import java.security.PrivateKey;

/**
 * Arraylist
 *
 * @author Ankit Rawat
 * @since 14 Dec 2022
 */
public class ArrayListDog {
    /**
     *Created a static class Dog
     */
    public static class Dog {
       private String breed;
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