CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
    UPDATE accounts
    SET balance = balance * 1.01
    WHERE account_type = 'Savings';
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Successfully applied 1% monthly interest to all savings accounts.');

EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error processing interest: ' || SQLERRM);
END ProcessMonthlyInterest;
