import java.util.*;
class Example1{
	public final static void clearConsole() {
		try {
			final String os = System.getProperty("os.name");
			if (os.contains("Windows")) {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} else {
			System.out.print("\033[H\033[2J");
			System.out.flush();
			}
		} catch (final Exception e) {
		e.printStackTrace();
	// Handle any exceptions.
		}
	}
	public static void bestInDBMS(Scanner scan,String[] id,String[] name,int[] pMarks,int[] dMarks,int[] total,double[] avg,int[] rank,int x){
		for(int i = 0; i<170; i++){
				System.out.print('-');
			}
				System.out.println();
				System.out.println("|                                                    	        BEST IN DATABASE MANAGEMENT SYSTEM	                                             			 |");
		for(int i = 0; i<170; i++){
				System.out.print('-');
			}
		String[] temPId   =new String[id.length];
		String[] temPName =new String[id.length]; 
		int[] temPpMarks     =new int[id.length];
		int[] temPdMarks     =new int[id.length];
		
		for(int i=0; i<id.length; i++){
			temPId[i]  =id[i];
			temPName[i]=name[i];
			temPpMarks[i] =pMarks[i];
			temPdMarks[i] =dMarks[i];
		}
		for(int i=0; i<id.length-1; i++){
			for(int j=0; j<id.length-1; j++){
				if(temPdMarks[j]<temPdMarks[j+1]){
					String tempId   =temPId[j];
					temPId[j]   =temPId[j+1];
					temPId[j+1] =tempId;
					
					String tempName =temPName[j];
					temPName[j]  =temPName[j+1]; 
					temPName[j+1]=tempName; 
					
					int temp1      =temPpMarks[j];
					temPpMarks[j]  =temPpMarks[j+1];
					temPpMarks[j+1]=temp1;
					
					int temp2      =temPdMarks[j];
					temPdMarks[j]  =temPdMarks[j+1] ;
					temPdMarks[j+1]=temp2;
				}
			}
		}
		
		while(true){
			System.out.print("\n\n+");
		for(int i=0; i<8; i++){
			System.out.print("-");
		}
		System.out.print("+");
		for(int i=0; i<20; i++){
			System.out.print("-");
		}
		System.out.print("+");
		for(int i=0; i<12; i++){
			System.out.print("-");
		}
		System.out.print("+");
		for(int i=0; i<12; i++){
			System.out.print("-");
		}
		System.out.print("+\n");
		
		System.out.printf("|%-8s|%-20s|%-12s|%-12s|\n","ID","Name","DBMS Marks","PF Marks");
		
		System.out.print("+");
		for(int i=0; i<8; i++){
			System.out.print("-");
		}
		System.out.print("+");
		for(int i=0; i<20; i++){
			System.out.print("-");
		}
		System.out.print("+");
		for(int i=0; i<12; i++){
			System.out.print("-");
		}
		System.out.print("+");
		for(int i=0; i<12; i++){
			System.out.print("-");
		}
		System.out.print("+\n");
		
		for(int i=0; i<temPdMarks.length; i++){
			if(temPdMarks[i]>0){
				System.out.printf("|%-8s|%-20s|%-12d|%-12d|\n",temPId[i],temPName[i],temPdMarks[i],temPpMarks[i]);
			}
		}
		
		System.out.print("+");
		for(int i=0; i<8; i++){
			System.out.print("-");
		}
		System.out.print("+");
		for(int i=0; i<20; i++){
			System.out.print("-");
		}
		System.out.print("+");
		for(int i=0; i<12; i++){
			System.out.print("-");
		}
		System.out.print("+");
		for(int i=0; i<12; i++){
			System.out.print("-");
		}
		System.out.print("+\n");
			
			System.out.print("\n\nDo you want to go back to main menu? (y/n) :");
			char answer=scan.next().charAt(0);
			if(answer=='y'){
				menu(scan,id,name,pMarks,dMarks,total,avg,rank,x);
			}
		}
	}
	public static void bestInPRF(Scanner scan,String[] id,String[] name,int[] pMarks,int[] dMarks,int[] total,double[] avg,int[] rank,int x){
		for(int i = 0; i<170; i++){
				System.out.print('-');
			}
				System.out.println();
				System.out.println("|                                                    	        BEST IN PROGRAMMING FUNDAMENTALS	                                             			 |");
		for(int i = 0; i<170; i++){
				System.out.print('-');
			}
		String[] temPId   =new String[id.length];
		String[] temPName =new String[id.length]; 
		int[] temPpMarks     =new int[id.length];
		int[] temPdMarks     =new int[id.length];
		
		for(int i=0; i<id.length; i++){
			temPId[i]  =id[i];
			temPName[i]=name[i];
			temPpMarks[i] =pMarks[i];
			temPdMarks[i] =dMarks[i];
		}
		for(int i=0; i<id.length-1; i++){
			for(int j=0; j<id.length-1; j++){
				if(temPpMarks[j]<temPpMarks[j+1]){
					String tempId   =temPId[j];
					temPId[j]   =temPId[j+1];
					temPId[j+1] =tempId;
					
					String tempName =temPName[j];
					temPName[j]  =temPName[j+1]; 
					temPName[j+1]=tempName; 
					
					int temp1      =temPpMarks[j];
					temPpMarks[j]  =temPpMarks[j+1];
					temPpMarks[j+1]=temp1;
					
					int temp2      =temPdMarks[j];
					temPdMarks[j]  =temPdMarks[j+1] ;
					temPdMarks[j+1]=temp2;
				}
			}
		}
		
		while(true){
			
			System.out.print("\n\n+");
		for(int i=0; i<8; i++){
			System.out.print("-");
		}
		System.out.print("+");
		for(int i=0; i<20; i++){
			System.out.print("-");
		}
		System.out.print("+");
		for(int i=0; i<12; i++){
			System.out.print("-");
		}
		System.out.print("+");
		for(int i=0; i<12; i++){
			System.out.print("-");
		}
		System.out.print("+\n");
		
		System.out.printf("|%-8s|%-20s|%-12s|%-12s|\n","ID","Name","PF Marks","DBMS Marks");
		
		System.out.print("+");
		for(int i=0; i<8; i++){
			System.out.print("-");
		}
		System.out.print("+");
		for(int i=0; i<20; i++){
			System.out.print("-");
		}
		System.out.print("+");
		for(int i=0; i<12; i++){
			System.out.print("-");
		}
		System.out.print("+");
		for(int i=0; i<12; i++){
			System.out.print("-");
		}
		System.out.print("+\n");
		
		for(int i=0; i<temPpMarks.length; i++){
			if(temPpMarks[i]>0){
				System.out.printf("|%-8s|%-20s|%-12d|%-12d|\n",temPId[i],temPName[i],temPpMarks[i],temPdMarks[i]);
			}
		}
		
		System.out.print("+");
		for(int i=0; i<8; i++){
			System.out.print("-");
		}
		System.out.print("+");
		for(int i=0; i<20; i++){
			System.out.print("-");
		}
		System.out.print("+");
		for(int i=0; i<12; i++){
			System.out.print("-");
		}
		System.out.print("+");
		for(int i=0; i<12; i++){
			System.out.print("-");
		}
		System.out.print("+\n");
			
			System.out.print("\n\nDo you want to go back to main menu? (y/n) :");
			char answer=scan.next().charAt(0);
			if(answer=='y'){
				menu(scan,id,name,pMarks,dMarks,total,avg,rank,x);
			}
		}
	}	
	public static void printStudentRanks(Scanner scan,String[] id,String[] name,int[] pMarks,int[] dMarks,int[] total,double[] avg,int[] rank,int x){
		for(int i = 0; i<170; i++){
				System.out.print('-');
			}
				System.out.println();
				System.out.println("|                                                    	        PRINT STUDENT RANKS			                                             			 |");
		for(int i = 0; i<81; i++){
				System.out.print('-');
			}
		String[] temPId   =new String[id.length];
		String[] temPName =new String[id.length]; 
		int[] temPtotal      =new int[id.length];
		double[] temPavg     =new double[id.length];
		int[] temPrank       =new int[id.length];
		
		for(int i=0; i<id.length; i++){
			int count=1;
			for(int j=0; j<id.length; j++){
				if(total[j]>total[i]){
					count++;
				}
			}
			rank[i]=count;
		}
		
		for(int i=0; i<id.length; i++){
			temPId[i]  =id[i];
			temPName[i]=name[i];
			temPtotal[i]  =total[i];
			temPavg[i]    =avg[i];
			temPrank[i]   =rank[i];
		}
		
		
		for(int y=0; y<89; y++){
			System.out.print("-");
		}
		for(int i=0; i<temPrank.length-1; i++){
			for(int j=0; j<temPrank.length-1; j++){
				if(temPrank[j]>temPrank[j+1]){
					String tempId   =temPId[j];
					temPId[j]   =temPId[j+1];
					temPId[j+1] =tempId;
					
					String tempName =temPName[j];
					temPName[j]  =temPName[j+1]; 
					temPName[j+1]=tempName; 
					
					int temTot     =temPtotal[j];
					temPtotal[j]   =temPtotal[j+1];
					temPtotal[j+1] =temTot;
					
					double temp2   =temPavg [j];
					temPavg [j]    =temPavg [j+1];
					temPavg [j+1]  =temp2;
					
					int temp3      =temPrank[j];
					temPrank[j]    =temPrank[j+1] ;
					temPrank[j+1]  =temp3;
				}
			}
		}
		
		while(true){
			
			System.out.print("\n\n+");
			for(int i=0; i<8; i++){
				System.out.print("-");
			}
			System.out.print("+");
			for(int i=0; i<8; i++){
				System.out.print("-");
			}
			System.out.print("+");
			for(int i=0; i<20; i++){
				System.out.print("-");
			}
			System.out.print("+");
			for(int i=0; i<12; i++){
				System.out.print("-");
			}
			System.out.print("+");
			for(int i=0; i<12; i++){
				System.out.print("-");
			}
			System.out.print("+");
		
		
			System.out.printf("%n|%-8s|%-8s|%-20s|%12s|%12s|%n","Rank","ID","Name","Total Marks","Avg. Marks");
			
		
			System.out.print("+");
			for(int i=0; i<8; i++){
			System.out.print("-");
			}
			System.out.print("+");
			for(int i=0; i<8; i++){
				System.out.print("-");
			}
			System.out.print("+");
			for(int i=0; i<20; i++){
				System.out.print("-");
			}
			System.out.print("+");
			for(int i=0; i<12; i++){
				System.out.print("-");
			}
			System.out.print("+");
			for(int i=0; i<12; i++){
				System.out.print("-");
			}
			System.out.print("+\n");
			
			for(int i=0; i<rank.length; i++){
				if(temPtotal[i]>0){
					System.out.printf("|%-8d|%-8s|%-20s|%12d|%12.2f|%n",temPrank[i],temPId[i],temPName[i],temPtotal[i],temPavg[i]);
				}
			}
			System.out.print("+");
			for(int i=0; i<8; i++){
				System.out.print("-");
			}
			System.out.print("+");
			for(int i=0; i<8; i++){
				System.out.print("-");
			}
			System.out.print("+");
			for(int i=0; i<20; i++){
				System.out.print("-");
			}
			System.out.print("+");
			for(int i=0; i<12; i++){
				System.out.print("-");
			}
			System.out.print("+");
			for(int i=0; i<12; i++){
				System.out.print("-");
			}
			System.out.print("+");
			
			System.out.print("\n\nDo you want to go back to main menu? (y/n) :");
			char answer=scan.next().charAt(0);
			if(answer=='y'){
				menu(scan,id,name,pMarks,dMarks,total,avg,rank,x);
			}
		}
		
	}
		
