package assign1unicode;

public class unicode {
	

		public static void main(String[] args) {
			{
				String s="";
				int ch[]= {3128,3112,3149,3108,3146,3126,3149};
				for(int i=0;i<ch.length;i++)
				{
					char c=(char)ch[i];
					s=s+c;
				}
				System.out.print(s);
			}

		}

	

}
