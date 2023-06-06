package com.sankuai.waimai.store.newcustomer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.newcustomer.b;
import com.sankuai.waimai.store.platform.domain.core.poi.CouponCollectionTip;
import com.sankuai.waimai.store.platform.domain.core.poi.NewCustomCouponDetail;
import com.sankuai.waimai.store.ui.common.CustomDialog;
import com.sankuai.waimai.store.util.m;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class NewCustomerCouponListDialog extends CustomDialog implements b.a {
    public static ChangeQuickRedirect a;
    private ImageView b;
    private TextView c;
    private TextView d;
    private ListView e;
    private ImageView f;
    private b h;
    private TextView i;
    private b.c j;

    public NewCustomerCouponListDialog(Context context) {
        super(context, LayoutInflater.from(context).inflate(R.layout.wm_sc_new_customer_coupon_list_dialog, (ViewGroup) null, false));
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d47f7f8d037c241e20e7e25b720db004", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d47f7f8d037c241e20e7e25b720db004");
        }
    }

    @Override // com.sankuai.waimai.store.ui.common.SCBaseDialog
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cc755d244b6b8dda927a23d031ffbc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cc755d244b6b8dda927a23d031ffbc5");
            return;
        }
        super.a(view);
        this.b = (ImageView) c(R.id.iv_coupon_header_bg);
        this.c = (TextView) c(R.id.new_customer_coupon_dialog_title);
        this.d = (TextView) c(R.id.new_customer_coupon_dialog_sub_title);
        this.e = (ListView) c(R.id.new_customer_coupon_list);
        this.i = (TextView) c(R.id.new_customer_coupon_dialog_bottom_tips);
        this.f = (ImageView) c(R.id.new_customer_iv_close);
        this.f.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.newcustomer.NewCustomerCouponListDialog.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "517eb92324c85e4fd9f3358961458799", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "517eb92324c85e4fd9f3358961458799");
                } else {
                    NewCustomerCouponListDialog.this.dismiss();
                }
            }
        });
    }

    public final void a(@NonNull CouponCollectionTip couponCollectionTip, @NonNull b.c cVar) {
        Object[] objArr = {couponCollectionTip, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fb3f20a773e3fda5024422c8874a754", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fb3f20a773e3fda5024422c8874a754");
        } else if (couponCollectionTip == null || com.sankuai.shangou.stone.util.a.b(couponCollectionTip.getCouponDetailInfoList())) {
            dismiss();
        } else {
            this.j = cVar;
            this.h = new b(cVar, this, couponCollectionTip.getOrderId());
            this.e.setAdapter((ListAdapter) this.h);
            this.h.a(couponCollectionTip.getCouponDetailInfoList());
            this.c.setText(couponCollectionTip.getTipOpenTitle());
            this.i.setText(couponCollectionTip.getTipOpenBottomTitle());
            u.a(this.d, couponCollectionTip.getTitleOpenSubtitle());
            a(couponCollectionTip.getTipOpenImageUrl());
            a(couponCollectionTip.getCouponDetailInfoList());
        }
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0764277428bec7beea29eaffc9296528", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0764277428bec7beea29eaffc9296528");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            b.C0608b b = m.b(str, h.a(getContext(), 160.0f), ImageQualityUtil.b());
            b.j = R.drawable.wm_st_page_main_home_img_banner_default;
            b.i = R.drawable.wm_st_page_main_home_img_banner_default;
            b.a(this.b);
        }
    }

    private void a(List<NewCustomCouponDetail> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ece6af3d7f18fb00fab41d9ace1e9e0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ece6af3d7f18fb00fab41d9ace1e9e0f");
            return;
        }
        int a2 = com.sankuai.shangou.stone.util.a.a((List) list);
        int a3 = h.a(getContext(), 2 == a2 ? 150.0f : 230.0f);
        ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
        if (a2 <= 1) {
            layoutParams.height = -2;
        } else {
            layoutParams.height = a3;
        }
        this.e.setLayoutParams(layoutParams);
    }

    @Override // com.sankuai.waimai.store.ui.common.SCBaseDialog, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccd3d7479ae7bdaefc6c4e354a8f7bb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccd3d7479ae7bdaefc6c4e354a8f7bb0");
            return;
        }
        super.dismiss();
        if (this.j != null) {
            this.j = null;
        }
        if (this.h != null) {
            b bVar = this.h;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "6104597758693198367f0a50d296fb6a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "6104597758693198367f0a50d296fb6a");
            } else {
                bVar.b.a();
            }
        }
    }

    @Override // com.sankuai.waimai.store.newcustomer.b.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75052b87d3452e8d890794513dad9a16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75052b87d3452e8d890794513dad9a16");
        } else {
            dismiss();
        }
    }
}
