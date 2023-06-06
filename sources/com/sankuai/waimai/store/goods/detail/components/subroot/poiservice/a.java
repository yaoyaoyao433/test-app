package com.sankuai.waimai.store.goods.detail.components.subroot.poiservice;

import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.widgets.recycler.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends e {
    public static ChangeQuickRedirect a;
    TextView b;
    TextView c;
    @Nullable
    ImageView d;

    public a(View view) {
        super(view);
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de480e5d3597bf77b5f7d166124160cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de480e5d3597bf77b5f7d166124160cb");
            return;
        }
        this.b = (TextView) a(R.id.wm_sc_goods_detail_poi_service_dialog_list_item_tv_title);
        this.c = (TextView) a(R.id.wm_sc_goods_detail_poi_service_dialog_list_item_tv_content);
        this.d = (ImageView) a(R.id.wm_sc_goods_detail_poi_service_dialog_list_item_iv_icon);
    }
}
