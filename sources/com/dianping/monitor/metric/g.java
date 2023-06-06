package com.dianping.monitor.metric;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g {
    public static ChangeQuickRedirect a;

    public static String a(List<String> list, List<a> list2) {
        Object[] objArr = {list, list2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "586c7aeae0e8eec8213affa97a37fb6d", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "586c7aeae0e8eec8213affa97a37fb6d");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(1);
        sb.append("\t");
        sb.append(list2 != null ? list2.size() : 0);
        sb.append("\n");
        if (list != null && !list.isEmpty()) {
            for (String str : list) {
                sb.append(b(str));
                sb.append("\t");
            }
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append("\n");
        if (list2 == null) {
            return sb.toString();
        }
        for (a aVar : list2) {
            int i = aVar.g > 0 ? 1 : 0;
            sb.append(i);
            sb.append("\t");
            int i2 = !TextUtils.isEmpty(aVar.f) ? 1 : 0;
            sb.append(i2);
            sb.append("\t");
            Map<String, String> map = aVar.d;
            int i3 = (map == null || map.isEmpty()) ? 0 : 1;
            sb.append(i3);
            sb.append("\t");
            Map<String, List<Float>> map2 = aVar.e;
            int size = map2 != null ? map2.size() : 0;
            sb.append(size);
            sb.append("\n");
            if (i > 0) {
                sb.append(aVar.g);
                sb.append("\n");
            }
            if (i2 > 0) {
                sb.append(b(aVar.f));
                sb.append("\n");
            }
            if (i3 > 0) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    sb.append(b(entry.getKey()));
                    sb.append("\t");
                    sb.append(b(entry.getValue()));
                    sb.append("\t");
                }
                sb.deleteCharAt(sb.length() - 1);
                sb.append("\n");
            }
            if (size > 0) {
                for (Map.Entry<String, List<Float>> entry2 : map2.entrySet()) {
                    sb.append(b(entry2.getKey()));
                    sb.append("\t");
                    for (Float f : entry2.getValue()) {
                        sb.append(a(f.toString()));
                        sb.append("\t");
                    }
                    sb.deleteCharAt(sb.length() - 1);
                    sb.append("\n");
                }
            }
        }
        return sb.toString();
    }

    private static String a(String str) {
        BigDecimal stripTrailingZeros;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "98705342e41036177550c01db08dbb83", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "98705342e41036177550c01db08dbb83");
        }
        BigDecimal bigDecimal = new BigDecimal(str);
        if (bigDecimal.compareTo(BigDecimal.ZERO) == 0) {
            stripTrailingZeros = BigDecimal.ZERO;
        } else {
            stripTrailingZeros = bigDecimal.stripTrailingZeros();
        }
        return stripTrailingZeros.toPlainString();
    }

    private static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4a720ddc227f39a93559f1c4453a2714", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4a720ddc227f39a93559f1c4453a2714") : str == null ? "" : str.replaceAll("\\s+", "");
    }
}
