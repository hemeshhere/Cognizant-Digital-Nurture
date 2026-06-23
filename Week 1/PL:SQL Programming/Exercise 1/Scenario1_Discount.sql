DECLARE
    CURSOR c_customers IS 
        SELECT customer_id, age, interest_rate 
        FROM customers 
        FOR UPDATE OF interest_rate;
BEGIN
    FOR r_customer IN c_customers LOOP
        IF r_customer.age > 60 THEN
            UPDATE customers
            SET interest_rate = interest_rate - 1
            WHERE CURRENT OF c_customers; 
        END IF;
    END LOOP;
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Successfully applied 1% discount to all senior citizen loans.');
END;
/