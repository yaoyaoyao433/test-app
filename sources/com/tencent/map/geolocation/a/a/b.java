package com.tencent.map.geolocation.a.a;

import android.annotation.TargetApi;
import android.content.Context;
import com.meituan.robust.common.StringUtil;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b {
    private static b c;
    private Context a;
    private List<a> b;
    private String d = "";

    private b(Context context) {
        this.b = null;
        this.a = context;
        this.b = new ArrayList();
    }

    public static b a(Context context) {
        if (c == null) {
            c = new b(context);
        }
        return c;
    }

    @TargetApi(3)
    private synchronized DexClassLoader a() {
        DexClassLoader dexClassLoader;
        DexClassLoader dexClassLoader2;
        com.tencent.map.geolocation.a.b.b.c(this.a);
        if (this.b != null && this.b.size() > 0) {
            com.tencent.map.geolocation.a.b.h.b = com.tencent.map.geolocation.a.b.h.a(this.b);
            String str = this.a.getFilesDir().getAbsolutePath() + File.separator + this.d;
            String str2 = this.a.getFilesDir().getAbsolutePath() + File.separator + "TencentLocation/odex";
            StringBuilder sb = new StringBuilder();
            for (a aVar : this.b) {
                if (aVar != null) {
                    sb.append(str);
                    sb.append(File.separator);
                    sb.append(aVar.c);
                    sb.append(File.pathSeparator);
                }
            }
            try {
                System.currentTimeMillis();
                dexClassLoader = new DexClassLoader(sb.toString(), str2, null, getClass().getClassLoader());
                try {
                    List<String> a = com.tencent.map.geolocation.a.b.h.a(new File(str));
                    if (a != null) {
                        StringBuilder sb2 = new StringBuilder();
                        for (String str3 : a) {
                            sb2.append(str3);
                            sb2.append(";");
                        }
                        e.a(this.a).a("DFI", sb2.toString());
                    } else {
                        e.a(this.a).a("DFI", StringUtil.NULL);
                    }
                    e.a(this.a).a("CPL", "suc:" + com.tencent.map.geolocation.a.b.h.b);
                    return dexClassLoader;
                } catch (Exception e) {
                    e = e;
                    e.a(this.a).a("CPL", "fail:" + com.tencent.map.geolocation.a.b.h.b + ",exc:" + e.toString());
                    com.tencent.map.geolocation.a.b.b.c(this.a);
                    try {
                        System.currentTimeMillis();
                        dexClassLoader2 = new DexClassLoader(sb.toString(), str2, null, getClass().getClassLoader());
                    } catch (Throwable unused) {
                        dexClassLoader2 = dexClassLoader;
                    }
                    try {
                        e.a(this.a).a("CPL", "suc:c" + com.tencent.map.geolocation.a.b.h.b);
                        return dexClassLoader2;
                    } catch (Throwable unused2) {
                        return dexClassLoader2;
                    }
                }
            } catch (Exception e2) {
                e = e2;
                dexClassLoader = null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final DexClassLoader a(List<a> list, String str) {
        DexClassLoader dexClassLoader;
        Throwable th;
        synchronized (this) {
            this.b = list;
        }
        this.d = str;
        int i = 0;
        DexClassLoader dexClassLoader2 = null;
        while (true) {
            int i2 = i + 1;
            if (i >= 3) {
                dexClassLoader = dexClassLoader2;
                break;
            }
            try {
                dexClassLoader = a();
                try {
                    e.a().a("CPL", "lcn:".concat(String.valueOf(i2)));
                    if (dexClassLoader != null) {
                        com.tencent.map.geolocation.a.b.b.b(this.a);
                        return dexClassLoader;
                    }
                    dexClassLoader2 = dexClassLoader;
                    i = i2;
                } catch (Throwable th2) {
                    th = th2;
                    e a = e.a();
                    a.a("CPL", "fail:" + th.toString());
                    com.tencent.map.geolocation.a.b.b.b(this.a);
                    return dexClassLoader;
                }
            } catch (Throwable th3) {
                DexClassLoader dexClassLoader3 = dexClassLoader2;
                th = th3;
                dexClassLoader = dexClassLoader3;
            }
        }
        com.tencent.map.geolocation.a.b.b.b(this.a);
        return dexClassLoader;
    }
}
