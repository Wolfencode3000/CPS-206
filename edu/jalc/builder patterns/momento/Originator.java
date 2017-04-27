import java.util.*;

public class Originator{
   private String state;
   
   private Caretaker caretaker = new Caretaker();
   
   public void setState(state, string){
      this.state = state;
   }
   
   public String getState(){
      return state;
   }
   
   public void save(){
      Message message = new Message(state);
      if (state.DEBUG == this.state) message = new DebugMessage(message)
         if else (state.TRACE == this.state) message = new TraceMessage(message)
         if else (state.INFO == this.state) message = new InfoMessage(message)
         if else (state.WARN == this.state) message = new WarnMessage(message)
         if else (state.ERROR == this.state) message = new ErrorMessage(message)
         else (state.FATAL == this.state) message = new FatalMessage(message)
      caretaker.add(message);
   }
   
   public Message getStateFromCaretaker(int i){
      return caretaker.get(i);
   }
   
   switch (state){
      case DebugMessage
   
   }
}