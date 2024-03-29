package com.hachicore.demospring51;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

@Component
public class EventFormatter implements Formatter<Event> {

//  @Autowired
//  MessageSource messageSource;

  @Override
  public Event parse(String text, Locale locale) throws ParseException {
    return new Event(Integer.parseInt(text));
  }

  @Override
  public String print(Event object, Locale locale) {
    // messageSource.getMessage("title", locale);
    return object.getId().toString();
  }

}
