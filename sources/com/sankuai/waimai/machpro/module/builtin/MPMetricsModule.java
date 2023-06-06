package com.sankuai.waimai.machpro.module.builtin;

import android.text.TextUtils;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.base.JSMethod;
import com.sankuai.waimai.machpro.base.MachArray;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.machpro.module.MPModule;
import com.sankuai.waimai.machpro.monitor.b;
import com.sankuai.waimai.machpro.monitor.c;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MPMetricsModule extends MPModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    public MPMetricsModule(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9095fc4261757d74eb89c2d02f490b8c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9095fc4261757d74eb89c2d02f490b8c");
        }
    }

    @JSMethod(methodName = "reportSteps")
    public void reportSteps(String str, MachArray machArray) {
        Object[] objArr = {str, machArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "41e8f9c1bd7bc21276e3e6579d106e74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "41e8f9c1bd7bc21276e3e6579d106e74");
        } else if (!TextUtils.isEmpty(str) && machArray != null && machArray.size() > 0) {
            b bVar = new b(str);
            for (int i = 0; i < machArray.size(); i++) {
                if (machArray.get(i) instanceof MachMap) {
                    MachMap machMap = (MachMap) machArray.get(i);
                    String a = com.sankuai.waimai.machpro.util.b.a(machMap.get(Constants.SPEED_METER_STEP), "");
                    float b = com.sankuai.waimai.machpro.util.b.b(machMap.get("time"));
                    if (!TextUtils.isEmpty(a)) {
                        long j = b;
                        Object[] objArr2 = {a, new Long(j)};
                        ChangeQuickRedirect changeQuickRedirect3 = b.a;
                        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect3, false, "82ffabcb7548ce596bbe40412d3293c6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect3, false, "82ffabcb7548ce596bbe40412d3293c6");
                        } else {
                            bVar.c.put(a, Long.valueOf(j));
                        }
                    }
                }
            }
            if (bVar.c.size() > 0) {
                c.a().a(bVar);
            }
        }
    }
}
