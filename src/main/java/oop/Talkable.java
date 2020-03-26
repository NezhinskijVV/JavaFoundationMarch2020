package oop;

public interface Talkable {
     int I_AM_A_COMSTANT = 5;

    void talk();
    default boolean silence(){
        return true;
    }
}
