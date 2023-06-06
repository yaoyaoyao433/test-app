package com.sankuai.waimai.irmo.canvas;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.canvas.bridge.jscallbak.CanvasMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public boolean i;
    public int j;
    public String k;
    public String l;
    public float m;
    public int n;
    private CanvasMap o;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        public boolean d;
        public String e;
        public String f;
    }

    public b(a aVar) {
        PackageInfo packageInfo;
        String sb;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1deea5db564605da7c485da93133015", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1deea5db564605da7c485da93133015");
            return;
        }
        this.j = 48;
        Application application = com.sankuai.waimai.irmo.a.a().b;
        try {
            packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
            try {
                this.g = Build.BRAND + "@" + Build.MODEL;
                this.m = application.getResources().getDisplayMetrics().density;
                this.n = application.getResources().getDisplayMetrics().densityDpi;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        PackageInfo packageInfo2 = packageInfo;
        if (packageInfo2 != null && !TextUtils.isEmpty(packageInfo2.versionName)) {
            String str = packageInfo2.versionName;
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ec8feb4ab2191f28dbf61d857a9fa683", RobustBitConfig.DEFAULT_VALUE)) {
                sb = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ec8feb4ab2191f28dbf61d857a9fa683");
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
            this.d = packageInfo2.versionName;
        }
        this.b = aVar.b;
        this.e = "android";
        this.f = Build.VERSION.SDK + CommonConstant.Symbol.UNDERLINE + Build.VERSION.RELEASE;
        this.h = aVar.c;
        this.i = aVar.d;
        this.k = aVar.e;
        this.l = aVar.f;
    }

    public final CanvasMap a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c152aae8979690e4b4b00ab1ef2be36", RobustBitConfig.DEFAULT_VALUE)) {
            return (CanvasMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c152aae8979690e4b4b00ab1ef2be36");
        }
        if (this.o == null) {
            this.o = new CanvasMap();
            this.o.put("appName", this.b);
            this.o.put("version", this.d);
            this.o.put(DeviceInfo.OS_NAME, this.e);
            this.o.put("osVersion", this.f);
            this.o.put("uuid", this.h);
            this.o.put("scale", Float.valueOf(this.m));
            this.o.put("densityDpi", Integer.valueOf(this.n));
            this.o.put("isDebug", Boolean.valueOf(this.i));
            this.o.put("isIOS", Boolean.FALSE);
            this.o.put("isAndroid", Boolean.TRUE);
            this.o.put("navigationBarHeight", Integer.valueOf(this.j));
            this.o.put(DeviceInfo.DEVICE_MODEL, this.g);
            this.o.put("isFullScreen", Boolean.FALSE);
        }
        return this.o;
    }
}
