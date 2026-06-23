DECLARE
    CURSOR c_customers IS 
        SELECT customer_id, balance, is_vip 
        FROM customers 
        FOR UPDATE OF is_vip;
BEGIN
    FOR r_customer IN c_customers LOOP
        IF r_customer.balance > 10000 THEN
            UPDATE customers
            SET is_vip = 'TRUE' 
            WHERE CURRENT OF c_customers;
        END IF;
    END LOOP;
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('VIP statuses have been successfully updated based on balances.');
END;
/