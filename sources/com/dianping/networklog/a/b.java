package com.dianping.networklog.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.dianping.networklog.aj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class b {
    public static ChangeQuickRedirect a;
    final SharedPreferences b;

    public b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "821c5a9e92707f3700cc292cb98146ca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "821c5a9e92707f3700cc292cb98146ca");
        } else {
            this.b = aj.a(context, "logan_log_monitor_sp_v1", 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<Integer, Integer> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "610178a7e34b3e843389bcda4c108408", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "610178a7e34b3e843389bcda4c108408");
        }
        Map<String, ?> all = this.b.getAll();
        if (all == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            if (key != null && key.startsWith(str)) {
                try {
                    int parseInt = Integer.parseInt(key.substring(str.length()));
                    if (entry.getValue() instanceof Integer) {
                        hashMap.put(Integer.valueOf(parseInt), (Integer) entry.getValue());
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, Map<Integer, Integer> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e52ab14ae2d66f41a15ac195db4a360", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e52ab14ae2d66f41a15ac195db4a360");
        } else if (map != null) {
            SharedPreferences.Editor edit = this.b.edit();
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                edit.putInt(str + entry.getKey(), entry.getValue().intValue());
            }
            edit.apply();
        }
    }
}
