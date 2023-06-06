package com.sankuai.waimai.store.msi.view.shoprest;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.newwidgets.RoundedFrameLayout;
import com.sankuai.waimai.store.newwidgets.flowlayout.FlowLayout;
import com.sankuai.waimai.store.platform.domain.core.poi.ShippingTimeInfo;
import com.sankuai.waimai.store.poilist.view.sub.f;
import com.sankuai.waimai.store.repository.model.PoiVerticality;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.view.DeliverView;
import com.sankuai.waimai.store.view.LiveView;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.poilist.view.c {
    public static ChangeQuickRedirect a;
    protected PoiVerticality A;
    protected int B;
    public RelativeLayout b;
    public ImageView c;
    public RoundedFrameLayout d;
    public ImageView e;
    public TextView f;
    public ImageView g;
    public LiveView h;
    public ImageView i;
    public ViewGroup j;
    public TextView k;
    public ViewStub l;
    public View m;
    protected DeliverView n;
    protected TextView o;
    protected ViewGroup p;
    protected ImageView q;
    protected TextView r;
    protected ImageView s;
    protected ViewGroup t;
    protected TextView u;
    protected TextView v;
    protected FlowLayout w;
    protected com.sankuai.waimai.store.poilist.adapter.b x;
    protected f y;
    protected com.sankuai.waimai.store.param.a z;

    public a(@NonNull Context context, @Nullable com.sankuai.waimai.store.param.a aVar) {
        super(context);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cd49d0e39ea119db003b5349f2b7f32", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cd49d0e39ea119db003b5349f2b7f32");
        } else {
            this.z = null;
        }
    }

    @Override // com.sankuai.waimai.store.poilist.view.c, com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8330d276de2ff9be5159232095bdc3a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8330d276de2ff9be5159232095bdc3a3");
        } else {
            super.onViewCreated();
        }
    }

    @Override // com.sankuai.waimai.store.poilist.view.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d426518ea0d7f9da5b444dc71e803a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d426518ea0d7f9da5b444dc71e803a0");
            return;
        }
        super.a();
        this.b = (RelativeLayout) findView(R.id.rl_poi_list_item_container);
        this.c = (ImageView) findView(R.id.img_special_bg_icon);
        this.d = (RoundedFrameLayout) findView(R.id.rfl_image_container);
        this.e = (ImageView) findView(R.id.img_poi_image);
        this.f = (TextView) findView(R.id.txt_poiList_adapter_bottom_middle_2);
        this.g = (ImageView) findView(R.id.iv_poi_story_icon);
        this.h = (LiveView) findView(R.id.poi_live_label_view);
        this.i = (ImageView) findView(R.id.icon_poi_promotion_label);
        this.k = (TextView) findView(R.id.txt_mt_delivery_time_info);
        this.m = findView(R.id.txt_poiList_adapter_bottom_left_line_2);
        this.j = (ViewGroup) findView(R.id.layout_bottom_activities_container);
        this.p = (ViewGroup) findView(R.id.poi_activity_title_layout);
        this.q = (ImageView) findView(R.id.poi_activity_title_icon);
        this.r = (TextView) findView(R.id.poi_activity_text);
        this.w = (FlowLayout) findView(R.id.layout_activities_recommend);
        this.l = (ViewStub) findView(R.id.wx_binding);
        this.s = (ImageView) findView(R.id.iv_rank_star);
        this.t = (ViewGroup) findView(R.id.ll_pre_order_container);
        this.u = (TextView) findView(R.id.txt_poiList_pre_order);
        this.v = (TextView) findView(R.id.txt_poiList_pre_order_desc);
        this.y = new f(new d(this.z));
        this.n = (DeliverView) findView(R.id.deliver_view);
        this.o = (TextView) findView(R.id.txt_nearby_poi_deliver_distance);
    }

    @Override // com.sankuai.waimai.store.poilist.view.c, com.sankuai.waimai.store.poilist.view.b
    public final void a(PoiVerticality poiVerticality, int i) {
        boolean z;
        boolean z2;
        Object[] objArr = {poiVerticality, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67b0e340ab0da6e1c3157ef064fcfa61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67b0e340ab0da6e1c3157ef064fcfa61");
            return;
        }
        this.A = poiVerticality;
        this.B = i;
        Object[] objArr2 = {poiVerticality, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2495c7551479e2018b8948a6f5b569c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2495c7551479e2018b8948a6f5b569c4");
        } else if (poiVerticality != null) {
            Object[] objArr3 = {poiVerticality};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "af81d76aba42846fa173625f8f9baf01", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "af81d76aba42846fa173625f8f9baf01");
            } else {
                b.C0608b a2 = m.a(poiVerticality.picUrl, this.ar.p, ImageQualityUtil.b());
                a2.j = R.drawable.wm_sc_common_loading_large;
                a2.i = R.drawable.wm_sc_common_loading_large;
                a2.a(this.e);
            }
            Object[] objArr4 = {poiVerticality};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4bc1e75aba8dd70df437d6caa84beeb1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4bc1e75aba8dd70df437d6caa84beeb1");
            } else if (t.a(poiVerticality.newTopPic)) {
                u.c(this.c);
            } else {
                u.a(this.c);
                m.d(poiVerticality.newTopPic, this.ar.q).a(this.c);
            }
            Object[] objArr5 = {poiVerticality};
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "941352fa5eb30c069486d88c087b06aa", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "941352fa5eb30c069486d88c087b06aa");
            } else if (!p.a(this.i)) {
                if (TextUtils.isEmpty(poiVerticality.promotion760ImageUrl)) {
                    u.c(this.i);
                } else {
                    u.a(this.i);
                    m.b(poiVerticality.promotion760ImageUrl).a(this.i);
                }
            }
            Object[] objArr6 = {poiVerticality};
            ChangeQuickRedirect changeQuickRedirect6 = a;
            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "a127712630d1c89a712dd5e6dcc41fc4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "a127712630d1c89a712dd5e6dcc41fc4");
            } else if (this.h != null) {
                if (!d()) {
                    this.h.a(poiVerticality.liveBaseInfo);
                } else {
                    this.h.setVisibility(8);
                }
            }
            Object[] objArr7 = {poiVerticality};
            ChangeQuickRedirect changeQuickRedirect7 = a;
            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "305b9dad1807740e4a327ca04229fe59", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "305b9dad1807740e4a327ca04229fe59");
            } else {
                this.J.setText(poiVerticality.name);
                Object[] objArr8 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect8 = a;
                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "8407df62df64feacb3b90f5dc8f43514", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "8407df62df64feacb3b90f5dc8f43514")).booleanValue();
                } else {
                    if (!d()) {
                        Object[] objArr9 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect9 = a;
                        if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "3c25b8bee2b92f8ff38b24da89674fff", RobustBitConfig.DEFAULT_VALUE)) {
                            z2 = ((Boolean) PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "3c25b8bee2b92f8ff38b24da89674fff")).booleanValue();
                        } else {
                            z2 = this.h != null && this.h.getVisibility() == 0;
                        }
                        if (!z2) {
                            z = true;
                        }
                    }
                    z = false;
                }
                if (z && !TextUtils.isEmpty(poiVerticality.storyIcon)) {
                    this.g.setVisibility(0);
                    a(this.g, poiVerticality.storyIcon, this.ar.o);
                } else {
                    this.g.setVisibility(8);
                }
            }
            c(poiVerticality);
            a(poiVerticality);
            Object[] objArr10 = {poiVerticality};
            ChangeQuickRedirect changeQuickRedirect10 = a;
            if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "a884d5ea03b87efba6ed6645e18aff98", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "a884d5ea03b87efba6ed6645e18aff98");
            } else if (com.sankuai.shangou.stone.util.a.b(poiVerticality.specialLabelInfo)) {
                u.c(this.w);
            } else {
                u.a(this.w);
                if (this.x == null) {
                    this.x = new com.sankuai.waimai.store.poilist.adapter.b(new com.sankuai.waimai.store.poilist.adapter.a() { // from class: com.sankuai.waimai.store.msi.view.shoprest.a.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.store.poilist.adapter.a
                        public final void a(Map<String, Object> map) {
                            Object[] objArr11 = {map};
                            ChangeQuickRedirect changeQuickRedirect11 = a;
                            if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "65c452062708998b648663732abfff63", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "65c452062708998b648663732abfff63");
                            } else {
                                com.sankuai.waimai.store.manager.judas.b.a(a.this.getContext(), "b_waimai_sg_448nouzr_mc").a("cat_id", Long.valueOf(a.this.z.c)).a("poi_id", Long.valueOf(a.this.A.id)).a("poi_index", Integer.valueOf(a.this.B)).a("stid", a.this.z.c()).b(map).a();
                            }
                        }
                    });
                    this.w.setAdapter(this.x);
                    this.w.setMaxLines(1);
                }
                this.x.a(poiVerticality.specialLabelInfo);
            }
            Object[] objArr11 = {poiVerticality};
            ChangeQuickRedirect changeQuickRedirect11 = a;
            if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "58f54154b0d79a43517feee7acbc10de", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "58f54154b0d79a43517feee7acbc10de");
            } else {
                PoiVerticality.GroupPurchaseLabel groupPurchaseLabel = poiVerticality.groupPurchaseLabel;
                getContext();
                ViewGroup.LayoutParams layoutParams = this.ae.getLayoutParams();
                if ((poiVerticality == null || poiVerticality.groupPurchaseLabel == null || poiVerticality.groupPurchaseLabel.type != 8) ? false : true) {
                    u.a(this.p);
                    layoutParams.height = this.ar.m;
                    u.a(this.r, groupPurchaseLabel.text);
                    this.r.setTextColor(com.sankuai.shangou.stone.util.d.a(groupPurchaseLabel.textColor, this.ar.r));
                    m.b(groupPurchaseLabel.icon).a(this.q);
                    a(com.sankuai.shangou.stone.util.d.a(groupPurchaseLabel.arrowColor, this.ar.r));
                    this.j.setBackground(new e.a().a(this.ar.f).c(com.sankuai.shangou.stone.util.d.a(groupPurchaseLabel.bgColor, this.ar.s)).a());
                    this.j.setPadding(this.ar.g, this.j.getPaddingTop(), this.j.getPaddingRight(), this.ar.g);
                    ViewGroup.LayoutParams layoutParams2 = this.j.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = this.ar.h;
                    }
                } else {
                    u.c(this.p);
                    layoutParams.height = this.ar.i;
                    a(this.ar.t);
                    this.j.setBackground(null);
                    this.j.setPadding(0, this.j.getPaddingTop(), this.j.getPaddingRight(), 0);
                    ViewGroup.LayoutParams layoutParams3 = this.j.getLayoutParams();
                    if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                        ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = this.ar.e;
                    }
                }
                this.ae.setLayoutParams(layoutParams);
            }
            l(poiVerticality);
            d(poiVerticality);
            m(poiVerticality);
            h(poiVerticality);
            i(poiVerticality);
            Object[] objArr12 = {poiVerticality};
            ChangeQuickRedirect changeQuickRedirect12 = a;
            if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "d1c05469b4fdb79f05e8298ea6dda07b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "d1c05469b4fdb79f05e8298ea6dda07b");
            } else {
                this.K.setText(poiVerticality.minPriceTip);
                a(this.K, poiVerticality.isBold(4));
                this.L.setText(poiVerticality.shippingFeeTip);
                a(this.L, poiVerticality.isBold(6));
                this.k.setText(poiVerticality.deliveryTimeTip);
                a(this.k, poiVerticality.isBold(2));
                u.a(this.f, poiVerticality.originShippingFeeTip);
                if (TextUtils.isEmpty(poiVerticality.originShippingFeeTip)) {
                    u.a((View) this.f, 8);
                } else {
                    u.a((View) this.f, 0);
                }
                if (TextUtils.isEmpty(poiVerticality.deliveryTimeTip) || TextUtils.isEmpty(poiVerticality.distance)) {
                    this.m.setVisibility(4);
                } else {
                    this.m.setVisibility(0);
                }
            }
            n(poiVerticality);
            k(poiVerticality);
            j(poiVerticality);
            b(poiVerticality);
            g(poiVerticality);
            o(poiVerticality);
        }
        super.a(poiVerticality, i);
        Object[] objArr13 = {poiVerticality};
        ChangeQuickRedirect changeQuickRedirect13 = a;
        if (PatchProxy.isSupport(objArr13, this, changeQuickRedirect13, false, "15f59a79e5f294ec891ad95960b714d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr13, this, changeQuickRedirect13, false, "15f59a79e5f294ec891ad95960b714d1");
        } else if (poiVerticality == null) {
        } else {
            this.y.a(poiVerticality.poiRecommend, getView(), this.W);
        }
    }

    @Override // com.sankuai.waimai.store.poilist.view.c
    public final void a(PoiVerticality poiVerticality) {
        Object[] objArr = {poiVerticality};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fadac9c00672bcd49c93e3bd974c2b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fadac9c00672bcd49c93e3bd974c2b7");
            return;
        }
        super.a(poiVerticality);
        a(this.G, poiVerticality.isBold(1));
    }

    @Override // com.sankuai.waimai.store.poilist.view.c
    public final void b(PoiVerticality poiVerticality) {
        Object[] objArr = {poiVerticality};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de8e82dbf0f7d5215d1e888d1dd8de8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de8e82dbf0f7d5215d1e888d1dd8de8a");
            return;
        }
        super.b(poiVerticality);
        a(this.H, poiVerticality.isBold(5));
    }

    @Override // com.sankuai.waimai.store.poilist.view.c
    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8300ab8269e080566dfce360132cfa36", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8300ab8269e080566dfce360132cfa36")).intValue() : this.w.getFirstLineCount();
    }

    @Override // com.sankuai.waimai.store.poilist.view.c
    public final void c(PoiVerticality poiVerticality) {
        Object[] objArr = {poiVerticality};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ba2ffb40a4a974c192404b4d459c26e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ba2ffb40a4a974c192404b4d459c26e");
            return;
        }
        super.c(poiVerticality);
        if (this.N && poiVerticality.wmPoiScore > 0.0d) {
            this.s.setImageResource(R.drawable.wm_sc_poi_star);
        } else {
            this.s.setImageResource(R.drawable.wm_sc_poi_star_gray);
        }
    }

    private boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "412288b055f3459a11ba7b3a2fa02bb9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "412288b055f3459a11ba7b3a2fa02bb9")).booleanValue() : this.i != null && this.i.getVisibility() == 0;
    }

    @Override // com.sankuai.waimai.store.poilist.view.c
    public final void d(PoiVerticality poiVerticality) {
        ShippingTimeInfo shippingTimeInfo;
        Object[] objArr = {poiVerticality};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b4aba0f5e8512ac3fa640f517465b07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b4aba0f5e8512ac3fa640f517465b07");
            return;
        }
        super.d(poiVerticality);
        u.c(this.t);
        if (poiVerticality == null || poiVerticality.status == 3 || (shippingTimeInfo = poiVerticality.shippingTimeInfo) == null || TextUtils.isEmpty(shippingTimeInfo.statusContent) || TextUtils.isEmpty(shippingTimeInfo.descContent) || this.t == null) {
            return;
        }
        u.c(this.E);
        this.u.setText(shippingTimeInfo.statusContent);
        this.v.setText(shippingTimeInfo.descContent);
        if (shippingTimeInfo.reservationStatus == 0) {
            u.a(this.t);
            this.u.setBackground(this.ar.a);
            this.v.setBackground(this.ar.d);
            this.v.setTextColor(this.ar.u);
        } else if (shippingTimeInfo.reservationStatus == 1) {
            u.a(this.t);
            this.u.setBackground(this.ar.c);
            this.v.setBackground(this.ar.b);
            this.v.setTextColor(this.ar.v);
        } else if (shippingTimeInfo.reservationStatus == 2) {
            u.a(this.t);
            this.u.setBackground(new e.a().a(this.ar.f, 0.0f, 0.0f, this.ar.f).a(GradientDrawable.Orientation.BL_TR, new int[]{this.ar.w, this.ar.x}).a());
            this.v.setBackground(new e.a().a(0.0f, this.ar.f, this.ar.f, 0.0f).a(this.ar.y).b(1).a());
            this.v.setTextColor(this.ar.y);
        }
    }

    @Override // com.sankuai.waimai.store.poilist.view.c
    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb9759988f59df05cd4d28ccafe5bf5d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb9759988f59df05cd4d28ccafe5bf5d");
        }
        String c = super.c();
        Object[] objArr2 = {c};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f94db2b469e70db89626b9983a44e8c9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f94db2b469e70db89626b9983a44e8c9");
        }
        if (com.sankuai.waimai.store.poilist.view.a.f(this.A)) {
            String str = this.A.groupPurchaseLabel.text;
            if (TextUtils.isEmpty(str)) {
                return c;
            }
            if (TextUtils.isEmpty(c)) {
                return str;
            }
            return c + ";" + str;
        }
        return c;
    }

    private void a(TextView textView, boolean z) {
        Object[] objArr = {textView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9966ab853aff01d2f9f2ede4afeaeb1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9966ab853aff01d2f9f2ede4afeaeb1e");
            return;
        }
        textView.setTextColor(com.sankuai.waimai.store.util.b.b(textView.getContext(), z ? R.color.wm_st_common_recommend_title : R.color.wm_sg_color_575859));
        textView.getPaint().setFakeBoldText(z);
    }
}
