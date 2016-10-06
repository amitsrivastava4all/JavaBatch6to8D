package com.bmpl.question.dto;

public class WishDTO {
	int x[] = new int[10];
	private ItemDTO items[] = new ItemDTO[10];
	private int currentWish = 0;
	public void addItemToWish(ItemDTO itemDTO){
		if(items.length>currentWish){
			items[currentWish]=itemDTO;
			currentWish++;
		}
		else
		{
			System.out.println("Can't Add More Wishes..");
		}
	}
	public void printWishList(){
		if(items.length>0){
//			for(int i = 0 ;i<items.length; i++){
//				ItemDTO item = items[i];
//				System.out.println(item.getId()+" "+item.getName()+" "+item.getPrice());
//			}
			for(ItemDTO item: items){
				System.out.println(item.getId()+" "+item.getName()+" "+item.getPrice());
			}
		}
	}

}
