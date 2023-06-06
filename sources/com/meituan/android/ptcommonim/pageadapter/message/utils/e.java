package com.meituan.android.ptcommonim.pageadapter.message.utils;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.p;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public PopupWindow b;

    public static int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b9332c6f30fe36038c1262509159a310", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b9332c6f30fe36038c1262509159a310")).intValue();
        }
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), i != -2 ? 1073741824 : 0);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74fc0d8d19b051dc80b919a9f1136180", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74fc0d8d19b051dc80b919a9f1136180");
        } else if (this.b == null || !this.b.isShowing()) {
        } else {
            p.b(this.b);
        }
    }

    public static int a(Context context, float f) {
        Object[] objArr = {context, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ef46a4b966ace63b19049f2dc3f77c6a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ef46a4b966ace63b19049f2dc3f77c6a")).intValue() : (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
