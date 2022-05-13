package com.github.leafrycn.jooby;

import com.github.leafrycn.jooby.pojo.Borrow;
import com.github.leafrycn.service.BorrowService;
import io.jooby.Jooby;
import io.jooby.di.GuiceModule;

public class App extends Jooby {

    {
        install(new GuiceModule());
    }

    {
        get("/", ctx -> "Welcome");

        path("/api", () -> {
            get("/user/{userId}/borrow/{borrowId}", ctx -> {
                String userId = ctx.path("userId").value();
                String borrowId = ctx.path("borrowId").value();
                return String.format("find borrow record for userId : %s and borrowId : %s", userId, borrowId);
            });

            post("/borrow/add", ctx -> {
                Integer userId = ctx.form("userId").intValue();
                String item = ctx.form("item").value();
                BorrowService borrowService = require(BorrowService.class);
                borrowService.addBorrow(new Borrow(userId, item));
                return String.format("create borrow record for userId : %s and item : %s", userId, item);
            });
        });
    }

    public static void main(String[] args) {
        runApp(args, App::new);
    }

}
