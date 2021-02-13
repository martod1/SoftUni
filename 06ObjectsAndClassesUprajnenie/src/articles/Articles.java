package articles;

public class Articles {
   private String title;
   private String content;
   private String author;

   public Articles (String title, String content, String author){
       this.title = title;
       this.content = content;
       this.author = author;
   }

   public String getTitle() {
        return title;
    }
    public void rename(String title) {
        this.title = title;
    }
    public String getContent() {
       return content;
    }
    public void edit(String content) {
        this.content = content;
    }
    public String getAuthor() {
        return author;
    }
    public void changeAuthor(String author){
        this.author = author;
    }

    @Override
    public String toString (){
        String output = String.format("%s - %s: %s", this.title, this.content, this.author) ;
        return output;
    }
}
