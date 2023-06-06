package com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends com.sankuai.waimai.store.newwidgets.list.g<k, j> {
    public static ChangeQuickRedirect a;
    private ImageView b;

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final int a() {
        return R.layout.wm_sc_aggregation_empty_spu_layout;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final /* synthetic */ void a(k kVar, int i) {
        Object[] objArr = {kVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "772c3f67ec1ecc13ad7a57b59e2e0c63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "772c3f67ec1ecc13ad7a57b59e2e0c63");
        } else {
            com.sankuai.waimai.store.util.m.b("http://p0.meituan.net/scarlett/75b3ddd17725d48bb1d5d7bc266a6e4f14026.png").a(this.b);
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87cb0597fe0abb071fdf240720917a29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87cb0597fe0abb071fdf240720917a29");
        } else {
            this.b = (ImageView) view.findViewById(R.id.image_view);
        }
    }
}
