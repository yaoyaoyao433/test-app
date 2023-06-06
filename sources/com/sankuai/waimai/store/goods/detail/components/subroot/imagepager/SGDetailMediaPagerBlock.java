package com.sankuai.waimai.store.goods.detail.components.subroot.imagepager;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.view.ViewPager;
import android.text.Html;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.meituan.android.cube.annotation.Cube;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.platform.domain.core.goods.e;
import com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.b;
import com.sankuai.waimai.store.j;
import com.sankuai.waimai.store.newwidgets.SCViewPagerCompat;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.shop.model.LiveInfo;
import com.sankuai.waimai.store.repository.model.GoodDetailResponse;
import com.sankuai.waimai.store.repository.model.ProductFreeInfo;
import com.sankuai.waimai.store.util.g;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.widgets.SGViewSwitcher;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@Cube
/* loaded from: classes5.dex */
public class SGDetailMediaPagerBlock extends j implements ViewPager.OnPageChangeListener {
    public static ChangeQuickRedirect g;
    private d A;
    private float B;
    private boolean C;
    private boolean D;
    private GoodDetailResponse.PoiExtendAttr E;
    public String h;
    private com.sankuai.waimai.store.platform.domain.manager.poi.a i;
    private SCViewPagerCompat j;
    private ImageView k;
    private SGMediaPagerAdapter l;
    private TextView m;
    private LinearLayout n;
    private LinearLayout o;
    private TextView p;
    private TextView q;
    private TextView r;
    private TextView s;
    private View t;
    private SGViewSwitcher u;
    private ViewSwitcher.ViewFactory v;
    private TextView w;
    private TextView x;
    private GoodsSpu y;
    private String z;

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
    }

    public static /* synthetic */ String b(SGDetailMediaPagerBlock sGDetailMediaPagerBlock) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, sGDetailMediaPagerBlock, changeQuickRedirect, false, "f298f7399f48d3bfd04b6921008c26f2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, sGDetailMediaPagerBlock, changeQuickRedirect, false, "f298f7399f48d3bfd04b6921008c26f2") : (sGDetailMediaPagerBlock.E == null || TextUtils.isEmpty(sGDetailMediaPagerBlock.E.superDrugStorePicFrameImgDesc)) ? "-999" : sGDetailMediaPagerBlock.E.superDrugStorePicFrameImgDesc;
    }

    public SGDetailMediaPagerBlock(@NonNull com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f82992f41fffa5bea56924a4d6cd91c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f82992f41fffa5bea56924a4d6cd91c");
            return;
        }
        this.B = -1.0f;
        this.i = aVar;
    }

    @Override // com.meituan.android.cube.core.f
    public final View a(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c19052cb7dc65f9653d7303d8d8301d0", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c19052cb7dc65f9653d7303d8d8301d0") : layoutInflater.inflate(R.layout.wm_st_goods_detail_layout_detail_room_pic, viewGroup, false);
    }

    @Override // com.meituan.android.cube.core.f
    public final void a_(@NonNull View view) {
        int a;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b510257097c15d4febd5adc3bfa6fb3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b510257097c15d4febd5adc3bfa6fb3c");
            return;
        }
        super.a_(view);
        this.j = (SCViewPagerCompat) a(R.id.pager_picture);
        this.j.addOnPageChangeListener(this);
        this.l = new SGMediaPagerAdapter(l(), this.i, new ArrayList());
        this.j.setAdapter(this.l);
        this.l.b = new a() { // from class: com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.SGDetailMediaPagerBlock.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.a
            public final void a(boolean z, boolean z2) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "da8754271fda07996eb10a57ba76e7c7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "da8754271fda07996eb10a57ba76e7c7");
                } else if (SGDetailMediaPagerBlock.this.y == null || !z) {
                } else {
                    com.sankuai.waimai.store.manager.judas.b.a(SGDetailMediaPagerBlock.this.l(), "b_waimai_121sijke_mc").a(SGDetailMediaPagerBlock.this.l()).a("poi_id", SGDetailMediaPagerBlock.this.i.d()).a("spu_id", Long.valueOf(SGDetailMediaPagerBlock.this.y.getId())).a("video_status", Integer.valueOf(z2 ? 1 : 2)).a("stid", SGDetailMediaPagerBlock.this.h).a("poi_label", SGDetailMediaPagerBlock.b(SGDetailMediaPagerBlock.this)).a();
                }
            }

            @Override // com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.a
            public final void a(boolean z) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "67329e5902d20b212b6ebb0d3689035c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "67329e5902d20b212b6ebb0d3689035c");
                } else {
                    SGDetailMediaPagerBlock.this.m.setVisibility(z ? 0 : 8);
                }
            }

            @Override // com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.a
            public final void a(e eVar, int i) {
                Object[] objArr2 = {eVar, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "159cfdc2127b6669ff5149b4c0600ef0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "159cfdc2127b6669ff5149b4c0600ef0");
                } else if (SGDetailMediaPagerBlock.this.y != null) {
                    com.sankuai.waimai.store.manager.judas.b.a(SGDetailMediaPagerBlock.this.l(), "b_waimai_sg_d8ckhqgw_mc").a(SGDetailMediaPagerBlock.this.l()).a("poi_id", SGDetailMediaPagerBlock.this.i.d()).a("spu_id", Long.valueOf(SGDetailMediaPagerBlock.this.y.getId())).a("sku_id", SGDetailMediaPagerBlock.this.z).a("index", Integer.valueOf(i)).a("poi_label", SGDetailMediaPagerBlock.b(SGDetailMediaPagerBlock.this)).a("stid", SGDetailMediaPagerBlock.this.h).a();
                }
            }

            @Override // com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.a
            public final void a(View view2, e eVar, int i, boolean z) {
                Object[] objArr2 = {view2, eVar, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "be3a8621d61dc00dd5e82beb129f2fbe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "be3a8621d61dc00dd5e82beb129f2fbe");
                } else if (eVar == null || SGDetailMediaPagerBlock.this.y == null) {
                } else {
                    if (eVar.b == 0) {
                        if (com.sankuai.shangou.stone.util.a.b(SGDetailMediaPagerBlock.this.y.getPictureList())) {
                            return;
                        }
                        com.sankuai.waimai.store.expose.v2.entity.b bVar = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_sg_d8ckhqgw_mv", view2, "b_waimai_sg_d8ckhqgw_mv" + i);
                        bVar.a("poi_id", SGDetailMediaPagerBlock.this.i.d()).a("spu_id", Long.valueOf(SGDetailMediaPagerBlock.this.y.getId())).a("sku_id", SGDetailMediaPagerBlock.this.z).a("index", Integer.valueOf(i)).a("poi_label", SGDetailMediaPagerBlock.b(SGDetailMediaPagerBlock.this)).a("stid", SGDetailMediaPagerBlock.this.h);
                        com.sankuai.waimai.store.expose.v2.b.a().a(SGDetailMediaPagerBlock.this.l(), bVar);
                    } else if (eVar.b == 1) {
                        com.sankuai.waimai.store.expose.v2.entity.b bVar2 = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_121sijke_mv", view2, "b_waimai_121sijke_mv" + i);
                        bVar2.a("poi_id", SGDetailMediaPagerBlock.this.i.d()).a("spu_id", Long.valueOf(SGDetailMediaPagerBlock.this.y.getId())).a("video_status", Integer.valueOf(z ? 1 : 2)).a("poi_label", SGDetailMediaPagerBlock.b(SGDetailMediaPagerBlock.this)).a("stid", SGDetailMediaPagerBlock.this.h);
                        com.sankuai.waimai.store.expose.v2.b.a().a(SGDetailMediaPagerBlock.this.l(), bVar2);
                    }
                }
            }

            @Override // com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.a
            public final void a(int i, @NonNull SparseArray<b.C1178b> sparseArray) {
                b.C1178b c1178b;
                Object[] objArr2 = {Integer.valueOf(i), sparseArray};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ad0a0be8c74c05416c5bddf5eda2ff88", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ad0a0be8c74c05416c5bddf5eda2ff88");
                } else if (com.sankuai.waimai.store.util.b.a(SGDetailMediaPagerBlock.this.l()) || (c1178b = sparseArray.get(0)) == null) {
                } else {
                    SGDetailMediaPagerBlock.this.a(c1178b.b, c1178b.c);
                }
            }

            @Override // com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.a
            public final void a(long j) {
                Object[] objArr2 = {new Long(j)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3c8c23395324c8c2a3e0aec30f9c2ca2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3c8c23395324c8c2a3e0aec30f9c2ca2");
                } else if (j < 0 || SGDetailMediaPagerBlock.this.y == null) {
                } else {
                    com.sankuai.waimai.store.manager.judas.b.b(SGDetailMediaPagerBlock.this.m(), "b_waimai_sg_ci5wb7w7_mv").a("poi_id", SGDetailMediaPagerBlock.this.i.d()).a("spu_id", Long.valueOf(SGDetailMediaPagerBlock.this.y.getId())).a("stid", SGDetailMediaPagerBlock.this.h).a("rank_trace_id", "").a("duration", String.valueOf(j / 1000)).a();
                }
            }
        };
        this.n = (LinearLayout) a(R.id.ll_freeget);
        this.w = (TextView) a(R.id.tv_title_top);
        this.x = (TextView) a(R.id.tv_title_bottom);
        this.k = (ImageView) a(R.id.img_detail_banner_ad);
        ViewGroup.LayoutParams layoutParams = this.k.getLayoutParams();
        if (layoutParams != null && (a = (int) (h.a((Context) l()) / 7.5f)) != layoutParams.height) {
            layoutParams.height = a;
            this.k.setLayoutParams(layoutParams);
        }
        this.m = (TextView) a(R.id.tv_image_pager_indicator);
        this.o = (LinearLayout) a(R.id.ll_like_ratio);
        this.p = (TextView) a(R.id.tv_like_ratio_desc);
        this.q = (TextView) a(R.id.tv_divide_sign);
        this.r = (TextView) a(R.id.tv_good_praise);
        this.u = (SGViewSwitcher) a(R.id.tv_spu_praise_list);
        this.s = (TextView) a(R.id.tv_has_more_comment);
        this.t = a(R.id.view_divide);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88fa2df0cca4cc2a5df0315a10932dde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88fa2df0cca4cc2a5df0315a10932dde");
        } else if (i <= 0 || i2 <= 0) {
        } else {
            View i3 = i();
            int min = Math.min((l().getResources().getDisplayMetrics().widthPixels * i2) / i, h.a(l(), 500.0f));
            ViewGroup.LayoutParams layoutParams = i3.getLayoutParams();
            if (layoutParams.height == min) {
                return;
            }
            layoutParams.height = min;
            i3.setLayoutParams(layoutParams);
        }
    }

    public final void a(GoodsSpu goodsSpu, String str, d dVar, final ProductFreeInfo productFreeInfo, float f, GoodDetailResponse.PoiExtendAttr poiExtendAttr) {
        Object[] objArr = {goodsSpu, str, dVar, productFreeInfo, Float.valueOf(f), poiExtendAttr};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3d43ee088685e7821a21c63aba1046f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3d43ee088685e7821a21c63aba1046f");
            return;
        }
        this.y = goodsSpu;
        this.z = str;
        this.A = dVar;
        this.E = poiExtendAttr;
        if (goodsSpu == null || dVar == null || com.sankuai.shangou.stone.util.a.b(dVar.b)) {
            return;
        }
        if (f > 0.0f && !g.a(this.B, f)) {
            this.B = f;
            int a = h.a((Context) l());
            a(a, (int) (a * f));
        }
        this.l.a(dVar.b, poiExtendAttr, new c(l(), s(), t(), this.h));
        this.j.setCurrentItem(dVar.a);
        int a2 = com.sankuai.shangou.stone.util.a.a((List) dVar.b);
        if (a2 > 1) {
            this.m.setVisibility(0);
            this.m.setText(Html.fromHtml(l().getString(R.string.wm_sc_goods_detail_image_pager_indicator, new Object[]{String.valueOf(dVar.a + 1), String.valueOf(a2)})));
        } else {
            this.m.setVisibility(8);
        }
        if (productFreeInfo != null && !t.a(productFreeInfo.topTitle) && !t.a(productFreeInfo.bottomTitle) && !t.a(productFreeInfo.schemeUrl)) {
            if (a(this.A, 0)) {
                this.n.setVisibility(8);
            } else {
                this.n.setVisibility(0);
            }
            this.D = true;
            this.w.setText(productFreeInfo.topTitle);
            this.x.setText(productFreeInfo.bottomTitle);
            final HashMap hashMap = new HashMap();
            hashMap.put("poi_id", Long.valueOf(s()));
            hashMap.put("spu_id", Long.valueOf(t()));
            hashMap.put("sku_id", str);
            hashMap.put("activity_id", productFreeInfo.activityID);
            this.n.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.SGDetailMediaPagerBlock.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f15383f7103af699494c5ae8048f7caf", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f15383f7103af699494c5ae8048f7caf");
                        return;
                    }
                    com.sankuai.waimai.store.router.d.a(SGDetailMediaPagerBlock.this.l(), productFreeInfo.schemeUrl, (Map<String, String>) null);
                    com.sankuai.waimai.store.manager.judas.b.a(SGDetailMediaPagerBlock.this.l(), "b_t491h6tc").b(hashMap).a();
                }
            });
            LinearLayout linearLayout = this.n;
            com.sankuai.waimai.store.expose.v2.entity.b bVar = new com.sankuai.waimai.store.expose.v2.entity.b("b_txcalwzo", linearLayout, "FreeGet-" + productFreeInfo.activityID);
            bVar.b(hashMap);
            com.sankuai.waimai.store.expose.v2.b.a().a(l(), bVar);
            return;
        }
        this.n.setVisibility(8);
        this.D = false;
        b(goodsSpu.atmospherePic);
    }

    public final void a(GoodDetailResponse.SpuPraiseInfo spuPraiseInfo, final int i) {
        Object[] objArr = {spuPraiseInfo, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd249a9cd9aa2bfbd74fa547f4468903", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd249a9cd9aa2bfbd74fa547f4468903");
        } else if (spuPraiseInfo != null) {
            u.a(this.o);
            this.C = true;
            if (TextUtils.isEmpty(spuPraiseInfo.mLikeRatioDesc)) {
                u.c(this.p, this.q, this.r, this.t);
            } else {
                u.a(this.p, this.q, this.r, this.t);
                this.p.setText(spuPraiseInfo.mLikeRatioDesc);
            }
            if (com.sankuai.shangou.stone.util.a.b(spuPraiseInfo.mSpuPraiseList)) {
                u.c(this.u);
            } else {
                u.a(this.u);
                if (this.v == null) {
                    this.v = new ViewSwitcher.ViewFactory() { // from class: com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.SGDetailMediaPagerBlock.3
                        public static ChangeQuickRedirect a;

                        @Override // android.widget.ViewSwitcher.ViewFactory
                        public final View makeView() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4efce3c3075bfbb81e6b59649161e7d4", RobustBitConfig.DEFAULT_VALUE)) {
                                return (View) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4efce3c3075bfbb81e6b59649161e7d4");
                            }
                            return LayoutInflater.from(SGDetailMediaPagerBlock.this.m()).inflate(R.layout.wm_sc_layout_text_img_switcher, (ViewGroup) SGDetailMediaPagerBlock.this.l().getWindow().getDecorView().findViewById(16908290), false);
                        }
                    };
                    this.u.setFactory(this.v);
                }
                this.u.a(a(spuPraiseInfo.mSpuPraiseList), 3000);
            }
            if (spuPraiseInfo.mHasMoreComment) {
                u.a(this.s);
                if (this.i != null && this.y != null) {
                    com.sankuai.waimai.store.expose.v2.entity.b bVar = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_f0m9jp3g_mv", this.s);
                    bVar.a("poi_id", this.i.d()).a("spu_id", Long.valueOf(this.y.getId())).a("sku_id", this.z).a("stid", this.h);
                    com.sankuai.waimai.store.expose.v2.b.a().a(l(), bVar);
                }
                this.s.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.SGDetailMediaPagerBlock.4
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "05ff1a411be0fa80116d2f531a67361c", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "05ff1a411be0fa80116d2f531a67361c");
                            return;
                        }
                        SGDetailMediaPagerBlock.this.a(new com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.indicator.b(i));
                        com.sankuai.waimai.store.manager.judas.b.a(SGDetailMediaPagerBlock.this.l(), "b_waimai_f0m9jp3g_mc").a(SGDetailMediaPagerBlock.this.l()).a("poi_id", SGDetailMediaPagerBlock.this.i.d()).a("spu_id", Long.valueOf(SGDetailMediaPagerBlock.this.y.getId())).a("sku_id", SGDetailMediaPagerBlock.this.z).a("stid", SGDetailMediaPagerBlock.this.h).a();
                    }
                });
            } else {
                u.c(this.s);
            }
            if (com.sankuai.shangou.stone.util.a.b(spuPraiseInfo.mSpuPraiseList) && !spuPraiseInfo.mHasMoreComment) {
                if (!TextUtils.isEmpty(spuPraiseInfo.mLikeRatioDesc)) {
                    u.c(this.t);
                    u.a(this.o);
                    this.C = true;
                    r();
                } else {
                    u.c(this.o);
                    this.C = false;
                }
            }
            if (a(this.A, 0)) {
                u.c(this.o);
            }
        } else {
            u.c(this.o);
            this.C = false;
        }
    }

    private void r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b222c83e7d99f1886f2dfd43b187108c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b222c83e7d99f1886f2dfd43b187108c");
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.o.getLayoutParams();
        layoutParams.width = -2;
        this.o.setLayoutParams(layoutParams);
    }

    private List<String> a(List<String> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b64c9b52d3ce770659ac5d7ea226743", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b64c9b52d3ce770659ac5d7ea226743");
        }
        if (!CollectionUtils.isEmpty(list)) {
            for (int i = 0; i < list.size(); i++) {
                list.set(i, l().getString(R.string.wm_sc_praise_product, new Object[]{list.get(i)}));
            }
        }
        return list;
    }

    private long s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76ce952f0e3d9a2ab2570b6503712c8a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76ce952f0e3d9a2ab2570b6503712c8a")).longValue();
        }
        if (this.i != null) {
            return this.i.f();
        }
        return -1L;
    }

    private long t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3631bbd67fc1b618b233ec9ea25bf856", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3631bbd67fc1b618b233ec9ea25bf856")).longValue();
        }
        if (this.y != null) {
            return this.y.getId();
        }
        return -1L;
    }

    private void b(String str) {
        int a;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54318b7ab7f822ef93942c8eb34c763d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54318b7ab7f822ef93942c8eb34c763d");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            ViewGroup.LayoutParams layoutParams = this.k.getLayoutParams();
            if (layoutParams != null && (a = (int) (h.a((Context) l()) / 7.5f)) != layoutParams.height) {
                layoutParams.height = a;
                this.k.setLayoutParams(layoutParams);
            }
            b.C0608b a2 = m.a(str, h.a((Context) l()), ImageQualityUtil.a());
            a2.b = l();
            a2.a(this.k);
        }
    }

    private boolean a(d dVar, int i) {
        Object[] objArr = {dVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9440f5ef84a8046488b0127814617d6e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9440f5ef84a8046488b0127814617d6e")).booleanValue() : (dVar == null || com.sankuai.shangou.stone.util.a.a((List<Object>) dVar.b, i) == null || ((e) com.sankuai.shangou.stone.util.a.a((List<Object>) dVar.b, i)).b != 1) ? false : true;
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aedcb672d829abe8a120f1973040139f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aedcb672d829abe8a120f1973040139f");
            return;
        }
        int count = this.l.getCount();
        if (count <= 0 || this.A == null) {
            return;
        }
        this.A.a = i;
        this.m.setText(Html.fromHtml(l().getString(R.string.wm_sc_goods_detail_image_pager_indicator, new Object[]{String.valueOf(this.A.a + 1), String.valueOf(count)})));
        if (a(this.A, i) || !this.C) {
            u.c(this.o);
        } else {
            u.a(this.o);
        }
        if (a(this.A, i) || !this.D) {
            u.c(this.n);
        } else {
            u.a(this.n);
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final void aX_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4014908bc98626d717d6493b1aea037", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4014908bc98626d717d6493b1aea037");
            return;
        }
        super.aX_();
        SGMediaPagerAdapter sGMediaPagerAdapter = this.l;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = SGMediaPagerAdapter.a;
        if (PatchProxy.isSupport(objArr2, sGMediaPagerAdapter, changeQuickRedirect2, false, "f741a7617434eccca1693d925fd2568a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, sGMediaPagerAdapter, changeQuickRedirect2, false, "f741a7617434eccca1693d925fd2568a");
            return;
        }
        for (Integer num : sGMediaPagerAdapter.c) {
            com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.c a = sGMediaPagerAdapter.a(num.intValue());
            if (a != null) {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.c.a;
                if (PatchProxy.isSupport(objArr3, a, changeQuickRedirect3, false, "cb221070bb2898e7420be284ff62ff13", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, a, changeQuickRedirect3, false, "cb221070bb2898e7420be284ff62ff13");
                } else if (a.b != null) {
                    a.b.onResume();
                }
            }
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final void bc_() {
        long currentPosition;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3dcca284699957f01838208ca618619", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3dcca284699957f01838208ca618619");
            return;
        }
        super.bc_();
        SGMediaPagerAdapter sGMediaPagerAdapter = this.l;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = SGMediaPagerAdapter.a;
        if (PatchProxy.isSupport(objArr2, sGMediaPagerAdapter, changeQuickRedirect2, false, "452864fc7c89ce1fe2beaafdfb1e18bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, sGMediaPagerAdapter, changeQuickRedirect2, false, "452864fc7c89ce1fe2beaafdfb1e18bc");
            return;
        }
        for (Integer num : sGMediaPagerAdapter.c) {
            com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.c a = sGMediaPagerAdapter.a(num.intValue());
            if (a != null) {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.c.a;
                if (PatchProxy.isSupport(objArr3, a, changeQuickRedirect3, false, "e4a60823c0a548539b6c846ce4c9cd38", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, a, changeQuickRedirect3, false, "e4a60823c0a548539b6c846ce4c9cd38");
                } else if (a.b != null) {
                    a.b.onPause();
                    if (a.c != null) {
                        b.a aVar = a.c;
                        com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.d dVar = a.b;
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.d.a;
                        if (PatchProxy.isSupport(objArr4, dVar, changeQuickRedirect4, false, "47011a5da8b96d1a6e59c60d58cff55c", RobustBitConfig.DEFAULT_VALUE)) {
                            currentPosition = ((Long) PatchProxy.accessDispatch(objArr4, dVar, changeQuickRedirect4, false, "47011a5da8b96d1a6e59c60d58cff55c")).longValue();
                        } else {
                            currentPosition = dVar.c == null ? -1L : dVar.c.getCurrentPosition();
                        }
                        aVar.a(currentPosition);
                    }
                }
            }
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final void bE_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d10084a585758ea3426aa6b3c61cbe3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d10084a585758ea3426aa6b3c61cbe3");
            return;
        }
        super.bE_();
        SGMediaPagerAdapter sGMediaPagerAdapter = this.l;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = SGMediaPagerAdapter.a;
        if (PatchProxy.isSupport(objArr2, sGMediaPagerAdapter, changeQuickRedirect2, false, "be249c90c36fc9bcc639198f543ec0e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, sGMediaPagerAdapter, changeQuickRedirect2, false, "be249c90c36fc9bcc639198f543ec0e3");
        } else {
            for (Integer num : sGMediaPagerAdapter.c) {
                com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.c a = sGMediaPagerAdapter.a(num.intValue());
                if (a != null) {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.c.a;
                    if (PatchProxy.isSupport(objArr3, a, changeQuickRedirect3, false, "c3f742500218270b4f211c9d1e8a94c6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, a, changeQuickRedirect3, false, "c3f742500218270b4f211c9d1e8a94c6");
                    } else if (a.b != null) {
                        a.b.onDestroy();
                    }
                }
            }
        }
        if (this.u != null) {
            SGViewSwitcher sGViewSwitcher = this.u;
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = SGViewSwitcher.a;
            if (PatchProxy.isSupport(objArr4, sGViewSwitcher, changeQuickRedirect4, false, "32d5b5c667f020665f38126ec5a62861", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, sGViewSwitcher, changeQuickRedirect4, false, "32d5b5c667f020665f38126ec5a62861");
            } else {
                sGViewSwitcher.b.removeMessages(0);
            }
        }
    }

    public final void a(LiveInfo liveInfo) {
        Object[] objArr = {liveInfo};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b71a39eca6e83db211213a0d6e59912e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b71a39eca6e83db211213a0d6e59912e");
        } else if (this.l != null) {
            this.l.d = liveInfo;
        }
    }
}
