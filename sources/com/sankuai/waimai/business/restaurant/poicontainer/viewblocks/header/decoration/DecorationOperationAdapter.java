package com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.decoration;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.mads.b;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.meituan.mtimageloader.loader.a;
import com.sankuai.waimai.business.restaurant.base.manager.order.g;
import com.sankuai.waimai.business.restaurant.base.repository.model.PoiOperationItem;
import com.sankuai.waimai.business.restaurant.poicontainer.WMRestaurantActivity;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.e;
import com.sankuai.waimai.foundation.utils.m;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.utils.sharedpreference.PlatformSPKeys;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class DecorationOperationAdapter extends PagerAdapter {
    public static ChangeQuickRedirect a;
    private Context b;
    private List<PoiOperationItem> c;
    private g d;

    @Override // android.support.v4.view.PagerAdapter
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f485dda5671a36f893e22680840b5021", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f485dda5671a36f893e22680840b5021")).intValue() : this.c.size() == 1 ? 1 : Integer.MAX_VALUE;
    }

    @Override // android.support.v4.view.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        View view;
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63c8a6d92d1bfbd3691c4bdeb252f57a", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63c8a6d92d1bfbd3691c4bdeb252f57a");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        int intValue = i % (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2edf5752cead797e2af1ff5a0831bd00", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2edf5752cead797e2af1ff5a0831bd00")).intValue() : this.c.size());
        Object[] objArr3 = {Integer.valueOf(intValue), viewGroup};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "24e8ecfaaea008b659adbc9651a48696", RobustBitConfig.DEFAULT_VALUE)) {
            view = (View) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "24e8ecfaaea008b659adbc9651a48696");
        } else {
            final int size = intValue % this.c.size();
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.b).inflate(R.layout.wm_restaurant_decoration_operation_img, viewGroup, false);
            ImageView imageView = (ImageView) frameLayout.findViewById(R.id.wm_restaurant_decoration_operation_img);
            ImageView imageView2 = (ImageView) frameLayout.findViewById(R.id.wm_restaurant_decoration_operation_ad_icon_img);
            if (size < 0 || size >= this.c.size()) {
                view = imageView;
            } else {
                final PoiOperationItem poiOperationItem = this.c.get(size);
                if (aa.a(poiOperationItem.picUrl)) {
                    imageView.setVisibility(8);
                    imageView2.setVisibility(8);
                } else {
                    imageView.setVisibility(0);
                    String b = ImageQualityUtil.b(this.b, poiOperationItem.picUrl, 2, com.sankuai.waimai.foundation.utils.g.a(this.b) - (com.sankuai.waimai.foundation.utils.g.a(this.b, 16.0f) * 2));
                    b.C0608b c = a.c();
                    c.b = this.b;
                    c.c = b;
                    c.i = R.drawable.waimai_c_pagekit_banner_error_default;
                    c.j = R.drawable.waimai_c_pagekit_banner_error_default;
                    c.a(imageView);
                    imageView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.decoration.DecorationOperationAdapter.1
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            Object[] objArr4 = {view2};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4d01cec2a32f4e599d506ce8df0aa0eb", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4d01cec2a32f4e599d506ce8df0aa0eb");
                            } else if (poiOperationItem != null) {
                                Bundle bundle = new Bundle();
                                if (DecorationOperationAdapter.this.b instanceof WMRestaurantActivity) {
                                    bundle.putBoolean("is_from_restaurant", true);
                                }
                                Bundle bundle2 = new Bundle();
                                bundle2.putInt("separate_pack", DecorationOperationAdapter.this.d.d ? 1 : 0);
                                bundle2.putInt("change_shop_buy", DecorationOperationAdapter.this.d.c ? 1 : 0);
                                bundle2.putInt("shop_type", DecorationOperationAdapter.this.d.z);
                                bundle2.putLong("origin_brand_id", DecorationOperationAdapter.this.d.A());
                                bundle.putBundle("rn_extra_data", bundle2);
                                com.sankuai.waimai.foundation.router.a.a(DecorationOperationAdapter.this.b, poiOperationItem.scheme, bundle);
                                JudasManualManager.a a2 = JudasManualManager.a("b_wpDVN").a(DecorationOperationAdapter.this.a(poiOperationItem, size));
                                a2.b = AppUtil.generatePageInfoKey(DecorationOperationAdapter.this.b);
                                a2.a("c_CijEL").a();
                                if (poiOperationItem.adType > 0) {
                                    com.sankuai.waimai.ad.mads.a.a(poiOperationItem.adType, new b.a("b_wpDVN", poiOperationItem.chargeInfo, 2));
                                }
                            }
                        }
                    });
                    if (poiOperationItem.adMark) {
                        imageView2.setVisibility(0);
                        String b2 = com.sankuai.waimai.platform.utils.sharedpreference.a.a().b((e) PlatformSPKeys.key_poi_ad_icon_url, "");
                        b.C0608b c2 = a.c();
                        c2.b = this.b;
                        c2.c = b2;
                        c2.a(imageView2);
                    }
                }
                view = frameLayout;
            }
        }
        viewGroup.addView(view);
        return view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> a(PoiOperationItem poiOperationItem, int i) {
        Object[] objArr = {poiOperationItem, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79aa5fcc38e5376c231443922246c7dc", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79aa5fcc38e5376c231443922246c7dc");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("index", Integer.valueOf(i));
        hashMap.put("poi_id", this.d.f());
        hashMap.put("kangaroo_manager", 1);
        hashMap.put(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(this.d.s()));
        hashMap.put("pic_url", poiOperationItem.picUrl);
        hashMap.put("activity_type", Integer.valueOf(poiOperationItem.activityType));
        if (poiOperationItem.adType > 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("adType", poiOperationItem.adType);
                jSONObject.put("adChargeInfo", m.a(poiOperationItem.chargeInfo));
            } catch (JSONException unused) {
            }
            hashMap.put("ad", jSONObject.toString());
        }
        return hashMap;
    }

    @Override // android.support.v4.view.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Object[] objArr = {viewGroup, Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdb92e605d61997cd4bf80ef63924760", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdb92e605d61997cd4bf80ef63924760");
        } else {
            viewGroup.removeView((View) obj);
        }
    }
}
