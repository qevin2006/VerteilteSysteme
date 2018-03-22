package Client;

import java.util.List;

import client.gen.acquisit.AcquisitionPostingService;
import client.gen.acquisit.AcquisitionPostingServiceService;
import client.gen.item.ItemService;
import client.gen.item.ItemServiceService;
import client.gen.order.Order;
import client.gen.order.OrderLine;
import client.gen.order.OrderService;
import client.gen.order.OrderServiceService;

public class Client {

	public static void main(String[] args) {
		AcquisitionPostingServiceService service_acq = new AcquisitionPostingServiceService();
		AcquisitionPostingService acquisit = service_acq.getAcquisitionPostingServicePort();

		ItemServiceService service_item = new ItemServiceService();
		ItemService item = service_item.getItemServicePort();

		OrderServiceService service_ordner = new OrderServiceService();
		OrderService order = service_ordner.getOrderServicePort();

		Order myOrder = order.getOrder(5001);
		System.out.println("Order Number: " + myOrder.getOrderNo());
		System.out.println("Order Date: " + myOrder.getOrderDate());

		List<OrderLine> myOrderLine = myOrder.getOrderLines();
		// System.out.println(myOrderLine);

		double myOrder_Lines_count_netSales = 0;
		double myOrder_Lines_Average_purchase = 0;
		System.out.println("--------------------Start of Lines--------------------------------------");
		for (OrderLine myLine : myOrderLine) {
			System.out.println("ItemNumber: " + myLine.getItemNo());
			System.out.println("ItemName: " + item.getItem(myLine.getItemNo()).getDescription());
			System.out.println("ItemQuantity: " + myLine.getQuantity());
			double average = acquisit.getAveragePurchasePrice(myLine.getItemNo(), myOrder.getOrderNo(),
					myLine.getQuantity());
			myOrder_Lines_Average_purchase = myOrder_Lines_Average_purchase + average;
			double profit = average / (myLine.getNetSalesUnitPrice() * myLine.getQuantity());
			System.out.println("Profit: " + profit);
			myOrder_Lines_count_netSales = myOrder_Lines_count_netSales
					+ (myLine.getNetSalesUnitPrice() * myLine.getQuantity());
			System.out.println("-----------------Next Line ----------------------------------------");
		}
		// System.out.println(myOrder_Lines_Average_purchase);
		// System.out.println(myOrder_Lines_count_netSales);
		double guv = myOrder_Lines_count_netSales - myOrder_Lines_Average_purchase;
		System.out.println("Gewinn / Verlust: " + guv);
		System.out.println("--------------------End of Lines--------------------------------------");

	}

}
