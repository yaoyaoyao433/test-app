package com.sankuai.waimai.bussiness.order.confirm.helper;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.math.BigDecimal;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static Double a(Double d, Double d2) {
        Object[] objArr = {d, d2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1c49c994a541d0dfd4bb10f93640cb98", RobustBitConfig.DEFAULT_VALUE) ? (Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1c49c994a541d0dfd4bb10f93640cb98") : Double.valueOf(new BigDecimal(Double.toString(d.doubleValue())).add(new BigDecimal(Double.toString(d2.doubleValue()))).setScale(2, 1).doubleValue());
    }

    public static Double b(Double d, Double d2) {
        Object[] objArr = {d, d2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "96348c2d5b624fb5be37fdc18ba8b573", RobustBitConfig.DEFAULT_VALUE) ? (Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "96348c2d5b624fb5be37fdc18ba8b573") : Double.valueOf(new BigDecimal(Double.toString(d.doubleValue())).subtract(new BigDecimal(Double.toString(d2.doubleValue()))).setScale(2, 1).doubleValue());
    }
}
