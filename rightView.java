class Solution{
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node node) {
        if(node ==null){
            return new ArrayList<>();
        }
        //add code here.
        ArrayList<Integer> result = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        while(q.size()!=0){
            int size = q.size();
            for(int i=0;i<size;i++){
                Node tempNode = q.poll();
                if(i==size-1)result.add(tempNode.data);

                if(tempNode.left!=null) q.add(tempNode.left);
                if(tempNode.right!=null) q.add(tempNode.right);
            }
        }
        return result;
    }
}
