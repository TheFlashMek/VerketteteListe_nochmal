package de.mekalan;

public class List {
        private Node head;

        List(){
            head = new Node();
        }

        public Player get_first(){

            return head.get_content();
        }

        private Node get_tail(){
            Node n = head;
            while(n.get_next()!= null){
                n = n.get_next();
            }
            return n;
        }

        public Player get_last(){
            Node n = get_tail();
            return n.get_content();
        }

        public void append(Player p){
            Node n = get_tail();
            Node n2 = new Node(p);
            n.set_next(n2);
            System.out.println("Spieler wurde angehängt " + get_last());
        }

        public void print(){
            Node n = head;
            while(n.get_next()!= null);{
                System.out.println("/n");
                n.print();
                n = n.get_next();
            }
        }

        public String toString(){
            Node n = head;
            String a = "";
            if(n.get_next() != null){
                n= n.get_next();
            }
            while(n.get_next()!= null){
                a += n.toString();
                n = n.get_next();
            }
            a += n.toString();
            return a;
        }



        public void remove (Player p) {
                Node n = head;
                Node pre_n = head;
                if (n.get_content() == p) {
                    head = n.get_next();
                } else {
                    n = n.get_next();
                    while (n.get_content() != p && n.get_next() != null) {
                        n = n.get_next();
                        pre_n = pre_n.get_next();
                    }
                    if (n.get_next() != null) {
                        pre_n.set_next(n.get_next());
                        n.set_content(null);
                    }
                }
            }
    public void insert_after( Player p, Player predecessor ) {
        Node n = head;
        Node newPlayer = new Node(p);

        if (n.get_content() == predecessor) {
            newPlayer.set_next(n.get_next());
            n.set_next(newPlayer);
        } else {
            while (n.get_content() != predecessor && n.get_next() != null){
                n = n.get_next();
            }
            if (n.get_next() != null) {
                newPlayer.set_next(n.get_next());
                n.set_next(newPlayer);
            }
        }
    }

    public Boolean isEmpty(){
        return head == null;
    }

}



