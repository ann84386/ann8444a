package main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TuDien {
	private Map<String, String> duLieu = new TreeMap<String, String>();

	public TuDien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TuDien(Map<String, String> duLieu) {
		super();
		this.duLieu = duLieu;
	}
	
	public String themTu(String tuKhoa, String yNghia) {
		return this.duLieu.put(tuKhoa, yNghia);
	}
	
	public String xoaTu(String tuKhoa) {
		return this.duLieu.remove(tuKhoa);
	}
	public String traTu(String tuKhoa) {
		return this.duLieu.get(tuKhoa);
	}
	public void inTuKhoa() {
		Set<String> tapHopTuKhoa =  this.duLieu.keySet();
		System.out.println(Arrays.toString(tapHopTuKhoa.toArray()));
	}
	public int laySoLuong() {
		return this.duLieu.size();
	}
	public void xoaTatCa() {
		this.duLieu.clear();
	}
	
	
	public static void main(String[] args) {	
		Scanner sc =new Scanner(System.in);
		int luaChon = 0;
		TuDien td = new TuDien();
		td.themTu("Hi", "Xin chào");
		td.themTu("Sleep", "Ngủ");
		td.themTu("Eat", "Ăn");
		do {
			System.out.println("MENU-------------");
			System.out.println("1. Thêm từ");
			System.out.println("2. Xóa từ");
			System.out.println("3. Tra cứu ý nghĩa");
			System.out.println("4. In danh sách từ khóa");
			System.out.println("5. In số lượng từ");
			System.out.println("6. Xóa tất cả");
			System.out.println("0. Thoát chương trình");
			luaChon = sc.nextInt();
			
			String giaTri = sc.nextLine();
			if(luaChon == 1) {
				System.out.print("Nhập từ khóa:");
				String tuKhoa = sc.nextLine();
				System.out.print("Nhập ý nghĩa:");
				String yNghia = sc.nextLine();
				td.themTu(tuKhoa, yNghia);
			}else if(luaChon == 2) {
				System.out.print("Nhập từ khóa:");
				String tuKhoa = sc.nextLine();
				td.xoaTu(tuKhoa);
			}else if(luaChon==3){
				System.out.print("Nhập từ khóa:");
				String tuKhoa = sc.nextLine();
				System.out.println(td.traTu(tuKhoa));
			}else if(luaChon==4) {
				td.inTuKhoa();
			}else if(luaChon==5) {
				System.out.println(td.laySoLuong());
			}else if(luaChon == 6) {
				td.xoaTatCa();
			}
		}while(luaChon != 0);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
