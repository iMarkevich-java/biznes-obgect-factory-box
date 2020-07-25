package biznesObjectFactoryBox;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Objects;

public class Order {

    private BigInteger id;
    private BigInteger clientId;
    private BigInteger sizeOrder;
    private BigInteger orderTerm;
    private String stage;
    private String status;
    private LocalDate startDate;
    private String orderName;

    public Order() {
    }

    public String getClientId() {
        return clientId.toString();
    }

    public void setClientId(String clientId) {
        this.clientId = new BigInteger(clientId);
    }

    public Order(String id, String sizeOrder, String status, String stage) {
        this.id = new BigInteger(id);
        this.sizeOrder = new BigInteger(sizeOrder);
        this.status = status;
        this.stage = stage;
    }

    public String getId() {
        return id.toString();
    }

    public BigInteger getIdBigInteger() {
        return id;
    }

    public void setId(String id) {
        this.id = new BigInteger(id);
    }

    public String getSizeOrder() {
        return sizeOrder.toString();
    }

    public void setSizeOrder(String sizeOrder) {
        this.sizeOrder = new BigInteger(sizeOrder);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public void addStage(String stage) {
        BigInteger stageInt = new BigInteger(this.stage);
        BigInteger stageOrder = new BigInteger(stage);
        this.stage = stageInt.add(stageOrder).toString();
    }

    public void deleteStage(String stage) {
        BigInteger stageInt = new BigInteger(this.stage);
        this.stage = stageInt.subtract(new BigInteger(stage)).toString();
    }

    public String getStartDate() {
        return startDate.toString();
    }

    public LocalDate getStartDateLocalDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = LocalDate.parse(startDate);
    }

    public BigInteger getBigIntegerOrderTerm() {
        return orderTerm;
    }

    public String getOrderTerm() {
        return orderTerm.toString();
    }

    public void setOrderTerm(String orderTerm) {
        this.orderTerm = new BigInteger(orderTerm);
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public String toString() {
        return  "\n Order name: \n" + orderName + ".\n" +
                "\n Size order: \n" + sizeOrder + ".\n" +
                "\n Order term: \n" + orderTerm + ".\n" +
                "\n Stage: \n" + stage + ".\n" +
                "\n Status: \n" + status + ".\n" +
                "\n Start date: \n" + startDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id) &&
                Objects.equals(clientId, order.clientId) &&
                Objects.equals(sizeOrder, order.sizeOrder) &&
                Objects.equals(orderTerm, order.orderTerm) &&
                Objects.equals(stage, order.stage) &&
                Objects.equals(status, order.status) &&
                Objects.equals(startDate, order.startDate) &&
                Objects.equals(orderName, order.orderName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, clientId, sizeOrder, orderTerm, stage, status, startDate, orderName);
    }
}
