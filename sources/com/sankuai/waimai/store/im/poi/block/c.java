package com.sankuai.waimai.store.im.poi.block;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.i;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.platform.widget.roundview.RoundedImageView;
import com.sankuai.waimai.store.im.poi.model.ImModifyAddressClickEvent;
import com.sankuai.waimai.store.im.poi.model.ImOrderInfo;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.m;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    private RoundedImageView b;
    private TextView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private boolean g;
    private final int h;
    private final int i;
    private TextView j;
    private LinearLayout k;

    public c(@NonNull Context context, boolean z) {
        super(context);
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0299fba8662cd9a820fe93c7ce0b1b4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0299fba8662cd9a820fe93c7ce0b1b4");
            return;
        }
        this.h = 14;
        this.i = 16;
        this.g = z;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46700710c5ae47ce3aa6f970b131e4f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46700710c5ae47ce3aa6f970b131e4f9");
            return;
        }
        super.onViewCreated();
        this.b = (RoundedImageView) findView(R.id.iv_im_send_order_info_poi_icon);
        this.c = (TextView) findView(R.id.tv_im_send_order_info_poi_name);
        this.d = (TextView) findView(R.id.tv_im_send_order_info_poi_description);
        this.e = (TextView) findView(R.id.tv_im_send_order_info_status);
        this.f = (TextView) findView(R.id.tv_im_send_order_info_poi_payment);
        this.j = (TextView) findView(R.id.tv_common_im_modify_address_button);
        this.k = (LinearLayout) findView(R.id.ll_common_im_send_order_button_container);
    }

    public final void a(final ImOrderInfo imOrderInfo) {
        Object[] objArr = {imOrderInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07cdac1ba2329cf407514fbd613db935", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07cdac1ba2329cf407514fbd613db935");
        } else if (imOrderInfo == null) {
        } else {
            b.C0608b a2 = m.a(imOrderInfo.poiLogo, ImageQualityUtil.a());
            a2.i = R.drawable.wm_sc_member_icon_default;
            a2.j = R.drawable.wm_sc_member_icon_default;
            a2.b = getContext();
            a2.e = 1;
            a2.a((ImageView) this.b);
            this.c.setText(imOrderInfo.poiName);
            this.d.setText(imOrderInfo.foodDesc);
            this.e.setText(imOrderInfo.statusDesc);
            if (this.g) {
                this.c.setTextSize(2, 14.0f);
            } else {
                this.c.setTextSize(2, 16.0f);
            }
            u.a(this.f, i.a(Double.valueOf(imOrderInfo.total), 0, 1));
            getView().setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.im.poi.block.c.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1ede37733ec9c3daa06ff3ec9551c12a", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1ede37733ec9c3daa06ff3ec9551c12a");
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("hash_id", String.valueOf(imOrderInfo.orderViewID));
                    com.sankuai.waimai.store.router.d.a(c.this.getContext(), com.sankuai.waimai.store.router.c.l, bundle);
                }
            });
            if (p.a(this.k) || p.a(this.j)) {
                return;
            }
            if (((imOrderInfo.addrModifyAllowed instanceof Boolean) && ((Boolean) imOrderInfo.addrModifyAllowed).booleanValue()) || ((imOrderInfo.addrModifyAllowed instanceof Integer) && ((Integer) imOrderInfo.addrModifyAllowed).intValue() == 1)) {
                u.a(this.k);
            } else {
                u.c(this.k);
            }
            this.j.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.im.poi.block.c.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "adedcdc4185eb74228ac1407743ba79c", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "adedcdc4185eb74228ac1407743ba79c");
                        return;
                    }
                    ImModifyAddressClickEvent imModifyAddressClickEvent = new ImModifyAddressClickEvent();
                    imModifyAddressClickEvent.imOrderInfo = imOrderInfo;
                    com.meituan.android.bus.a.a().c(imModifyAddressClickEvent);
                }
            });
            this.j.setBackground(new e.a().a(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_im_D3D3D3)).b(this.mContext.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_1)).a(this.mContext.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_13)).a());
        }
    }
}
