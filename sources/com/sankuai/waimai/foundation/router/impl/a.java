package com.sankuai.waimai.foundation.router.impl;

import android.annotation.SuppressLint;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.router.interfaces.e;
import com.sankuai.waimai.router.core.d;
import com.sankuai.waimai.router.core.f;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static e b;
    @SuppressLint({"StaticFieldLeak"})
    public static com.sankuai.waimai.router.common.a c;

    public static com.sankuai.waimai.router.common.a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9f6ac9a1466bddd3d30931356bd87ce2", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.router.common.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9f6ac9a1466bddd3d30931356bd87ce2");
        }
        if (c == null) {
            d.b(new RuntimeException("WMUriImplements注册页面前需要先初始化"));
        }
        f c2 = com.sankuai.waimai.router.a.c();
        if (c2 instanceof com.sankuai.waimai.router.common.a) {
            return (com.sankuai.waimai.router.common.a) c2;
        }
        d.b(new RuntimeException("Router被非法初始化:" + c2));
        return c;
    }
}
