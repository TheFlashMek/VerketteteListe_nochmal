package de.mekalan;

public class Node {
    private Node next;
    private Player content;

    Node() {
        content = null;
        next = null;
    }

    Node(Player p) {
        content = p;
        next = null;
    }

    public Node get_next() {
        return next;
    }

    public void set_next(Node n) {
        this.next = n;
    }

    public Player get_content() {
        return content;
    }

    public void set_content(Player p) {
        this.content = content;
    }

    public void print() {
        content.print();
    }

    public String toString() {
        if (content == null) {
            return "null";
        } else {
            return content.toString();
        }
    }
}


