package com.sankuai.waimai.machpro.module.builtin;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.manager.cache.c;
import com.sankuai.waimai.mach.utils.e;
import com.sankuai.waimai.mach.utils.g;
import com.sankuai.waimai.machpro.base.JSMethod;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.f;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.machpro.module.MPModule;
import com.sankuai.waimai.machpro.monitor.a;
import com.sankuai.waimai.machpro.util.b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MPRaptorModule extends MPModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    public MPRaptorModule(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "71f122d3a6050781caebb05ad96dd468", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "71f122d3a6050781caebb05ad96dd468");
        }
    }

    @JSMethod(methodName = "reportBusinessException")
    public void reportBusinessException(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa194daeb4cf99e80797c482d6a28e87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa194daeb4cf99e80797c482d6a28e87");
        } else if (getMachContext() == null || getMachContext().getBundle() == null) {
        } else {
            c bundle = getMachContext().getBundle();
            e.a(getMachContext().getInstance().B, bundle.d, bundle.e, str, str2, true, true);
        }
    }

    @JSMethod(methodName = "reportMetrics")
    public void reportMetrics(MachMap machMap, MachMap machMap2, Number number) {
        Object[] objArr = {machMap, machMap2, number};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fde5ff2ea8721e7eef91d7534dab66d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fde5ff2ea8721e7eef91d7534dab66d6");
            return;
        }
        try {
            a aVar = f.a().j;
            if (aVar != null && machMap != null) {
                if (number == null || g.a(number.floatValue())) {
                    HashMap<String, Object> b = machMap2 != null ? b.b(machMap2) : null;
                    for (Map.Entry<String, Object> entry : b.b(machMap).entrySet()) {
                        if (entry.getValue() instanceof Number) {
                            HashMap hashMap = new HashMap();
                            hashMap.put(entry.getKey(), (Number) entry.getValue());
                            aVar.a(hashMap, b);
                            return;
                        } else if (entry.getValue() instanceof List) {
                            aVar.a(entry.getKey(), (List) entry.getValue(), b);
                            return;
                        }
                    }
                }
            }
        } catch (Exception e) {
            com.sankuai.waimai.machpro.util.a.a("reportMetrics-->failed! " + e.getMessage());
        }
    }
}
