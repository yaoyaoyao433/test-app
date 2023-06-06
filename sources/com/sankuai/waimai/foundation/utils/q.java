package com.sankuai.waimai.foundation.utils;

import android.graphics.Typeface;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class q {
    public static ChangeQuickRedirect a;
    private Typeface b;

    public q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "109de76279c9a43f8156de2f0744c3c0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "109de76279c9a43f8156de2f0744c3c0");
            return;
        }
        try {
            this.b = Typeface.createFromAsset(com.meituan.android.singleton.b.a.getAssets(), "fonts/AvenirLTPro-Medium.ttf");
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a("NumberFontHelper", e);
        }
    }

    public final void a(TextView textView) {
        Object[] objArr = {textView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4a1b32e6a1a2f82958aa79c78af1584", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4a1b32e6a1a2f82958aa79c78af1584");
        } else if (textView == null || this.b == null) {
        } else {
            textView.setTypeface(this.b);
        }
    }
}
