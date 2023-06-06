package com.xiaomi.push;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.metrics.traffic.report.NetLogConstants;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes6.dex */
public final class gt {
    private static p a = new p(true);
    private static volatile int b = -1;
    private static long c = System.currentTimeMillis();
    private static final Object d = new Object();
    private static List<a> e = Collections.synchronizedList(new ArrayList());
    private static String f = "";
    private static com.xiaomi.push.providers.a g = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class a {
        public String a;
        public long b;
        public int c;
        public int d;
        public String e;
        public long f;

        public a(String str, long j, int i, int i2, String str2, long j2) {
            this.a = "";
            this.b = 0L;
            this.c = -1;
            this.d = -1;
            this.e = "";
            this.f = 0L;
            this.a = str;
            this.b = j;
            this.c = i;
            this.d = i2;
            this.e = str2;
            this.f = j2;
        }
    }

    public static void a(Context context) {
        b = c(context);
    }

    public static synchronized void a(String str) {
        synchronized (gt.class) {
            if (!jj.f() && !TextUtils.isEmpty(str)) {
                f = str;
            }
        }
    }

    public static int b(Context context) {
        if (b == -1) {
            b = c(context);
        }
        return b;
    }

    public static int b(String str) {
        try {
            return str.getBytes("UTF-8").length;
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes().length;
        }
    }

    private static int c(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return -1;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return -1;
            }
            return activeNetworkInfo.getType();
        } catch (Exception unused) {
            return -1;
        }
    }

    private static synchronized String d(Context context) {
        synchronized (gt.class) {
            if (TextUtils.isEmpty(f)) {
                return "";
            }
            return f;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00ba A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r13, java.lang.String r14, long r15, boolean r17, boolean r18, long r19) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.gt.a(android.content.Context, java.lang.String, long, boolean, boolean, long):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(Context context, List list) {
        com.xiaomi.push.providers.a aVar;
        try {
            synchronized (com.xiaomi.push.providers.a.a) {
                if (g != null) {
                    aVar = g;
                } else {
                    com.xiaomi.push.providers.a aVar2 = new com.xiaomi.push.providers.a(context);
                    g = aVar2;
                    aVar = aVar2;
                }
                SQLiteDatabase writableDatabase = aVar.getWritableDatabase();
                writableDatabase.beginTransaction();
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        a aVar3 = (a) it.next();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("package_name", aVar3.a);
                        contentValues.put("message_ts", Long.valueOf(aVar3.b));
                        contentValues.put(NetLogConstants.Tags.NETWORK_TYPE, Integer.valueOf(aVar3.c));
                        contentValues.put("bytes", Long.valueOf(aVar3.f));
                        contentValues.put("rcv", Integer.valueOf(aVar3.d));
                        contentValues.put(Constants.Environment.KEY_IMSI, aVar3.e);
                        writableDatabase.insert("traffic", null, contentValues);
                    }
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.c.a(th);
        }
    }
}
