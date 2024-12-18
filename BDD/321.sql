drop database new_schema5;
create database new_schema5;
use new_schema5;

CREATE TABLE Orders (
OrderID INT,
CustomerID INT,
OrderDate DATE,
TotalAmount DECIMAL(10, 2),
CONSTRAINT OrderID PRIMARY KEY (OrderID),
CONSTRAINT CustFK FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);
CREATE TABLE Customers (
CustomerID INT,
FirstName VARCHAR(50),
LastName VARCHAR(50),
Email VARCHAR(100),
PhoneNumber VARCHAR(15),
CONSTRAINT CustomerID PRIMARY KEY (CustomerID)
);
CREATE TABLE OrderDetails (
OrderDetailID INT,
OrderID INT,
Quantity BOOLEAN,
Price DECIMAL(10, 2),
CONSTRAINT OrderDetaiID PRIMARY KEY (OrderDetailID),
CONSTRAINT OrderID FOREIGN KEY (OrderID) REFERENCES Orders(OrderID)
);
