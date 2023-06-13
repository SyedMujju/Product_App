<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Product List</title>
</head>
<body>
    <h1>Product List</h1>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Price</th>
            <th>Actions</th>
        </tr>
            <tr>
                <td>${product.id}</td>
                <td>${product.name}</td>
                <td>${product.price}</td>
                <td>
                    <a href="/products/${product.id}">Details</a>
                    <a href="/products/edit/${product.id}">Edit</a>
                    <a href="/products/delete/${product.id}">Delete</a>
                </td>
            </tr>
        
    </table>
    <a href="/products/new">Add Product</a>
</body>
</html>
