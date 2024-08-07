package com.milewskiarkadiuszmodul12abstractTasks;

public interface Alarm {
    //Stwórz interfejs Alarm z dwiema domyślnymi metodami: turnAlarmOn() i turnAlarmOff(). Metody te powinny posiadać domyślną implementację.
    //Dodatkowo w interfejsie zadeklaruj stałą określającą jaki dźwięk wydaje alarm (typ String).
    public static final String sound = "Dryn Dryn";
    default boolean turnAlarmOn() {
        System.out.println("This is default implementation and the alarm gives a sound: " + sound + " !!!");
        return true;
    };
    default boolean turnAlarmOff() {
        System.out.println("A default implementation and the alarm is off.");
        return false;
    };


}
