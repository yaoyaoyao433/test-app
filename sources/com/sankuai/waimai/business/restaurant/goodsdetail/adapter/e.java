package com.sankuai.waimai.business.restaurant.goodsdetail.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.restaurant.base.manager.order.g;
import com.sankuai.waimai.business.restaurant.base.repository.model.RecommendPackage;
import com.sankuai.waimai.business.restaurant.goodsdetail.widget.AutoGridView;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.foundation.utils.h;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.utils.listid.ListIDHelper;
import com.sankuai.waimai.platform.widget.RatioImageView;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e implements AutoGridView.b {
    public static ChangeQuickRedirect a;
    RecommendPackage.a b;
    int c;
    Context d;
    g e;
    String f;
    boolean g;
    boolean h;
    private ArrayList<RecommendPackage.c> i;
    private int j;
    private int k;
    private final int l;

    public e(Context context, g gVar, RecommendPackage.a aVar, String str, boolean z, int i, int i2, boolean z2) {
        Object[] objArr = {context, gVar, aVar, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), 0, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b2d95050a9b847e8b55b2ae4fbc1824", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b2d95050a9b847e8b55b2ae4fbc1824");
            return;
        }
        this.d = context;
        this.e = gVar;
        this.f = str;
        this.b = aVar;
        this.c = i;
        this.i = this.b.i;
        this.k = com.sankuai.waimai.foundation.utils.b.b(this.i) ? 0 : this.i.size();
        int i3 = this.k;
        Object[] objArr2 = {Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "034a194f17622d13f7b9e9db17294324", RobustBitConfig.DEFAULT_VALUE)) {
            i3 = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "034a194f17622d13f7b9e9db17294324")).intValue();
        } else if (i3 == 1) {
            i3 = 2;
        } else if (i3 > 3) {
            i3 = ((int) Math.ceil(i3 / 3.0d)) * 3;
        }
        this.j = i3;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.platform.restaurant.cdn.a.a;
        this.l = PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "68c3f1dad572ca731e14458afbf924ea", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "68c3f1dad572ca731e14458afbf924ea")).intValue() : com.sankuai.waimai.platform.restaurant.cdn.a.a().d;
        this.g = z;
        this.h = z2;
    }

    @Override // com.sankuai.waimai.business.restaurant.goodsdetail.widget.AutoGridView.b
    public final int a() {
        return this.j;
    }

    @Override // com.sankuai.waimai.business.restaurant.goodsdetail.widget.AutoGridView.b
    @NonNull
    public final View a(ViewGroup viewGroup, int i, final int i2, int i3, int i4, int i5, int i6) {
        Object[] objArr = {viewGroup, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b65b0a869c9cea3958156408661c02b", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b65b0a869c9cea3958156408661c02b");
        }
        View inflate = LayoutInflater.from(this.d).inflate(R.layout.wm_restaurant_goods_detail_recommend_package_product_item, viewGroup, false);
        if (i2 >= this.k) {
            inflate.setVisibility(4);
        } else {
            ArrayList<RecommendPackage.c> arrayList = this.i;
            Object[] objArr2 = {inflate, Integer.valueOf(i), Integer.valueOf(i2), arrayList};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c6687b288cf766787cb81e131c2c0739", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c6687b288cf766787cb81e131c2c0739");
            } else if (!com.sankuai.waimai.foundation.utils.b.b(arrayList)) {
                final RecommendPackage.c cVar = arrayList.get(i2);
                RatioImageView ratioImageView = (RatioImageView) inflate.findViewById(R.id.product_icon);
                TextView textView = (TextView) inflate.findViewById(R.id.product_name);
                ((LinearLayout.LayoutParams) ((LinearLayout) inflate.findViewById(R.id.ll_product_info_container)).getLayoutParams()).weight = 1.0f;
                ((LinearLayout.LayoutParams) textView.getLayoutParams()).weight = 1.0f;
                TextView textView2 = (TextView) inflate.findViewById(R.id.product_price);
                TextView textView3 = (TextView) inflate.findViewById(R.id.product_attr_sku);
                ah.a((TextView) inflate.findViewById(R.id.product_label), cVar.j);
                textView.setText(cVar.f);
                textView2.setText("¥" + h.a(cVar.d));
                try {
                    Typeface createFromAsset = Typeface.createFromAsset(this.d.getAssets(), "fonts/AvenirLTPro-Medium.ttf");
                    if (createFromAsset != null) {
                        textView2.setTypeface(createFromAsset);
                    }
                } catch (Exception unused) {
                }
                StringBuilder sb = new StringBuilder("/");
                if (!TextUtils.isEmpty(cVar.h)) {
                    sb.append(cVar.h);
                }
                if (!TextUtils.isEmpty(cVar.e)) {
                    if (!"/".equals(sb.toString())) {
                        sb.append("、");
                    }
                    sb.append(cVar.e);
                }
                ah.a(textView3, "/".equals(sb.toString()) ? "" : sb.toString());
                if (!TextUtils.isEmpty(cVar.g)) {
                    b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                    a2.b = this.d;
                    a2.c = cVar.g;
                    b.C0608b b = a2.b(this.l);
                    b.f = ImageQualityUtil.a(1);
                    b.i = R.drawable.wm_restaurant_recommend_loading;
                    b.j = R.drawable.wm_restaurant_recommend_error;
                    b.a((ImageView) ratioImageView);
                }
                ratioImageView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.goodsdetail.adapter.e.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b88df2a07c93fa1d28bcfbb9db146a78", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b88df2a07c93fa1d28bcfbb9db146a78");
                        } else if (e.this.h) {
                            JudasManualManager.a a3 = JudasManualManager.a("b_waimai_3f6pmdqk_mc").a(e.this.g ? "c_CijEL" : "c_u4fk4kw");
                            a3.b = AppUtil.generatePageInfoKey(e.this.d);
                            JudasManualManager.a a4 = a3.a("index", e.this.c).a("i_source", e.this.e.f).a("rank_list_id", e.this.f).a("sku_id", cVar.b).a("sku_index", i2).a("group_id", e.this.b.h).a("poi_id", e.this.e.f());
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(e.this.b.f);
                            JudasManualManager.a a5 = a4.a("price", sb2.toString()).a("rec_reason", e.this.b.b);
                            if (e.this.g) {
                                a5.a("ref_list_id", ListIDHelper.a.a.a("restaurant", "restaurant_page_blcok"));
                            }
                            a5.a();
                            if (!e.this.g) {
                                if (cVar.k == 1) {
                                    return;
                                }
                            }
                            e eVar = e.this;
                            Context context = e.this.d;
                            RecommendPackage.c cVar2 = cVar;
                            Object[] objArr4 = {context, cVar2};
                            ChangeQuickRedirect changeQuickRedirect4 = e.a;
                            if (PatchProxy.isSupport(objArr4, eVar, changeQuickRedirect4, false, "2193513eccac5bc87a90e6ea1d7b65ca", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, eVar, changeQuickRedirect4, false, "2193513eccac5bc87a90e6ea1d7b65ca");
                            } else {
                                com.sankuai.waimai.foundation.router.a.a(context, cVar2.n);
                            }
                        }
                    }
                });
            }
        }
        return inflate;
    }
}
