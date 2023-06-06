package com.sankuai.waimai.restaurant.shopcart.adapter;

import android.app.Activity;
import android.support.constraint.R;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.stepper.RooStepper;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.meituan.mtimageloader.utils.BitmapTransformation;
import com.sankuai.waimai.business.restaurant.base.manager.order.g;
import com.sankuai.waimai.business.restaurant.base.manager.order.k;
import com.sankuai.waimai.business.restaurant.base.shopcart.e;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.h;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.imageloader.image.RoundAndCenterCropTransform;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.restaurant.shopcart.utils.d;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class TryLuckyFoodAdapter extends BaseAdapter {
    public static ChangeQuickRedirect a;
    public List<GoodsSpu> b;
    public Map<Long, String> c;
    private final com.sankuai.waimai.restaurant.shopcart.config.a d;
    private Activity e;
    private k f;
    private final g g;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface Type {
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public TryLuckyFoodAdapter(Activity activity, List<GoodsSpu> list, g gVar, com.sankuai.waimai.restaurant.shopcart.config.a aVar) {
        Object[] objArr = {activity, list, gVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a0894f7195059b6b200be6d4e9183ea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a0894f7195059b6b200be6d4e9183ea");
            return;
        }
        this.f = k.a();
        this.c = new HashMap();
        this.e = activity;
        this.b = list == null ? new ArrayList<>() : list;
        this.g = gVar;
        this.d = aVar;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ababd1db691b2e713eca8790b6fa5eb", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ababd1db691b2e713eca8790b6fa5eb")).intValue() : this.b.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.widget.Adapter
    /* renamed from: a */
    public GoodsSpu getItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fc3ea312cb621488f631845e03682cd", RobustBitConfig.DEFAULT_VALUE) ? (GoodsSpu) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fc3ea312cb621488f631845e03682cd") : this.b.get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        a aVar;
        View view2;
        double skuPrice;
        Object[] objArr = {Integer.valueOf(i), view, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "187f6acb6e288096378ce01dacf8d39a", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "187f6acb6e288096378ce01dacf8d39a");
        }
        if (view == null) {
            View inflate = LayoutInflater.from(new ContextThemeWrapper(this.e, 2131558963)).inflate(R.layout.wm_shopcart_adapter_try_lucky_food_list, (ViewGroup) null);
            aVar = new a(inflate);
            inflate.setTag(aVar);
            view2 = inflate;
        } else {
            aVar = (a) view.getTag();
            view2 = view;
        }
        final a aVar2 = aVar;
        final GoodsSpu item = getItem(i);
        Object[] objArr2 = {aVar2, item};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b00521c71b7afeb61483b66188727309", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b00521c71b7afeb61483b66188727309");
        } else {
            int a2 = this.f.a(this.g.f(), item.getId());
            List<GoodsSku> skuList = item.getSkuList();
            if (skuList != null && skuList.size() > 0) {
                GoodsSku goodsSku = skuList.get(0);
                if (a2 > 0) {
                    skuPrice = goodsSku.getSkuPrice() * a2;
                } else {
                    skuPrice = goodsSku.getSkuPrice();
                }
                if (goodsSku.getStatus() > 0 && a2 >= goodsSku.getStock()) {
                    a2 = goodsSku.getStock();
                }
                Object[] objArr3 = {item};
                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "905e032ee12c0b9d9801c39d2548b075", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "905e032ee12c0b9d9801c39d2548b075");
                } else {
                    String str = item.picture;
                    b.C0608b a3 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                    a3.b = TryLuckyFoodAdapter.this.e;
                    a3.c = str;
                    a3.f = ImageQualityUtil.b();
                    b.C0608b a4 = a3.a(com.sankuai.waimai.foundation.utils.g.a(TryLuckyFoodAdapter.this.e, 60.0f));
                    a4.k = 4;
                    b.C0608b a5 = a4.a(new BitmapTransformation[]{new RoundAndCenterCropTransform(TryLuckyFoodAdapter.this.e, 2)}, new String[]{"2"});
                    a5.i = R.drawable.wm_comment_img_load_placeholder_small;
                    a5.j = R.drawable.wm_common_good_img_default;
                    a5.a(aVar2.f);
                }
                Object[] objArr4 = {Double.valueOf(skuPrice)};
                ChangeQuickRedirect changeQuickRedirect4 = a.a;
                if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "54f8848dd18722d9b9e6553fc01149a0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "54f8848dd18722d9b9e6553fc01149a0");
                } else {
                    SpannableString spannableString = new SpannableString(TryLuckyFoodAdapter.this.e.getString(R.string.wm_shopcart_shoppingCart_price, new Object[]{h.a(skuPrice)}));
                    if (spannableString.length() > 0) {
                        spannableString.setSpan(new AbsoluteSizeSpan(11, true), 0, 1, 34);
                    }
                    aVar2.c.setText(spannableString);
                }
                aVar2.b.setText(item.getName());
                aVar2.d.a(a2);
                if (item.skus != null && item.skus.size() != 0 && item.skus.get(0).spec != null) {
                    if (item.attrs != null && item.attrs.size() != 0 && item.attrs.get(0).values != null && item.attrs.get(0).values.size() != 0 && item.attrs.get(0).values.get(0).value != null) {
                        TextView textView = aVar2.e;
                        textView.setText(item.skus.get(0).spec + " + " + item.attrs.get(0).values.get(0).value);
                    } else {
                        aVar2.e.setText(item.skus.get(0).spec);
                    }
                }
                aVar2.d.setIncEnable(true);
                if (a(item) == d.a(item)) {
                    aVar2.d.setIncEnable(false);
                }
                aVar2.d.setIncListener(new View.OnClickListener() { // from class: com.sankuai.waimai.restaurant.shopcart.adapter.TryLuckyFoodAdapter.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        Object[] objArr5 = {view3};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "817d788dc6f38582f8902072d17f65c5", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "817d788dc6f38582f8902072d17f65c5");
                        } else {
                            TryLuckyFoodAdapter.this.f.a(TryLuckyFoodAdapter.this.e, TryLuckyFoodAdapter.this.g.f(), item, item.getSkuList().get(0), item.hasMultiSaleAttr ? item.getAttrValuesArr() : null, new e() { // from class: com.sankuai.waimai.restaurant.shopcart.adapter.TryLuckyFoodAdapter.1.1
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                                public final void a() {
                                    Object[] objArr6 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect6 = a;
                                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "6c8c5e267dff263003b2288cd412e246", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "6c8c5e267dff263003b2288cd412e246");
                                    }
                                }

                                @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                                public final void a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
                                    Object[] objArr6 = {bVar};
                                    ChangeQuickRedirect changeQuickRedirect6 = a;
                                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "400035038109538b54f0f7ac501c4465", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "400035038109538b54f0f7ac501c4465");
                                        return;
                                    }
                                    aVar2.d.setIncEnable(true);
                                    if (TryLuckyFoodAdapter.this.a(item) >= d.a(item) && d.a(item) != -1) {
                                        aVar2.d.setIncEnable(false);
                                        d.a(TryLuckyFoodAdapter.this.e);
                                    }
                                    JudasManualManager.a a6 = JudasManualManager.a("b_waimai_rqaqpidq_mc").a(TryLuckyFoodAdapter.this.a(TryLuckyFoodAdapter.this.d));
                                    a6.b = AppUtil.generatePageInfoKey(TryLuckyFoodAdapter.this.e);
                                    a6.a("poi_id", TryLuckyFoodAdapter.this.g.f()).a("spu_id", item.id).a("status", TryLuckyFoodAdapter.this.g.g.min_price > k.a().n(TryLuckyFoodAdapter.this.g.f()).e.mTotalAndBoxPrice ? 0 : 1).a();
                                }

                                @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                                public final void a(com.sankuai.waimai.platform.domain.manager.exceptions.a aVar3) {
                                    Object[] objArr6 = {aVar3};
                                    ChangeQuickRedirect changeQuickRedirect6 = a;
                                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "3543172ebd84b8d09b17a820de509c7a", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "3543172ebd84b8d09b17a820de509c7a");
                                    } else if (TextUtils.isEmpty(aVar3.getMessage())) {
                                    } else {
                                        ae.a(TryLuckyFoodAdapter.this.e, aVar3.getMessage());
                                    }
                                }
                            });
                        }
                    }
                });
                aVar2.d.setDecListener(new View.OnClickListener() { // from class: com.sankuai.waimai.restaurant.shopcart.adapter.TryLuckyFoodAdapter.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        Object[] objArr5 = {view3};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "2099c10d9b0b135b1b95024878413515", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "2099c10d9b0b135b1b95024878413515");
                        } else {
                            TryLuckyFoodAdapter.this.f.a(TryLuckyFoodAdapter.this.g.f(), item, item.getSkuList().get(0), item.hasMultiSaleAttr ? item.getAttrValuesArr() : null, new e() { // from class: com.sankuai.waimai.restaurant.shopcart.adapter.TryLuckyFoodAdapter.2.1
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                                public final void a() {
                                    Object[] objArr6 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect6 = a;
                                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "cbb73cf9e269896618945fffe0e46d93", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "cbb73cf9e269896618945fffe0e46d93");
                                    }
                                }

                                @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                                public final void a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
                                    Object[] objArr6 = {bVar};
                                    ChangeQuickRedirect changeQuickRedirect6 = a;
                                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "92ae4da82efd3319f196aa8e9c8f396a", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "92ae4da82efd3319f196aa8e9c8f396a");
                                    } else if (TryLuckyFoodAdapter.this.a(item) >= d.a(item) || d.a(item) == -1) {
                                    } else {
                                        aVar2.d.setIncEnable(true);
                                    }
                                }

                                @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                                public final void a(com.sankuai.waimai.platform.domain.manager.exceptions.a aVar3) {
                                    Object[] objArr6 = {aVar3};
                                    ChangeQuickRedirect changeQuickRedirect6 = a;
                                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "67011c8e1257130069ebc39dac4c153d", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "67011c8e1257130069ebc39dac4c153d");
                                    } else if (aVar3 == null || TextUtils.isEmpty(aVar3.getMessage())) {
                                    } else {
                                        ae.a(TryLuckyFoodAdapter.this.e, aVar3.getMessage());
                                    }
                                }
                            });
                        }
                    }
                });
            }
        }
        if (!this.c.containsKey(Long.valueOf(getItem(i).getId()))) {
            JudasManualManager.b("b_waimai_oof0n7md_mv", a(this.d), AppUtil.generatePageInfoKey(this.e)).a("poi_id", this.g.f()).a("spu_id", getItem(i).getId()).a("status", this.g.g.min_price <= k.a().n(this.g.f()).e.mTotalAndBoxPrice ? 1 : 0).a("index", i).a("intelligent_count", getCount()).a();
            this.c.put(Long.valueOf(getItem(i).getId()), getItem(i).name);
        }
        return view2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(com.sankuai.waimai.restaurant.shopcart.config.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28194111f9c12071e4807086033a807c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28194111f9c12071e4807086033a807c") : aVar.a() ? "c_CijEL" : aVar.b() ? "c_u4fk4kw" : aVar.e() ? "c_1b9anm4" : aVar.d() ? "c_5y4tc0m" : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "525351b8aed1ea729e128ab2b9e5953d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "525351b8aed1ea729e128ab2b9e5953d")).intValue() : this.f.a(this.g.f(), goodsSpu.getId());
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class a {
        public static ChangeQuickRedirect a;
        public TextView b;
        public TextView c;
        public RooStepper d;
        public TextView e;
        public ImageView f;

        public a(View view) {
            Object[] objArr = {TryLuckyFoodAdapter.this, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5faaafca261086db6de21792be8e20ed", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5faaafca261086db6de21792be8e20ed");
                return;
            }
            this.b = (TextView) view.findViewById(R.id.txt_food_name);
            this.c = (TextView) view.findViewById(R.id.txt_food_price);
            this.d = (RooStepper) view.findViewById(R.id.roo_stepper);
            this.e = (TextView) view.findViewById(R.id.txt_food_attrs);
            this.f = (ImageView) view.findViewById(R.id.shop_cart_poi_icon);
        }
    }
}
