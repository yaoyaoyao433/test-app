package com.sankuai.waimai.modular.utils;

import android.text.TextUtils;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static boolean a(TextView textView, CharSequence charSequence) {
        Object[] objArr = {textView, charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "40a965f24b9438212fe22610b7fa28c5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "40a965f24b9438212fe22610b7fa28c5")).booleanValue();
        }
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
            return false;
        }
        textView.setText(charSequence);
        textView.setVisibility(0);
        return true;
    }
}
