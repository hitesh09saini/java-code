
class LL{

    Node head;
    private int size;
    LL(){
      this.size =0;
    }

    class  Node{
     String  data;
     Node next;
     Node(String data ){
      this.data = data;
      this.next = null;  
     }

    }

    // add first 

public void firstadd(String data) {
    Node n1 = new Node(data);
    size++; 
    if(head == null){
        
       head = n1;
       return;

    }
   
    n1.next =head;
      
    head = n1;  
}

// add last
public void lastadd(String  data) {
    
    Node n1 = new Node(data); 
    if(head == null){    
       head = n1;
       return;
    }
    Node curre = head;   
    while(curre.next!=null){
        curre = curre.next;

    }
    size++;
    curre.next = n1;

}
// delete first
public void deletefirst() {
    if(head ==null){
        System.out.println("list already empty");
        return;
    }
    
     size--;
    head = head.next;

}

// delete last
public void deletelast() {
    
    if(head ==null){
        System.out.println("list already empty");
        return;
    }
    size--;
    if(head.next==null){
      head = null;
      return;
    }

    Node secondlast = head;
    Node last = head.next;

    while(last.next !=null){
        secondlast =secondlast.next;
        last =last.next;
    }
    secondlast.next = null;
}
  
// print list 

public void printlist() {
   

    if(head ==null){
        System.out.println("list already empty");
        return;
    }
    Node curre = head;

    while(curre!=null){
     System.out.print(curre.data+" --> ");
        curre = curre.next;
    } 
    System.out.print("NULL");
    
    
}

public int  getsize() {
    return size;
}

public void reverselist() {

    if(head==null|| head.next==null){
        return;
    }
    
    
 Node prev = head;
 Node curr = head.next;
 while(curr!=null){
    Node nextnode = curr.next;
    curr.next = prev;
    
    //update 

    prev = curr;
    curr = nextnode;
    
 }
 head.next = null;
 head = prev;

}

public  Node reverseRecursive(Node head) {
    if(head==null || head.next ==null){
        return head;
    }

    Node newh = reverseRecursive(head.next);
    head.next.next =head;
    head.next = null;


 return newh;
}


public static void main(String[] args) {
     LL l1 = new LL();
     l1.firstadd("4");
     l1.firstadd("3");
     l1.firstadd("2");
     l1.firstadd("1");

    l1.lastadd("5");
    l1.printlist();
    System.out.println();

     l1.reverselist();
     l1.printlist();
     System.out.println();
   l1.head =  l1.reverseRecursive(l1.head);
   l1.printlist();
}

    
   
}
