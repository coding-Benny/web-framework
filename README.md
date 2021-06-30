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
    
```console
$ cd eCommerce/src/main/resources
$ mysql -u root -p
$ use eCommerce;
$ source data.sql;
```
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
  
### 과제 2
<details>
  <summary>요구 사항</summary>
  제공된 <a href="https://github.com/stelladream/ecommerce-springboot-rest">기본 소스</a>를 기반으로 Spring Boot 2.4.5에서 다음을 수행하기
  <ol>
    <li><code>README.md</code>의 6번 항목에 따라 Postman을 사용하여 Request를 보내고 Response를 보이기</li>
    <li>Charlie 계정(권한은 admin, 패스워드는 charliepw)을 <code>data.sql</code>에 저장하기</li>
    <ul>
      <li>패스워드는 BCryptPasswordEncoder를 이용하여 해쉬값을 저장</li>
      <li><code>GET /api/products</code>를 호출했을 때 로그인 화면이 보일 수 있도록 코드를 수정하고 브라우저에서 로그인이 성공적으로 이루어짐을 보이기</li>
    </ul>
    <li><code>GET /api/categories/1</code> 요청을 보내고 응답 메시지(hypermedia)를 보인 다음, 이와 관련된 프로그램 소스를 지적하고 설명하기</li>
    <li>Category에서 특정 Product를 제거하는 코드 작성하고 결과 보이기</li>
    <ul>
      <li>응답 상태 코드(status code)는 <code>204 No Content.</code>로 설정</li>
    </ul>
  </ol>
</details>
<details>
  <summary>실행 결과</summary>
  <ul>
    <li>Product와 Category 및 User 정보를 데이터베이스에 삽입
    
```console
$ cd ecommerce-springboot-rest/src/main/resources
$ mysql -u root -p
$ use ecommerce;
$ source data.sql;
```
   </li>
   <li> Postman으로 전체 실행 결과를 확인하실 수 있습니다 :)<br>
  
