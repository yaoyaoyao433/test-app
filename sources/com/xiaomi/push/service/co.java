package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.meituan.robust.common.CommonConstant;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes6.dex */
public final class co {
    private static co e;
    Context a;
    List<String> b = new ArrayList();
    final List<String> c = new ArrayList();
    final List<String> d = new ArrayList();

    private co(Context context) {
        String[] split;
        String[] split2;
        String[] split3;
        this.a = context.getApplicationContext();
        if (this.a == null) {
            this.a = context;
        }
        SharedPreferences sharedPreferences = this.a.getSharedPreferences("mipush_app_info", 0);
        for (String str : sharedPreferences.getString("unregistered_pkg_names", "").split(CommonConstant.Symbol.COMMA)) {
            if (TextUtils.isEmpty(str)) {
                this.b.add(str);
            }
        }
        for (String str2 : sharedPreferences.getString("disable_push_pkg_names", "").split(CommonConstant.Symbol.COMMA)) {
            if (!TextUtils.isEmpty(str2)) {
                this.c.add(str2);
            }
        }
        for (String str3 : sharedPreferences.getString("disable_push_pkg_names_cache", "").split(CommonConstant.Symbol.COMMA)) {
            if (!TextUtils.isEmpty(str3)) {
                this.d.add(str3);
            }
        }
    }

    public static co a(Context context) {
        if (e == null) {
            e = new co(context);
        }
        return e;
    }

    public final boolean a(String str) {
        boolean contains;
        synchronized (this.b) {
            contains = this.b.contains(str);
        }
        return contains;
    }

    public final boolean b(String str) {
        boolean contains;
        synchronized (this.c) {
            contains = this.c.contains(str);
        }
        return contains;
    }

    public final boolean c(String str) {
        boolean contains;
        synchronized (this.d) {
            contains = this.d.contains(str);
        }
        return contains;
    }

    public final void d(String str) {
        synchronized (this.c) {
            if (this.c.contains(str)) {
                this.c.remove(str);
                this.a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names", com.xiaomi.push.ar.a(this.c, CommonConstant.Symbol.COMMA)).commit();
            }
        }
    }

    public final void e(String str) {
        synchronized (this.d) {
            if (this.d.contains(str)) {
                this.d.remove(str);
                this.a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names_cache", com.xiaomi.push.ar.a(this.d, CommonConstant.Symbol.COMMA)).commit();
            }
        }
    }
}
