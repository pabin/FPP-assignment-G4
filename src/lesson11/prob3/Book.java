package lesson11.prob3;

class Book {
    private String ISBN;
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Book{ISBN='").append(ISBN).append("', ")
                .append("title='").append(title).append("', ")
                .append("author='").append(author).append("', ")
                .append("isBorrowed=").append(isBorrowed)
                .append("}");
        return sb.toString();
    }
}
