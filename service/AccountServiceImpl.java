package service;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Random;

import domain.AccountBean;

/**
 * @author JeongUk-Bae
 * @date 2018. 12. 26.
 * @desc 은행계좌 구현객체
 */
public class AccountServiceImpl implements AccountService {
	private ArrayList<AccountBean> list;
	
	public AccountServiceImpl() {
		list = new ArrayList<>();
		
	}
/***********************************************
 * CREATE
 ***********************************************/
	
	@Override
	public void createAccountNum(int money) {
		AccountBean accountBean = new AccountBean();
		accountBean.setAccountNum(createAccountNum());
		accountBean.setMoney(money);
		accountBean.setToday(findDate());
		list.add(accountBean);
		
	}

	/***********************************************
	 * READ
	 ***********************************************/
	@Override
	public String createAccountNum() {
		String accountNum = "";
		Random random = new Random();
		for(int i=0; i<10; i++) {
			if(i==2) {
				accountNum += random.nextInt(10)+"-";
			} else {
				accountNum += random.nextInt(10);
			}
		}
		return accountNum;
	}
	@Override
	public ArrayList<AccountBean> findByAll() {
		// TODO Auto-generated method stub
		return list;
	}
	
	@Override
	public AccountBean findByAccountNem(String accountNum) {
		AccountBean accountBean = new AccountBean();
		for(int i=0; i<list.size();i++) {
			if(list.get(i).getAccountNum().equals(accountNum)) {
				accountBean = list.get(i);
			}
		}
		return accountBean;
	}

	@Override
	public int countAccount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public boolean existAccount(String accountNum) {
		boolean checkNum = false;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getAccountNum().equals(accountNum)) {
				checkNum = true;
			}
		}
		return checkNum;
	}

	@Override
	public String findDate() {
		String today="";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		today = sdf.format(date);
		
		return today;
	}
	@Override
	public AccountBean today() {
		// TODO Auto-generated method stub
		return null;
	}
	/***********************************************
	 * UPDATE
	 ***********************************************/
	@Override
	public void withdrawMoney(String accountNum, int money) {
		AccountBean accountBean = new AccountBean();
		for(int i=0; i<list.size(); i++) {
			if(existAccount(accountNum)) {
				
			} else {
				
			}
		}
	}

	@Override
	public void depositMoney(int money) {
		// TODO Auto-generated method stub
		
	}
	/***********************************************
	 * DELETE
	 ***********************************************/
	@Override
	public void deleteAccountNum(String id, String pass) {
		// TODO Auto-generated method stub
		
	}





}
