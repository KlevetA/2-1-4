package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Egg6 {


    Needle7 needle;

    @Autowired
    public void Needle7(Needle7 Needle7){
        this.needle = Needle7;
    }

    @Override
    public String toString() {
        return ", в яйце иголка " + needle.toString() ;
    }
}
