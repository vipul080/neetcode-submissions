class LinkedList {
    private Node head;

    private static class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    public LinkedList() {
        head = null;
    }

    public int get(int index) {
        Node current = head;
        int pos = 0;

        while(current!=null){
            if(pos == index){
                return current.value;
            }
            current = current.next;
            pos++;
        }

        return -1;
    }

    public void insertHead(int val) {
        Node newHead = new Node(val);

        newHead.next = head;
        head = newHead;
    }

    public void insertTail(int val) {
        Node newNode = new Node(val);

        if(head == null){
            head = newNode;
            return;
        }

        Node current = head;

        while(current.next!=null){
            current = current.next;
        }

        current.next = newNode;
    }

    public boolean remove(int index) {
        if(index == 0){
            if(head == null){
                return false;
            }
            head = head.next;
            return true;
        }

        Node current = head;
        int pos = 0;

        while(current!=null && current.next!=null){
            if(pos + 1 == index){
                current.next = current.next.next;
                return true;
            }

            current = current.next;
            pos++;
        }

        return false;
        
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> answer = new ArrayList<>();

        Node current = head;

        while(current!=null){
            answer.add(current.value);
            current = current.next;
        }

        return answer;

    }
}
