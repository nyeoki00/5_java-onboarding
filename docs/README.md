### 기능구현
#### 문제1
1. 포비, 크롱 리스트 0번(왼쪽 페이지)에 저장된 숫자를 하나씩 쪼개기
   - String 배열로 받은 후에 하나씩 리스트에 넣기?? 혹은 다른 효율적인 방법이 있을지 생각
   - int 배열에 10으로 나눠서 나머지 값 저장??
2. 쪼갠 숫자를 각각 `[이름]LeftAddResult`, `[이름]MulLeftResult`에 저장(총 변수 4개)
3. 포비, 크롱 리스트 1번(오른쪽 페이지)에 저장된 숫자를 하나씩 쪼개기
    - 문자 배열로 받은 후에 하나씩 리스트에 넣기?? 혹은 다른 효율적인 방법이 있을지 생각
4. 쪼갠 숫자를 각각 `[이름]RightAddResult`, `[이름]MulRightResult`에 저장(총 변수 4개)
5. 포비, 크롱 별로 2, 4에서 정의한 변수 비교하여 큰 값을 `[이름]Max`에 저장
    - `Math.max()` 사용
6. 값 비교하여 알맞은 값을 answer에 저장
   - `[이름]Max` 값이 같다면 0, 포비가 이기면 1, 크롱이 이기면 2
7. 포비, 크롱의 `짝수 페이지` - `홀수 페이지`가 1이 아닐 경우 -1 반환