	public static void printStudentDetails(Scanner scan,String[] id,String[] name,int[] pMarks,int[] dMarks,int[] total,double[] avg,int[] rank,int x){
		for(int i = 0; i<170; i++){
			System.out.print('-');
			}
			System.out.println();
			System.out.println("|                                                    	        PRINT STUDENT DETAILS			                                             			 |");
		for(int i = 0; i<170; i++){
			System.out.print('-');
			}
			
		for(int i=0; i<id.length; i++){  //total, avg
			total[i]=pMarks[i]+dMarks[i];
			avg[i] = total[i]/(double)2;
			}
			
			
		for(int i =0; i<id.length; i++){  // rank
			int count=1;
			for(int j=0; j<id.length; j++){
				if(total[j]>total[i]){
					count++;
					}
				}
				rank[i]=count;
			}
			int max =0;
			for (int i = 0; i < rank.length; i++)
			{
				if (max<rank[i]){
					max=rank[i];
					}
			}
			
			
			while(true){
				int temp=0;
				while(true){
					int a=0;
				System.out.print("\nEnter Student ID :");
				String Id = scan.next();
				
				for(int i=0; i<id.length; i++){
					if(Id.equals(id[i])){
						System.out.println("Student Name     :"+name[i]);
						a=5;
						temp=i;
						}
				}
				if(a!=5){
					System.out.print("Invalid student ID. Do you want to search another student detailes? (y/n) :");
					char answer1 = scan.next().charAt(0);
					if(answer1=='y'){
						continue;
						}
					else if(answer1=='n'){
						menu(scan,id,name,pMarks,dMarks,total,avg,rank,x);
						}
					else if(a==5){
						
						}
					}
					System.out.print('+');
					for (int i = 0; i < 40; i++){
						System.out.print('-');
						}
					System.out.print('+');
					
					for (int i = 0; i < 18; i++){
						System.out.print('-');
						}
					System.out.print('+');
					
					System.out.printf("%n|%-40S|","programming fundementle marks");
					System.out.printf("%18d|",pMarks[temp]);
					
					System.out.printf("%n|%-40S|","database management system marks");
					System.out.printf("%18d|",dMarks[temp]);
					
					System.out.printf("%n|%-40S|","totle marks");
					System.out.printf("%18d|",total[temp]);
					
					System.out.printf("%n|%-40S|","average marks");
					System.out.printf("%18.2f|",avg[temp]);
					
					if(rank[temp]==1){
						System.out.printf("%n|%-40S|%11d%s|","rank",rank[temp],"(First)");
						}
						
					else if(rank[temp]==max-1){
						System.out.printf("%n|%-40S|%12d%s|","rank",rank[temp],"(Last)");
						}
						
					else if(rank[temp]==2){
						System.out.printf("%n|%-40S|%10d%s|","rank",rank[temp],"(Second)");
						}
						
					else if(rank[temp]==3){
						System.out.printf("%n|%-40S|%11d%s|","rank",rank[temp],"(Third)");
						}
						
					else {
						System.out.printf("%n|%-40S|%18d|","rank",rank[temp]);
						}
					
					System.out.print("\n+");
					for (int i = 0; i < 40; i++){
						System.out.print('-');
						}
					System.out.print('+');
					
					for (int i = 0; i < 18; i++){
						System.out.print('-');
						}
					System.out.print('+');
					
					System.out.print("\nDo you want to search another student detailes? (y/n) :");
					char answer = scan.next().charAt(0);
					if(answer=='y'){
						continue;
						}
					else{
						menu(scan,id,name,pMarks,dMarks,total,avg,rank,x);
						break;
						}		
			}
			
		}
	}
	public static void deleteStudent(Scanner scan,String[] id,String[] name,int[] pMarks,int[] dMarks,int[] total,double[] avg,int[] rank,int x){
		for(int i = 0; i<170; i++){
				System.out.print('-');
			}
				System.out.println();
				System.out.println("|                                                    	        DELETE STUDENT				                                             			 |");
		for(int i = 0; i<170; i++){
				System.out.print('-');
			}
		while(true){
				while(true){
					int a=0;
				System.out.print("\nEnter Student ID :");
				String Id = scan.next();
				
				for(int i=0; i<id.length; i++){
					if(Id.equals(id[i])){
						for(int j=i; j<id.length-1;j++){
						id[j] = id[j+1];
						name[j] = name[j+1];
						pMarks[j] = pMarks[j+1];
						dMarks[j] = dMarks[j+1];
						total[j]  = total[j+1];
						avg[j]  = avg[j+1];
						}
						a=5;
						x--;
						break;
					}
			}
			if(a!=5){
				System.out.print("Invalid Student ID. Do you want to search again? (y/n) :");
				char answer1 = scan.next().charAt(0);
				if(answer1=='y'){
					continue;
					}
				else if(answer1=='n'){
					menu(scan,id,name,pMarks,dMarks,total,avg,rank,x);
					}
				else{
					break;
					}
						
				}
			if(a==5){
				System.out.println("Student has been deleted successfully.");
				System.out.print("Do you want to delete another student? (y/n) :");
				char answer = scan.next().charAt(0);
				if(answer=='y'){
					continue;
					}
				else {
					break;
					}
				}
				}
				menu(scan,id,name,pMarks,dMarks,total,avg,rank,x);
		}	
	}
	public static void updateMarks(Scanner scan,String[] id,String[] name,int[] pMarks,int[] dMarks,int[] total,double[] avg,int[] rank,int x){
		for(int i = 0; i<170; i++){
				System.out.print('-');
			}
				System.out.println();
				System.out.println("|                                                    	        UPDATE MARKS				                                             			 |");
		for(int i = 0; i<170; i++){
				System.out.print('-');
			}
		
		while(true){
				while(true){
					int a=0;
				System.out.print("\nEnter Student ID :");
				String Id = scan.next();
				
				for(int i=0; i<id.length; i++){
					if(Id.equals(id[i])){
						if(pMarks[i]!=0 && dMarks[i]!=0){
						System.out.println("Student Name     :"+name[i]);
						System.out.print("\nProgramming Fundamentals Marks :"+pMarks[i]);
						System.out.print("\nDatabase Management System Marks  :"+dMarks[i]);
						System.out.print("\n\nEnter new Programming Fundamentals Marks :");
						pMarks[i]= scan.nextInt();
						System.out.print("Enter new Database Management System Marks :");
						dMarks[i]= scan.nextInt();
						System.out.println("Marks has been updated successfully");
						a=5;
						break;
						}
					}
					}
						for(int i=0; i<id.length; i++){  //total, avg
			total[i]=pMarks[i]+dMarks[i];
			avg[i] = total[i]/(double)2;
			}
			
			
		for(int i =0; i<id.length; i++){  // rank
			int count=1;
			for(int j=0; j<id.length; j++){
				if(total[j]>total[i]){
					count++;
					}
				}
				rank[i]=count;
			}
					if(a!=5){
						System.out.println("The student's marks yet be added.");
						}
					System.out.print("Do you want to update another student details? (y/n) :");
					char answer = scan.next().charAt(0);
					if(answer=='n'){
						break;
						}
					}
					menu(scan,id,name,pMarks,dMarks,total,avg,rank,x);
				}
			}
						
