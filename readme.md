# 카페 24 쇼핑몰 과제

### 작업 일정 :page_facing_up:

| API 목록                                  | URL                                       | 메소드 | 예상 일정     | 예상 소요 시간 | 개발 일정 |
| ----------------------------------------- | ----------------------------------------- | ------ | ------------- | -------------- | --------- |
| **user-controller**                       |                                           |        | **7.17~7.19** |                |           |
| - 회원 가입                               | /api/user/join                            | POST   | 7.17          | 30min          | 1H        |
| - 회원 가입 여부                          | /api/user/join/check                      | GET    | 7.18          | 30min          | 1H        |
| - 아이디 존재 여부                        | /api/user/join/check/id                   | GET    | 7.18          | 30min          | 1H        |
| - 회원 로그인                             | /api/user/login                           | GET    | 7.18          | 30min          | 1H        |
| - 회원 정보 수정                          | /api/user/update                          | PUT    | 7.19          | 30min          | 1H        |
| - 회원 탈퇴                               | /api/user/withdrawal/{client_no}          | DELETE | 7.19          | 30min          | 1H        |
| **admin-brand-controller**                |                                           |        | **7.22~7.22** |                |           |
| - 브랜드 추가                             | /api/admin/brand/add                      | POST   | 7.22          | 30min          | 30min     |
| - 브랜드 삭제                             | /api/admin/brand/delete/{brand_no}        | DELETE | 7.22          | 30min          | 30min     |
| - 브랜드 수정                             | /api/admin/brand/modify/{brand_no}        | PUT    | 7.22          | 30min          | 30min     |
| **admin-category-controller**             |                                           |        | **7.23~7.26** |                |           |
| - 카테고리 추가                           | /api/admin/category/add                   | POST   | 7.25          | 1H             | 4H        |
| - 카테고리 삭제                           | /api/admin/category/delete                | DELETE | 7.26          | 30min          | 30min     |
| - 카테고리 수정                           | /api/admin/category/modify                | PUT    | 7.26          | 30min          | 30min     |
| **admin-product-controller**              |                                           |        | **7.29~8.01** |                |           |
| - 상품 등록                               | /api/admin/product/add                    | POST   | 7.31          | 1H             | 4H        |
| - 상품 삭제                               | /api/admin/product/delete/{product_no}    | DELETE | 8.01          | 1H             | 30min     |
| - 상품 수정                               | /api/admin/product/update/{product_no}    | PUT    | developing    | -              | -         |
| **product-controller**                    |                                           |        | **7.29~8.2**  |                |           |
| - 전체 상품리스트 가져오기                | /api/product/get                          | GET    | 7.31          | 1H             | 1H        |
| - 상품 가져오기 (브랜드로)                | /api/product/get/brand/{product_brand_no} | GET    | 8.1           | 1H             | 30min     |
| - 상품 가져오기 (카테고리로)              | /api/product/get/product/{category_no}    | GET    | 8.1           | 2H             | 1H30min   |
| - 상품 가져오기 (키워드로)                | /api/product/get/keyword                  | GET    | 8.2           | 1H             | 30min     |
| - 상품 가져오기 (상품번호로)              | /api/product/get/product/{product_no}     | GET    | 8.2           | 1H             | 30min     |
| **shipping-controller**                   |                                           |        | **8.3**       |                |           |
| - 배송지 추가                             | /api/shippping/add                        | POST   | 8.3           | 30min          | 30min     |
| - 배송지 삭제                             | /api/shipping/delete/{shipping_no}        | DELETE | 8.3           | 30min          | 30min     |
| - 배송지 수정                             | /api/shipping/modify/{shipping_no}        | GET    | 8.3           | 30min          | 30min     |
| - 배송지 조회 (배송지 번호)               | /api/shippig/get/client                   | GET    | 8.3           | 30min          | 30min     |
| - 배송지 조회 (회원 번호로)               | /api/shipping/get                         | GET    | 8.3           | 30min          | 30min     |
| **cart-controller**                       |                                           |        | **8.4**       |                |           |
| - 장바구니 담기                           | /api/cart/add                             | POST   | 8.4           | 1H             | 1H        |
| - 장바구니 삭제(번호선택)                 | /api/cart/delete                          | DELETE | 8.4           | 30min          | 30min     |
| - 장바구니 리스트 가져오기                | /api/cart/get/list                        | GET    | 8.4           | 30min          | 1H        |
| - 선택된 장바구니 리스트 가져오기(주문시) | /api/cart/get/p_list                      | GET    | 8.4           | 30min          | 1H        |
| - 카트 수량 수정                          | /api/cart/modify                          | PUT    | 8.4           | 30min          | 30min     |
| **admin-ordersController**                | developing..                              |        |               |                |           |
| **orderesController**                     | developing..                              |        |               |                |           |



