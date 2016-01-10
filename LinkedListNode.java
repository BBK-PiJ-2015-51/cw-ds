/**
* Linked List Nodes associated with {@LinkedList}
* @author SJENKI05
*/
public class LinkedListNode {

	/**
	 * Holds the object in list
	 */
	private Object object;

	/**
	 * Holds the pointer to next node
	 */
	private LinkedListNode nextNode;

	/**
	 * Construtor that creates node with object to be stored in list
	 * @param object in list
	 */
	 LinkedListNode(Object o) {
	 	this.object = o;
	 	this.nextNode = null;
	 }

	 /**
	 * gets the object in the node
	 * @return object in node
	 */
	 public Object getObject() {
	 	return this.object;
	 }

	 /**
	 * Sets the object in node
	 * @param object in node
	 */
	 public void setObject(Object o) {
	 	this.object = o;
	 }

	 /**
	 * Gets the next node 
	 * @return next linked list node
	 */
	 public LinkedListNode getNextNode() {
	 	return this.nextNode;
	 }

	/**
	 * Sets the next node 
	 * @param next linked list node
	 */
	 public void setNextNode(LinkedListNode n) {
	 	this.nextNode = n;
	 }
}