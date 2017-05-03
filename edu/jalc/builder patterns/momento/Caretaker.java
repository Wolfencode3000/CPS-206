import java.util.*;

public class Caretaker{
   private ArrayList<Message> events;
   private ArrayList<Observer> observers;
   
   protected Caretaker(){
      this.observers = new ArrayList<>();
      this.observers.add(new ConsoleLogger);
   }
   
   protected void add(Message message){
      caretaker.add(message);
      observers.parallelstream().forEach((observer)->Observer.observe(message));
   }
   
   protected Message get(int i){
      return events.get(i);
   }
}