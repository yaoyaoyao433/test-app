package com.sankuai.waimai.platform.globalcart.biz;

import android.app.Activity;
import android.os.SystemClock;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.globalcart.IGlobalCartManagerService;
import com.sankuai.waimai.foundation.core.service.globalcart.b;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.d;
import com.sankuai.waimai.globalcart.model.CartProduct;
import com.sankuai.waimai.globalcart.model.GlobalCart;
import com.sankuai.waimai.platform.capacity.log.c;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.platform.domain.core.order.WmOrderedFood;
import com.sankuai.waimai.platform.globalcart.poimix.GlobalCartBrief;
import com.sankuai.waimai.router.annotation.RouterProvider;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class GlobalCartManager implements IGlobalCartManagerService {
    private static final int POI_ID_REFRESH_DATA_ERROR_LESS = 3;
    private static final int POI_ID_REFRESH_DATA_ERROR_MISMATCH = 4;
    private static final int POI_ID_REFRESH_DATA_ERROR_MORE = 2;
    public static final int POI_ID_REFRESH_DEGRADE = 1;
    private static final int POI_ID_REFRESH_RETRY_DATA_ERROR_LESS = 8;
    private static final int POI_ID_REFRESH_RETRY_DATA_ERROR_MISMATCH = 9;
    private static final int POI_ID_REFRESH_RETRY_DATA_ERROR_MORE = 7;
    public static final int POI_ID_REFRESH_RETRY_DEGRADE = 6;
    public static final int POI_ID_REFRESH_RETRY_FAIL = 10;
    private static final int POI_ID_REFRESH_RETRY_SUCCESS = 5;
    private static final int POI_ID_REFRESH_SUCCESS = 0;
    public static final int TYPE_MARKET = 14;
    public static final int TYPE_WAIMAI = 15;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static GlobalCartManager mGlobalCartManager;
    public boolean mIsChanged;
    private List<b> mOrderManagerList;
    private com.sankuai.waimai.platform.globalcart.poimix.b<String> mPoiIdTab;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface PoiRefreshCatValue {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a();
    }

    @RouterProvider
    public static GlobalCartManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a0184275e71d68e3aefddf0db01240af", RobustBitConfig.DEFAULT_VALUE)) {
            return (GlobalCartManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a0184275e71d68e3aefddf0db01240af");
        }
        if (mGlobalCartManager == null) {
            mGlobalCartManager = new GlobalCartManager();
        }
        return mGlobalCartManager;
    }

    public GlobalCartManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d6ff6bd440d4c3d3652c2437b67c7c6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d6ff6bd440d4c3d3652c2437b67c7c6");
            return;
        }
        this.mOrderManagerList = new ArrayList();
        this.mPoiIdTab = new com.sankuai.waimai.platform.globalcart.poimix.b<>();
    }

    public void exit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b19f8f50ce2658ece128499f440d9c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b19f8f50ce2658ece128499f440d9c7");
            return;
        }
        if (com.sankuai.waimai.platform.domain.manager.user.a.i().a()) {
            cartUpload(new a() { // from class: com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager.1
                @Override // com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager.a
                public final void a() {
                }
            });
        }
        for (b bVar : this.mOrderManagerList) {
            bVar.b();
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.globalcart.IGlobalCartManagerService
    public void registerOrderManager(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8171a2f993f9bf7fd2ab09058e6d2f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8171a2f993f9bf7fd2ab09058e6d2f6");
        } else {
            this.mOrderManagerList.add(bVar);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.globalcart.IGlobalCartManagerService
    public void setDataChange() {
        this.mIsChanged = true;
    }

    public void resetDataChange() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c3ee9b5209d7f8675ae574fdb106ac52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c3ee9b5209d7f8675ae574fdb106ac52");
            return;
        }
        this.mIsChanged = false;
        if (d.a(this.mOrderManagerList)) {
            return;
        }
        for (b bVar : this.mOrderManagerList) {
            bVar.e();
        }
    }

    public boolean isCartDataChange() {
        return this.mIsChanged;
    }

    @Override // com.sankuai.waimai.foundation.core.service.globalcart.IGlobalCartManagerService
    public int getOrderedNum(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b9708a5abdbb489e7f6b55134e1e702", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b9708a5abdbb489e7f6b55134e1e702")).intValue();
        }
        for (b bVar : this.mOrderManagerList) {
            int i = bVar.i(str);
            if (i != 0) {
                return i;
            }
        }
        return 0;
    }

    public void clearOrder(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ebe1a0434f4f97ced8e16eb656f8aae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ebe1a0434f4f97ced8e16eb656f8aae");
            return;
        }
        b orderManager = getOrderManager(i);
        if (orderManager != null) {
            orderManager.a(str);
        }
    }

    public void removeOrderedFoodAll(int i, String str, CartProduct cartProduct) {
        Object[] objArr = {Integer.valueOf(i), str, cartProduct};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15ed5f99a68304fe4c6315cc9b57c385", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15ed5f99a68304fe4c6315cc9b57c385");
            return;
        }
        b orderManager = getOrderManager(i);
        if (orderManager != null) {
            orderManager.a(str, cartProduct);
        }
    }

    public void setActivityErrorFood(int i, String str, List<com.sankuai.waimai.platform.domain.core.order.a> list) {
        Object[] objArr = {Integer.valueOf(i), str, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2705e28f02deeb808a9f69dd057e1a92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2705e28f02deeb808a9f69dd057e1a92");
            return;
        }
        b orderManager = getOrderManager(i);
        if (orderManager != null) {
            orderManager.d(str, list);
        }
    }

    public List<WmOrderedFood> getRequestList(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a0be9c7aef9c5d5f1bd4aff1bb80352", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a0be9c7aef9c5d5f1bd4aff1bb80352");
        }
        b orderManager = getOrderManager(i);
        if (orderManager != null) {
            return orderManager.c(str);
        }
        return new ArrayList();
    }

    public b getOrderManager(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "79fb0ef9c1c7002965a91ce3df6ed716", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "79fb0ef9c1c7002965a91ce3df6ed716");
        }
        for (b bVar : this.mOrderManagerList) {
            if (bVar.c() == i) {
                return bVar;
            }
        }
        return null;
    }

    public boolean isLocalCartDataEmpty() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1dc7f3cf0ba8cb7eaaebb259814b3720", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1dc7f3cf0ba8cb7eaaebb259814b3720")).booleanValue();
        }
        List<com.sankuai.waimai.globalcart.model.a> localCartData = getLocalCartData();
        if (d.a(localCartData)) {
            return true;
        }
        for (com.sankuai.waimai.globalcart.model.a aVar : localCartData) {
            if (aVar != null && !d.a(aVar.e)) {
                return false;
            }
        }
        return true;
    }

    public List<OrderedFood> getRequestOrderedList(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a13161b0cf755e7746af79d5d7385fb", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a13161b0cf755e7746af79d5d7385fb");
        }
        b orderManager = getOrderManager(i);
        if (orderManager != null) {
            return orderManager.d(str);
        }
        return new ArrayList();
    }

    public void updateShopCartData(String str, List<OrderedFood> list, int i) {
        Object[] objArr = {str, list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "489c06b515d33979ad2cefcb7fd99942", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "489c06b515d33979ad2cefcb7fd99942");
            return;
        }
        b orderManager = getOrderManager(i);
        if (orderManager != null) {
            orderManager.a(str, list);
        }
    }

    public void updateShopCartWithMember(String str, List<Map<String, Object>> list, int i) {
        Object[] objArr = {str, list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "98a1bd64df0aaf225afbcabe0bc920d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "98a1bd64df0aaf225afbcabe0bc920d8");
            return;
        }
        b orderManager = getOrderManager(i);
        if (orderManager != null) {
            orderManager.b(str, list);
        }
    }

    public synchronized List<com.sankuai.waimai.globalcart.model.a> getLocalCartData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "64f962a661ac06a9a154694df147b3bd", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "64f962a661ac06a9a154694df147b3bd");
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar : this.mOrderManagerList) {
            if (bVar != null) {
                for (com.sankuai.waimai.globalcart.model.a aVar : bVar.d()) {
                    if (arrayList.contains(aVar)) {
                        com.sankuai.waimai.globalcart.model.a aVar2 = (com.sankuai.waimai.globalcart.model.a) arrayList.get(arrayList.indexOf(aVar));
                        if (aVar2.f <= aVar.f) {
                            aVar2 = aVar;
                        }
                        if (aa.a(aVar2.c)) {
                            aVar2.c = com.sankuai.waimai.platform.domain.core.poi.b.a(aVar2.b);
                        }
                        arrayList.set(arrayList.indexOf(aVar), aVar2);
                    } else {
                        if (aa.a(aVar.c)) {
                            aVar.c = com.sankuai.waimai.platform.domain.core.poi.b.a(aVar.b);
                        }
                        if (!aa.a(aVar.c) || aVar.b > 0) {
                            arrayList.add(aVar);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.sankuai.waimai.foundation.core.service.globalcart.IGlobalCartManagerService
    public int getGlobalCartPoiIds() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d29acb82a7583a25275426f9cfe65e7e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d29acb82a7583a25275426f9cfe65e7e")).intValue();
        }
        for (b bVar : this.mOrderManagerList) {
            for (com.sankuai.waimai.globalcart.model.a aVar : bVar.d()) {
                if (aVar != null && !com.sankuai.waimai.foundation.utils.b.b(aVar.e)) {
                    i++;
                }
            }
        }
        return i;
    }

    public void clearPoiShopCart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f4e96bc6a3c117815c9a71df0c4e409", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f4e96bc6a3c117815c9a71df0c4e409");
            return;
        }
        for (b bVar : this.mOrderManagerList) {
            if (bVar != null) {
                for (com.sankuai.waimai.globalcart.model.a aVar : new ArrayList(bVar.d())) {
                    if (aVar != null) {
                        bVar.a(aVar.c);
                    }
                }
            }
        }
    }

    public void clearErrorFood(String str, List<com.sankuai.waimai.platform.domain.core.order.a> list, int i) {
        Object[] objArr = {str, list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89e64fb4edc6fb93ba002873034a77ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89e64fb4edc6fb93ba002873034a77ca");
            return;
        }
        b orderManager = getOrderManager(i);
        if (orderManager != null) {
            orderManager.c(str, list);
        }
        setDataChange();
    }

    public static void toGlobalCartActivity(final Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3a68e98f2e9cfe8227e4651705d47fe6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3a68e98f2e9cfe8227e4651705d47fe6");
        } else {
            com.sankuai.waimai.platform.domain.manager.user.a.a(activity, new Runnable() { // from class: com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a40526b4bdad9cad6ace42c93e4e5c64", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a40526b4bdad9cad6ace42c93e4e5c64");
                    } else {
                        com.sankuai.waimai.platform.capacity.abtest.d.a(activity);
                    }
                }
            });
        }
    }

    public void forceClear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51e51f10b867914c05ec643d99169cb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51e51f10b867914c05ec643d99169cb3");
            return;
        }
        for (b bVar : this.mOrderManagerList) {
            bVar.b();
        }
    }

    public void cartUpload(final a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb65090748d9933ad03062bfb1e258ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb65090748d9933ad03062bfb1e258ea");
        } else if (getInstance().isCartDataChange()) {
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((GlobalcartService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) GlobalcartService.class)).globalCartUpload(com.sankuai.waimai.globalcart.model.a.a(getLocalCartData(), true).toString()), new b.AbstractC1042b<BaseResponse<String>>() { // from class: com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager.3
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    Object[] objArr2 = {(BaseResponse) obj};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4ec3f03d5b9ff57546460c2f8b1e7960", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4ec3f03d5b9ff57546460c2f8b1e7960");
                        return;
                    }
                    GlobalCartManager.getInstance().resetDataChange();
                    aVar.a();
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d60b11247581f9ea5a7e5f6ac3b6125d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d60b11247581f9ea5a7e5f6ac3b6125d");
                    } else {
                        aVar.a();
                    }
                }
            }, com.sankuai.waimai.platform.capacity.network.retrofit.b.b);
        } else {
            aVar.a();
        }
    }

    public void changeFoodCheckStatus(GlobalCart globalCart) {
        Object[] objArr = {globalCart};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa667bc2ee661af17327677b2f25a210", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa667bc2ee661af17327677b2f25a210");
            return;
        }
        com.sankuai.waimai.foundation.core.service.globalcart.b orderManager = getOrderManager(globalCart.getBizType());
        if (orderManager != null) {
            orderManager.a(globalCart);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.globalcart.IGlobalCartManagerService
    public List<? extends List<?>> getInnerList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "97a9998924ad8deb4911c2c1731b9101", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "97a9998924ad8deb4911c2c1731b9101");
        }
        if (this.mPoiIdTab == null) {
            return new CopyOnWriteArrayList();
        }
        return this.mPoiIdTab.b;
    }

    public com.sankuai.waimai.platform.globalcart.poimix.b<String> getPoiIdTab() {
        return this.mPoiIdTab;
    }

    public void addNewPoiId(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0bb1e82ac17db58b96f6368110f1748", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0bb1e82ac17db58b96f6368110f1748");
        } else if (!aa.a(str) && !aa.a(str2)) {
            com.sankuai.waimai.platform.globalcart.poimix.b<String> poiIdTab = getPoiIdTab();
            Object[] objArr2 = {str, str2};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.platform.globalcart.poimix.b.a;
            if (PatchProxy.isSupport(objArr2, poiIdTab, changeQuickRedirect3, false, "0b5f253116cb020a07c6d3fad6c90446", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, poiIdTab, changeQuickRedirect3, false, "0b5f253116cb020a07c6d3fad6c90446");
                return;
            }
            if (!poiIdTab.a(str)) {
                poiIdTab.b(str);
            }
            if (poiIdTab.b == null || poiIdTab.b.isEmpty() || str.equals(str2)) {
                return;
            }
            for (ArrayList<String> arrayList : poiIdTab.b) {
                if (arrayList != null && !arrayList.isEmpty() && arrayList.contains(str) && !arrayList.contains(str2)) {
                    arrayList.add(0, str2);
                    return;
                }
            }
        }
    }

    public boolean isSamePoi(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b780be00f9562192b9413a866ddf3892", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b780be00f9562192b9413a866ddf3892")).booleanValue() : getPoiIdTab().a(str, str2);
    }

    public void refreshPoiId(boolean z, List<GlobalCartBrief> list, List<GlobalCartBrief> list2) {
        int i = 0;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), list, list2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2702cc6c4aa14f7b9ca173621950bb13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2702cc6c4aa14f7b9ca173621950bb13");
        } else if (com.sankuai.waimai.foundation.utils.b.b(list2)) {
            log(z, list.size(), 0, 0);
        } else {
            for (GlobalCartBrief globalCartBrief : list2) {
                if (globalCartBrief != null && !com.sankuai.waimai.foundation.utils.b.b(globalCartBrief.productList)) {
                    Iterator<GlobalCartBrief> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        GlobalCartBrief next = it.next();
                        if (next != null && !com.sankuai.waimai.foundation.utils.b.b(next.productList) && globalCartBrief.equals(next)) {
                            addNewPoiId(next.poiIdStr, globalCartBrief.poiIdStr);
                            i++;
                            break;
                        }
                    }
                }
            }
            log(z, list.size(), list2.size(), i);
        }
    }

    private void log(boolean z, int i, int i2, int i3) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ba98d8a9be0f31b4ae1e342cd549a57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ba98d8a9be0f31b4ae1e342cd549a57");
        } else if (i != i2) {
            if (i < i2) {
                reportCat(z ? 7 : 2);
            } else {
                reportCat(z ? 8 : 3);
            }
        } else if (i3 == i) {
            reportCat(z ? 5 : 0);
        } else if (i3 < i) {
            reportCat(z ? 9 : 4);
        }
    }

    public void reportCat(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec01511e7628d1f90fb92e08528bc137", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec01511e7628d1f90fb92e08528bc137");
        } else {
            c.a().a(i, com.meituan.android.singleton.b.a.getResources().getString(R.string.waimai_globalcart_refresh_poiid), SystemClock.elapsedRealtime());
        }
    }
}
