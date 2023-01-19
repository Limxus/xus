# [KH 파이널 프로젝트] 그룹웨어 - 김부장, 회사를 바꾸다

기간: 2022년 11월 14일 → 2023년 1월 13일
사용한 기술: JAVA, HTML, css, JavaScript, ajax, mybatis, Spring, websocket, MailSender
한줄소개: 그룹웨어

## 🐈‍⬛ git

[https://github.com/Woooooon/sixman](https://github.com/Woooooon/sixman)

![Untitled](%5BKH%20%E1%84%91%E1%85%A1%E1%84%8B%E1%85%B5%E1%84%82%E1%85%A5%E1%86%AF%20%E1%84%91%E1%85%B3%E1%84%85%E1%85%A9%E1%84%8C%E1%85%A6%E1%86%A8%E1%84%90%E1%85%B3%5D%20%E1%84%80%E1%85%B3%E1%84%85%E1%85%AE%E1%86%B8%E1%84%8B%E1%85%B0%E1%84%8B%E1%85%A5%20-%20%E1%84%80%E1%85%B5%E1%86%B7%E1%84%87%E1%85%AE%E1%84%8C%E1%85%A1%E1%86%BC,%20%E1%84%92%E1%85%AC%E1%84%89%E1%85%A1%E1%84%85%209ddf0550846d4bcf894f23d9186708da/Untitled.png)

<aside>
👉 Spring 프레임워크와 mybatis의 사용을 통해 webapp을 제작할 수 있다
또한 Spring의 MVC 모델을 이해한다

</aside>

## 👨‍💻 내 구현기능

- 공지사항
    - 공지사항 등록
    - 공지사항 수정
    - 공지사항 중요도 상단고정
    - 공지사항 배너
- 메신저
    - 사원목록 확인
    - 사원 즐겨찾기
    - 프로필확인
    - 채팅방 생성 1:1, 다수
    - 채팅방 검색
    - 채팅방 상단고정
    - 채팅방 알람 설정
    - 파일 보관함
    - 파일 전송
    - 메세지 읽은 사람 확인
- 알람
    - 실시간 알람
- 메일
    - 메일 작성
    - 메일 파일 첨부
    - 카테고리 등록
    - 카테고리 분류
    - 메일 삭제
    - 메일 수정
    - 메일 휴지통 비우기
    - gmail SMTP 등록
- 전자결재
    - 결재선 등록
    - 결재선 지정
    - 전자문서 작성
    - 결재 처리
    - 반려 처리

💭 소감 

mybatis를 통한 동적쿼리를 작성하고 pl/sql, merge, insertAll 등 다양한 sql문을 사용해 보았다.

또한 Spring에서의 디펜던시와 빈등록에대해서 조금 더 이해하고
웹소켓을 통한 실시간 데이터전송을 해볼 수 있었다.

## 💬 코드리뷰

```jsx
const searchInput = document.querySelector('#search-box input');

// 검색하는 인풋박스에 엔터키(keyCode == 13)를 누르면 seach 함수가 동작하게하고 현재 onchange를 초기화
function setSearch() {
    searchInput.onkeyup = (e)=>{
        if(e.keyCode != 13){
            return;
        }
        search();
    };
    searchInput.onchange = null;
}

// 내가원하는 요소를 선택하는 함수
function selectRange(obj) {
    if (window.getSelection) {
        var selected = window.getSelection();
            selected.selectAllChildren(obj);
    } else if (document.body.createTextRange) {
        var range = document.body.createTextRange();
            range.moveToElementText(obj);
            range.select();
    }
}

function search() {
    if(searchInput.value==null||searchInput.value==''){
        return;
    }

    const msgs = document.querySelectorAll('.chat-msg');
    const findMsgs = [];

		// 나와있는 모든 메세지 중 검색값과 일치하면 findMsgs 배열에 담아준다
    for (let index = msgs.length-1; index >= 0; index--) {
        const element = msgs[index];
        const text = element.innerText;

        if(text.includes(searchInput.value)){
            findMsgs.push(element);
        }
    }

    if(findMsgs.length==0){
        return;
    }

		// 가장첫번째 일치하는 내용을 선택하고 화면을 해당 요소가 있는곳으로 스크롤시켜준다
    const firstElement = findMsgs[0];
    selectRange(firstElement);
    chatMain.scrollTop = firstElement.offsetTop - 400;

		// 이후 동일한 상태에서 엔터키를 누르게되면 다음요소를 선택할 수 있도록 설정하였다.
    let i = 1;
    searchInput.onkeyup = (e)=>{
        if(e.keyCode != 13) return;
        if(i >= findMsgs.length) return;

        const nextElement = findMsgs[i];
        selectRange(nextElement);
        chatMain.scrollTop = nextElement.offsetTop - 400;

        i++;
    };

		// 혹시 인풋박스에 다른 벨류가 들어가게 된다면 onkeyup 이벤트를 초기화시켜주는 setSearch를 실행한다.
    searchInput.onchange = ()=>{
        setSearch();
    }
}
```

채팅방 대화내용 검색기능

실제 카카오톡등 다양한 메신저처럼 대화내용을 검색하고 해당 내용을 보여주는 기능을 구현하고 싶었다. 모든 대화내용을 불러와서 찾는 값이 있는지 판단하고 선택처리 및 화면이동을 시켜주었고

이후 엔터를 매번칠때마다 다음 내용을 찾았으면 좋겠어서 keyup 이벤트를 주었다 대신 사용자가 다른값을 입력한후 엔터를 쳤을때는 새로운 검색이 이루어져야해서 change 이벤트로 keyup 이벤트를 초기화시켜주는 코드를 추가하였다.

```java
package com.kh.sixman.chat.handler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import com.kh.sixman.chat.service.ChatService;
import com.kh.sixman.chat.vo.ChatRoomVo;
import com.kh.sixman.member.vo.MemberVo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ChatHandler extends TextWebSocketHandler{

	// 현재 접속한 사람들을 회원번호와 WebSocketSession으로 저장
	private Map<String, WebSocketSession> userSessionsMap = new HashMap<String, WebSocketSession>();
	
	// HttpSessionHandshakeInterceptor를 이용하여 HttpSession의 정보를 Map으로 리턴하는 메서드
	private Map<String, Object> getHTTPSession(WebSocketSession session) {
		Map<String, Object> httpSession = session.getAttributes();
		return httpSession;
	}
	
	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		Map<String, Object> httpSession = getHTTPSession(session);
		MemberVo curMember = (MemberVo)httpSession.get("loginMember");
		if(curMember==null) return; 
				
		log.info("Chat Socket 연결");
		log.info("id : " + session.getId());

		userSessionsMap.put(curMember.getNo(), session);		

		// 누군가 접속했을 시 같은 채팅방에 있는 사람들에게 방금 접속한사람의 마지막 접속시간을 전달		
		ChatRoomVo curRoom = (ChatRoomVo) httpSession.get("room");
		
		Set<String> keySet = userSessionsMap.keySet();
		for(String key : keySet) {
			
			if(key.equals(curMember.getNo())) continue;
			
			WebSocketSession memberWS = userSessionsMap.get(key);
			Map<String, Object> memberHS = getHTTPSession(memberWS);
			
			// 채팅방 접속시 컨트롤러쪽에서 접속한 채팅방의 정보를 session에 담아주고있다.
			ChatRoomVo roomVo = (ChatRoomVo) memberHS.get("room");
			if(roomVo==null) continue;
			
			String room = roomVo.getChatRoomNo();
			
			if(room.equals(curRoom.getChatRoomNo())) {
				memberWS.sendMessage(new TextMessage("#####"+curRoom.getBeforeJoin()));
			}
		}
	}
	
	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		Map<String, Object> httpSession = getHTTPSession(session);
		MemberVo curMember = (MemberVo)httpSession.get("loginMember");
		
		log.info("Chat Socket 종료");
		log.info("id : " + session.getId());
		
		if(curMember!=null) {
			userSessionsMap.remove(curMember.getNo());			
		}
	}
	
	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		log.info("chat {}로부터 받은 메세지 {}", session.getId(), message.getPayload());
		
		Map<String, Object> httpSession = getHTTPSession(session);
		ChatRoomVo curRoom = (ChatRoomVo)httpSession.get("room"); //보낸사람 채팅방정보
		List<MemberVo> members = curRoom.getMembers(); //보낸사람 채팅방의 맴버들
		
		// 메세지 형태 "보낸사람번호#보낸사람이름#방번호#메세지#날짜"
		String msg = message.getPayload();
		String msgs[] = msg.split("#");
		
		String roomNo = msgs[2];	
		
		// 나를제외한 채팅방 인원 중 접속중인 사람을 위해 미리 -1 하였다.
		int inMemberCount = -1;
		
		//현재 접속해있는 사람들 중 나를 포함한 같은 채팅방에 접속한 사람을 담을 리스트
		List<WebSocketSession> sessions = new ArrayList<>();
		
		Set<String> keySet = userSessionsMap.keySet();
		for(String key : keySet) {
			WebSocketSession memberWS = userSessionsMap.get(key);
			Map<String, Object> memberHS = getHTTPSession(memberWS);
			
			ChatRoomVo roomVo = (ChatRoomVo) memberHS.get("room"); //다른사람 접속한 룸 정보
			String room = roomVo.getChatRoomNo();
			
			if(room.equals(roomNo)) {
				inMemberCount++;
				sessions.add(memberWS);
			}
		}
		
		// 메세지 끝에 총인원 중 접속하지않은사람을 추가로 보내준다. 이후 채팅옆 읽은지않은사람 숫자를 표기할때 사용
		TextMessage text = new TextMessage(msg+"#"+(members.size()-inMemberCount));
		
		//따로 추가된 list에서만 반복문을 사용
		for(WebSocketSession ss : sessions) {
			ss.sendMessage(text);			
		}
	}

}
```

실시간 채팅을위한 웹소켓 사용 코드

누군가가 접속하면 접속한사람들을 map에 담아주고

동시에 같은 채팅방에 접속해있는사람들의 채팅방에서 읽음표시 (채팅 옆 숫자) 가 줄어들어야 하기때문에 해당 인원의 이전 접속시간을 전달한다. 

이후 js 쪽에선

```jsx
//전달받은 접속시간 == date
function chatCountDown(date) {
				// 모든 채팅 카운트 (채팅 옆 숫자)에는 date라는 속성을 추가해 주었다 안에는 해당 메세지가 전달된 날짜가 저장되어있다.
        const counts = document.querySelectorAll('.chat-count');
        const beforeDate = new Date(date);
        counts.forEach(element => {
            const eDate = new Date(element.getAttribute("date"));

            if(eDate > beforeDate){
                if(parseInt(element.innerHTML) - 1 > 0){
                element.innerHTML = parseInt(element.innerHTML) - 1;
                }else{
                    element.innerHTML = '';
                }
            }
        });
    }
```

---

```xml
<!-- fileMapper 중  -->
<update id="insertAll">
		INSERT ALL
		<foreach collection="list" item="vo" separator=" ">
			INTO ${tableName}_A
		(
			"NO",
			"ORIGIN_NAME",
			"${tableName}_NO",
			"CHANGE_NAME",
			"FILE_PATH",
			"ENROLL_DATE"
		)
		VALUES
		(
			get_seq_no('seq_${tableName}_no'),
			#{vo.originName},
			${vo.subNo},
			#{vo.changeName},
			#{vo.filePath},
			SYSDATE
		)
		</foreach>
		select * from dual
	</update>
```

기획당시  모든 첨부파일  테이블 구조를 통일시켜서 이후 쿼리문에서 테이블명만 따로 받아오면 동일한 sql문을 사용할 수 있도록 만든 동적쿼리

insert all에서 시퀀스 번호가 증가하지 않는 문제가 발생하여 sql 함수를 제작하여 사용하였다.

```sql
create or replace function get_seq_no ( seq in varchar2 ) 
return number is num number;
begin
   execute immediate 
  'select ' || seq || '.nextval
         from dual'
         into num;
   return num;
end;
```