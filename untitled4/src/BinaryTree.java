public class BinaryTree {

        Node root;

        public void printInOrder() {
            printInOrder(root);
        }

        private void printInOrder(Node current) {
            if (current == null) {
                return;
            }
            printInOrder(current.left);

            System.out.print(current.data + " ");
            
            printInOrder(current.right);
        }
    }


