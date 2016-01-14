/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dzone.observer.pattern;

/**
 *
 * @author Shikanga
 */
public class DZoneObserverAnonymousClassPattern {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) {
        // Create the zoo to store animals
        Zoo zoo = new Zoo();
        // Register listeners to be notified when an animal is added        
        zoo.registerAnimalAddedListener(new CountingAnimalAddedListener());
        
        zoo.registerAnimalAddedListener(new AnimalAddedListener() {
            @Override
            public void onAnimalAdded (Animal animal) {
                // Print the name of the newly added animal
                System.out.println("Anonoymous added a new animal with name '" + animal.getName() + "'");
            }
        });
        // Add an animal notify the registered listeners
        zoo.addAnimal(new Animal("Elephant"));
        zoo.addAnimal(new Animal("Lion"));
        zoo.addAnimal(new Animal("Bear"));
    }
    
}
