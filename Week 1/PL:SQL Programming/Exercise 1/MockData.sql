CREATE TABLE customers (
    customer_id NUMBER PRIMARY KEY,
    first_name VARCHAR2(50),
    last_name VARCHAR2(50),
    age NUMBER,
    interest_rate NUMBER(4,2),
    balance NUMBER,
    is_vip VARCHAR2(5) DEFAULT 'FALSE'
);

CREATE TABLE loans (
    loan_id NUMBER PRIMARY KEY,
    customer_id NUMBER REFERENCES customers(customer_id),
    due_date DATE
);
INSERT INTO customers VALUES (1, 'John', 'Senior', 65, 5.5, 12000, 'FALSE');
INSERT INTO customers VALUES (2, 'Jane', 'Standard', 45, 6.0, 5000, 'FALSE');
INSERT INTO loans VALUES (101, 1, SYSDATE + 15); -- Due in 15 days
INSERT INTO loans VALUES (102, 2, SYSDATE + 45); -- Due in 45 days
COMMIT;