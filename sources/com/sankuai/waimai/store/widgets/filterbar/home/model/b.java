package com.sankuai.waimai.store.widgets.filterbar.home.model;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.ab;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static long a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "314185b5ddd5fe6ae4de17691c751d4b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "314185b5ddd5fe6ae4de17691c751d4b")).longValue();
        }
        ab b = ab.b();
        return b.b(context, "sc_key_filter_bubble_" + str, 0L);
    }

    public static void a(Context context, String str, BubbleInfoBean bubbleInfoBean) {
        Object[] objArr = {context, str, bubbleInfoBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c8ba2cba3045c622bc3a518d9fc32068", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c8ba2cba3045c622bc3a518d9fc32068");
        } else if (bubbleInfoBean != null && bubbleInfoBean.version > a(context, str)) {
            ab b = ab.b();
            b.a(context, "sc_key_filter_bubble_" + str, bubbleInfoBean.version);
        }
    }
}
