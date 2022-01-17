//Size
 public static int size(Node node) {
    if (node == null) {
      return 0;
    }

    int ls = size(node.left);
    int rs = size(node.right);
    int ts = ls + rs + 1;
    return ts;
  }

// Sum
  public static int sum(Node node) {
    if (node == null) {
      return 0;
    }

    int ls = sum(node.left);
    int rs = sum(node.right);
    int ts = ls + rs + node.data;
    return ts;
  }

//Max
  public static int max(Node node) {
    if (node.right == null) {
      return node.data;
    } else {
      return max(node.right);
    }
  }

//Min 
  public static int min(Node node) {
    if (node.left == null) {
      return node.data;
    } else {
      return min(node.left);
    }
  }
