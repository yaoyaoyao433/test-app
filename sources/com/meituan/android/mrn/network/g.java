package com.meituan.android.mrn.network;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class g {
    public static ChangeQuickRedirect a;
    private static Map<String, f> b = new HashMap();
    private static Map<String, List<f>> c = new HashMap();

    public static synchronized List<f> a(String str, String str2) {
        List a2;
        synchronized (g.class) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b642ceac12e8f6f8247b3e3533264d33", RobustBitConfig.DEFAULT_VALUE)) {
                return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b642ceac12e8f6f8247b3e3533264d33");
            }
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str2)) {
                Iterator<Map.Entry<String, List<f>>> it = c.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry<String, List<f>> next = it.next();
                    if (str2.equals(next.getKey())) {
                        if (next.getValue() != null) {
                            arrayList.addAll(next.getValue());
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(str)) {
                if (b.containsKey(str)) {
                    arrayList.add(b.get(str));
                } else if (com.sankuai.meituan.serviceloader.b.a() && (a2 = com.sankuai.meituan.serviceloader.b.a(f.class, str)) != null && a2.size() > 0) {
                    f fVar = (f) a2.get(0);
                    b.put(str, fVar);
                    arrayList.add(fVar);
                }
            }
            return arrayList;
        }
    }
}
