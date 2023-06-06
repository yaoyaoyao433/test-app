package com.xiaomi.push;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.xiaomi.push.eh;
/* loaded from: classes6.dex */
public class ea {
    private static volatile ea b;
    private static Context c;
    SQLiteDatabase a;

    private ea(Context context) {
        c = context;
        this.a = new a(context).getWritableDatabase();
    }

    private static dx a(String str, Cursor cursor) {
        int i = cursor.getInt(cursor.getColumnIndex("policy_type"));
        int i2 = cursor.getInt(cursor.getColumnIndex("interval"));
        long j = cursor.getLong(cursor.getColumnIndex("insert_time"));
        long j2 = cursor.getLong(cursor.getColumnIndex("life_time"));
        boolean z = cursor.getLong(cursor.getColumnIndex("effective_wakeup")) == 1;
        int i3 = cursor.getInt(cursor.getColumnIndex("wakeup_count"));
        String string = cursor.getString(cursor.getColumnIndex("invalid_reason"));
        dx dxVar = new dx();
        dxVar.a = str;
        dxVar.b = i;
        dxVar.c = i2;
        dxVar.d = j;
        dxVar.e = j2;
        dxVar.f = z;
        dxVar.g = i3;
        dxVar.h = string;
        return dxVar;
    }

    public static ea a(Context context) {
        if (b == null) {
            synchronized (ea.class) {
                if (b == null) {
                    b = new ea(context);
                }
            }
        }
        return b;
    }

    private static dw b(String str, Cursor cursor) {
        int i = cursor.getInt(cursor.getColumnIndex("policy_type"));
        int i2 = cursor.getInt(cursor.getColumnIndex("interval"));
        long j = cursor.getLong(cursor.getColumnIndex("insert_time"));
        long j2 = cursor.getLong(cursor.getColumnIndex("life_time"));
        int i3 = cursor.getInt(cursor.getColumnIndex("timeout_count"));
        int i4 = cursor.getInt(cursor.getColumnIndex("pong_count"));
        long j3 = cursor.getLong(cursor.getColumnIndex("fixed_duration"));
        dw dwVar = new dw();
        dwVar.a = str;
        dwVar.b = i;
        dwVar.c = i2;
        dwVar.d = j;
        dwVar.e = j2;
        dwVar.f = i3;
        dwVar.g = i4;
        dwVar.h = j3;
        return dwVar;
    }

