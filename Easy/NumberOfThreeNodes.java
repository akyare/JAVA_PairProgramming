package be.intecbrussel.Easy;

public class NumberOfThreeNodes {

    public Integer getNumberOfNodes(TreeNode node){

        if (node == null) {
            return 0;
        }
        return 1 + getNumberOfNodes(node.left()) + getNumberOfNodes(node.right());
    }

}
