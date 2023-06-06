package com.meituan.passport.exception.skyeyemonitor.module;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class p implements l {
    public static ChangeQuickRedirect a;

    public final void a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90922b89e25e982e4fead1ec5a32612f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90922b89e25e982e4fead1ec5a32612f");
        } else {
            com.sankuai.meituan.skyeye.library.core.e.a("biz_passport", "outer_mop_operator", "mop_image_success", map);
        }
    }

    public final void b(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f72017c244a05cbb8155954e4a5978f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f72017c244a05cbb8155954e4a5978f2");
        } else {
            com.sankuai.meituan.skyeye.library.core.e.a("biz_passport", "outer_mop_operator", "mop_image_failed", "获取资源图片失败", map);
        }
    }
}
