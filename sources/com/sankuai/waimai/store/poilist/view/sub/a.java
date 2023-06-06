package com.sankuai.waimai.store.poilist.view.sub;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.repository.model.PoiRecommend;
import com.sankuai.waimai.store.repository.model.PoiVerticality;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    TextView b;
    protected RecyclerView c;
    protected com.sankuai.waimai.store.base.statistic.a d;

    public abstract void a(PoiRecommend poiRecommend);

    public a(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "656da8a3a0cdfe3d972c5a7b43495177", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "656da8a3a0cdfe3d972c5a7b43495177");
        }
    }

    public final void a(com.sankuai.waimai.store.base.statistic.a aVar) {
        this.d = aVar;
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f873944592319003b6fafd5cf3c3834", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f873944592319003b6fafd5cf3c3834");
            return;
        }
        this.b = (TextView) findView(R.id.tv_recommend_title);
        this.c = (RecyclerView) findView(R.id.rv_content);
        getView().setClickable(true);
    }

    public static Map<String, Object> a(@NonNull PoiVerticality poiVerticality, int i) {
        Object[] objArr = {poiVerticality, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ffb2648f678a40aee07ad75396cafedf", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ffb2648f678a40aee07ad75396cafedf");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("poi_id", poiVerticality.getOfficialPoiId());
        hashMap.put("index", Integer.valueOf(i));
        hashMap.put("delivery_fee", poiVerticality.shippingFeeTip);
        hashMap.put("original_delivery_fee", poiVerticality.originShippingFeeTip);
        hashMap.put("delivery_time", poiVerticality.deliveryTimeTip);
        hashMap.put("stid", poiVerticality.specialStid);
        return hashMap;
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "818d20d9dac225ca1db31c00b80f075b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "818d20d9dac225ca1db31c00b80f075b");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            com.sankuai.waimai.store.router.d.a(getContext(), str);
        }
    }
}
