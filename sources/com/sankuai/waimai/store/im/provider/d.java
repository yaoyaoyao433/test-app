package com.sankuai.waimai.store.im.provider;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.i;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.im.base.k;
import com.sankuai.waimai.store.im.group.model.UserGroupImInfo;
import com.sankuai.waimai.store.im.poi.model.SGOneCoupon;
import com.sankuai.waimai.store.im.provider.c;
import com.sankuai.waimai.store.util.e;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.EventMessage;
import com.sankuai.xm.imui.IMUIManager;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends com.sankuai.waimai.store.im.base.c<SGOneCoupon> {
    public static ChangeQuickRedirect a;
    String b;
    public e.a g;
    private com.sankuai.waimai.store.im.poi.contract.a h;
    private String i;

    @Override // com.sankuai.waimai.store.im.base.c
    public final int a() {
        return R.layout.wm_sc_im_custom_one_coupon_message;
    }

    @Override // com.sankuai.waimai.store.im.base.c
    public final /* synthetic */ void a(View view, @NonNull com.sankuai.xm.imui.session.entity.b bVar, @Nullable SGOneCoupon sGOneCoupon) {
        final SGOneCoupon sGOneCoupon2 = sGOneCoupon;
        Object[] objArr = {view, bVar, sGOneCoupon2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f02b132a0c363c336e97bff39a9c8ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f02b132a0c363c336e97bff39a9c8ec");
        } else if (sGOneCoupon2 != null) {
            c.a aVar = new c.a();
            aVar.e = (TextView) view.findViewById(R.id.wm_sc_im_custom_one_coupon_discount_unit);
            aVar.d = (TextView) view.findViewById(R.id.wm_sc_im_custom_one_coupon_money_unit);
            aVar.a = (TextView) view.findViewById(R.id.wm_sc_im_custom_one_coupon_value);
            aVar.b = (TextView) view.findViewById(R.id.wm_sc_im_custom_one_coupon_sub_description);
            aVar.c = (TextView) view.findViewById(R.id.wm_sc_im_custom_one_coupon_valid_time);
            aVar.f = (TextView) view.findViewById(R.id.wm_sc_im_tv_touse);
            aVar.g = (TextView) view.findViewById(R.id.wm_sc_im_custom_one_title);
            aVar.a.setText(i.a(sGOneCoupon2.price));
            aVar.b.setText(sGOneCoupon2.couponDesc);
            if (!TextUtils.isEmpty(sGOneCoupon2.expireDate)) {
                aVar.c.setText(String.format(view.getContext().getString(R.string.wm_sg_valid_time), sGOneCoupon2.expireDate));
            }
            if (sGOneCoupon2.couponType == 2) {
                aVar.e.setVisibility(0);
                aVar.d.setVisibility(8);
            } else {
                aVar.e.setVisibility(8);
                aVar.d.setVisibility(0);
            }
            if (t.a(sGOneCoupon2.name)) {
                u.a(aVar.g, "商家优惠券");
            } else {
                u.a(aVar.g, sGOneCoupon2.name);
            }
            if (this.g != null) {
                aVar.f.setTextColor(com.sankuai.waimai.store.util.b.b(this.h.bw_(), R.color.white));
                aVar.f.setBackground(this.g.a());
            }
            u.a(aVar.f);
            u.a(aVar.f, view.getContext().getString(R.string.wm_sc_shop_accept_coupon));
            aVar.f.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.im.provider.d.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr2 = {view2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2a3ca6156a1d798b9d5d1263105a14d9", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2a3ca6156a1d798b9d5d1263105a14d9");
                    } else {
                        d.this.a(d.this.b, view2, sGOneCoupon2);
                    }
                }
            });
        }
    }

    public d(@Nullable com.sankuai.waimai.store.expose.v2.a aVar, @Nullable Bundle bundle, String str, com.sankuai.waimai.store.im.poi.contract.a aVar2) {
        super(aVar, bundle);
        Object[] objArr = {aVar, bundle, str, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6a9b4bfdecbc34dbc7e08a658751327", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6a9b4bfdecbc34dbc7e08a658751327");
            return;
        }
        this.b = str;
        this.h = aVar2;
        if (aVar2 == null || aVar2.bw_() == null) {
            return;
        }
        this.g = new e.a().c(com.sankuai.waimai.store.util.b.b(aVar2.bw_(), R.color.wm_sg_im_color_FFC300)).a(aVar2.bw_().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_19));
        this.i = aVar2.s();
    }

    public final void a(String str, final View view, SGOneCoupon sGOneCoupon) {
        UserGroupImInfo userGroupImInfo;
        String l;
        Object[] objArr = {str, view, sGOneCoupon};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0e78c6911bf829fb139b0ef2ee0d5d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0e78c6911bf829fb139b0ef2ee0d5d1");
        } else if (this.e == null || (userGroupImInfo = (UserGroupImInfo) com.sankuai.waimai.store.util.i.a(this.e.getString("personMessage"), UserGroupImInfo.class)) == null || userGroupImInfo.groupState != 0) {
        } else {
            final Dialog a2 = com.sankuai.waimai.store.util.d.a(view.getContext());
            com.sankuai.waimai.store.im.base.net.b a3 = com.sankuai.waimai.store.im.base.net.b.a(str);
            String str2 = sGOneCoupon.activityId;
            long a4 = r.a(userGroupImInfo.groupId, 0L);
            long a5 = r.a(sGOneCoupon.poiId, 0L);
            String str3 = this.i;
            k kVar = k.a.a;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = k.a;
            if (PatchProxy.isSupport(objArr2, kVar, changeQuickRedirect2, false, "a9117e8df9b45b5567886c1835b9589a", RobustBitConfig.DEFAULT_VALUE)) {
                l = (String) PatchProxy.accessDispatch(objArr2, kVar, changeQuickRedirect2, false, "a9117e8df9b45b5567886c1835b9589a");
            } else if (kVar.a()) {
                com.sankuai.waimai.store.im.base.log.b.a((Context) null, "get nickName");
                l = "";
            } else {
                l = IMClient.a().l();
            }
            a3.a(12, str2, a4, a5, str3, l, new j<Object>() { // from class: com.sankuai.waimai.store.im.provider.d.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.j
                public final void a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ff61ca5d9a95f9cb0e80d3a855c181a0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ff61ca5d9a95f9cb0e80d3a855c181a0");
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final void b() {
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final void a(Object obj) {
                    Object[] objArr3 = {obj};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2b9e222f0685f532f860c89d1a965879", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2b9e222f0685f532f860c89d1a965879");
                    } else if (a2 != null) {
                        a2.dismiss();
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                    Object[] objArr3 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a3334dd38d3fdf0885e2bc94362bcf69", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a3334dd38d3fdf0885e2bc94362bcf69");
                        return;
                    }
                    if (a2 != null) {
                        a2.dismiss();
                    }
                    if (com.sankuai.waimai.store.util.b.a(view.getContext())) {
                        return;
                    }
                    Context context = view.getContext();
                    String message = bVar.getMessage();
                    Object[] objArr4 = {context, message};
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.im.util.b.a;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "6df20ce796110974841d216fb47fa7e4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "6df20ce796110974841d216fb47fa7e4");
                    } else if (TextUtils.isEmpty(message)) {
                    } else {
                        EventMessage b = com.sankuai.xm.imui.common.util.c.b(message);
                        b.setChatId(com.sankuai.xm.imui.b.a().d());
                        b.setCategory(com.sankuai.xm.imui.b.a().e());
                        b.setPeerUid(com.sankuai.xm.imui.b.a().f().c);
                        b.setToUid(com.sankuai.xm.imui.b.a().d());
                        b.setToAppId(com.sankuai.xm.imui.b.a().g());
                        b.setPeerAppId(com.sankuai.xm.imui.b.a().g());
                        b.setMsgStatus(9);
                        b.setSts(com.meituan.android.time.c.b());
                        b.setChannel(com.sankuai.xm.imui.b.a().f().g);
                        IMUIManager.a().a(b, false, null);
                    }
                }
            });
        }
    }
}
