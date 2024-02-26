import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class StackTest {
    private Stack stack;
    @BeforeEach
    public void Setup(){

        stack = new Stack();

    }
    @Test
    public void pushShouldAddElementToTheTopOfTheStack(){
        stack.push(4);
       Assertions.assertEquals(1,stack.size());
       Assertions.assertEquals(4,stack.peek());
    }
    @Test

    public void PushShouldExpandArrayIfStackIsFull(){
        //remplissage de la pile
        for(int i =0 ; i<10 ;i++)
        {
            stack.push(i);
        }
        Assertions.assertEquals(10,stack.size());
        stack.push(10);
        Assertions.assertEquals(11,stack.size());
        Assertions.assertEquals(10,stack.peek());

    }
    @Test
    public void PopShouldreturnTopElementOftheStack(){
        stack.push(2);
        Assertions.assertEquals(2,stack.pop());
        Assertions.assertThrows(IllegalStateException.class,() -> stack.pop());

    }


}