	public static void updateStudentDetails(Scanner scan,String[] id,String[] name,int[] pMarks,int[] dMarks,int[] total,double[] avg,int[] rank,int x){
		for(int i = 0; i<170; i++){
				System.out.print('-');
			}
				System.out.println();
				System.out.println("|                                                    	        UPDATE STUDENT DETAILS			                                             			 |");
		for(int i = 0; i<170; i++){
				System.out.print('-');
			}
			while(true){
				while(true){
					int a=0;
				System.out.print("\nEnter Student ID :");
				String Id = scan.next();
				
				for(int i=0; i<id.length; i++){
					if(Id.equals(id[i])){
						System.out.println("Student Name     :"+name[i]);
						System.out.print("\nEnter the new student name :");
						name[i] = scan.next();
						System.out.println("Student details has been updated successfully");
						a=5;
						break;
						}
					}
					if(a!=5){
						System.out.println("Invalid Student ID");
						break;
						}
					
						System.out.print("Do you want to update another student details? (y/n) :");
						char answer = scan.next().charAt(0);
						if(answer=='n'){
							break;
							}
				}
				menu(scan,id,name,pMarks,dMarks,total,avg,rank,x);
			}
				
		}
	public static void addMarks(Scanner scan,String[] id,String[] name,int[] pMarks,int[] dMarks,int[] total,double[] avg,int[] rank,int x){
		//int curNum = 0;
		
		for(int i = 0; i<170; i++){
				System.out.print('-');
			}
				System.out.println();
				System.out.println("|                                                    	        ADD MARKS				                                             			 |");
		for(int i = 0; i<170; i++){
				System.out.print('-');
			}
			
		while(true){
			int a=0;
			int num=0;
			while(true){
				System.out.print("\nEnter Student ID :");
				String Id = scan.next();
				
				for(int i=0; i<id.length; i++){
					if(Id.equals(id[i])){
						System.out.println("Student Name     :"+name[i]);
						a=5;
						num=i;
						break;
					}
				}
				if(pMarks[num]>0){
					System.out.println("This student's marks have been already added.");
					System.out.println("If you want to update the marks,please use [5] Update Marks option.");
					System.out.print("\nDo you want to add marks for another student? (y/n): ");
					char answer3 = scan.next().charAt(0);
					if(answer3=='y'){
						continue;
					}else{menu(scan,id,name,pMarks,dMarks,total,avg,rank,x);}
				}else if(a!=5){
					System.out.print("Invalid Student ID. Do you want to search again? (y/n) :");
					char answer2 = scan.next().charAt(0);
					if(answer2=='y'){
						continue;
					}else if(answer2=='n'){
						menu(scan,id,name,pMarks,dMarks,total,avg,rank,x);
					}
				}else if(pMarks[num]==0){
					break;
				}
				System.out.println("pmarks2 "+pMarks[num]);
			}
			while(true){
				System.out.print("\nProgramming Fundamentals Marks    :");
				pMarks[num] = scan.nextInt();
				if(pMarks[num]<=100 && pMarks[num]>=0){
					break;
				}else{
					System.out.println("Invalid marks,please enter correct marks.");
				}
			}
			while(true){
				System.out.print("\nDatabase Management System Marks  :");
				dMarks[num] = scan.nextInt();
				if(dMarks[num]<=100 && dMarks[num]>=0){
					break;
				}else{
					System.out.println("Invalid marks,please enter correct marks.");
				}
			}
				for(int i=0; i<id.length; i++){  //total, avg
			total[i]=pMarks[i]+dMarks[i];
			avg[i] = total[i]/(double)2;
			}
			
			
		for(int i =0; i<id.length; i++){  // rank
			int count=1;
			for(int j=0; j<id.length; j++){
				if(total[j]>total[i]){
					count++;
					}
				}
				rank[i]=count;
			}
			System.out.print("\nMarks have been added successfully. ");
			System.out.print("Do you want to add marks for another student (y/n): ");
			char answer = scan.next().charAt(0);
			if(answer=='n'){
				break;
			}
		}
		
	}
	public static void addNewStudentWithMarks(Scanner scan,String[] id,String[] name,int[] pMarks,int[] dMarks,int[] total,double[] avg,int[] rank,int x){
		for(int i = 0; i<170; i++){
				System.out.print('-');
			}
				System.out.println();
				System.out.println("|                                                    	        ADD NEW STUDENT WITH MARKS		                                             			 |");
		for(int i = 0; i<170; i++){
				System.out.print('-');
			}
		
		while(true){
			while(true){
				int a=0;
				System.out.print("\nEnter Student ID   :");
				id[x] = scan.next();
				
				for(int y=(x-1); y>=0; y--){
					if(id[x].equals(id[y])){
						System.out.println("The Student ID already exists");
						a=5;
						break;
					}
				}
				if(a!=5){
					break;
				}
			}
			System.out.print("Enter Student Name :");
			name[x] = scan.next();
			
			while(true){
				System.out.print("\nProgramming Fundamentals Marks   :");
				pMarks[x] = scan.nextInt();
				if(pMarks[x]<=100 && pMarks[x]>=0){
					break;
				}else{
					System.out.println("Invalid marks,please enter correct marks.");
				}
			}
			while(true){
				System.out.print("\nDatabase Management System Marks :");
				dMarks[x] = scan.nextInt();
				if(dMarks[x]<=100 && dMarks[x]>=0){
					break;
				}else{
					System.out.println("Invalid marks,please enter correct marks.");
				}
			}
				for(int i=0; i<id.length; i++){  //total, avg
			total[i]=pMarks[i]+dMarks[i];
			avg[i] = total[i]/(double)2;
			}
			
			
		for(int i =0; i<id.length; i++){  // rank
			int count=1;
			for(int j=0; j<id.length; j++){
				if(total[j]>total[i]){
					count++;
					}
				}
				rank[i]=count;
			}
			
			System.out.print("Student has been added successfully. ");
			System.out.print("Do you want to add a new student (y/n): ");
			char answer = scan.next().charAt(0);
			x++;
			if(answer=='n'){
				break;
			}
		}
		menu(scan,id,name,pMarks,dMarks,total,avg,rank,x);
	}
	public static void addNewStudent(Scanner scan,String[] id,String[] name,int[] pMarks,int[] dMarks,int[] total,double[] avg,int[] rank,int x){
		for(int i = 0; i<170; i++){
				System.out.print('-');
			}
				System.out.println();
				System.out.println("|                                                    	        ADD NEW STUDENT				                                             			 |");
		for(int i = 0; i<170; i++){
				System.out.print('-');
			}
		
		while(true){
			while(true){
				int a=0;
				System.out.print("\nEnter Student ID   :");
				id[x] = scan.next();
				
				for(int i=(x-1); i>=0; i--){
					if(id[x].equals(id[i])){
						System.out.println("The Student ID already exists");
						a=5;
						break;
					}
				}
				if(a!=5){
					break;
				}
			}
			System.out.print("Enter Student Name :");
			name[x] = scan.next();
			
			System.out.print("Student has been added successfully. ");
			System.out.print("Do you want to add a new student (y/n): ");
			char answer = scan.next().charAt(0);
			x++;
			if(answer=='n'){
				break;
			}
		}
		menu(scan,id,name,pMarks,dMarks,total,avg,rank,x);
	}
	public static void menu(Scanner scan,String[] id,String[] name,int[] pMarks,int[] dMarks,int[] total,double[] avg,int[] rank,int x){
		clearConsole();
		for(int i = 0; i<170; i++){
				System.out.print('-');
			}
				System.out.println();
				System.out.println("|                                                    	        WELCOME TO GDSE MARKS MANAGEMENT SYSTEM                                             			 |");
		for(int i = 0; i<170; i++){
				System.out.print('-');
			}
				System.out.println();
				System.out.println("[1] Add New Student						[2] Add New Student With Marks");
				System.out.println("[3] Add Marks				    			[4] Update Student Details");
				System.out.println("[5] Update Marks						[6] Delete Student");
				System.out.println("[7] Print Student Details					[8] Print Student Ranks");
				System.out.println("[9] Best in programming Fundamentals				[10] Add New Student With Marks");	
				System.out.println();
				System.out.print("Enter An Option To Continue > ");
				int option = scan.nextInt();
		
				clearConsole();
		switch(option){
			case 1 :
				addNewStudent(scan,id,name,pMarks,dMarks,total,avg,rank,x);
				break;
			case 2 :
				addNewStudentWithMarks(scan,id,name,pMarks,dMarks,total,avg,rank,x);
				break;
			case 3 :
				addMarks(scan,id,name,pMarks,dMarks,total,avg,rank,x);
				break;
			case 4 :
				updateStudentDetails(scan,id,name,pMarks,dMarks,total,avg,rank,x);
				break;
			case 5 :
				updateMarks(scan,id,name,pMarks,dMarks,total,avg,rank,x);
				break;
			case 6 :
				deleteStudent(scan,id,name,pMarks,dMarks,total,avg,rank,x);
				break;
			case 7 :
				printStudentDetails(scan,id,name,pMarks,dMarks,total,avg,rank,x);
				break;
			case 8 :
				printStudentRanks(scan,id,name,pMarks,dMarks,total,avg,rank,x);
				break;
			case 9 :
				bestInPRF(scan,id,name,pMarks,dMarks,total,avg,rank,x);
				break;
			case 10 :
				bestInDBMS(scan,id,name,pMarks,dMarks,total,avg,rank,x);
				break;
		}
	}
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		String[] id = new String[1000];
		String[] name = new String[1000];
		int[] pMarks = new int[1000];
		int[] dMarks = new int[1000];
		int[] total = new int[1000];
		double[] avg = new double[1000];
		int[] rank=new int[1000];
		int x=0; 
		
		menu(scan,id,name,pMarks,dMarks,total,avg,rank,x);
	} 
}

