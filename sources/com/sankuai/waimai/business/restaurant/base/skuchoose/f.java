package com.sankuai.waimai.business.restaurant.base.skuchoose;

import android.graphics.Typeface;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f {
    public static ChangeQuickRedirect a;

    public static void a(TextView textView) {
        Object[] objArr = {textView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f9bd727815519ab0a80b7141b5be9be6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f9bd727815519ab0a80b7141b5be9be6");
            return;
        }
        try {
            textView.setTypeface(Typeface.createFromAsset(com.meituan.android.singleton.b.a.getAssets(), "fonts/AvenirLTPro-Medium.ttf"));
        } catch (Exception unused) {
        }
    }
}
