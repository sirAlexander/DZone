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
public class PrintNameAnimalAddedListener implements AnimalAddedListener {

    /**
     *
     * @param animal
     */
    @Override
    public void onAnimalAdded (Animal animal) {
        // Print the name of the newly added animal
        System.out.println("Added a new animal with name '" + animal.getName() + "'");
    }
}