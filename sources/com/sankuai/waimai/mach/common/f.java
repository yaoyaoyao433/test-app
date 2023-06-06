package com.sankuai.waimai.mach.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public boolean m;
    public int n;
    public float o;
    public String p;
    public String[] q;
    private Context r;

    private f(a aVar) {
        String sb;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9bf57f9947314a0a38d7b9cf3230cee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9bf57f9947314a0a38d7b9cf3230cee");
            return;
        }
        this.r = aVar.h;
        PackageInfo packageInfo = null;
        try {
            packageInfo = this.r.getPackageManager().getPackageInfo(this.r.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        this.b = aVar.b;
        this.e = Build.MODEL;
        if (TextUtils.isEmpty(this.e)) {
            this.e = "";
        }
        this.f = "Android";
        this.g = Build.VERSION.SDK + CommonConstant.Symbol.UNDERLINE + Build.VERSION.RELEASE;
        this.h = "8.3.27";
        this.i = aVar.c;
        this.j = aVar.d;
        this.k = aVar.e;
        this.l = aVar.f;
        this.m = aVar.i;
        this.o = this.r.getResources().getDisplayMetrics().density;
        this.c = "";
        this.d = "";
        if (packageInfo != null) {
            this.d = packageInfo.versionName;
            if (!TextUtils.isEmpty(packageInfo.versionName)) {
                String str = packageInfo.versionName;
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5f27255b1baf0b1ba620379be73ce03d", RobustBitConfig.DEFAULT_VALUE)) {
                    sb = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5f27255b1baf0b1ba620379be73ce03d");
                } else if (TextUtils.isEmpty(str)) {
                    sb = "";
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    String[] split = str.split("\\.");
                    if (split != null && split.length == 3) {
                        sb2.append(split[0]);
                        if (split[1] != null) {
                            int length = 4 - split[1].length();
                            if (length > 0) {
                                sb2.append("0000".substring(0, length));
                            }
                            sb2.append(split[1]);
                        }
                        if (split[2] != null) {
                            int length2 = 4 - split[2].length();
                            if (length2 > 0) {
                                sb2.append("0000".substring(0, length2));
                            }
                            sb2.append(split[2]);
                        }
                    }
                    sb = sb2.toString();
                }
                this.c = sb;
            }
        }
        this.n = aVar.g;
        this.p = aVar.j;
        this.q = aVar.k;
    }

    public final Map<String, Object> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90670c2579a8802f1e3809c8ab4a69c9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90670c2579a8802f1e3809c8ab4a69c9");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("appName", this.b);
        hashMap.put("appVersion", this.c);
        hashMap.put("version", this.d);
        hashMap.put("deviceType", this.e);
        hashMap.put(DeviceInfo.OS_NAME, this.f.toLowerCase());
        hashMap.put("osVersion", this.g);
        hashMap.put("machVersion", this.h);
        hashMap.put("uuid", this.i);
        hashMap.put("unionId", this.j);
        hashMap.put(DeviceInfo.USER_ID, this.k);
        hashMap.put("userName", this.l);
        Context context = this.r;
        Context context2 = this.r;
        Object[] objArr2 = {context2};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.mach.utils.j.a;
        hashMap.put("screenWidth", Integer.valueOf(com.sankuai.waimai.mach.utils.j.a(context, PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a4d1ee699e4716243a416815455a0572", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a4d1ee699e4716243a416815455a0572")).intValue() : context2.getResources().getDisplayMetrics().widthPixels)));
        Context context3 = this.r;
        Context context4 = this.r;
        Object[] objArr3 = {context4};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.mach.utils.j.a;
        hashMap.put("screenHeight", Integer.valueOf(com.sankuai.waimai.mach.utils.j.a(context3, PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "88245e48028aeb79d5f8622ae499c9bf", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "88245e48028aeb79d5f8622ae499c9bf")).intValue() : context4.getResources().getDisplayMetrics().heightPixels)));
        hashMap.put("isBetaApp", Boolean.valueOf(this.m));
        hashMap.put("density", Float.valueOf(this.o));
        hashMap.put("accessibilityEnabled", Boolean.valueOf(com.sankuai.waimai.mach.utils.e.d(this.r)));
        return hashMap;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        String d;
        public String e;
        public String f;
        public int g;
        public Context h;
        public boolean i;
        public String j;
        public String[] k;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e57a77ee7369c54d2579f0c08f21c887", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e57a77ee7369c54d2579f0c08f21c887");
            } else {
                this.i = false;
            }
        }

        public final f a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eafe7e31a3f9c9b71c6ff8b843504109", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eafe7e31a3f9c9b71c6ff8b843504109") : new f(this);
        }
    }
}
