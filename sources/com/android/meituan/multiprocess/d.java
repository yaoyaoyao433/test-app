package com.android.meituan.multiprocess;

import android.text.TextUtils;
import com.meituan.robust.common.StringUtil;
import com.sankuai.common.utils.ProcessUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d {
    private static List<a> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void a(a aVar) {
        synchronized (d.class) {
            if (aVar != null) {
                if (a == null) {
                    ArrayList arrayList = new ArrayList();
                    a = arrayList;
                    arrayList.add(aVar);
                } else if (!a.contains(aVar)) {
                    a.add(aVar);
                }
            }
        }
    }

    public static void a(String str) {
        if (e.b()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(StringUtil.SPACE);
            sb.append(ProcessUtils.getCurrentProcessName(e.a()));
            sb.append("  ");
            sb.append(Thread.currentThread().getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str, Class cls, String str2, long j) {
        HashMap hashMap = new HashMap();
        if (cls != null) {
            hashMap.put("clazz", cls.getName());
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("extra", str2);
        }
        hashMap.put("time", String.valueOf(j));
        a(str, hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void a(String str, Map<String, String> map) {
        synchronized (d.class) {
            if (a != null && a.size() > 0) {
                for (a aVar : a) {
                    if (aVar != null) {
                        aVar.a(str, map);
                    }
                }
            }
            if (e.b()) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" values:");
                sb.append(a(map));
            }
        }
    }

    private static String a(Map<String, String> map) {
        if (map == null) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        boolean z = true;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (z) {
                z = false;
            } else {
                sb.append(',');
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
        }
        sb.append('}');
        return sb.toString();
    }
}
