package com.sankuai.waimai.store.view.price;

import android.content.Context;
import android.support.constraint.R;
import android.support.v4.internal.view.SupportMenu;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.meituan.android.common.kitefly.KiteFlyConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ColorUtils;
import java.util.LinkedHashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private static final int b = ColorUtils.a("#FF4A26", (int) SupportMenu.CATEGORY_MASK);
    private static final int c = ColorUtils.a("#8C492D", -16777216);
    private static final int d = ColorUtils.a("#BCBCBD", -3355444);
    private static final LinkedHashMap<Integer, c> e = new LinkedHashMap<>();

    public static c a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1d81b51efa5c14d8d68ac44aa218ce2d", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1d81b51efa5c14d8d68ac44aa218ce2d");
        }
        c cVar = e.get(Integer.valueOf(i));
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        cVar2.b = i;
        cVar2.c = Math.max(32 - (((52 - i) / 4) * 2), 20);
        cVar2.f = i >= 40 ? 26 : 20;
        cVar2.g = i >= 40 ? 24 : 22;
        if (i == 36) {
            cVar2.d = 28;
            cVar2.e = 20;
        } else {
            cVar2.d = 24;
            cVar2.e = 20;
        }
        e.put(Integer.valueOf(i), cVar2);
        return cVar2;
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, b bVar, c cVar) {
        Object[] objArr = {spannableStringBuilder, bVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cd89fd3feca7fd03ff5bc405463652e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cd89fd3feca7fd03ff5bc405463652e3");
            return;
        }
        String[] a2 = bVar.a();
        int b2 = bVar.b();
        spannableStringBuilder.append("¥", new AbsoluteSizeWithAnythingSpan(cVar.b(b2), b), 33);
        if (a2.length > 1) {
            spannableStringBuilder.append(a2[0], new AbsoluteSizeWithAnythingSpan(cVar.a(b2), b), 33);
            spannableStringBuilder.append(CommonConstant.Symbol.DOT + a2[1], new AbsoluteSizeWithAnythingSpan(cVar.b(b2), b), 33);
        } else {
            spannableStringBuilder.append(bVar.c, new AbsoluteSizeWithAnythingSpan(cVar.a(b2), b), 33);
        }
        if (TextUtils.isEmpty(bVar.e)) {
            return;
        }
        spannableStringBuilder.append("space", new f(2), 33);
        spannableStringBuilder.append(bVar.e, new AbsoluteSizeWithAnythingSpan(cVar.f, SCPriceView.b, d), 33);
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, b bVar, c cVar) {
        Object[] objArr = {spannableStringBuilder, bVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "706ae1fe2d40bb443ac6a5747f126abc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "706ae1fe2d40bb443ac6a5747f126abc");
            return;
        }
        spannableStringBuilder.append("¥" + bVar.c, new AbsoluteSizeWithAnythingSpan(cVar.g, true, SCPriceView.b, d), 33);
    }

    public static void c(SpannableStringBuilder spannableStringBuilder, b bVar, c cVar) {
        Object[] objArr = {spannableStringBuilder, bVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "198bf560cd742d2996d1d1689ce6873b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "198bf560cd742d2996d1d1689ce6873b");
            return;
        }
        String[] a2 = bVar.a();
        int b2 = bVar.b();
        spannableStringBuilder.append("¥", new AbsoluteSizeWithAnythingSpan(cVar.b(b2), b), 33);
        if (a2.length > 1) {
            spannableStringBuilder.append(a2[0], new AbsoluteSizeWithAnythingSpan(cVar.a(b2), b), 33);
            spannableStringBuilder.append(CommonConstant.Symbol.DOT + a2[1], new AbsoluteSizeWithAnythingSpan(cVar.b(b2), b), 33);
        } else {
            spannableStringBuilder.append(bVar.c, new AbsoluteSizeWithAnythingSpan(cVar.a(b2), b), 33);
        }
        if (TextUtils.isEmpty(bVar.e)) {
            return;
        }
        spannableStringBuilder.append("space", new f(2), 33);
        spannableStringBuilder.append(bVar.e, new AbsoluteSizeWithAnythingSpan(cVar.f, SCPriceView.b, d), 33);
    }

    public static void a(Context context, SpannableStringBuilder spannableStringBuilder, b bVar, c cVar) {
        Object[] objArr = {context, spannableStringBuilder, bVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "09f07ed4a1ea3cfff3cc4e3910111583", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "09f07ed4a1ea3cfff3cc4e3910111583");
            return;
        }
        String[] a2 = bVar.a();
        int b2 = bVar.b();
        spannableStringBuilder.append("¥", new AbsoluteSizeWithAnythingSpan(cVar.b(b2), c), 33);
        if (a2.length > 1) {
            spannableStringBuilder.append(a2[0], new AbsoluteSizeWithAnythingSpan(cVar.a(b2), c), 33);
            spannableStringBuilder.append(CommonConstant.Symbol.DOT + a2[1], new AbsoluteSizeWithAnythingSpan(cVar.b(b2), c), 33);
        } else {
            spannableStringBuilder.append(bVar.c, new AbsoluteSizeWithAnythingSpan(cVar.a(b2), c), 33);
        }
        if (!TextUtils.isEmpty(bVar.e)) {
            spannableStringBuilder.append("space", new f(2), 33);
            spannableStringBuilder.append(bVar.e, new AbsoluteSizeWithAnythingSpan(cVar.f, SCPriceView.b, c), 33);
        }
        spannableStringBuilder.append(KiteFlyConstants.VIP_NAME, new a(context, R.drawable.wm_sc_memer_price_short, 15), 33);
    }

    public static void a(Context context, SpannableStringBuilder spannableStringBuilder, b bVar, boolean z) {
        Object[] objArr = {context, spannableStringBuilder, bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "badace4e941f5b9c5230dcce39d285d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "badace4e941f5b9c5230dcce39d285d9");
            return;
        }
        spannableStringBuilder.append("¥", new AbsoluteSizeWithAnythingSpan(20, c), 33);
        spannableStringBuilder.append(bVar.c, new AbsoluteSizeWithAnythingSpan(24, c), 33);
        if (!TextUtils.isEmpty(bVar.e)) {
            spannableStringBuilder.append("space", new f(2), 33);
            spannableStringBuilder.append(bVar.e, new AbsoluteSizeWithAnythingSpan(20, SCPriceView.b, c), 33);
        }
        if (z) {
            spannableStringBuilder.append(KiteFlyConstants.VIP_NAME, new a(context, R.drawable.wm_sc_memer_price_long, 50), 33);
        } else {
            spannableStringBuilder.append(KiteFlyConstants.VIP_NAME, new a(context, R.drawable.wm_sc_memer_price_short, 12), 33);
        }
    }
}
