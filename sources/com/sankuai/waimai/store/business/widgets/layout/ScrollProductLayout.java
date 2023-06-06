package com.sankuai.waimai.store.business.widgets.layout;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.f;
import com.sankuai.shangou.stone.util.i;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.base.BaseCustomFrameLayout;
import com.sankuai.waimai.store.platform.domain.core.poi.Product;
import com.sankuai.waimai.store.repository.model.LastBoughtProduct;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.util.s;
import com.sankuai.waimai.store.widgets.RetailHotSalePriceLayout;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ScrollProductLayout extends BaseCustomFrameLayout {
    public static ChangeQuickRedirect e;
    private com.sankuai.waimai.store.business.widgets.layout.a f;
    private com.sankuai.waimai.store.business.widgets.layout.b g;
    private List<Product> h;
    private RecyclerView i;
    private LayoutInflater j;
    private int k;
    private RecyclerView.a l;

    @Override // com.sankuai.waimai.store.base.BaseCustomFrameLayout
    public int getLayoutId() {
        return R.layout.wm_st_common_poi_list_horizontal_recycler;
    }

    public ScrollProductLayout(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3fab9cf81476a3e67117444e4cd0a96", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3fab9cf81476a3e67117444e4cd0a96");
            return;
        }
        this.h = new ArrayList();
        this.k = -1;
        this.l = new b();
    }

    public ScrollProductLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6457a017771f1127078b35eccf07ec83", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6457a017771f1127078b35eccf07ec83");
            return;
        }
        this.h = new ArrayList();
        this.k = -1;
        this.l = new b();
    }

    public ScrollProductLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4107cd7d5186ce7eac24ea4877a4c147", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4107cd7d5186ce7eac24ea4877a4c147");
            return;
        }
        this.h = new ArrayList();
        this.k = -1;
        this.l = new b();
    }

    @TargetApi(21)
    public ScrollProductLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21b47ab3b59adfcabf9726cfdf1916c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21b47ab3b59adfcabf9726cfdf1916c3");
            return;
        }
        this.h = new ArrayList();
        this.k = -1;
        this.l = new b();
    }

    @Override // com.sankuai.waimai.store.base.BaseCustomFrameLayout
    @NonNull
    public final View a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad3277e29a24670f01c0fcbcb75a5471", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad3277e29a24670f01c0fcbcb75a5471");
        }
        this.j = LayoutInflater.from(getContext());
        return view;
    }

    public void setItemClickListener(com.sankuai.waimai.store.business.widgets.layout.a aVar) {
        this.f = aVar;
    }

    public void setItemDataSetListener(com.sankuai.waimai.store.business.widgets.layout.b bVar) {
        this.g = bVar;
    }

    public void setLeftContentPadding(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c97ed5a07579481e4f3a75ae0255734", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c97ed5a07579481e4f3a75ae0255734");
        } else if (this.i == null) {
        } else {
            this.i.setPadding(i, this.i.getPaddingTop(), this.i.getPaddingRight(), this.i.getPaddingBottom());
        }
    }

    public void setData(List<LastBoughtProduct> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f06d9799c8d62f2194ef1f3ba7b3bc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f06d9799c8d62f2194ef1f3ba7b3bc4");
        } else if (com.sankuai.shangou.stone.util.a.b(list)) {
            u.c(this);
        } else {
            if (this.i == null) {
                this.i = (RecyclerView) findViewById(R.id.wm_sc_poilist_products_list);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
                linearLayoutManager.setOrientation(0);
                this.i.setLayoutManager(linearLayoutManager);
                this.i.setAdapter(this.l);
                this.i.setHasFixedSize(true);
                this.i.setNestedScrollingEnabled(false);
            }
            this.h.clear();
            this.h.addAll(list);
            this.l.notifyDataSetChanged();
            int hashCode = this.h.hashCode();
            if (this.k != hashCode) {
                this.i.scrollToPosition(0);
            }
            this.k = hashCode;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public abstract class a extends RecyclerView.s {
        public static ChangeQuickRedirect a;

        public abstract void a(Product product, int i);

        public a(View view) {
            super(view);
            Object[] objArr = {ScrollProductLayout.this, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2284c8bbf3b5b63283dfeccf8a4fc17", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2284c8bbf3b5b63283dfeccf8a4fc17");
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class c extends a {
        public static ChangeQuickRedirect c;
        public int d;
        public int e;
        public RetailHotSalePriceLayout f;
        public ImageView g;
        public TextView h;
        public ImageView i;
        public TextView j;

        public c(View view) {
            super(view);
            Object[] objArr = {ScrollProductLayout.this, view};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61066bc29da1825eb28d445e44b3807f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61066bc29da1825eb28d445e44b3807f");
                return;
            }
            this.g = (ImageView) view.findViewById(R.id.img_poi_product_image);
            this.h = (TextView) view.findViewById(R.id.txt_poi_product_name);
            this.i = (ImageView) view.findViewById(R.id.img_poi_product_tag_image);
            this.j = (TextView) view.findViewById(R.id.txt_poi_product_tag_info);
            this.f = (RetailHotSalePriceLayout) view.findViewById(R.id.ll_stickysold_count_unit_price_original_price_fix);
            this.d = com.sankuai.waimai.store.util.b.b(view.getContext(), R.color.wm_sc_price_red);
            this.e = com.sankuai.waimai.store.util.b.b(view.getContext(), R.color.wm_sg_color_603f23);
        }

        @Override // com.sankuai.waimai.store.business.widgets.layout.ScrollProductLayout.a
        public final void a(final Product product, final int i) {
            Object[] objArr = {product, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10b23066471d665ee5d1e25125328790", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10b23066471d665ee5d1e25125328790");
            } else if (product != null) {
                View view = this.itemView;
                Object[] objArr2 = {product, view, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = c;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6ac194358b23efb8700e506996d043be", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6ac194358b23efb8700e506996d043be");
                    return;
                }
                if (!TextUtils.isEmpty(product.tagInfo)) {
                    this.j.setText(product.tagInfo);
                    u.a(this.j);
                    u.c(this.i);
                } else if (TextUtils.isEmpty(product.tagIcon)) {
                    u.c(this.j, this.i);
                } else {
                    m.a(product.tagIcon, this.i, (int) ScrollProductLayout.this.c.getResources().getDimension(R.dimen.wm_sc_common_dimen_40));
                    u.a(this.i);
                    u.c(this.j);
                }
                b.C0608b a = m.a(product.picture, (int) view.getContext().getResources().getDimension(R.dimen.wm_sc_common_dimen_80), ImageQualityUtil.b());
                a.j = R.drawable.wm_sc_common_loading_large;
                a.i = R.drawable.wm_sc_common_loading_large;
                a.a(this.g);
                this.h.setText(product.name);
                this.f.setOriginPrice(product.originPrice);
                view.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.business.widgets.layout.ScrollProductLayout.c.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        Object[] objArr3 = {view2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6d6a3483b01fb9bbce82a18d8bde5a51", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6d6a3483b01fb9bbce82a18d8bde5a51");
                        } else if (ScrollProductLayout.this.f != null) {
                            ScrollProductLayout.this.f.a(product, view2, i);
                        }
                    }
                });
                Object[] objArr3 = {product};
                ChangeQuickRedirect changeQuickRedirect3 = c;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3023a751cb3fa96d354f201b641d526c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3023a751cb3fa96d354f201b641d526c");
                    return;
                }
                s.b<Product> bVar = new s.b<Product>() { // from class: com.sankuai.waimai.store.business.widgets.layout.ScrollProductLayout.c.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.util.s.b
                    public final /* synthetic */ void a(Product product2) {
                        Product product3 = product2;
                        Object[] objArr4 = {product3};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a1e4ddcdb05f668da2fd7f1fae2f4ae8", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a1e4ddcdb05f668da2fd7f1fae2f4ae8");
                            return;
                        }
                        RetailHotSalePriceLayout retailHotSalePriceLayout = c.this.f;
                        String str = product3.memberPrice;
                        Object[] objArr5 = {str};
                        ChangeQuickRedirect changeQuickRedirect5 = RetailHotSalePriceLayout.a;
                        if (PatchProxy.isSupport(objArr5, retailHotSalePriceLayout, changeQuickRedirect5, false, "9c50f64572f8643226b87ad078718de6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, retailHotSalePriceLayout, changeQuickRedirect5, false, "9c50f64572f8643226b87ad078718de6");
                        } else {
                            retailHotSalePriceLayout.b(str, true);
                        }
                    }

                    @Override // com.sankuai.waimai.store.util.s.b
                    public final /* synthetic */ void b(Product product2) {
                        Product product3 = product2;
                        Object[] objArr4 = {product3};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "2076f0e1d9ca2ac9457a027cd336976d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "2076f0e1d9ca2ac9457a027cd336976d");
                            return;
                        }
                        RetailHotSalePriceLayout retailHotSalePriceLayout = c.this.f;
                        String str = product3.price;
                        Object[] objArr5 = {str};
                        ChangeQuickRedirect changeQuickRedirect5 = RetailHotSalePriceLayout.a;
                        if (PatchProxy.isSupport(objArr5, retailHotSalePriceLayout, changeQuickRedirect5, false, "92be52da32543dc78afcb99dd7eda650", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, retailHotSalePriceLayout, changeQuickRedirect5, false, "92be52da32543dc78afcb99dd7eda650");
                        } else {
                            retailHotSalePriceLayout.a(str, true);
                        }
                    }
                };
                Object[] objArr4 = {product, bVar};
                ChangeQuickRedirect changeQuickRedirect4 = s.a;
                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "8494a9e6c6c46b2933b3d1be63680da7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "8494a9e6c6c46b2933b3d1be63680da7");
                } else if (p.a(product, bVar)) {
                } else {
                    if (!t.a(product.memberPrice) && !t.a(product.price)) {
                        float a2 = f.a((Object) product.price.substring(1), 0.0f);
                        float a3 = f.a((Object) product.memberPrice.substring(1), 0.0f);
                        if (i.e(Double.valueOf(a3), Double.valueOf(0.0d)) && a3 < a2) {
                            bVar.a(product);
                        } else {
                            bVar.b(product);
                        }
                    } else if (!t.a(product.memberPrice)) {
                        bVar.a(product);
                    } else {
                        bVar.b(product);
                    }
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class b extends RecyclerView.a<a> {
        public static ChangeQuickRedirect a;

        @Override // android.support.v7.widget.RecyclerView.a
        public final /* synthetic */ void onBindViewHolder(a aVar, int i) {
            a aVar2 = aVar;
            Object[] objArr = {aVar2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be292a8bc433e725492024112176c6ed", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be292a8bc433e725492024112176c6ed");
                return;
            }
            aVar2.a((Product) com.sankuai.shangou.stone.util.a.a((List<Object>) ScrollProductLayout.this.h, i), i);
            if (ScrollProductLayout.this.g != null) {
                ScrollProductLayout.this.g.a((Product) com.sankuai.shangou.stone.util.a.a((List<Object>) ScrollProductLayout.this.h, i), aVar2.itemView, i);
            }
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i) {
            Object[] objArr = {viewGroup, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "767124d9f08762c1f667320cdfdae886", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "767124d9f08762c1f667320cdfdae886") : new c(ScrollProductLayout.this.j.inflate(R.layout.wm_st_common_poi_list_item_products_new, viewGroup, false));
        }

        public b() {
            Object[] objArr = {ScrollProductLayout.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "518336d084bed64c439edab1443ad9f0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "518336d084bed64c439edab1443ad9f0");
            }
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final int getItemViewType(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85d951bc2315854ab8861adf0758a2d7", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85d951bc2315854ab8861adf0758a2d7")).intValue();
            }
            Product product = (Product) com.sankuai.shangou.stone.util.a.a((List<Object>) ScrollProductLayout.this.h, i);
            return (product == null || product.productType != 7) ? 0 : 1;
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final int getItemCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39a1674194d9d759a89f6b80a6557903", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39a1674194d9d759a89f6b80a6557903")).intValue() : com.sankuai.shangou.stone.util.a.a(ScrollProductLayout.this.h);
        }
    }
}
