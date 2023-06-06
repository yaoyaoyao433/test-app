package com.sankuai.waimai.platform.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class k {
    public static ChangeQuickRedirect a;
    private static final Map<String, Long> b = Collections.synchronizedMap(new HashMap());

    public static void a(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a10d7d0bae82d7f47a815e1516a8e927", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a10d7d0bae82d7f47a815e1516a8e927");
        } else {
            b.put(str, Long.valueOf(j));
        }
    }

    public static long a(String str) {
        String str2;
        long j;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b018e6d58d689ce9deb81ee35ab68ca5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b018e6d58d689ce9deb81ee35ab68ca5")).longValue();
        }
        try {
            Iterator<Map.Entry<String, Long>> it = b.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    str2 = null;
                    j = -1;
                    break;
                }
                Map.Entry<String, Long> next = it.next();
                if (str.contains(next.getKey())) {
                    j = next.getValue().longValue();
                    str2 = next.getKey();
                    break;
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                b.remove(str2);
            }
            return j;
        } catch (Throwable unused) {
            return -1L;
        }
    }
}
