package com.huawei.updatesdk.b.a.b;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.util.ArrayMap;
import android.util.ArraySet;
import com.huawei.updatesdk.a.a.d.g;
import com.huawei.updatesdk.b.a.b.a;
import com.huawei.updatesdk.b.a.b.c;
import java.io.File;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
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

    private static void a(a aVar) {
        a().a.put(aVar.c(), aVar);
    }

    private static ArrayList<String> b(PackageInfo packageInfo) {
        ArraySet<String> arraySet;
        a aVar = new a();
        aVar.a(packageInfo.packageName);
        File file = new File(packageInfo.applicationInfo.sourceDir);
        if (file.exists()) {
            aVar.a(file.lastModified());
            c.a a = c.a(file);
            ArrayMap<String, ArraySet<PublicKey>> arrayMap = a.a;
            if (arrayMap == null || arrayMap.isEmpty() || (arraySet = a.b) == null || arraySet.isEmpty()) {
                a(aVar);
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>();
            for (Map.Entry<String, ArraySet<PublicKey>> entry : a.a.entrySet()) {
                if (a.b.contains(entry.getKey())) {
                    Iterator<PublicKey> it = entry.getValue().iterator();
                    while (it.hasNext()) {
                        arrayList.add(g.a(it.next().getEncoded()));
                    }
                }
            }
            a.C0177a c0177a = new a.C0177a();
            c0177a.a(arrayList);
            aVar.a(c0177a);
            a(aVar);
            return arrayList;
        }
        return null;
    }

    public List<String> a(PackageInfo packageInfo) {
        String str;
        if (Build.VERSION.SDK_INT < 21 || packageInfo == null || (str = packageInfo.applicationInfo.sourceDir) == null) {
            return null;
        }
        long lastModified = new File(str).lastModified();
        a aVar = a().a.get(packageInfo.packageName);
        if (aVar == null || aVar.b() != lastModified) {
            return b(packageInfo);
        }
        if (aVar.a() == null) {
            return null;
        }
        return aVar.a().a();
    }
}
