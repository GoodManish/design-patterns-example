package com.patterns.observer3;

public interface Observer {
    //Provides an update interface to receive signal from subject
    void update(String availablity);
}
