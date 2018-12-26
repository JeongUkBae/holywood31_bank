package service;

import domain.MemberBean;

/**
 * @author JeongUk-Bae
 * @date 2018. 12. 26.
 * @desc 맴버기능구현
 */
public class MemberServiceImpl implements MemberService {
	private MemberBean[] members;
	private int count;
	MemberServiceImpl(){
		members = new MemberBean[10];
		count = 0;
	}
	/**
	 * CREATE
	 * */
	@Override
	public void createMember(String id, String name, String ssn, String pass) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public MemberBean[] findByAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public MemberBean[] findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public MemberBean findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public MemberBean[] findBySsn(String name, String ssn) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public MemberBean checkPass(String id, String pass) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int countMember() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean existMember(String id, String pass) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void changePass(String id, String pass, String newpass) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteMember(String id, String pass) {
		// TODO Auto-generated method stub
		
	}


}
