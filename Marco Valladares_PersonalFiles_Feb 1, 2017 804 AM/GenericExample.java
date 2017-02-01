import java.util.ArrayList;

public class GenericExample{

   public static void main (String...args){

      ArrayList<String> list = new ArrayList<>();

      System.out.println(list.size());
      list.add("Marco");
      System.out.println(list.size());

      list.add(0,"Valladares");
      System.out.println(list);


      System.out.println(list.contains ("Kulis"));       //F
      System.out.println(list.contains("Valladares"));   //T or F

      String firstName = list.get(1); //String first list
      System.out.println(firstName);

//Class Topics 2-1-17
      Iterator(String) iterator = list.iterator(); //can modify a list but will break if list changes
        while(iterator.hasNext()){
          System.out.println(iterator.next())
        }

ArrayList<ArrayList<String>> = new ArrayList<>();

  list.add(new ArrayList<>());
  list.size()
  Arraylist<String> listzero = list.get(0)

  //Arraylist<String>[] list = new Arraylist[1000000]
    //list[999] size 0

    //lists = array of Arraylist

//Hashing
    //Hashtag
    //# creates a searchable term
    //#Friday

//Mapping
    String[]names = new String[17];
    names["anthony".hashfactor()/17]="anthony"
    names["anthony".hashfactor()/17]=post; //bad

    Arraylist<String>[]names=new String[17];
    int Friday="#Friday".hashfactor/names.length;
    names[Friday]=new Arraylist<>();
    names[Friday].add(post);
    =names[Friday]

//Hashmap
//https://docs.oracle.com/javase/7/docs/api/java/util/HashMap.html

//Class Hashmap<K,V> K=key, V=value
//K=#Friday, V=Arraylist

Hashmap<Integer,String>numbers=new Hashmap<>();
  numbers.put(1,"one");
  .
  .
  .
  numbers.get(1)

Hashmap<String,String>numbers=new Hashmap<>();
  numbers.put("one","one");
  .
  .
  .
  numbers.get("one")



   }


}
