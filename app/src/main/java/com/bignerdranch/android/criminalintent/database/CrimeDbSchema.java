package com.bignerdranch.android.criminalintent.database;

/**
 * 数据库表名，字段名
 */
public class CrimeDbSchema {

    // CrimeTable 内部类
    public static final class CrimeTable {

        public static final String NAME = "crimes";

        // 定义数据表字段
        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String SOLVED = "solved";
            public static final String SUSPECT = "suspect";
        }
    }

}
