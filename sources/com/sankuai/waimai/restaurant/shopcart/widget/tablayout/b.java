package com.sankuai.waimai.restaurant.shopcart.widget.tablayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static final int[] b = {R.attr.colorPrimary};

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "72027fd06a809d1ef7ef8f83519a4e4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "72027fd06a809d1ef7ef8f83519a4e4a");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(b);
        boolean hasValue = true ^ obtainStyledAttributes.hasValue(0);
        obtainStyledAttributes.recycle();
        if (hasValue) {
            throw new IllegalArgumentException("You need to use a Theme.AppCompat theme (or descendant) with the design library.");
        }
    }
}
