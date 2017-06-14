package dto;

import java.util.List;

public abstract class Stock {
	protected String id;
	protected String name;
	protected String measurementType;
	protected List<StoreStock> storeStockList;
}
