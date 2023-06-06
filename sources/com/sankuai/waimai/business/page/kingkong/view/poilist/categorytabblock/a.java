package com.sankuai.waimai.business.page.kingkong.view.poilist.categorytabblock;

import android.content.Context;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.category.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.business.page.common.category.a {
    public static ChangeQuickRedirect h;

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0add6ca3ab35c9af6c7220e0d7adc2c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0add6ca3ab35c9af6c7220e0d7adc2c");
        }
    }

    @Override // com.sankuai.waimai.business.page.common.category.a, com.sankuai.waimai.log.judas.c
    /* renamed from: b */
    public final a.C0757a a(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a00e6fad76f74a3841e05038a725244c", RobustBitConfig.DEFAULT_VALUE) ? (a.C0757a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a00e6fad76f74a3841e05038a725244c") : new a.C0757a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_page_kingkong_category_item, viewGroup, false));
    }

    @Override // com.sankuai.waimai.business.page.common.category.a
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41f27c4f02e7dea8aa6ac61eca8a57ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41f27c4f02e7dea8aa6ac61eca8a57ba");
            return;
        }
        if (this.c < this.b.size()) {
            notifyItemChanged(this.c);
        }
        a(i);
        notifyItemChanged(i);
    }
}
