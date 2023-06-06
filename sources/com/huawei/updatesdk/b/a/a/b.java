package com.huawei.updatesdk.b.a.a;

import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.huawei.updatesdk.a.a.d.d;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class b {
    private static b b;
    private final Map<String, a> a = new HashMap();

    private b() {
    }

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            if (b == null) {
                b = new b();
            }
            bVar = b;
        }
        return bVar;
    }

    public String a(PackageInfo packageInfo) {
        if (packageInfo == null || packageInfo.packageName == null || TextUtils.isEmpty(packageInfo.applicationInfo.sourceDir)) {
            return null;
        }
        a aVar = this.a.get(packageInfo.packageName);
        if (aVar != null && aVar.b() == packageInfo.lastUpdateTime && aVar.c() == packageInfo.versionCode) {
            return aVar.a();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(packageInfo.lastUpdateTime);
        sb.append(packageInfo.versionCode);
        sb.append(packageInfo.packageName);
        String str = "packagekey" + packageInfo.packageName;
        String str2 = "fileshakey" + packageInfo.packageName;
        boolean z = !TextUtils.equals(sb.toString(), com.huawei.updatesdk.b.b.a.d().c(str));
        if (z) {
            com.huawei.updatesdk.b.b.a.d().a(str, sb.toString());
        }
        String c = com.huawei.updatesdk.b.b.a.d().c(str2);
        if (TextUtils.isEmpty(c) || z) {
            c = d.a(packageInfo.applicationInfo.sourceDir, "SHA-256");
            com.huawei.updatesdk.b.b.a.d().a(str2, c);
        }
        a aVar2 = new a();
        aVar2.a(c);
        aVar2.a(packageInfo.lastUpdateTime);
        aVar2.a(packageInfo.versionCode);
        this.a.put(packageInfo.packageName, aVar2);
        return c;
    }
}
