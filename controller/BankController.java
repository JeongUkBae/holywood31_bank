package controller;

import javax.swing.JOptionPane;

import domain.MemberBean;
import service.MemberService;
import service.MemberServiceImpl;


public class BankController {
	public void start() {
		MemberBean memberBean = null;
		MemberService memberService = new MemberServiceImpl();
		while(true) {
			switch(JOptionPane.showInputDialog("[메뉴] 0.종료 \n"
					+ "1.회원가입 2.회원목록조회 3.이름으로 ID찾기 4.ID로 가입자 찾기\n"
					+ "5.이름과 주민번호로 찾기 6.로그인 7.비밀번호변경 8.회원탈퇴")) {
			case "0" : JOptionPane.showMessageDialog(null,"종료합니다.");
				return;
			case "1" : 
				memberService.createMember(JOptionPane.showInputDialog("ID입력"),
						JOptionPane.showInputDialog("이름입력"),
						JOptionPane.showInputDialog("주민번호입력"),
						JOptionPane.showInputDialog("비밀번호입력"));
				JOptionPane.showMessageDialog(null,"가입이 완료 되었습니다.");
				break;
			case "2" : 
				JOptionPane.showMessageDialog(null,memberService.findByAll());
				break;
			case "3" : 
				JOptionPane.showMessageDialog(null,memberService.findByName(
						JOptionPane.showInputDialog("찾으실 이름을 입력하세요. ")));
				break;
			case "4" :
				JOptionPane.showMessageDialog(null, memberService.findById(
						JOptionPane.showInputDialog("찾으실 ID를 입력하세요.")));
				break;
			case "5" :
				JOptionPane.showMessageDialog(null,memberService.findBySsn(
						JOptionPane.showInputDialog("이름을 입력하세요."),
						JOptionPane.showInputDialog("주민번호를 입력하세요")));
				break;
			case "6" :
				boolean ch  = memberService.existMember(JOptionPane.showInputDialog("ID입력"),
						JOptionPane.showInputDialog("비밀번호입력"));
				JOptionPane.showMessageDialog(null, (ch)? "로그인성공" : "로그인실패");
				break;
			case "7" :
				memberService.changePass(JOptionPane.showInputDialog("아이디입력"),
						JOptionPane.showInputDialog("비밀번호입력"),
						JOptionPane.showInputDialog("새로운 비밀번호 입력"));
				break;
			case "8":
						
				String id = JOptionPane.showInputDialog("아이디입력");
				String pass = JOptionPane.showInputDialog("비밀번호입력");
				memberService.deleteMember(id, pass);
			
				break;
			}
		}
	}//area
}//field
