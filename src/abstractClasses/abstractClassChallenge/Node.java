package abstractClasses.abstractClassChallenge;

public class Node extends ListItem {
    public Node(Object value){
        super(value);
    }

    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    ListItem setNext(ListItem item) {
       this.rightLink = item;
       return this.rightLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        this.leftLink = item;
        return this.leftLink;
    }

    @Override
    int compareTo(ListItem item) {
        return 0;
    }
}
