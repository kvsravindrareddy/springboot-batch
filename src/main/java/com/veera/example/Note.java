package com.veera.example;

import java.util.Objects;

public class Note {
    private String name;
    private String tagName;

    public Note() {

    }

    public Note(String name, String tagName) {
        this.name = name;
        this.tagName = tagName;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getTagName() {
        return tagName;
    }
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Note)) return false;
        Note note = (Note) o;
        return Objects.equals(name, note.name) && Objects.equals(tagName, note.tagName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, tagName);
    }

    @Override
    public String toString() {
        return "Note{" +
                "name='" + name + '\'' +
                ", tagName='" + tagName + '\'' +
                '}';
    }
}