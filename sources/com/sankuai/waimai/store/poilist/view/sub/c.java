package com.sankuai.waimai.store.poilist.view.sub;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.newwidgets.list.g;
import com.sankuai.waimai.store.newwidgets.list.k;
import com.sankuai.waimai.store.platform.domain.core.poi.Product;
import com.sankuai.waimai.store.repository.model.PoiRecommend;
import com.sankuai.waimai.store.repository.model.PoiVerticality;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.util.w;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.store.poilist.view.sub.a {
    public static ChangeQuickRedirect e;
    com.sankuai.waimai.store.newwidgets.list.f<PoiVerticality, b> f;
    PoiRecommend g;
    private int h;

    public c(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9de2e9c7f63a9d63478dd1552805aa2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9de2e9c7f63a9d63478dd1552805aa2");
        } else {
            this.h = -1;
        }
    }

    @Override // com.sankuai.waimai.store.poilist.view.sub.a
    public final void a(PoiRecommend poiRecommend) {
        Object[] objArr = {poiRecommend};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42d5af4e20b915ef17410f97d7f4c8ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42d5af4e20b915ef17410f97d7f4c8ab");
            return;
        }
        int hashCode = poiRecommend.hashCode();
        this.g = poiRecommend;
        if (this.h != hashCode) {
            this.c.scrollToPosition(0);
        }
        this.f.b_(poiRecommend.poiList);
        this.h = hashCode;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62e4346f76a02ecfd4f4ae1878b98b9b", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62e4346f76a02ecfd4f4ae1878b98b9b") : layoutInflater.inflate(R.layout.wm_sc_poi_recommend_view_block, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.poilist.view.sub.a, com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd2a43657bc741a806a20be82c43696c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd2a43657bc741a806a20be82c43696c");
            return;
        }
        super.onViewCreated();
        this.c.setNestedScrollingEnabled(false);
        this.c.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.f = new a(new b());
        this.c.setAdapter(this.f);
        this.f.a(new k() { // from class: com.sankuai.waimai.store.poilist.view.sub.c.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.newwidgets.list.k
            public final void a(View view, int i) {
                Object[] objArr2 = {view, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1129b56f6c6bcc265d1ecaac8d9805d1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1129b56f6c6bcc265d1ecaac8d9805d1");
                    return;
                }
                PoiVerticality h = c.this.f.h(i);
                if (h == null) {
                    return;
                }
                if (c.this.d != null) {
                    Map<String, Object> a2 = com.sankuai.waimai.store.poilist.view.sub.a.a(h, i);
                    a2.put(DataConstants.INDEX, Integer.valueOf(c.this.g.poiIndex));
                    a2.put("is_have_sku", Boolean.valueOf(!com.sankuai.shangou.stone.util.a.b(h.products)));
                    c.this.d.a(a2);
                }
                c.this.a(h.restaurantScheme);
            }
        });
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class b implements com.sankuai.waimai.store.newwidgets.list.b {
        private b() {
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.poilist.view.sub.c$c  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    class C1287c extends g<PoiVerticality, b> {
        public static ChangeQuickRedirect a;
        private ImageView c;
        private TextView d;
        private TextView e;
        private TextView f;
        private TextView g;
        private TextView h;
        private ImageView i;
        private ImageView j;
        private com.sankuai.waimai.store.expose.v2.entity.b k;

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final int a() {
            return R.layout.wm_sc_poi_recommend_item;
        }

        private C1287c() {
            Object[] objArr = {c.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25ee8b15efb5a27f3a070ee3655972df", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25ee8b15efb5a27f3a070ee3655972df");
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final /* synthetic */ void a(@Nullable PoiVerticality poiVerticality, int i) {
            PoiVerticality poiVerticality2 = poiVerticality;
            Object[] objArr = {poiVerticality2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "971bf887fb5624c6e8ce64daf33db9d5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "971bf887fb5624c6e8ce64daf33db9d5");
            } else if (poiVerticality2 == null) {
            } else {
                b.C0608b a2 = m.a(poiVerticality2.picUrl, c.this.getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_32), ImageQualityUtil.b());
                a2.j = R.drawable.wm_sc_common_loading_large;
                a2.i = R.drawable.wm_sc_common_loading_large;
                a2.a(this.c);
                this.d.setText(w.a(poiVerticality2.name));
                if (TextUtils.isEmpty(poiVerticality2.categoryName)) {
                    u.c(this.e);
                } else {
                    u.a(this.e);
                    this.e.setText(poiVerticality2.categoryName);
                }
                this.f.setText(poiVerticality2.deliveryTimeTip);
                this.g.setText(poiVerticality2.shippingFeeTip);
                this.h.setText(poiVerticality2.originShippingFeeTip);
                a(this.i, (Product) com.sankuai.shangou.stone.util.a.a((List<Object>) poiVerticality2.products, 0));
                a(this.j, (Product) com.sankuai.shangou.stone.util.a.a((List<Object>) poiVerticality2.products, 1));
                if (c.this.d != null) {
                    Map<String, Object> a3 = com.sankuai.waimai.store.poilist.view.sub.a.a(poiVerticality2, i);
                    a3.put(DataConstants.INDEX, Integer.valueOf(c.this.g.poiIndex));
                    a3.put("is_have_sku", Boolean.valueOf(!com.sankuai.shangou.stone.util.a.b(poiVerticality2.products)));
                    c.this.d.a(this.k, i, a3);
                }
            }
        }

        private void a(@NonNull ImageView imageView, @Nullable Product product) {
            Object[] objArr = {imageView, product};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c38b68255b0b54e77a82d36249296f8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c38b68255b0b54e77a82d36249296f8");
            } else if (product == null) {
                u.b(imageView);
            } else {
                u.a(imageView);
                b.C0608b a2 = m.a(product.picture, c.this.getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_66), ImageQualityUtil.b());
                a2.j = R.drawable.wm_sc_common_loading_large;
                a2.i = R.drawable.wm_sc_common_loading_large;
                a2.a(imageView);
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final void a(@NonNull View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5479dc6892489be6d5190c8cbfa96038", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5479dc6892489be6d5190c8cbfa96038");
                return;
            }
            this.c = (ImageView) view.findViewById(R.id.iv_poi);
            this.d = (TextView) view.findViewById(R.id.tv_poi);
            this.e = (TextView) view.findViewById(R.id.tv_category_tag);
            this.f = (TextView) view.findViewById(R.id.tv_delivery_time);
            this.g = (TextView) view.findViewById(R.id.tv_shipping_fee);
            this.h = (TextView) view.findViewById(R.id.tv_shipping_fee_origin);
            this.i = (ImageView) view.findViewById(R.id.inc_left).findViewById(R.id.iv_product_picture);
            this.j = (ImageView) view.findViewById(R.id.inc_right).findViewById(R.id.iv_product_picture);
            if (c.this.d != null) {
                this.k = c.this.d.a(view);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class a extends com.sankuai.waimai.store.newwidgets.list.f<PoiVerticality, b> {
        public static ChangeQuickRedirect a;

        public a(@NonNull b bVar) {
            super(bVar);
            Object[] objArr = {c.this, bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62605064f51a4efb35f713b0baa64dfd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62605064f51a4efb35f713b0baa64dfd");
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.f
        @NonNull
        public final g a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f9101d856d56cd6b37f545c7d2c2d18", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f9101d856d56cd6b37f545c7d2c2d18") : new C1287c();
        }
    }
}
