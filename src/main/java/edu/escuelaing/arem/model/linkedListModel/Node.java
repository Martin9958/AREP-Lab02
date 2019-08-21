package edu.escuelaing.arem.model.linkedListModel;

/**
 * The node implementation - base of the linked list structure
 * @author  Martin Cantor (andres.cantor-u@mail.escuelaing.edu.co)
 * @version 1.0
 */
public class Node {

    /**
     * The data saved in the Node
     */
    private Object information;

    /**
     * The Next node of the node
     */
    private Node next;

    /**
     * Node constructor with params
     * @param information the data saved in the node
     */
    public Node (Object information){
        this.information = information;
        this.next = null;
    }

    /**
     * Get the node information
     * @return the node information
     */
    public Object getInformation() {
        return this.information;
    }

    /**
     * Set the node information
     * @param information the new node information
     */
    public void setInformation(Object information){
        this.information = information;
    }

    /**
     * Get the nex node of the node
     * @return the next node
     */
    public Node getNext(){
        return this.next;
    }

    /**
     * Set the next node with other node
     * @param next the new node that will be the next
     */
    public void setNext(Node next){
        this.next = next;
    }

    @Override
    public String toString() {
        return " Node{" +
                " information=" + information +
                ",next=" + next +
                '}';
    }

}
