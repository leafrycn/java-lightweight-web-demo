package com.github.leafrycn.service;

import com.github.leafrycn.jooby.pojo.Borrow;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BorrowService {

    private static final Logger log = LoggerFactory.getLogger(BorrowService.class);
    public Integer addBorrow(Borrow borrow) {
        // TODO add real database operation
        log.info("add record... ");
        return 1;
    }

}
