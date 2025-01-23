package com.example.serachBook.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.serachBook.Domain.Book;
import com.example.serachBook.Service.BookService;

@Controller
public class BookController {


	@Autowired
	private BookService bookService;

	//initial loading page
	@GetMapping("/")
	public String showAddBookForm(Model model) {
		List<Book> bookList = bookService.listBookAll();
		model.addAttribute("books", bookList);
		return "index"; 
	}

	@GetMapping("/books")
    public String listBooks(@RequestParam(value = "keyword", required = false) String keyword, Model model) {
        List<Book> books;

        // Check if a keyword is provided for search
        if (keyword != null && !keyword.isEmpty()) {
            books = bookService.listAll(keyword);
        } else {
            books = bookService.listBookAll();
        }
        model.addAttribute("books", books);
        return "index";
    }
	
	
	@GetMapping("/books/edit/{id}")
    public String editBookForm(@PathVariable("id") int id, Model model) throws Exception {
		Book book = bookService.getBookById(id); // Fetch the book by ID
	    if (book == null) {
	        throw new Exception("Book not found with ID: " + id);
	    }
	    model.addAttribute("book", book);
	    return "edit-book"; 
    }

    @PostMapping("/edit")
    public String updateBook(@ModelAttribute Book book) {
        bookService.updateBook(book); // Call service to save the updated book
        return "index"; // Redirect to the book list page
    }
    
    
    @PostMapping("/books/delete/{id}")
    public String deleteBook(@PathVariable Long id) {
        bookService.deleteBookById(id); // Delegate deletion to the service layer
        return "index"; // Redirect to the book list page
    }

}
