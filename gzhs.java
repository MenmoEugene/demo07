/*
3���Ӹ���Ĺ��캯��

�ڶ����������г�ʼ��ʱ������Ĺ��캯��Ҳ�����У�
��Ϊ����Ĺ��캯��Ĭ�ϵ�һ����һ����ʽ����� super();
super()������ʸ����пղ����Ĺ��캯�����������������еĹ��캯��Ĭ�ϵ�һ�ж���super()��

Ϊʲô����һ��Ҫ���ʸ����еĹ��캯��

��Ϊ�����е����ݣ��������ֱ�ӻ�ȡ��������������ڽ���ʱ����Ҫ�Ȳ鿴��������ζ���Щ���ݽ��г�ʼ���ġ�
���������Ӱ������ʼ��ʱ��Ҫ�ȷ������¸����еĹ��캯����
���Ҫ���ʸ�����ָ���Ĺ��캯��������ͨ���ֶ�����super���ķ�ʽ��ָ����

ע�⣺super���һ��Ҫ���������๹�캯���ĵ�һ�С�

����ʵ��������
���ۣ�
��������еĹ��캯����Ĭ�϶�����ʸ����ܿղ����Ĺ��캯����
��Ϊ����ÿһ�����캯���ڵĵ�һ�ж���һ����ʽsuper()��
��������û�пղ����Ĺ��캯��ʱ����������ֶ�super����this�����ʽ��ָ��Ҫ���ʵĹ��캯���� 
��Ȼ������Ĺ��캯����һ��Ҳ�����ֶ�ָ��this��������ʱ����еĹ��캯����
���������ٻ���һ�����캯������ʸ����еĹ��캯����
*/
class Fu
{
	Fu()
	{
		System.out.println("fu run");
	}
}
class Zi extends Fu
{
	Zi()
	{
		//super();   ��ʽ���
		System.out.println("zi run");
	}
	Zi(int  x)
	{
		System.out.println("zi......"+x);
	}
}
class gzhs
{
	public static void main(String[] args)
	{
		Zi z = new Zi();
		Zi z1 = new Zi(4);
	}
}