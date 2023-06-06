package de.greenrobot.dao;

import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class AbstractDaoMaster {
    protected final Map<Class<? extends AbstractDao<?, ?>>, DaoConfig> daoConfigMap = new HashMap();
    protected final SQLiteDatabase db;
    protected final int schemaVersion;

    public abstract AbstractDaoSession newSession();

    public abstract AbstractDaoSession newSession(IdentityScopeType identityScopeType);

    public AbstractDaoMaster(SQLiteDatabase sQLiteDatabase, int i) {
        this.db = sQLiteDatabase;
        this.schemaVersion = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void registerDaoClass(Class<? extends AbstractDao<?, ?>> cls) {
        this.daoConfigMap.put(cls, new DaoConfig(this.db, cls));
    }

    public int getSchemaVersion() {
        return this.schemaVersion;
    }

    public SQLiteDatabase getDatabase() {
        return this.db;
    }
}
