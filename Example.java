import java.util.*;

class Example{
		
	// Clear Console Code -->
	public static void clearConsole(){
		
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
        }
    }
	public static Scanner input=new Scanner(System.in);
	public static String[][] student = new String[1000][6];
	public static double[] totMarks = new double[1000];
	public static double[] pMarks = new double[1000];
	public static double[] dMarks = new double[1000];
	public static int x=0;
	
	public static void main(String []args){
		menu();
	}
	//menu 	
	public static void menu(){

       		
		Scanner input=new Scanner(System.in);
		 for(int y=0; y<97; y++){
			System.out.print("-");
			}
		System.out.println("\n|\t\t\t WELCOME TO GDSE MARK MANAGEMENT SYSTEM\t\t\t\t\t|");
		for(int y=0; y<97; y++){
			System.out.print("-");
			}
			System.out.println();
			
			System.out.println("[1] Add a New Student \t\t\t\t [2] Add a New Student with Marks");
			System.out.println("[3] Add Marks \t\t\t\t\t [4] Update Student Details");
	                System.out.println("[5] Update Marks \t\t\t\t [6] Delete Student");
			System.out.println("[7] Print Student Details \t\t\t [8] Print Student Ranks");
			System.out.println("[9] Best in Programming Fundamentals \t\t [10] Best in Database Management System");
			
			System.out.println();

						
   boolean bool=true;
		
		while(bool){
			System.out .print("\nEnter an Option to Continue : ");
			int option=input.nextInt();
			
			if(option==1){
			clearConsole();
					 System.out.println("---------------------------------------------------------------------------");
					 System.out.println("|  \t	    	    ADD NEW STUDENT		\t  	  |");
					 System.out.println("---------------------------------------------------------------------------");
					 addNewStudent();
					 bool=false;
				 }	
			else if(option== 2){	
			clearConsole();
				 	 System.out.println("---------------------------------------------------------------------------");
					 System.out.println("|			ADD NEW STUDENT WITH MARKS			  |");
					 System.out.println("---------------------------------------------------------------------------");
	 		    	 studentWithMarks();
	 		    	 bool=false;
				 }
			else if(option== 3){
				clearConsole();
					 System.out.println("---------------------------------------------------------------------------");
					 System.out.println("|\t			ADD MARKS\t			  |");
					 System.out.println("---------------------------------------------------------------------------");
	 		    	 addMarks();
	 		    	 bool=false;
				 }
			else if(option ==4){
				clearConsole();
					 System.out.println("---------------------------------------------------------------------------");
					 System.out.println("|			  UPDATE STUDENT DETAILS   			  |");
					 System.out.println("---------------------------------------------------------------------------");
	 		    	 updateStudent();
	 		    	 bool=false;
				 }
			else if(option== 5){
				clearConsole();
					 System.out.println("---------------------------------------------------------------------------");
					 System.out.println("|\t			UPDATE MARKS\t			  |");
					 System.out.println("---------------------------------------------------------------------------");
	 		    	 updateMarks();
	 	             bool=false;
				 }
			else if(option== 6){
				clearConsole();	
					 System.out.println("---------------------------------------------------------------------------");
					 System.out.println("|\t			DELETE STUDENT\t			  |");
					 System.out.println("---------------------------------------------------------------------------");
	 		    	 deleteStudent();
	 		    	 bool=false;
				 }
		 else if(option== 7){
				clearConsole();	
					 System.out.println("---------------------------------------------------------------------------");
					 System.out.println("|\t		   PRINT STUDENT DETAILS\t		  |");
					 System.out.println("---------------------------------------------------------------------------");
	 		    	 printStudentDetails();
	 		    	 bool=false;
	 		    	 }
			else if(option== 8){
				clearConsole();	
					 System.out.println("---------------------------------------------------------------------------");
					 System.out.println("|\t		   PRINT STUDENT RANKS\t\t		  |");
					 System.out.println("---------------------------------------------------------------------------");
	 		    	 printStudentRank();
	 		    	 bool=false;
				 }
			else if(option== 9){
				clearConsole();	
					 System.out.println("---------------------------------------------------------------------------");
					 System.out.println("|		        BEST IN PROGRAMMING FUNDAMENTALS\t	  |");
					 System.out.println("---------------------------------------------------------------------------\n");
	 		    	 bestInPrf();
	 		    	 bool=false;
				 }
		else if(option== 10){
				clearConsole();	
					 System.out.println("----------------------------------------------------------------------------------");
					 System.out.println("|		        BEST IN DATABASE MANAGEMENT SYSTEM  \t	         |");
					 System.out.println("----------------------------------------------------------------------------------\n");
	 		    	 bestInDbms();
	 		    	 bool=false;
				 }

				 if(option>10){
		  System.out.println("ERROR !  Input Withing 1 to 10 for Options");
	  }
			}
		}
		
