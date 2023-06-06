package com.huawei.hms.framework.network.grs.a;

import android.content.Context;
import android.content.pm.PackageManager;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.PLSharedPreferences;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class c {
    private static final String a = "c";
    private PLSharedPreferences b;

    public c(Context context, String str) {
        this.b = null;
        String packageName = context.getPackageName();
        Logger.d(a, "get pkgname from context is{%s}", packageName);
        this.b = new PLSharedPreferences(context, str + packageName);
        a(context);
    }

    private void a(Context context) {
        try {
            String l = Long.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionCode);
            String a2 = a("version", "");
            if (l.equals(a2)) {
                return;
            }
            Logger.i(a, "app version changed! old version{%s} and new version{%s}", a2, l);
            c();
            b("version", l);
        } catch (PackageManager.NameNotFoundException unused) {
            Logger.w(a, "get app version failed and catch NameNotFoundException");
        }
    }

    public String a(String str, String str2) {
        return this.b.getString(str, str2);
    }

    public Map<String, ?> a() {
        return this.b.getAll();
    }

    public void a(String str) {
        this.b.remove(str);
    }

    public String b() {
        return a("cp", "");
    }

    public void b(String str, String str2) {
        this.b.putString(str, str2);
    }

    public void c() {
        this.b.clear();
    }
}
