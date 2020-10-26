package com.cryozeus;

/*This is an interface.
* We use this to give abilities to Loki that are not in Warrior Class already.
*
* Interfaces are empty classes.
*
* They define the methods that you must use, but none of the code.
*
* Classes can only inherit ONE Class (like DodgeWarrior only inherits from Warrior),
* but they(classes) can inherit numerous interfaces.
*
* We will use an interface to define whether a Warrior can or cannot Teleport.*/

public interface Teleports {
    String teleport();

}

class CanTeleport implements Teleports{
    //overrides the Teleport function :
    public String teleport() {
        //Using the technique called 'Composition'
        return "Teleports Away";
    }
}

class CantTeleport implements Teleports{
    //overrides the Teleport function :
    public String teleport() {
        //Using the technique called 'Composition'
        return "Fails at Teleporting";
    }
}