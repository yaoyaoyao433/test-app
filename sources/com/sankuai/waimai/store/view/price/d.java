package com.sankuai.waimai.store.view.price;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.view.price.raptor.SCPriceViewMonitor;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static void a(Context context, int i, SpannableStringBuilder spannableStringBuilder, b bVar, c cVar) {
        Object[] objArr = {context, Integer.valueOf(i), spannableStringBuilder, bVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5f8c2dcffdd9e6c829c55ba5f8d5b859", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5f8c2dcffdd9e6c829c55ba5f8d5b859");
            return;
        }
        int i2 = bVar.d;
        if (i2 == 1) {
            e.a(spannableStringBuilder, bVar, cVar);
            return;
        }
        switch (i2) {
            case 3:
                e.a(context, spannableStringBuilder, bVar, cVar);
                return;
            case 4:
            case 5:
            case 6:
            case 7:
                e.c(spannableStringBuilder, bVar, cVar);
                return;
            default:
                com.sankuai.waimai.store.util.monitor.b.a().a(SCPriceViewMonitor.SC_PRICE_VIEW_MONITOR).a(KnbConstants.PARAMS_SCENE, String.valueOf(i)).a("ActivityPriceSource", String.valueOf(bVar.d)).a();
                e.a(spannableStringBuilder, bVar, cVar);
                return;
        }
    }

    public static void a(int i, SpannableStringBuilder spannableStringBuilder, b bVar, c cVar) {
        Object[] objArr = {Integer.valueOf(i), spannableStringBuilder, bVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ce5917e97c9053407492f9a41d37ddcc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ce5917e97c9053407492f9a41d37ddcc");
        } else if (bVar.d == 1) {
            e.b(spannableStringBuilder, bVar, cVar);
        } else {
            com.sankuai.waimai.store.util.monitor.b.a().a(SCPriceViewMonitor.SC_PRICE_VIEW_MONITOR).a(KnbConstants.PARAMS_SCENE, String.valueOf(i)).a("LinePriceSource", String.valueOf(bVar.d)).a();
            e.b(spannableStringBuilder, bVar, cVar);
        }
    }

    public static void a(Context context, int i, SpannableStringBuilder spannableStringBuilder, b bVar) {
        Object[] objArr = {context, Integer.valueOf(i), spannableStringBuilder, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1febb9f9b20b09c83895ac08355ef19c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1febb9f9b20b09c83895ac08355ef19c");
            return;
        }
        switch (bVar.d) {
            case 2:
                return;
            case 3:
                e.a(context, spannableStringBuilder, bVar, i == 1);
                return;
            default:
                com.sankuai.waimai.store.util.monitor.b.a().a(SCPriceViewMonitor.SC_PRICE_VIEW_MONITOR).a(KnbConstants.PARAMS_SCENE, String.valueOf(i)).a("AuxiliaryPriceSource", String.valueOf(bVar.d)).a();
                return;
        }
    }
}
