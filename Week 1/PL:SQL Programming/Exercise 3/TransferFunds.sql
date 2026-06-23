CREATE OR REPLACE PROCEDURE TransferFunds (
    p_source_account IN NUMBER,
    p_target_account IN NUMBER,
    p_amount IN NUMBER
) IS
    v_source_balance NUMBER;
BEGIN
    -- 1. Check the source account balance 
    SELECT balance INTO v_source_balance
    FROM accounts
    WHERE account_id = p_source_account
    FOR UPDATE;
    
    -- 2. Verify sufficient funds
    IF v_source_balance >= p_amount THEN
        
        -- 3. Deduct from source account
        UPDATE accounts
        SET balance = balance - p_amount
        WHERE account_id = p_source_account;
        
        -- 4. Add to target account
        UPDATE accounts
        SET balance = balance + p_amount
        WHERE account_id = p_target_account;
        
        -- 5. Commit both updates together as a single atomic transaction
        COMMIT;
        DBMS_OUTPUT.PUT_LINE('Transfer of $' || p_amount || ' successful.');
        
    ELSE
        -- Not enough money, so we don't update anything
        DBMS_OUTPUT.PUT_LINE('Transfer failed: Insufficient funds in the source account.');
    END IF;

EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Transfer failed: One or both account IDs do not exist.');
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Unexpected error during transfer: ' || SQLERRM);
END TransferFunds;
