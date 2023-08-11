package com.tang.service;

import org.springframework.stereotype.Service;



public interface AccountService {
   boolean  decrease(Long userId,Integer money);
}
