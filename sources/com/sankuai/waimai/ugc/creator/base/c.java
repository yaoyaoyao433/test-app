package com.sankuai.waimai.ugc.creator.base;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class c extends RecyclerView.s {
    public static ChangeQuickRedirect a;

    public c(View view) {
        super(view);
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90950911075f9bed2c01725bca409d96", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90950911075f9bed2c01725bca409d96");
        }
    }

    public final Context a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1079dbde403520c39ec8a285e1ca2ac4", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1079dbde403520c39ec8a285e1ca2ac4") : this.itemView.getContext();
    }

    public final <T extends View> T a(@IdRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63cf24dffd346b2edf77084fce672237", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63cf24dffd346b2edf77084fce672237") : (T) this.itemView.findViewById(i);
    }
}
