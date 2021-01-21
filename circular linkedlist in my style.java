public class cir
{
    Node last=null;
    Node temp;
    class Node
    {
    int data;
    Node next;
    Node(int d)
    {
    data=d;
    next=null;
    }
    }
    void add(int data)
    {
    Node o=new Node(data);
    if (last==null)
    {
        last=o;
        temp=last;
    }
        last.next=o;
last=o;
}
void print()
{
    last.next=temp;
Node p=last.next;
   do
    { 
        System.out.print(p.data + " "); 
        p = p.next; 
  
    } 
    while(p != last.next); 
  
} 
    public static void main(String g[])
    {
cir obj=new cir();
obj.add(1);
obj.add(2);
obj.add(3);
obj.print();
}
}