package com.sankuai.waimai.business.page.home.list.future.feedbackdialog.util;

import android.content.Context;
import android.support.constraint.R;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.SuperscriptSpan;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static SpannableString a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "893092abacd29024a2188b08c3fe07e2", RobustBitConfig.DEFAULT_VALUE)) {
            return (SpannableString) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "893092abacd29024a2188b08c3fe07e2");
        }
        if (TextUtils.isEmpty(str)) {
            return new SpannableString("");
        }
        String str2 = str + "*";
        SpannableString spannableString = new SpannableString(str2);
        spannableString.setSpan(new AbsoluteSizeSpan(13, true), str2.length() - 1, str2.length(), 17);
        spannableString.setSpan(new SuperscriptSpan(), str2.length() - 1, str2.length(), 17);
        spannableString.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.wm_feed_back_super_color)), str2.length() - 1, str2.length(), 34);
        return spannableString;
    }
}
