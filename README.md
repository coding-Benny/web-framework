# web-framework
## Web Framework 1
### 과제 1
- [hw1-helloMVC](https://github.com/coding-Benny/web-framework/tree/master/hw1-helloMVC)
- [보고서](https://github.com/coding-Benny/web-framework/wiki/hw1-helloMVC)
### 과제 2
Medium Article 읽고 문제에 답하기(이론)
### 과제 3
<details>
  <summary>요구 사항</summary>
  <ol>
    <li>지금까지 수강한 교과목을 데이터베이스에 저장</li>
    <li>웹 페이지 접속 시 인증 유무를 체크
      <ul>
        <li>인증되었으면 메인 페이지로 이동</li>
        <li>미인증시 자체적으로 작성한 로그인 폼을 출력하고 입력된 사용자 계정 정보는 DB에 저장</li>
      </ul>
    </li>
    <li>메인 페이지에는 다음과 같은 메뉴가 있음
      <ul>
        <li>학년/학기별 이수 학점 조회</li>
          <table>
            <theader>
              <tr><th>년도</th><th>학기</th><th>취득 학점</th><th>상세보기</th></tr>
            </theader>
            <tbody>
              <tr><td>...</td><td>...</td><td>...</td><td>...</td></tr>
              <tr><td>2020</td><td>1</td><td>18</td><td>링크</td></tr>
              <tr><td>2020</td><td>2</td><td>18</td><td>링크</td></tr>
            </tbody>
            <tfoot style="text-align: center">
              <tr><th>총계</th><th></th><th>94</th><th></th></tr>
            </tfoot>
          </table>
          상세보기 링크 클릭 시 학기별 수강 내역 출력
          <table>
            <theader>
              <tr><th>년도</th><th>학기</th><th>교과목명</th><th>교과구분</th><th>담당교수</th><th>학점</th></tr>
            </theader>
            <tbody>
              <tr><td>2020</td><td>1</td><td>정보보안</td><td>전선</td><td>김남윤</td><td>3</td></tr>
              <tr><td>2020</td><td>1</td><td>운영체제</td><td>전선</td><td>황기태</td><td>3</td></tr>
              <tr><td>...</td><td>...</td><td>...</td><td>...</td><td>...</td><td>...</td></tr>
            </tbody>
          </table>
        <li>수강 신청하기</li>
          2021년 1학기에 신청할 예상 교과목을 웹 폼을 통해 입력 받고 해당 데이터에 대한 검증 작업을 실시한 후(오류시 재입력 요청) DB에 저장
        <li>수강 신청 조회</li>
          <table>
            <theader>
              <tr><th>년도</th><th>학기</th><th>교과목명</th><th>교과구분</th><th>담당교수</th><th>학점</th></tr>
            </theader>
            <tbody>
              <tr><td>2021</td><td>1</td><td>데이터베이스</td><td>전선</td><td>김영웅</td><td>3</td></tr>
              <tr><td>2021</td><td>1</td><td>안드로이드</td><td>전지</td><td>허준영</td><td>3</td></tr>
              <tr><td>...</td><td>...</td><td>...</td><td>...</td><td>...</td><td>...</td></tr>
            </tbody>
          </table>
        </li>
    </ul>
  </ol>
</details>

- [hw3-myCourseMVC](https://github.com/coding-Benny/web-framework/tree/master/myCourseMVC)
- [보고서](https://github.com/coding-Benny/web-framework/wiki/hw3-myCourseMVC)

<details>
  <summary>실행 결과</summary>
  <ul>
    <li>로그인</li>
    <img src="https://github.com/coding-Benny/web-framework/blob/master/myCourseMVC/images/login.png" width="600" height="300">
    <li>메인 페이지</li>
    <img src="https://github.com/coding-Benny/web-framework/blob/master/myCourseMVC/images/main.png" width="600" height="180">
    <li>학년/학기별 이수 총 학점</li>
    <img src="https://github.com/coding-Benny/web-framework/blob/master/myCourseMVC/images/summary.png" width="600" height="450">
    <li>2020-1 수강 내역</li>
    <img src="https://github.com/coding-Benny/web-framework/blob/master/myCourseMVC/images/detail-2020-1.png" width="600" height="450">
    <li>2021-1 수강신청 폼</li>
    <img src="https://github.com/coding-Benny/web-framework/blob/master/myCourseMVC/images/register.png" width="600" height="300">
    <li>수강신청 완료</li>
    <img src="https://github.com/coding-Benny/web-framework/blob/master/myCourseMVC/images/register-completed.png" width="600" height="180">
    <li>2021-1 수강 신청 내역</li>
    <img src="https://github.com/coding-Benny/web-framework/blob/master/myCourseMVC/images/registration.png" width="600" height="450">
  </ul>
</details>

## Web Framework 2
### 과제 1
<details>
  <summary>요구 사항</summary>
  <a href="https://github.com/stelladream/eCommerce">기본 소스</a>를 수정하여 Product와 Category를 관리하는 REST API를 구현하기
</details>
<details>
  <summary>실행 결과</summary>
  <ul>
    <li>Product와 Category 정보를 데이터베이스에 삽입
    
    $ cd eCommerce/src/main/resources
    $ mysql -u root -p
    $ use eCommerce;
    $ source data.sql;
   </li>
   <li> Postman으로 전체 실행 결과를 확인하실 수 있습니다 :)<br>
  
[![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/9966865-27eaf1fc-3c65-474d-9ec0-3aeefdb103c8?action=collection%2Ffork&collection-url=entityId%3D9966865-27eaf1fc-3c65-474d-9ec0-3aeefdb103c8%26entityType%3Dcollection)
    <details>
  <summary>스크린샷</summary>
    <ol type="1">
      <li>
        모든 product 조회하기: <code>GET</code> http://localhost:8080/ecommerce/api/products<br>
        <img src="https://github.com/coding-Benny/web-framework/blob/master/eCommerce/images/1.view-all-products.PNG" alt="View all products">
      </li>
      <li>
        특정 product 조회하기: <code>GET</code> http://localhost:8080/ecommerce/api/products/{id}<br>
        <img src="https://github.com/coding-Benny/web-framework/blob/master/eCommerce/images/2.view-product.PNG" alt="View product">
      </li>
      <li>
        product 생성하기: <code>POST</code> http://localhost:8080/ecommerce/api/products<br>
        <img src="https://github.com/coding-Benny/web-framework/blob/master/eCommerce/images/3.create-product.PNG" alt="Create product">
      </li>
      <li>
        product 수정하기: <code>PUT</code> http://localhost:8080/ecommerce/api/products/{id}<br>
        <img src="https://github.com/coding-Benny/web-framework/blob/master/eCommerce/images/4.update-product.PNG" alt="Update product">
      </li>
      <li>
        product 삭제하기: <code>DELETE</code> http://localhost:8080/ecommerce/api/products/{id}<br>
        <img src="https://github.com/coding-Benny/web-framework/blob/master/eCommerce/images/5.delete-product.PNG" alt="Remove product">
      </li>
      <li>
        모든 category 조회하기: <code>GET</code> http://localhost:8080/ecommerce/api/categories<br>
        <img src="https://github.com/coding-Benny/web-framework/blob/master/eCommerce/images/1-1.view-all-categories.PNG" alt="View all categories">
      </li>
      <li>
        특정 category 조회하기: <code>GET</code> http://localhost:8080/ecommerce/api/categories/{id}<br>
        <img src="https://github.com/coding-Benny/web-framework/blob/master/eCommerce/images/1-2.view-category.PNG" alt="View category">
      </li>
      <li>
        category 생성하기: <code>POST</code> http://localhost:8080/ecommerce/api/categories<br>
        <img src="https://github.com/coding-Benny/web-framework/blob/master/eCommerce/images/1-3.create-category.PNG" alt="Create category">
      </li>
      <li>
        category 수정하기: <code>PUT</code> http://localhost:8080/ecommerce/api/categories/{id}<br>
        <img src="https://github.com/coding-Benny/web-framework/blob/master/eCommerce/images/1-4.update-category.PNG" alt="Update category">
      </li>
      <li>
        category 삭제하기: <code>DELETE</code> http://localhost:8080/ecommerce/api/categories/{id}<br>
        <img src="https://github.com/coding-Benny/web-framework/blob/master/eCommerce/images/1-5.delete-category.PNG" alt="Remove category">
      </li>
      <li>
        부모 카테고리에 속한 자식 카테고리 조회하기: <code>GET</code> http://localhost:8080/ecommerce/api/categories/{parent_id}/subcategories<br>
        <img src="https://github.com/coding-Benny/web-framework/blob/master/eCommerce/images/2-1.view-child-categories.PNG" alt="View child categories">
      </li>
      <li>
        부모 카테고리와 자식 카테고리 연결하기
        <ol>
          <li>
            서브 카테고리 생성하기: <code>POST</code> http://localhost:8080/ecommerce/api/categories<br>
            <img src="https://github.com/coding-Benny/web-framework/blob/master/eCommerce/images/2-2-1.create-subcategory.PNG" alt="Create subcategory">
          </li>
          <li>
            연결하기: <code>POST</code> http://localhost:8080/ecommerce/api/categories/{parent_id}/subcategories/{child_id}<br>
            <img src="https://github.com/coding-Benny/web-framework/blob/master/eCommerce/images/2-2-2.connect-parent-child-category.PNG" alt="Connect parent and child category">
          </li>
        </ol>
      </li>
      <li>
        부모 카테고리에 속한 자식 카테고리 제거하기: <code>DELETE</code> http://localhost:8080/ecommerce/api/categories/{parent_id}/subcategories<br>
        <img src="https://github.com/coding-Benny/web-framework/blob/master/eCommerce/images/2-3.remove-child-from-parent-category.PNG" alt="Remove child from parent category">
      </li>
      <li>
        카테고리에 속한 모든 product 조회하기: <code>GET</code> http://localhost:8080/ecommerce/api/categories/{id}/products<br>
        <img src="https://github.com/coding-Benny/web-framework/blob/master/eCommerce/images/3-1.view-all-products-belongs-category.PNG" alt="View all products belongs category">
      </li>
      <li>
        product를 카테고리에 넣기
        <ol>
          <li>
            product 생성하기: <code>POST</code> http://localhost:8080/ecommerce/api/products<br>
            <img src="https://github.com/coding-Benny/web-framework/blob/master/eCommerce/images/3-2-1.create-product.PNG" alt="Create product">
          </li>
          <li>
            카테고리에 넣기: <code>POST</code> http://localhost:8080/ecommerce/api/categories/{category_id}/products/{product_id}<br>
            <img src="https://github.com/coding-Benny/web-framework/blob/master/eCommerce/images/3-2-2.put-product-into-category.PNG" alt="Put product into category">
          </li>
        </ol>
      </li>
      <li>
        product를 카테고리에서 제거하기: <code>DELETE</code> http://localhost:8080/ecommerce/api/categories/{category_id}/products/{product_id}<br>
        <img src="https://github.com/coding-Benny/web-framework/blob/master/eCommerce/images/3-3.delete-product-from-category.PNG" alt="Delete product from category">
      </li>
    <ol>
    </details>
   </li>
  </ul>
</details>
