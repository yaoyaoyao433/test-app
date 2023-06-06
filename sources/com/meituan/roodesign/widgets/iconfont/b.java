package com.meituan.roodesign.widgets.iconfont;

import android.support.annotation.ColorRes;
import android.support.annotation.StringRes;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a(TextView textView, @StringRes int i, @ColorRes int i2) {
        Object[] objArr = {textView, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9cbddf88b6c95acfb14717444bd02eb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9cbddf88b6c95acfb14717444bd02eb2");
            return;
        }
        textView.setText(i);
        textView.setTextColor(textView.getContext().getResources().getColor(i2));
    }
}
