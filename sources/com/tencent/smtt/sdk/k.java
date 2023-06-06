package com.tencent.smtt.sdk;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.meituan.robust.common.CommonConstant;
import com.tencent.smtt.utils.FileUtil;
import com.tencent.smtt.utils.TbsLog;
import java.io.File;
/* loaded from: classes6.dex */
public class k {
    public static final String a = CookieManager.LOGTAG;
    static File b;

    public static File a(Context context) {
        if (b == null && context != null) {
            b = new File(context.getDir("webview", 0), "Cookies");
        }
        if (b == null) {
            b = new File("/data/data/" + context.getPackageName() + File.separator + "app_webview" + File.separator + "Cookies");
        }
        return b;
    }

    private static String a(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor rawQuery = sQLiteDatabase.rawQuery("select * from " + str, null);
        int count = rawQuery.getCount();
        int columnCount = rawQuery.getColumnCount();
        StringBuilder sb = new StringBuilder();
        sb.append("raws:" + count + ",columns:" + columnCount + "\n");
        if (count <= 0 || !rawQuery.moveToFirst()) {
            return sb.toString();
        }
        do {
            sb.append("\n");
            for (int i = 0; i < columnCount; i++) {
                try {
                    sb.append(rawQuery.getString(i));
                    sb.append(CommonConstant.Symbol.COMMA);
                } catch (Exception unused) {
                }
            }
            sb.append("\n");
        } while (rawQuery.moveToNext());
        return sb.toString();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static java.util.ArrayList<java.lang.String> a(android.database.sqlite.SQLiteDatabase r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "select * from sqlite_master where type='table'"
            android.database.Cursor r2 = r4.rawQuery(r2, r0)     // Catch: java.lang.Throwable -> L50
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L2a
        L15:
            r0 = 1
            java.lang.String r0 = r2.getString(r0)     // Catch: java.lang.Throwable -> L3a
            r3 = 4
            r2.getString(r3)     // Catch: java.lang.Throwable -> L3a
            r1.add(r0)     // Catch: java.lang.Throwable -> L3a
            a(r4, r0)     // Catch: java.lang.Throwable -> L3a
            boolean r0 = r2.moveToNext()     // Catch: java.lang.Throwable -> L3a
            if (r0 != 0) goto L15
        L2a:
            if (r2 == 0) goto L2f
            r2.close()
        L2f:
            if (r4 == 0) goto L60
            boolean r0 = r4.isOpen()
            if (r0 == 0) goto L60
            goto L5d
        L38:
            r0 = move-exception
            goto L3f
        L3a:
            r0 = r2
            goto L50
        L3c:
            r1 = move-exception
            r2 = r0
            r0 = r1
        L3f:
            if (r2 == 0) goto L44
            r2.close()
        L44:
            if (r4 == 0) goto L4f
            boolean r1 = r4.isOpen()
            if (r1 == 0) goto L4f
            r4.close()
        L4f:
            throw r0
        L50:
            if (r0 == 0) goto L55
            r0.close()
        L55:
            if (r4 == 0) goto L60
            boolean r0 = r4.isOpen()
            if (r0 == 0) goto L60
        L5d:
            r4.close()
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.k.a(android.database.sqlite.SQLiteDatabase):java.util.ArrayList");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005b, code lost:
        if (r5 != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bd, code lost:
        if (r12.isOpen() != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bf, code lost:
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f0, code lost:
        if (r12.isOpen() != false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r8, com.tencent.smtt.sdk.CookieManager.a r9, java.lang.String r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.k.a(android.content.Context, com.tencent.smtt.sdk.CookieManager$a, java.lang.String, boolean, boolean):void");
    }

    public static boolean b(Context context) {
        if (context == null) {
            return false;
        }
        FileUtil.a(a(context), false);
        return true;
    }

    public static SQLiteDatabase c(Context context) {
        File a2;
        SQLiteDatabase sQLiteDatabase;
        if (context == null || (a2 = a(context)) == null) {
            return null;
        }
        try {
            sQLiteDatabase = SQLiteDatabase.openDatabase(a2.getAbsolutePath(), null, 0);
        } catch (Exception unused) {
            sQLiteDatabase = null;
        }
        if (sQLiteDatabase == null) {
            TbsLog.i(a, "dbPath is not exist!");
        }
        return sQLiteDatabase;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static int d(android.content.Context r4) {
        /*
            java.lang.System.currentTimeMillis()
            r0 = 0
            r1 = 0
            android.database.sqlite.SQLiteDatabase r4 = c(r4)     // Catch: java.lang.Throwable -> L78
            if (r4 != 0) goto L18
            if (r4 == 0) goto L16
            boolean r0 = r4.isOpen()
            if (r0 == 0) goto L16
            r4.close()
        L16:
            r4 = -1
            return r4
        L18:
            java.lang.String r2 = "select * from meta"
            android.database.Cursor r2 = r4.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L62
            int r1 = r2.getCount()     // Catch: java.lang.Throwable -> L5d
            r2.getColumnCount()     // Catch: java.lang.Throwable -> L5d
            if (r1 <= 0) goto L4a
            boolean r1 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L5d
            if (r1 == 0) goto L4a
        L2d:
            java.lang.String r1 = r2.getString(r0)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r3 = "version"
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> L5d
            if (r1 == 0) goto L44
            r1 = 1
            java.lang.String r1 = r2.getString(r1)     // Catch: java.lang.Throwable -> L5d
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L5d
            r0 = r1
            goto L4a
        L44:
            boolean r1 = r2.moveToNext()     // Catch: java.lang.Throwable -> L5d
            if (r1 != 0) goto L2d
        L4a:
            if (r2 == 0) goto L4f
            r2.close()
        L4f:
            if (r4 == 0) goto L87
            boolean r1 = r4.isOpen()
            if (r1 == 0) goto L87
        L57:
            r4.close()
            goto L87
        L5b:
            r0 = move-exception
            goto L67
        L5d:
            r1 = r2
            goto L79
        L5f:
            r0 = move-exception
            r2 = r1
            goto L67
        L62:
            goto L79
        L64:
            r0 = move-exception
            r4 = r1
            r2 = r4
        L67:
            if (r2 == 0) goto L6c
            r2.close()
        L6c:
            if (r4 == 0) goto L77
            boolean r1 = r4.isOpen()
            if (r1 == 0) goto L77
            r4.close()
        L77:
            throw r0
        L78:
            r4 = r1
        L79:
            if (r1 == 0) goto L7e
            r1.close()
        L7e:
            if (r4 == 0) goto L87
            boolean r1 = r4.isOpen()
            if (r1 == 0) goto L87
            goto L57
        L87:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.k.d(android.content.Context):int");
    }
}
