package com.sankuai.waimai.store.search.template.poicate;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.support.v4.internal.view.SupportMenu;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.foundation.utils.ColorUtils;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.sankuai.waimai.platform.utils.sharedpreference.PlatformSPKeys;
import com.sankuai.waimai.platform.widget.tag.virtualtag.TagCanvasView;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.poi.subscribe.PoiSubscribeResponse;
import com.sankuai.waimai.store.poi.subscribe.a;
import com.sankuai.waimai.store.search.common.view.PoiStateView;
import com.sankuai.waimai.store.search.model.PoiEntity;
import com.sankuai.waimai.store.search.model.ProductItemEntity;
import com.sankuai.waimai.store.search.model.RecommendSummary;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.search.ui.result.monitor.SearchMachMonitor;
import com.sankuai.waimai.store.search.util.c;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.view.DeliverView;
import com.sankuai.waimai.store.view.LiveView;
import com.sankuai.waimai.store.view.SCSingleLineFlowLayout;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private ImageView A;
    private SCSingleLineFlowLayout B;
    private TextView C;
    private LinearLayout D;
    private TagCanvasView E;
    private ImageView F;
    private LinearLayout G;
    private final List<View> H;
    private RecyclerView I;
    private c J;
    private LinearLayoutManager K;
    private View L;
    private TextView M;
    private View N;
    private View O;
    private View P;
    private LiveView Q;
    private final DeliverView R;
    private LinearLayout S;
    private final DeliverView T;
    private TextView U;
    private ImageView V;
    private ImageView W;
    private int X;
    private int Y;
    Context b;
    SearchShareData c;
    ImageView d;
    private View e;
    private int f;
    private com.sankuai.waimai.store.search.util.c g;
    private ViewGroup h;
    private ImageView i;
    private ImageView j;
    private TextView k;
    private ImageView l;
    private ImageView m;
    private TextView n;
    private TextView o;
    private TextView p;
    private PoiStateView q;
    private TextView r;
    private TextView s;
    private TextView t;
    private TextView u;
    private LinearLayout v;
    private TextView w;
    private TextView x;
    private TextView y;
    private ImageView z;

    public d(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "741109be5f92c975af40b4550b72615a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "741109be5f92c975af40b4550b72615a");
            return;
        }
        this.H = new ArrayList();
        this.e = view;
        this.f = i;
        this.b = view.getContext();
        this.c = SearchShareData.a(this.b);
        this.g = new com.sankuai.waimai.store.search.util.c(view.getContext());
        this.h = (ViewGroup) view.findViewById(R.id.poi_cate_layout_bottom);
        this.i = (ImageView) view.findViewById(R.id.poi_cate_poi_image);
        this.j = (ImageView) view.findViewById(R.id.poi_cate_ad_icon);
        this.k = (TextView) view.findViewById(R.id.poi_cate_conflict_text);
        this.l = (ImageView) view.findViewById(R.id.poi_cate_promotion_icon);
        this.m = (ImageView) view.findViewById(R.id.poi_cate_brand_icon);
        this.d = (ImageView) view.findViewById(R.id.poi_cate_promotion_label);
        this.n = (TextView) view.findViewById(R.id.poi_cate_poi_name);
        this.o = (TextView) view.findViewById(R.id.poi_cate_arrival_remind);
        this.p = (TextView) view.findViewById(R.id.poi_cate_subscribe);
        this.q = (PoiStateView) view.findViewById(R.id.poi_cate_status);
        this.r = (TextView) view.findViewById(R.id.poi_cate_score);
        this.s = (TextView) view.findViewById(R.id.poi_cate_month_sales);
        this.t = (TextView) view.findViewById(R.id.poi_cate_delivery_time);
        this.u = (TextView) view.findViewById(R.id.poi_cate_distance);
        this.v = (LinearLayout) view.findViewById(R.id.poi_cate_layout_for_delivery_info);
        this.w = (TextView) view.findViewById(R.id.poi_cate_shipping_min_price);
        this.x = (TextView) view.findViewById(R.id.poi_cate_shipping_fee);
        this.y = (TextView) view.findViewById(R.id.poi_cate_origin_shipping_fee);
        this.y.getPaint().setStrikeThruText(true);
        this.z = (ImageView) view.findViewById(R.id.poi_cate_insurance_icon);
        this.A = (ImageView) view.findViewById(R.id.poi_cate_delivery_icon);
        this.B = (SCSingleLineFlowLayout) view.findViewById(R.id.poi_cate_recommend_summary);
        this.C = (TextView) view.findViewById(R.id.poi_cate_product_for_show_type_tag);
        this.D = (LinearLayout) view.findViewById(R.id.search_common_dynamic_tag_container);
        this.E = (TagCanvasView) view.findViewById(R.id.search_common_dynamic_tag_view);
        this.F = (ImageView) view.findViewById(R.id.search_common_dynamic_tag_arrow);
        this.G = (LinearLayout) view.findViewById(R.id.poi_cate_product_for_poi_template);
        this.I = (RecyclerView) view.findViewById(R.id.poi_cate_product_for_cate_template);
        this.L = view.findViewById(R.id.poi_cate_too_far_divider);
        this.M = (TextView) view.findViewById(R.id.poi_cate_too_far_text);
        this.N = view.findViewById(R.id.poi_cate_gray_cover_global);
        this.O = view.findViewById(R.id.poi_cate_gray_cover_local_position_one);
        this.P = view.findViewById(R.id.poi_cate_gray_cover_local_position_two);
        this.Q = (LiveView) view.findViewById(R.id.search_spu_live_icon);
        this.R = (DeliverView) view.findViewById(R.id.poi_cate_deliver_view);
        this.T = (DeliverView) view.findViewById(R.id.poi_cate_deliver_view2);
        this.U = (TextView) view.findViewById(R.id.poi_cate_distance2);
        this.S = (LinearLayout) view.findViewById(R.id.ll_delivery_time_distance);
        this.V = (ImageView) view.findViewById(R.id.poi_cate_insurance_icon2);
        this.W = (ImageView) view.findViewById(R.id.poi_cate_delivery_icon2);
        this.X = this.b.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_6);
        this.Y = this.b.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_12);
    }

    public final void a(PoiEntity poiEntity) {
        Object[] objArr = {poiEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26f22813bbdbe110d423f525b83f0395", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26f22813bbdbe110d423f525b83f0395");
        } else if (poiEntity == null) {
        } else {
            d(poiEntity);
            e(poiEntity);
            f(poiEntity);
            g(poiEntity);
            h(poiEntity);
            m(poiEntity);
            n(poiEntity);
            o(poiEntity);
            p(poiEntity);
            q(poiEntity);
            r(poiEntity);
            s(poiEntity);
            t(poiEntity);
            u(poiEntity);
            y(poiEntity);
            z(poiEntity);
            A(poiEntity);
            F(poiEntity);
            b(poiEntity);
            a();
        }
    }

    private void b(PoiEntity poiEntity) {
        Object[] objArr = {poiEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2a76574721e12649c6c4432a6cd2ff0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2a76574721e12649c6c4432a6cd2ff0");
        } else {
            this.Q.a(poiEntity.getLiveBaseInfo());
        }
    }

    private void c(PoiEntity poiEntity) {
        Object[] objArr = {poiEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5587fba1d2f8cacbd083aa64a0eaf4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5587fba1d2f8cacbd083aa64a0eaf4b");
        } else if (this.R == null || poiEntity == null) {
        } else {
            if (TextUtils.equals(this.c.bk, "A") || TextUtils.equals(this.c.bk, ErrorCode.ERROR_TYPE_B)) {
                this.R.setVisibility(8);
                this.S.setVisibility(8);
                this.T.setVisibility(0);
                this.U.setVisibility(0);
                this.T.setDeliverTimeImageUrl(poiEntity.deliverTypeInfo == null ? null : poiEntity.deliverTypeInfo.deliveryTimeIcon);
                com.sankuai.waimai.store.search.util.b.a(this.T, poiEntity.deliverTypeInfo);
            } else {
                this.R.setVisibility(0);
                this.S.setVisibility(0);
                this.T.setVisibility(8);
                this.U.setVisibility(8);
                com.sankuai.waimai.store.search.util.b.a(this.R, poiEntity.deliverTypeInfo);
            }
            com.sankuai.waimai.store.search.util.b.a(poiEntity.deliverTypeInfo, this.A);
        }
    }

    private void d(final PoiEntity poiEntity) {
        Object[] objArr = {poiEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff1c51192e739af72f6b547f56cf4e63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff1c51192e739af72f6b547f56cf4e63");
            return;
        }
        if (!poiEntity.isExposed) {
            poiEntity.isExposed = true;
            poiEntity.nodePoiCate.a(this.b);
            com.sankuai.waimai.store.search.util.e.a(this.c, poiEntity);
            if (this.c.ax && !this.c.aG) {
                com.sankuai.waimai.store.util.monitor.c.a(SearchMachMonitor.NativeReport, "", "poi");
                this.c.aG = true;
            }
        }
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.template.poicate.d.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "40c42029c06feeda8074dcc01a55e55c", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "40c42029c06feeda8074dcc01a55e55c");
                    return;
                }
                poiEntity.nodePoiCate.b(d.this.b);
                com.sankuai.waimai.store.search.util.e.b(d.this.c, poiEntity);
                com.sankuai.waimai.store.router.d.a(d.this.b, poiEntity.restaurantScheme);
            }
        });
    }

    private void e(PoiEntity poiEntity) {
        Object[] objArr = {poiEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47b3e0bffd8b9ad84bcba75bf041e140", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47b3e0bffd8b9ad84bcba75bf041e140");
        } else if (poiEntity.isRecommendResult() || poiEntity.productShowType == 3 || this.c.D != 4) {
        } else {
            poiEntity.productShowType = com.sankuai.waimai.store.search.data.g.a;
        }
    }

    private void f(PoiEntity poiEntity) {
        Object[] objArr = {poiEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19557a4c34d9f6d96f23a78c0f5e0b6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19557a4c34d9f6d96f23a78c0f5e0b6b");
            return;
        }
        if (TextUtils.equals(this.c.bk, "A")) {
            ViewGroup.LayoutParams layoutParams = this.i.getLayoutParams();
            layoutParams.width = layoutParams.height;
            this.i.setLayoutParams(layoutParams);
            this.i.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            ViewGroup.LayoutParams layoutParams2 = this.i.getLayoutParams();
            layoutParams2.width = com.sankuai.shangou.stone.util.h.a(this.b, 70.0f);
            layoutParams2.height = com.sankuai.shangou.stone.util.h.a(this.b, 55.0f);
            this.i.setLayoutParams(layoutParams2);
            this.i.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        if (TextUtils.isEmpty(poiEntity.picUrl)) {
            this.i.setImageResource(R.drawable.wm_sc_nox_search_feed_default_img);
            return;
        }
        b.C0608b b = m.b(poiEntity.picUrl);
        b.i = R.drawable.wm_sc_nox_search_feed_default_img;
        b.j = R.drawable.wm_sc_nox_search_feed_default_img;
        b.a(this.i);
    }

    private void g(PoiEntity poiEntity) {
        Object[] objArr = {poiEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b9e9147266550d9f8726b4d2010e295", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b9e9147266550d9f8726b4d2010e295");
        } else if (!poiEntity.isShowAdIcon()) {
            this.j.setVisibility(8);
        } else {
            a(this.j, com.sankuai.waimai.platform.utils.sharedpreference.a.a().b((com.sankuai.waimai.foundation.utils.e) PlatformSPKeys.key_poi_ad_icon_url, ""));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
        if (r1.equals("PREFIX_CLOSING") == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void h(com.sankuai.waimai.store.search.model.PoiEntity r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.store.search.template.poicate.d.a
            java.lang.String r11 = "cc3d2c5c6ec8382d911429905318a79a"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            return
        L1b:
            android.widget.TextView r1 = r12.k
            r2 = 8
            r1.setVisibility(r2)
            android.widget.TextView r1 = r12.o
            r1.setVisibility(r2)
            java.lang.String r1 = r13.currentConflictTag
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L30
            return
        L30:
            android.widget.TextView r1 = r12.k
            r1.setVisibility(r9)
            java.lang.String r1 = r13.currentConflictTag
            r3 = -1
            int r4 = r1.hashCode()
            r5 = -1574985930(0xffffffffa21f9f36, float:-2.1632804E-18)
            if (r4 == r5) goto L6e
            r5 = -519167844(0xffffffffe10e209c, float:-1.6386171E20)
            if (r4 == r5) goto L64
            r5 = -350738521(0xffffffffeb1827a7, float:-1.8394398E26)
            if (r4 == r5) goto L5a
            r5 = 1344963560(0x502a83e8, float:1.14430853E10)
            if (r4 == r5) goto L51
            goto L78
        L51:
            java.lang.String r4 = "PREFIX_CLOSING"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L78
            goto L79
        L5a:
            java.lang.String r0 = "POI_STATUS"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L78
            r0 = 2
            goto L79
        L64:
            java.lang.String r0 = "RECOMMEND"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L78
            r0 = 3
            goto L79
        L6e:
            java.lang.String r0 = "SALE_OUT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L78
            r0 = 0
            goto L79
        L78:
            r0 = -1
        L79:
            switch(r0) {
                case 0: goto L8e;
                case 1: goto L8a;
                case 2: goto L86;
                case 3: goto L82;
                default: goto L7c;
            }
        L7c:
            android.widget.TextView r13 = r12.k
            r13.setVisibility(r2)
            return
        L82:
            r12.l(r13)
            return
        L86:
            r12.k(r13)
            return
        L8a:
            r12.j(r13)
            return
        L8e:
            r12.i(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.search.template.poicate.d.h(com.sankuai.waimai.store.search.model.PoiEntity):void");
    }

    private void i(PoiEntity poiEntity) {
        Object[] objArr = {poiEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c3ae46c1115538542891c646315ae33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c3ae46c1115538542891c646315ae33");
            return;
        }
        String str = poiEntity.saleOutView == null ? "" : poiEntity.saleOutView.saleOutText;
        String str2 = poiEntity.saleOutView == null ? "" : poiEntity.saleOutView.arrivalReminderText;
        u.a(this.k, str);
        this.k.setTextColor(this.b.getResources().getColor(R.color.wm_sc_nox_search_white));
        this.k.setBackgroundColor(this.b.getResources().getColor(R.color.wm_sc_nox_search_color_80000000));
        u.a(this.o, str2);
    }

    private void j(PoiEntity poiEntity) {
        Object[] objArr = {poiEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09f89823493e5a7a4bb9a091ed39740e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09f89823493e5a7a4bb9a091ed39740e");
            return;
        }
        u.a(this.k, poiEntity.closeTips);
        this.k.setTextColor(this.b.getResources().getColor(R.color.wm_sc_nox_search_white));
        this.k.setBackgroundColor(this.b.getResources().getColor(R.color.wm_sc_nox_search_item_status_close));
    }

    private void k(PoiEntity poiEntity) {
        Object[] objArr = {poiEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5442afa823e1a74729e3673b058add05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5442afa823e1a74729e3673b058add05");
        } else if (poiEntity.status == 2) {
            u.a(this.k, poiEntity.statusDesc);
            this.k.setTextColor(this.b.getResources().getColor(R.color.wm_sc_nox_search_white));
            this.k.setBackgroundColor(this.b.getResources().getColor(R.color.wm_sc_nox_search_item_status_busy));
        } else {
            this.k.setVisibility(8);
        }
    }

    private void l(PoiEntity poiEntity) {
        Object[] objArr = {poiEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f29deca36ae5d638d4f46b4d4a7731ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f29deca36ae5d638d4f46b4d4a7731ed");
            return;
        }
        RecommendSummary recommendSummary = poiEntity.recommendSummary;
        if (recommendSummary == null || com.sankuai.shangou.stone.util.a.b(recommendSummary.recommendTags)) {
            this.k.setVisibility(8);
            return;
        }
        RecommendSummary.RecommendTag recommendTag = null;
        int size = recommendSummary.recommendTags.size();
        int i = 0;
        while (true) {
            if (i < size) {
                RecommendSummary.RecommendTag recommendTag2 = recommendSummary.recommendTags.get(i);
                if (recommendTag2 != null && recommendTag2.location == 1) {
                    recommendTag = recommendTag2;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        if (recommendTag != null) {
            this.k.setVisibility(0);
            this.k.setText(recommendTag.text);
            this.k.setTextColor(this.b.getResources().getColor(R.color.wm_sc_nox_search_white));
            this.k.setBackgroundColor(this.b.getResources().getColor(R.color.wm_sc_nox_search_color_80000000));
            return;
        }
        this.k.setVisibility(8);
    }

    private void m(PoiEntity poiEntity) {
        Object[] objArr = {poiEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a737124f3550c600224f88c41815d81e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a737124f3550c600224f88c41815d81e");
        } else if (this.k.getVisibility() == 0 || this.j.getVisibility() == 0) {
            this.l.setVisibility(8);
        } else {
            a(this.l, poiEntity.promotionPicUrl);
        }
    }

    private void n(PoiEntity poiEntity) {
        Object[] objArr = {poiEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c52593fef3cabc166849bbcda12b856", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c52593fef3cabc166849bbcda12b856");
        } else {
            a(this.m, poiEntity.poiTypeIcon);
        }
    }

    private void o(PoiEntity poiEntity) {
        Object[] objArr = {poiEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68ffded8ae6b490c085c5910fa4dbc3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68ffded8ae6b490c085c5910fa4dbc3e");
        } else if (poiEntity.labelOnPoiName == null || poiEntity.labelOnPoiName.type != 1 || TextUtils.isEmpty(poiEntity.labelOnPoiName.labelUrl)) {
            this.d.setVisibility(8);
        } else {
            this.d.setVisibility(0);
            m.d(poiEntity.labelOnPoiName.labelUrl, this.b.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_16)).a(new b.d() { // from class: com.sankuai.waimai.store.search.template.poicate.d.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.d
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7b390f3d873c54335ee12a065516572c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7b390f3d873c54335ee12a065516572c");
                    } else {
                        d.this.d.setVisibility(0);
                    }
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.d
                public final void a(int i, Exception exc) {
                    Object[] objArr2 = {Integer.valueOf(i), exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "15bd94796ca6b3e33e8a0f123f55f926", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "15bd94796ca6b3e33e8a0f123f55f926");
                    } else {
                        d.this.d.setVisibility(8);
                    }
                }
            }).a(this.d);
        }
    }

    private void p(PoiEntity poiEntity) {
        Object[] objArr = {poiEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08d15e22c0e2f53eb6215be0930740d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08d15e22c0e2f53eb6215be0930740d3");
        } else {
            this.n.setText(poiEntity.name);
        }
    }

    private void q(final PoiEntity poiEntity) {
        Object[] objArr = {poiEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "149e87867fee919f6c594c9b197b855b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "149e87867fee919f6c594c9b197b855b");
            return;
        }
        switch (poiEntity.subscribe) {
            case 1:
                this.p.setVisibility(0);
                this.p.setText(this.b.getString(R.string.wm_sg_poi_can_subscribe));
                this.p.setSelected(false);
                break;
            case 2:
                this.p.setVisibility(0);
                this.p.setText(this.b.getString(R.string.wm_sg_poi_have_subscribe));
                this.p.setSelected(true);
                break;
            default:
                this.p.setVisibility(8);
                break;
        }
        if (this.p.getVisibility() == 0 && !poiEntity.isSubscribeButtonExposed) {
            poiEntity.isSubscribeButtonExposed = true;
            poiEntity.nodeSubscribe.a(this.b);
        }
        this.p.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.template.poicate.d.3
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3c5a6422fb736bcd1ba9823e57d5c07a", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3c5a6422fb736bcd1ba9823e57d5c07a");
                } else {
                    com.sankuai.waimai.store.poi.subscribe.a.a().a((SCBaseActivity) d.this.b, new a.c(poiEntity.id) { // from class: com.sankuai.waimai.store.search.template.poicate.d.3.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.store.poi.subscribe.a.c
                        public final void c() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "edde1881298b0994269aa2d37e01ef6f", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "edde1881298b0994269aa2d37e01ef6f");
                            } else {
                                com.sankuai.waimai.store.search.common.api.net.a.a(((SCBaseActivity) d.this.b).w()).a(poiEntity.id, poiEntity.subscribe, this);
                            }
                        }

                        @Override // com.sankuai.waimai.store.poi.subscribe.a.c, com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                        public final void a(PoiSubscribeResponse poiSubscribeResponse) {
                            Object[] objArr3 = {poiSubscribeResponse};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c45d3cfaf86d515a2b72a70dd636fa4c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c45d3cfaf86d515a2b72a70dd636fa4c");
                                return;
                            }
                            super.a(poiSubscribeResponse);
                            poiEntity.nodeSubscribe.c("status", Integer.valueOf(poiSubscribeResponse.subscribe)).b(d.this.b);
                        }

                        @Override // com.sankuai.waimai.store.poi.subscribe.a.c
                        public final String d() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6cb3bc9def9d73ca68c463ea4ea7cb23", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6cb3bc9def9d73ca68c463ea4ea7cb23") : d.this.b.getString(R.string.wm_sg_poi_subscribe_error);
                        }
                    });
                }
            }
        });
    }

    private void r(PoiEntity poiEntity) {
        Object[] objArr = {poiEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b081f0717878f8b41eb5afcb33028dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b081f0717878f8b41eb5afcb33028dd");
            return;
        }
        String shippingState = poiEntity.getShippingState();
        String shippingDesc = poiEntity.getShippingDesc();
        int reservationStatus = poiEntity.getReservationStatus();
        if (!TextUtils.isEmpty(shippingState) && !TextUtils.isEmpty(shippingDesc) && reservationStatus == 0) {
            this.q.setVisibility(0);
            this.q.a(shippingState, shippingDesc, this.b.getResources().getColor(R.color.wm_sc_nox_search_item_status_reservation));
        } else if (!TextUtils.isEmpty(shippingState) && !TextUtils.isEmpty(shippingDesc) && reservationStatus == 1) {
            this.q.setVisibility(0);
            this.q.a(shippingState, shippingDesc, this.b.getResources().getColor(R.color.wm_sc_nox_search_item_status_reservation_only));
        } else if (poiEntity.status == 3) {
            this.q.setVisibility(0);
            this.q.a(TextUtils.isEmpty(poiEntity.statusDesc) ? this.b.getString(R.string.wm_sc_nox_search_at_rest) : poiEntity.statusDesc, poiEntity.statusSubDesc, this.b.getResources().getColor(R.color.wm_sc_nox_search_color_575859), this.b.getResources().getColor(R.color.wm_sc_nox_search_white));
        } else {
            this.q.setVisibility(8);
        }
    }

    private void s(PoiEntity poiEntity) {
        Object[] objArr = {poiEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0591e3aeb1d0b9f521b83922bdba79a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0591e3aeb1d0b9f521b83922bdba79a8");
        } else if (com.sankuai.shangou.stone.util.i.d(Double.valueOf(poiEntity.poiScore), Double.valueOf(0.0d))) {
            this.r.setVisibility(0);
            this.r.setText(com.sankuai.shangou.stone.util.i.a(Double.valueOf(poiEntity.poiScore), 1, 1));
            this.r.setTextColor(this.b.getResources().getColor(R.color.wm_sc_nox_search_color_FFA100));
            this.r.setCompoundDrawablesWithIntrinsicBounds(this.b.getResources().getDrawable(R.drawable.wm_sc_nox_search_rating_select_style2), (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (com.sankuai.shangou.stone.util.i.a(Double.valueOf(poiEntity.poiScore), Double.valueOf(0.0d))) {
            this.r.setVisibility(0);
            this.r.setText(this.b.getResources().getString(R.string.wm_sc_search_no_score));
            this.r.setTextColor(this.b.getResources().getColor(R.color.wm_sc_nox_search_color_575859));
            this.r.setCompoundDrawablesWithIntrinsicBounds(this.b.getResources().getDrawable(R.drawable.wm_sc_nox_search_rating_unselect_style2), (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            this.r.setVisibility(8);
        }
    }

    private void t(PoiEntity poiEntity) {
        Object[] objArr = {poiEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bb992a3f98fe91a2ab9963e001e5447", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bb992a3f98fe91a2ab9963e001e5447");
        } else {
            u.a(this.s, poiEntity.monthSalesTip);
        }
    }

    private void u(PoiEntity poiEntity) {
        Object[] objArr = {poiEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b92b7e72b60f03515d717ebc3ba3a79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b92b7e72b60f03515d717ebc3ba3a79");
            return;
        }
        if (TextUtils.equals(this.c.bk, "A") || TextUtils.equals(this.c.bk, ErrorCode.ERROR_TYPE_B)) {
            this.t.setVisibility(8);
        } else {
            u.a(this.t, poiEntity.deliveryTimeTip);
        }
        if (TextUtils.equals(this.c.bk, "A") || TextUtils.equals(this.c.bk, ErrorCode.ERROR_TYPE_B)) {
            this.U.setVisibility(0);
            this.u.setVisibility(8);
            u.a(this.U, poiEntity.poiDistance);
        } else {
            this.U.setVisibility(8);
            this.u.setVisibility(0);
            u.a(this.u, poiEntity.poiDistance);
        }
        if (poiEntity.nonLbsEntity != null && poiEntity.nonLbsEntity.nonLbsId == 4) {
            this.v.setVisibility(8);
        } else {
            this.v.setVisibility(0);
            v(poiEntity);
        }
        if (poiEntity.deliverTypeInfo != null) {
            this.v.setVisibility(0);
            v(poiEntity);
        }
        c(poiEntity);
    }

    private void v(PoiEntity poiEntity) {
        Object[] objArr = {poiEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fb5b6cc33724ab9a17f0db782734217", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fb5b6cc33724ab9a17f0db782734217");
            return;
        }
        u.a(this.w, poiEntity.minPriceTip);
        u.a(this.x, poiEntity.shippingFeeTip);
        u.a(this.y, poiEntity.originShippingFeeTip);
        w(poiEntity);
        x(poiEntity);
        a(poiEntity.shippingFeeColor);
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f958a8deab326a1cdafca63069547c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f958a8deab326a1cdafca63069547c7");
        } else if (z) {
            this.x.setTextColor(ColorUtils.a("#FF8000", (int) SupportMenu.CATEGORY_MASK));
        } else {
            this.x.setTextColor(ColorUtils.a("#575859", -16777216));
        }
    }

    private void w(PoiEntity poiEntity) {
        Object[] objArr = {poiEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e26a47e1148e14521ca4bed44248a721", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e26a47e1148e14521ca4bed44248a721");
        } else if (TextUtils.equals(this.c.bk, "A") || TextUtils.equals(this.c.bk, ErrorCode.ERROR_TYPE_B)) {
            a(this.V, poiEntity.insuranceIcon);
        } else {
            a(this.z, poiEntity.insuranceIcon);
        }
    }

    private void x(PoiEntity poiEntity) {
        Object[] objArr = {poiEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8adfec81911ffcda91282f5b4ffa4478", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8adfec81911ffcda91282f5b4ffa4478");
        } else if (poiEntity.deliverTypeInfo != null) {
        } else {
            if (TextUtils.isEmpty(poiEntity.deliveryTypeIcon)) {
                this.A.setVisibility(8);
                this.W.setVisibility(8);
            } else if (TextUtils.equals(this.c.bk, "A") || TextUtils.equals(this.c.bk, ErrorCode.ERROR_TYPE_B)) {
                this.W.setVisibility(0);
                m.d(poiEntity.deliveryTypeIcon, this.b.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_14)).a(this.W);
            } else {
                this.A.setVisibility(0);
                m.d(poiEntity.deliveryTypeIcon, this.b.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_14)).a(this.A);
            }
        }
    }

    private void y(PoiEntity poiEntity) {
        Object[] objArr = {poiEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e775d956b0fe2c5d53f643c95232fc9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e775d956b0fe2c5d53f643c95232fc9c");
        } else if (poiEntity.productShowType == 2) {
            this.B.setVisibility(8);
        } else {
            this.B.setVisibility(0);
            this.g.a(this.B, poiEntity.recommendSummary, com.sankuai.waimai.store.search.util.c.d);
        }
    }

    private void z(final PoiEntity poiEntity) {
        Object[] objArr = {poiEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f822e3152276dc37abc69a2bd74393c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f822e3152276dc37abc69a2bd74393c4");
        } else {
            this.g.a(this.D, this.E, this.F, poiEntity.poiTags, poiEntity.tagContainerExpanded, new c.a() { // from class: com.sankuai.waimai.store.search.template.poicate.d.4
                @Override // com.sankuai.waimai.store.search.util.c.a
                public final void a(boolean z) {
                    poiEntity.tagContainerExpanded = z;
                }
            }, false);
        }
    }

    private void A(PoiEntity poiEntity) {
        Object[] objArr = {poiEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd957b228aae298240473fcfbac5f5df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd957b228aae298240473fcfbac5f5df");
            return;
        }
        switch (poiEntity.productShowType) {
            case 1:
                B(poiEntity);
                return;
            case 2:
                C(poiEntity);
                return;
            default:
                this.C.setVisibility(8);
                this.G.setVisibility(8);
                this.I.setVisibility(8);
                return;
        }
    }

    private void B(PoiEntity poiEntity) {
        Object[] objArr = {poiEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03d42202a89ca48e5cd08b3350568d09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03d42202a89ca48e5cd08b3350568d09");
            return;
        }
        this.C.setVisibility(8);
        switch (this.f) {
            case 1:
                D(poiEntity);
                return;
            case 2:
                E(poiEntity);
                return;
            default:
                this.G.setVisibility(8);
                this.I.setVisibility(8);
                return;
        }
    }

    private void C(final PoiEntity poiEntity) {
        Object[] objArr = {poiEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e5c2d4d90bb74b42569c15e82f71067", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e5c2d4d90bb74b42569c15e82f71067");
            return;
        }
        this.I.setVisibility(8);
        this.G.setVisibility(8);
        final ProductItemEntity productItemEntity = (ProductItemEntity) com.sankuai.shangou.stone.util.a.a((List<Object>) poiEntity.productList, 0);
        if (productItemEntity == null || TextUtils.isEmpty(productItemEntity.productName)) {
            this.C.setVisibility(8);
            return;
        }
        this.C.setVisibility(0);
        String str = productItemEntity.productRecommendLabel;
        if (TextUtils.isEmpty(str)) {
            str = this.b.getResources().getString(R.string.wm_sc_nox_search_poi_cate_product_name_for_tag_default_header);
        }
        this.C.setText(this.b.getResources().getString(R.string.wm_sc_nox_search_poi_cate_product_name_for_tag, str, productItemEntity.productName));
        if (!productItemEntity.isExposed) {
            productItemEntity.isExposed = true;
            productItemEntity.nodeProduct.a(this.b);
            com.sankuai.waimai.store.search.util.e.a(this.c, poiEntity, productItemEntity, 0);
        }
        this.C.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.template.poicate.d.5
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "180ad1e230fd45d4fe4d443e7158cfbb", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "180ad1e230fd45d4fe4d443e7158cfbb");
                    return;
                }
                productItemEntity.nodeProduct.b(d.this.b);
                com.sankuai.waimai.store.search.util.e.b(d.this.c, poiEntity, productItemEntity, 0);
                com.sankuai.waimai.store.router.d.a(d.this.b, productItemEntity.restaurantScheme);
            }
        });
    }

    private void D(final PoiEntity poiEntity) {
        int min;
        Object[] objArr = {poiEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6004c7916efed2bcc2091e54927c994f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6004c7916efed2bcc2091e54927c994f");
            return;
        }
        this.I.setVisibility(8);
        if (com.sankuai.shangou.stone.util.a.b(poiEntity.productList)) {
            this.G.setVisibility(8);
            return;
        }
        this.G.setVisibility(0);
        int childCount = this.G.getChildCount();
        for (int i = 0; i < childCount; i++) {
            this.H.add(this.G.getChildAt(i));
        }
        this.G.removeAllViews();
        int dimensionPixelSize = this.b.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_4);
        if (TextUtils.equals(this.c.bk, ErrorCode.ERROR_TYPE_B)) {
            min = poiEntity.productList.size();
        } else {
            min = Math.min(poiEntity.productList.size(), 3);
        }
        for (final int i2 = 0; i2 < min; i2++) {
            final ProductItemEntity productItemEntity = poiEntity.productList.get(i2);
            if (productItemEntity != null && !TextUtils.isEmpty(productItemEntity.productName)) {
                View remove = this.H.isEmpty() ? null : this.H.remove(this.H.size() - 1);
                if (remove == null) {
                    remove = LayoutInflater.from(this.b).inflate(R.layout.wm_sc_nox_search_poi_product_label_a, (ViewGroup) null);
                    remove.setLayoutParams(new LinearLayout.LayoutParams(com.sankuai.shangou.stone.util.h.a(this.b, 90.0f), -2));
                }
                remove.setPadding(dimensionPixelSize, this.X, dimensionPixelSize, this.Y);
                if (remove instanceof PoiGoodLabelView) {
                    ((PoiGoodLabelView) remove).a(productItemEntity, poiEntity.type, poiEntity.status);
                }
                this.G.addView(remove);
                if (!productItemEntity.isExposed) {
                    productItemEntity.isExposed = true;
                    productItemEntity.nodeProduct.a(this.b);
                    com.sankuai.waimai.store.search.util.e.a(this.c, poiEntity, productItemEntity, i2);
                }
                remove.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.template.poicate.d.6
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "902842b779af9e4fcae2d566bfc7d7b5", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "902842b779af9e4fcae2d566bfc7d7b5");
                            return;
                        }
                        productItemEntity.nodeProduct.b(d.this.b);
                        com.sankuai.waimai.store.search.util.e.b(d.this.c, poiEntity, productItemEntity, i2);
                        com.sankuai.waimai.store.router.d.a(d.this.b, productItemEntity.restaurantScheme);
                    }
                });
            }
        }
    }

    private void E(PoiEntity poiEntity) {
        Object[] objArr = {poiEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52c2f322009efc3cd3d37c6c18bea78b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52c2f322009efc3cd3d37c6c18bea78b");
            return;
        }
        this.G.setVisibility(8);
        if (com.sankuai.shangou.stone.util.a.b(poiEntity.productList)) {
            this.I.setVisibility(8);
            return;
        }
        this.I.setVisibility(0);
        if (this.J == null) {
            this.J = new c(this.b, this.c.bk);
            this.I.setAdapter(this.J);
        }
        this.J.c = poiEntity;
        if (this.K == null) {
            this.K = new LinearLayoutManager(this.b);
            this.K.setOrientation(0);
            this.I.setLayoutManager(this.K);
        }
        this.J.a(poiEntity.productList);
    }

    private void F(PoiEntity poiEntity) {
        Object[] objArr = {poiEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7503d30180653a59f6a923765cd895c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7503d30180653a59f6a923765cd895c4");
            return;
        }
        u.c(this.N, this.O, this.P, this.L, this.M);
        if (poiEntity.nonLbsEntity == null) {
            return;
        }
        if (poiEntity.nonLbsEntity.nonLbsId == 4) {
            u.a(this.N);
            u.c(this.O, this.P);
        }
        if (poiEntity.nonLbsEntity.nonLbsId == 3) {
            u.c(this.N);
            u.a(this.O, this.P);
        }
        if (TextUtils.isEmpty(poiEntity.nonLbsEntity.nonLbsReason)) {
            u.c(this.L, this.M);
            return;
        }
        u.a(this.L, this.M);
        this.M.setText(poiEntity.nonLbsEntity.nonLbsReason);
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8632cea4200ec2e3a9d317f4723ee59d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8632cea4200ec2e3a9d317f4723ee59d");
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.h.getLayoutParams();
        boolean z = this.M.getVisibility() == 0;
        if (this.G.getVisibility() != 0 && this.I.getVisibility() != 0) {
            z = true;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = z ? this.Y : 0;
            this.h.setLayoutParams(layoutParams);
        }
    }

    private void a(final ImageView imageView, String str) {
        Object[] objArr = {imageView, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0acc248d648fc3a026d6f81ea88249c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0acc248d648fc3a026d6f81ea88249c");
        } else if (TextUtils.isEmpty(str)) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            m.b(str).a(new b.d() { // from class: com.sankuai.waimai.store.search.template.poicate.d.7
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.d
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "395c049f35238714b3a6b34221a7506f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "395c049f35238714b3a6b34221a7506f");
                    } else {
                        imageView.setVisibility(0);
                    }
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.d
                public final void a(int i, Exception exc) {
                    Object[] objArr2 = {Integer.valueOf(i), exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4b0629f2441125cedb098c8f0e32c686", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4b0629f2441125cedb098c8f0e32c686");
                    } else {
                        imageView.setVisibility(8);
                    }
                }
            }).a(imageView);
        }
    }
}
