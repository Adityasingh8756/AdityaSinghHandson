package Day13Handson;

public class JDBCcalls {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int opition=Integer.parseInt(args[0]);
		DAOclass daoclass=new DAOclass();
		//System.out.println("Enter the Opition");
		switch(opition)
		{
		case 1:
			int rollno=Integer.parseInt(args[1]);
			String name=args[2];
			String grade=args[3];
			String dob=args[4];
			double fee=Double.parseDouble(args[5]);
			
			if (daoclass.insert(rollno, name, grade, dob, fee))
			{
				System.out.println("Inserted successfully");
			}
				else 
				{
					System.out.println("Insertion error");
				}
			break;
		
		case 2:
			 rollno=Integer.parseInt(args[1]);
			 if(daoclass.delete(rollno))
			 {
				 System.out.println("Deleted successfully");
			 }
					else
						{
						System.out.println("Deletion error");
				
							}
			 break;
			 
		case 3:
			rollno=Integer.parseInt(args[1]);
			fee=Double.parseDouble(args[2]);
			if(daoclass.modify(rollno, fee))
			 {
				 System.out.println("Modification successfully done");
			 }
					else
						{
						System.out.println("Modification error");
				
							}
			 break;
			 
		case 4:
			try
			{
			rollno=Integer.parseInt(args[0]);
			daoclass.display(rollno);
			}
			catch(Exception e)
			{
				daoclass.display();
			}
		}
	}

}