// Option 1++++++++++++++++++++++++++++++++++++++++>

	public static void addNewStudent(){
				
				
				boolean con=true;
				
				L1: while(con){
					System.out.print("Enter Student ID:");
					String id= input.next();
					
					for(int i=0; i<x;i++){
						
						if(id.equals(student[i][0])){
							System.out.println();
							System.out.print("The Student ID Already Exists \n");
							continue L1;
							}
							else{
								student[x][0]=id;
								}
							}
								
								if(x==0){student[x][0]=id;}
								
								System.out.print("Enter Student Name:");
								String name=input.next();
								student[x][1]=name;
								System.out.println();
								System.out.print("Student has been added Successfully. ");
								x++;
								
								System.out.print("Do You Want to Add a New Student (y/n):");
								char op=input.next().charAt(0);
									clearConsole();
	        System.out.println(" -------------------------------------------------------------------------------------");
		System.out.println(" |                                  ADD NEW STUDENT                                  |");
		System.out.println(" -------------------------------------------------------------------------------------");
								if(op=='y'){
										addNewStudent();
										continue L1;
									}
									else{ 
										clearConsole();
										menu();
								}
						}
				}
				
// Option 2++++++++++++++++++++++++++++++++++++++++++++++++++++>
	
	public static void studentWithMarks(){
					
					boolean con= true;
					
					L1:while(con){
						System.out.println();
						System.out.print("Enter Student ID: ");
						String id= input.next();
						
						for(int i=0; i<x;i++){
						
						if(id.equals(student[i][0])){
							System.out.println();
							System.out.print("The Student ID Already Exists \n");
							continue L1;
							}
							else{
								student[x][0]=id;
								}
							}
								
								if(x==0){student[x][0]=id;}
								
								System.out.print("Enter Student Name:");
								String name=input.next();
								student[x][1]=name;
								
								double prfMarks=0;
								double dbmsMarks=0;
								boolean con1= true;
								
								while(con1){
									System.out.println();
									System.out.print("Programming Fundamentals Marks :");
									prfMarks=input.nextDouble();
									
									if(prfMarks<0 || prfMarks>100){
										System.out.println("Invalid Marks ! Please enter correct Marks.");
										}
										else{
											student[x][2]=String.valueOf(prfMarks);
											con1=false;
											}
									}
									
									boolean con2= true;
								
								while(con2){
									System.out.println();
									System.out.print("Database Management System Marks :");
									dbmsMarks=input.nextDouble();
									
									if(dbmsMarks<0 || dbmsMarks>100){
										System.out.println("Invalid Marks ! Please enter correct Marks.");
										}
										else{
											student[x][3]=String.valueOf(dbmsMarks);
											con2=false;
											}
									}
									
									double tot = prfMarks+dbmsMarks;
									double avg = tot/2;
									totMarks[x]=tot;
									pMarks[x]=prfMarks;
									dMarks[x]=dbmsMarks;
									student[x][4]= String.valueOf(tot);
									student[x][5]= String.valueOf(avg);
									
									x++;
									
									
									System.out.print("Student has been added successfully. Do you want to add a new student(y/n):");
										char op=input.next().charAt(0);
										clearConsole();
				 	 System.out.println("---------------------------------------------------------------------------");
					 System.out.println("\t|			ADD NEW STUDENT WITH MARKS			  |");
					 System.out.println("---------------------------------------------------------------------------");
									if(op=='y'){
										
												studentWithMarks();
												continue L1;
										}
										else{
											 clearConsole();
												
												menu();
									
										
										}

						}
					}
					
