# 데이터베이스 정보
spring.datasource.driver-class-name = com.mysql.cj.jdbc.Driver
spring.datasource.url = jdbc:mysql://localhost:3306/youngronet?serverTimezone=Asia/Seoul
spring.datasource.username = youngronet_user
spring.datasource.password = 0213
## JPA를 통하여 쿼리문 확인 가능 여부
spring.jpa.show-sql = true
## DDL 작성 여부 : create, update, validate, none
spring.jpa.hibernate.ddl-auto = update
## Query 가동성 향상을 위한 포멧 설정 여부
spring.jpa.properties.hibernate.format_sql = true