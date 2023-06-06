package com.sankuai.waimai.bussiness.order.detailnew.controller;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.order.api.detail.model.b;
import com.sankuai.waimai.bussiness.order.base.utils.i;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.widget.dialog.CustomDialog;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public Context b;
    public com.sankuai.waimai.bussiness.order.detailnew.pgablock.modifyaddress.a c;
    String d;
    public View e;
    public TextView f;
    public TextView g;
    public RelativeLayout h;
    public ImageView i;
    public View j;
    public CustomDialog k;
    private ImageView l;

    public a(@NonNull Context context, com.sankuai.waimai.bussiness.order.detailnew.pgablock.modifyaddress.a aVar, String str) {
        Object[] objArr = {context, aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ed7944f271dde39c0db15dd29608b9a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ed7944f271dde39c0db15dd29608b9a");
            return;
        }
        this.b = context;
        this.c = aVar;
        this.d = str;
        View inflate = LayoutInflater.from(context).inflate(R.layout.wm_order_detail_modify_address_contact_poi_dialog, (ViewGroup) null, false);
        this.e = inflate.findViewById(R.id.layout_modify_address_contact_poi);
        this.g = (TextView) inflate.findViewById(R.id.txt_dialog_desc);
        this.f = (TextView) inflate.findViewById(R.id.txt_dialog_title);
        this.h = (RelativeLayout) inflate.findViewById(R.id.rl_dialog_call_and_im_info);
        this.i = (ImageView) inflate.findViewById(R.id.img_dialog_im);
        this.l = (ImageView) inflate.findViewById(R.id.img_dialog_tel);
        this.j = inflate;
    }

    public void a(com.sankuai.waimai.bussiness.order.detailnew.pgablock.modifyaddress.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abafc37cddc9553351ccc55e5246a12b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abafc37cddc9553351ccc55e5246a12b");
        } else if (aVar == null || aVar.e.j == null || aVar.e.j.h == null || aVar.e.j.h.size() == 0) {
            this.h.setVisibility(8);
        } else {
            this.h.setVisibility(0);
            this.l.setVisibility(8);
            this.i.setVisibility(8);
            for (b.a aVar2 : aVar.e.j.h) {
                if (aVar2 != null) {
                    if (aVar2.a == i.b) {
                        this.l.setVisibility(0);
                        if (!TextUtils.isEmpty(aVar2.b)) {
                            b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                            a2.b = this.b;
                            a2.f = ImageQualityUtil.a(0);
                            a2.c = aVar2.b;
                            a2.a(this.l);
                        }
                        this.l.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.a.2
                            public static ChangeQuickRedirect a;

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                Object[] objArr2 = {view};
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "99353b51acf0b5b972c4a71fc6ff32b1", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "99353b51acf0b5b972c4a71fc6ff32b1");
                                    return;
                                }
                                a aVar3 = a.this;
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                                if (PatchProxy.isSupport(objArr3, aVar3, changeQuickRedirect3, false, "949ddf6afef50ce3e6c590f2a923c03d", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, aVar3, changeQuickRedirect3, false, "949ddf6afef50ce3e6c590f2a923c03d");
                                    return;
                                }
                                JudasManualManager.a("b_0u56l93i").a("c_hgowsqb").a(aVar3.b).a();
                                if (aVar3.k != null) {
                                    aVar3.k.dismiss();
                                }
                                if ((aVar3.c == null || aVar3.c.e.l == null || aVar3.c.e.l.p != 1) ? false : true) {
                                    i.a(aVar3.b, aVar3.c.e.b, aVar3.c.d, 1, aVar3.c.e.w);
                                } else {
                                    i.b((Activity) aVar3.b, aVar3.c.e.u);
                                }
                            }
                        });
                    }
                    if (aVar2.a == i.c && aVar2.e != null) {
                        b.C0752b c0752b = aVar2.e;
                        if (c0752b.a == 1) {
                            this.i.setVisibility(8);
                        } else {
                            this.i.setVisibility(0);
                            this.i.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.a.3
                                public static ChangeQuickRedirect a;

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    Object[] objArr2 = {view};
                                    ChangeQuickRedirect changeQuickRedirect2 = a;
                                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e499b23185ff396c207b06c732cadaf1", 4611686018427387906L)) {
                                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e499b23185ff396c207b06c732cadaf1");
                                        return;
                                    }
                                    a aVar3 = a.this;
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                                    if (PatchProxy.isSupport(objArr3, aVar3, changeQuickRedirect3, false, "03d269bf11448816c87d0b76238cd83a", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, aVar3, changeQuickRedirect3, false, "03d269bf11448816c87d0b76238cd83a");
                                        return;
                                    }
                                    JudasManualManager.a("b_epq7ja60").a("c_hgowsqb").a(aVar3.b).a();
                                    if (aVar3.k != null) {
                                        aVar3.k.dismiss();
                                    }
                                    if (aVar3.c == null || aVar3.c.e.j == null) {
                                        return;
                                    }
                                    com.sankuai.waimai.bussiness.order.detailnew.im.a.a((Activity) aVar3.b, 3, r.a(aVar3.c.e.b, 0L), aVar3.c.e.c, aVar3.c.e.d, 0L, 10, aVar3.d, false, aVar3.c.f, aVar3.c.e);
                                }
                            });
                            if (!TextUtils.isEmpty(aVar2.b)) {
                                b.C0608b a3 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                                a3.b = this.b;
                                a3.f = ImageQualityUtil.a(0);
                                a3.c = aVar2.b;
                                a3.a(this.i);
                            } else if (c0752b.a == 2) {
                                String a4 = com.sankuai.waimai.bussiness.order.base.config.a.a().a("wm_order_detail_ic_im_unclickable");
                                if (a4 != null) {
                                    b.C0608b a5 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                                    a5.b = this.b;
                                    a5.c = a4;
                                    a5.a(this.i);
                                }
                            } else {
                                this.i.setImageResource(R.drawable.wm_order_detail_ic_im);
                            }
                        }
                    }
                }
            }
        }
    }
}
