package wordCount.module1;

import wordCount.BinarySearchTree.BinarySearchTree;

public class Words implements WordsI {

    @Override
    public int noOfUniqueWords() {

        return 0;
    }

    @Override
    public int noOfWord(BinarySearchTree root) {

        if (root==null)
            return 0;

        // Initialize empty queue.
        Queue<Node> queue = new LinkedList<Node>();

        // Do level order traversal starting from root
        queue.add(root);

        int count=0; // Initialize count of full nodes
        while (!queue.isEmpty())
        {

            Node temp = queue.poll();
            if (temp.left!=null && temp.right!=null)
                count++;

            // Enqueue left child
            if (temp.left != null)
            {
                queue.add(temp.left);
            }

            // Enqueue right child
            if (temp.right != null)
            {
                queue.add(temp.right);
            }
        }
        return count;
    }

    @Override
    public int noOfCharacters() {
        
        return 0;
    }
}
