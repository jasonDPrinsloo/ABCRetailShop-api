package dto;

import java.util.List;

public abstract class Store {
	protected String id;
	protected String name;
	protected String parentstoreid;
	protected List<Store> storeStockList;
}
