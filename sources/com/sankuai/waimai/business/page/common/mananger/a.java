package com.sankuai.waimai.business.page.common.mananger;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.domain.core.poi.PoiCommon;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static SpannableStringBuilder a(Poi poi, SpannableStringBuilder spannableStringBuilder, boolean z) {
        Object[] objArr = {poi, spannableStringBuilder, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eee1f1a846a4c5fdea29e2a3ea478f76", RobustBitConfig.DEFAULT_VALUE)) {
            return (SpannableStringBuilder) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eee1f1a846a4c5fdea29e2a3ea478f76");
        }
        String str = poi.shippingFeeTip;
        if (TextUtils.equals(PoiCommon.FREE_DELIVERY_TEXT, str) && z) {
            spannableStringBuilder.append((CharSequence) str);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(-45015), spannableStringBuilder.length() - str.length(), spannableStringBuilder.length(), 33);
            spannableStringBuilder.append("  ");
            return spannableStringBuilder;
        }
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder.append((CharSequence) str);
            if (poi.isTextBold(6)) {
                spannableStringBuilder.setSpan(new StyleSpan(1), spannableStringBuilder.length() - str.length(), spannableStringBuilder.length(), 33);
            }
            if (!TextUtils.isEmpty(poi.originShippingFeeTip)) {
                spannableStringBuilder.append(StringUtil.SPACE);
                spannableStringBuilder.append((CharSequence) poi.originShippingFeeTip);
                int length = spannableStringBuilder.length() - poi.originShippingFeeTip.length();
                int length2 = spannableStringBuilder.length();
                spannableStringBuilder.setSpan(new ForegroundColorSpan(-6710887), length, length2, 33);
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan(g.a(b.a.getApplicationContext(), 10.0f)), length, length2, 33);
                spannableStringBuilder.setSpan(new StrikethroughSpan(), length, length2, 33);
            }
            spannableStringBuilder.append("  ");
        }
        return spannableStringBuilder;
    }
}
