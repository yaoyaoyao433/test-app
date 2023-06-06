package com.sankuai.waimai.bussiness.order.confirm.collect.adapter;

import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.meituan.mtimageloader.utils.BitmapTransformation;
import com.sankuai.waimai.bussiness.order.confirm.helper.f;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.foundation.utils.h;
import com.sankuai.waimai.platform.capacity.imageloader.image.RoundAndCenterCropTransform;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.goods.SkuLadderBoxInfo;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends RecyclerView.a {
    public static ChangeQuickRedirect a;
    public List<OrderedFood> b;
    public List<com.sankuai.waimai.bussiness.order.confirm.collect.model.a> c;
    @NonNull
    f d;
    @Nullable
    public com.sankuai.waimai.bussiness.order.confirm.collect.callback.a e;
    int f;
    public double g;
    public double h;
    public double i;
    public String j;
    public String k;
    private LayoutInflater l;
    private final int m;
    private final int n;
    private final int o;

    public static /* synthetic */ void a(b bVar, double d, double d2) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "6012e4800b57209fb2bdef48bd55bf31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "6012e4800b57209fb2bdef48bd55bf31");
            return;
        }
        bVar.h = com.sankuai.waimai.bussiness.order.confirm.helper.b.a(Double.valueOf(bVar.h), Double.valueOf(d2)).doubleValue();
        bVar.i = com.sankuai.waimai.bussiness.order.confirm.helper.b.a(com.sankuai.waimai.bussiness.order.confirm.helper.b.a(Double.valueOf(bVar.i), Double.valueOf(d)), Double.valueOf(d2)).doubleValue();
        if (bVar.e != null) {
            bVar.g = com.sankuai.waimai.bussiness.order.confirm.helper.b.b(com.sankuai.waimai.bussiness.order.confirm.helper.b.b(Double.valueOf(bVar.g), Double.valueOf(d)), Double.valueOf(d2)).doubleValue();
            bVar.e.a(bVar.g);
            bVar.e.b(bVar.h);
            bVar.e.c(bVar.i);
            bVar.e.a(bVar.a());
        }
    }

    public b(@NonNull f fVar, @Nullable com.sankuai.waimai.bussiness.order.confirm.collect.callback.a aVar) {
        Object[] objArr = {fVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "324a99ac31068a2d81bd14219517fbe3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "324a99ac31068a2d81bd14219517fbe3");
            return;
        }
        this.m = 2;
        this.g = 0.0d;
        this.h = 0.0d;
        this.i = 0.0d;
        this.n = 1;
        this.o = 2;
        this.j = "";
        this.k = "";
        this.d = fVar;
        this.e = aVar;
        this.l = LayoutInflater.from(com.meituan.android.singleton.b.a);
        this.f = g.a(com.meituan.android.singleton.b.a, 60.0f);
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public int a() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a03785dbcc3b43295cd8f09491d5c5e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a03785dbcc3b43295cd8f09491d5c5e")).intValue();
        }
        if (com.sankuai.waimai.foundation.utils.b.a(this.c)) {
            for (com.sankuai.waimai.bussiness.order.confirm.collect.model.a aVar : this.c) {
                if (aVar != null) {
                    i += aVar.e;
                }
            }
        }
        return i;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    @NotNull
    public final RecyclerView.s onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d59b2e6d7fd0aefb644a02c379901aa2", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecyclerView.s) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d59b2e6d7fd0aefb644a02c379901aa2");
        }
        if (i == 1) {
            return new C0891b(this.l.inflate(R.layout.wm_order_confirm_collect_food_item_layout, viewGroup, false));
        }
        View view = new View(viewGroup.getContext());
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, g.a(com.meituan.android.singleton.b.a, 90.0f)));
        return new a(view);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final void onBindViewHolder(@NotNull RecyclerView.s sVar, int i) {
        Object[] objArr = {sVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a776a518c77dfe4d2ead07802825992", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a776a518c77dfe4d2ead07802825992");
        } else if (sVar instanceof C0891b) {
            C0891b c0891b = (C0891b) sVar;
            com.sankuai.waimai.bussiness.order.confirm.collect.model.a aVar = this.c.get(i);
            Object[] objArr2 = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = C0891b.a;
            if (PatchProxy.isSupport(objArr2, c0891b, changeQuickRedirect2, false, "6f3cfe4ecd34b929334807ca4df799ac", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, c0891b, changeQuickRedirect2, false, "6f3cfe4ecd34b929334807ca4df799ac");
            } else if (aVar == null || aVar.c == null) {
            } else {
                c0891b.b = aVar;
                GoodsSpu goodsSpu = aVar.c;
                b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a2.c = goodsSpu.picture;
                a2.i = R.drawable.wm_restaurant_pic_goods_default;
                a2.b(b.this.f).a(new BitmapTransformation[]{new RoundAndCenterCropTransform(com.meituan.android.singleton.b.a, 2)}, new String[]{"2"}).a(c0891b.c);
                c0891b.d.setText(goodsSpu.name);
                c0891b.e.setText(goodsSpu.monthSaledContent);
                if (com.sankuai.waimai.foundation.utils.b.b(goodsSpu.skus)) {
                    return;
                }
                GoodsSku goodsSku = goodsSpu.skus.get(0);
                c0891b.i = goodsSku.price;
                c0891b.q = goodsSku.skuLadderBoxInfo;
                c0891b.r = goodsSku.boxNum;
                c0891b.s = goodsSku.boxPrice;
                c0891b.l = aVar.d;
                c0891b.j = aVar.e;
                c0891b.k = goodsSku.getStock();
                c0891b.m = goodsSku.minOrderCount;
                c0891b.f.setText(h.a(c0891b.i));
                String str = "";
                if (!TextUtils.isEmpty(goodsSku.promotionInfo)) {
                    str = goodsSku.promotionInfo;
                } else if (goodsSku.minOrderCount > 1) {
                    str = com.meituan.android.singleton.b.a.getString(R.string.wm_order_confirm_min_order_count_tip, Integer.valueOf(goodsSku.minOrderCount));
                }
                c0891b.g.setText(str);
                c0891b.n = c0891b.l == 0;
                if (TextUtils.isEmpty(goodsSpu.activityText)) {
                    c0891b.t.setVisibility(8);
                } else {
                    c0891b.t.setVisibility(0);
                    c0891b.h.setText(goodsSpu.activityText);
                    GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{-35248, -444360});
                    gradientDrawable.setGradientType(0);
                    c0891b.t.setBackground(gradientDrawable);
                }
                c0891b.a();
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a2dd4299b68508f1b42bba9ead332b3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a2dd4299b68508f1b42bba9ead332b3")).intValue();
        }
        if (this.c.size() > 0) {
            return this.c.size() + 1;
        }
        return 0;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "217bae5354a9a0274697cb4f550da4bd", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "217bae5354a9a0274697cb4f550da4bd")).intValue() : (i <= 0 || i != getItemCount() - 1) ? 1 : 2;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a extends RecyclerView.s {
        public a(View view) {
            super(view);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.bussiness.order.confirm.collect.adapter.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0891b extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        com.sankuai.waimai.bussiness.order.confirm.collect.model.a b;
        ImageView c;
        TextView d;
        TextView e;
        TextView f;
        TextView g;
        TextView h;
        double i;
        int j;
        int k;
        int l;
        int m;
        boolean n;
        boolean o;
        boolean p;
        SkuLadderBoxInfo q;
        double r;
        double s;
        View t;
        private ImageView v;
        private ImageView w;
        private TextView x;

        public static /* synthetic */ double a(C0891b c0891b, int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, c0891b, changeQuickRedirect, false, "ef0e0043a437efb7cb80f6d4333b8d5c", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, c0891b, changeQuickRedirect, false, "ef0e0043a437efb7cb80f6d4333b8d5c")).doubleValue() : c0891b.i * (c0891b.j - i);
        }

        public static /* synthetic */ int a(C0891b c0891b) {
            int i = c0891b.j - 1;
            c0891b.j = i;
            return i;
        }

        public static /* synthetic */ double b(C0891b c0891b, int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, c0891b, changeQuickRedirect, false, "6f7e5ffa2279a33833431c2f67c91315", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Double) PatchProxy.accessDispatch(objArr, c0891b, changeQuickRedirect, false, "6f7e5ffa2279a33833431c2f67c91315")).doubleValue();
            }
            if (c0891b.q != null && c0891b.q.ladderPackageFoodNnum > 0) {
                return c0891b.q.ladderPackagePrice * ((((c0891b.l + c0891b.j) / c0891b.q.ladderPackageFoodNnum) + ((c0891b.l + c0891b.j) % c0891b.q.ladderPackageFoodNnum <= 0 ? 0 : 1)) - (((c0891b.l + i) / c0891b.q.ladderPackageFoodNnum) + ((c0891b.l + i) % c0891b.q.ladderPackageFoodNnum > 0 ? 1 : 0)));
            }
            return (c0891b.j - i) * c0891b.r * c0891b.s;
        }

        public C0891b(final View view) {
            super(view);
            Object[] objArr = {b.this, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b8943b79ec3fa4348bd7abd26c137a5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b8943b79ec3fa4348bd7abd26c137a5");
                return;
            }
            this.n = false;
            this.o = false;
            this.p = false;
            this.c = (ImageView) view.findViewById(R.id.collect_food_item_icon);
            this.d = (TextView) view.findViewById(R.id.collect_food_item_name);
            this.e = (TextView) view.findViewById(R.id.collect_food_item_month_sales);
            this.f = (TextView) view.findViewById(R.id.collect_food_item_price);
            this.g = (TextView) view.findViewById(R.id.collect_food_item_purchase_txt);
            this.x = (TextView) view.findViewById(R.id.collect_food_item_count);
            this.v = (ImageView) view.findViewById(R.id.collect_food_item_sub_icon);
            this.w = (ImageView) view.findViewById(R.id.collect_food_item_add_icon);
            this.t = view.findViewById(R.id.fl_collect_food_activity_text);
            this.h = (TextView) view.findViewById(R.id.collect_food_activity_text);
            if (b.this.d.aM_()) {
                this.f.setTypeface(b.this.d.aN_());
            }
            this.v.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.collect.adapter.b.b.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr2 = {view2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "444982b232f5fcf72dd11f52fdba3bfd", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "444982b232f5fcf72dd11f52fdba3bfd");
                    } else if (!C0891b.this.o) {
                        ae.a(view, b.this.j);
                    } else {
                        int i = C0891b.this.j;
                        int i2 = C0891b.this.l + C0891b.this.j;
                        if (C0891b.this.o) {
                            if (!C0891b.this.n) {
                                C0891b.a(C0891b.this);
                            } else if (i2 != C0891b.this.m) {
                                C0891b.a(C0891b.this);
                            } else {
                                C0891b.this.j = 0;
                            }
                            C0891b.this.b.e = C0891b.this.j;
                        }
                        C0891b.this.a();
                        b.a(b.this, C0891b.a(C0891b.this, i), C0891b.b(C0891b.this, i));
                    }
                }
            });
            this.w.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.collect.adapter.b.b.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr2 = {view2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d43cb23c54fd9ae6315c3d29173a6db9", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d43cb23c54fd9ae6315c3d29173a6db9");
                    } else if (!C0891b.this.p) {
                        if (TextUtils.isEmpty(b.this.k)) {
                            return;
                        }
                        ae.a(view, b.this.k);
                    } else {
                        int i = C0891b.this.j;
                        if (C0891b.this.l + C0891b.this.j >= C0891b.this.m) {
                            C0891b.this.j++;
                        } else {
                            C0891b.this.j = C0891b.this.m - C0891b.this.l;
                        }
                        C0891b.this.b.e = C0891b.this.j;
                        C0891b.this.a();
                        b.a(b.this, C0891b.a(C0891b.this, i), C0891b.b(C0891b.this, i));
                    }
                }
            });
        }

        void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83a28ad70af3c358cd7405ac3a731afe", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83a28ad70af3c358cd7405ac3a731afe");
                return;
            }
            int i = this.l + this.j;
            if (i == 0) {
                this.x.setVisibility(4);
            } else {
                this.x.setVisibility(0);
            }
            TextView textView = this.x;
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            textView.setText(sb.toString());
            if (this.k == -1 || (i < this.k && this.m <= this.k)) {
                this.p = true;
            } else {
                this.p = false;
            }
            this.w.setImageResource(this.p ? R.drawable.wm_order_confirm_collect_food_add_icon : R.drawable.wm_order_confirm_collect_food_unable_add_icon);
            if (this.l > 0) {
                this.o = i > Math.max(this.l, this.m);
            } else {
                this.o = i > 0;
            }
            if (i == 0) {
                this.v.setVisibility(4);
                return;
            }
            this.v.setVisibility(0);
            this.v.setImageResource(this.o ? R.drawable.wm_order_confirm_collect_food_sub_icon : R.drawable.wm_order_confirm_collect_food_unable_sub_icon);
        }
    }

    public boolean a(GoodsSpu goodsSpu, GoodsSpu goodsSpu2) {
        Object[] objArr = {goodsSpu, goodsSpu2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3ea10a2ae57b7fd46ec65a6b7e3f374", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3ea10a2ae57b7fd46ec65a6b7e3f374")).booleanValue() : (goodsSpu == null || goodsSpu2 == null || com.sankuai.waimai.foundation.utils.b.b(goodsSpu.skus) || com.sankuai.waimai.foundation.utils.b.b(goodsSpu2.skus) || goodsSpu.id != goodsSpu2.id || goodsSpu.skus.get(0).id != goodsSpu2.skus.get(0).id) ? false : true;
    }
}
