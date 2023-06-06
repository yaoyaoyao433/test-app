package com.dianping.base.push.pushservice;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class j {
    public static ChangeQuickRedirect a = null;
    private static final String b = "j";
    private g c;

    public j(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e79c449f701ba53c1c362532bdeb189", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e79c449f701ba53c1c362532bdeb189");
        } else {
            this.c = new g(context);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0079 A[Catch: all -> 0x0082, TRY_ENTER, TryCatch #2 {, blocks: (B:4:0x0002, B:6:0x0015, B:9:0x001d, B:18:0x0045, B:20:0x004a, B:35:0x006c, B:37:0x0071, B:42:0x0079, B:44:0x007e, B:45:0x0081), top: B:51:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007e A[Catch: all -> 0x0082, TryCatch #2 {, blocks: (B:4:0x0002, B:6:0x0015, B:9:0x001d, B:18:0x0045, B:20:0x004a, B:35:0x006c, B:37:0x0071, B:42:0x0079, B:44:0x007e, B:45:0x0081), top: B:51:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.ArrayList<java.lang.String> a() {
        /*
            r12 = this;
            monitor-enter(r12)
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L82
            com.meituan.robust.ChangeQuickRedirect r9 = com.dianping.base.push.pushservice.j.a     // Catch: java.lang.Throwable -> L82
            java.lang.String r10 = "1e3af0bf48aadcff747fd1cdd7bf721a"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L82
            if (r1 == 0) goto L1d
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r9, r0, r10)     // Catch: java.lang.Throwable -> L82
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L82
            monitor-exit(r12)
            return r0
        L1d:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L82
            r0.<init>()     // Catch: java.lang.Throwable -> L82
            r1 = 0
            com.dianping.base.push.pushservice.g r2 = r12.c     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5d
            android.database.sqlite.SQLiteDatabase r2 = r2.getWritableDatabase()     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5d
            java.lang.String r3 = "SELECT * FROM statistics"
            android.database.Cursor r3 = r2.rawQuery(r3, r1)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
        L2f:
            boolean r1 = r3.moveToNext()     // Catch: java.lang.Exception -> L4f java.lang.Throwable -> L76
            if (r1 == 0) goto L43
            java.lang.String r1 = "log"
            int r1 = r3.getColumnIndex(r1)     // Catch: java.lang.Exception -> L4f java.lang.Throwable -> L76
            java.lang.String r1 = r3.getString(r1)     // Catch: java.lang.Exception -> L4f java.lang.Throwable -> L76
            r0.add(r1)     // Catch: java.lang.Exception -> L4f java.lang.Throwable -> L76
            goto L2f
        L43:
            if (r3 == 0) goto L48
            r3.close()     // Catch: java.lang.Throwable -> L82
        L48:
            if (r2 == 0) goto L4d
            r2.close()     // Catch: java.lang.Throwable -> L82
        L4d:
            monitor-exit(r12)
            return r0
        L4f:
            r1 = move-exception
            goto L61
        L51:
            r0 = move-exception
            r3 = r1
            goto L77
        L54:
            r3 = move-exception
            r11 = r3
            r3 = r1
            r1 = r11
            goto L61
        L59:
            r0 = move-exception
            r2 = r1
            r3 = r2
            goto L77
        L5d:
            r2 = move-exception
            r3 = r1
            r1 = r2
            r2 = r3
        L61:
            java.lang.String r4 = com.dianping.base.push.pushservice.j.b     // Catch: java.lang.Throwable -> L76
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L76
            com.dianping.base.push.pushservice.c.d(r4, r1)     // Catch: java.lang.Throwable -> L76
            if (r3 == 0) goto L6f
            r3.close()     // Catch: java.lang.Throwable -> L82
        L6f:
            if (r2 == 0) goto L74
            r2.close()     // Catch: java.lang.Throwable -> L82
        L74:
            monitor-exit(r12)
            return r0
        L76:
            r0 = move-exception
        L77:
            if (r3 == 0) goto L7c
            r3.close()     // Catch: java.lang.Throwable -> L82
        L7c:
            if (r2 == 0) goto L81
            r2.close()     // Catch: java.lang.Throwable -> L82
        L81:
            throw r0     // Catch: java.lang.Throwable -> L82
        L82:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.base.push.pushservice.j.a():java.util.ArrayList");
    }

    public final synchronized void b() {
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b311c4b691336024a6096bcdfa66e84d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b311c4b691336024a6096bcdfa66e84d");
            return;
        }
        Cursor cursor2 = null;
        try {
            sQLiteDatabase = this.c.getWritableDatabase();
            try {
                try {
                    cursor = sQLiteDatabase.rawQuery("SELECT * FROM statistics", null);
                    while (cursor.moveToNext()) {
                        try {
                            sQLiteDatabase.delete("statistics", "id = ?", new String[]{String.valueOf(cursor.getInt(cursor.getColumnIndex("id")))});
                        } catch (Exception e) {
                            e = e;
                            cursor2 = cursor;
                            c.d(b, e.toString());
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.close();
                                return;
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (cursor != null) {
                                cursor.close();
                            }
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.close();
                            }
                            throw th;
                        }
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursor2;
            }
        } catch (Exception e3) {
            e = e3;
            sQLiteDatabase = null;
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase = null;
            cursor = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public final synchronized void a(String str) {
        Cursor cursor;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        SQLiteDatabase sQLiteDatabase = this;
        if (PatchProxy.isSupport(objArr, sQLiteDatabase, changeQuickRedirect, false, "cc6fabf5007111d18ae7d386f42b6937", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc6fabf5007111d18ae7d386f42b6937");
            return;
        }
        Cursor cursor2 = 0;
        try {
            try {
                sQLiteDatabase = this.c.getWritableDatabase();
                try {
                    cursor = sQLiteDatabase.rawQuery("SELECT * FROM statistics", null);
                } catch (Exception e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursor2;
            }
            try {
                if (cursor.getCount() >= 15 && cursor.moveToFirst()) {
                    sQLiteDatabase.delete("statistics", "id = ?", new String[]{String.valueOf(cursor.getInt(cursor.getColumnIndex("id")))});
                }
                sQLiteDatabase.beginTransaction();
                cursor2 = "INSERT INTO statistics VALUES(null, ?)";
                sQLiteDatabase.execSQL("INSERT INTO statistics VALUES(null, ?)", new Object[]{str});
                sQLiteDatabase.setTransactionSuccessful();
                if (cursor != null) {
                    cursor.close();
                }
                if (sQLiteDatabase != 0) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Exception e2) {
                        c.d(b, e2.toString());
                    }
                    try {
                        sQLiteDatabase.close();
                    } catch (Exception e3) {
                        c.d(b, e3.toString());
                    }
                }
            } catch (Exception e4) {
                e = e4;
                cursor2 = cursor;
                c.d(b, e.toString());
                if (cursor2 != 0) {
                    cursor2.close();
                }
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Exception e5) {
                        c.d(b, e5.toString());
                    }
                    try {
                        sQLiteDatabase.close();
                    } catch (Exception e6) {
                        c.d(b, e6.toString());
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (cursor != null) {
                    cursor.close();
                }
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Exception e7) {
                        c.d(b, e7.toString());
                    }
                    try {
                        sQLiteDatabase.close();
                    } catch (Exception e8) {
                        c.d(b, e8.toString());
                    }
                }
                throw th;
            }
        } catch (Exception e9) {
            e = e9;
            sQLiteDatabase = null;
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase = null;
            cursor = null;
        }
    }
}
