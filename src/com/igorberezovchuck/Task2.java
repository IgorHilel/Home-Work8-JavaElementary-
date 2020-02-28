package com.igorberezovchuck;

import com.sun.source.tree.Tree;

/*
2*) Написать метод для обьединения 2 бинарных дерева:
В качестве параметра передается 2 ссылки на корневые узлы девева TreeNode, результат - корневой узел
нового дерева TreeNode.
 */
public class Task2 {

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(3);
        root1.right = new TreeNode(2);
        root1.left.left = new TreeNode(5);

        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(3);
        root2.left.right = new TreeNode(4);
        root2.right.right = new TreeNode(7);

        TreeNode result2 = mergeTrees(root1, root2);
        System.out.println(result2.val);
        System.out.println(result2.right.val);
        System.out.println(result2.left.val);
    }

    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }
}
