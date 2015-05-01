package com.maddenabbott.jenny.template;

import java.io.File;

/**
 * Represents a template.
 */
public class Template {
  private final String name;
  private final File directory;

  public Template(final File directory) {
    this.directory = directory;
    this.name = directory.getName();
  }

  public String getName() {
    return name;
  }
}
