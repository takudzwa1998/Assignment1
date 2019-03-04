public class BST
{
    public BSTNode root;
    public int count_two=0;

    public void put( String key, Object value1, Object value2)
    {
	count_two++;
        if ( root == null )
		
        {

            root = new BSTNode( key, value1, value2);
        }
        else
        {
	    //count_two++;
            root.put( key, value1, value2);
        }
    }

    public Object get( String key )
	
    {
	count_two++;
        return root == null ? null : root.get( key );
    }
   public int getCount_two(){
	return count_two;
}

}
