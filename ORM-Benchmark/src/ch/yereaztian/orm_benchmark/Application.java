package ch.yereaztian.orm_benchmark;

import ch.yereaztian.orm_benchmark.greendao.GreenDaoExecutor;
import ch.yereaztian.orm_benchmark.ormlite.ORMLiteExecutor;
import ch.yereaztian.orm_benchmark.sqlite.SQLiteExecutor;


public class Application extends android.app.Application {

    private static final boolean USE_IN_MEMORY_DB = true;

    @Override
    public void onCreate() {
        super.onCreate();

        SQLiteExecutor.INSTANCE.init(this, USE_IN_MEMORY_DB);
        ORMLiteExecutor.INSTANCE.init(this, USE_IN_MEMORY_DB);
        GreenDaoExecutor.INSTANCE.init(this, USE_IN_MEMORY_DB);
    }
}
