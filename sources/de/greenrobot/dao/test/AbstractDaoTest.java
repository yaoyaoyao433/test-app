package de.greenrobot.dao.test;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.DaoLog;
import de.greenrobot.dao.IdentityScope;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.UnitTestDaoAccess;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class AbstractDaoTest<D extends AbstractDao<T, K>, T, K> extends DbTest<Application> {
    protected D dao;
    protected UnitTestDaoAccess<T, K> daoAccess;
    protected final Class<D> daoClass;
    protected IdentityScope<K, T> identityScopeForDao;
    protected Property pkColumn;

    public AbstractDaoTest(Class<D> cls) {
        this(cls, true);
    }

    public AbstractDaoTest(Class<D> cls, boolean z) {
        super(z);
        this.daoClass = cls;
    }

    public void setIdentityScopeBeforeSetUp(IdentityScope<K, T> identityScope) {
        this.identityScopeForDao = identityScope;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r0v3, types: [D extends de.greenrobot.dao.AbstractDao<T, K>, de.greenrobot.dao.AbstractDao] */
    @Override // de.greenrobot.dao.test.DbTest
    public void setUp() {
        super.setUp();
        try {
            setUpTableForDao();
            this.daoAccess = new UnitTestDaoAccess<>(this.db, this.daoClass, this.identityScopeForDao);
            this.dao = this.daoAccess.getDao();
        } catch (Exception e) {
            throw new RuntimeException("Could not prepare DAO Test", e);
        }
    }

    protected void setUpTableForDao() throws Exception {
        try {
            this.daoClass.getMethod("createTable", SQLiteDatabase.class, Boolean.TYPE).invoke(null, this.db, Boolean.FALSE);
        } catch (NoSuchMethodException unused) {
            DaoLog.i("No createTable method");
        }
    }

    protected void clearIdentityScopeIfAny() {
        if (this.identityScopeForDao != null) {
            this.identityScopeForDao.clear();
            DaoLog.d("Identity scope cleared");
            return;
        }
        DaoLog.d("No identity scope to clear");
    }

    protected void logTableDump() {
        logTableDump(this.dao.getTablename());
    }
}
