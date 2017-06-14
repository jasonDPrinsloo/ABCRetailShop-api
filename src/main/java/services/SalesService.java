package services;

import dto.Sales;

public interface SalesService {//throws notFoundException,MissingParamEx,InvalidParamEx,alreadyexistsEx
	SalesService RecordSales(Sales s, String userID);

	SalesService voidSale(Sales s, String userid);

	SalesService ReturnSales();
}
