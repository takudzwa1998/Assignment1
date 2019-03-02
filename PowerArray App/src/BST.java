public class BST
{
    public BSTNode root;
    public int count_two=0;

    public void put( String key, Object value1, Object value2)
    {
        if ( root == null )
		
        {
            root = new BSTNode( key, value1, value2);
	    count_two++;
        }
        else
        {
            root.put( key, value1, value2);
        }
    }

    public Object get( String key )
    {
        return root == null ? null : root.get( key );
    }
   public int getCount_two(){
	return count_two;
}
}
