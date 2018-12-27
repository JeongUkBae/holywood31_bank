package service;

import java.util.HashMap;

import domain.ArticleBean;

public class ArticleServiceImpl implements ArticleService {
	private HashMap<String, ArticleBean> map;
	private int seq;
	public ArticleServiceImpl() {
		map = new HashMap<>();
		seq = 0;
	}
	
	@Override
	public void createArticle( String title, String content, String writer,String pass) {
		ArticleBean articleBean = new ArticleBean();
		articleBean.setTitle(title);
		articleBean.setContent(content);
		articleBean.setWriter(writer);
		articleBean.setPass(pass);
//		articleBean.setSeq(String.valueOf(seq));
		articleBean.setRedDate(this.createDate());
//		map.put(articleBean.getSeq(), articleBean);
		seq++;
	}


	@Override
	public HashMap<String, ArticleBean> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashMap<String, ArticleBean> findByWriter(String writer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArticleBean findBytitle(int seq) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String createDate() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int countSeq(int seq) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existContent(String content, String writer, String pass) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateContent(String title, String writer, int seq, String pass) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletecontent(String title, String pass) {
		// TODO Auto-generated method stub

	}



}
