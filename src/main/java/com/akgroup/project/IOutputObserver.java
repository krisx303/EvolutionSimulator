package com.akgroup.project;

import com.akgroup.project.util.Vector2D;
import com.akgroup.project.world.map.IWorldMap;
import com.akgroup.project.world.object.Animal;
import com.akgroup.project.world.object.Plant;

import java.util.List;

/** Class responsible for managing Simulation output.*/
public interface IOutputObserver {
    /** Initialize output depending on IWorldMap instance.
     * In this method put all necessary things which must be done before running Simulation.*/
    void init(IWorldMap worldMap);
    void onAnimalSummoned(Vector2D position);
    void onPositionChanged(Vector2D oldPosition, Vector2D newPosition);
    void onPlantSummoned(Vector2D position);
    void onPlantWasEaten(Vector2D position);
    /** Function is called every simulation cycle (output frame).*/
    void renderFrame(List<Animal> animals, List<Plant> plants);
}
