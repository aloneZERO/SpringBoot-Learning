package com.didispace.exception;

import com.didispace.dto.WebResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    private static final String DEFAULT_ERROR_VIEW = "error";

    @ExceptionHandler(Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest request, Exception e) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e);
        mav.addObject("url", request.getRequestURL());
        mav.setViewName(DEFAULT_ERROR_VIEW);
        return mav;
    }

    @ResponseBody
    @ExceptionHandler(MyException.class)
    public WebResult<String> jsonErrorHanlder(HttpServletRequest request, MyException e) {
        WebResult<String> result = new WebResult<>();
        result.setMessage(e.getMessage());
        result.setCode(WebResult.ERROR);
        result.setData("Some Data.");
        result.setUrl(request.getRequestURL().toString());
        return result;
    }

}

