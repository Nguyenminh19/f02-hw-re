-- Tính tổng số tiền các sản phẩm user đã thêm vào giỏ hàng.

SELECT 
    users.id,
    SUM(cart_items.quantity * products.price) AS Total_amount
FROM
    users
        JOIN
    carts ON carts.usersid = users.id
        JOIN
    cart_items ON cart_items.cart_id = carts.id
        JOIN
    products ON products.id = cart_items.id
GROUP BY users.id , cart_items.quantity , products.priceorders;

-- Lấy ra danh sách người dùng đã từng có đơn hàng trên 50 nghìn.

select users.id, total_amountproducts
from users
join orders on users.id = orders.usersid
where total_amount > 50000;


-- Lấy ra danh sách các sản phẩm đã hết hàng ở trong kho.
SELECT 
    id, name
FROM
    products
WHERE
    stock = 0;


-- Lấy ra danh sách người dùng và số lượng mặt hàng người dùng đó đang có trong giỏ hàng.
SELECT 
    users.id, users.fullname, SUM(quantity)
FROM
    users
        JOIN
    carts ON users.id = carts.users_id
        JOIN
    cart_items ON carts.id = cart_items.cart_id
GROUP BY users.id , users.fullname , quantity;

-- Tính tổng số tiền lãi sẽ thu được nếu như bán hết các sản phẩm còn lại.
SELECT 
    SUM((price - original_price) * stock)
FROM
    products