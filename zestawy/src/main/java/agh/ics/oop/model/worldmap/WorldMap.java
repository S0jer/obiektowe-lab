package agh.ics.oop.model.worldmap;

import agh.ics.oop.model.Vector2d;
import agh.ics.oop.model.mapobjects.WorldMapElement;

import java.util.List;

public interface WorldMap {
    /**
     * Indicate if any object can move to the given position.
     *
     * @param position The position checked for the movement possibility.
     * @return True if the object can move to that position.
     */
    boolean canMoveTo(Vector2d position);

    /**
     * Place an worldMapElement on the map.
     *
     * @param worldMapElement The animal to place on the map.
     * @return True if the animal was placed. The animal cannot be placed if the map is already occupied.
     */
    boolean place(WorldMapElement worldMapElement);

    /**
     * Return true if given position on the map is occupied. Should not be
     * confused with canMove since there might be empty positions where the animal
     * cannot move.
     *
     * @param position Position to check.
     * @return True if the position is occupied.
     */
    boolean isOccupied(Vector2d position);

    /**
     * Return an object at a given position.
     *
     * @param position The position of the object.
     * @return Object or null if the position is not occupied.
     */
    WorldMapElement objectAt(Vector2d position);

    List<Vector2d> getBorders();
}
