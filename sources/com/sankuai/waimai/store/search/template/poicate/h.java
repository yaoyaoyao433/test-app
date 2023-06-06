package com.sankuai.waimai.store.search.template.poicate;

import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.search.common.view.PoiStateView;
import com.sankuai.waimai.store.search.model.PoiEntity;
import com.sankuai.waimai.store.search.model.ProductItemEntity;
import com.sankuai.waimai.store.search.template.poicate.a;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.view.DeliverView;
import com.sankuai.waimai.store.view.LiveView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class h extends a<PoiEntity> {
    public static ChangeQuickRedirect y;
    Map<String, Object> A;
    private ImageView B;
    private ImageView C;
    private TextView D;
    private ImageView E;
    private TextView F;
    private TextView G;
    private TextView H;
    private TextView I;
    private TextView J;
    private TextView K;
    private TextView L;
    private PoiStateView M;
    private ImageView N;
    private ImageView O;
    private RecyclerView P;
    private DeliverView Q;
    private LiveView R;
    private j S;
    private SearchShareData T;
    ImageView z;

    @Override // com.sankuai.waimai.store.search.template.poicate.a
    public final /* synthetic */ void b(PoiEntity poiEntity) {
        PoiEntity poiEntity2 = poiEntity;
        Object[] objArr = {poiEntity2};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8815b5111e4e3542426d2af99e68f6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8815b5111e4e3542426d2af99e68f6d");
            return;
        }
        this.e = poiEntity2;
        this.j = poiEntity2.closeTips;
        this.d = poiEntity2.status;
        this.k = poiEntity2.statusDesc;
        this.l = poiEntity2.statusSubDesc;
        this.q = poiEntity2.usePoiTagsField;
        this.r = poiEntity2.tagContainerExpanded;
        this.s = poiEntity2.poiTags;
    }

    public h(View view) {
        super(view);
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf25d163850417c99eccafb6c5673843", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf25d163850417c99eccafb6c5673843");
            return;
        }
        this.A = new HashMap();
        this.T = SearchShareData.a(this.b);
    }

    @Override // com.sankuai.waimai.store.search.template.poicate.a
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3b5f0bf5a39e1e1261cf27311180922", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3b5f0bf5a39e1e1261cf27311180922");
            return;
        }
        super.a(view);
        this.B = (ImageView) view.findViewById(R.id.no_result_recommend_image);
        this.C = (ImageView) view.findViewById(R.id.no_result_recommend_brand_icon);
        this.z = (ImageView) view.findViewById(R.id.poi_cate_promotion_label);
        this.D = (TextView) view.findViewById(R.id.no_result_recommend_poi_name);
        this.E = (ImageView) view.findViewById(R.id.no_result_recommend_poi_score_icon);
        this.F = (TextView) view.findViewById(R.id.no_result_recommend_poi_score);
        this.G = (TextView) view.findViewById(R.id.no_result_recommend_poi_month_sale);
        this.H = (TextView) view.findViewById(R.id.no_result_recommend_poi_delivery_time);
        this.I = (TextView) view.findViewById(R.id.no_result_recommend_poi_delivery_distance);
        this.J = (TextView) view.findViewById(R.id.no_result_recommend_poi_delivery_minimum_price);
        this.K = (TextView) view.findViewById(R.id.no_result_recommend_poi_delivery_fee);
        this.L = (TextView) view.findViewById(R.id.no_result_recommend_poi_origin_delivery_fee);
        this.L.getPaint().setStrikeThruText(true);
        this.M = (PoiStateView) view.findViewById(R.id.no_result_recommend_poi_status_closed);
        this.N = (ImageView) view.findViewById(R.id.no_result_recommend_poi_insurance);
        this.O = (ImageView) view.findViewById(R.id.no_result_recommend_poi_delivery_type);
        this.P = (RecyclerView) view.findViewById(R.id.no_result_recommend_poi_product_list);
        this.R = (LiveView) view.findViewById(R.id.search_spu_live_icon);
        this.Q = (DeliverView) view.findViewById(R.id.no_result_recommend_poi_cate_deliver_view);
    }

    @Override // com.sankuai.waimai.store.search.template.poicate.a
    public final void a(PoiEntity poiEntity) {
        Object[] objArr = {poiEntity};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a5674f2b617f732138103aefb7febd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a5674f2b617f732138103aefb7febd6");
        } else if (poiEntity == null) {
        } else {
            super.a((h) poiEntity);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = y;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3b7858c36b39696cd1ebb1e8f167ae2d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3b7858c36b39696cd1ebb1e8f167ae2d");
            } else {
                this.A.put("cat_id", Integer.valueOf(this.T.z));
                this.A.put("search_log_id", this.T.b(this.e));
                this.A.put("search_source", Integer.valueOf(this.T.aw));
                this.A.put("keyword", this.T.h);
                this.A.put("poi_id", this.e.getOfficialPoiId());
                this.A.put(DataConstants.INDEX, Integer.valueOf(this.e.getStatisticsIndex()));
                this.A.put("stid", com.sankuai.waimai.store.search.statistics.g.f(this.T));
                this.A.put("is_have_sku", Integer.valueOf((com.sankuai.shangou.stone.util.a.b(this.e.productList) || this.e.productShowType == 3) ? 0 : 1));
                this.A.put("distance", this.e.poiDistance);
                this.A.put("min_total", this.e.minPriceTip);
                this.A.put("delivery_fee", this.e.shippingFeeTip);
                this.A.put("status", Integer.valueOf(this.e.status));
                this.A.put("ship_type", Integer.valueOf(this.e.deliveryType));
                this.A.put("search_global_id", this.T.r);
                this.A.put("template_type", Integer.valueOf(this.T.D));
                this.A.put("region", Integer.valueOf(this.e.regionId));
                this.A.put("poi_sales", this.e.monthSalesTip);
                this.A.put("poi_label", Integer.valueOf((this.e.labelOnPoiName == null || this.e.labelOnPoiName.type != 1) ? -999 : 1));
                if (!this.e.isExposed) {
                    this.e.isExposed = true;
                    com.sankuai.waimai.store.manager.judas.b.b(this.b, "b_waimai_sg_y11893jp_mv").b(this.A).a();
                }
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = y;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "56823016bef2e94de8dc1e94e6e87ccf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "56823016bef2e94de8dc1e94e6e87ccf");
            } else {
                b.C0608b a = m.a(this.e.picUrl).a((View) this.B);
                a.i = R.drawable.wm_sc_nox_search_feed_default_img;
                a.j = R.drawable.wm_sc_nox_search_feed_default_img;
                a.a(this.B);
            }
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = y;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "be4b60ec7a9a5548f5ae3800fdc50026", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "be4b60ec7a9a5548f5ae3800fdc50026");
            } else if (TextUtils.isEmpty(this.e.poiTypeIcon)) {
                u.c(this.C);
            } else {
                u.a(this.C);
                m.a(this.e.poiTypeIcon).a((View) this.C).a(this.C);
            }
            Object[] objArr5 = {poiEntity};
            ChangeQuickRedirect changeQuickRedirect5 = y;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "c6cf11a3f03d0517144266fbbba01c0f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "c6cf11a3f03d0517144266fbbba01c0f");
            } else if (poiEntity.labelOnPoiName == null || poiEntity.labelOnPoiName.type != 1 || TextUtils.isEmpty(poiEntity.labelOnPoiName.labelUrl)) {
                this.z.setVisibility(8);
            } else {
                this.z.setVisibility(0);
                m.d(poiEntity.labelOnPoiName.labelUrl, this.b.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_16)).a(new b.d() { // from class: com.sankuai.waimai.store.search.template.poicate.h.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mtimageloader.config.b.d
                    public final void a() {
                        Object[] objArr6 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "edc8244c6c8c4a9542692ea9cb16877d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "edc8244c6c8c4a9542692ea9cb16877d");
                        } else {
                            h.this.z.setVisibility(0);
                        }
                    }

                    @Override // com.sankuai.meituan.mtimageloader.config.b.d
                    public final void a(int i, Exception exc) {
                        Object[] objArr6 = {Integer.valueOf(i), exc};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "673532d2b5562d9a0a16f9b68897f337", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "673532d2b5562d9a0a16f9b68897f337");
                        } else {
                            h.this.z.setVisibility(8);
                        }
                    }
                }).a(this.z);
            }
            Object[] objArr6 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect6 = y;
            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "4f0f473c03803d218082dd9697ff9a16", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "4f0f473c03803d218082dd9697ff9a16");
            } else {
                u.a(this.D, this.e.name);
            }
            Object[] objArr7 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect7 = y;
            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "9ad98b2a7da2cfd63709d8bcc878de15", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "9ad98b2a7da2cfd63709d8bcc878de15");
            } else {
                double d = this.e.poiScore;
                if (com.sankuai.shangou.stone.util.i.d(Double.valueOf(d), Double.valueOf(0.0d))) {
                    u.a(this.E, this.F);
                    this.E.setImageResource(R.drawable.wm_sc_nox_search_rating_select_style2);
                    this.F.setText(com.sankuai.shangou.stone.util.i.a(Double.valueOf(d), 1, 1));
                    this.F.setTextColor(this.b.getResources().getColor(R.color.wm_sc_nox_search_color_FFA100));
                } else if (com.sankuai.shangou.stone.util.i.a(Double.valueOf(d), Double.valueOf(0.0d))) {
                    u.a(this.E, this.F);
                    this.E.setImageResource(R.drawable.wm_sc_nox_search_rating_unselect_style2);
                    this.F.setText(this.b.getResources().getString(R.string.wm_sc_search_no_score));
                    this.F.setTextColor(this.b.getResources().getColor(R.color.wm_sc_nox_search_color_575859));
                } else {
                    u.c(this.E, this.F);
                }
            }
            Object[] objArr8 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect8 = y;
            if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "ce95e10ef59e65400b57ce890be3b3e9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "ce95e10ef59e65400b57ce890be3b3e9");
            } else {
                u.a(this.G, this.e.monthSalesTip);
            }
            Object[] objArr9 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect9 = y;
            if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "e1d8c6e9bb3b58ab0f6d249dd07d8fc6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "e1d8c6e9bb3b58ab0f6d249dd07d8fc6");
            } else {
                if (this.e.status == 3) {
                    u.c(this.J, this.K, this.L);
                    u.a(this.M);
                    Object[] objArr10 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect10 = y;
                    if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "47d295d7d571886a86b441795d38b258", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "47d295d7d571886a86b441795d38b258");
                    } else {
                        this.M.a(TextUtils.isEmpty(this.e.statusDesc) ? this.b.getString(R.string.wm_sc_nox_search_at_rest) : this.e.statusDesc, this.e.statusSubDesc, this.b.getResources().getColor(R.color.wm_sc_nox_search_color_575859), this.b.getResources().getColor(R.color.wm_sc_nox_search_white));
                    }
                } else {
                    u.c(this.M);
                    u.a(this.J, this.K, this.L);
                    Object[] objArr11 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect11 = y;
                    if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "57376fd3493c119d77bc4a6db34e5dc1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "57376fd3493c119d77bc4a6db34e5dc1");
                    } else {
                        u.a(this.J, this.e.minPriceTip);
                        if (TextUtils.isEmpty(this.e.shippingFeeTip)) {
                            u.c(this.K, this.L);
                        } else {
                            u.a(this.K, this.L);
                            u.a(this.K, this.e.shippingFeeTip);
                            u.a(this.L, this.e.originShippingFeeTip);
                        }
                    }
                }
                Object[] objArr12 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect12 = y;
                if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "c4783b32a9107305e0c2905af2b366ae", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "c4783b32a9107305e0c2905af2b366ae");
                } else {
                    u.a(this.H, this.e.deliveryTimeTip);
                    u.a(this.I, this.e.poiDistance);
                }
            }
            Object[] objArr13 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect13 = y;
            if (PatchProxy.isSupport(objArr13, this, changeQuickRedirect13, false, "4e25e70c610ae5c84538ae9798f171b2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr13, this, changeQuickRedirect13, false, "4e25e70c610ae5c84538ae9798f171b2");
            } else if (TextUtils.isEmpty(this.e.insuranceIcon)) {
                u.c(this.N);
            } else {
                u.a(this.N);
                m.d(this.e.insuranceIcon, this.b.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_14)).a(this.N);
            }
            Object[] objArr14 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect14 = y;
            if (PatchProxy.isSupport(objArr14, this, changeQuickRedirect14, false, "13f0917a94f368ca66847a6a5d8118dd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr14, this, changeQuickRedirect14, false, "13f0917a94f368ca66847a6a5d8118dd");
            } else if (TextUtils.isEmpty(this.e.deliveryTypeIcon)) {
                u.c(this.O);
            } else {
                u.a(this.O);
                m.d(this.e.deliveryTypeIcon, this.b.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_14)).a(this.O);
            }
            Object[] objArr15 = {poiEntity};
            ChangeQuickRedirect changeQuickRedirect15 = y;
            if (PatchProxy.isSupport(objArr15, this, changeQuickRedirect15, false, "d001145eaaaa999d5518c74dc6ab8d35", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr15, this, changeQuickRedirect15, false, "d001145eaaaa999d5518c74dc6ab8d35");
            } else if (this.Q != null && poiEntity != null) {
                com.sankuai.waimai.store.search.util.b.a(this.Q, poiEntity.deliverTypeInfo);
                com.sankuai.waimai.store.search.util.b.a(poiEntity.deliverTypeInfo, this.O);
            }
            Object[] objArr16 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect16 = y;
            if (PatchProxy.isSupport(objArr16, this, changeQuickRedirect16, false, "e426f5866ad8f3c13f6106ec96ef686e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr16, this, changeQuickRedirect16, false, "e426f5866ad8f3c13f6106ec96ef686e");
            } else {
                a(new a.InterfaceC1317a() { // from class: com.sankuai.waimai.store.search.template.poicate.h.2
                    @Override // com.sankuai.waimai.store.search.template.poicate.a.InterfaceC1317a
                    public final void a(boolean z) {
                        h.this.e.tagContainerExpanded = z;
                    }
                });
            }
            Object[] objArr17 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect17 = y;
            if (PatchProxy.isSupport(objArr17, this, changeQuickRedirect17, false, "a93e17e2c1870aaeef0c33ae6fcd2ff9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr17, this, changeQuickRedirect17, false, "a93e17e2c1870aaeef0c33ae6fcd2ff9");
            } else {
                this.c.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.template.poicate.h.3
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr18 = {view};
                        ChangeQuickRedirect changeQuickRedirect18 = a;
                        if (PatchProxy.isSupport(objArr18, this, changeQuickRedirect18, false, "76140cbbaa3410b1a9939c88ca685083", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr18, this, changeQuickRedirect18, false, "76140cbbaa3410b1a9939c88ca685083");
                            return;
                        }
                        com.sankuai.waimai.store.manager.judas.b.a(h.this.b, "b_waimai_sg_y11893jp_mc").b(h.this.A).a();
                        ProductItemEntity productItemEntity = (ProductItemEntity) com.sankuai.shangou.stone.util.a.a((List<Object>) h.this.e.productList, 0);
                        com.sankuai.waimai.store.router.d.a(h.this.b, productItemEntity == null ? h.this.e.restaurantScheme : productItemEntity.restaurantScheme);
                    }
                });
            }
            Object[] objArr18 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect18 = y;
            if (PatchProxy.isSupport(objArr18, this, changeQuickRedirect18, false, "cf28355cb27c8caab056fab85170f457", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr18, this, changeQuickRedirect18, false, "cf28355cb27c8caab056fab85170f457");
            } else if (com.sankuai.shangou.stone.util.a.b(this.e.productList)) {
                u.c(this.P);
            } else {
                u.a(this.P);
                if (this.S == null) {
                    this.S = new j(this.b, this.e);
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.b);
                    linearLayoutManager.setOrientation(0);
                    this.P.setAdapter(this.S);
                    this.P.setLayoutManager(linearLayoutManager);
                }
                j jVar = this.S;
                List<ProductItemEntity> list = this.e.productList;
                Object[] objArr19 = {list};
                ChangeQuickRedirect changeQuickRedirect19 = j.a;
                if (PatchProxy.isSupport(objArr19, jVar, changeQuickRedirect19, false, "01aca1c096dc69df582d4d7377b29468", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr19, jVar, changeQuickRedirect19, false, "01aca1c096dc69df582d4d7377b29468");
                } else {
                    jVar.f.clear();
                    if (!com.sankuai.shangou.stone.util.a.b(list)) {
                        if (list.size() >= 8) {
                            jVar.f.addAll(list.subList(0, 8));
                            jVar.e = jVar.f.size() + 1;
                        } else {
                            jVar.f.addAll(list);
                            jVar.e = jVar.f.size();
                        }
                    }
                    jVar.notifyDataSetChanged();
                }
            }
            Object[] objArr20 = {poiEntity};
            ChangeQuickRedirect changeQuickRedirect20 = y;
            if (PatchProxy.isSupport(objArr20, this, changeQuickRedirect20, false, "2f7f02fe5c874bd7853e6fd195f6ece4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr20, this, changeQuickRedirect20, false, "2f7f02fe5c874bd7853e6fd195f6ece4");
            } else {
                this.R.a(poiEntity.getLiveBaseInfo());
            }
        }
    }

    @Override // com.sankuai.waimai.store.search.template.poicate.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca4da736c61e53929f5227dae82163f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca4da736c61e53929f5227dae82163f3");
            return;
        }
        c();
        if (e()) {
            return;
        }
        f();
    }

    @Override // com.sankuai.waimai.store.search.template.poicate.a
    public final boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cccccc28ca59fdc992be261b855aafe7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cccccc28ca59fdc992be261b855aafe7")).booleanValue();
        }
        if (this.m == null) {
            return false;
        }
        if (this.e == null || this.e.status != 2 || TextUtils.isEmpty(this.e.statusDesc)) {
            this.m.setVisibility(8);
            return false;
        }
        this.m.setVisibility(0);
        this.m.setText(this.e.statusDesc);
        this.m.setTextColor(this.b.getResources().getColor(R.color.wm_sc_nox_search_white));
        this.m.setBackgroundColor(this.b.getResources().getColor(R.color.wm_sc_nox_search_item_status_busy));
        return true;
    }
}