// Option 3+++++++++++++++++++++++++++++++++++++++++++++++++++++>
								
	public static void addMarks(){
				int L = 0;
				boolean con = true;
		L1:while(con){
			System.out.println();
			System.out.print("Enter Student Id : ");
			String sID=input.next();
			
			for(int i=0;i<x+1;i++){
				if (sID.equals(student[i][0])){
					System.out.println("Student Name : "+student[i][1]);
					}
				if (sID.equals(student[i][0]) && student[i][2]==null){
							
							double prf=0.0,dbms=0.0;
							boolean con1=true;
							while (con1){
							System.out.println();
							System.out.print("Programming Fundamental Marks : ");
							prf=input.nextDouble();
							if(prf>0 && prf<=100){
								student[i][2]=String.valueOf(prf);
								con1=false; 
							}else{
								System.out.println();
								System.out.println("Invalid Marks ! Please enter correct Marks.");
								}
							}
							
							boolean con2=true;
							while (con2){
							System.out.print("Database Management System Marks : ");
							dbms=input.nextDouble();
							if(dbms>0 && dbms<=100){
								student[i][3]=String.valueOf(dbms);
								con2=false; 
							}else{
								System.out.println();
								System.out.println("Invalid Marks ! Please enter correct Marks.");
								}
							System.out.print("Student Marks Added Successfully. ");
							double tot=prf+dbms;
							double avg=tot/2;
							totMarks[i]=tot;
							pMarks[i]=prf;
							dMarks[i]=dbms;
							student[i][4]=String.valueOf(tot);
							student[i][5]=String.valueOf(avg);
							
							L++;
							System.out.print("Do you want add Marks to another Student (y/n) : ");
								char op=input.next().charAt(0);
							clearConsole();
					 System.out.println("---------------------------------------------------------------------------");
					 System.out.println("|\t			ADD MARKS\t			  |");
					 System.out.println("---------------------------------------------------------------------------");
							if(op=='n'){
											clearConsole();
													menu();
													 con=false;
												
													 break;
											}
											else if(op=='y'){
												addMarks();
													 continue L1;
										
												
											}
										
							}
					}if(sID.equals(student[i][0]) && student[i][2]!=null){
						L++;
					}
				}
			if(L!=0){
				System.out.println("Marks has been Already added. \nUse Option [5] to Update Marks\n");
				}
			if(L==0){
				System.out.print("Invalid Student ID. ");
				}
			
		
			
		System.out.print("Do You Want To Search Again (y/n) : ");
			char op1=input.next().charAt(0);
			clearConsole();
					 System.out.println("---------------------------------------------------------------------------");
					 System.out.println("|\t			ADD MARKS\t			  |");
					 System.out.println("---------------------------------------------------------------------------");
			
			if(op1=='n'){
						clearConsole();		
								 menu();
								 con=false;
								 break;
						}
					else{
						addMarks();
								 continue L1;
						}
		
		   }
					
		}
			
// Option 4+++++++++++++++++++++++++++++++++++++++++++++++++>
				
	public static void updateStudent(){
						
						int k=0;
						boolean con=true;
						
					L2:	while(con){
							int i=0;
							String name;
							
							System.out.println();
							System.out.print("Enter Student ID : ");
							String update=input.next();	
							
						for(;i<x;i++){
							if(update.equals(student[i][0])){
						
									System.out.print("Student Name :" +student[i][1]);
									System.out.println();
									System.out.print("Enter the New Student Name : ");
									name=input.next();
									k++;
									student[i][1]=name;
									
									System.out.println();
									System.out.println("Student details has been Updated Successfully.");
							}
							
						}
						if(k==0){System.out.println("Invalid Student ID ! ");}
							System.out.print("Do you want to Update another Student Details ? (y/n) : ");
								char op= input.next().charAt(0);
												clearConsole();
					 System.out.println("---------------------------------------------------------------------------");
					 System.out.println("|			  UPDATE STUDENT DETAILS   			  |");
					 System.out.println("---------------------------------------------------------------------------");
									if(op=='y'){
												updateStudent();
												continue L2;
									}
										else{
											 clearConsole();
												
												menu();
									
										
										}
						
						}
					
				}
				
