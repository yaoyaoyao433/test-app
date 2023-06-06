package com.sankuai.waimai.store.shopping.cart.util;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.constraint.R;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.i;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.z;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
import com.sankuai.waimai.store.ui.common.CustomDialog;
import com.sankuai.xm.im.session.SessionId;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a = null;
    public static String b = "sg-from-Detail";
    public static String c = "sg-dx-im-from";
    public static String d = "sg-from-Restaurant";
    public static String e = "sg-msgOriginId";

    public static /* synthetic */ void a(final Activity activity, final ArrayList arrayList) {
        Object[] objArr = {activity, arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4645e88cc6e0ad9054fec0ceaa8a5dde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4645e88cc6e0ad9054fec0ceaa8a5dde");
        } else if (activity != null) {
            if (com.sankuai.shangou.stone.util.a.b(arrayList)) {
                ae.a(activity, (int) R.string.wm_st_shop_cart_none_phones);
            } else {
                new CustomDialog.a(activity).a(R.string.wm_st_shop_cart_dial).a((CharSequence[]) arrayList.toArray(new String[arrayList.size()]), new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.store.shopping.cart.util.d.2
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "24008a628d1ff7c8f3ab2dfb0da54048", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "24008a628d1ff7c8f3ab2dfb0da54048");
                        } else {
                            z.a(activity, (String) arrayList.get(i));
                        }
                    }
                }).b(R.string.cancel, (DialogInterface.OnClickListener) null).c();
            }
        }
    }

    public static void a(final Activity activity, final com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, SCPageConfig sCPageConfig, String str) {
        Object[] objArr = {activity, aVar, sCPageConfig, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "09d08294a6318dfaa80b275c2702ec44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "09d08294a6318dfaa80b275c2702ec44");
        } else if (!aVar.D()) {
            new CustomDialog.a(activity).b(R.string.wm_st_shop_cart_phone_dialog).b(R.string.cancel, (DialogInterface.OnClickListener) null).a(R.string.wm_st_shop_cart_dial, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.store.shopping.cart.util.d.1
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1845ef84dd5c35ff1343c41441647ce9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1845ef84dd5c35ff1343c41441647ce9");
                        return;
                    }
                    Poi poi = com.sankuai.waimai.store.platform.domain.manager.poi.a.this.b;
                    d.a(activity, poi == null ? null : poi.phoneList);
                }
            }).b();
        } else {
            long j = sCPageConfig.c;
            int i = sCPageConfig.e;
            if (!(i == 1 || i == 2 || i == 9)) {
                com.sankuai.waimai.business.im.api.a.a().a(activity, (SessionId) null, 1, 0L, aVar.g(), j, 10, str, false);
                return;
            }
            Object[] objArr2 = {activity, aVar, sCPageConfig, str, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "dc5201ee5a3f5d9d59aebb80aae50e09", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "dc5201ee5a3f5d9d59aebb80aae50e09");
                return;
            }
            Bundle bundle = new Bundle();
            if (sCPageConfig.e == 1 || sCPageConfig.e == 9) {
                bundle.putString(c, d);
                bundle.putString(e, "c_waimai_qeknbhm9");
            } else if (sCPageConfig.e == 2) {
                bundle.putString(c, b);
                bundle.putString(e, "c_u4fk4kw");
            }
            com.sankuai.waimai.business.im.api.a.a().a(activity, (SessionId) null, 1, 0L, aVar.g(), j, 10, str, false, bundle);
        }
    }

    public static SpannableString a(Context context, double d2, int i) {
        Object[] objArr = {context, Double.valueOf(d2), 13};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a77a1477388d4517ae9b7c44204dcc88", RobustBitConfig.DEFAULT_VALUE)) {
            return (SpannableString) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a77a1477388d4517ae9b7c44204dcc88");
        }
        SpannableString spannableString = new SpannableString(context.getString(R.string.wm_sc_common_price, i.a(d2)));
        spannableString.setSpan(new AbsoluteSizeSpan(13, true), 0, 1, 33);
        return spannableString;
    }
}
