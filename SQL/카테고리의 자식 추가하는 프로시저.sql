DROP PROCEDURE INSERT_CATEGORY;

DELIMITER $$
CREATE PROCEDURE INSERT_CATEGORY
	(IN _pre_category VARCHAR(20), IN _new_category VARCHAR(20), OUT RESULT INT)
/*
@DESCRIPTION
	BOOKS 테이블에  인서트하고 BOOKS_SELL에 추가된 금액으로 인서트한다.
@PARAM
	_pre_category: 상위 카테고리의 이름
	_new_category : 하위로 추가할 카테고리의 이름
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
		SELECT @myRight := category_right FROM CATEGORY WHERE category_name = _pre_category; 

		UPDATE CATEGORY SET category_right = category_right + 2 WHERE category_right >= @myRight;
		UPDATE CATEGORY SET category_left = category_left + 2 WHERE category_left >= @myRight;

		INSERT INTO CATEGORY(category_no, category_name, category_left, category_right) VALUES(null, _new_category, @myRight, @myRight + 1); 
	/* 커밋 */
	COMMIT;
	SET RESULT = 0;
    
    SELECT @RESULT;
END$$
DELIMITER ;