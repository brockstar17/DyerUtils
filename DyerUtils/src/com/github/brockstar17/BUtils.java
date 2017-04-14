package com.github.brockstar17;

public class BUtils
{
	/**
	 * A System.out.println() shortcut
	 * 
	 * Will also print out all elements of an array with a space in between each
	 * 
	 * @param s
	 *            the string to output
	 */
	public static void sout(Object s) {

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
			sout(out);
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

			sout(out);

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

			sout(out);
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

			sout(out);
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

			sout(out);
		}
		else
		{
			System.out.println(s);
		}

	}

}
