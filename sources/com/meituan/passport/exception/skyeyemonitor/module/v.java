package com.meituan.passport.exception.skyeyemonitor.module;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class v implements l {
    public static ChangeQuickRedirect a;

    public final void a(Map<String, Object> map) {
        Object[] objArr = {null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15a2be4f895e5695c8ee886463738aca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15a2be4f895e5695c8ee886463738aca");
        } else {
            com.sankuai.meituan.skyeye.library.core.e.a("biz_passport", "outer_operator_show", "chinamobile_outer_get_mobile_success", null);
        }
    }

    public final void b(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8be18751bf447b29d3da96b15a6df0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8be18751bf447b29d3da96b15a6df0b");
        } else {
            com.sankuai.meituan.skyeye.library.core.e.a("biz_passport", "outer_operator_show", "chinamobile_outer_get_mobile_failed", "预取号失败", map);
        }
    }
}
