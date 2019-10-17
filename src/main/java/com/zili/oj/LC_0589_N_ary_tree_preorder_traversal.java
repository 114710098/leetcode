package com.zili.oj;

import java.util.ArrayList;
import java.util.List;

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
public class LC_0589_N_ary_tree_preorder_traversal {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    };

    public List<Integer> preorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        dfs(root, ans);
        return ans;
    }

    private void dfs(Node node, List<Integer> ans) {
        if(node==null) return;
        ans.add(node.val);
        for(Node n:node.children)
            dfs(n, ans);
    }
}
