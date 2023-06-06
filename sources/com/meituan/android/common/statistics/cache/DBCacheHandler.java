package com.meituan.android.common.statistics.cache;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.cache.ICacheHandler;
import com.meituan.android.common.statistics.utils.DESHelper;
import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DBCacheHandler extends SQLiteOpenHelper implements ICacheHandler {
    private static final int SCHEMA_VERSION = 7;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile DBCacheHandler instance;

    public DBCacheHandler(Context context) {
        super(context, Constants.CACHE_DB_NAME, (SQLiteDatabase.CursorFactory) null, 7);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0344de540c5e199bf76e896a7d2f5928", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0344de540c5e199bf76e896a7d2f5928");
        }
    }

    public static DBCacheHandler getInstance(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c74edfc72ba9ef6b03ff385ba9133166", 6917529027641081856L)) {
            return (DBCacheHandler) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c74edfc72ba9ef6b03ff385ba9133166");
        }
        if (instance == null) {
            synchronized (DBCacheHandler.class) {
                if (instance == null) {
                    instance = new DBCacheHandler(context);
                }
            }
        }
        return instance;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Object[] objArr = {sQLiteDatabase};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b1c9c8020d76de62c323915bb043b31", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b1c9c8020d76de62c323915bb043b31");
        } else {
            createTable2(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Object[] objArr = {sQLiteDatabase, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b318acbffd2ddb27c016c985c832f793", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b318acbffd2ddb27c016c985c832f793");
        } else if (i < 7) {
            sQLiteDatabase.beginTransaction();
            try {
                LogUtil.log("db:onUpgrade oldVersion<7");
                sQLiteDatabase.execSQL(DESHelper.decrypt("TXul98jNfsxAJgV4jDjKCSIV1xv/HRlxiZEUhDLKd6w="));
                createTable2(sQLiteDatabase);
                sQLiteDatabase.setTransactionSuccessful();
            } catch (Exception e) {
                LogUtil.reportErrorImmediateSC("onUpgrade", e.toString());
            } finally {
                sQLiteDatabase.endTransaction();
            }
        }
    }

    @Override // com.meituan.android.common.statistics.cache.ICacheHandler
    public void writeEvent(ICacheHandler.Event event) {
        Object[] objArr = {event};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ffba7614b028bad86af52ce74fb335bb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ffba7614b028bad86af52ce74fb335bb");
            return;
        }
        if (event != null) {
            try {
                if (!TextUtils.isEmpty(event.getChannel()) && event.getEnvironment() != null && event.getEvs() != null) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("channel", event.getChannel());
                    if (event.getEnvironment() != null) {
                        contentValues.put("environment", event.getEnvironment().toString());
                    }
                    if (event.getEvs() != null) {
                        contentValues.put("evs", event.getEvs().toString());
                    }
                    contentValues.put("level", Integer.valueOf(event.getLevel()));
                    contentValues.put("ctm", Long.valueOf(event.getCtm()));
                    contentValues.put("pfcount", Integer.valueOf(event.getPfCount()));
                    synchronized (this) {
                        try {
                            event.setId(getWritableDatabase().insert("event", null, contentValues));
                        }
                    }
                    return;
                }
            } catch (Throwable th) {
                LogUtil.reportErrorImmediateSC("writeEvent_contentValue", th.toString());
                return;
            }
        }
        LogUtil.reportErrorImmediateSC("writeEvent_parameter", "writeEvent(event) parameter error");
    }

    @Override // com.meituan.android.common.statistics.cache.ICacheHandler
    public void writeEvent(List<ICacheHandler.Event> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "04c56e12016dece557e1255551c8e7d0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "04c56e12016dece557e1255551c8e7d0");
            return;
        }
        synchronized (this) {
            try {
                if (list == null) {
                    return;
                }
                for (ICacheHandler.Event event : list) {
                    writeEvent(event);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.meituan.android.common.statistics.cache.ICacheHandler
    public void removeEvent(ICacheHandler.Event event) {
        SQLiteDatabase writableDatabase;
        Object[] objArr = {event};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e90fba04880928f6db1118fbeb739ad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e90fba04880928f6db1118fbeb739ad");
        } else if (event == null) {
        } else {
            synchronized (this) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        writableDatabase = getWritableDatabase();
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        writableDatabase.beginTransaction();
                        writableDatabase.delete("event", "autokey = ?", new String[]{String.valueOf(event.getId())});
                        writableDatabase.setTransactionSuccessful();
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteDatabase = writableDatabase;
                        LogUtil.reportErrorImmediateSC("removeEvent_event", th.toString());
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.endTransaction();
                        }
                    }
                    if (writableDatabase != null) {
                        writableDatabase.endTransaction();
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // com.meituan.android.common.statistics.cache.ICacheHandler
    public boolean removeEvent(List<ICacheHandler.Event> list) {
        StringBuilder sb;
        boolean z = false;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "819fc1bd41999137248f38abae07ea36", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "819fc1bd41999137248f38abae07ea36")).booleanValue();
        }
        if (list != null) {
            try {
                if (list.size() != 0) {
                    int size = list.size();
                    String[] strArr = new String[size];
                    for (int i = 0; i < size; i++) {
                        strArr[i] = String.valueOf(list.get(i).getId());
                    }
                    if (size == 1) {
                        sb = new StringBuilder(" autokey = ? ");
                    } else {
                        sb = new StringBuilder(" autokey in (");
                        while (true) {
                            if (size <= 0) {
                                break;
                            }
                            sb.append(CommonConstant.Symbol.QUESTION_MARK);
                            size--;
                            if (size == 0) {
                                sb.append(" ) ");
                                break;
                            }
                            sb.append(CommonConstant.Symbol.COMMA);
                        }
                    }
                    synchronized (this) {
                        SQLiteDatabase sQLiteDatabase = null;
                        try {
                            try {
                                SQLiteDatabase writableDatabase = getWritableDatabase();
                                try {
                                    writableDatabase.beginTransaction();
                                    writableDatabase.delete("event", sb.toString(), strArr);
                                    writableDatabase.setTransactionSuccessful();
                                    if (writableDatabase != null) {
                                        writableDatabase.endTransaction();
                                    }
                                    z = true;
                                } catch (Throwable th) {
                                    th = th;
                                    sQLiteDatabase = writableDatabase;
                                    LogUtil.reportErrorImmediateSC("removeEvent_event_list", th.toString());
                                    if (sQLiteDatabase != null) {
                                        sQLiteDatabase.endTransaction();
                                    }
                                    return z;
                                }
                            } catch (Throwable unused) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    return z;
                }
            } catch (Throwable unused2) {
                return false;
            }
        }
        return false;
    }

    @Override // com.meituan.android.common.statistics.cache.ICacheHandler
    public boolean removeEventById(List<Long> list) {
        SQLiteDatabase writableDatabase;
        boolean z = false;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12bbe14141eab206f3a4e6641891d991", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12bbe14141eab206f3a4e6641891d991")).booleanValue();
        }
        if (list == null) {
            return false;
        }
        synchronized (this) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                try {
                    writableDatabase = getWritableDatabase();
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    writableDatabase.beginTransaction();
                    for (int i = 0; i < list.size(); i++) {
                        writableDatabase.delete("event", "autokey = ?", new String[]{String.valueOf(list.get(i))});
                    }
                    writableDatabase.setTransactionSuccessful();
                    if (writableDatabase != null) {
                        writableDatabase.endTransaction();
                    }
                    z = true;
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteDatabase = writableDatabase;
                    LogUtil.reportErrorImmediateSC("removeEventById_ids", th.toString());
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.endTransaction();
                    }
                    return z;
                }
            } catch (Throwable unused) {
            }
        }
        return z;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // com.meituan.android.common.statistics.cache.ICacheHandler
    public java.util.List<com.meituan.android.common.statistics.cache.ICacheHandler.Event> getEvent(java.lang.String r21, java.lang.String[] r22, int r23) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.statistics.cache.DBCacheHandler.getEvent(java.lang.String, java.lang.String[], int):java.util.List");
    }

    @Override // com.meituan.android.common.statistics.cache.ICacheHandler
    public int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c991c3bd25ddf08e57ad46c77460639a", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c991c3bd25ddf08e57ad46c77460639a")).intValue();
        }
        synchronized (this) {
            Cursor cursor = null;
            try {
                try {
                    Cursor rawQuery = getReadableDatabase().rawQuery(DESHelper.decrypt("DzQ2/zXMuDdsasQ9OFBp44HlsuGbVOeH+Cvcro4kjis="), null);
                    if (rawQuery != null) {
                        try {
                            if (rawQuery.moveToFirst()) {
                                int i = rawQuery.getInt(0);
                                if (rawQuery != null && !rawQuery.isClosed()) {
                                    rawQuery.close();
                                }
                                return i;
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = rawQuery;
                            LogUtil.reportErrorImmediateSC("getCount", th.toString());
                            if (cursor != null && !cursor.isClosed()) {
                                cursor.close();
                            }
                            return 0;
                        }
                    }
                    if (rawQuery != null && !rawQuery.isClosed()) {
                        rawQuery.close();
                    }
                    return 0;
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Override // com.meituan.android.common.statistics.cache.ICacheHandler
    public int getCount(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a5408e1305f8e8fd7de4ae7a5409a807", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a5408e1305f8e8fd7de4ae7a5409a807")).intValue();
        }
        synchronized (this) {
            Cursor cursor = null;
            try {
                try {
                    Cursor rawQuery = getReadableDatabase().rawQuery(DESHelper.decrypt("DzQ2/zXMuDdsasQ9OFBp44HlsuGbVOeHTd7FM3pf3PZJ9t2HI9gLY/4Axdp9WAYi"), new String[]{String.valueOf(i)});
                    if (rawQuery != null) {
                        try {
                            if (rawQuery.moveToFirst()) {
                                int i2 = rawQuery.getInt(0);
                                if (rawQuery != null && !rawQuery.isClosed()) {
                                    rawQuery.close();
                                }
                                return i2;
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = rawQuery;
                            LogUtil.reportErrorImmediateSC("getCount_level", th.toString());
                            if (cursor != null && !cursor.isClosed()) {
                                cursor.close();
                            }
                            return 0;
                        }
                    }
                    if (rawQuery != null && !rawQuery.isClosed()) {
                        rawQuery.close();
                    }
                    return 0;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.meituan.android.common.statistics.cache.ICacheHandler
    public int getCount(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e20e4c3ebc292fe13c9b411daa7ccbd7", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e20e4c3ebc292fe13c9b411daa7ccbd7")).intValue();
        }
        synchronized (this) {
            Cursor cursor = null;
            try {
                try {
                    try {
                        Cursor rawQuery = getReadableDatabase().rawQuery(DESHelper.decrypt("DzQ2/zXMuDdsasQ9OFBp44HlsuGbVOeHTd7FM3pf3PanVQqNAfS12w=="), new String[]{String.valueOf(j)});
                        if (rawQuery != null) {
                            try {
                                if (rawQuery.getCount() != 0) {
                                    rawQuery.moveToFirst();
                                    int i = rawQuery.getInt(0);
                                    if (rawQuery != null && !rawQuery.isClosed()) {
                                        rawQuery.close();
                                    }
                                    return i;
                                }
                            } catch (Exception e) {
                                e = e;
                                cursor = rawQuery;
                                LogUtil.reportErrorImmediateSC("getCount_timeMillis", e.toString());
                                if (cursor != null && !cursor.isClosed()) {
                                    cursor.close();
                                }
                                return 0;
                            } catch (Throwable th) {
                                th = th;
                                cursor = rawQuery;
                                if (cursor != null && !cursor.isClosed()) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        }
                        if (rawQuery != null && !rawQuery.isClosed()) {
                            rawQuery.close();
                        }
                        return 0;
                    } finally {
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // com.meituan.android.common.statistics.cache.ICacheHandler
    public void updateJsonPackFailedCount(List<ICacheHandler.Event> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1bff4ac419065cf8234f227e573c84fc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1bff4ac419065cf8234f227e573c84fc");
            return;
        }
        synchronized (this) {
            StringBuilder sb = new StringBuilder("autokey in (");
            for (ICacheHandler.Event event : list) {
                sb.append(event.getId());
                sb.append(CommonConstant.Symbol.COMMA);
            }
            sb.replace(sb.length() - 1, sb.length(), CommonConstant.Symbol.BRACKET_RIGHT);
            String str = new String(sb);
            getWritableDatabase().execSQL(DESHelper.decrypt("rlrTm2oxoh3VyVEJ3oOctemHblzmGyBzxig3pusz3wBtwZcIXC/grbMxc6wTpS1f") + str);
        }
    }

    @Override // com.meituan.android.common.statistics.cache.ICacheHandler
    public void deletePostData(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff9c57a5c4a7cdc3aed0d8ed75f119b8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff9c57a5c4a7cdc3aed0d8ed75f119b8");
            return;
        }
        synchronized (this) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (j <= 0) {
                return;
            }
            writableDatabase.execSQL(DESHelper.decrypt("OhVg8qU0a7g/sbPFC2FfP7wbYMSVaYu3/VGDtpbA/ZU=") + String.valueOf(j));
        }
    }

    private void createTable(SQLiteDatabase sQLiteDatabase) {
        Object[] objArr = {sQLiteDatabase};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c2484d761135560451f69cb6258778ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c2484d761135560451f69cb6258778ee");
        } else {
            sQLiteDatabase.execSQL(DESHelper.decrypt("dggUAg8ZXUqAp9v+5q43TMkK1UKEEvAhFnqO3QIin5ycK9Hl6pFUwI8UnymneqfWCqNHUxCwQ7MD2FE5ce2vgSuLLRoZbrFbc5WGyoVsSIjl54QbjxmPsDzaPIZRr/lsBiAimzSm07BknB5f8tBTveCXMQl8oNqiIo7hWN4QJH+LgVkuOiDPDG1SOD0NyOJ+"));
        }
    }

    @Override // com.meituan.android.common.statistics.cache.ICacheHandler
    public void deleteJsonSyntaxErrorData(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7e84a299722ccd591fc0c730e0cc663", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7e84a299722ccd591fc0c730e0cc663");
            return;
        }
        synchronized (this) {
            try {
                if (i <= 0) {
                    return;
                }
                SQLiteDatabase writableDatabase = getWritableDatabase();
                writableDatabase.execSQL(DESHelper.decrypt("OhVg8qU0a7g/sbPFC2FfP7wbYMSVaYu3ffs8lModQWy7rZ4DDlYTaw==") + i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void dropTable(SQLiteDatabase sQLiteDatabase) {
        Object[] objArr = {sQLiteDatabase};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f1884eaf92cd97160af2f5f6b9997b3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f1884eaf92cd97160af2f5f6b9997b3");
            return;
        }
        LogUtil.log("commit evs dropTable");
        sQLiteDatabase.execSQL(DESHelper.decrypt("TXul98jNfsxAJgV4jDjKCSIV1xv/HRlxiZEUhDLKd6w="));
    }

    public static void clearTable(SQLiteDatabase sQLiteDatabase) {
        Object[] objArr = {sQLiteDatabase};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dab21931c7b3bb4442db32fafb7e67c0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dab21931c7b3bb4442db32fafb7e67c0");
        } else {
            sQLiteDatabase.execSQL(DESHelper.decrypt("OhVg8qU0a7g/sbPFC2FfP0xK3dftYrWq"));
        }
    }

    public void createTable2(SQLiteDatabase sQLiteDatabase) {
        Object[] objArr = {sQLiteDatabase};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "487d4884ddeb9cb5fd6feb5d8694e380", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "487d4884ddeb9cb5fd6feb5d8694e380");
            return;
        }
        LogUtil.log("commit evs createTable2");
        sQLiteDatabase.execSQL(DESHelper.decrypt("dggUAg8ZXUqAp9v+5q43TMkK1UKEEvAhFnqO3QIin5ycK9Hl6pFUwI8UnymneqfWCqNHUxCwQ7MD2FE5ce2vgSuLLRoZbrFbc5WGyoVsSIjl54QbjxmPsDzaPIZRr/lsBiAimzSm07BknB5f8tBTveCXMQl8oNqiIo7hWN4QJH+LgVkuOiDPDKYuO1beCBLNn8d8x0tx7fETMsz08WVbr29SarWtB3kUONS3OFMxUvU="));
    }
}
