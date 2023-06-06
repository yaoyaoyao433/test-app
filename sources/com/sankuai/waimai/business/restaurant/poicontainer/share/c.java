package com.sankuai.waimai.business.restaurant.poicontainer.share;

import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.restaurant.base.share.a;
import com.sankuai.waimai.foundation.utils.h;
import com.sankuai.waimai.platform.domain.core.Share.ShareTip;
import com.sankuai.waimai.platform.utils.l;
import com.sankuai.waimai.platform.widget.AutoWrapHorizontalLayout;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.sankuai.waimai.business.restaurant.base.share.a {
    public static ChangeQuickRedirect h;
    private ViewGroup i;
    private ViewGroup j;
    private ImageView k;
    private ImageView l;
    private ImageView m;
    private ImageView n;
    private ImageView o;
    private ImageView p;
    private TextView q;
    private TextView r;
    private AutoWrapHorizontalLayout s;

    public c(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fd76d23dd4d5a69e1cdc9f9ffd21621", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fd76d23dd4d5a69e1cdc9f9ffd21621");
            return;
        }
        this.b = view.findViewById(R.id.layout_local_share_view_layout);
        this.k = (ImageView) this.b.findViewById(R.id.local_share_bg);
        this.i = (ViewGroup) this.b.findViewById(R.id.local_share_lable_layout);
        this.q = (TextView) this.b.findViewById(R.id.local_share_lable_txt);
        this.j = (ViewGroup) this.b.findViewById(R.id.local_share_score_layout);
        this.r = (TextView) this.b.findViewById(R.id.local_share_score_txt);
        this.l = (ImageView) this.b.findViewById(R.id.local_share_score_star1);
        this.m = (ImageView) this.b.findViewById(R.id.local_share_score_star2);
        this.n = (ImageView) this.b.findViewById(R.id.local_share_score_star3);
        this.o = (ImageView) this.b.findViewById(R.id.local_share_score_star4);
        this.p = (ImageView) this.b.findViewById(R.id.local_share_score_star5);
        this.s = (AutoWrapHorizontalLayout) this.b.findViewById(R.id.local_share_bottom_label_layout);
    }

    public final void a(ShareTip shareTip, final a.InterfaceC0823a interfaceC0823a) {
        Object[] objArr = {shareTip, interfaceC0823a};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2422b78e74143cb18311654110dc5759", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2422b78e74143cb18311654110dc5759");
        } else if (shareTip != null && shareTip.shareInfo != null) {
            a();
            ShareTip.ShareInfo shareInfo = shareTip.shareInfo;
            this.b.setVisibility(0);
            if (!com.sankuai.waimai.foundation.utils.b.b(shareInfo.labels)) {
                this.i.setVisibility(0);
                this.q.setText(shareInfo.labels.get(0));
            } else {
                this.i.setVisibility(8);
            }
            String str = shareInfo.icon;
            Object[] objArr2 = {str, interfaceC0823a};
            ChangeQuickRedirect changeQuickRedirect2 = h;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "60ad8480a3df976f34c6ebe317c25d06", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "60ad8480a3df976f34c6ebe317c25d06");
            } else {
                a(str);
                b.C0608b a = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a.c = str;
                a.j = R.drawable.wm_restaurant_share_default_bg;
                a.i = R.drawable.wm_restaurant_share_default_bg;
                b.C0608b b = a.b(this.g);
                b.h = new b.c() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.share.c.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mtimageloader.config.b.c
                    public final void a() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6cb14d0296b80a802124f93ea6c2df8c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6cb14d0296b80a802124f93ea6c2df8c");
                        } else if (interfaceC0823a != null) {
                            l.b(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.share.c.1.1
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr4 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "388c1c7abae7c606d17e7e6c73609af6", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "388c1c7abae7c606d17e7e6c73609af6");
                                    } else {
                                        interfaceC0823a.a(true);
                                    }
                                }
                            }, (String) null);
                        }
                    }

                    @Override // com.sankuai.meituan.mtimageloader.config.b.c
                    public final void b() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9e9943fc05ac5d5ea3c3e98923b069f3", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9e9943fc05ac5d5ea3c3e98923b069f3");
                        } else if (interfaceC0823a != null) {
                            interfaceC0823a.a(false);
                        }
                    }
                };
                b.a(this.k);
            }
            double d = shareInfo.score;
            Object[] objArr3 = {Double.valueOf(d)};
            ChangeQuickRedirect changeQuickRedirect3 = h;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9c9c44feb078c9c919bd02348592a6c9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9c9c44feb078c9c919bd02348592a6c9");
            } else if (h.c(Double.valueOf(d), Double.valueOf(0.0d))) {
                this.j.setVisibility(8);
            } else {
                this.j.setVisibility(0);
                TextView textView = this.r;
                StringBuilder sb = new StringBuilder();
                sb.append(d);
                textView.setText(sb.toString());
                if (h.d(Double.valueOf(d), Double.valueOf(0.0d)) && h.b(Double.valueOf(d), Double.valueOf(1.0d))) {
                    this.l.setImageResource(R.drawable.wm_restaurant_score_star_half_icon);
                    this.m.setImageResource(R.drawable.wm_restaurant_score_star_empty_icon);
                    this.n.setImageResource(R.drawable.wm_restaurant_score_star_empty_icon);
                    this.o.setImageResource(R.drawable.wm_restaurant_score_star_empty_icon);
                    this.p.setImageResource(R.drawable.wm_restaurant_score_star_empty_icon);
                } else if (h.a(Double.valueOf(d), Double.valueOf(1.0d))) {
                    this.l.setImageResource(R.drawable.wm_restaurant_score_star_full_icon);
                    this.m.setImageResource(R.drawable.wm_restaurant_score_star_empty_icon);
                    this.n.setImageResource(R.drawable.wm_restaurant_score_star_empty_icon);
                    this.o.setImageResource(R.drawable.wm_restaurant_score_star_empty_icon);
                    this.p.setImageResource(R.drawable.wm_restaurant_score_star_empty_icon);
                } else if (h.d(Double.valueOf(d), Double.valueOf(1.0d)) && h.b(Double.valueOf(d), Double.valueOf(2.0d))) {
                    this.l.setImageResource(R.drawable.wm_restaurant_score_star_full_icon);
                    this.m.setImageResource(R.drawable.wm_restaurant_score_star_half_icon);
                    this.n.setImageResource(R.drawable.wm_restaurant_score_star_empty_icon);
                    this.o.setImageResource(R.drawable.wm_restaurant_score_star_empty_icon);
                    this.p.setImageResource(R.drawable.wm_restaurant_score_star_empty_icon);
                } else if (h.a(Double.valueOf(d), Double.valueOf(2.0d))) {
                    this.l.setImageResource(R.drawable.wm_restaurant_score_star_full_icon);
                    this.m.setImageResource(R.drawable.wm_restaurant_score_star_full_icon);
                    this.n.setImageResource(R.drawable.wm_restaurant_score_star_empty_icon);
                    this.o.setImageResource(R.drawable.wm_restaurant_score_star_empty_icon);
                    this.p.setImageResource(R.drawable.wm_restaurant_score_star_empty_icon);
                } else if (h.d(Double.valueOf(d), Double.valueOf(2.0d)) && h.b(Double.valueOf(d), Double.valueOf(3.0d))) {
                    this.l.setImageResource(R.drawable.wm_restaurant_score_star_full_icon);
                    this.m.setImageResource(R.drawable.wm_restaurant_score_star_full_icon);
                    this.n.setImageResource(R.drawable.wm_restaurant_score_star_half_icon);
                    this.o.setImageResource(R.drawable.wm_restaurant_score_star_empty_icon);
                    this.p.setImageResource(R.drawable.wm_restaurant_score_star_empty_icon);
                } else if (h.a(Double.valueOf(d), Double.valueOf(3.0d))) {
                    this.l.setImageResource(R.drawable.wm_restaurant_score_star_full_icon);
                    this.m.setImageResource(R.drawable.wm_restaurant_score_star_full_icon);
                    this.n.setImageResource(R.drawable.wm_restaurant_score_star_full_icon);
                    this.o.setImageResource(R.drawable.wm_restaurant_score_star_empty_icon);
                    this.p.setImageResource(R.drawable.wm_restaurant_score_star_empty_icon);
                } else if (h.d(Double.valueOf(d), Double.valueOf(3.0d)) && h.b(Double.valueOf(d), Double.valueOf(4.0d))) {
                    this.l.setImageResource(R.drawable.wm_restaurant_score_star_full_icon);
                    this.m.setImageResource(R.drawable.wm_restaurant_score_star_full_icon);
                    this.n.setImageResource(R.drawable.wm_restaurant_score_star_full_icon);
                    this.o.setImageResource(R.drawable.wm_restaurant_score_star_half_icon);
                    this.p.setImageResource(R.drawable.wm_restaurant_score_star_empty_icon);
                } else if (h.a(Double.valueOf(d), Double.valueOf(4.0d))) {
                    this.l.setImageResource(R.drawable.wm_restaurant_score_star_full_icon);
                    this.m.setImageResource(R.drawable.wm_restaurant_score_star_full_icon);
                    this.n.setImageResource(R.drawable.wm_restaurant_score_star_full_icon);
                    this.o.setImageResource(R.drawable.wm_restaurant_score_star_full_icon);
                    this.p.setImageResource(R.drawable.wm_restaurant_score_star_empty_icon);
                } else if (h.d(Double.valueOf(d), Double.valueOf(4.0d)) && h.b(Double.valueOf(d), Double.valueOf(5.0d))) {
                    this.l.setImageResource(R.drawable.wm_restaurant_score_star_full_icon);
                    this.m.setImageResource(R.drawable.wm_restaurant_score_star_full_icon);
                    this.n.setImageResource(R.drawable.wm_restaurant_score_star_full_icon);
                    this.o.setImageResource(R.drawable.wm_restaurant_score_star_full_icon);
                    this.p.setImageResource(R.drawable.wm_restaurant_score_star_half_icon);
                } else if (h.e(Double.valueOf(d), Double.valueOf(5.0d))) {
                    this.l.setImageResource(R.drawable.wm_restaurant_score_star_full_icon);
                    this.m.setImageResource(R.drawable.wm_restaurant_score_star_full_icon);
                    this.n.setImageResource(R.drawable.wm_restaurant_score_star_full_icon);
                    this.o.setImageResource(R.drawable.wm_restaurant_score_star_full_icon);
                    this.p.setImageResource(R.drawable.wm_restaurant_score_star_full_icon);
                }
            }
            a(shareInfo.activityLabels);
        } else {
            this.b.setVisibility(8);
        }
    }

    private void a(List<String> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a63bf9e0c4fe0b87c32492f829131462", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a63bf9e0c4fe0b87c32492f829131462");
        } else if (com.sankuai.waimai.foundation.utils.b.b(list)) {
            this.s.setVisibility(8);
        } else {
            this.s.setVisibility(0);
            this.s.removeAllViews();
            for (String str : list) {
                e eVar = new e(this.s);
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = e.a;
                if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "6f618d01a28bce6612e68dbc017f2046", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "6f618d01a28bce6612e68dbc017f2046");
                } else {
                    eVar.b = eVar.d.inflate(R.layout.wm_restaurant_local_share_bottom_label_layout, eVar.e, false);
                    eVar.b.setId(View.generateViewId());
                    eVar.c = (TextView) eVar.b.findViewById(R.id.local_share_bottom_label_txt);
                    eVar.c.setText(str);
                    eVar.e.addView(eVar.b);
                }
            }
        }
    }
}
