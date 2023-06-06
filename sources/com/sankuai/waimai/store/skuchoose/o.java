package com.sankuai.waimai.store.skuchoose;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class o extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    TextView b;
    TextView c;
    LinearLayout d;

    public o(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "117e98a85b6af9c81edfa3899976094c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "117e98a85b6af9c81edfa3899976094c");
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2bbb8cb8a02c38027591fdaae1e5e8f", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2bbb8cb8a02c38027591fdaae1e5e8f") : layoutInflater.inflate(R.layout.wm_sc_sku_dialog_specifi_info, viewGroup, true);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fc9a2900a579d13b3d76491537ed308", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fc9a2900a579d13b3d76491537ed308");
            return;
        }
        super.onViewCreated();
        this.b = (TextView) findView(R.id.txt_choose_info);
        this.d = (LinearLayout) findView(R.id.ll_choose_info_container);
        this.c = (TextView) findView(R.id.txt_sale_out);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c35496532ef5601752db3f17d2f7e931", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c35496532ef5601752db3f17d2f7e931");
            return;
        }
        this.mView.setBackground(new e.a().c(getContext().getResources().getColor(R.color.wm_sg_color_FAFAFA)).a(getContext().getResources().getColor(R.color.wm_sg_color_F5F5F6)).b(com.sankuai.shangou.stone.util.h.a(getContext(), 0.5f)).a());
    }
}
