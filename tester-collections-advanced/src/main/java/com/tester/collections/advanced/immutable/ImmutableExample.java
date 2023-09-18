package com.tester.collections.advanced.immutable;

import com.tester.collections.advanced.immutable.homework.TaskRecord;

public class ImmutableExample {

    public static void main(String[] args) {
        BookRecord bookRecord = new BookRecord("Author", "Title", 2023);

        TaskRecord taskRecord = new TaskRecord("Title", 10);
    }
}
