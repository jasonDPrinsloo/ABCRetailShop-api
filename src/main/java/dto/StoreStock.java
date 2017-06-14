package dto;

import java.util.List;

public abstract class StoreStock {
	protected String id;
	protected String description;
	protected short quantity;
	protected short reorderlvl;
	protected String image;
	protected List<CurrentStock> currentStockList;
	protected float purchasePrice;
}
