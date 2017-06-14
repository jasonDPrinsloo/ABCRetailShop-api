package services;

public interface StockService {
	StockService createUser(StockService user);

	StockService updateUser(StockService user);

	StockService deleteUser(String id);

	StockService getUser(String id);

	StockService AcceptDelivery();

	StockService AcceptStock();

	StockService TransferStock();

	StockService AdjustStock();
}
