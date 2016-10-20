public class Child extends Parent {

public static void main(String args[]){

logger.log("From the child class");
for (i = 0; i < 10; j++){
 logger.log("i am in the loop");
}

}

@Override
public void add(){
logger.log("From the child class");
}
}
