DROP PROCEDURE DELETE_CATEGORY;

DELIMITER $$
CREATE PROCEDURE DELETE_CATEGORY
	(IN _delete_category VARCHAR(20), OUT RESULT INT)
/*
@DESCRIPTION
	BOOKS 테이블에  인서트하고 BOOKS_SELL에 추가된 금액으로 인서트한다.
@PARAM
	_delete_category: 지우고싶은 카테고리 이름
@RETURN
	RESULT : 실패(-1), 성공 (0)
*/

BEGIN

	/* 만약 SQL에러라면 ROLLBACK 처리한다. */
	DECLARE exit handler for SQLEXCEPTION
	  BEGIN
		ROLLBACK;        
		SET RESULT = -1; 
	END;

	/* 트랜젝션 시작 */	
	START TRANSACTION;
		SELECT @myLeft := category_left, @myRight := category_right, @myWidth := category_right - category_left + 1 FROM CATEGORY WHERE category_name = _delete_category;
        
        DELETE FROM CATEGORY WHERE category_left BETWEEN @myLeft AND @myRight;
        
        UPDATE CATEGORY SET category_right = category_right - @myWidth WHERE category_right > @myRight;
        UPDATE CATEGORY SET category_left = category_left - @myWidth WHERE category_left > @myRight;
	/* 커밋 */
    COMMIT;
    SET RESULT = 0;
    
    SELECT @RESULT;

END$$
DELIMITER ;