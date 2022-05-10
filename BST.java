import java.util.*;
import java.util.Iterator;


public class BST <K extends Comparable<K>,V> {
    private Node root;
    private class Node{
    private K key;
    private V val;
    private Node left,right;
    public Node(K key,V val){
        this.key=key;
        this.val=val;
        left = null;
        right = null;
    }
}
public BST(){ root.equals(null);};
public BST(K key,V val){
  root=new Node(key,val);
}
public Node insert(Node root,K key,V val){
    if (root.equals(null)) {
        root=new Node(key,val);

    }
    return root;
}

public void put(K key,V val){
  root=insert(root,key,val);
}

public V get(K key){
  return get(root,key);
}
private V get(Node root,K key){
    if (root.equals(null)) {
        return null;
    }
    if(root.key.compareTo(key)==0){return root.val;}
    if(root.key.compareTo(key)>0){
        return  get(root.left,key);
        return get(root.right,key);}
}
public void delete(K key ){ delete(root,key);}
//public Iterable<K> iterator(){ }
