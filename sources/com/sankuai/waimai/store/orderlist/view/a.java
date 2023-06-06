package com.sankuai.waimai.store.orderlist.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.view.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.platform.base.b {
    public static ChangeQuickRedirect a;
    public TextView b;
    public TextView c;
    public ImageView d;
    public com.sankuai.waimai.store.expose.v2.entity.b e;

    public a(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98f3f1e909a2874afd6a4bef623af6ff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98f3f1e909a2874afd6a4bef623af6ff");
        }
    }

    @Override // com.sankuai.waimai.platform.base.b
    public final View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f66611a1f1142a5acbc09cb8cc67155d", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f66611a1f1142a5acbc09cb8cc67155d");
        }
        View findViewById = viewGroup.findViewById(R.id.container_order_deliver_pack_area);
        this.b = (TextView) findViewById.findViewById(R.id.layout_order_delivery_area_text_info);
        this.c = (TextView) findViewById.findViewById(R.id.layout_order_delivery_area_time);
        this.d = (ImageView) findViewById.findViewById(R.id.layout_order_delivery_area_arow);
        this.d.setImageDrawable(com.sankuai.waimai.store.view.a.a(this.y, R.dimen.wm_sc_common_dimen_6, R.dimen.wm_sc_common_dimen_10, R.color.wm_sg_color_858687, R.dimen.wm_sc_common_dimen_1_half, a.EnumC1338a.RIGHT));
        return findViewById;
    }
}
