package com.sankuai.waimai.store.order.detail.blockview;

import android.content.Context;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.mrn.dialog.SGMRNDialogFragment;
import com.sankuai.waimai.store.order.detail.model.InquiryInfo;
import com.sankuai.waimai.store.order.prescription.model.mach.OrderConfirmMachTemplate;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    private TextView e;
    private View f;
    private View g;
    private TextView h;
    private View i;
    private TextView j;
    private TextView k;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_sc_order_inquiry_info_view;
    }

    public c(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb8a4ef5462546e45430a539abb1a107", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb8a4ef5462546e45430a539abb1a107");
        }
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e3eb0e267788c944a80ae4d2a62c179", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e3eb0e267788c944a80ae4d2a62c179");
            return;
        }
        super.b();
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        }
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = com.sankuai.shangou.stone.util.h.a(this.c, 6.0f);
        this.b.setLayoutParams(layoutParams);
        this.e = (TextView) this.b.findViewById(R.id.doctors);
        this.f = this.b.findViewById(R.id.record);
        this.g = this.b.findViewById(R.id.pharmacistArea);
        this.h = (TextView) this.b.findViewById(R.id.pharmacist);
        this.i = this.b.findViewById(R.id.electronic);
        this.j = (TextView) this.b.findViewById(R.id.record_text);
        this.k = (TextView) this.b.findViewById(R.id.electronic_text);
    }

    public final void a(String str, final Long l, final String str2) {
        Object[] objArr = {str, l, str2};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d2562e3918fbf563322e23119b6a5dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d2562e3918fbf563322e23119b6a5dd");
            return;
        }
        OrderConfirmMachTemplate orderConfirmMachTemplate = (OrderConfirmMachTemplate) com.sankuai.shangou.stone.util.a.a((List<Object>) com.sankuai.waimai.store.util.i.a(str, new TypeToken<List<OrderConfirmMachTemplate>>() { // from class: com.sankuai.waimai.store.order.detail.blockview.c.1
        }.getType()), 0);
        if (orderConfirmMachTemplate == null) {
            this.b.setVisibility(8);
            return;
        }
        final InquiryInfo inquiryInfo = (InquiryInfo) com.sankuai.waimai.store.util.i.a(orderConfirmMachTemplate.nativeData, InquiryInfo.class);
        if (inquiryInfo != null) {
            this.k.setText(inquiryInfo.rpPicInfo);
            this.j.setText(inquiryInfo.inquiryHistoryInfo);
            this.e.setText(inquiryInfo.doctor);
            this.f.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.order.detail.blockview.c.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "19aea7e9aa4f2d530ddea540859fae9c", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "19aea7e9aa4f2d530ddea540859fae9c");
                    } else {
                        com.sankuai.waimai.store.router.d.a(c.this.c, inquiryInfo.inquiryHistoryUrl);
                    }
                }
            });
            this.f.setVisibility(TextUtils.isEmpty(inquiryInfo.inquiryHistoryUrl) ? 8 : 0);
            this.g.setVisibility(TextUtils.isEmpty(inquiryInfo.pharmacist) ? 8 : 0);
            this.h.setText(inquiryInfo.pharmacist);
            this.i.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.order.detail.blockview.c.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "28072d34b42427ee30b617f7024d0aec", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "28072d34b42427ee30b617f7024d0aec");
                    } else if (str2 == null || TextUtils.isEmpty(str2)) {
                    } else {
                        c cVar = c.this;
                        Context context = c.this.c;
                        String str3 = str2;
                        Long l2 = l;
                        Object[] objArr3 = {context, str3, l2};
                        ChangeQuickRedirect changeQuickRedirect3 = c.d;
                        if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "edb22db7df4d735e9977f984fe927613", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "edb22db7df4d735e9977f984fe927613");
                            return;
                        }
                        SGMRNDialogFragment.a aVar = new SGMRNDialogFragment.a();
                        aVar.d = "flashbuy-prescription-image-viewer";
                        aVar.c = "flashbuy-medicial-user";
                        SGMRNDialogFragment a2 = aVar.a("orderViewId", str3).a("poi_id", l2.toString()).a("orderViewId", str3).a();
                        if (context instanceof FragmentActivity) {
                            a2.b((FragmentActivity) context, context.getClass().getSimpleName());
                        }
                    }
                }
            });
            this.i.setVisibility(TextUtils.isEmpty(inquiryInfo.rpPicInfo) ? 8 : 0);
            this.b.setVisibility(0);
            return;
        }
        this.b.setVisibility(8);
    }
}
