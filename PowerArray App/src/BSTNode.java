public class BSTNode {

    private String key;
    private Object value1;
    private Object value2;
    private BSTNode left, right;
    public int count=0;

    public BSTNode( String key, Object value1, Object value2)
    {
        this.key = key;
        this.value1 = value1;
	this.value2 = value2;
    }

   public int getCount(){
	return count;
}

    //if key not found in BST then it is added. If jey already exists then that node's value
    //is updated.
    public void put( String key, Object value1, Object value2)
    {
	//count++;
        if ( key.compareTo( this.key ) < 0 ) 
       
        {      
	//count++;       
            if ( left != null )             
            { 
		                
                left.put( key, value1, value2);            
            }             
            else             
            {       
                left = new BSTNode( key, value1, value2);             
            }         
        }         
        else if ( key.compareTo( this.key ) > 0 )
        {
	//count++;
            if ( right != null )

            {
	//count++;
                right.put( key, value1, value2);

            }
            else
            {
	//count++;
                right = new BSTNode( key, value1, value2);
            }
        }
        else
        {
            //update this one
            //this.value = value;
            this.value1 = value1;
	    this.value2 = value2;
        }
    }

    //find Node with given key and return it's value
    public String get( String key)

    {
	    count++;
        if ( this.key.equals( key ) )
        {
	count++;
            return (key+" "+value1+" "+value2);
        }
	count++;
        if ( key.compareTo( this.key ) < 0 )
        {
            return left == null ? null : left.get( key );
	   
        }
        else
        {
            return right == null ? null : right.get( key );
        }
    }

}

