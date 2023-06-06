package com.sankuai.waimai.bussiness.order.crossconfirm.block.foodsecurity;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.order.submit.model.FoodInsurance;
import com.sankuai.waimai.bussiness.order.confirm.helper.f;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.JudasManualManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    ImageView e;
    private ImageView f;
    private ViewGroup g;
    private TextView h;
    private TextView i;
    private TextView j;
    private f k;
    private boolean l;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_confirm_food_security;
    }

    public b(@NonNull Context context, @NonNull f fVar) {
        super(context);
        Object[] objArr = {context, fVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5738f6fc5436c82fcbdae1a94c7f9ea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5738f6fc5436c82fcbdae1a94c7f9ea");
            return;
        }
        this.l = false;
        this.k = fVar;
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cb1e5f4bf0aa9c10d4d527d66e0551e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cb1e5f4bf0aa9c10d4d527d66e0551e");
            return;
        }
        super.b();
        this.f = (ImageView) this.b.findViewById(R.id.img_food_security_icon);
        this.g = (ViewGroup) this.b.findViewById(R.id.layout_food_security);
        this.h = (TextView) this.b.findViewById(R.id.txt_food_security_name);
        this.e = (ImageView) this.b.findViewById(R.id.img_food_security_explain);
        this.i = (TextView) this.b.findViewById(R.id.txt_food_security_label);
        this.j = (TextView) this.b.findViewById(R.id.txt_food_security_desc);
        this.g.setPadding(this.g.getPaddingLeft(), g.a(this.c, 11.0f), this.g.getPaddingRight(), this.g.getPaddingBottom());
    }

    public final void a(@NonNull c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9215f5aba025b22ada1293ae2fe23b68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9215f5aba025b22ada1293ae2fe23b68");
        } else if (cVar.a == null) {
            this.b.setVisibility(8);
        } else {
            this.b.setVisibility(0);
            final FoodInsurance foodInsurance = cVar.a;
            if (TextUtils.isEmpty(foodInsurance.insuranceIcon)) {
                this.f.setVisibility(8);
            } else {
                this.f.setVisibility(0);
                b.C0608b a = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a.b = this.c;
                a.c = foodInsurance.insuranceIcon;
                a.a(this.f);
            }
            if (!TextUtils.isEmpty(foodInsurance.insuranceName)) {
                this.h.setText(foodInsurance.insuranceName);
            } else {
                this.h.setText(R.string.wm_order_confirm_food_security);
            }
            Object[] objArr2 = {foodInsurance};
            ChangeQuickRedirect changeQuickRedirect2 = d;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "716247cef228148af71eeb0e9a72f5b6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "716247cef228148af71eeb0e9a72f5b6");
            } else if (!TextUtils.isEmpty(foodInsurance.insuranceDetailUrl)) {
                this.e.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.foodsecurity.b.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b952d2bfa03ceda3d2f5643be4aee3de", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b952d2bfa03ceda3d2f5643be4aee3de");
                            return;
                        }
                        JudasManualManager.a("b_25x9vl8a").a("c_ykhs39e").a(b.this.c).a();
                        String str = foodInsurance.insuranceDetailUrl;
                        if (!TextUtils.isEmpty(str)) {
                            com.sankuai.waimai.foundation.router.a.a(b.this.c, str);
                        } else {
                            b.this.e.setVisibility(8);
                        }
                    }
                });
            } else {
                this.e.setOnClickListener(null);
            }
            if (!TextUtils.isEmpty(foodInsurance.purchaseDesc)) {
                this.i.setText(foodInsurance.purchaseDesc);
            } else {
                this.i.setVisibility(8);
            }
            if (TextUtils.isEmpty(foodInsurance.description)) {
                this.j.setVisibility(8);
                return;
            }
            this.j.setVisibility(0);
            this.j.setText(foodInsurance.description);
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddb4207546a9b9da8aecc2d2280a4852", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddb4207546a9b9da8aecc2d2280a4852");
        } else if (this.l) {
        } else {
            JudasManualManager.b("b_ikybzk9k").a("c_ykhs39e").a(this.c).a();
            this.l = true;
        }
    }
}
