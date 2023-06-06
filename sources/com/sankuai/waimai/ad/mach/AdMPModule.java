package com.sankuai.waimai.ad.mach;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.mads.b;
import com.sankuai.mads.e;
import com.sankuai.waimai.ad.mads.a;
import com.sankuai.waimai.machpro.base.JSMethod;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.machpro.module.MPModule;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.v;
import kotlin.jvm.internal.h;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/sankuai/waimai/ad/mach/AdMPModule;", "Lcom/sankuai/waimai/machpro/module/MPModule;", "context", "Lcom/sankuai/waimai/machpro/instance/MPContext;", "(Lcom/sankuai/waimai/machpro/instance/MPContext;)V", "adChargeReport", "", "adParams", "Lcom/sankuai/waimai/machpro/base/MachMap;", "library_wmRelease"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes4.dex */
public final class AdMPModule extends MPModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    public AdMPModule(@Nullable MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb2e1497b3b1fe079b3e8a803c1ca995", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb2e1497b3b1fe079b3e8a803c1ca995");
        }
    }

    @JSMethod(methodName = "adChargeReport")
    public final boolean adChargeReport(@NotNull MachMap machMap) {
        Map<String, Object> javaMap;
        Object[] objArr = {machMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe513a68373af6e9555ac5439868f1fd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe513a68373af6e9555ac5439868f1fd")).booleanValue();
        }
        h.b(machMap, "adParams");
        Object obj = machMap.getJavaMap().get("chargeInfo");
        String obj2 = obj != null ? obj.toString() : null;
        String valueOf = String.valueOf(machMap.getJavaMap().get("eventId"));
        Object obj3 = machMap.getJavaMap().get("adType");
        if (obj3 == null) {
            throw new o("null cannot be cast to non-null type kotlin.Int");
        }
        int intValue = ((Integer) obj3).intValue();
        Object obj4 = machMap.getJavaMap().get("actType");
        if (obj4 == null) {
            throw new o("null cannot be cast to non-null type kotlin.Int");
        }
        int intValue2 = ((Integer) obj4).intValue();
        MachMap machMap2 = (MachMap) machMap.getJavaMap().get("extra");
        if (machMap2 != null && (javaMap = machMap2.getJavaMap()) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(v.a(javaMap.size()));
            Iterator<T> it = javaMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), entry.getValue().toString());
            }
            obj2 = e.a(obj2, linkedHashMap);
        }
        a.a(intValue, new b.a(valueOf, obj2, intValue2));
        return true;
    }
}
