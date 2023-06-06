package com.sankuai.waimai.store.poilist.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.repository.model.PoiVerticality;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends a {
    public static ChangeQuickRedirect as;
    private TextView at;

    @Override // com.sankuai.waimai.store.poilist.view.a
    public final void e(PoiVerticality poiVerticality) {
    }

    public d(@NonNull Context context) {
        super(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = as;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "888096aa210c58c50b2efe73c43fa0cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "888096aa210c58c50b2efe73c43fa0cb");
        }
    }

    @Override // com.sankuai.waimai.store.poilist.view.a, com.sankuai.waimai.store.poilist.view.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = as;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c246e7b2041f2b58c7d73b6fd42e1c40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c246e7b2041f2b58c7d73b6fd42e1c40");
            return;
        }
        super.a();
        this.at = (TextView) findView(R.id.tv_category_tag);
        this.at.setBackground(com.sankuai.waimai.store.util.e.b(getContext(), (int) R.color.wm_sg_color_33999797, (int) R.dimen.wm_sc_common_dimen_4));
    }

    @Override // com.sankuai.waimai.store.poilist.view.a, com.sankuai.waimai.store.poilist.view.c, com.sankuai.waimai.store.poilist.view.b
    public final void a(PoiVerticality poiVerticality, int i) {
        Object[] objArr = {poiVerticality, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = as;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "527cfbc2535861875cca63cde090a37b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "527cfbc2535861875cca63cde090a37b");
            return;
        }
        super.a(poiVerticality, i);
        if (TextUtils.isEmpty(poiVerticality.categoryName)) {
            u.c(this.at);
            return;
        }
        u.a(this.at);
        this.at.setText(poiVerticality.categoryName);
    }
}
