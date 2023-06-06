package com.meituan.android.common.locate.fusionlocation.featues;

import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes2.dex */
public class c {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static HashMap<String, Object> a() {
        long j;
        boolean z;
        boolean z2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9259e02ee824a105aae9049c4462825b", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9259e02ee824a105aae9049c4462825b");
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        String str = "unknown";
        List<Pair<Pair<Long, Pair<Boolean, Boolean>>, double[]>> e = com.meituan.android.common.locate.fusionlocation.a.a().e();
        if (e.size() > 0) {
            Pair<Pair<Long, Pair<Boolean, Boolean>>, double[]> pair = e.get(e.size() - 1);
            j = ((Long) ((Pair) pair.first).first).longValue();
            z = ((Boolean) ((Pair) ((Pair) pair.first).second).first).booleanValue();
            z2 = ((Boolean) ((Pair) ((Pair) pair.first).second).second).booleanValue();
            str = (z && z2) ? "传感器无效" : "传感器无效";
            StringBuilder sb = new StringBuilder();
            sb.append(((double[]) pair.second)[0]);
            if ("1.0".equals(sb.toString())) {
                str = "静止";
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(((double[]) pair.second)[1]);
                if ("1.0".equals(sb2.toString())) {
                    str = "步行";
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(((double[]) pair.second)[2]);
                    if ("1.0".equals(sb3.toString())) {
                        str = "骑行";
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(((double[]) pair.second)[3]);
                        if ("1.0".equals(sb4.toString())) {
                            str = "驾车";
                        }
                    }
                }
            }
        } else {
            j = 0;
            z = false;
            z2 = false;
        }
        hashMap.put("motionState", str);
        hashMap.put("motionStateTs", Long.valueOf(j));
        hashMap.put("gyroscopeIsValid", Boolean.valueOf(z));
        hashMap.put("acceleratorIsValid", Boolean.valueOf(z2));
        return hashMap;
    }
}
