package com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.goods.list.utils.TopScaleBitmapTransformation;
import com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.OnSaleUnionView;
import com.sankuai.waimai.store.goods.list.viewblocks.strollaround.PoiCommonMachListItem;
import com.sankuai.waimai.store.newwidgets.list.SCRecyclerView;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.k;
import com.sankuai.waimai.store.util.m;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class j extends com.sankuai.waimai.store.newwidgets.list.g<com.sankuai.waimai.store.repository.model.g, com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a> implements View.OnClickListener, com.sankuai.waimai.store.cell.core.b, com.sankuai.waimai.store.goods.list.delegate.impl.c {
    public static ChangeQuickRedirect b;
    private final String a;
    protected FrameLayout c;
    public TextView d;
    public ImageView e;
    public int f;
    public View g;
    public View h;
    protected Drawable i;
    protected Drawable j;
    protected Drawable k;
    protected FrameLayout l;
    private com.sankuai.waimai.store.platform.domain.manager.poi.a m;
    private int r;
    private GoodsPoiCategory s;
    private com.sankuai.waimai.store.repository.model.g t;
    private com.sankuai.waimai.store.expose.v2.entity.b u;
    private TextView v;
    private TextView w;
    private OnSaleUnionView x;
    private com.sankuai.waimai.store.goods.list.viewblocks.experimental.controller.a y;
    private com.sankuai.waimai.store.goods.list.viewblocks.strollaround.e z;

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public int a() {
        return R.layout.wm_sc_view_three_column_union_floor;
    }

    public void a(TextView textView) {
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void a(GoodsSpu goodsSpu) {
    }

    public void b(GoodsSpu goodsSpu, int i) {
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void b(GoodsSpu goodsSpu, com.sankuai.waimai.store.util.h hVar, int i) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57c26be1fc19ebcd04b098c841118d8b", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57c26be1fc19ebcd04b098c841118d8b");
        }
    }

    public j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49fab7013d1b9041bae7a34984a1f297", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49fab7013d1b9041bae7a34984a1f297");
        } else {
            this.a = "MarketFloorViewHolder";
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final /* synthetic */ void a(com.sankuai.waimai.store.repository.model.g gVar, int i) {
        PoiCommonMachListItem poiCommonMachListItem;
        com.sankuai.waimai.store.repository.model.g gVar2 = gVar;
        Object[] objArr = {gVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e2d7023e8226b017bf66710bf76c891", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e2d7023e8226b017bf66710bf76c891");
            return;
        }
        this.r = i;
        this.t = gVar2;
        this.s = gVar2.g;
        if (p.a(gVar2)) {
            return;
        }
        if (!(gVar2.n == null && gVar2.o == null)) {
            Object[] objArr2 = {gVar2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "67e6637ab661194cd1f2a27880b33334", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "67e6637ab661194cd1f2a27880b33334");
                return;
            }
            u.a(this.l);
            u.c(this.c);
            com.sankuai.waimai.store.goods.list.viewblocks.strollaround.e eVar = this.z;
            Object[] objArr3 = {gVar2};
            ChangeQuickRedirect changeQuickRedirect3 = b;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "2701720812af7e40b17cdf59b805f938", RobustBitConfig.DEFAULT_VALUE)) {
                poiCommonMachListItem = (PoiCommonMachListItem) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "2701720812af7e40b17cdf59b805f938");
            } else {
                poiCommonMachListItem = new PoiCommonMachListItem();
                poiCommonMachListItem.mBaseModuleDesc = gVar2.n;
                poiCommonMachListItem.recycleMachDataWrapper = gVar2.o;
            }
            eVar.a(poiCommonMachListItem, i);
            this.z.a("goods_detail_update_shopcart_account", ((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o).f());
            return;
        }
        Object[] objArr4 = {gVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect4 = b;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b6affaf7d8fded19532c328a8b4cb8c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b6affaf7d8fded19532c328a8b4cb8c7");
            return;
        }
        u.c(this.l);
        u.a(this.c);
        com.sankuai.waimai.store.expose.v2.entity.b bVar = this.u;
        bVar.e = "MarketFloorViewHolder" + gVar2.g.floorId;
        bVar.a("poi_id", this.m.d()).a("floor_id", Long.valueOf(gVar2.g.floorId)).a("floor_index", Integer.valueOf(i)).a("poi_tag_text", i()).a("stid", j());
        this.f = gVar2.d;
        c(this.s);
        a(this.s);
        b(this.s);
        GoodsPoiCategory goodsPoiCategory = this.s;
        Object[] objArr5 = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect5 = b;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "a256ee7e4fad8940e44b48007b58fcbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "a256ee7e4fad8940e44b48007b58fcbd");
        } else if (goodsPoiCategory != null && goodsPoiCategory.floorNumber == 3) {
            u.a(this.w, goodsPoiCategory.monthSaleTotalDescription);
            this.w.setTextColor(((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o).j().getResources().getColor(R.color.wm_sg_color_FE4C00));
            this.w.setCompoundDrawablesWithIntrinsicBounds(((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o).j().getResources().getDrawable(R.drawable.wm_sc_goods_list_floor_fire), (Drawable) null, (Drawable) null, (Drawable) null);
            this.w.setBackground(null);
        } else if (goodsPoiCategory != null && goodsPoiCategory.floorNumber == 4) {
            this.w.setTextColor(((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o).j().getResources().getColor(R.color.wm_sg_color_33312d));
            u.a(this.w, goodsPoiCategory.activityInfo.activityText);
            this.w.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            if (this.k != null) {
                this.w.setBackground(this.k);
            } else {
                this.w.setBackground(((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o).j().getResources().getDrawable(R.drawable.wm_sc_goods_list_bought_count));
            }
        } else {
            u.c(this.w);
            this.w.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            this.w.setBackground(null);
        }
        final com.sankuai.waimai.store.goods.list.viewblocks.experimental.controller.a aVar = this.y;
        GoodsPoiCategory goodsPoiCategory2 = this.s;
        Object[] objArr6 = {goodsPoiCategory2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.store.goods.list.viewblocks.experimental.controller.a.a;
        if (PatchProxy.isSupport(objArr6, aVar, changeQuickRedirect6, false, "22c93324faca4b0090a8865d4fc858dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, aVar, changeQuickRedirect6, false, "22c93324faca4b0090a8865d4fc858dd");
        } else {
            try {
                if (aVar.b != null) {
                    com.sankuai.waimai.store.manager.judas.b.b(aVar.b.k(), "b_waimai_w87txsha_mv").a();
                } else {
                    com.sankuai.waimai.store.manager.judas.b.b("c_waimai_bwm78neq", "b_waimai_w87txsha_mv").a();
                }
            } catch (Throwable unused) {
            }
            if (!p.a(goodsPoiCategory2)) {
                aVar.i = goodsPoiCategory2;
                aVar.j = i;
                if (goodsPoiCategory2.isShowMore) {
                    aVar.f.setVisibility(0);
                } else {
                    aVar.f.setVisibility(8);
                }
                aVar.c.b_(goodsPoiCategory2.spus);
                if (com.sankuai.shangou.stone.util.a.a((List) aVar.i.spus) <= 2) {
                    aVar.g.getLayoutParams().height = com.sankuai.shangou.stone.util.h.a(aVar.b.j(), 94.0f);
                } else {
                    aVar.g.getLayoutParams().height = com.sankuai.shangou.stone.util.h.a(aVar.b.j(), 167.0f);
                }
                boolean z = aVar.i.isShowMore;
                Object[] objArr7 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.store.goods.list.viewblocks.experimental.controller.a.a;
                if (PatchProxy.isSupport(objArr7, aVar, changeQuickRedirect7, false, "763b64c64e146dbb8581238414b2e4e2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, aVar, changeQuickRedirect7, false, "763b64c64e146dbb8581238414b2e4e2");
                } else if (!z) {
                    aVar.e.setOnTouchListener(null);
                } else {
                    aVar.e.setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.experimental.controller.a.2
                        public static ChangeQuickRedirect a;
                        public int b;
                        public int c;
                        public float d;
                        public boolean e = false;

                        {
                            this.b = h.a(a.this.b.j(), 100.0f);
                            this.c = h.a(a.this.b.j(), 50.0f);
                        }

                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            Object[] objArr8 = {view, motionEvent};
                            ChangeQuickRedirect changeQuickRedirect8 = a;
                            if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "605a51672b47220f548b3779e7612ced", RobustBitConfig.DEFAULT_VALUE)) {
                                return ((Boolean) PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "605a51672b47220f548b3779e7612ced")).booleanValue();
                            }
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) a.this.g.getLayoutParams();
                            switch (motionEvent.getAction()) {
                                case 1:
                                    if (this.e) {
                                        a.a(a.this, 1);
                                        this.e = false;
                                    }
                                    marginLayoutParams.leftMargin = h.a(a.this.b.j(), 28.0f);
                                    a.this.g.setText(R.string.wm_sc_common_left_load_more);
                                    a.this.g.requestLayout();
                                    break;
                                case 2:
                                    if (a.this.c.getItemCount() == a.this.d.findLastVisibleItemPosition()) {
                                        float rawX = this.d - motionEvent.getRawX();
                                        if (marginLayoutParams.leftMargin < this.b && rawX > 0.0f) {
                                            marginLayoutParams.leftMargin = (int) (marginLayoutParams.leftMargin + (rawX / 2.0f));
                                        }
                                        if (marginLayoutParams.leftMargin >= this.c) {
                                            a.this.g.setText(R.string.wm_sc_common_drop_load_more);
                                            this.e = true;
                                        } else {
                                            this.e = false;
                                            a.this.g.setText(R.string.wm_sc_common_left_load_more);
                                        }
                                        a.this.g.requestLayout();
                                    }
                                    this.d = motionEvent.getRawX();
                                    break;
                            }
                            return false;
                        }
                    });
                }
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("poi_id", this.m.d());
        hashMap.put("floor_id", Long.valueOf(this.s.floorId));
        hashMap.put("floor_index", Integer.valueOf(i));
        this.x.a(this.s.saleCampaignGatherList, new com.sankuai.waimai.store.goods.list.statistics.a(((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o).j(), com.sankuai.waimai.store.manager.judas.b.a((Object) ((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o).j()), hashMap));
    }

    public static j a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "171d87fdb23d7ee06920fa1717061f22", RobustBitConfig.DEFAULT_VALUE)) {
            return (j) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "171d87fdb23d7ee06920fa1717061f22");
        }
        if (i == 1) {
            return new a();
        }
        if (i == 10) {
            return new g();
        }
        return new j();
    }

    public void b(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccf1e9c37d5c19180fdded70a2f579d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccf1e9c37d5c19180fdded70a2f579d3");
        } else if (p.a(goodsPoiCategory) || p.a(goodsPoiCategory.floorBgPicUrl)) {
        } else {
            if (this.f == 0 && goodsPoiCategory.floorNumber == 5) {
                this.g.setVisibility(0);
            } else {
                this.g.setVisibility(8);
            }
            if (this.j != null) {
                this.h.setBackground(this.j);
            }
            m.a(goodsPoiCategory.floorBgPicUrl).a(new TopScaleBitmapTransformation()).a(this.e);
        }
    }

    public void c(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d824e8639ff031fc99533c92e2cec8bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d824e8639ff031fc99533c92e2cec8bd");
        } else {
            this.v.setText(goodsPoiCategory.name);
        }
    }

    public void a(final GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2baca6196303347228f9cd75a24d42d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2baca6196303347228f9cd75a24d42d");
        } else if (goodsPoiCategory.isShowMore) {
            this.d.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.j.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "153fd87aaae2ebe6a362bc95aedf283f", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "153fd87aaae2ebe6a362bc95aedf283f");
                    } else if (p.a(goodsPoiCategory)) {
                    } else {
                        com.sankuai.waimai.store.manager.judas.b.a(((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) j.this.o).k(), "b_7ql4i0d7").a(AppUtil.generatePageInfoKey(((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) j.this.o).j())).a("poi_id", ((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) j.this.o).i().d()).a("floor_id", Long.valueOf(goodsPoiCategory.floorId)).a("floor_index", Integer.valueOf(j.this.f)).a("poi_tag_text", j.this.i()).a("type", 1).a();
                        com.sankuai.waimai.store.router.d.a(((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) j.this.o).j(), goodsPoiCategory.scheme);
                    }
                }
            });
            this.d.setVisibility(0);
        } else {
            this.d.setVisibility(8);
        }
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void a(GoodsSpu goodsSpu, com.sankuai.waimai.store.util.h hVar, int i) {
        Object[] objArr = {goodsSpu, hVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdca0a258912333a94022c237133d414", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdca0a258912333a94022c237133d414");
        } else if (goodsSpu == null || this.m == null) {
        } else {
            com.sankuai.waimai.store.manager.judas.b.a(((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o).k(), "b_o4cmatay").a(((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o).j()).a("poi_id", this.m.d()).a("floor_id", Long.valueOf(this.s == null ? -1L : this.s.floorId)).a("floor_index", Integer.valueOf(this.r)).a("product_id", Long.valueOf(goodsSpu.getId())).a("product_index", Integer.valueOf(i)).a("final_price", Integer.valueOf(k.b(this.m.b, goodsSpu) != null ? 1 : 0)).a("sg_spu_tag", Integer.valueOf(goodsSpu.isFreeget ? 1 : 0)).a("activity_id", goodsSpu.isFreeget ? goodsSpu.activityID : "").a("food_activity_type", Integer.valueOf(goodsSpu.activityType)).a("stid", com.sankuai.waimai.store.util.j.a(goodsSpu.getPicture())).a("poi_tag_text", i()).a("stid", j()).a("sku_id", Long.valueOf(b(goodsSpu))).a("deal_id", Long.valueOf(b(goodsSpu))).a("spu_search_type", Integer.valueOf(goodsSpu.spuSearchType)).a();
            com.sankuai.waimai.store.router.g.a(((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o).j(), goodsSpu, this.m.b, hVar);
        }
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void a(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02e9f544de9042148cc7a5d7481facb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02e9f544de9042148cc7a5d7481facb7");
            return;
        }
        try {
            com.sankuai.waimai.store.manager.judas.b.a(((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o).k(), "b_i14jpkmy").a(((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o).j()).a("poi_id", this.m.d()).a("floor_id", Long.valueOf(this.s.floorId)).a("floor_index", Integer.valueOf(this.r)).a("spu_id", Long.valueOf(goodsSpu.getId())).a(KernelConfig.KEY_CONTAINER_TYPE, 4).a("product_index", Integer.valueOf(i)).a();
            ((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o).a(((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o).j(), goodsSpu, null);
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
        }
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void a(GoodsSpu goodsSpu, View view, com.sankuai.waimai.store.util.h hVar, int i) {
        Object[] objArr = {goodsSpu, view, hVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0f5b638216d9cafc4bf9d7126261630", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0f5b638216d9cafc4bf9d7126261630");
        } else if (this.m == null) {
        } else {
            com.sankuai.waimai.store.manager.judas.b.a(((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o).k(), "b_fvpawmpp").a(((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o).j()).a("sku_id", com.sankuai.waimai.store.helper.b.a(goodsSpu)).a("poi_id", this.m.d()).a("floor_id", Long.valueOf(this.s == null ? -1L : this.s.floorId)).a("floor_index", Integer.valueOf(this.r)).a("spu_id", Long.valueOf(goodsSpu.getId())).a("product_id", Long.valueOf(goodsSpu.getId())).a("product_index", Integer.valueOf(i)).a("final_price", Integer.valueOf(k.b(this.m.b, goodsSpu) != null ? 1 : 0)).a("spu_search_type", Integer.valueOf(goodsSpu.spuSearchType)).a();
            ((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o).a(((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o).j(), view, this.m.d(), goodsSpu);
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g, com.sankuai.waimai.store.newwidgets.list.h
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79663ef876995d7a1698ae7bceba7e5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79663ef876995d7a1698ae7bceba7e5a");
            return;
        }
        super.g();
        if (this.z != null) {
            this.z.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9a0fce31a3abc626a8c04ae886cbf32", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9a0fce31a3abc626a8c04ae886cbf32");
        }
        if (c() == null || c().b == null) {
            return "";
        }
        if (com.sankuai.shangou.stone.util.a.b(c().b.getDynamicShortLabels()) && com.sankuai.shangou.stone.util.a.b(c().b.getLabelInfoList())) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (!com.sankuai.shangou.stone.util.a.b(c().b.getDynamicShortLabels())) {
            for (Poi.NewLabelInfoListItem newLabelInfoListItem : c().b.getDynamicShortLabels()) {
                if (newLabelInfoListItem != null && !com.sankuai.shangou.stone.util.a.b(newLabelInfoListItem.subTagBaseInfoList) && !p.a(newLabelInfoListItem.subTagBaseInfoList.get(0))) {
                    sb.append(1);
                    sb.append("#");
                    sb.append(newLabelInfoListItem.businessType);
                    sb.append("#");
                    sb.append(newLabelInfoListItem.subTagBaseInfoList.get(0).h);
                    sb.append(CommonConstant.Symbol.COMMA);
                }
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        } else if (!com.sankuai.shangou.stone.util.a.b(c().b.getActivityInfoList())) {
            for (Poi.LabelInfoListItem labelInfoListItem : c().b.getLabelInfoList()) {
                if (labelInfoListItem != null) {
                    sb.append(1);
                    sb.append("#");
                    sb.append(labelInfoListItem.type);
                    sb.append("#");
                    sb.append(labelInfoListItem.content);
                    sb.append(CommonConstant.Symbol.COMMA);
                }
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return sb.toString();
    }

    private long b(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6ebaefebafec1d25ead1a21470c8b61", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6ebaefebafec1d25ead1a21470c8b61")).longValue();
        }
        if (goodsSpu == null || goodsSpu.isManySku() || com.sankuai.waimai.foundation.utils.b.a(goodsSpu.getSkus(), 0) == null) {
            return -999L;
        }
        return goodsSpu.getSkus().get(0).id;
    }

    private String j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fca973641a571eefedb8193e314947a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fca973641a571eefedb8193e314947a") : (c() == null || c().b == null) ? "" : c().b.abExpInfo;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "689e259fcb92d3e6d9c507f1c3083cd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "689e259fcb92d3e6d9c507f1c3083cd2");
            return;
        }
        this.l = (FrameLayout) view.findViewById(R.id.fl_mach_floor_container);
        this.c = (FrameLayout) view.findViewById(R.id.fl_native_floor_container);
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "08644e2b20a3df6602940c6f3e470c31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "08644e2b20a3df6602940c6f3e470c31");
        } else {
            this.y = new com.sankuai.waimai.store.goods.list.viewblocks.experimental.controller.a(this, (com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o, this);
            this.v = (TextView) view.findViewById(R.id.wm_sc_tv_floor_title);
            this.w = (TextView) view.findViewById(R.id.wm_sc_tv_tip);
            this.h = view.findViewById(R.id.rl_root);
            this.g = view.findViewById(R.id.white_view);
            this.e = (ImageView) view.findViewById(R.id.wm_sc_iv_floor_bg_pic);
            this.d = (TextView) view.findViewById(R.id.wm_sc_tv_more);
            a(this.d);
            this.x = (OnSaleUnionView) view.findViewById(R.id.on_sale_view);
            final com.sankuai.waimai.store.goods.list.viewblocks.experimental.controller.a aVar = this.y;
            Object[] objArr3 = {view};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.goods.list.viewblocks.experimental.controller.a.a;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "e3845014d673d5f3d6d18ef1cfba0f75", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "e3845014d673d5f3d6d18ef1cfba0f75");
            } else {
                aVar.e = (SCRecyclerView) view.findViewById(R.id.rv_physical_type);
                aVar.d = new LinearLayoutManager(aVar.b.j());
                aVar.d.setOrientation(0);
                aVar.e.setLayoutManager(aVar.d);
                aVar.e.setOrientation(0);
                aVar.e.setDispatchNestedPreFling(false);
                aVar.e.setNestedScrollingEnabled(false);
                aVar.c = new com.sankuai.waimai.store.goods.list.viewblocks.experimental.adapter.b(aVar.k, aVar, aVar.h);
                aVar.f = LayoutInflater.from(aVar.b.j()).inflate(R.layout.wm_sc_goods_list_floor_more, (ViewGroup) null, false);
                aVar.g = (TextView) aVar.f.findViewById(R.id.txt_floor_more);
                aVar.f.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.experimental.controller.a.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        Object[] objArr4 = {view2};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "322dd85912d5fab23387ac80a68b6341", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "322dd85912d5fab23387ac80a68b6341");
                        } else {
                            a.a(a.this, 2);
                        }
                    }
                });
                aVar.e.b(aVar.f);
                aVar.e.setAdapter((com.sankuai.waimai.store.newwidgets.list.f<?, ?>) aVar.c);
            }
            this.m = ((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o).i();
            if (this.g != null) {
                this.g.setBackground(com.sankuai.waimai.store.util.e.b(this.g.getContext(), new int[]{R.color.wm_sg_color_FFFFFF, R.color.wm_sg_color_F5F5F6}, (int) R.dimen.wm_sc_common_dimen_0));
            }
            this.u = new com.sankuai.waimai.store.expose.v2.entity.b("b_qowv75gj", this.c);
            com.sankuai.waimai.store.expose.v2.b.a().a(((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o).j(), this.u);
            if (this.i == null) {
                this.i = new e.a().a(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{com.sankuai.waimai.store.util.b.b(((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o).j(), R.color.wm_sg_color_FFE6E6), com.sankuai.waimai.store.util.b.b(((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o).j(), R.color.white)}).a(com.sankuai.shangou.stone.util.h.a(((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o).j(), 12.0f)).a();
            }
            this.h.setBackground(this.i);
            if (this.j == null) {
                this.j = new e.a().c(com.sankuai.waimai.store.util.b.b(((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o).j(), R.color.white)).a(com.sankuai.shangou.stone.util.h.a(((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o).j(), 12.0f)).a();
            }
            if (this.k == null) {
                this.k = new e.a().c(com.sankuai.waimai.store.util.b.b(((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o).j(), R.color.wm_sg_color_ffd161)).a(com.sankuai.shangou.stone.util.h.a(((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o).j(), 8.0f)).a();
            }
        }
        Object[] objArr4 = {view};
        ChangeQuickRedirect changeQuickRedirect4 = b;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "84e41d11e359eda1e4bc12e7e004cc00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "84e41d11e359eda1e4bc12e7e004cc00");
            return;
        }
        this.z = new com.sankuai.waimai.store.goods.list.viewblocks.strollaround.e(((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o).j(), ((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o).g());
        this.z.createAndReplaceView(this.l);
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.impl.c
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52bef40b6e33c6f4da57cc8b1ee38064", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52bef40b6e33c6f4da57cc8b1ee38064")).booleanValue();
        }
        if (p.a(this.t)) {
            return true;
        }
        return this.t.i;
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.impl.c
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6c5160c0a572834ee8f28eea176a8bf", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.platform.domain.manager.poi.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6c5160c0a572834ee8f28eea176a8bf") : ((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o).i();
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.impl.c
    public final SCBaseActivity d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b26b1fbaab44172cf88d3507a08f8e56", RobustBitConfig.DEFAULT_VALUE) ? (SCBaseActivity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b26b1fbaab44172cf88d3507a08f8e56") : ((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o).j();
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.impl.c
    public final com.sankuai.shangou.stone.whiteboard.e e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbc54e8a6af3d013587faf84dde19f08", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.shangou.stone.whiteboard.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbc54e8a6af3d013587faf84dde19f08") : ((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o).m();
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.impl.c
    public final String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e20276573b8acce66c25c5fa86c61cb", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e20276573b8acce66c25c5fa86c61cb") : ((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o).k();
    }

    public void c(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a940e9e4d9147be9c07cb2ffa32c6c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a940e9e4d9147be9c07cb2ffa32c6c0");
        } else {
            ((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o).a(goodsSpu, i);
        }
    }
}
