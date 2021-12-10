public class RomulanClient extends AlienClient{
    OrderingStrategy orderingStrategy;

    @Override
    protected OrderingStrategy createOrderingStrategy() {
        orderingStrategy = new ImpatientStrategy();
        return orderingStrategy;
    }
}
