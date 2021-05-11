package day4Homework3;

public interface OrderService extends BaseService
{
void add(Order order,Campaign campaign);
void update(Order order);
void delete(Order order);
void showOrderInformation(Order order);
}
