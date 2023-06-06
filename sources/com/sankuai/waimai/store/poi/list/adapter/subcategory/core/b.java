package com.sankuai.waimai.store.poi.list.adapter.subcategory.core;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.android.recce.views.anim.RecceAnimUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.platform.domain.core.poi.CategoryInfo;
import com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.c;
import com.sankuai.waimai.store.repository.model.PoiChannelBackgroundConfig;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.m;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.store.poi.list.adapter.subcategory.core.a<g> {
    public static ChangeQuickRedirect a;
    private Drawable C;
    final com.sankuai.waimai.store.param.a b;
    int c;
    List<CategoryInfo> d;
    Context e;
    int f;
    int g;
    com.sankuai.waimai.store.poi.list.adapter.subcategory.a h;
    com.sankuai.waimai.store.poi.list.adapter.subcategory.b i;
    Drawable j;
    Drawable k;
    Drawable l;
    boolean m;
    int n;
    public boolean o;
    public boolean p;
    public g q;
    public f r;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.poi.list.adapter.subcategory.core.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1267b {
        void a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface f {
        void a(boolean z);
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final /* synthetic */ void a(com.sankuai.waimai.store.widgets.recycler.e eVar, int i) {
        g gVar = (g) eVar;
        Object[] objArr = {gVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19ebb29761c75d77d5267f52fd732d22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19ebb29761c75d77d5267f52fd732d22");
            return;
        }
        CategoryInfo categoryInfo = (CategoryInfo) com.sankuai.shangou.stone.util.a.a((List<Object>) this.d, i);
        if (categoryInfo == null) {
            return;
        }
        gVar.a(categoryInfo, i);
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba6f1b986b771470cb303d7c8d1e3379", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba6f1b986b771470cb303d7c8d1e3379");
            return;
        }
        this.m = false;
        if (com.sankuai.shangou.stone.util.a.b(this.d)) {
            return;
        }
        for (CategoryInfo categoryInfo : this.d) {
            if (categoryInfo != null && categoryInfo.tagIconType > 0 && !t.a(categoryInfo.tagIcon)) {
                this.m = true;
                return;
            }
        }
    }

    public b(com.sankuai.waimai.store.param.a aVar, @NonNull c.a aVar2, Context context, int i) {
        Object[] objArr = {aVar, aVar2, context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73fca5ef8a062779a4173eabd9f4604d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73fca5ef8a062779a4173eabd9f4604d");
            return;
        }
        this.m = false;
        this.n = 1;
        this.o = false;
        this.p = false;
        this.n = aVar2.c;
        this.b = aVar;
        this.d = aVar2.a;
        this.c = a(this.d);
        this.e = context;
        this.f = i;
        d();
        c();
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78de048a6f50a91ed01bc43cb0e87fcb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78de048a6f50a91ed01bc43cb0e87fcb");
        } else {
            a(this.e.getResources().getColor(R.color.wm_sg_color_FCD59E), this.e.getResources().getColor(R.color.wm_sg_color_FEF4D5));
        }
    }

    private void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df2f973720a82c63f80c2f93c6242fda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df2f973720a82c63f80c2f93c6242fda");
            return;
        }
        this.j = new e.a().a(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i, i2}).a(h.a(this.e, 18.0f)).a();
        if (this.k == null) {
            this.k = new e.a().a(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{com.sankuai.shangou.stone.util.d.a("#E7EAF1", -1), com.sankuai.shangou.stone.util.d.a("#F5F8FE", -1)}).a(h.a(this.e, 18.0f)).a();
        }
        this.C = new e.a().a(this.e.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_10)).a(GradientDrawable.Orientation.TL_BR, new int[]{i, i2}).a();
        this.l = new e.a().a(GradientDrawable.Orientation.TL_BR, new int[]{i, i2}).a();
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27c8b0f176356c82fc08d81defed06bd", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27c8b0f176356c82fc08d81defed06bd")).intValue() : com.sankuai.shangou.stone.util.a.a((List) this.d);
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5225a2c8c1085df19229588cdc1c038", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5225a2c8c1085df19229588cdc1c038")).intValue();
        }
        if (this.n == 1) {
            return 1;
        }
        if (this.n == 5) {
            return 5;
        }
        return this.n == 6 ? 6 : 2;
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final com.sankuai.waimai.store.widgets.recycler.e a(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98bc7eb3c5a16451867ffc48726b67c3", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.widgets.recycler.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98bc7eb3c5a16451867ffc48726b67c3");
        }
        if (i == 1) {
            this.q = new d(LayoutInflater.from(this.e).inflate(R.layout.wm_st_common_layout_tab_layout_item_single_tips, viewGroup, false));
        } else if (i == 5) {
            this.q = new e(LayoutInflater.from(this.e).inflate(R.layout.wm_st_common_layout_tab_layout_item_single_txt, viewGroup, false));
        } else if (i == 6) {
            this.q = new a(LayoutInflater.from(this.e).inflate(R.layout.wm_st_common_layout_tab_layout_item_horizontal_icon_text, viewGroup, false));
        } else {
            this.q = new c(LayoutInflater.from(this.e).inflate(R.layout.wm_st_common_layout_tab_layout_item_single_icon, viewGroup, false));
        }
        return this.q;
    }

    @Override // com.sankuai.waimai.store.poi.list.adapter.subcategory.core.a
    public final void a(com.sankuai.waimai.store.poi.list.adapter.subcategory.a aVar) {
        this.h = aVar;
    }

    @Override // com.sankuai.waimai.store.poi.list.adapter.subcategory.core.a
    public final void a(com.sankuai.waimai.store.poi.list.model.b bVar) {
        com.sankuai.waimai.store.poi.list.adapter.subcategory.b bVar2;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed829f475a5ca51ffbf27b6be415c210", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed829f475a5ca51ffbf27b6be415c210");
            return;
        }
        Context context = this.e;
        PoiChannelBackgroundConfig poiChannelBackgroundConfig = bVar.a;
        PoiVerticalityDataResponse.Promotion promotion = bVar.d;
        int i = this.n;
        boolean z = this.b.Y;
        Object[] objArr2 = {context, poiChannelBackgroundConfig, promotion, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.poi.list.adapter.subcategory.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "8377edfc1d6af3d2b85586a7376e2934", RobustBitConfig.DEFAULT_VALUE)) {
            bVar2 = (com.sankuai.waimai.store.poi.list.adapter.subcategory.b) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "8377edfc1d6af3d2b85586a7376e2934");
        } else {
            com.sankuai.waimai.store.poi.list.adapter.subcategory.b bVar3 = new com.sankuai.waimai.store.poi.list.adapter.subcategory.b();
            bVar3.b = 12;
            bVar3.c = 12;
            bVar3.d = context.getResources().getColor(R.color.wm_sg_color_666666);
            bVar3.k = context.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_25);
            bVar3.m = null;
            if (poiChannelBackgroundConfig != null) {
                bVar3.g = com.sankuai.shangou.stone.util.d.a(poiChannelBackgroundConfig.subCateTextSelectedBgColorFrm, -26367);
                bVar3.h = com.sankuai.shangou.stone.util.d.a(poiChannelBackgroundConfig.subCateTextSelectedBgColorTo, -32256);
                bVar3.m = new e.a().a(context.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_3)).a(GradientDrawable.Orientation.TL_BR, new int[]{bVar3.g, bVar3.h}).a();
                Integer a2 = com.sankuai.shangou.stone.util.d.a(poiChannelBackgroundConfig.iconSelectedColorFrm);
                Integer a3 = com.sankuai.shangou.stone.util.d.a(poiChannelBackgroundConfig.iconSelectedColorTo);
                bVar3.l = com.sankuai.shangou.stone.util.d.a(poiChannelBackgroundConfig.iconSelectedFontColor, -32256);
                bVar3.e = bVar3.l;
                bVar3.i = com.sankuai.shangou.stone.util.d.a(poiChannelBackgroundConfig.iconSelectedFontColor, -14539738);
                if (a2 != null && a3 != null) {
                    bVar3.n = com.sankuai.waimai.store.util.e.a(context, new int[]{a2.intValue(), a3.intValue()}, R.dimen.wm_sc_common_dimen_30, GradientDrawable.Orientation.TOP_BOTTOM);
                }
                if (!TextUtils.isEmpty(poiChannelBackgroundConfig.subCatIndicatorUrl)) {
                    bVar3.r = poiChannelBackgroundConfig.subCatIndicatorUrl;
                }
            }
            if (i == 2 && promotion != null) {
                com.sankuai.waimai.store.poi.list.adapter.subcategory.b.a(promotion, z, bVar3, false);
            }
            bVar2 = bVar3;
        }
        this.i = bVar2;
        PoiChannelBackgroundConfig poiChannelBackgroundConfig2 = bVar.a;
        PoiVerticalityDataResponse.Promotion promotion2 = bVar.d;
        Object[] objArr3 = {poiChannelBackgroundConfig2, promotion2};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e237bec2e6c5ddb76e9072f3c2ddf807", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e237bec2e6c5ddb76e9072f3c2ddf807");
            return;
        }
        if (poiChannelBackgroundConfig2 == null) {
            d();
        } else {
            Integer a4 = com.sankuai.shangou.stone.util.d.a(poiChannelBackgroundConfig2.iconSelectedColorFrm);
            Integer a5 = com.sankuai.shangou.stone.util.d.a(poiChannelBackgroundConfig2.iconSelectedColorTo);
            if (a4 != null && a5 != null) {
                a(a4.intValue(), a5.intValue());
                this.C = new e.a().a(this.e.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_10)).a(GradientDrawable.Orientation.TL_BR, new int[]{this.i.g, this.i.h}).a();
                this.l = new e.a().a(GradientDrawable.Orientation.TL_BR, new int[]{this.i.g, this.i.h}).a();
            }
        }
        a(promotion2);
    }

    private void a(PoiVerticalityDataResponse.Promotion promotion) {
        Object[] objArr = {promotion};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb092e6845f29d79fbe348ef630bbd8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb092e6845f29d79fbe348ef630bbd8d");
        } else if (promotion == null || promotion.buttonArea == null || t.a(promotion.buttonArea.startColor) || t.a(promotion.buttonArea.endColor)) {
        } else {
            this.C = new e.a().a(this.e.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_10)).a(GradientDrawable.Orientation.TL_BR, new int[]{this.i.g, this.i.h}).a();
            this.l = new e.a().a(GradientDrawable.Orientation.TL_BR, new int[]{this.i.g, this.i.h}).a();
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.adapter.subcategory.core.a
    public final void a(List<CategoryInfo> list, int i) {
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87753d949df4d00b779b94cb4d9ad160", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87753d949df4d00b779b94cb4d9ad160");
            return;
        }
        this.f = i;
        this.c = a(list);
        this.d = list;
        c();
        m();
        com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.widgets.topfloatview.a(Long.valueOf(list.get(i).code).longValue()));
    }

    @Override // com.sankuai.waimai.store.poi.list.adapter.subcategory.core.a
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ade97d50839ea75df393cb2eaf2cc936", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ade97d50839ea75df393cb2eaf2cc936");
            return;
        }
        super.a(z);
        if ((this.o == z || !(this.q instanceof c)) && this.n != 6) {
            return;
        }
        this.o = z;
        m();
    }

    @Override // com.sankuai.waimai.store.poi.list.adapter.subcategory.core.a
    public final int b() {
        Context context;
        float f2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd1fd6aedcedd001f395407b5bfa56f1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd1fd6aedcedd001f395407b5bfa56f1")).intValue();
        }
        if ((this.n == 2 || this.n == 4 || this.n == 6) && !this.b.h()) {
            if (this.b.aS) {
                context = this.e;
                f2 = 23.0f;
            } else {
                context = this.e;
                f2 = 27.0f;
            }
            return h.a(context, f2);
        }
        return 0;
    }

    private int a(List<CategoryInfo> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "740a9706127fcb107340bc2678896f13", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "740a9706127fcb107340bc2678896f13")).intValue();
        }
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class g extends com.sankuai.waimai.store.widgets.recycler.e {
        public static ChangeQuickRedirect f;
        public ImageView g;
        public TextView h;
        public ImageView i;
        public View j;
        public ImageView k;
        public View l;
        public View m;
        public FrameLayout n;
        public View o;
        public ImageView p;
        public View q;

        public void a(CategoryInfo categoryInfo, int i) {
        }

        public g(View view) {
            super(view);
            Object[] objArr = {b.this, view};
            ChangeQuickRedirect changeQuickRedirect = f;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81473a58077f8209e40b9edef961a69a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81473a58077f8209e40b9edef961a69a");
            }
        }

        public final void b(final CategoryInfo categoryInfo, final int i) {
            Object[] objArr = {categoryInfo, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = f;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcd2350269ea556963da8f359022c785", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcd2350269ea556963da8f359022c785");
            } else if (b.this.h != null) {
                this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.poi.list.adapter.subcategory.core.b.g.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e72ecb7342467b6a080c923c7cceeeff", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e72ecb7342467b6a080c923c7cceeeff");
                        } else if (b.this.h != null) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("stid", b.this.b.T);
                            hashMap.put("template_type", Integer.valueOf(categoryInfo.template_code));
                            hashMap.put("index", Integer.valueOf(i));
                            b.this.h.a(g.this.itemView, i, hashMap);
                        }
                    }
                });
            }
        }

        public final void a(View view, CategoryInfo categoryInfo, int i) {
            int i2;
            int i3 = 0;
            Object[] objArr = {view, categoryInfo, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = f;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13cf096cc843607e15b410dd498b0d9c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13cf096cc843607e15b410dd498b0d9c");
            } else if (view == null || categoryInfo == null || !(b.this.e instanceof com.sankuai.waimai.store.expose.v2.a)) {
            } else {
                com.sankuai.waimai.store.expose.v2.entity.b a = com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) b.this.e, view);
                if (a == null) {
                    a = new com.sankuai.waimai.store.expose.v2.entity.c("b_y8flufhi", view);
                    com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) b.this.e, a);
                } else {
                    a.g();
                }
                a.e = "TabGrid" + b.this.b.c + String.valueOf(categoryInfo.code);
                a.a("cat_id", Long.valueOf(b.this.b.c));
                a.a("sec_cate_id", String.valueOf(categoryInfo.code));
                a.a("notice_type", Integer.valueOf(categoryInfo.tagIconType));
                a.a("stid", b.this.b.c());
                if (b.this.n == 6) {
                    i2 = 3;
                } else {
                    i2 = b.this.b.R == 1 ? 2 : 1;
                }
                a.a("media_type", Integer.valueOf(i2));
                a.a("template_type", Integer.valueOf(categoryInfo.template_code));
                a.a("index", Integer.valueOf(i));
                a.a("entry_type", Integer.valueOf(b.this.b.aS ? 1 : 0));
                if (b.this.n == 6) {
                    i3 = 2;
                } else if (!t.a(categoryInfo.icon_title)) {
                    i3 = 1;
                }
                a.a("label_type", Integer.valueOf(i3));
                a.a("click_status", Integer.valueOf(b.this.o ? 1 : 0));
            }
        }

        public final String a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = f;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53f6dca71cbe0562d2be796ccc6ea1ce", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53f6dca71cbe0562d2be796ccc6ea1ce");
            }
            if (TextUtils.isEmpty(str) || str.length() <= 6) {
                return str;
            }
            return str.substring(0, 5) + "...";
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class d extends g {
        public static ChangeQuickRedirect a;

        public d(View view) {
            super(view);
            Object[] objArr = {b.this, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cdfc523ed57431054ab7a65afd30067", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cdfc523ed57431054ab7a65afd30067");
                return;
            }
            this.h = (TextView) view.findViewById(R.id.tv_tablayout_item_name);
            this.i = (ImageView) view.findViewById(R.id.iv_tablayout_item_icon_title);
            this.j = view.findViewById(R.id.rl_tab_layout_root);
            this.k = (ImageView) view.findViewById(R.id.iv_tag_icon_text_type);
            this.n = (FrameLayout) view.findViewById(R.id.fl_poi_tab_title_container);
            this.p = (ImageView) view.findViewById(R.id.iv_ll_tablayout_pic_indicator);
            this.m = view.findViewById(R.id.v_tablayout_item_indicator_short);
            this.q = view.findViewById(R.id.ll_tablayout_item_desc);
        }

        @Override // com.sankuai.waimai.store.poi.list.adapter.subcategory.core.b.g
        public final void a(final CategoryInfo categoryInfo, final int i) {
            Object[] objArr = {categoryInfo, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "515936bfc4525b0ec555771b6c7b51d0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "515936bfc4525b0ec555771b6c7b51d0");
                return;
            }
            super.a(categoryInfo, i);
            b(categoryInfo, i);
            a(this.itemView, categoryInfo, i);
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6bbfcdd3ad3ae7fdeca30bcf4f3cd82c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6bbfcdd3ad3ae7fdeca30bcf4f3cd82c");
            } else {
                if (TextUtils.isEmpty(b.this.i.r)) {
                    u.c(this.p);
                    u.a(this.m);
                } else {
                    u.c(this.m);
                    u.a(this.p);
                }
                if (b.this.f == i) {
                    if (!TextUtils.isEmpty(b.this.i.r)) {
                        b.C0608b a2 = m.a(b.this.i.r, h.a(b.this.e, 11.0f), h.a(b.this.e, 6.0f), ImageQualityUtil.a());
                        a2.g = false;
                        a2.i = R.drawable.wm_sc_sub_indicator_default;
                        a2.j = R.drawable.wm_sc_sub_indicator_default;
                        a2.a(this.p);
                    }
                    if (b.this.i.m != null) {
                        this.m.setBackground(b.this.i.m);
                    } else {
                        e.a aVar = new e.a();
                        aVar.a(b.this.e.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_3)).c(b.this.i.l);
                        this.m.setBackground(aVar.a());
                    }
                } else {
                    this.m.setBackground(com.sankuai.waimai.store.util.e.b(b.this.e, (int) R.color.transparent, (int) R.dimen.wm_sc_common_dimen_3));
                    this.p.setImageDrawable(com.sankuai.waimai.store.util.e.b(b.this.e, (int) R.color.transparent, (int) R.dimen.wm_sc_common_dimen_3));
                }
            }
            if (!t.a(categoryInfo.icon_title)) {
                u.c(this.h);
                u.a(this.i);
                m.b(categoryInfo.icon_title, h.a(b.this.e, 24.0f), ImageQualityUtil.a()).a(new b.d() { // from class: com.sankuai.waimai.store.poi.list.adapter.subcategory.core.b.d.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mtimageloader.config.b.d
                    public final void a() {
                    }

                    @Override // com.sankuai.meituan.mtimageloader.config.b.d
                    public final void a(int i2, Exception exc) {
                        Object[] objArr3 = {Integer.valueOf(i2), exc};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "97445afef88ed08ebc5aeb52dd8f3c48", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "97445afef88ed08ebc5aeb52dd8f3c48");
                        } else {
                            d.this.c(categoryInfo, i);
                        }
                    }
                }).a(this.i);
            } else {
                c(categoryInfo, i);
            }
            if (categoryInfo.tagIconType > 0) {
                u.a(this.k);
                m.a(categoryInfo.tagIcon, this.k, h.a(b.this.e, 16.0f), ImageQualityUtil.a());
            } else {
                this.k.setVisibility(b.this.m ? 4 : 8);
            }
            RecyclerView.g gVar = (RecyclerView.g) this.j.getLayoutParams();
            gVar.leftMargin = i == 0 ? h.a(b.this.e, 12.0f) : 0;
            this.j.setLayoutParams(gVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(CategoryInfo categoryInfo, int i) {
            Object[] objArr = {categoryInfo, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "066aacb1252642e43d4cdced5fb54515", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "066aacb1252642e43d4cdced5fb54515");
                return;
            }
            u.c(this.i);
            u.a(this.h);
            u.a(this.h, true);
            this.h.setText(a(categoryInfo.name));
            this.h.setTextColor(com.sankuai.waimai.store.util.b.b(b.this.e, b.this.f == i ? R.color.wm_sg_color_222426 : R.color.wm_sg_color_575859));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class c extends g {
        public static ChangeQuickRedirect a;
        public TextView b;
        public FrameLayout c;
        public ImageView d;

        public static /* synthetic */ int a(c cVar, TextView textView) {
            Object[] objArr = {textView};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "18f1ec7894b8aed0b4d6161d2991c944", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "18f1ec7894b8aed0b4d6161d2991c944")).intValue() : (int) Layout.getDesiredWidth(textView.getText().toString(), 0, textView.getText().length(), textView.getPaint());
        }

        public c(View view) {
            super(view);
            Object[] objArr = {b.this, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10d4e83a6ef9fcceb52fbc74dfcba484", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10d4e83a6ef9fcceb52fbc74dfcba484");
                return;
            }
            this.h = (TextView) view.findViewById(R.id.tv_tablayout_item_name);
            this.b = (TextView) view.findViewById(R.id.tv_tablayout_item_name_indicator);
            this.i = (ImageView) view.findViewById(R.id.iv_tablayout_item_icon_title);
            this.j = view.findViewById(R.id.rl_tab_layout_root);
            this.n = (FrameLayout) view.findViewById(R.id.fl_poi_tab_title_container);
            this.k = (ImageView) view.findViewById(R.id.iv_tag_icon);
            this.l = view.findViewById(R.id.view_image_bg);
            this.g = (ImageView) view.findViewById(R.id.iv_poi_tab_image);
            this.o = view.findViewById(R.id.rl_left_container);
            this.c = (FrameLayout) view.findViewById(R.id.fl_item_name);
            this.d = (ImageView) view.findViewById(R.id.v_selected_bg);
        }

        @Override // com.sankuai.waimai.store.poi.list.adapter.subcategory.core.b.g
        public final void a(CategoryInfo categoryInfo, int i) {
            float f;
            float f2;
            int a2;
            Context context;
            float f3;
            Object[] objArr = {categoryInfo, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5ea112e82144b155aa0f8b012b80004", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5ea112e82144b155aa0f8b012b80004");
                return;
            }
            super.a(categoryInfo, i);
            b(categoryInfo, i);
            a(this.itemView, categoryInfo, i);
            View view = this.itemView;
            Object[] objArr2 = {view, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "48758dacc6582df7143407dd7407a7b8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "48758dacc6582df7143407dd7407a7b8");
            } else {
                this.o.setMinimumWidth(b.this.o ? h.a(b.this.e, 35.0f) : h.a(b.this.e, 50.0f));
                int a3 = h.a(b.this.e, 12.0f);
                RecyclerView.g gVar = (RecyclerView.g) view.getLayoutParams();
                gVar.leftMargin = 0;
                gVar.rightMargin = h.a(b.this.e, 16.0f);
                gVar.topMargin = b.this.o ? 0 : h.a(b.this.e, 4.0f);
                if (i == b.this.c - 1) {
                    gVar.rightMargin = a3;
                }
                if (i == 0) {
                    gVar.leftMargin = a3;
                }
                if (i == 5 && b.this.n == 4 && b.this.d.size() == 10) {
                    if (b.this.o) {
                        gVar.leftMargin = 0;
                    } else {
                        gVar.leftMargin = a3;
                    }
                }
                view.setLayoutParams(gVar);
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.n.getLayoutParams();
            layoutParams.topMargin = h.a(b.this.e, 5.0f);
            this.n.setLayoutParams(layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.d.getLayoutParams();
            DisplayMetrics displayMetrics = b.this.e.getResources().getDisplayMetrics();
            if ((displayMetrics != null ? displayMetrics.density : 2.0f) > 2.0d) {
                layoutParams2.topMargin = h.a(b.this.e, b.this.o ? 8.0f : 10.0f);
            }
            this.d.setLayoutParams(layoutParams2);
            m.a(b.this.o ? R.drawable.view_bg_selected_small : R.drawable.view_bg_selected, this.d);
            if (categoryInfo.tagIconType > 0) {
                u.a(this.k);
                m.b(categoryInfo.tagIcon, this.k, h.a(b.this.e, 24.0f));
            } else {
                u.b(this.k);
            }
            int a4 = h.a(b.this.e, 50.0f);
            b.C0608b a5 = m.a(categoryInfo.icon, a4, a4, ImageQualityUtil.a());
            a5.g = false;
            a5.i = R.drawable.wm_sc_kingkong_category_loading;
            a5.j = R.drawable.wm_sc_kingkong_category_loading;
            a5.a(this.g);
            Object[] objArr3 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "49892b43c2ad06cd33f95afbd051836a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "49892b43c2ad06cd33f95afbd051836a");
            } else if (i == b.this.f) {
                this.l.setBackground(b.this.j);
                this.d.setVisibility(0);
            } else {
                this.l.setBackground(b.this.k);
                this.d.setVisibility(8);
            }
            Object[] objArr4 = {categoryInfo, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "7eb0268b9310fe70f401caa170f46815", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "7eb0268b9310fe70f401caa170f46815");
            } else {
                if (b.this.i.o || b.this.f == i) {
                    u.a(this.h, true);
                } else {
                    u.a(this.h, false);
                }
                this.h.setText(a(categoryInfo.name));
                int a6 = h.a(b.this.e, 2.0f);
                int a7 = b.this.o ? 0 : h.a(b.this.e, 2.0f);
                int a8 = b.this.o ? 0 : h.a(b.this.e, 2.0f);
                if (b.this.f == i) {
                    this.h.setTextColor(b.this.i.i);
                    this.b.setBackground(b.this.l);
                    if (b.this.g != b.this.f) {
                        b.this.g = b.this.f;
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "f28390ecfe6387204a39a9a519700987", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "f28390ecfe6387204a39a9a519700987");
                        } else {
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.g, RecceAnimUtils.SCALE_X, 1.0f, 0.85f, 1.0f);
                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.g, RecceAnimUtils.SCALE_Y, 1.0f, 0.85f, 1.0f);
                            ofFloat.setDuration(200L);
                            ofFloat2.setDuration(200L);
                            ofFloat.start();
                            ofFloat2.start();
                        }
                    }
                } else {
                    this.h.setTextColor(b.this.i.f);
                    this.b.setBackgroundResource(R.color.wm_st_common_transparent);
                }
                this.h.setPadding(0, a7, 0, a8);
                ((ViewGroup.MarginLayoutParams) this.c.getLayoutParams()).setMargins(0, a6, 0, 0);
                ((ViewGroup.MarginLayoutParams) this.b.getLayoutParams()).setMargins(0, 0, 0, a8);
            }
            ViewGroup.LayoutParams layoutParams3 = this.g.getLayoutParams();
            if (b.this.o) {
                f = 35.0f;
                a2 = h.a(b.this.e, 35.0f);
                f2 = 50.0f;
            } else {
                f = 35.0f;
                f2 = 50.0f;
                a2 = h.a(b.this.e, 50.0f);
            }
            layoutParams3.height = a2;
            layoutParams3.width = b.this.o ? h.a(b.this.e, f) : h.a(b.this.e, f2);
            this.g.setLayoutParams(layoutParams3);
            ViewGroup.LayoutParams layoutParams4 = this.l.getLayoutParams();
            layoutParams4.height = b.this.o ? h.a(b.this.e, 26.0f) : h.a(b.this.e, 37.0f);
            layoutParams4.width = b.this.o ? h.a(b.this.e, f) : h.a(b.this.e, f2);
            this.l.setLayoutParams(layoutParams4);
            ViewGroup.LayoutParams layoutParams5 = this.d.getLayoutParams();
            layoutParams5.height = b.this.o ? h.a(b.this.e, 37.0f) : h.a(b.this.e, 53.0f);
            if (b.this.o) {
                context = b.this.e;
                f3 = 44.0f;
            } else {
                context = b.this.e;
                f3 = 63.0f;
            }
            layoutParams5.width = h.a(context, f3);
            this.d.setLayoutParams(layoutParams5);
            this.h.setTextSize(12.0f);
            this.itemView.setTranslationY(b.this.o ? h.a(b.this.e, 23.0f) : 0.0f);
            b.this.p = b.this.o;
            String str = categoryInfo.icon_title;
            final InterfaceC1267b interfaceC1267b = new InterfaceC1267b() { // from class: com.sankuai.waimai.store.poi.list.adapter.subcategory.core.b.c.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.poi.list.adapter.subcategory.core.b.InterfaceC1267b
                public final void a() {
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "4815ff6bce2ac3b33f0a1ab47c939034", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "4815ff6bce2ac3b33f0a1ab47c939034");
                        return;
                    }
                    u.c(c.this.i);
                    u.a(c.this.h);
                    c.this.b.getLayoutParams().width = c.a(c.this, c.this.h);
                }
            };
            Object[] objArr6 = {str, interfaceC1267b};
            ChangeQuickRedirect changeQuickRedirect6 = a;
            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "d03b2161cdfc3615a6413a848991a095", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "d03b2161cdfc3615a6413a848991a095");
            } else {
                if (!t.a(str)) {
                    u.c(this.h);
                    u.a(this.i);
                    try {
                        b.C0608b b = m.b(str, h.a(b.this.e, 15.0f), com.sankuai.waimai.foundation.utils.ImageQualityUtil.a());
                        b.g = false;
                        b.k = 4;
                        b.a(new b.a() { // from class: com.sankuai.waimai.store.poi.list.adapter.subcategory.core.b.c.2
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.meituan.mtimageloader.config.b.a
                            public final void a(Bitmap bitmap) {
                                Object[] objArr7 = {bitmap};
                                ChangeQuickRedirect changeQuickRedirect7 = a;
                                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "b6ca2d2a43eab1cbd07f1c65c81f499d", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "b6ca2d2a43eab1cbd07f1c65c81f499d");
                                } else if (bitmap != null && !bitmap.isRecycled()) {
                                    int width = bitmap.getWidth();
                                    int height = bitmap.getHeight();
                                    StringBuilder sb = new StringBuilder("width = ");
                                    sb.append(width);
                                    sb.append(", height = ");
                                    sb.append(height);
                                    c.this.b.getLayoutParams().width = width;
                                    c.this.i.setImageBitmap(bitmap);
                                } else {
                                    interfaceC1267b.a();
                                }
                            }

                            @Override // com.sankuai.meituan.mtimageloader.config.b.a
                            public final void a() {
                                Object[] objArr7 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect7 = a;
                                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "41fbf913bc3d0d2c956d6dfe34fe2f5a", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "41fbf913bc3d0d2c956d6dfe34fe2f5a");
                                } else {
                                    interfaceC1267b.a();
                                }
                            }
                        });
                    } catch (Exception unused) {
                    }
                }
                interfaceC1267b.a();
            }
            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) this.i.getLayoutParams();
            layoutParams6.topMargin = b.this.o ? h.a(b.this.e, 0.0f) : h.a(b.this.e, 2.0f);
            this.i.setLayoutParams(layoutParams6);
            if (b.this.r != null) {
                b.this.r.a(b.this.o);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class e extends g {
        public static ChangeQuickRedirect a;
        public TextView b;
        public FrameLayout c;

        public e(View view) {
            super(view);
            Object[] objArr = {b.this, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aafac98ec3c374cc8917176182588c00", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aafac98ec3c374cc8917176182588c00");
                return;
            }
            this.h = (TextView) view.findViewById(R.id.tv_tablayout_item_name);
            this.b = (TextView) view.findViewById(R.id.tv_tablayout_item_name_indicator);
            this.i = (ImageView) view.findViewById(R.id.iv_tablayout_item_icon_title);
            this.o = view.findViewById(R.id.rl_left_container);
            this.c = (FrameLayout) view.findViewById(R.id.fl_item_name);
        }

        @Override // com.sankuai.waimai.store.poi.list.adapter.subcategory.core.b.g
        public final void a(CategoryInfo categoryInfo, int i) {
            Object[] objArr = {categoryInfo, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e66b358fa27712399fdbef5a829c1bb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e66b358fa27712399fdbef5a829c1bb");
                return;
            }
            super.a(categoryInfo, i);
            b(categoryInfo, i);
            a(this.itemView, categoryInfo, i);
            View view = this.itemView;
            Object[] objArr2 = {view, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7b15c903486292d14370bd4c9dcb0cfa", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7b15c903486292d14370bd4c9dcb0cfa");
            } else {
                this.o.setMinimumWidth(h.a(b.this.e, 35.0f));
                int a2 = h.a(b.this.e, 12.0f);
                RecyclerView.g gVar = (RecyclerView.g) view.getLayoutParams();
                gVar.leftMargin = 0;
                gVar.rightMargin = h.a(b.this.e, 16.0f);
                if (i == b.this.c - 1) {
                    gVar.rightMargin = a2;
                }
                if (i == 0) {
                    gVar.leftMargin = a2;
                }
                view.setLayoutParams(gVar);
            }
            Object[] objArr3 = {categoryInfo, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "48d03011d66292dc27cf8f1af9eeb239", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "48d03011d66292dc27cf8f1af9eeb239");
            } else {
                if (b.this.i.o || b.this.f == i) {
                    u.a(this.h, true);
                    this.h.setTextSize(16.0f);
                } else {
                    u.a(this.h, false);
                    this.h.setTextSize(14.0f);
                }
                this.h.setText(a(categoryInfo.name));
                int a3 = h.a(b.this.e, 2.0f);
                int a4 = h.a(b.this.e, 2.0f);
                int a5 = h.a(b.this.e, 2.0f);
                if (b.this.f == i) {
                    this.h.setTextColor(b.this.i.i);
                    this.b.setBackground(b.this.l);
                } else {
                    this.h.setTextColor(b.this.i.f);
                    this.b.setBackgroundResource(R.color.wm_st_common_transparent);
                }
                this.h.setPadding(0, a4, 0, a5);
                ((ViewGroup.MarginLayoutParams) this.c.getLayoutParams()).setMargins(0, a3, 0, 0);
                ((ViewGroup.MarginLayoutParams) this.b.getLayoutParams()).setMargins(0, 0, 0, a5);
            }
            this.itemView.setTranslationY(0.0f);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class a extends g {
        public static ChangeQuickRedirect a;
        public View b;

        public a(View view) {
            super(view);
            Object[] objArr = {b.this, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98560ca9c3af7ca3a5355fc094d9e826", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98560ca9c3af7ca3a5355fc094d9e826");
                return;
            }
            this.g = (ImageView) view.findViewById(R.id.iv_poi_tab_image);
            this.h = (TextView) view.findViewById(R.id.tv_tablayout_item_name);
            this.b = view.findViewById(R.id.rl_tab_layout_container);
            this.j = view.findViewById(R.id.rl_tab_layout_root);
        }

        @Override // com.sankuai.waimai.store.poi.list.adapter.subcategory.core.b.g
        public final void a(CategoryInfo categoryInfo, int i) {
            e.a c;
            Object[] objArr = {categoryInfo, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be8cec217af0c36b5d9cf7e31306bd3c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be8cec217af0c36b5d9cf7e31306bd3c");
                return;
            }
            super.a(categoryInfo, i);
            b(categoryInfo, i);
            a(this.itemView, categoryInfo, i);
            Object[] objArr2 = {categoryInfo, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4a3ba203c393b96cc089072140832094", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4a3ba203c393b96cc089072140832094");
            } else {
                this.j.getLayoutParams().width = ((h.a(b.this.e) - (h.a(b.this.e, 20.0f) * 2)) - (h.a(b.this.e, 8.0f) * 3)) / 4;
                if (!t.a(categoryInfo.icon)) {
                    int a2 = h.a(b.this.e, 17.5f);
                    b.C0608b a3 = m.a(categoryInfo.icon, a2, a2, ImageQualityUtil.a());
                    a3.g = false;
                    a3.i = R.drawable.wm_sc_kingkong_category_loading;
                    a3.j = R.drawable.wm_sc_kingkong_category_loading;
                    a3.a(this.g);
                }
                String str = categoryInfo.name;
                if (!t.a(str)) {
                    if (str.length() > 4) {
                        str = str.substring(0, 4);
                    }
                    this.h.setText(str);
                }
                if (b.this.i.o || b.this.f == i) {
                    u.a(this.h, true);
                } else {
                    u.a(this.h, false);
                }
                float a4 = h.a(b.this.e, 14.0f);
                if (b.this.f == i) {
                    this.h.setTextColor(b.this.i.l);
                    c = new e.a().c(b.this.i.g);
                } else {
                    this.h.setTextColor(b.this.i.f);
                    c = new e.a().c(com.sankuai.waimai.store.util.b.b(b.this.e, R.color.wm_sg_color_FAFAFA));
                }
                c.a(a4, a4, a4, a4);
                this.b.setBackground(c.a());
            }
            this.itemView.setTranslationY(0.0f);
            if (b.this.r != null) {
                b.this.r.a(b.this.o);
            }
        }
    }
}
