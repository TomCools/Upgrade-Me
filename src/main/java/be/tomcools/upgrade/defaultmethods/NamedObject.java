package be.tomcools.upgrade.defaultmethods;

public interface NamedObject {

    default String getName(){
        return "NamedObject";
    }


}