// Option 5++++++++++++++++++++++++++++++++++++++++>
		
	public static void updateMarks(){
		
						int k=0;
						boolean con=true;
						
			L2:	while(con){
							int i=0;
							String name;
							
							System.out.println();
							System.out.print("Enter Student ID : ");
							String sID=input.next();
							
			for(;i<x+1;i++){
				if (sID.equals(student[i][0])){
					System.out.println("Student Name : "+student[i][1]);
					if (sID.equals(student[i][0]) && student[i][2]==null){
						System.out.println("This student's marks yet to be added.");
						continue L2;
					}else{
						
						System.out.print("Programming Fundamental Marks : "+student[i][2]);
						System.out.println();
						System.out.print("Database Management System Marks : "+student[i][3]);
						System.out.println();
						System.out.println();
						
						double prf1=0.0,dbms1=0.0;
							boolean x=true;
							while (x){
							System.out.print("Enter New Programming Fundamental Marks : ");
							prf1=input.nextDouble();
							if(prf1>0 && prf1<=100){
								student[i][2]=String.valueOf(prf1);
								x=false; 
							}else{
								System.out.println("\nInvalid Marks ! Please enter correct Marks.");
								}
							}
							
							boolean y=true;
							while (y){
							System.out.print("Enter New Database Management System Marks : ");
							dbms1=input.nextDouble();
							if(dbms1>0 && dbms1<=100){
								student[i][3]=String.valueOf(dbms1);
								y=false; 
							}else{
								System.out.println("\nInvalid Marks ! Please enter correct Marks.");
								}
							System.out.println("Marks have been Updated Successfully.");
							double tot1=prf1+dbms1;
							double avg1=tot1/2;
							totMarks[i]=tot1;
							pMarks[i]=prf1;
							dMarks[i]=dbms1;
							student[i][4]=String.valueOf(tot1);
							student[i][5]=String.valueOf(avg1);
							System.out.println();
						}
					System.out.print("Do you Want to Update Marks for another Student (y/n) : ");
								char op=input.next().charAt(0);
								
												clearConsole();
					 System.out.println("---------------------------------------------------------------------------");
					 System.out.println("|\t			UPDATE MARKS\t			  |");
					 System.out.println("---------------------------------------------------------------------------");
								if(op=='n'){
											clearConsole();
													 menu();
													 con=false;
													 
													 break;
										}
									
											else if(op=='y'){
												updateMarks();
													 continue L2;
											
												
										}
					
						}
				
				if(sID.equals(student[i][0]) && student[i][2]!=null){
					k++;
					}
					
				}
				
			}
				
		System.out.print("Invalid Student ID. Do You Want to Search Again (y/n) : ");
			char op1=input.next().charAt(0);
							clearConsole();
					 System.out.println("---------------------------------------------------------------------------");
					 System.out.println("|\t			UPDATE MARKS\t			  |");
					 System.out.println("---------------------------------------------------------------------------");
			
			if(op1=='n'){
						clearConsole();		
								 menu();
								 con=false;
								
								 break;
						}
						else{
							updateMarks();
								 continue L2;
						
							
						}
			}
					
		}
		
// Option 6++++++++++++++++++++++++++++++++++++>
		
	public static void deleteStudent(){
			
						int i=0,q=0;
						boolean del=true;
						
					delt:while(del){
						
						System.out.println();
						System.out.print("Enter Student ID :  ");
						String id= input.next();
						System.out.println();
						for(;i<x;i++){
							if(!id.equals(student[i][0])){
								q++;							
								}
							}
						if(q==x){
							System.out.print("Invalid Student ID! \n");
							System.out.print("Do You Want to search again? (y/n) : ");
								char op=input.next().charAt(0);
								clearConsole();	
					 System.out.println("---------------------------------------------------------------------------");
					 System.out.println("|\t			DELETE STUDENT\t			  |");
					 System.out.println("---------------------------------------------------------------------------");
								
								if(op=='n'){
											clearConsole();
													menu();
													 del=false;

													 break;
											}
											else{
												deleteStudent();
													 continue delt;
											}
							}
						ot:for(int k=0;k<x;k++){
								if(id.equals(student[k][0])){
									student[k][0]=null;
									student[k][1]=null;
									student[k][2]=null;
									student[k][3]=null;
									student[k][4]=null;
									student[k][5]=null;
									totMarks[k]= 0.0;
									pMarks[k]= 0.0;
									dMarks[k]= 0.0;
									continue ot;	
									}	
							}
							
						System.out.print("Student has been deleted successfully..\nDo you want to delete another student? (y/n)  : ");
							char op1=input.next().charAt(0);
							clearConsole();	
					 System.out.println("---------------------------------------------------------------------------");
					 System.out.println("|\t			DELETE STUDENT\t			  |");
					 System.out.println("---------------------------------------------------------------------------");
							if(op1=='n'){
								
									clearConsole();
													menu();
													 
													 del=false;
													 break;
											}
											else{
												deleteStudent();
													 continue delt;
											
											
								}
					
				}
					
			}
			
