package models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Guest on 8/3/17.
 */
public class Adventure {
    private boolean result = true;

    public boolean passBack(String input) {
        if(input.equals("1")){

        }else if (input.equals("2")){
            result = false;
        }
     return result;
    }

    public boolean pathChoice(String input) {
        if(input.equals("3")) {
        } else if (input.equals("4")) {
            result = false;
        }
        return result;
    }

}
