package org.example;

public class Entity
{
    public Entity()
    {

    }

    public Entity(String NewName)
    {
        Name = NewName;
    }

    // Getters and setters
    public String getName()
    {
        return Name;
    }

    public void setName(String Namee)
    {
        this.Name = Namee;
    }


    public String toString()
    {
        return Name;
    }

    private String Name;
}
