package com.sankuai.waimai.foundation.core.common;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a {
    public static ChangeQuickRedirect a = null;
    protected static String b = "a_app_version";
    protected static String c = "4";
    protected static String d = "4";
    protected static String e = "4";
    protected static String f = "0";
    protected static String g = "android";
    protected static String s = b.a.getResources().getString(R.string.wm_common_app_name);
    protected static String t = b.a.getResources().getString(R.string.wm_common_app_name_en);
    protected static int u = 11;
    private static a v;
    protected String h;
    protected String i;
    public String j;
    public String k;
    protected String l;
    protected String m;
    public String n;
    protected String o;
    public int p;
    public int q;
    public float r;
    private String w;
    private String x;
    private int y;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53816ff6d812df00c8f9d79a2918e0b8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53816ff6d812df00c8f9d79a2918e0b8");
            return;
        }
        this.w = "";
        this.h = "";
        this.i = "";
        this.j = "";
        this.k = "";
        this.x = "";
        this.l = "";
        this.m = "";
        this.y = 0;
        this.o = "";
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d9a74eedaaa8f7ffad34b0030eaeb0ec", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d9a74eedaaa8f7ffad34b0030eaeb0ec");
        }
        if (v == null) {
            synchronized (a.class) {
                if (v == null) {
                    v = new a();
                }
            }
        }
        return v;
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0016efe15226dbf840a1ae8a17445cd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0016efe15226dbf840a1ae8a17445cd6");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.l = str;
        }
    }

    public final String c() {
        return this.l;
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf714a4768bf3f7b2833d0c116a5011d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf714a4768bf3f7b2833d0c116a5011d");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.i = str;
        }
    }

    public final String d() {
        return this.i;
    }

    public final String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cd3292299fc2beeeb3a32476877ae4d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cd3292299fc2beeeb3a32476877ae4d");
        }
        if (TextUtils.isEmpty(this.m)) {
            n();
        }
        return this.m;
    }

    public final int f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2df5834166696ceecd1d1b69042b4a65", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2df5834166696ceecd1d1b69042b4a65")).intValue();
        }
        if (this.y <= 0) {
            n();
        }
        return this.y;
    }

    public final String g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bc72db7080fcc520ab42f8d5645e67e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bc72db7080fcc520ab42f8d5645e67e") : com.sankuai.waimai.foundation.core.a.e() ? "mtandroid" : com.sankuai.waimai.foundation.core.a.f() ? "dpandroid" : g;
    }

    public static String h() {
        return s;
    }

    public static String i() {
        return t;
    }

    public static int j() {
        return u;
    }

    public static String k() {
        return c;
    }

    public static String l() {
        return d;
    }

    public final String m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81ffcc2a4d055698f79e2c5d6f46405d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81ffcc2a4d055698f79e2c5d6f46405d");
        }
        if ("mt".equals("wm")) {
            return f;
        }
        return e;
    }

    public static boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7fa1dee05672f407d48a5957950dfdc5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7fa1dee05672f407d48a5957950dfdc5")).booleanValue();
        }
        if (Build.VERSION.SDK_INT <= 21) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            return runningAppProcessInfo.importance == 100;
        }
        String packageName = context.getPackageName();
        List<ActivityManager.RunningAppProcessInfo> a2 = Privacy.createActivityManager(context, "core").a();
        if (a2 == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo2 : a2) {
            if (runningAppProcessInfo2.processName.equals(packageName) && runningAppProcessInfo2.importance == 100) {
                return true;
            }
        }
        return false;
    }

    private void n() {
        PackageInfo packageInfo;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07abced1594ad49d1f405982da979817", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07abced1594ad49d1f405982da979817");
            return;
        }
        try {
            packageInfo = b.a.getPackageManager().getPackageInfo(b.a.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        if (packageInfo != null) {
            this.m = packageInfo.versionName;
            this.y = packageInfo.versionCode;
            return;
        }
        this.m = b;
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d217bf93c4ab986e50d51642c02b21c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d217bf93c4ab986e50d51642c02b21c");
            return;
        }
        DisplayMetrics displayMetrics = b.a.getResources().getDisplayMetrics();
        this.r = displayMetrics.density;
        this.p = displayMetrics.widthPixels;
        this.q = displayMetrics.heightPixels;
    }
}
