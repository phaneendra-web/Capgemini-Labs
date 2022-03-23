package lab4;
import java.util.Arrays;
import java.util.Objects;
class Cart{
	Item [] items=new Item[10];
	int cnt;
	public void addItem(Item item)
	{
		if(cnt<10 && item.isCheckedIn())
		{
			if(item.getNoOfCopies()==0)
			{
				System.out.println("Stock not available.");
				return;
			}
			this.items[cnt]=item;
			item.setNoOfCopies(item.getNoOfCopies()-1);
			cnt++;
		}
		else if(cnt>9)
			System.out.println("Cart is full, please complete rhis order and make a new one.");
		else
			System.out.println("Please check in to add item.");
	}
	@Override
	public String toString() {
		return "Cart [items=" + Arrays.toString(items) + "]";
	}
}
abstract class Item{
	private int id;
	private String title;
	private int noOfCopies;
	private static boolean checkedIn;
	private Cart inCart;
	public boolean isCheckedIn() {
		return checkedIn;
	}
	public static void setCheckedIn(boolean checkedin) {
		checkedIn = checkedin;
	}
	public Item(int id,String title, int noOfCopies)
	{
		this.id=id;
		this.title=title;
		this.noOfCopies=noOfCopies;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, noOfCopies, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return id == other.id && noOfCopies == other.noOfCopies && Objects.equals(title, other.title);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNoOfCopies() {
		return noOfCopies;
	}
	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", title=" + title + ", noOfCopies=" + noOfCopies + "]";
	}
	public Cart getInCart() {
		return inCart;
	}
	public void setInCart(Cart inCart) {
		this.inCart = inCart;
	}
	
}
class WrittenItem extends Item{
	private String author;
	WrittenItem(int id,String title, int noOfCopies)
	{
		super(id,title,noOfCopies);
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
}
class Book extends WrittenItem{
	Book(int id,String title, int noOfCopies)
	{
		super(id,title,noOfCopies);
	}
}
class JournalPaper extends WrittenItem{
	private int publishedYear;
	JournalPaper(int id,String title, int noOfCopies)
	{
		super(id,title,noOfCopies);
	}
	public int getPublishedYear() {
		return publishedYear;
	}
	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}
}
class MediaItem extends Item{
	private int runtime ;
	MediaItem(int id,String title, int noOfCopies)
	{
		super(id,title,noOfCopies);
	}
	public int getRuntime() {
		return runtime;
	}
	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
}
class Video extends MediaItem{
	private String director;
	private String genre;
	private int yearOfRelease;
	Video(int id,String title, int noOfCopies)
	{
		super(id,title,noOfCopies);
	}
	Video(int id,String title, int noOfCopies,String director,String genre,int yearOfRelease)
	{
		super(id,title,noOfCopies);
		this.director=director;
		this.genre=genre;
		this.yearOfRelease=yearOfRelease;
	}
	@Override
	public String toString() {
		return "Video [id=" + getId() + ", title=" + getTitle() + ", noOfCopies=" + getNoOfCopies()+", director=" + director + ", genre=" + genre + ", yearOfRelease=" + yearOfRelease + "]";
	}
}
class CD extends MediaItem{
	private String artist;
	private String genre;
	CD(int id,String title, int noOfCopies)
	{
		super(id,title,noOfCopies);
	}
	CD(int id,String title, int noOfCopies,String artist,String genre)
	{
		super(id,title,noOfCopies);
		this.artist=artist;
		this.genre=genre;
	}
	@Override
	public String toString() {
		return "CD [id=" + getId() + ", title=" + getTitle() + ", noOfCopies=" + getNoOfCopies()+"artist=" + artist + ", genre=" + genre + "]";
	}
}

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item item1=new CD(101,"CD1",3,"Dsp","Dsp music");
		Item item2=new Video(102,"Vid1",5,"thaman","music",2017);
		System.out.println(item1);
		System.out.println(item2);
		Cart cart=new Cart();
		Item.setCheckedIn(true);
		System.out.println(item2.isCheckedIn());
		cart.addItem(item1);
		System.out.println(cart);
	}

}