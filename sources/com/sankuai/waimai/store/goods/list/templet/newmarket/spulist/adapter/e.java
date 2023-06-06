package com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodTopLabel;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.goods.ProductAttrLabel;
import com.sankuai.waimai.store.platform.domain.core.view.SingleColorLabelStyle;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.view.SCSingleLineFlowLayout;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    SCSingleLineFlowLayout b;
    ViewGroup c;
    TextView d;
    TextView e;

    public e(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5240fdd0a7061f7d14ae6ecacf700573", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5240fdd0a7061f7d14ae6ecacf700573");
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b471e9aa8040f39bc23ca0fa5e9e1d3", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b471e9aa8040f39bc23ca0fa5e9e1d3") : layoutInflater.inflate(R.layout.wm_st_poi_market_adapter_goods_child_product_label, viewGroup);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "342e1addb06399a903e846f6fca5c13c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "342e1addb06399a903e846f6fca5c13c");
            return;
        }
        super.onViewCreated();
        this.b = (SCSingleLineFlowLayout) findView(R.id.single_linear_layout);
        this.c = (ViewGroup) findView(R.id.ll_pre_sale_label_container);
        this.d = (TextView) findView(R.id.tv_pre_sale_title);
        this.e = (TextView) findView(R.id.tv_delivery_time);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static abstract class b {
        public static ChangeQuickRedirect b;
        public SCSingleLineFlowLayout c;
        @Nullable
        public View d;

        public abstract int a();

        public abstract void a(@NonNull GoodsSpu.GoodPropertyLabel goodPropertyLabel);

        public abstract void b();

        public b(@NonNull SCSingleLineFlowLayout sCSingleLineFlowLayout) {
            Object[] objArr = {sCSingleLineFlowLayout};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68c8e8cac504614daf3db92c1700aa21", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68c8e8cac504614daf3db92c1700aa21");
            } else {
                this.c = sCSingleLineFlowLayout;
            }
        }

        public final void b(GoodsSpu.GoodPropertyLabel goodPropertyLabel) {
            Object[] objArr = {goodPropertyLabel};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a373bed8a09a5dd0bee23bc0de60d96e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a373bed8a09a5dd0bee23bc0de60d96e");
                return;
            }
            LayoutInflater from = LayoutInflater.from(c());
            if (a() != -1) {
                this.d = from.inflate(a(), (ViewGroup) this.c, false);
                if (this.d != null) {
                    this.c.addView(this.d);
                }
            }
            b();
            try {
                a(goodPropertyLabel);
            } catch (Exception e) {
                com.sankuai.waimai.store.base.log.a.a(e);
            }
        }

        public final Context c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = b;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d355eb09e244869fefd73498d39971a6", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d355eb09e244869fefd73498d39971a6") : this.c.getContext();
        }

        public final <T extends View> T a(@IdRes int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = b;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99ef7518a203c75f20db3aac81cc0739", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99ef7518a203c75f20db3aac81cc0739") : (T) this.d.findViewById(i);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends b {
        public static ChangeQuickRedirect a = null;
        private static int e = 6;

        @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.e.b
        public final int a() {
            return -1;
        }

        @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.e.b
        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "331dec539c6db6184232e5582af882bc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "331dec539c6db6184232e5582af882bc");
            }
        }

        public a(@NonNull SCSingleLineFlowLayout sCSingleLineFlowLayout) {
            super(sCSingleLineFlowLayout);
            Object[] objArr = {sCSingleLineFlowLayout};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c19c46a1ac9c48c224230ae3c1bd8b6b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c19c46a1ac9c48c224230ae3c1bd8b6b");
            }
        }

        @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.e.b
        public final void a(@NonNull GoodsSpu.GoodPropertyLabel goodPropertyLabel) {
            TextView textView;
            char c = 1;
            char c2 = 0;
            Object[] objArr = {goodPropertyLabel};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bddfee99eb1e41a3269b210a9b04aee", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bddfee99eb1e41a3269b210a9b04aee");
                return;
            }
            ProductAttrLabel productAttrLabel = (ProductAttrLabel) goodPropertyLabel.getLabelData();
            if (productAttrLabel == null || com.sankuai.shangou.stone.util.a.b(productAttrLabel.attrLabelList)) {
                return;
            }
            com.sankuai.shangou.stone.util.u.a(this.c);
            int min = Math.min(e, com.sankuai.shangou.stone.util.a.c(productAttrLabel.attrLabelList));
            int i = 0;
            while (i < min) {
                String str = (String) com.sankuai.shangou.stone.util.a.a((List<Object>) productAttrLabel.attrLabelList, i);
                if (i > 0) {
                    str = "｜".concat(String.valueOf(str));
                }
                String str2 = str;
                SCSingleLineFlowLayout sCSingleLineFlowLayout = this.c;
                byte b = i == min + (-1) ? (byte) 1 : (byte) 0;
                Object[] objArr2 = new Object[2];
                objArr2[c2] = str2;
                objArr2[c] = Byte.valueOf(b);
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8fc24c9dc4978cb622913ec37c80449d", RobustBitConfig.DEFAULT_VALUE)) {
                    textView = (TextView) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8fc24c9dc4978cb622913ec37c80449d");
                } else {
                    textView = new TextView(c());
                    textView.setMaxLines(1);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setTextSize(0, com.sankuai.waimai.store.util.b.c(c(), R.dimen.wm_sc_common_dimen_textsize_11));
                    int c3 = com.sankuai.waimai.store.util.b.c(c(), R.dimen.wm_sc_common_dimen_6);
                    int c4 = com.sankuai.waimai.store.util.b.c(c(), R.dimen.wm_sc_common_dimen_8);
                    if (b == 0) {
                        c3 = 0;
                    }
                    textView.setPadding(0, c4, c3, 0);
                    textView.setTextColor(com.sankuai.waimai.store.util.b.b(c(), R.color.wm_sg_color_858687));
                    textView.setIncludeFontPadding(false);
                    com.sankuai.shangou.stone.util.u.a(textView, str2);
                }
                sCSingleLineFlowLayout.addView(textView);
                i++;
                c = 1;
                c2 = 0;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class d extends b {
        public static ChangeQuickRedirect a;
        protected TextView e;

        @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.e.b
        public final int a() {
            return R.layout.wm_st_poi_market_adapter_label_child_recommend_reason;
        }

        public d(@NonNull SCSingleLineFlowLayout sCSingleLineFlowLayout) {
            super(sCSingleLineFlowLayout);
            Object[] objArr = {sCSingleLineFlowLayout};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb5e58b1cf9bf5110e87febeaa31e423", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb5e58b1cf9bf5110e87febeaa31e423");
            }
        }

        @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.e.b
        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1358f15719555145f0136f63ea278f03", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1358f15719555145f0136f63ea278f03");
            } else {
                this.e = (TextView) a(R.id.tv_stickyfood_recommend_reason);
            }
        }

        @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.e.b
        public final void a(@NonNull GoodsSpu.GoodPropertyLabel goodPropertyLabel) {
            Object[] objArr = {goodPropertyLabel};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74a0a0546f8bf97395bad17375202fdc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74a0a0546f8bf97395bad17375202fdc");
            } else {
                com.sankuai.shangou.stone.util.u.a(this.e, (String) goodPropertyLabel.getLabelData());
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.e$e  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static class C1186e extends c {
        public static ChangeQuickRedirect f;
        public final int g;

        public C1186e(@NonNull SCSingleLineFlowLayout sCSingleLineFlowLayout) {
            super(sCSingleLineFlowLayout);
            Object[] objArr = {sCSingleLineFlowLayout};
            ChangeQuickRedirect changeQuickRedirect = f;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "729f9dcff49702046cf62979b93ec41a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "729f9dcff49702046cf62979b93ec41a");
            } else {
                this.g = 4;
            }
        }

        @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.e.c, com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.e.b
        public final void a(@NonNull GoodsSpu.GoodPropertyLabel goodPropertyLabel) {
            Object[] objArr = {goodPropertyLabel};
            ChangeQuickRedirect changeQuickRedirect = f;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbbbe59214747f6cca9a85c2e5672b89", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbbbe59214747f6cca9a85c2e5672b89");
                return;
            }
            this.e.setTypeface(Typeface.defaultFromStyle(0));
            GoodTopLabel goodTopLabel = (GoodTopLabel) goodPropertyLabel.getLabelData();
            if (goodTopLabel == null) {
                return;
            }
            com.sankuai.shangou.stone.util.u.a(this.e, goodTopLabel.content);
            if (goodTopLabel.style != null) {
                this.e.setTextColor(com.sankuai.shangou.stone.util.d.a(goodTopLabel.style.contentColor, com.sankuai.waimai.store.util.b.b(c(), R.color.wm_sg_color_FF7919)));
                if (com.sankuai.shangou.stone.util.t.a(goodTopLabel.style.backgroundColor)) {
                    return;
                }
                e.a aVar = new e.a();
                aVar.c(com.sankuai.shangou.stone.util.d.a(goodTopLabel.style.backgroundColor, -1));
                List<String> list = goodTopLabel.style.cornerRadius;
                if (!com.sankuai.shangou.stone.util.a.b(list) && com.sankuai.shangou.stone.util.a.a((List) list) == 4) {
                    try {
                        aVar.a(com.sankuai.shangou.stone.util.h.a(c(), Float.parseFloat(list.get(0))), com.sankuai.shangou.stone.util.h.a(c(), Float.parseFloat(list.get(1))), com.sankuai.shangou.stone.util.h.a(c(), Float.parseFloat(list.get(2))), com.sankuai.shangou.stone.util.h.a(c(), Float.parseFloat(list.get(3))));
                    } catch (NumberFormatException unused) {
                        aVar.a(com.sankuai.shangou.stone.util.h.a(c(), 4.0f));
                    }
                } else {
                    aVar.a(com.sankuai.shangou.stone.util.h.a(c(), 4.0f));
                }
                this.e.setBackground(aVar.a());
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class c extends b {
        public static ChangeQuickRedirect a;
        public TextView e;

        @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.e.b
        public final int a() {
            return R.layout.wm_st_poi_market_adapter_label_child_recommend_reason;
        }

        public c(@NonNull SCSingleLineFlowLayout sCSingleLineFlowLayout) {
            super(sCSingleLineFlowLayout);
            Object[] objArr = {sCSingleLineFlowLayout};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5d7dfda0c5dd2dd89b4bfabf56ca21d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5d7dfda0c5dd2dd89b4bfabf56ca21d");
            }
        }

        @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.e.b
        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2134c053bc57110c7cbbb5e4fe1b2ccc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2134c053bc57110c7cbbb5e4fe1b2ccc");
            } else {
                this.e = (TextView) a(R.id.tv_stickyfood_rank);
            }
        }

        @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.e.b
        public void a(@NonNull GoodsSpu.GoodPropertyLabel goodPropertyLabel) {
            Object[] objArr = {goodPropertyLabel};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44e70b067117cab9a373d619692c1ed2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44e70b067117cab9a373d619692c1ed2");
                return;
            }
            GoodTopLabel goodTopLabel = (GoodTopLabel) goodPropertyLabel.getLabelData();
            if (goodTopLabel == null) {
                return;
            }
            com.sankuai.shangou.stone.util.u.a(this.e, goodTopLabel.content);
            if (goodTopLabel.style != null) {
                this.e.setTextColor(com.sankuai.shangou.stone.util.d.a(goodTopLabel.style.contentColor, com.sankuai.waimai.store.util.b.b(c(), R.color.wm_sg_color_FF7919)));
                if (com.sankuai.shangou.stone.util.t.a(goodTopLabel.style.backgroundColor)) {
                    return;
                }
                this.e.setBackground(SingleColorLabelStyle.createDrawableFromStyle(c(), goodTopLabel.style));
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class f extends b {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.e.b
        public final int a() {
            return -1;
        }

        @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.e.b
        public final void a(@NonNull GoodsSpu.GoodPropertyLabel goodPropertyLabel) {
        }

        @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.e.b
        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d70a33ed9d34776a5ee36c308a34ea3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d70a33ed9d34776a5ee36c308a34ea3");
            }
        }

        public f(@NonNull SCSingleLineFlowLayout sCSingleLineFlowLayout) {
            super(sCSingleLineFlowLayout);
            Object[] objArr = {sCSingleLineFlowLayout};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6c7abe47a1e3a7603834bd86b6a20bd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6c7abe47a1e3a7603834bd86b6a20bd");
            }
        }
    }
}
