package com.sankuai.waimai.ai;

import android.arch.lifecycle.OnLifecycleEvent;
import android.arch.lifecycle.d;
import android.arch.lifecycle.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ai.uat.b;
import com.sankuai.waimai.ai.uat.context.a;
import com.sankuai.waimai.business.restaurant.base.manager.order.k;
import com.sankuai.waimai.business.restaurant.poicontainer.WMRestaurantActivity;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.platform.domain.manager.observers.OrderGoodObserver;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WmRestaurantActivityLifeObserver implements e, OrderGoodObserver {
    public static ChangeQuickRedirect a;
    private String b;
    private WMRestaurantActivity c;

    @OnLifecycleEvent(d.a.ON_START)
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a319d0f86b1ca47991ce6d2cc5f57bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a319d0f86b1ca47991ce6d2cc5f57bb");
        }
    }

    @OnLifecycleEvent(d.a.ON_STOP)
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fcbaa917f61f2fb55719c27ca2f0c59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fcbaa917f61f2fb55719c27ca2f0c59");
        }
    }

    public WmRestaurantActivityLifeObserver(WMRestaurantActivity wMRestaurantActivity) {
        Object[] objArr = {wMRestaurantActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b39cfab8b0653daa66621adf8f60a303", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b39cfab8b0653daa66621adf8f60a303");
        } else {
            this.c = wMRestaurantActivity;
        }
    }

    @OnLifecycleEvent(d.a.ON_CREATE)
    public void onCreate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81547c407e35bb62f514c0c8546a4e9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81547c407e35bb62f514c0c8546a4e9d");
            return;
        }
        this.c.c = b.a().a(a.b.WMUATPageRestaurant);
        k.a().a(this);
    }

    @OnLifecycleEvent(d.a.ON_RESUME)
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef48986ba489975c97e8bc248d5b193f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef48986ba489975c97e8bc248d5b193f");
            return;
        }
        b.a().a(a.b.WMUATPageRestaurant, b());
        b.a().a(this.c.h());
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "373f6edb4cad1c9eec9a6a6eb097e1ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "373f6edb4cad1c9eec9a6a6eb097e1ca");
        } else {
            this.b = this.c.h().getPoiIDStr();
        }
        aF_();
    }

    @OnLifecycleEvent(d.a.ON_PAUSE)
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4924c2df073f49d5a102aadb771c7a2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4924c2df073f49d5a102aadb771c7a2e");
        } else if (com.sankuai.waimai.foundation.core.lifecycle.b.a().a(this.c.hashCode())) {
            b.a().b(a.b.WMUATPageRestaurant, b());
        }
    }

    @OnLifecycleEvent(d.a.ON_DESTROY)
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0da7b8e5194a32f658e43cda1be55260", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0da7b8e5194a32f658e43cda1be55260");
            return;
        }
        k.a().b(this);
        b.a().c(a.b.WMUATPageRestaurant, b());
        this.c = null;
    }

    @Override // com.sankuai.waimai.platform.domain.manager.observers.OrderGoodObserver
    public final void aF_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72a6297e4dcb9b07689c211a0875f125", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72a6297e4dcb9b07689c211a0875f125");
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<OrderedFood> o = k.a().o(this.b);
        if (o != null && !o.isEmpty()) {
            for (OrderedFood orderedFood : o) {
                if (orderedFood != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(orderedFood.getSpuId());
                    arrayList.add(sb.toString());
                }
            }
        }
        b.a().a("spu_ids", arrayList);
    }

    @Nullable
    private com.sankuai.waimai.ai.uat.a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b161d29fe344179ffc57f3b0b33d2aa", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.ai.uat.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b161d29fe344179ffc57f3b0b33d2aa");
        }
        if (this.c != null) {
            return this.c.c;
        }
        return null;
    }
}
