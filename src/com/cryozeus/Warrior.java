package com.cryozeus;

public class Warrior {

    /*In OOP, we store attributes in fields.
     * And we model abilities using methods.
     *
     * Here we will try modelling a real world 'Warrior'.*/

    //attributes :
    protected String name = "Warrior";
    public int health = 0;
    public int attKMax = 0;
    public int blockMax = 0;

    //To add ability to teleport, we add an 'Instance Variable':
    //This allows sub-classes to define at runtime whether they'll be able to Teleport or not.
    public Teleports teleportType;

    //initialising a warrior whenever it is created using a Constructor:
    public Warrior(String name, int health,
                   int attKMax, int blockMax) {

        //using setters to reference to the attributes themselves :
        this.setName(name);
        this.health  = health;
        this.attKMax = attKMax;
        this.blockMax = blockMax;
    }

    //Modelling the capabilities of the Warrior - attack and block :

    public int attack() {
        return 1 + (int)(Math.random() * ((attKMax - 1) + 1));
    }

    public int block() {
        return 1 + (int)(Math.random() * ((blockMax - 1) + 1));
    }


    //create methods that allow us to provide access to attributes :
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //Adding Different Abilities :
    public String teleport() {
        return teleportType.teleport();
    }

    //To allow for changing it dynamically:
    public void setTeleportAbility(Teleports newTeleportType) {
        teleportType  = newTeleportType;
    }


}