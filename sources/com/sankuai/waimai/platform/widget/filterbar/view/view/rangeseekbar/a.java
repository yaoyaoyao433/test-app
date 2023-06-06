package com.sankuai.waimai.platform.widget.filterbar.view.view.rangeseekbar;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static int a(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "832eafddfc730493379b0c0327ad3732", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "832eafddfc730493379b0c0327ad3732")).intValue() : Math.round(i * a(context));
    }

    private static float a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cddaf4b25c4011080248dee1d3dca9ea", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cddaf4b25c4011080248dee1d3dca9ea")).floatValue() : context.getResources().getDisplayMetrics().xdpi / 160.0f;
    }
}
