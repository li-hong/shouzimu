package com.dh.al.al.tree;

import lombok.Data;

@Data
class TreeNode {
    int value;

    TreeNode left;

    TreeNode right;

    TreeNode parent;

    public TreeNode() {
    }


    public TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "value=" + value+"}";
    }
}
