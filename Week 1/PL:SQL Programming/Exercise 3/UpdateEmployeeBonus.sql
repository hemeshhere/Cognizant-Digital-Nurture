CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    p_department_id IN NUMBER,
    p_bonus_percentage IN NUMBER
) IS
BEGIN
    UPDATE employees
    SET salary = salary + (salary * (p_bonus_percentage / 100))
    WHERE department_id = p_department_id;
    
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Successfully applied a ' || p_bonus_percentage || '% bonus to department ' || p_department_id || '.');

EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error applying bonus: ' || SQLERRM);
END UpdateEmployeeBonus;
