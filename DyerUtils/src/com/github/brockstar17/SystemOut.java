package com.github.brockstar17;

public class SystemOut {

	
	public static void output(Object s){
		if(s instanceof Object[])
		{
			Object[] o = (Object[]) s;
			String out = "";
			int p = 0;
			for(Object i : o)
			{
				if(p == o.length - 1)
					out += i;
				else
					out += i + ", ";

				p++;
			}
			output(out);
		}
		else if(s instanceof int[])
		{
			String out = "";
			int p = 0;

			int[] o = (int[]) s;
			for(int i : o)
			{
				if(p == o.length - 1)
					out += i;
				else
					out += i + ", ";

				p++;
			}

			output(out);

		}
		else if(s instanceof double[])
		{
			String out = "";
			int p = 0;

			double[] o = (double[]) s;
			for(double i : o)
			{
				if(p == o.length - 1)
					out += i;
				else
					out += i + ", ";

				p++;
			}

			output(out);
		}
		else if(s instanceof char[])
		{
			String out = "";
			int p = 0;

			char[] o = (char[]) s;
			for(char i : o)
			{
				if(p == o.length - 1)
					out += i;
				else
					out += i + ", ";

				p++;
			}

			output(out);
		}
		else if(s instanceof float[])
		{
			String out = "";
			int p = 0;

			float[] o = (float[]) s;
			for(float i : o)
			{
				if(p == o.length - 1)
					out += i;
				else
					out += i + ", ";

				p++;
			}

			output(out);
		}
		else
		{
			System.out.println(s);
		}

	}
}
