-- Tính tổng số tiền các sản phẩm user đã thêm vào giỏ hàng.

SELECT 
    users.id,
    SUM(cart_items.quantity * products.price) AS Total_amount
FROM
    users
        JOIN
    carts ON carts.users_id = users.id
        JOIN
    cart_items ON cart_items.cart_id = carts.id
        JOIN
    products ON products.id = cart_items.products_id
GROUP BY users.id

-- Lấy ra danh sách người dùng đã từng có đơn hàng trên 50 nghìn.

select distinct(users.id)
from users
join orders on users.id = orders.users_id
where total_amount > 200;

-- Lấy ra danh sách các sản phẩm đã hết hàng ở trong kho.
SELECT 
    id, name
FROM
    products
WHERE
    stock = 0;

-- Lấy ra danh sách người dùng và số lượng mặt hàng người dùng đó đang có trong giỏ hàng.
SELECT 
    users.id, users.fullname, SUM(quantity) AS Quantity
FROM
    users
        JOIN
    carts ON users.id = carts.users_id
        JOIN
    cart_items ON carts.id = cart_items.cart_id
GROUP BY users.id , users.fullname