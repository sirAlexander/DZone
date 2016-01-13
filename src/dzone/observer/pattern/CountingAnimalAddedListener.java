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
public class CountingAnimalAddedListener implements AnimalAddedListener {
    private static int animalsAddedCount = 0;

    /**
     *
     * @param animal
     */
    @Override
    public void onAnimalAdded (Animal animal) {
        // Increment the number of animals
        animalsAddedCount++;
        // Print the number of animals
        System.out.println("Total animals added: " + animalsAddedCount);
    }
}