package com.sankuai.waimai.store.im.poi.provider;

import android.content.Context;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.im.poi.model.ImOrderData;
import com.sankuai.xm.im.message.bean.GeneralMessage;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g implements com.sankuai.waimai.business.im.common.message.d {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.business.im.common.message.d
    public final View a(Context context, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar, ViewGroup viewGroup) {
        Object[] objArr = {context, bVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "314d42abdeb25e2c80ba345ec6edde6f", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "314d42abdeb25e2c80ba345ec6edde6f");
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.wm_sc_common_im_order_sent_holder, viewGroup, false);
        inflate.setLayoutParams(new AbsListView.LayoutParams(com.sankuai.shangou.stone.util.h.a(context, com.sankuai.waimai.store.im.util.b.a(context)), -2));
        com.sankuai.waimai.store.im.poi.block.c cVar = new com.sankuai.waimai.store.im.poi.block.c(context, true);
        cVar.bindView(inflate);
        inflate.setTag(cVar);
        return inflate;
    }

    @Override // com.sankuai.waimai.business.im.common.message.d
    public final void a(View view, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdd4b420009271a9d608f7da9ad72ccc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdd4b420009271a9d608f7da9ad72ccc");
            return;
        }
        com.sankuai.waimai.store.im.poi.block.c cVar = (com.sankuai.waimai.store.im.poi.block.c) view.getTag();
        if (cVar == null || bVar == null) {
            return;
        }
        cVar.a(ImOrderData.convert(bVar.b).orderInfo);
    }
}
