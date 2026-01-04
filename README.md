# 📚 Book Review Project (도서 리뷰 사이트)

사용자가 읽은 책에 대한 정보를 기록하고 관리할 수 있는 간단한 **CRUD 웹 애플리케이션**입니다.  
Spring Boot와 JPA를 학습하며 데이터 흐름(DTO ↔ Entity)과 RESTful한 설계 원칙을 적용해 제작되었습니다.

---

## 🖥️ 프로젝트 실행 화면
<img width="1204" height="537" alt="image" src="https://github.com/user-attachments/assets/f45b9bd5-bbef-4891-907f-a15f2e6a78e8" />

---

## 📊 데이터베이스 설계 (ERD)
프로젝트는 단일 테이블 구조로 구성되어 있으며, 도서 정보와 리뷰 내용을 효율적으로 저장합니다.

<img width="343" height="344" alt="Untitled (1)" src="https://github.com/user-attachments/assets/ee790251-3d22-429b-a337-6f709cfcca90" />

| 컬럼명 | 타입 | 설명 |
| :--- | :--- | :--- |
| **id** | Long | 고유 번호 (PK, Auto Increment) |
| **title** | String | 책 제목 (필수) |
| **author** | String | 저자 이름 |
| **content** | String | 감상평 및 리뷰 상세 내용 |
| **rating** | Integer | 별점 평점 (1~5) |
| **created_at** | LocalDateTime | 작성일시 (JPA Auditing 활용) |

---

## 🛣️ API 설계 (Endpoints)
도서 리뷰 관리를 위해 다음과 같은 REST 기반의 API 노선을 설계했습니다.

| 기능 | HTTP Method | URL | 설명 |
| :--- | :--- | :--- | :--- |
| **Create** | `POST` | `/reviews/create` | 입력받은 폼 데이터를 DB에 저장 |
| **Read** | `GET` | `/reviews` | 전체 도서 리뷰 목록 조회 |
| **Read** | `GET` | `/reviews/{id}` | 특정 도서 리뷰 상세 정보 확인 |
| **Update** | `POST` | `/reviews/update` | 기존 리뷰 정보 수정 |
| **Delete** | `POST` | `/reviews/{id}/delete` | 특정 리뷰 데이터 삭제 |

---

## ✨ 주요 학습 포인트
* **MVC 패턴의 이해**: Model(Entity/DTO), View(Mustache), Controller의 역할 분담 및 데이터 흐름 제어.
* **데이터 바인딩 및 에러 처리**: HTML Form 데이터를 DTO로 수집하고, 수정 시 `id` 값이 누락되어 발생하는 `InvalidDataAccessApiUsageException` 예외 해결.
* **JPA Auditing**: `@CreatedDate`를 사용하여 데이터 생성 시점을 자동으로 기록하는 기능 구현.
* **UI/UX 개선**: Bootstrap 5를 활용하여 Header/Footer 레이아웃을 분리하고 반응형 디자인 적용.

---

## 🛠️ 기술 스택
* **Backend**: Java 17, Spring Boot 3.x, Spring Data JPA
* **Frontend**: Mustache, Bootstrap 5
* **Database**: H2 Database (In-Memory)
* **Build Tool**: Gradle

---

## 🚀 시작하기
1. 이 저장소를 Clone 합니다.
2. `src/main/resources/import.sql`에 설정된 초기 더미 데이터를 확인합니다.
3. 애플리케이션을 실행한 후 브라우저에서 `http://localhost:8080/reviews`에 접속합니다.
4. DB 현황은 `http://localhost:8080/h2-console`에서 확인할 수 있습니다.
