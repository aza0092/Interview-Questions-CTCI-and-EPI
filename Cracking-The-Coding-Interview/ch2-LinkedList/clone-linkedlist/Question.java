 private Node cloneLinkedListIterative(Node startNode) {
  if (startNode == null)
   return null;

  Node cloneStart = null;
  Node previousNode = null;

  while(startNode!=null){

   Node temp = new Node(startNode.getData());

   if(cloneStart == null){
    cloneStart = temp;
    previousNode = temp;

   }else{
    previousNode.setNext(temp);
    previousNode = temp;
   }
   startNode = startNode.getNext();
  }
  return cloneStart;
 }

 private Node cloneLinkedListRecursive(Node startNode) {
  if(startNode == null){
   return null;
  }
  Node temp = new Node(startNode.getData());
  temp.setNext(cloneLinkedListRecursive(startNode.getNext()));
  return temp;
 }
