/**
 * 
 */
package codechef;

import java.util.Scanner;

/**
 * @author kailash.prajapati
 *
 */
public class LOC172 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb= new Scanner(System.in);
		int height_axis= kb.nextInt();
		int width_axis=kb.nextInt();
				
		while( height_axis!=-1 && width_axis!=-1){
			int robots_count=kb.nextInt();
			int[] x_coordinate= new int[robots_count];
			int[] y_coordinate= new int[robots_count];
			int[] D_travel_by_robot=new int[robots_count];
			int i=0;	
			while(robots_count-->0){
				x_coordinate[i]=kb.nextInt();
				y_coordinate[i]=kb.nextInt();
				D_travel_by_robot[i]=kb.nextInt();
				i++;				
			}
			int count=1;//the maximum number of pizzas Vaibhav will be able to get from the location he choses
			for(i=0;i<robots_count;i++){
				{
					
					
				}
			}
			
			
		}

	}

}