// Option 7+++++++++++++++++++++++++++++++++>
					
	public static void printStudentDetails(){
					
							int b=0;
							boolean con=true;
				
						L1:while(con){
							System.out.print("\nEnter Student Id:");
							String id= input.next();
							
							for(int i=0;i<x;i++){
							if(id.equals(student[i][0])){
								System.out.println("Student Name : "+student[i][1]);
								if (id.equals(student[i][0]) && student[i][2]==null){
									System.out.print("This student's marks yet to be added.\n");
									continue L1;
								}else{
								System.out.println("-----------------------------------------------------------------");
								System.out.println("| Programming Fundamentals Marks\t|\t\t "+student[i][2]+"\t|");
								System.out.println("| Database Management System Marks\t|\t\t "+student[i][3]+"\t|");
								System.out.println("| Total Marks\t\t\t\t|\t\t "+student[i][4]+"\t|");
								System.out.println("| Avg. Marks\t\t\t\t|\t\t "+student[i][5]+"\t|");
								
								double[] tempr=new double[1000];
								for(int x=0;x<totMarks.length;x++){
									tempr[x]=totMarks[x];
								}

								for(int j=tempr.length-1;j>0;j--){
									for(int k=0;k<j;k++){
										if(tempr[k]<tempr[k+1]){
											double temp=tempr[k];
											tempr[k]=tempr[k+1];
											tempr[k+1]=temp;
										}
									}
								}
							
								for(int n=0;n<x;n++){
									if(student[i][4].equals(Double.toString(tempr[n]))){
										System.out.println("| Rank\t\t\t\t\t|\t\t "+(n+1)+"\t|");
										}
									}
									System.out.println("-----------------------------------------------------------------");
									
							System.out.print("Do you want to search another student details  (y/n) : ");
								char op= input.next().charAt(0);
								clearConsole();	
					 System.out.println("---------------------------------------------------------------------------");
					 System.out.println("|\t		   PRINT STUDENT DETAILS\t		  |");
					 System.out.println("---------------------------------------------------------------------------");
								if(op=='y'){
										
												printStudentDetails();
												continue L1;
										}
										else{
											 clearConsole();
												
												menu();

										}
						}
								if(id.equals(student[i][0]) && student[i][2]!=null){
									b++;
								}
								
							}
							
							
						}
						
							
		System.out.print("Invalid Id ! Do You Want To Search Again (y/n) : ");
			char op1=input.next().charAt(0);
			clearConsole();	
					 System.out.println("---------------------------------------------------------------------------");
					 System.out.println("|\t		   PRINT STUDENT DETAILS\t		  |");
					 System.out.println("---------------------------------------------------------------------------");
				if(op1=='n'){
						clearConsole();		
								 menu();
								 con=false;
								
								 break;
							 }

						else{
							printStudentDetails();
								 continue L1;
						
						}
								
			}			
							
		}
// Option 8+++++++++++++++++++++++++++++++++++++++>
		
	public static void printStudentRank(){
			
			
			System.out.println("-----------------------------------------------------------------------------------------------------------------");
			//System.out.println("|\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");
			System.out.println("|\tRank\t|\tId\t|\t  Name\t\t\t|\tTotal Marks\t|\tAvg. Marks\t|");
			//System.out.println("|\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");
			System.out.println("-----------------------------------------------------------------------------------------------------------------");
			
			boolean con=true;
			L1:while(con){
			
								double[] tempr=new double[1000];
								for(int x=0;x<totMarks.length;x++){
									tempr[x]=totMarks[x];
								}

								for(int j=tempr.length-1;j>0;j--){
									for(int k=0;k<j;k++){
										if(tempr[k]<tempr[k+1]){
											double temp=tempr[k];
											tempr[k]=tempr[k+1];
											tempr[k+1]=temp;
										}
									}
								}
																	
			for(int n=0;n<x;n++){
				for(int v=0;v<x;v++){
					if(Double.toString(tempr[n]).equals(student[v][4])){
						System.out.println("|\t"+(n+1)+"\t|\t"+student[v][0]+"\t|\t"+student[v][1]+"\t\t\t|\t"+student[v][4]+"\t\t|\t"+student[v][5]+"\t\t|");
					}						
				}						
			}
			
			System.out.println("-----------------------------------------------------------------------------------------------------------------");
						
					System.out.print("Do you want to go back to main menu? (y/n)  :");
							char op=input.next().charAt(0);
							clearConsole();	
					 System.out.println("---------------------------------------------------------------------------");
					 System.out.println("|\t		   PRINT STUDENT RANKS\t\t		  |");
					 System.out.println("---------------------------------------------------------------------------");
						if(op=='y'){
								
									clearConsole();
													menu();
													 
													 con=false;
													 break;
										}
											else{
												printStudentRank();
													 continue L1;
	
								}
					}
			}
