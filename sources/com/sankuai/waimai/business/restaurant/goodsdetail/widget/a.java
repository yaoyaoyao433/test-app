package com.sankuai.waimai.business.restaurant.goodsdetail.widget;

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
import com.sankuai.waimai.business.restaurant.base.share.a;
import com.sankuai.waimai.foundation.utils.h;
import com.sankuai.waimai.platform.domain.core.Share.ShareTip;
import com.sankuai.waimai.platform.utils.l;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.business.restaurant.base.share.a {
    public static ChangeQuickRedirect h;
    private ImageView i;
    private ViewGroup j;
    private ViewGroup k;
    private TextView l;
    private TextView m;
    private TextView n;
    private TextView o;

    public a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "450bfcfaaf001732bc135dfb4a6934c7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "450bfcfaaf001732bc135dfb4a6934c7");
        } else if (view != null) {
            this.b = view.findViewById(R.id.layout_local_share_view);
            this.j = (ViewGroup) view.findViewById(R.id.local_share_lable_layout);
            this.k = (ViewGroup) view.findViewById(R.id.local_share_price_layout);
            this.i = (ImageView) view.findViewById(R.id.local_share_bg);
            this.l = (TextView) view.findViewById(R.id.local_share_price);
            this.m = (TextView) view.findViewById(R.id.local_share_origin_price);
            this.n = (TextView) view.findViewById(R.id.local_share_poi_name);
            this.o = (TextView) view.findViewById(R.id.local_share_lable_txt);
        }
    }

    public final void a(ShareTip shareTip, final a.InterfaceC0823a interfaceC0823a) {
        Object[] objArr = {shareTip, interfaceC0823a};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d888976d5a11f349963d23a4e6fd591", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d888976d5a11f349963d23a4e6fd591");
        } else if (shareTip == null || shareTip.shareInfo == null) {
        } else {
            a();
            a(shareTip.shareInfo.icon);
            b.C0608b a = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a.c = shareTip.shareInfo.icon;
            a.j = R.drawable.wm_restaurant_share_default_bg;
            a.i = R.drawable.wm_restaurant_share_default_bg;
            b.C0608b b = a.b(this.g);
            b.h = new b.c() { // from class: com.sankuai.waimai.business.restaurant.goodsdetail.widget.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.c
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ef4087c2ae7f2b92036494283c26d400", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ef4087c2ae7f2b92036494283c26d400");
                    } else if (interfaceC0823a != null) {
                        l.b(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.goodsdetail.widget.a.1.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3590f86b8da3349e27977a286ca36091", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3590f86b8da3349e27977a286ca36091");
                                } else {
                                    interfaceC0823a.a(true);
                                }
                            }
                        }, (String) null);
                    }
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.c
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c53396a919c045ced379d71089a6503b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c53396a919c045ced379d71089a6503b");
                    } else if (interfaceC0823a != null) {
                        interfaceC0823a.a(false);
                    }
                }
            };
            b.a(this.i);
            if (!com.sankuai.waimai.foundation.utils.b.b(shareTip.shareInfo.labels)) {
                this.o.setText(shareTip.shareInfo.labels.get(0));
                this.j.setVisibility(0);
            } else {
                this.j.setVisibility(8);
            }
            boolean d = h.d(Double.valueOf(shareTip.shareInfo.price), Double.valueOf(0.0d));
            boolean z = h.d(Double.valueOf(shareTip.shareInfo.originalPrice), Double.valueOf(0.0d)) && h.d(Double.valueOf(shareTip.shareInfo.originalPrice), Double.valueOf(shareTip.shareInfo.price));
            if (!d && !z) {
                this.k.setVisibility(8);
            } else {
                this.k.setVisibility(0);
                this.l.setVisibility(d ? 0 : 8);
                this.l.setText(String.format(com.meituan.android.singleton.b.a.getString(R.string.takeout_goods_detail_price), h.a(shareTip.shareInfo.price)));
                this.m.setVisibility(z ? 0 : 8);
                this.m.setText(String.format(com.meituan.android.singleton.b.a.getString(R.string.takeout_goods_detail_price), h.a(shareTip.shareInfo.originalPrice)));
                this.m.getPaint().setFlags(17);
            }
            this.n.setVisibility(TextUtils.isEmpty(shareTip.shareInfo.subTitle) ? 8 : 0);
            this.n.setText(shareTip.shareInfo.subTitle);
        }
    }
}
