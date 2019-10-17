package com.zili.oj;

import java.util.ArrayList;
import java.util.List;

public class LC_0590_N_ary_tree_postorder_traversal {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };

    public List<Integer> postorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        dfs(root, ans);
        return ans;
    }

    private void dfs(Node node, List<Integer> ans) {
        if(node==null) return;
        for(Node n:node.children)
            dfs(n, ans);
        ans.add(node.val);
    }
}