// Option 9+++++++++++++++++++++++++++++++++++++++++++++>
	
	public static void bestInPrf(){
			System.out.println("-------------------------------------------------------------------------------------------------");
			System.out.println("|\tId\t|\tName\t\t\t|\tPRF Marks\t|\tDBMS Marks\t|");
			System.out.println("-------------------------------------------------------------------------------------------------");
			
			boolean m=true;
			
			L1:while(m){
				
				double[] tempr=new double[1000];
				for(int x=0;x<pMarks.length;x++){
					tempr[x]=pMarks[x];
				}

				for(int j=tempr.length-1;j>0;j--){
					for(int k=0;k<j;k++){
						if(tempr[k]<tempr[k+1]){
							double temp=tempr[k];
							tempr[k]=tempr[k+1];
							tempr[k+1]=temp;
							}
						}
					}
				for(int n=0;n<x;n++){
					for(int v=0;v<x;v++){
						if(Double.toString(tempr[n]).equals(student[v][2])){
							System.out.println("|\t"+student[v][0]+"\t|\t"+student[v][1]+"\t\t\t|\t"+student[v][2]+"\t\t|\t"+student[v][3]+"\t\t|");
								}
												
							}
											
						}
			System.out.println("-------------------------------------------------------------------------------------------------");
											System.out.print("Do you want to go back to main menu? (y/n)  :");
							char op=input.next().charAt(0);
							clearConsole();	
					 System.out.println("---------------------------------------------------------------------------");
					 System.out.println("|		        BEST IN PROGRAMMING FUNDAMENTALS\t	  |");
					 System.out.println("---------------------------------------------------------------------------\n");
							if(op=='y'){
								
										clearConsole();
													menu();
													 m=false;
													 break;
											}
											else{
												bestInPrf();
													 continue ;
											
								}
				
				}
			
			}	
		
// Option 10 +++++++++++++++++++++++++>
		
	public static void bestInDbms(){
			System.out.println("-------------------------------------------------------------------------------------------------");
			System.out.println("|\tId\t|\tName\t\t\t|\tPRF Marks\t|\tDBMS Marks\t|");
			System.out.println("-------------------------------------------------------------------------------------------------");
				
			boolean m=true;
			
			L1:while(m){
				
				double[] tempr=new double[1000];
				for(int x=0;x<dMarks.length;x++){
					tempr[x]=dMarks[x];
				}

				for(int j=tempr.length-1;j>0;j--){
					for(int k=0;k<j;k++){
						if(tempr[k]<tempr[k+1]){
							double temp=tempr[k];
							tempr[k]=tempr[k+1];
							tempr[k+1]=temp;
						}
					}
				}
				for(int n=0;n<x;n++){
					for(int v=0;v<x;v++){
						if(Double.toString(tempr[n]).equals(student[v][3])){
							System.out.println("|\t"+student[v][0]+"\t|\t"+student[v][1]+"\t\t\t|\t"+student[v][2]+"\t\t|\t"+student[v][3]+"\t\t|");
								}
												
							}
											
						}
			System.out.println("-------------------------------------------------------------------------------------------------");
				System.out.print("Do you want to go back to main menu? (y/n)  :");
							char op=input.next().charAt(0);
											clearConsole();	
					 System.out.println("----------------------------------------------------------------------------------");
					 System.out.println("|		        BEST IN DATABASE MANAGEMENT SYSTEM  \t	         |");
					 System.out.println("----------------------------------------------------------------------------------\n");
							if(op=='y'){
								
										clearConsole();
													menu();
													
													 m=false;
													 break;
											}
											else{
												bestInDbms();
													 continue L1;
	
								}
				}
				
			}
		
}
