package net.roszczyk.animals;

import java.io.Serializable;

public abstract class Animal implements Serializable
{
    String name;

    public abstract void setName(String value);

    public abstract String getName();
    
    public abstract void Sound();
}
