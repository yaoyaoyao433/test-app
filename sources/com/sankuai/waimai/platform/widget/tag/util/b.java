package com.sankuai.waimai.platform.widget.tag.util;

import android.content.Context;
import android.util.TypedValue;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static int a(Context context, float f) {
        Object[] objArr = {context, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "53db613fc811dac78370ec7725a0dd5d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "53db613fc811dac78370ec7725a0dd5d")).intValue();
        }
        int i = (int) ((context.getResources().getDisplayMetrics().density * f) + 0.5f);
        return i != 0 ? i : f > 0.0f ? 1 : 0;
    }

    public static int b(Context context, float f) {
        Object[] objArr = {context, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7d17ebf3d847c148928de42af595ad7a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7d17ebf3d847c148928de42af595ad7a")).intValue() : (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }
}
