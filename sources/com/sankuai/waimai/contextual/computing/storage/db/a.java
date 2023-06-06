package com.sankuai.waimai.contextual.computing.storage.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.sankuai.waimai.contextual.computing.storage.sp.ContextualComputingSP;
import com.sankuai.waimai.foundation.location.e;
import com.sankuai.waimai.foundation.location.v2.g;
import com.sankuai.waimai.platform.utils.o;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static volatile a c;
    public C0931a b;
    private final Object d;
    private com.sankuai.waimai.contextual.computing.config.a e;

    public static /* synthetic */ void a(a aVar, long j, int i, int i2, long j2) {
        int i3 = 3;
        Object[] objArr = {new Long(j), Integer.valueOf(i), Integer.valueOf(i2), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "3884e45a0c43b2ea88adb579c6d8bbd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "3884e45a0c43b2ea88adb579c6d8bbd0");
            return;
        }
        synchronized (aVar.d) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("time", Long.valueOf(System.currentTimeMillis()));
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(new Date());
                int i4 = calendar.get(11);
                if (i4 >= 5 && i4 <= 9) {
                    i3 = 0;
                } else if (i4 >= 10 && i4 <= 15) {
                    i3 = 1;
                } else if (i4 >= 16 && i4 <= 19) {
                    i3 = 2;
                }
                int i5 = calendar.get(7) - 1;
                if (i5 == 0) {
                    i5 = 7;
                }
                contentValues.put("phase", Integer.valueOf(i3));
                contentValues.put("week_day", Integer.valueOf(i5));
                contentValues.put("addr_base", String.valueOf(j));
                contentValues.put("action_type", Integer.valueOf(i));
                contentValues.put("activate", Integer.valueOf(i2));
                contentValues.put(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, Long.valueOf(j2));
                contentValues.put("total_checked", (Integer) 0);
                aVar.b.getWritableDatabase().insert("wm_loc_address", null, contentValues);
            }
        }
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fd4e00baeb9c866fbd0da0cc8068129", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fd4e00baeb9c866fbd0da0cc8068129");
            return;
        }
        this.d = new Object();
        this.b = new C0931a(b.a);
        this.e = ContextualComputingSP.a();
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "af2cf86569aa95757ee2f6a2ae389a3b", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "af2cf86569aa95757ee2f6a2ae389a3b");
        }
        if (c == null) {
            synchronized (a.class) {
                if (c == null) {
                    c = new a();
                }
            }
        }
        return c;
    }

    public final void a(final long j, final long j2) {
        Object[] objArr = {new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d1ee0ae634d4a1b14a9b46e9506948c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d1ee0ae634d4a1b14a9b46e9506948c");
        } else if (this.e.b) {
            com.sankuai.waimai.launcher.util.aop.b.a(o.a(), new Runnable() { // from class: com.sankuai.waimai.contextual.computing.storage.db.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    long j3;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b93b82d7c02d83908a5b12431d5a1d59", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b93b82d7c02d83908a5b12431d5a1d59");
                        return;
                    }
                    long j4 = j;
                    g a2 = g.a();
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = g.a;
                    if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "737029df68aa0c734916afa016dd25af", RobustBitConfig.DEFAULT_VALUE)) {
                        j3 = ((Long) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "737029df68aa0c734916afa016dd25af")).longValue();
                    } else {
                        j3 = a2.d != null ? a2.d.b : -1L;
                    }
                    boolean z = j4 == j3;
                    a.a(a.this, j, z ? 3 : 2, z ? a.this.e.f : a.this.e.e, j2);
                }
            });
        }
    }

    public final ArrayList<com.sankuai.waimai.contextual.computing.storage.model.a> a(String str) {
        Cursor rawQuery;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf8ae0de3eb3e8194636e905f6ee7866", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf8ae0de3eb3e8194636e905f6ee7866");
        }
        synchronized (this.d) {
            ArrayList<com.sankuai.waimai.contextual.computing.storage.model.a> arrayList = new ArrayList<>();
            Cursor cursor = null;
            try {
                try {
                    rawQuery = this.b.getWritableDatabase().rawQuery(str, null);
                } catch (Exception unused) {
                }
                try {
                } catch (Throwable th) {
                    th = th;
                    cursor = rawQuery;
                    if (e.a()) {
                        throw th;
                    }
                    com.sankuai.waimai.foundation.utils.log.a.b(th);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return arrayList;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            if (rawQuery.getCount() == 0) {
                if (rawQuery != null) {
                    try {
                        rawQuery.close();
                    } catch (Exception unused2) {
                    }
                }
                return arrayList;
            }
            rawQuery.moveToFirst();
            do {
                if (!rawQuery.isNull(0) && !rawQuery.isNull(1)) {
                    arrayList.add(new com.sankuai.waimai.contextual.computing.storage.model.a(Long.valueOf(rawQuery.getString(0)).longValue(), rawQuery.getInt(1)));
                }
            } while (rawQuery.moveToNext());
            if (rawQuery != null) {
                rawQuery.close();
            }
            return arrayList;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.contextual.computing.storage.db.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0931a extends SQLiteOpenHelper {
        public static ChangeQuickRedirect a;

        public C0931a(Context context) {
            super(context, "wm_location_recommend.db", (SQLiteDatabase.CursorFactory) null, 2);
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28fef6de6785274ee6c2eb56b2aebd2b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28fef6de6785274ee6c2eb56b2aebd2b");
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            Object[] objArr = {sQLiteDatabase};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d6edbf394ab75d0546a893e78050bde", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d6edbf394ab75d0546a893e78050bde");
                return;
            }
            try {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS wm_loc_address (time BIGINT NOT NULL PRIMARY KEY, phase INTEGER NOT NULL, week_day INTEGER NOT NULL, addr_base TEXT NOT NULL, action_type INTEGER NOT NULL, activate INTEGER NOT NULL, app_version BIGINT NOT NULL, total_checked INTEGER NOT NULL DEFAULT (0));");
            } catch (Exception e) {
                if (e.a()) {
                    throw e;
                }
                com.sankuai.waimai.foundation.utils.log.a.b(e);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            Object[] objArr = {sQLiteDatabase, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9e17c99c0cbe9245a31cf868345c19d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9e17c99c0cbe9245a31cf868345c19d");
            } else if (i != 2) {
                try {
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS wm_loc_address");
                    onCreate(sQLiteDatabase);
                } catch (Throwable th) {
                    if (e.a()) {
                        throw th;
                    }
                    com.sankuai.waimai.foundation.utils.log.a.b(th);
                }
            }
        }
    }
}
