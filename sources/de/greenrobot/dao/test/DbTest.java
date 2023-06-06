package de.greenrobot.dao.test;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;
import android.test.ApplicationTestCase;
import de.greenrobot.dao.DbUtils;
import java.util.Random;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class DbTest<T extends Application> extends ApplicationTestCase<T> {
    protected SQLiteDatabase db;
    protected final boolean inMemory;
    protected Random random;

    public DbTest() {
        this(true);
    }

    public DbTest(boolean z) {
        this(Application.class, z);
    }

    public DbTest(Class<T> cls, boolean z) {
        super(cls);
        this.inMemory = z;
        this.random = new Random();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setUp() {
        try {
            super.setUp();
            createApplication();
            setUpDb();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    protected void setUpDb() {
        if (this.inMemory) {
            this.db = SQLiteDatabase.create(null);
            return;
        }
        getApplication().deleteDatabase("test-db");
        this.db = getApplication().openOrCreateDatabase("test-db", 0, null);
    }

    protected void tearDown() throws Exception {
        this.db.close();
        if (!this.inMemory) {
            getApplication().deleteDatabase("test-db");
        }
        super.tearDown();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void logTableDump(String str) {
        DbUtils.logTableDump(this.db, str);
    }
}
