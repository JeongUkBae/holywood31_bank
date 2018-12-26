package service;

import domain.AccountBean;

/**
 * @author JeongUk-Bae
 * @date 2018. 12. 26.
 * @desc 은행계좌 구현객체
 */
public class AccountServiceImpl implements AccountService {

	@Override
	public AccountBean[] createAccountNum(int money) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountBean[] makeAccountNum() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountBean[] findByAccountNumInMoney(String accountNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countAccount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existAccount(String accountNum) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public AccountBean[] findByTodayWithdraw(String today) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountBean[] findByTodayDeposit(String today) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountBean today() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void withdrawMoney(int money) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositMoney(int money) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAccountNum(String id, String pass) {
		// TODO Auto-generated method stub
		
	}


}
