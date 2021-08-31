package CLDF_Est.minilesbackend.service.erro;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DatabaseExceptions extends RuntimeException{

    public DatabaseExceptions() {
        super();
    }
    public DatabaseExceptions(String s) {
        super(s);
    }
}
