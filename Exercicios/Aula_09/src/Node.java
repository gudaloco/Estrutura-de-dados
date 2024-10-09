public class Node {

    private Object info;
    private Node proximoNo;

    public Node(Object info, Node proximoNo) {
        this.info = info;
        this.proximoNo = proximoNo;
    }

    public Object getInfo() {
        return info;
    }

    public Node getproximoNo() {
        return proximoNo;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public void setproximoNo(Node No) {
        this.proximoNo = No;
    }

}
