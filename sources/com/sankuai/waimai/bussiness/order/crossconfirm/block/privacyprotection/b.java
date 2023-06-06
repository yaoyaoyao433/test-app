package com.sankuai.waimai.bussiness.order.crossconfirm.block.privacyprotection;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.resfetcher.widgets.RooImageView;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.bussiness.order.confirm.helper.f;
import com.sankuai.waimai.foundation.utils.af;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.utils.p;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    ViewGroup e;
    TextView f;
    TextView g;
    TextView h;
    RooImageView i;
    TextView j;
    TextView k;
    String l;
    boolean m;
    boolean n;
    String o;
    boolean p;
    PopupWindow q;
    Runnable r;
    Runnable s;
    private ImageView t;
    private TextView u;
    private ImageView v;
    private boolean w;
    private boolean x;
    private f y;
    private c z;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_confirm_privacy_layout;
    }

    public b(@NonNull Context context, @NonNull f fVar) {
        super(context);
        Object[] objArr = {context, fVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e933f9821c276c491e7c404cc5fbc1d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e933f9821c276c491e7c404cc5fbc1d");
            return;
        }
        this.m = false;
        this.w = false;
        this.x = false;
        this.p = false;
        this.r = new Runnable() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.privacyprotection.b.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8f8ba48a1c324f20a26756bc3a7902e5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8f8ba48a1c324f20a26756bc3a7902e5");
                    return;
                }
                Activity activity = (Activity) b.this.c;
                if (b.this.q == null) {
                    return;
                }
                int[] iArr = new int[2];
                b.this.e.getLocationInWindow(iArr);
                if (activity.isFinishing() || b.this.e.getWindowToken() == null || iArr[1] <= com.sankuai.waimai.platform.b.A().m() - g.a(activity, 50.0f)) {
                    return;
                }
                p.a(b.this.q, b.this.e, 51, 0, com.sankuai.waimai.platform.b.A().m() - g.a(activity, 105.0f));
            }
        };
        this.s = new Runnable() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.privacyprotection.b.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "82b530b09cdf0bed084e995e581d046f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "82b530b09cdf0bed084e995e581d046f");
                } else {
                    b.this.f();
                }
            }
        };
        this.y = fVar;
        this.o = context.getString(R.string.wm_order_confirm_hide_real_phone_num_tip_1);
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e400e33d784986e9adc162c6b1dad34e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e400e33d784986e9adc162c6b1dad34e");
            return;
        }
        super.b();
        this.t = (ImageView) this.b.findViewById(R.id.img_privacy_icon);
        this.e = (ViewGroup) this.b.findViewById(R.id.layout_privacy);
        this.u = (TextView) this.b.findViewById(R.id.txt_privacy_name);
        this.v = (ImageView) this.b.findViewById(R.id.img_privacy_explain);
        this.f = (TextView) this.b.findViewById(R.id.txt_new_tip);
        this.g = (TextView) this.b.findViewById(R.id.txt_privacy_desc);
        this.h = (TextView) this.b.findViewById(R.id.txt_privacy_desc_2);
        this.j = (TextView) this.b.findViewById(R.id.txt_privacy_audio_record_tip);
        this.i = (RooImageView) this.b.findViewById(R.id.img_checked);
        this.k = (TextView) this.b.findViewById(R.id.privacy_protect);
        this.e.setPadding(this.e.getPaddingLeft(), g.a(this.c, 11.0f), this.e.getPaddingRight(), g.a(this.c, 11.0f));
    }

    public final void a(@NonNull final c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9de8db0b4d9c6d76d4456c866074ca1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9de8db0b4d9c6d76d4456c866074ca1d");
            return;
        }
        this.z = cVar;
        this.l = cVar.b;
        this.n = cVar.c;
        this.w = cVar.d;
        if (this.w) {
            this.m = true;
            this.e.setVisibility(0);
            if (TextUtils.isEmpty(cVar.f)) {
                this.t.setVisibility(8);
            } else {
                this.t.setVisibility(0);
                b.C0608b a = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a.b = this.c;
                a.c = cVar.f;
                a.a(this.t);
            }
            ah.a(this.u, TextUtils.isEmpty(cVar.e) ? this.c.getString(R.string.wm_order_confirm_protect_privacy) : cVar.e);
            if (com.sankuai.waimai.platform.capacity.persistent.sp.a.b(this.c, "order_confirm_privacy_show_new_first", false)) {
                this.f.setVisibility(8);
            } else {
                this.f.setVisibility(0);
            }
            Object[] objArr2 = {cVar};
            ChangeQuickRedirect changeQuickRedirect2 = d;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "da5001197aa189d2ce145a1ff286b620", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "da5001197aa189d2ce145a1ff286b620");
            } else if (!TextUtils.isEmpty(cVar.g)) {
                this.v.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.privacyprotection.b.3
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "94a2c5546c82ed8ac5753598579d3032", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "94a2c5546c82ed8ac5753598579d3032");
                            return;
                        }
                        JudasManualManager.a("b_25x9vl8a").a("c_ykhs39e").a(b.this.c).a();
                        String str = cVar.g;
                        if (!TextUtils.isEmpty(str)) {
                            str = af.a(Uri.parse(str), "privacy_source", "1").toString();
                        }
                        com.sankuai.waimai.foundation.router.a.a(b.this.c, str);
                    }
                });
            } else {
                this.v.setOnClickListener(null);
            }
            this.n = cVar.c;
            Object[] objArr3 = {cVar};
            ChangeQuickRedirect changeQuickRedirect3 = d;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6990fcef311ce3f1506086f400e5c18a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6990fcef311ce3f1506086f400e5c18a");
                return;
            }
            if (this.y.aL_() == 0) {
                this.o = this.c.getString(R.string.wm_order_confirm_hide_real_phone_num_tip_1);
            } else {
                this.o = this.c.getString(R.string.wm_order_confirm_hide_real_phone_num_tip);
            }
            this.p = cVar.c;
            if (cVar.c) {
                this.i.setImageResourceByResName("waimai_c_wm_order_selected");
                ah.a(this.g, TextUtils.isEmpty(cVar.h) ? this.o : cVar.h);
                ah.a(this.h, cVar.i);
                ah.a(this.j, cVar.l);
                this.k.setVisibility(0);
            } else {
                this.i.setImageResourceByResName("waimai_c_wm_order_unselected");
                ah.a(this.g, TextUtils.isEmpty(cVar.j) ? this.o : Html.fromHtml(a(cVar.j)));
                this.h.setVisibility(8);
                ah.a(this.j, cVar.k);
                this.k.setVisibility(4);
            }
            this.i.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.privacyprotection.b.4
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CharSequence fromHtml;
                    String str;
                    Object[] objArr4 = {view};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3675878b9e67bcd6099ded76953f2b0d", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3675878b9e67bcd6099ded76953f2b0d");
                        return;
                    }
                    b.this.f.setVisibility(8);
                    b.this.g();
                    if (!b.this.p) {
                        b.this.i.setImageResourceByResName("waimai_c_wm_order_selected");
                        TextView textView = b.this.g;
                        if (!TextUtils.isEmpty(cVar.h)) {
                            str = cVar.h;
                        } else {
                            str = b.this.o;
                        }
                        ah.a(textView, str);
                        ah.a(b.this.h, cVar.i);
                        ah.a(b.this.j, cVar.l);
                        b.this.k.setVisibility(0);
                    } else {
                        b.this.i.setImageResourceByResName("waimai_c_wm_order_unselected");
                        String a2 = b.this.a(cVar.j);
                        TextView textView2 = b.this.g;
                        if (!TextUtils.isEmpty(cVar.j)) {
                            fromHtml = Html.fromHtml(a2);
                        } else {
                            fromHtml = b.this.o;
                        }
                        ah.a(textView2, fromHtml);
                        b.this.h.setVisibility(8);
                        ah.a(b.this.j, cVar.k);
                        b.this.k.setVisibility(4);
                    }
                    b.this.p = !b.this.p;
                    JudasManualManager.a("b_vevro86k").a("c_ykhs39e").a("status", b.this.p ? 1 : 0).a("userprivacy_status", 1 ^ (b.this.p ? 1 : 0)).a("token", b.this.l).a(b.this.c).a();
                    b.this.n = b.this.p;
                }
            });
            return;
        }
        this.m = false;
        f();
        this.e.setVisibility(8);
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a7101fc441d2ced193eee8ea2bd2a91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a7101fc441d2ced193eee8ea2bd2a91");
        } else if (this.x || !this.w) {
        } else {
            JudasManualManager.b("b_nw9ituzw").a("c_ykhs39e").a("token", this.l).a("userprivacy_status", this.p ? 1 : 0).a(this.c).a();
            this.x = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84638cb9b03abb50ac262ea11cbe33ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84638cb9b03abb50ac262ea11cbe33ab");
        } else if (this.q == null || !this.q.isShowing()) {
        } else {
            p.a(this.q);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32a63310f4f5162d9295e1b7fa1123b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32a63310f4f5162d9295e1b7fa1123b7");
        } else {
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(this.c, "order_confirm_privacy_show_new_first", true);
        }
    }

    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c1b53d45bbbbab6f4241ebe1fb4eee2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c1b53d45bbbbab6f4241ebe1fb4eee2") : TextUtils.isEmpty(this.z.j) ? "" : str.replace("<highlight>", "<font color=\"#FF8000\">").replace("</highlight>", "</font>");
    }
}