## API 개발 정리



### 고려했던 점과 미구현 부분들에 대한 설명



## 1. ProductController

**상품 등록**

-   PRODUCT(상품)과 동시에 등록시 필요한 IMAGE / OPT_FULL_DETAIL / OPT / OPT_DETAIL 을 한번에 넣고 싶어 mybatis 안에서 해결하고자 개발시간이 많이 지체되었습니다.



**상품 수정**

-  현재 API를 확인해보자면 상품에게 의존적인 IMAGE / OPT_FULL_DETAIL / OPT / OPT_DETAIL 부분들을 등록하는것에 깊이 생각하다보니 수정할때를 생각하지 못해 다시 코딩을 해야하는 불상사를 일으켰습니다.
-  ![1564932252143](https://github.com/mshero7/shoppingmall-docs/blob/master/images/%EC%9E%91%EC%97%85%EC%9D%BC%EC%A0%95%20-%20%EC%83%81%ED%92%88%ED%85%8C%ED%85%8C%EC%9D%B4%EB%B8%94.png?raw=true)



## 2. CategoryController

-  ### 생각 1

   카테고리를 단순하게 남성 여성 스포츠로 나누려고 했으나 검색을 조금 해보니 조금 욕심이 생겨 생각을 정리하며 내가 원하는 방향을 정리하기 시작했다. 맨 처음으로 대분류 중분류 소분류 세개의 테이블로 나눠보기로 했다. 하지만 이 작업도 너무 과하다 싶어 하나의 테이블로 줄일수는 없을까 생각을 해본결과 관리자 페이지에서 카테고리를 추가할때 남성 - 상의 - 셔츠 와 같이 분류를 할 수 있고, 다른 카테고리와 겹칠일이 없다는걸 판단, 테이블도 세개나 필요가 없을거라 생각해 하나의 행에 대/중/소분류를 넣어 관리하면 어떨까 생각해보았다.

   | 카테고리번호 | 카테고리이름   |
   | ------------ | -------------- |
   | 1            | 남성-상의-셔츠 |
   | 2            | 남성-상의-긴팔 |

   

   ### 생각 2

   카테고리를 조금 더 신경써서 만들어보고 싶다는 생각이 들어 찾던 중 '중첩 세트 모델' 이라는 각 범주마다 left값과 right 값을 주어 범주를 표현한(트리형식) 쿼리문이 있어 내가 지향하던 바와 비슷한것 같아 적용해보기로 했다.

   ![](https://t1.daumcdn.net/cfile/tistory/27686F44589A92F02A)

   

   ![img](https://t1.daumcdn.net/cfile/tistory/267CDB36589A948D01)

   위 그림에서 아래 그림과 같이 좌 우 값을 나누어 누가 누구의 부모이고, 자식은 누구인지에 대해 알 수 있게 되었다.

   

   ### QUERY

   -  가정 : 상품의 카테고리는 잎사귀노드이다.

   ```mysql
   ## 계층화 하지 않은 일반 카테고리
   ## in mariadb
   SELECT node.category_name AS name 
   FROM CATEGORY AS node, CATEGORY AS parent 
   WHERE node.category_left BETWEEN parent.category_left 
   AND parent.category_right 
   AND node.category_no > 1 GROUP BY node.category_name ORDER BY node.category_left;
   ```

   ```mysql
   ## 각 부모의 잎사귀 노드를 가져온다.
   ## 그림 예제에서 TUBE / LCD / PLSASMA / FLASH / CD PLAYER / 2 WAY RADIOS
   ## in mybatis
   SELECT product_name from PRODUCT
   			where product_category_no in(
   			(SELECT category_no
   			FROM CATEGORY
   			WHERE category_right = category_left + 1 and category_right <
   			(select category_right
   			from CATEGORY where category_no=#{category_no})));
   ```

   

   ### 성공한 부분

   -  테이블을 하나로 만들어서 계층적으로 관리 ( 대 분류별, 중분류 별 상품들을 출력이 가능해짐)

      

   ### 내 한계

   -  카테고리를 드래그로 옮길때를 구현하지 못함



## 3. CartController

### 장바구니에서 선택한 품목들만 주문할 수 있도록 구현

### 

-  ERD와 API 목록
-  느낀점(아쉬운 점)



## 4. OrdersController

![1564934912009](https://github.com/mshero7/shoppingmall-docs/blob/master/images/%EC%9E%91%EC%97%85%EC%9D%BC%EC%A0%95%20-%20%EC%A3%BC%EB%AC%B8%20%ED%85%8C%EC%9D%B4%EB%B8%94.png?raw=true)

### 사용자

-  orders_no로 주문 상세 정보 가져오기
-  주문 구현..
-  고객 번호로 orders 가져오기

### 관리자

-  orders 전체 리스ㅡ 가져오기
-  주문 상태를 수정할 수 있는 update 문



### 생각해볼점

-  Java Enum Type 활용
-  테이블에서의 ENUM Type



### 느낀점 및 아쉬운점

```
1. 새로운 기술
 기존 jsp tomcat 으로만 개발하던 저에게는 Spring, JUnit, mybatis 에 대한 지식이 많지 않았고 수업을 통해 어느 정도 활용할 수 있을 것 같다는 생각이 듦과 동시에 프로젝트를 수행하게 됬습니다. 새로운 기술들을 접목 시키는데 어려움을 느끼기도 했지만 동기들과 프로젝트 얘기를 하며 다양한 방법과 효율적인 방법으로 접근해 나갈 수 있게 되었습니다. 
 
2. 개발 욕심
 개발 욕심이 조금 있다보니 데이터들을 원하는 방식으로 어떻게 보여주어야 할지, 혹은 어떻게 가져와야 할지에 대한 고민들이 상당히 많았습니다. 짧게는 10분 길게는 3~4시간까지 검색을 통해 원하는 답을 얻지 못하더라도 다양한 방법들을 눈에 익히는 것만으로도 좋은 시간이었다고 생각했습니다. 또한 java를 좋아하고 새로운 기술을 접하는데 거리낌이 없는 저로서 자바를 통해 다양한 일을 할 수 있다는 것이 흥미롭고, 또 다른 개발을 할 수 있을 것 같다는 생각이 들었습니다.
 
3. 시간의 배분
 저에게는 시간이 많은듯 부족했던 시간이었던거 같습니다. 서류와 코딩, 새로운 기술들에 대한 검색 및 적용 등 제 시간을 갉아먹는 것들에 대해 신경을 쓰지 못하다 보니 1차 제출기간동안 마무리를 짓지 못했습니다. 
 
4. 1차 마무리
 현재 ADMIN OrdesrController / OrdersController 구현만 남겨놓고 있습니다. 빠른 시간내에 마무리해 commit 할 수 있도록 하겠습니다. 이번 프로젝트를 통해 제가 생각보다 시간이 가까워 감에 따라 더 열심히 하는 모습을 보이는것을 알 수 있었습니다. 이 모습을 바꾸고 싶어 미리 적용될 기술들은 알고 있으니 기술들에 대한 공부를 미리 하는것으로 뒤늦게 탄력이 붙는 제 시간을 더 앞당겨 이 단점을 보완할 수 있다고 생각합니다. 
```


