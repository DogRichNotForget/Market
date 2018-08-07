package cn.asghoul.pojo;

import java.math.BigInteger;

/*
    评论状态表
 */
public class CommentState {


//    订单Id:  orderId
    private BigInteger orderId;
//    评论状态： commentState
    private int commentState;//(0是待评价，1是已评价)

    public BigInteger getOrderId() {
        return orderId;
    }

    public void setOrderId(BigInteger orderId) {
        this.orderId = orderId;
    }

    public int getCommentState() {
        return commentState;
    }

    public void setCommentState(int commentState) {
        this.commentState = commentState;
    }
}
