package com.kitri.pos.stat;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

public class ViewStatMonth extends JPanel {
	private JTable tableResult;


	public ViewStatMonth() {
		setLayout(null);
		
		// #검색조건 패널#
		JPanel pSetSearch = new JPanel();
		pSetSearch.setLayout(null);
		pSetSearch.setBounds(12, 27, 780, 37);
		add(pSetSearch);
		
		JLabel lbShowDate = new JLabel("조회기간 :");
		lbShowDate.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		lbShowDate.setBounds(12, 0, 101, 37);
		pSetSearch.add(lbShowDate);
		
		JSpinner spinStartYear = new JSpinner();
		spinStartYear.setToolTipText("");
		spinStartYear.setBounds(111, 0, 114, 37);
		pSetSearch.add(spinStartYear);
		
		JLabel lbDash = new JLabel("-");
		lbDash.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		lbDash.setBounds(234, 2, 15, 32);
		pSetSearch.add(lbDash);
		
		JSpinner spinEndYear = new JSpinner();
		spinEndYear.setToolTipText("");
		spinEndYear.setBounds(249, 0, 114, 37);
		pSetSearch.add(spinEndYear);
		
		JButton button = new JButton("조회");
		button.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		button.setBounds(375, 0, 101, 37);
		pSetSearch.add(button);
		
		// #테이블 스크롤 패널#
		JScrollPane spShowTable = new JScrollPane();
		spShowTable.setBounds(12, 74, 554, 451);
		add(spShowTable);
		
		//[테이블]	
		//임시 테이블 모델 생성
		String header[] = {"매출날짜", "매출합계", "순매출", "부가세", "현금매출", "카드매출", "고객수"};
		String contents[][] = {
				{"2010", "632,000", "590,000", "59,000", "230,000", "402,000", "50"},
				{"2011", "632,000", "590,000", "59,000", "230,000", "402,000", "50"},
				{"2012", "632,000", "590,000", "59,000", "230,000", "402,000", "50"},
				{"2013", "632,000", "590,000", "59,000", "230,000", "402,000", "50"},
				{"2014", "632,000", "590,000", "59,000", "230,000", "402,000", "50"},
				{"2015", "632,000", "590,000", "59,000", "230,000", "402,000", "50"},
				{"2016", "632,000", "590,000", "59,000", "230,000", "402,000", "50"},
				{"2017", "632,000", "590,000", "59,000", "230,000", "402,000", "50"},
				{"2018", "632,000", "590,000", "59,000", "230,000", "402,000", "50"},
				{"2019", "632,000", "590,000", "59,000", "230,000", "402,000", "50"}
				};
		
		DefaultTableModel tmodel = new DefaultTableModel(contents, header);
		
		tableResult = new JTable(tmodel);
		spShowTable.setViewportView(tableResult);
		
		// #그래프 패널#
		JPanel pShowGraph = new JPanel();
		pShowGraph.setBounds(578, 74, 554, 451);
		add(pShowGraph);
		
		// #기본 패널#
		// [라디오 버튼]
		ButtonGroup bgp = new ButtonGroup(); //버튼그룹 생성
				
		JRadioButton rdBtnTotalPrice = new JRadioButton("매출합계");
		rdBtnTotalPrice.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		rdBtnTotalPrice.setBounds(800, 41, 105, 23);
		add(rdBtnTotalPrice);
		
		JRadioButton rdBtnNetIncome = new JRadioButton("순매출");
		rdBtnNetIncome.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		rdBtnNetIncome.setBounds(909, 41, 85, 23);
		add(rdBtnNetIncome);
		
		JRadioButton rdBtnCash = new JRadioButton("현금");
		rdBtnCash.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		rdBtnCash.setBounds(998, 41, 65, 23);
		add(rdBtnCash);
		
		JRadioButton rdBtnCard = new JRadioButton("카드");
		rdBtnCard.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		rdBtnCard.setBounds(1067, 41, 65, 23);
		add(rdBtnCard);
		
		//버튼 그룹에 라디오버튼 등록
		bgp.add(rdBtnTotalPrice);
		bgp.add(rdBtnCash);
		bgp.add(rdBtnNetIncome);
		bgp.add(rdBtnTotalPrice);

	}

}
