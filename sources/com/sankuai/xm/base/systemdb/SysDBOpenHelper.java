package com.sankuai.xm.base.systemdb;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.DefaultDatabaseErrorHandler;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.db.DBCorruptException;
import com.sankuai.xm.base.db.DBFullException;
import com.sankuai.xm.base.db.d;
import com.sankuai.xm.base.db.f;
import com.sankuai.xm.base.db.h;
import com.sankuai.xm.base.db.i;
import com.sankuai.xm.log.c;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class SysDBOpenHelper implements DatabaseErrorHandler, h {
    public static ChangeQuickRedirect a;
    private a b;
    private SysDBDatabase c;
    private d d;
    private Context e;

    @Override // com.sankuai.xm.base.db.h
    public final void a(String str, Context context, String str2, int i, i iVar, d dVar) {
        Object[] objArr = {str, context, str2, Integer.valueOf(i), iVar, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d93f426e08a68b693df92a3ed28cb730", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d93f426e08a68b693df92a3ed28cb730");
            return;
        }
        c.b("SysDBOpenHelper", "SysDBOpenHelper::init db name:%s", str2);
        synchronized (this) {
            this.c = null;
            this.d = dVar;
            this.e = context;
            this.b = new a(str, context, str2, i, iVar, this);
        }
    }

    @Override // com.sankuai.xm.base.db.h
    public final com.sankuai.xm.base.db.c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d687d9603157b4cd3bc2de09557d76b3", 6917529027641081856L)) {
            return (com.sankuai.xm.base.db.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d687d9603157b4cd3bc2de09557d76b3");
        }
        try {
            synchronized (this) {
                if (this.c == null) {
                    this.c = new SysDBDatabase();
                }
                if (this.b != null) {
                    if (!(this.c.b != null)) {
                        this.c.b = this.b.getWritableDatabase();
                    }
                }
            }
            return this.c;
        } catch (RuntimeException e) {
            c.a("SysDBOpenHelper", e);
            if (e instanceof SQLiteDatabaseLockedException) {
                throw a(e);
            }
            if ((e instanceof SQLException) || (e instanceof SQLiteException) || (e instanceof f)) {
                throw new DBCorruptException(e);
            }
            throw a(e);
        }
    }

    @Override // com.sankuai.xm.base.db.h
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a473e0ed61c4ee7c8390dc48a1f0280", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a473e0ed61c4ee7c8390dc48a1f0280");
            return;
        }
        com.sankuai.xm.base.db.c a2 = a();
        if (a2 == null || !a2.g()) {
            return;
        }
        a2.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c1 A[Catch: Throwable -> 0x00d4, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Throwable -> 0x00d4, blocks: (B:30:0x00c1, B:38:0x00d0), top: B:49:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    @Override // com.sankuai.xm.base.db.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(android.content.Context r17, java.lang.String r18, boolean r19, java.lang.String r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.base.systemdb.SysDBOpenHelper.a(android.content.Context, java.lang.String, boolean, java.lang.String, boolean):int");
    }

    @Override // android.database.DatabaseErrorHandler
    public void onCorruption(SQLiteDatabase sQLiteDatabase) {
        Object[] objArr = {sQLiteDatabase};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "435482e7bec0f1025fd6a9050679de2c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "435482e7bec0f1025fd6a9050679de2c");
            return;
        }
        synchronized (this) {
            this.c.b = null;
        }
        if (this.d != null) {
            SysDBDatabase sysDBDatabase = new SysDBDatabase();
            sysDBDatabase.b = sQLiteDatabase;
            this.d.g(sysDBDatabase);
            return;
        }
        new DefaultDatabaseErrorHandler().onCorruption(sQLiteDatabase);
    }

    public static RuntimeException a(RuntimeException runtimeException) {
        Object[] objArr = {runtimeException};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cdce9d6266a93cd3d452cc05d7ac2e85", 6917529027641081856L)) {
            return (RuntimeException) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cdce9d6266a93cd3d452cc05d7ac2e85");
        }
        if (runtimeException instanceof f) {
            return runtimeException;
        }
        if (runtimeException instanceof SQLiteFullException) {
            return new DBFullException(runtimeException);
        }
        if (runtimeException instanceof SQLiteDatabaseCorruptException) {
            return new DBCorruptException(runtimeException);
        }
        if (runtimeException instanceof SQLiteException) {
            return new f(runtimeException);
        }
        if (runtimeException instanceof SQLException) {
            return new f(runtimeException);
        }
        return new RuntimeException(runtimeException);
    }
}
