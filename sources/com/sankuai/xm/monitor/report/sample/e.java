package com.sankuai.xm.monitor.report.sample;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private static final HashMap<f, c> b;
    private static com.sankuai.xm.base.sp.c c;

    static {
        HashMap<f, c> hashMap = new HashMap<>();
        b = hashMap;
        hashMap.put(f.TIME, new g());
        b.put(f.FIRST, new a());
    }

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "17037dc014e2de25d051056573d47b6f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "17037dc014e2de25d051056573d47b6f");
        } else {
            c = new com.sankuai.xm.base.sp.c(context, "XM_SDK_SAMPLE_REPORT", 0);
        }
    }

    public static void a(String str, String str2, HashMap<String, Object> hashMap, boolean z, d... dVarArr) {
        Object[] objArr = {str, str2, hashMap, (byte) 0, dVarArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2540161377559a2f645e8e2a6107d3fc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2540161377559a2f645e8e2a6107d3fc");
        } else if (c == null) {
            com.sankuai.xm.monitor.c.a(str, hashMap);
        } else {
            boolean z2 = false;
            for (int i = 0; i < 2; i++) {
                d dVar = dVarArr[i];
                c cVar = b.get(dVar.a());
                if (cVar != null) {
                    z2 |= cVar.a(str, str2, dVar);
                    cVar.a(str, str2, false);
                }
            }
            int i2 = 0;
            Object[] objArr2 = {str, str2, (byte) 0};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c52bf6ca77a817d7c79b4547264f33fa", 6917529027641081856L)) {
                i2 = ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c52bf6ca77a817d7c79b4547264f33fa")).intValue();
            } else {
                com.sankuai.xm.base.sp.c cVar2 = c;
            }
            if (z2) {
                a(str, str2, hashMap, i2, dVarArr);
            }
        }
    }

    private static void a(String str, String str2, HashMap<String, Object> hashMap, int i, d[] dVarArr) {
        HashMap<String, Object> hashMap2;
        Object[] objArr = {str, str2, hashMap, Integer.valueOf(i), dVarArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aad500a6d9f3667403e96c147f5bc989", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aad500a6d9f3667403e96c147f5bc989");
            return;
        }
        if (i > 0) {
            hashMap2 = hashMap == null ? new HashMap<>() : hashMap;
            hashMap2.put("sample_count", Integer.valueOf(i));
        } else {
            hashMap2 = hashMap;
        }
        com.sankuai.xm.monitor.c.a(str, hashMap2);
        for (d dVar : dVarArr) {
            c cVar = b.get(dVar.a());
            if (cVar != null) {
                cVar.a(str, str2, true);
            }
        }
        Object[] objArr2 = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "41c3b344845ebb49feff2e306b4950ce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "41c3b344845ebb49feff2e306b4950ce");
        } else if (c == null) {
            com.sankuai.xm.log.c.b("SampleReport", "SampleReport::resetEventCount=>" + a(str, str2), new Object[0]);
        } else {
            c.edit().remove(a(str, str2) + "_count").apply();
        }
    }

    private static String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d9e917d688b81138ae2bf99185910d42", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d9e917d688b81138ae2bf99185910d42");
        }
        return str + CommonConstant.Symbol.UNDERLINE + str2;
    }
}