[![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/9966865-dd3286c7-9eff-414b-9fa7-c928ddab07ee?action=collection%2Ffork&collection-url=entityId%3D9966865-dd3286c7-9eff-414b-9fa7-c928ddab07ee%26entityType%3Dcollection)
    <details>
  <summary>스크린샷</summary>
    
#### 1.Postman으로 Request & Response
      
  <ol type="1">
    <li>모든 product 조회하기: <code>GET</code> http://localhost:8080/api/products</li>
        
![View all products](https://user-images.githubusercontent.com/51183274/123884509-5a5fb980-d986-11eb-97d8-d24dc7a55cdd.png)

      
  <li>특정 product 조회하기: <code>GET</code> http://localhost:8080/api/products/{id}</li>
        
![View product](https://user-images.githubusercontent.com/51183274/123884644-aad71700-d986-11eb-8e32-ef59dbd34f04.png)

  <li>product 생성하기: <code>POST</code> http://localhost:8080/api/products</li>

![Create product](https://user-images.githubusercontent.com/51183274/123884865-318bf400-d987-11eb-8bb2-51c36a9d7b46.png)

  <li>product 수정하기: <code>PUT</code> http://localhost:8080/api/products/{id}</li>
      
![Update product](https://user-images.githubusercontent.com/51183274/123884903-4bc5d200-d987-11eb-8cf2-8cfa0455cf27.png)

  <li>product 삭제하기: <code>DELETE</code> http://localhost:8080/api/products/{id}</li>
      
![Remove product](https://user-images.githubusercontent.com/51183274/123884979-7021ae80-d987-11eb-8e06-0df2afae1a6b.png)
      
  <li>모든 category 조회하기: <code>GET</code> http://localhost:8080/api/categories</li>

![View all categories](https://user-images.githubusercontent.com/51183274/123885020-8465ab80-d987-11eb-907f-8e1d8bc6d269.png)

  <li>특정 category 조회하기: <code>GET</code> http://localhost:8080/api/categories/{id}</li>
      
![View category](https://user-images.githubusercontent.com/51183274/123885105-aceda580-d987-11eb-8254-983453b9c2e4.png)
      
  <li>category 생성하기: <code>POST</code> http://localhost:8080/api/categories</li>
      
![Create category](https://user-images.githubusercontent.com/51183274/123885176-d8709000-d987-11eb-81d5-366f7b56b331.png)

  <li>category 수정하기: <code>PUT</code> http://localhost:8080/api/categories/{id}</li>
      
![Update category](https://user-images.githubusercontent.com/51183274/123885267-0c4bb580-d988-11eb-8e4b-974fc78c8409.png)
      
  <li>category 삭제하기: <code>DELETE</code> http://localhost:8080/api/categories/{id}</li>
    
![Remove category](https://user-images.githubusercontent.com/51183274/123885278-166db400-d988-11eb-9fd0-629e2fea04ac.png)
      
  <li>부모 카테고리에 속한 자식 카테고리 조회하기: <code>GET</code> http://localhost:8080/api/categories/{parent_id}/subcategories</li>
      
![View subcategories](https://user-images.githubusercontent.com/51183274/123885331-3309ec00-d988-11eb-8bd2-270bcd1560be.png)
      
  <li>
    부모 카테고리와 자식 카테고리 연결하기
    <ol>
      <li>서브 카테고리 생성하기: <code>POST</code> http://localhost:8080/api/categories</li>
      
![Create subcategory](https://user-images.githubusercontent.com/51183274/123885447-72d0d380-d988-11eb-9615-9e7f96a9cbb7.png)
      
  <li>연결하기: <code>POST</code> http://localhost:8080/api/categories/{parent_id}/subcategories/{child_id}</li>
      
![Connect parent and child category](https://user-images.githubusercontent.com/51183274/123885483-8714d080-d988-11eb-8de6-75cecb80c5d7.png)
      
  </ol>
  </li>
      
  <li>연결하기: <code>POST</code> http://localhost:8080/api/categories/{parent_id}/subcategories/{child_id}</li>
      
![Connect parent and child category](https://user-images.githubusercontent.com/51183274/123885483-8714d080-d988-11eb-8de6-75cecb80c5d7.png)
      
  <li>부모 카테고리에 속한 자식 카테고리 제거하기: <code>DELETE</code> http://localhost:8080/api/categories/{parent_id}/subcategories</li>
      
![Remove child from parent category](https://user-images.githubusercontent.com/51183274/123886585-c0e6d680-d98a-11eb-8291-c1a2e3ce9dbf.png)
      
  <li>카테고리에 속한 모든 product 조회하기: <code>GET</code> http://localhost:8080/api/categories/{id}/products</li>
      
![View all products belonging category](https://user-images.githubusercontent.com/51183274/123886670-eb389400-d98a-11eb-89d9-95115e98a4a3.png)
      
  <li>product를 카테고리에 넣기
    <ol>
      <li>product 생성하기: <code>POST</code> http://localhost:8080/api/products</li>
      
![Create product](https://user-images.githubusercontent.com/51183274/123886730-10c59d80-d98b-11eb-87e2-7eb243cd9b20.png)
      
  <li>
    카테고리에 넣기: <code>POST</code> http://localhost:8080/api/categories/{category_id}/products/{product_id}</li>
      
![Put product into category](https://user-images.githubusercontent.com/51183274/123886779-2a66e500-d98b-11eb-90a2-e214adc2f102.png)

  </ol>
  </li>
    
#### 2. Charlie의 계정을 data.sql에 저장하고 로그인 확인   
![Charlie's login](https://user-images.githubusercontent.com/51183274/123887491-8ed67400-d98c-11eb-9623-7effa5967991.png)

#### 4. Category에서 특정 Product 제거
![Remove product from category](https://user-images.githubusercontent.com/51183274/123887561-b594aa80-d98c-11eb-9ba7-f4a26cf2e490.png)

  </details>
  
  </ul>
</details>
