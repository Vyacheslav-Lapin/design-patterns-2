package com.xpinjection.patterns.factorymethod.canonical;

import java.util.LinkedHashMap;
import java.util.Map;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import static lombok.AccessLevel.PRIVATE;

@ToString
@RequiredArgsConstructor
@FieldDefaults(level = PRIVATE, makeFinal = true)
public class JsonDocument implements Document {

  @Getter
  String name;

  Map<String, String> fields = new LinkedHashMap<>();

  @Override
  public void addField(String name, String value) {
    fields.put(name, value);
  }
}
