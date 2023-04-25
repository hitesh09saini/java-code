public class dsal {
    
    public static void main(String[] args) {
        LL lists = new LL();

        lists.firstadd("hitesh");
        lists.firstadd("am");
        lists.firstadd("I");
        
        lists.lastadd("Saini,");
        lists.lastadd(" I");
        lists.lastadd("am");
        lists.lastadd("from");
        lists.lastadd("Mahwa");

        lists.printlist();
        System.out.println();
        lists.deletefirst();
        lists.printlist();
        System.out.println();
        lists.deletelast();
        lists.printlist();
        System.out.println(">    "+lists.getsize());

    }
}
