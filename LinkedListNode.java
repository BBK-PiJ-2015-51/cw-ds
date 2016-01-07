public class LinkedListNode {

	private Object object;
	private LinkedListNode nextNode;

	 LinkedListNode(Object o) {
	 	this.object = o;
	 	this.nextNode = null;
	 }

	 public Object getObject() {
	 	return this.object;
	 }

	 public void setObject(Object o) {
	 	this.object = o;
	 }

	 public LinkedListNode getNextNode() {
	 	return this.nextNode;
	 }

	 public void setNextNode(LinkedListNode n) {
	 	this.nextNode = n;
	 }
}