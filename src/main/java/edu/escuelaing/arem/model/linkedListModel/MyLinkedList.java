package edu.escuelaing.arem.model.linkedListModel;

import edu.escuelaing.arem.model.linkedListModel.exception.MyLinkedListException;

/**
 * Linked list implementation
 * @author Martin Cantor (andres.cantor-u@mail.escuelaing.edu.co)
 * @version 1.0
 */
public class MyLinkedList {

    /**
     * The head node of the linked list
     */
    private Node head;

    /**
     * the size of the linked list
     */
    private int size;

    /**
     * Linked list constructor without elements
     */
    public MyLinkedList(){
        this.head = null;
        size = 0;
    }

    /**
     * Add a node at a head
     * @param information the data saved in the Node added
     */
    public void addANodeAtHead(Object information){
        Node theNewNode = new Node(information);
        Node temporal = this.head;
        this.head = theNewNode;
        this.head.setNext(temporal);
        this.size++;
    }

    /**
     * Add a node at a tail
     * @param information the data saved in the node added
     */
    public void addNodeAtTheTail(Object information){
        if(head == null){
            addANodeAtHead(information);
        }else{
        Node theNewNode = new Node(information);
        Node temporal = this.head;
        while(temporal.getNext() != null){
            temporal = temporal.getNext();
        }
        temporal.setNext(theNewNode);
        this.size++;}
    }

    /**
     * Add a node in the linked list
     * @param information the data saved in the node added
     */
    public void addANode(Object information){
        if(this.head == null) {
            this.addANodeAtHead(information);
        }else{
            this.addNodeAtTheTail(information);
        }
    }

    /**
     * Add a node in a given position within the linked list
     * @param index the position where the node will be added
     * @param information the data saved in the node added
     * @throws MyLinkedListException throws if the linked list is empty
     */
    public void addANodeByIndex(int index, Object information) throws MyLinkedListException{
        if(head == null && index == 0){
            addANodeAtHead(information);
        }else if(head ==null && index !=0){
            throw new MyLinkedListException("This Element cant be added, because the linked list is empty");
        }else{
            Node temporal = this.head;
            Node theNewNodeToAdd;
            for(int i=0; i<index -1 && temporal.getNext()!= null; i++){
                temporal = temporal.getNext();
            }
            theNewNodeToAdd = temporal.getNext();
            temporal.setNext(new Node(information));
            temporal.getNext().setNext(theNewNodeToAdd);
            this.size++;
        }
    }

    /**
     * Delete a node in a given position within the linked list
     * @param index the position where the node will be deleted
     * @throws MyLinkedListException throws if the linked list is empty
     */
    public void deleteANodeByIndex(int index) throws MyLinkedListException{
        if(head == null && index == 0 || head ==null && index !=0 ){
            throw new MyLinkedListException("This Element cant be deleted, because the linked list is empty");
        }else{
            Node temporal = this.head;
            for(int i=0; i<index -1 && temporal.getNext()!= null; i++){
                temporal = temporal.getNext();
            }
            temporal.setNext(temporal.getNext().getNext());
            this.size--;
        }
    }

    /**
     * Get a Node given a position
     * @param index the node position
     * @return the Node that is in the given position
     * @throws MyLinkedListException throws if the linked list is empty
     */
    public Node getNodeByIndex(int index) throws MyLinkedListException{
        if(head == null && index == 0 || head ==null && index !=0 ) {
            throw new MyLinkedListException("This Element cant be deleted, because the linked list is empty");
        }else{
            Node temporal = this.head;
            for(int i=0; i<index; i++){
                temporal = temporal.getNext();
            }
            return temporal;
        }
    }

    /**
     * Get the next node given a node's position
     * @param index the node position of which want to know the next node
     * @return The next node
     * @throws MyLinkedListException throws if the element doesnt have a next node
     */
    public Node getTheNextNodeGivenAnIndex(int index) throws MyLinkedListException {
        if(index >=this.size || head ==null && index !=0 || head == null && index == 0 ){
            throw new MyLinkedListException("This Element doesnt have a next node");
        }else{
            return this.getNodeByIndex(index).getNext();}

    }

    /**
     * Get the prior node given a node's position
     * @param index the node position of which want to know the prior node
     * @return the prior node
     * @throws MyLinkedListException throws if the element doesnt have a prior node or the linked list is empty
     */
    public Node getThePriorNodeGivenAnIndex(int index) throws MyLinkedListException {
        if(head == null && index == 0 || head ==null && index !=0 ) {
            throw new MyLinkedListException("This Element doesnt have a prior node, because the linked list is empty");
        }else if(index == 0 && size!=0 || index >=this.size+1){
            throw new MyLinkedListException("This Element doesnt have a prior node");
        }else {
            Node temporal = this.head;
            for(int i=0; i<index-1; i++){
                temporal = temporal.getNext();
            }
            return temporal;
        }
    }

    /**
     * Get the size of the linked list
     * @return the size
     */
    public int getMyLinkedListSize(){
        return this.size;
    }

    @Override
    public String toString() {
        return "Linked List = {" +
                "head=" + head +
                '}';
    }

}
