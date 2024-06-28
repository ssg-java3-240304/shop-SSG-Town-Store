# shop-SSG-Town-Store
Spring CRUD 기반의 쇼핑몰(굿즈샵)관리자 페이지<br>

* * *
### 클래스 다이어그램 
![admin](https://github.com/ssg-java3-240304/shop-SSG-Town-Store/assets/116868167/5db15ef6-a076-4a2b-8746-d8ef6400f642)

### 유스케이스 다이어그램
- **로그인,회원관리,상품관리**
![image](https://github.com/ssg-java3-240304/shop-SSG-Town-Store/assets/116868167/6ea49176-bed0-4247-abdd-e7f019e97ae4)

- **주문관리,환불처리,매출관리**
![image](https://github.com/ssg-java3-240304/shop-SSG-Town-Store/assets/116868167/1b396271-8bb3-4ad4-9127-1d21fc226989)

## ERD
![image](https://github.com/ssg-java3-240304/shop-SSG-Town-Store/assets/116868167/58577e3e-e517-4dc8-85e1-aa550c991c7a)

## 시퀀스 다이어그램 링크 
<https://whimsical.com/ssgsmtown-sequence-FLK77PUW23x8kuNW3FBR9A>
* * *

## 주요 기능
### 로그인
1. 관리자의 ID,PW의 상태와 입력값을 검증하고 로그인처리를 합니다.
2. AJAX 통신을 통해 처리결과에 따른 alert를 출력합니다.
3. 로그인 성공 시 관리자 페이지로 넘어갑니다.
4. 관리자는 모든 페이지에서 로그아웃을 할 수 있다.

### 회원 관리
1. 관리자는 가입한 회원 목록을 조회 할 수 있다.
2. 관리자는 회원정보의 탈퇴여부를 확인하고 삭제처리를 할 수 있다.
3. 관리자는 회원의 정보에 따른 검색을 할 수 있다. 
   
### 상품 관리
1. 관리자는 판매할 상품을 등록할 수 있다.
2. 관리자는 등록된 상품을 전체 조회나 선별적 조회를 할 수 있다.
3. 관리자는 상품의 데이터를 수정할 수 있다.
4. 관리자는 더 이상 판매하지 않을 상품에 대한 상품상태를 판매중지로 처리할 수 있다. 

### 주문 관리
1. 주문 내역을 조회할 수 있고 각 내역별 상태처리를 할 수 있다.
2. 들어온 각 주문에 대한 발송,발송취소 처리를 한다.
3. 주문이 들어왔지만 재고량이 부족할 시 발송불가 처리를 한다.
4. 주문내역을 누르면 요약페이지에서 상세정보를 출력한다.

### 매출 관리
1. 관리자는 모든 주문에 대한 정보를 조회할 수 있다.
2. 주문 발송처리가 끝나면 매출에 집계된다.
3. 일별로 마감정산을 할 수 있다.
4. 매출 집계 데이터를 이용해 기간,아티스트 별 인기상품 그래프를 출력한다.
### 환불 관리
1. 관리자는 환불내역을 조회합니다.
2. 관리자는 환불요청, 환불완료, 환불취소 상태에 따라  조회가 가능합니다.
3. 관리자는 기간을 지정하여 환불내역을 조회 할 수 있습니다.
4. 관리자는 회원ID 혹은 회원명으로 조회 할 수 있습니다.
5. 관리자는 각 환불요청에 대해 완료와 취소 처리를 할 수 있습니다. 
  
* * *
## 개발
1. 개발 도구
JAVA, MYSQL, Spring, MYBATIS, AJAX , BootStrap5, JacaScript

3. 개발기간
- 2024-06-12 ~ 2024-06-21 프로젝트 분석 / 기획
- 2024-06-22 ~ 2024-06-27 화면 설계 및 코드 구현
- 2024-06-27 ~ 2024-06-28 테스트 완료 및 프로젝트 발표 

* * *
## 팀 sususuSuperJava의 프로젝트 후기

### 정예진
프로젝트 시작 전 강의를 들을 때부터 스프링이 너무 낯설어서 긴장하고 있었던 것 같습니다. 배운 것을 과제로 익힐 시간이 부족했는데 프로젝트에 던져지고 눈앞에 있는 것을 차근차근 해결하려다 보니 차차 눈에 익기 시작했습니다. 수업 때 배웠던 스프링부트 위에서 세션과 모델을 통해 앞단과 DTO 및 쿼리스트링값, json 데이터 주고 받기, mybatis, 타임리프, html 선택자로 css적용하기, javascript dom, ajax로 json을 주고 받는 것까지 골고루 활용해볼 수 있어서 도움이 많이 됐습니다. 다음에는 조회할 때 조건을 선택할 때마다  비동기처리로 결과가 바뀌도록 구현해보고 싶습니다.

저는 환불처리와 매출 조회 일부를 맡았습니다. 강사님께서는 환불 기능이 부가적인 것이라고 말씀하셨지만 제가 관리자로서 쇼핑몰을 운영한다고 했을 때 고객들의 민원을 처리하는 것이 고객들과의 신뢰를 쌓기 위한 핵심적인 기능이라는 생각이 들었기 때문에 포기할 수 없었습니다. 관리자 입장에서 환불처리를 할 때 어떤 조건으로 검색하면 편할지 생각했고, 환불 승인과 거부를 한 후 버튼을 비활성화하는 것도 편의를 위해 추후 반영하게 된 기능이었습니다.

환불을 승인할 때 고려한 점은 매출 집계였습니다. 따라서 매출 관리가 원활히 진행되도록 테이블 정의부터 매출 파트에 관여하게 되었습니다. 환불시 주문당 들어온 환불요청을 주문상세 상품들을 대상으로 매출 테이블에 -로 데이터가 저장이 되게 하였고 양쪽의 쿼리문을 작성하는 데 수월해서 뿌듯했습니다.

아쉬웠던 점은 타임리프 레이아웃을 완벽히 적용시킬 수 없었다는 것이었습니다. 시간을 절약하기 위해 완성형 부트스트랩을 선정하게 되었는데 그만큼 구조가 복잡했고, 미처 모든 것을 파악할 수 없었습니다. 조금만 구조가 어긋나도 css와 스크립트가제대로 작동되지 않는다는 문제때문에 팀원들이 꽤 고생했던 것 같습니다.  다음에는 cdn을 참조하는 방향으로 부트스트랩을 활용해보고 싶다는 생각이 들었습니다.

### 최창욱
1. 주문
    1. 주문 목록보기
    2. 발송처리
    3. 취소처리
2. 미흡한 부분
    1. 부분 발송처리가 없다
    2. 발송처리 할 때 주문수량>재고수량 일 때 경고창을 안보여준다
    3. 상세 페이지를 새로운 창으로 띄워서 봐야한다
3. 콘솔에 표기는 어떻게든 하겠지만 html, js로는 연결하기가 너무 힘들다
4. 프로젝트 후기
    1. 부트스트랩을 애매하게 안다면 차라리 하나씩 가져와서 붙이는게 가장 효율적이다
    2. js를 이용한 함수처리 등등을 해야 될 거 같다

### 김나경
1. 구현한 부분
    1. 상품 수정 기능 → 현재 상품아이디 와 판매원 말고 모두 수정 할 수 있습니다. 상품아이디와 판매원은 고정이기때문에 수정하는 부분에 넣지 않았고 휴지통 옆에 있는 아이콘을 클릭하면 상품아이디에 해당하는 수정하는 페이지가 나옵니다. 기존의 DB가 불러져있으며 모두 완료하고 수정 버튼을 누르면 다시 상품목록 페이지로 돌아갑니다.
    2. 상품 수정 부가 기능 →  휴지통 버튼을 누르면 품절인 상태인 것은 판매중지로 변경 하고 변경되었습니다. 라고 창이 뜨면서 , 만약 상태가 품절이 아니고 판매중지 또는 판매중 이라면 품절상태가 아니라면 경고창이 뜹니다. 
2. 구현 중 미흡한 부분( ex) 발송할 때 재고 확인을 하고 경고창으로 알려줘야 하지만 못했다
    1. 상품 수정 기능 → 기존에 있던 이미지를 불러오고 싶었는데 이 과정이 너무 복잡해서 구현하지 못했습니다. 그래서 현재 상품수정을 하면 무조건 이미지를 수정해줘야 합니다. 만약 수정을 하고 싶지 않다면 뒤로가기를 누르면 됩니다. ( 수정 버튼을 누를시 데이터가 반영되기때문에) 
    현재 관리자가 한명이라서 수정을 사용하는데는 자신의 컴퓨터에 이미지가 저장되어도 상관없지만 만약 관리자가 여러명이라면 수정한 상품의 이미지는 다른사람에게 보이지 않아서 못 찾을 수 있습니다. ( 서버로 이미지를 업로드하고 가져오지 않고 로컬에서 저장하기때문에)
    그리고 현재 상품이미지를 올리지 않으면 경고창이 뜨거나 기본이미지로 무조건 넣어지는걸로 구현하려고 했으나 시간부족으로 하지 못했습니다. 오류 
3. 프로젝트 중 어려웠거나 힘들었던 상황, 코드 등등
이미지 불러오는게 어려웠고 레이아웃을 먼저 하지 않아 부트스트랩에서 css를 잘 못찾는 오류가 발생했다. 경로 때문에 또 부트스트랩이 어떻게 되어있는지 구조를 파악하는것도 어려웠으며 html 과 타임리프에 문법에 대해 찾아보느랴 구현할 때 시간이 오래걸렸던 것 같다. 
4. 프로젝트 후기 
    - ex) 하면서 느낀점
    - ex) 배우고 싶은 기능
    - 기존에 있는 이미지를 가져오는 기능..
    - 서버로 이미지를 업로드하고 가져오는 기능
      
### 윤도환
1. 구현한 부분
    
    매출 
    
    -매출 목록보기 : 매출의 상품명과 가격을 조회하는 부분
    
    -매출 그래프 : 가장많이 팔린 상품 7개와 가격을 그래프로 표현
    
    -아티스트매출그래프 : 아티스트별 가장많이 팔린 상품을 도넛모양의 그래프로 표현
    
    2.미흡한 부분
    
    -환불파트에서 환불했을때의 총매출이 줄어들어야 하는데 -를 하지못했다.
    
    -버튼이나 체크 박스 같은 요소들로 다양한 한부분에서 그래프를 보여주는것을 제어하고 싶었는데 하지 못햇다.
    
    -부트스트랩을 가져와서 적용을 하는데 있어서 js파일과,html 파일을 분석하고 적용하고 하는 점에 있어서 오류도 많이나고 연결하는게 어려웠다.
    4. 프로젝트 후기
        
        -html파일과 js파일의 구조를 이해하는데 어려움이 컸고 다음에 한다면 더 구조를 알아보고 임해야 할것 같다.
        
        -또한 ajax문법을 사용하는데 아직 미숙한 부분이 많았고 다음을 위해 더 해야할것 같다.
        
        -부스스트랩을 가져와서 사용할거면 처음부터 구조를 파악하고 해야할것 같으며 그게 어렵다면 통째로 가져와서 사용하기 보다는 부분부분 떼와서 사용하는게 더 좋을것 같다.
       
### 양희윤
1. 구현한 부분
   상품 조회 기능 (DB에서 상품 테이블을 가져와 화면에 출력하는 전체조회, 그 중 원하는 조건만을 가진 상품만 필터링하는 다중조건 검색. 카테고리명, 아티스트명, 가격, 판매상태 조건이 있음)
   상품 등록 기능 - 상품 등록 페이지에서 상품정보를 입력합니다. (상품명, 카테고리ID, 아티스트ID, 이미지, 판매원, 세부설명, 수량, 판매가, 판매상태)
3. 미흡한 부분
   상품 조회
   - 예외처리가 없다.상품을 등록할때 0원이하여도 등록이 가능하고 DB나 로컬PC 둘 중 하나 혹은 모두 실패해도 [등록이 성공했습니다] alert가 뜬다.
   - 조건 조회 버튼을 누른 후 상품명 검색을 하면 잘 찾는데 상품명을 검색 한 후 조건 조회 버튼을 누르면 상품을 찾지 못한다.
   - 상품 조회 시 판매가로 조회할 수 있는데 고객이 범위를 설정하지 못하고 select#option에 지정한 값 이하의 상품만 찾도록 구현했다.
   상품 등록
   - 상품을 등록할때 이미지를 잘못 올리면 삭제처리하고 다시 올리기를 시도해야하는데 삭제가 안된다. 뒤로가기를 하거나 무조건 해당 이미지로 상품을 등록해야 한다.
   - 상품 등록 시 이미지를 FTP서버에 저장해 서버에서 불러오는 것이 아닌 로컬PC에만 저장해 다른PC에서 접속 시 연동이 되지않는다. 이로 인해 수정할때 불러올 이미지가 없기때문에 상품 수정시 무조건 이미지를 수정해야했다.
   
4. 프로젝트 중 어려웠거나 힘들었던 상황, 코드 등등
   - 상품 조회 시 form#select#option에 [아티스트명 입력]을 예시로 보여주는 용도로 썼는데 이 값이 그대로 mapper로 전달되어 해당 조건을 선택하지 않았을 경우인 null이 제대로 작동되지 않았다. option에도 기본값을 주어야하는 것을 배웠다. 
   - 상품 등록 시 이미지가 등록되지 않아 다른 컬럼들도 데이터가 DB로 넘어가는지 확인할 수가 없어 강사님에게 도움을 요청했다. 부트스트랩에 내장된 이미지 등록 기능이 이미지를 base64형태로 인코딩하여 저장하도록 되있었다. 그것을 처리하는 과정을 배웠지만 DB저장과 로컬 파일 저장을 따로       처리해주는 코드는 숙지하지 못했다. 상품 수정은 강사님의 손길이 99%들어가 아쉬웠다.
6. 프로젝트 후기 
    - 하면서 느낀점
      Book을 하면서 MVC흐름은 이해가 갔지만 html,css,js는 여전히 잘 몰랐다. 수업을 한번만 들으면 이해가 안가서 2번은 들어야하는데 book하느라 복습할 시간이 부족했다. 스프링부트에 수업에 들어가고 타임리프나 ajax, js가 뭔지도 잘 모른 상태로 프로젝트를 시작했다. 저번 프로젝트 
      에서 한게 없어 이번에는 뭐라도 하고싶었는데 여전히 무지해서 걱정이 많이 됐다. 부트스트랩에 필요없는 HTML태그를 정리하면서 html의 구조를 알 수 있었지만 타임리프같은 것은 잘 몰라 거의 나경이가 담당했다. 구현하는것에 급해 예외처리는 하나도 해주지 못했다. 지금도 상품을 등록할때        -1000원, 0원이여도 잘 등록된다. 사진을 등록하면 FTP서버로 보내고 그것을 불러오는 식으로 했어야했는데 FTP 이해를 못한 상태로 구현하기 힘들 것 같아서 부트스트랩에 내장된 방법을 쓰려했다. 그런데 base64형태로 저장해 따로 디코딩을해주고 이를 파일에 저장하는 과정을 해줘야했 
      고 폼 한개를 submit하는게 아닌 여러폼을 한번에 submit해줘야해  전혀 감이 잡히질 않아 강사님 손길이 99%첨가된 상품등록이 되었다. 
      최종 프로젝트에 가기 전에 공부해서 사용법을 숙지해야겠다. 다른 팀원들은 본인파트 + 레이아웃까지 일이 굉장히 많았는데 나는 내 파트 하나 끝나는것도 힘들어서 팀적인 기여를 못한 것 같다. 다들 열심히 해줘서 감사했다.
    - 배우고 싶은 기능
      프로젝트가 마무리 단계지만 여전히 타임리프나 js, ajax등의 지식이 부족하고 세션도 무엇인지 모르겠다. FTP서버에 올리고 불러오는 것을 공부해야겠다

### 이용준
1. 구현한 부분 
- 로그인 : 등록된 관리자의 ID,PW 일치여부에 따른 처리
    - 성공시 : adminName님 환영합니다 ajax 처리 및 인덱스 페이지로 리다이렉트
    - 실패시 : 로그인정보가 잘못됬다는 처리 및 다시 로그인페이지로 연결
- 로그아웃: 각 페이지의 상단에 버튼 생성 누르면 세션 초기화하고 로그인 페이지로 연결
- 회원 조회 : 회원의 전체 정보를 조회해온다.
- 회원 삭제 : 탈퇴한 상태인 회원을 확인할 수 있고 탈퇴한 회원에 한해 삭제가 가능하다.
2. 미흡한 부분
    1. 회원 삭제 관련 자동적인 처리구현을 하고 싶었으나 시간이 모자랐습니다. 
    2. 로그인 관련 보안적인 부분이 안전한지를 모르겠습니다.
3. 프로젝트 중 어려웠거나 힘들었던 상황, 코드 등등
- ajax script 연결 하여 조건에 따른 alert문 출력이 어려웠습니다.
4. 프로젝트 후기
- 회원 관리에 대해 관리자가 할 수 있는 기능이 많이 없어서 아쉬웠다.
- bootstrap 사용에 있어서 필요한 부분만 가져다 쓰는 것과 많은 코드중에서 내가 사용할 부분을 찾아서 연동하기가 힘들었다. 특히 지정해 놓은 div를 사용하지 않아 지웠을 때 화면의 기능을 상실하는 부분이 아직 사용에 미숙하다는 생각이 들었다.
- javascript를 통해  함수처리 하는 연습을 좀더 해야할 것 같다.
