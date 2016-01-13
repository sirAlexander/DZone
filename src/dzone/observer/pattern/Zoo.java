/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dzone.observer.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Shikanga
 */
public class Zoo {
    private List<Animal> animals = new ArrayList<>();
    private List<AnimalAddedListener> listeners = new ArrayList<>();
    
    public void addAnimal (Animal animal) {
        // Add the animal to the list of animals
        this.animals.add(animal);
        // Notify the list of registered listeners
        this.notifyAnimalAddedListeners(animal);
    }
    public void registerAnimalAddedListener (AnimalAddedListener listener) {
        // Add the listener to the list of registered listeners
        this.listeners.add(listener);
    }
    public void unregisterAnimalAddedListener (AnimalAddedListener listener) {
        // Remove the listener from the list of the registered listeners
        this.listeners.remove(listener);
    }
    protected void notifyAnimalAddedListeners (Animal animal) {
        // Notify each of the listeners in the list of registered listeners
        this.listeners.forEach(listener -> listener.onAnimalAdded(animal));
    }
}