    private void b(String str, String str2, String[] strArr) {
        this.a.beginTransaction();
        try {
            int delete = this.a.delete(str, str2, strArr);
            com.xiaomi.channel.commonutils.logger.c.a("[HB] clear history " + str + "count = " + delete);
            this.a.setTransactionSuccessful();
        } catch (RuntimeException unused) {
        } catch (Throwable th) {
            this.a.endTransaction();
            throw th;
        }
        this.a.endTransaction();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
        if (r11 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
        if (r11 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.xiaomi.push.dw a(java.lang.String r10, int r11, long r12) {
        /*
            r9 = this;
            r0 = 0
            java.lang.String r4 = "digest=? and policy_type=? and interval=? "
            r1 = 3
            java.lang.String[] r5 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L45
            r1 = 0
            r5[r1] = r10     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L45
            r1 = 1
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L45
            r5[r1] = r11     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L45
            r11 = 2
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L45
            r5[r11] = r12     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L45
            android.database.sqlite.SQLiteDatabase r1 = r9.a     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L45
            java.lang.String r2 = "pingpong"
            r3 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r11 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L45
            if (r11 == 0) goto L3b
            int r12 = r11.getCount()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L46
            if (r12 <= 0) goto L3b
            r11.moveToFirst()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L46
            com.xiaomi.push.dw r10 = b(r10, r11)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L46
            if (r11 == 0) goto L37
            r11.close()
        L37:
            return r10
        L38:
            r10 = move-exception
            r0 = r11
            goto L3f
        L3b:
            if (r11 == 0) goto L4b
            goto L48
        L3e:
            r10 = move-exception
        L3f:
            if (r0 == 0) goto L44
            r0.close()
        L44:
            throw r10
        L45:
            r11 = r0
        L46:
            if (r11 == 0) goto L4b
        L48:
            r11.close()
        L4b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.ea.a(java.lang.String, int, long):com.xiaomi.push.dw");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
        if (r11 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
        if (r11 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.xiaomi.push.dx a(java.lang.String r10, int r11, long r12, boolean r14, java.lang.String r15) {
        /*
            r9 = this;
            r0 = 0
            java.lang.String r4 = "digest=? and policy_type=? and interval=? and effective_wakeup=? and invalid_reason=? "
            r1 = 5
            java.lang.String[] r5 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4f
            r1 = 0
            r5[r1] = r10     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4f
            r1 = 1
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4f
            r5[r1] = r11     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4f
            r11 = 2
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4f
            r5[r11] = r12     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4f
            r11 = 3
            java.lang.String r12 = java.lang.String.valueOf(r14)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4f
            r5[r11] = r12     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4f
            r11 = 4
            r5[r11] = r15     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4f
            android.database.sqlite.SQLiteDatabase r1 = r9.a     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4f
            java.lang.String r2 = "wakeup"
            r3 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r11 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4f
            if (r11 == 0) goto L45
            int r12 = r11.getCount()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L50
            if (r12 <= 0) goto L45
            r11.moveToFirst()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L50
            com.xiaomi.push.dx r10 = a(r10, r11)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L50
            if (r11 == 0) goto L41
            r11.close()
        L41:
            return r10
        L42:
            r10 = move-exception
            r0 = r11
            goto L49
        L45:
            if (r11 == 0) goto L55
            goto L52
        L48:
            r10 = move-exception
        L49:
            if (r0 == 0) goto L4e
            r0.close()
        L4e:
            throw r10
        L4f:
            r11 = r0
        L50:
            if (r11 == 0) goto L55
        L52:
            r11.close()
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.ea.a(java.lang.String, int, long, boolean, java.lang.String):com.xiaomi.push.dx");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
        if (r3 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e8, code lost:
        if (r3 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ea, code lost:
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ed, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.xiaomi.push.eh.a a(java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.ea.a(java.lang.String):com.xiaomi.push.eh$a");
    }

    public final void a(String str, String str2) {
        b(str, "digest=?", new String[]{str2});
    }

    public final boolean a(String str, long j) {
        String[] strArr = {str, String.valueOf(j)};
        Cursor cursor = null;
        try {
            Cursor query = this.a.query("records", null, "digest=? and interval=?", strArr, null, null, null);
            if (query != null) {
                try {
                    if (query.getCount() > 0) {
                        if (query != null) {
                            query.close();
                        }
                        return true;
                    }
                } catch (Exception unused) {
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
        return false;
    }

    public final boolean a(String str, String str2, String[] strArr) {
        Cursor cursor;
        Cursor cursor2 = null;
        try {
            cursor = this.a.query(str, null, str2, strArr, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.getCount() > 0) {
                        if (cursor != null) {
                            cursor.close();
                            return true;
                        }
                        return true;
                    }
                } catch (Exception unused) {
                    if (cursor == null) {
                        return false;
                    }
                    cursor.close();
                    return false;
                } catch (Throwable th) {
                    th = th;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            }
            if (cursor == null) {
                return false;
            }
        } catch (Exception unused2) {
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
        }
        cursor.close();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.xiaomi.push.dx> b(java.lang.String r11) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.lang.String r5 = "digest=? "
            r2 = 1
            java.lang.String[] r6 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L52
            r2 = 0
            r6[r2] = r11     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L52
            android.database.sqlite.SQLiteDatabase r2 = r10.a     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L52
            java.lang.String r3 = "wakeup"
            r4 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L52
            if (r2 != 0) goto L29
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L48
            r11.<init>()     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L48
            if (r2 == 0) goto L26
            r2.close()
        L26:
            return r11
        L27:
            r11 = move-exception
            goto L4c
        L29:
            int r1 = r2.getCount()     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L48
            if (r1 <= 0) goto L42
            boolean r1 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L48
            if (r1 == 0) goto L42
        L35:
            com.xiaomi.push.dx r1 = a(r11, r2)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L48
            r0.add(r1)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L48
            boolean r1 = r2.moveToNext()     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L48
            if (r1 != 0) goto L35
        L42:
            if (r2 == 0) goto L47
            r2.close()
        L47:
            return r0
        L48:
            r1 = r2
            goto L52
        L4a:
            r11 = move-exception
            r2 = r1
        L4c:
            if (r2 == 0) goto L51
            r2.close()
        L51:
            throw r11
        L52:
            if (r1 == 0) goto L57
            r1.close()
        L57:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.ea.b(java.lang.String):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.xiaomi.push.dw> c(java.lang.String r11) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.lang.String r5 = "digest=? "
            r2 = 1
            java.lang.String[] r6 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L4d
            r2 = 0
            r6[r2] = r11     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L4d
            android.database.sqlite.SQLiteDatabase r2 = r10.a     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L4d
            java.lang.String r3 = "pingpong"
            r4 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L4d
            if (r2 != 0) goto L22
            if (r2 == 0) goto L21
            r2.close()
        L21:
            return r0
        L22:
            int r1 = r2.getCount()     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L44
            if (r1 <= 0) goto L3b
            boolean r1 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L44
            if (r1 == 0) goto L3b
        L2e:
            com.xiaomi.push.dw r1 = b(r11, r2)     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L44
            r0.add(r1)     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L44
            boolean r1 = r2.moveToNext()     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L44
            if (r1 != 0) goto L2e
        L3b:
            if (r2 == 0) goto L40
            r2.close()
        L40:
            return r0
        L41:
            r11 = move-exception
            r1 = r2
            goto L47
        L44:
            r1 = r2
            goto L4d
        L46:
            r11 = move-exception
        L47:
            if (r1 == 0) goto L4c
            r1.close()
        L4c:
            throw r11
        L4d:
            if (r1 == 0) goto L52
            r1.close()
        L52:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.ea.c(java.lang.String):java.util.List");
    }

    public final void d(String str) {
        b("records", "digest=?", new String[]{str});
    }

    /* loaded from: classes6.dex */
    static class a extends SQLiteOpenHelper {
        public a(Context context) {
            super(context, "hb.db", (SQLiteDatabase.CursorFactory) null, 1);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            try {
                super.onDowngrade(sQLiteDatabase, i, i2);
            } catch (Throwable unused) {
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onOpen(SQLiteDatabase sQLiteDatabase) {
            super.onOpen(sQLiteDatabase);
            sQLiteDatabase.beginTransaction();
            try {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS records(_id INTEGER PRIMARY KEY AUTOINCREMENT,digest TEXT,interval INTEGER DEFAULT 0,net_mode TEXT,continuous_count INTEGER DEFAULT 0,jump_count INTEGER DEFAULT 0,last_ping_suc INTEGER DEFAULT 0)");
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS recent(digest TEXT,net_mode TEXT,cur_interval INTEGER DEFAULT 0,fixed INTEGER DEFAULT 0,fixed_timestamp INTEGER DEFAULT 0,fiexd_duration INTEGER DEFAULT 0)");
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS wakeup(digest TEXT,policy_type INTEGER DEFAULT 0,interval INTEGER DEFAULT 0,insert_time INTEGER DEFAULT 0,life_time INTEGER DEFAULT 0,effective_wakeup INTEGER DEFAULT 0,wakeup_count INTEGER DEFAULT 0,invalid_reason TEXT )");
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS pingpong(digest TEXT,policy_type INTEGER DEFAULT 0,interval INTEGER DEFAULT 0,insert_time INTEGER DEFAULT 0,life_time INTEGER DEFAULT 0,timeout_count INTEGER DEFAULT 0,pong_count INTEGER DEFAULT 0,fixed_duration INTEGER DEFAULT 0)");
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
            } catch (Throwable unused) {
                sQLiteDatabase.endTransaction();
            }
        }
    }

    public final void a(eh.a aVar, boolean z, long j) {
        if (aVar == null || TextUtils.isEmpty(aVar.a) || aVar.d <= 0) {
            return;
        }
        com.xiaomi.channel.commonutils.logger.c.a("[HB] cacheHeartbeat interval = " + aVar.d);
        this.a.beginTransaction();
        if (!z) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("digest", aVar.a);
                contentValues.put("interval", Long.valueOf(j));
                contentValues.put("net_mode", aVar.b);
                contentValues.put("continuous_count", Integer.valueOf(aVar.e));
                contentValues.put("jump_count", Integer.valueOf(aVar.f));
                contentValues.put("last_ping_suc", Integer.valueOf(aVar.i ? 1 : 0));
                if (a(aVar.a, aVar.d)) {
                    String[] strArr = {aVar.a, String.valueOf(aVar.d)};
                    this.a.update("records", contentValues, "digest=? and interval=?", strArr);
                } else {
                    this.a.insert("records", null, contentValues);
                }
            } catch (RuntimeException unused) {
            } catch (Throwable th) {
                this.a.endTransaction();
                throw th;
            }
        }
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("digest", aVar.a);
        contentValues2.put("cur_interval", Long.valueOf(j));
        contentValues2.put("fixed", Integer.valueOf(aVar.g ? 1 : 0));
        contentValues2.put("fixed_timestamp", Long.valueOf(aVar.h));
        contentValues2.put("fiexd_duration", Long.valueOf(aVar.j));
        if (a("recent", "digest=?", new String[]{aVar.a})) {
            String[] strArr2 = {aVar.a};
            this.a.update("recent", contentValues2, "digest=?", strArr2);
        } else {
            this.a.insert("recent", null, contentValues2);
        }
        this.a.setTransactionSuccessful();
        this.a.endTransaction();
    }
}
