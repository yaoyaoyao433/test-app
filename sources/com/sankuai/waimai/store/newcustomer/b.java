package com.sankuai.waimai.store.newcustomer;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.newwidgets.list.g;
import com.sankuai.waimai.store.platform.domain.core.poi.NewCustomCouponDetail;
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.util.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.store.newwidgets.list.c<NewCustomCouponDetail, c> {
    public static ChangeQuickRedirect a;
    final com.sankuai.waimai.store.expose.a<NewCustomCouponDetail> b;
    private a e;
    private String f;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface c extends com.sankuai.waimai.store.newwidgets.list.b {
        void a(int i, NewCustomCouponDetail newCustomCouponDetail, String str);

        void a(String str);

        void b(int i, NewCustomCouponDetail newCustomCouponDetail, String str);
    }

    public b(@NonNull final c cVar, a aVar, String str) {
        super(cVar);
        Object[] objArr = {cVar, aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f07319da3bba5789fb82204c2989b05", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f07319da3bba5789fb82204c2989b05");
            return;
        }
        this.f = str;
        this.e = aVar;
        this.b = new com.sankuai.waimai.store.expose.a<NewCustomCouponDetail>() { // from class: com.sankuai.waimai.store.newcustomer.b.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.expose.a
            public final /* synthetic */ boolean a(View view, NewCustomCouponDetail newCustomCouponDetail) {
                NewCustomCouponDetail newCustomCouponDetail2 = newCustomCouponDetail;
                Object[] objArr2 = {view, newCustomCouponDetail2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1671a734c51674383c51dcb49b1027bf", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1671a734c51674383c51dcb49b1027bf")).booleanValue();
                }
                if (newCustomCouponDetail2 == null) {
                    return false;
                }
                cVar.b(b.this.d.indexOf(newCustomCouponDetail2), newCustomCouponDetail2, b.this.f);
                return true;
            }
        };
        cVar.a(str);
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.c
    public final g a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87dfa557b1883503998f8a673f73105a", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87dfa557b1883503998f8a673f73105a") : new C1246b();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.newcustomer.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class C1246b extends g<NewCustomCouponDetail, c> {
        public static ChangeQuickRedirect a;
        private TextView c;
        private TextView d;
        private TextView e;
        private TextView f;
        private TextView g;

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final int a() {
            return R.layout.wm_sc_new_customer_coupon_item;
        }

        public C1246b() {
            Object[] objArr = {b.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "977cd55c2d009e21fc378433328ea8af", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "977cd55c2d009e21fc378433328ea8af");
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final /* synthetic */ void a(NewCustomCouponDetail newCustomCouponDetail, final int i) {
            final NewCustomCouponDetail newCustomCouponDetail2 = newCustomCouponDetail;
            Object[] objArr = {newCustomCouponDetail2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d42ad77588957d56a01ad58fe69b6ad7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d42ad77588957d56a01ad58fe69b6ad7");
            } else if (newCustomCouponDetail2 != null) {
                u.a(this.e, newCustomCouponDetail2.getCouponName());
                this.c.setText(newCustomCouponDetail2.getCouponValue());
                this.f.setText(newCustomCouponDetail2.getCouponValidTimeText());
                this.d.setText(newCustomCouponDetail2.getCouponConditionText());
                this.g.setBackground(e.b(this.p.getContext(), (int) R.color.wm_sc_price_red, (int) R.dimen.wm_sc_common_dimen_10));
                Object[] objArr2 = {newCustomCouponDetail2, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "267073acecff37becc4d71b16a72867c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "267073acecff37becc4d71b16a72867c");
                } else {
                    this.g.setText(newCustomCouponDetail2.getCouponButtonText());
                    this.g.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.newcustomer.b.b.1
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr3 = {view};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1eedfc900f5074a3cce0dcd214361ba9", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1eedfc900f5074a3cce0dcd214361ba9");
                            } else if (t.a(newCustomCouponDetail2.getCouponButtonClickUrl())) {
                            } else {
                                if (b.this.e != null) {
                                    b.this.e.a();
                                }
                                ((c) C1246b.this.o).a(i, newCustomCouponDetail2, b.this.f);
                                d.a(view.getContext(), newCustomCouponDetail2.getCouponButtonClickUrl());
                            }
                        }
                    });
                }
                b.this.b.b(this.p, newCustomCouponDetail2);
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final void a(@NonNull View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d36624851ccb6983e7e95b47d7565add", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d36624851ccb6983e7e95b47d7565add");
                return;
            }
            this.c = (TextView) view.findViewById(R.id.txt_coupon_amount);
            this.d = (TextView) view.findViewById(R.id.txt_coupon_price_limit);
            this.e = (TextView) view.findViewById(R.id.txt_coupon_title);
            this.f = (TextView) view.findViewById(R.id.txt_coupon_time_limit);
            this.g = (TextView) view.findViewById(R.id.txt_go_use);
        }
    }
}
