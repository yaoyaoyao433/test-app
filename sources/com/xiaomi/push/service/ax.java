package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.react.bridge.BaseJavaModule;
import com.meituan.met.mercury.load.bean.DDLoadConstants;
import com.meituan.robust.common.CommonConstant;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes6.dex */
public final class ax implements q {
    private static volatile ax f;
    Context a;
    private SharedPreferences b;
    private long c;
    private volatile boolean d = false;
    private ConcurrentHashMap<String, a> e = new ConcurrentHashMap<>();

    private ax(Context context) {
        this.a = context.getApplicationContext();
        this.b = context.getSharedPreferences(BaseJavaModule.METHOD_TYPE_SYNC, 0);
    }

    public static ax a(Context context) {
        if (f == null) {
            synchronized (ax.class) {
                if (f == null) {
                    f = new ax(context);
                }
            }
        }
        return f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean a(ax axVar, boolean z) {
        axVar.d = false;
        return false;
    }

    public final String a(String str, String str2) {
        SharedPreferences sharedPreferences = this.b;
        return sharedPreferences.getString(str + CommonConstant.Symbol.COLON + str2, "");
    }

    @Override // com.xiaomi.push.service.q
    public final void a() {
        if (this.d) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.c < DDLoadConstants.TIME_HOURS_MILLIS) {
            return;
        }
        this.c = currentTimeMillis;
        this.d = true;
        com.xiaomi.push.m.a(this.a).a(new ay(this), (int) (Math.random() * 10.0d));
    }

    public final void a(a aVar) {
        if (this.e.putIfAbsent(aVar.c, aVar) == null) {
            com.xiaomi.push.m.a(this.a).a(aVar, ((int) (Math.random() * 30.0d)) + 10);
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class a implements Runnable {
        String c;
        long d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(String str, long j) {
            this.c = str;
            this.d = j;
        }

        abstract void a(ax axVar);

        @Override // java.lang.Runnable
        public void run() {
            if (ax.f != null) {
                Context context = ax.f.a;
                if (com.xiaomi.push.al.c(context)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    SharedPreferences sharedPreferences = ax.f.b;
                    if (currentTimeMillis - sharedPreferences.getLong(":ts-" + this.c, 0L) > this.d || com.xiaomi.push.i.a(context)) {
                        SharedPreferences.Editor edit = ax.f.b.edit();
                        edit.putLong(":ts-" + this.c, System.currentTimeMillis()).apply();
                        a(ax.f);
                    }
                }
            }
        }
    }

    public static void a(String str, String str2, String str3) {
        SharedPreferences.Editor edit = f.b.edit();
        edit.putString(str + CommonConstant.Symbol.COLON + str2, str3).apply();
    }
}
