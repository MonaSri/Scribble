package com.nuokart.scribble.db;

/**
 * Created by Mona Srivastava on 21/08/2016.
 */
        import android.provider.BaseColumns;

/**
 * Created by Mona Srivastava on 10/06/2016.
 */

/**
 * Created by Mona Srivastava on 09/06/2016.
 */
public class TaskContract {

    public static final String DB_NAME = "com.nuokart.scribble.db";

    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {

        public static final String TABLE = "tasks";

        public static final String COL_TASK_TITLE = "title";

    }
}
