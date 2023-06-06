package com.meituan.android.common.locate.fusionlocation.featues;

import android.util.Pair;
import com.meituan.android.common.locate.provider.g;
import com.meituan.android.common.locate.provider.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes2.dex */
public class d {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static HashMap<String, Object> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "58cbafd43e44ce1aeef9cdd0e93bcf5e", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "58cbafd43e44ce1aeef9cdd0e93bcf5e");
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        long j = 0;
        float f = 0.0f;
        if (i.a(g.a()).c()) {
            List<Pair<Long, Float>> d = com.meituan.android.common.locate.fusionlocation.a.a().d();
            if (d.size() > 0) {
                Pair<Long, Float> pair = d.get(d.size() - 1);
                j = ((Long) pair.first).longValue();
                f = ((Float) pair.second).floatValue();
            }
        }
        hashMap.put("pressureTs", Long.valueOf(j));
        hashMap.put("pressureValue", Float.valueOf(f));
        return hashMap;
    }
}
