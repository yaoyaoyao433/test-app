package com.sankuai.waimai.bussiness.order.crossconfirm.block.timeinsurance;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.resfetcher.widgets.RooImageView;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.bussiness.order.confirm.helper.f;
import com.sankuai.waimai.bussiness.order.confirm.helper.h;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.JudasManualManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    TextView e;
    f f;
    boolean g;
    private ImageView h;
    private ViewGroup i;
    private TextView j;
    private ImageView k;
    private TextView l;
    private TextView m;
    private ViewGroup n;
    private TextView o;
    private RooImageView p;
    private int q;
    private int r;
    private int s;
    private boolean t;
    private boolean u;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_confirm_insurance_layout;
    }

    public b(@NonNull Context context, @NonNull f fVar) {
        super(context);
        Object[] objArr = {context, fVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "283fc2ab98560c1cd996f3fd2b0ef891", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "283fc2ab98560c1cd996f3fd2b0ef891");
            return;
        }
        this.s = -1;
        this.t = false;
        this.u = false;
        this.f = fVar;
        if (this.f.aM_()) {
            this.q = context.getResources().getDimensionPixelSize(R.dimen.wm_order_confirm_font_size_insurance_b_price_symbol);
            this.r = context.getResources().getDimensionPixelSize(R.dimen.wm_order_confirm_font_size_insurance_b_price_num);
            this.l.setTextSize(0, this.r);
        }
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81a8c0a024e8bc3ed73c43f8febca2c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81a8c0a024e8bc3ed73c43f8febca2c7");
            return;
        }
        super.b();
        this.h = (ImageView) this.b.findViewById(R.id.img_insurance_icon);
        this.e = (TextView) this.b.findViewById(R.id.txt_insurance_label);
        this.i = (ViewGroup) this.b.findViewById(R.id.layout_insurance);
        this.j = (TextView) this.b.findViewById(R.id.txt_insurance_name);
        this.k = (ImageView) this.b.findViewById(R.id.img_insurance_explain);
        this.l = (TextView) this.b.findViewById(R.id.txt_insurance_money);
        this.m = (TextView) this.b.findViewById(R.id.txt_insurance_desc);
        this.n = (ViewGroup) this.b.findViewById(R.id.layout_insurance_contract);
        this.o = (TextView) this.b.findViewById(R.id.txt_insurance_contract);
        this.p = (RooImageView) this.b.findViewById(R.id.ckb_insurance_main);
        this.i.setPadding(this.i.getPaddingLeft(), this.i.getPaddingTop(), this.i.getPaddingRight(), g.a(this.c, 11.0f));
    }

    public final void a(@NonNull final c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87812870d24be894f3a57382be261eec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87812870d24be894f3a57382be261eec");
            return;
        }
        this.g = cVar.a;
        this.s = cVar.k;
        this.t = cVar.b;
        if (cVar.b) {
            this.i.setVisibility(0);
            if (TextUtils.isEmpty(cVar.c)) {
                this.h.setVisibility(8);
            } else {
                this.h.setVisibility(0);
                b.C0608b a = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a.b = this.c;
                a.c = cVar.c;
                a.a(this.h);
            }
            ah.a(this.j, cVar.d);
            String str = cVar.e;
            if (!TextUtils.isEmpty(str)) {
                this.m.setText(Html.fromHtml(str.replace("<highlight>", "<font color=\"#FB4E44\">").replace("</highlight>", "</font>")));
                this.m.setVisibility(0);
            } else {
                this.m.setVisibility(8);
            }
            if (!TextUtils.isEmpty(cVar.f)) {
                this.k.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.timeinsurance.b.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5de6403b4889d19931ec758589d4a3ec", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5de6403b4889d19931ec758589d4a3ec");
                            return;
                        }
                        JudasManualManager.a("b_KdXFV").a("c_ykhs39e").a(b.this.c).a();
                        com.sankuai.waimai.foundation.router.a.a(b.this.c, cVar.f);
                    }
                });
                this.o.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.timeinsurance.b.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f8be04732ea44e1957497cd0a160bd57", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f8be04732ea44e1957497cd0a160bd57");
                        } else {
                            com.sankuai.waimai.foundation.router.a.a(b.this.c, cVar.f);
                        }
                    }
                });
            } else {
                this.k.setOnClickListener(null);
                this.o.setOnClickListener(null);
            }
            if (!cVar.g) {
                this.p.setEnabled(true);
                this.l.setVisibility(0);
                this.o.setVisibility(0);
                this.p.setVisibility(0);
                this.e.setVisibility(8);
                h.a(this.l, this.c.getString(R.string.wm_order_base_price_with_rmb_symbol, com.sankuai.waimai.foundation.utils.h.a(cVar.j)), this.f.aN_(), this.q, this.r);
                ah.a(this.o, cVar.h);
                JudasManualManager.b("b_6g5SX").a("c_ykhs39e").a(this.c).a();
                this.g = cVar.a;
                if (cVar.a) {
                    this.p.setImageResourceByResName("waimai_c_wm_order_selected");
                    this.n.setVisibility(0);
                } else {
                    this.p.setImageResourceByResName("waimai_c_wm_order_unselected");
                    this.n.setVisibility(8);
                }
                this.p.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.timeinsurance.b.3
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bf65d21da58c2b7d8400f34bf04c5959", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bf65d21da58c2b7d8400f34bf04c5959");
                            return;
                        }
                        if (!b.this.g) {
                            JudasManualManager.a("b_49K0r").a("c_ykhs39e").a(b.this.c).a();
                        }
                        if (b.this.e.getVisibility() != 0) {
                            b bVar = b.this;
                            boolean z = !cVar.a ? 1 : 0;
                            Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                            ChangeQuickRedirect changeQuickRedirect3 = b.d;
                            if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "e208a866d321b6185a6d458152bd1d58", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "e208a866d321b6185a6d458152bd1d58");
                                return;
                            }
                            bVar.g = z;
                            bVar.f.a(2);
                        }
                    }
                });
                return;
            }
            this.l.setVisibility(8);
            this.n.setVisibility(8);
            this.p.setEnabled(false);
            this.p.setImageResource(R.drawable.wm_order_confirm_gift_selected);
            this.g = true;
            if (!TextUtils.isEmpty(cVar.i)) {
                this.e.setText(cVar.i);
                this.e.setVisibility(0);
                return;
            }
            this.e.setVisibility(8);
            return;
        }
        this.i.setVisibility(8);
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db7d05dd27e6a804e9004e1609196115", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db7d05dd27e6a804e9004e1609196115");
        } else if (this.u || !this.t) {
        } else {
            JudasManualManager.b("b_ml6Ap").a("c_ykhs39e").a("giftType", this.s).a(this.c).a();
            this.u = true;
        }
    }
}
