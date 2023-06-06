package com.meituan.android.cipstorage;

import android.os.Build;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.meituan.android.cipstorage.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class p extends j.c {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.cipstorage.j.c
    public final String a() {
        return "clean.zombie";
    }

    @Override // com.meituan.android.cipstorage.j.c
    public final boolean a(af afVar) {
        Object[] objArr = {afVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cd62ddff329bc30873e1a41c58baf1f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cd62ddff329bc30873e1a41c58baf1f")).booleanValue();
        }
        return true;
    }

    @Override // com.meituan.android.cipstorage.j.c
    public final void b(af afVar) {
        Map hashMap;
        Object[] objArr = {afVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73fdd036b5e52818548be93a22413049", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73fdd036b5e52818548be93a22413049");
            return;
        }
        List<String> b = afVar.b();
        if (b == null || b.isEmpty()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            hashMap = new ArrayMap();
        } else {
            hashMap = new HashMap();
        }
        long j = 0;
        for (String str : b) {
            if (!TextUtils.isEmpty(str)) {
                long a2 = ab.a(new File(str));
                if (a2 > 0) {
                    j += a2;
                    hashMap.put(str, Long.valueOf(a2));
                }
            }
        }
        v.a("zombie", j, hashMap);
    }
}
