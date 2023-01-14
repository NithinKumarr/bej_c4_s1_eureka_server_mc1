
package com.niit.Music.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT,reason = "Music Not Found")
public class MusicNotFoundException extends Exception{
}
