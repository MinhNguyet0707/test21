package com.company.Model_Excerise_3;

public class Dictionary {
    private String keyword;
    private String description;
    private Word_type word_type;

    public Dictionary(String keyword, String description, Word_type word_type) {
        this.keyword = keyword;
        this.description = description;
        this.word_type = word_type;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Word_type getWord_type() {
        return word_type;
    }

    public void setWord_type(Word_type word_type) {
        this.word_type = word_type;
    }
}
