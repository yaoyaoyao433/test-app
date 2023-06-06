package com.tencent.open.b;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.tencent.open.log.SLog;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class g extends SQLiteOpenHelper {
    protected static final String[] a = {"key"};
    protected static g b;

    public static synchronized g a() {
        g gVar;
        synchronized (g.class) {
            if (b == null) {
                b = new g(com.tencent.open.utils.f.a());
            }
            gVar = b;
        }
        return gVar;
    }

    public g(Context context) {
        super(context, "sdk_report.db", (SQLiteDatabase.CursorFactory) null, 2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS via_cgi_report( _id INTEGER PRIMARY KEY,key TEXT,type TEXT,blob BLOB);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS via_cgi_report");
        onCreate(sQLiteDatabase);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
        if (r1 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0089, code lost:
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009d, code lost:
        if (r1 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a1, code lost:
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073 A[Catch: all -> 0x007d, Exception -> 0x007f, TRY_ENTER, TryCatch #15 {Exception -> 0x007f, all -> 0x007d, blocks: (B:14:0x0030, B:16:0x0036, B:17:0x0039, B:20:0x0053, B:21:0x0056, B:37:0x0073, B:38:0x0076, B:28:0x0060, B:29:0x0063, B:30:0x0066, B:33:0x006a, B:34:0x006d), top: B:91:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084 A[Catch: all -> 0x00ad, TRY_ENTER, TryCatch #6 {, blocks: (B:3:0x0001, B:7:0x0012, B:46:0x0084, B:48:0x0089, B:61:0x00a4, B:63:0x00a9, B:64:0x00ac, B:55:0x009a), top: B:86:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0082 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized java.util.List<java.io.Serializable> a(java.lang.String r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lad
            r0.<init>()     // Catch: java.lang.Throwable -> Lad
            java.util.List r0 = java.util.Collections.synchronizedList(r0)     // Catch: java.lang.Throwable -> Lad
            boolean r1 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Throwable -> Lad
            if (r1 == 0) goto L12
            monitor-exit(r11)
            return r0
        L12:
            android.database.sqlite.SQLiteDatabase r1 = r11.getReadableDatabase()     // Catch: java.lang.Throwable -> Lad
            if (r1 != 0) goto L1a
            monitor-exit(r11)
            return r0
        L1a:
            r10 = 0
            java.lang.String r3 = "via_cgi_report"
            r4 = 0
            java.lang.String r5 = "type = ?"
            r2 = 1
            java.lang.String[] r6 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L90
            r2 = 0
            r6[r2] = r12     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L90
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r1
            android.database.Cursor r12 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L90
            if (r12 == 0) goto L82
            int r2 = r12.getCount()     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            if (r2 <= 0) goto L82
            r12.moveToFirst()     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
        L39:
            java.lang.String r2 = "blob"
            int r2 = r12.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            byte[] r2 = r12.getBlob(r2)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L67
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L67
            java.lang.Object r4 = r2.readObject()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L68
            java.io.Serializable r4 = (java.io.Serializable) r4     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L68
            r2.close()     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L7d java.lang.Exception -> L7f
        L56:
            r3.close()     // Catch: java.io.IOException -> L71 java.lang.Throwable -> L7d java.lang.Exception -> L7f
            goto L71
        L5a:
            r4 = move-exception
            goto L5e
        L5c:
            r4 = move-exception
            r2 = r10
        L5e:
            if (r2 == 0) goto L63
            r2.close()     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L7d java.lang.Exception -> L7f
        L63:
            r3.close()     // Catch: java.io.IOException -> L66 java.lang.Throwable -> L7d java.lang.Exception -> L7f
        L66:
            throw r4     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
        L67:
            r2 = r10
        L68:
            if (r2 == 0) goto L6d
            r2.close()     // Catch: java.io.IOException -> L6d java.lang.Throwable -> L7d java.lang.Exception -> L7f
        L6d:
            r3.close()     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L7d java.lang.Exception -> L7f
        L70:
            r4 = r10
        L71:
            if (r4 == 0) goto L76
            r0.add(r4)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
        L76:
            boolean r2 = r12.moveToNext()     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            if (r2 != 0) goto L39
            goto L82
        L7d:
            r0 = move-exception
            goto La2
        L7f:
            r2 = move-exception
            r10 = r12
            goto L91
        L82:
            if (r12 == 0) goto L87
            r12.close()     // Catch: java.lang.Throwable -> Lad
        L87:
            if (r1 == 0) goto La0
        L89:
            r1.close()     // Catch: java.lang.Throwable -> Lad
            goto La0
        L8d:
            r0 = move-exception
            r12 = r10
            goto La2
        L90:
            r2 = move-exception
        L91:
            java.lang.String r12 = "openSDK_LOG.ReportDatabaseHelper"
            java.lang.String r3 = "getReportItemFromDB has exception."
            com.tencent.open.log.SLog.e(r12, r3, r2)     // Catch: java.lang.Throwable -> L8d
            if (r10 == 0) goto L9d
            r10.close()     // Catch: java.lang.Throwable -> Lad
        L9d:
            if (r1 == 0) goto La0
            goto L89
        La0:
            monitor-exit(r11)
            return r0
        La2:
            if (r12 == 0) goto La7
            r12.close()     // Catch: java.lang.Throwable -> Lad
        La7:
            if (r1 == 0) goto Lac
            r1.close()     // Catch: java.lang.Throwable -> Lad
        Lac:
            throw r0     // Catch: java.lang.Throwable -> Lad
        Lad:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.open.b.g.a(java.lang.String):java.util.List");
    }

    public synchronized void a(String str, List<Serializable> list) {
        ObjectOutputStream objectOutputStream;
        int size = list.size();
        if (size == 0) {
            return;
        }
        if (size > 20) {
            size = 20;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        b(str);
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (writableDatabase == null) {
            return;
        }
        writableDatabase.beginTransaction();
        try {
            ContentValues contentValues = new ContentValues();
            for (int i = 0; i < size; i++) {
                Serializable serializable = list.get(i);
                if (serializable != null) {
                    contentValues.put("type", str);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                    ObjectOutputStream objectOutputStream2 = null;
                    try {
                        try {
                            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                        } catch (IOException unused) {
                        }
                        try {
                            objectOutputStream.writeObject(serializable);
                            objectOutputStream.close();
                        } catch (IOException unused2) {
                            if (objectOutputStream != null) {
                                objectOutputStream.close();
                            }
                            byteArrayOutputStream.close();
                        } catch (Throwable th) {
                            th = th;
                            objectOutputStream2 = objectOutputStream;
                            if (objectOutputStream2 != null) {
                                try {
                                    objectOutputStream2.close();
                                } catch (IOException unused3) {
                                }
                            }
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException unused4) {
                            }
                            throw th;
                        }
                    } catch (IOException unused5) {
                        objectOutputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException unused6) {
                        contentValues.put("blob", byteArrayOutputStream.toByteArray());
                        writableDatabase.insert("via_cgi_report", null, contentValues);
                    }
                }
                contentValues.clear();
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            if (writableDatabase != null) {
                writableDatabase.close();
            }
        } catch (Exception unused7) {
            SLog.e("openSDK_LOG.ReportDatabaseHelper", "saveReportItemToDB has exception.");
            writableDatabase.endTransaction();
            if (writableDatabase != null) {
                writableDatabase.close();
            }
        }
    }

    public synchronized void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (writableDatabase == null) {
            return;
        }
        try {
            writableDatabase.delete("via_cgi_report", "type = ?", new String[]{str});
            if (writableDatabase != null) {
                writableDatabase.close();
            }
        } catch (Exception e) {
            SLog.e("openSDK_LOG.ReportDatabaseHelper", "clearReportItem has exception.", e);
            if (writableDatabase != null) {
                writableDatabase.close();
            }
        }
    }
}
