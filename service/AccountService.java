package service;

import domain.AccountBean;


/**
 * @author JeongUk-Bae
 * @date 2018. 12. 26.
 * @desc 은행계좌 
 */
public interface AccountService {
	//String accountNum, today;
	//int money;
	
	/**
	 * CREATE
	 * */
	public AccountBean[] createAccountNum(int money); //신규생성
	public AccountBean[] makeAccountNum(); //계좌생성
	
	/**
	 * READ
	 * */
	public AccountBean[] findByAccountNumInMoney(String accountNum); //계좌 금액 확인
	public int countAccount();
	public boolean existAccount(String accountNum);
	public AccountBean[] findByTodayWithdraw(String today);//지정날짜 출금확인
	public AccountBean[] findByTodayDeposit(String today);//지정날짜 입금확인
	
	public AccountBean today(); 
	
	
	/**
	 * UPDATE
	 * */
	public void withdrawMoney(int money); //출금
	public void depositMoney(int money); //입금
	
	/**
	 * DELETE
	 * */
	public void deleteAccountNum(String id, String pass);
	
}
