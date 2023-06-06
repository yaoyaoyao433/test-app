package com.sankuai.waimai.business.order.submit;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.widget.TextView;
import com.dianping.titans.utils.StorageUtil;
import com.meituan.android.paycommon.lib.VersionInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager;
import com.sankuai.waimai.business.order.api.submit.d;
import com.sankuai.waimai.business.order.api.submit.model.CrossOrderPoiParam;
import com.sankuai.waimai.business.order.submit.model.CyclePurchaseCalculateInfo;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.bussiness.order.base.utils.i;
import com.sankuai.waimai.bussiness.order.confirm.coupon.model.f;
import com.sankuai.waimai.bussiness.order.confirm.request.b;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param.OrderFoodInput;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param.PoiAddressParam;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param.PoiOrderParam;
import com.sankuai.waimai.bussiness.order.crossconfirm.request.d;
import com.sankuai.waimai.bussiness.order.transfer.SchemeFactory;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.foundation.core.service.order.IOrderSubmitService;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.foundation.router.interfaces.c;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.d;
import com.sankuai.waimai.globalcart.model.CartProduct;
import com.sankuai.waimai.globalcart.model.GlobalCart;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.sankuai.waimai.platform.capacity.abtest.ABTestManager;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import com.sankuai.waimai.platform.domain.core.multiperson.MultiPersonCart;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.platform.domain.core.order.WmOrderedFood;
import com.sankuai.waimai.platform.domain.core.poi.TodayRecommendPoi;
import com.sankuai.waimai.platform.domain.manager.order.ISubmitOrderManagerPlatform;
import com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager;
import com.sankuai.waimai.router.annotation.RouterProvider;
import com.sankuai.waimai.router.core.e;
import com.sankuai.waimai.router.core.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SubmitOrderManager implements ISubmitOrderManager, IOrderSubmitService, ISubmitOrderManagerPlatform {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static SubmitOrderManager sInstance;
    private String adActivityFlag;
    private String allowanceAllianceScenes;
    private String hashId;
    private String mBusinessScene;
    private int mBussinessType;
    private boolean mCanClear;
    private String mCaution;
    private HashMap<Long, String> mCautionMap;
    private HashMap<Long, String> mInvoiceMap;
    private String mInvoiceTitle;
    private int mInvoiceType;
    private boolean mIsFromMTOtherChannel;
    private boolean mIsSelfDelivery;
    private a.EnumC0947a mLoginFrom;
    private com.sankuai.waimai.platform.domain.manager.order.a mOrderConfirmCallBack;
    private List<com.sankuai.waimai.business.order.api.submit.a> mOrderStatusObservers;
    private String mOrderToken;
    private long mPoiId;
    private String mPoiIdStr;
    private TodayRecommendPoi mRecPoi;
    private int mRequestCode;
    private com.sankuai.waimai.platform.domain.core.response.a mServerExpController;
    private int mSourceType;
    private String mTag;
    private String mTaxPayerId;
    private WeakReference mTxtSubmitSoft;

    public SubmitOrderManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a806214d646c39de1de04b01d4dedb31", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a806214d646c39de1de04b01d4dedb31");
            return;
        }
        this.mPoiId = -1L;
        this.mPoiIdStr = "";
        this.mIsSelfDelivery = false;
        this.hashId = "";
        this.mOrderToken = "";
        this.mInvoiceTitle = "";
        this.mTaxPayerId = "";
        this.mInvoiceType = 0;
        this.mCaution = "";
        this.mCanClear = false;
        this.mSourceType = 15;
    }

    @RouterProvider
    public static SubmitOrderManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2a7eb6c6b90e50b231147cbcadd5df51", RobustBitConfig.DEFAULT_VALUE)) {
            return (SubmitOrderManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2a7eb6c6b90e50b231147cbcadd5df51");
        }
        if (sInstance == null) {
            synchronized (SubmitOrderManager.class) {
                if (sInstance == null) {
                    sInstance = new SubmitOrderManager();
                }
            }
        }
        return sInstance;
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public boolean checkAccount(Context context, long j, String str, a.EnumC0947a enumC0947a) {
        Object[] objArr = {context, new Long(j), str, enumC0947a};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "025262eb89cb49846593a71273d8116c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "025262eb89cb49846593a71273d8116c")).booleanValue();
        }
        Object[] objArr2 = {context, new Long(j), str, enumC0947a};
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "aaa008e87452804eccd696cdc1e1143b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "aaa008e87452804eccd696cdc1e1143b")).booleanValue();
        }
        if (com.sankuai.waimai.platform.domain.manager.user.a.i().a()) {
            return true;
        }
        b.a(context, j, str, enumC0947a);
        return false;
    }

    public void showLogin(Context context, long j, String str, a.EnumC0947a enumC0947a) {
        Object[] objArr = {context, new Long(j), str, enumC0947a};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a15f8708c76df024654e91132581b19a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a15f8708c76df024654e91132581b19a");
        } else {
            b.a(context, j, str, enumC0947a);
        }
    }

    public void showBindPhone(Context context, long j, String str, a.EnumC0947a enumC0947a) {
        Object[] objArr = {context, new Long(j), str, enumC0947a};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c13ac9ba9af3f02beebdde5aec3dde64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c13ac9ba9af3f02beebdde5aec3dde64");
            return;
        }
        Object[] objArr2 = {context, new Long(j), str, enumC0947a};
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "7cb3937058290be9e1b7881c11790ea9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "7cb3937058290be9e1b7881c11790ea9");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("poiId", j);
        bundle.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, str);
        com.sankuai.waimai.foundation.router.a.a(context, c.j, bundle);
        com.sankuai.waimai.foundation.core.service.user.a.a = enumC0947a;
    }

    public String getInvoiceTitle() {
        return this.mInvoiceTitle;
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public void setInvoiceTitle(String str) {
        this.mInvoiceTitle = str;
    }

    public String getTaxPayerId() {
        return this.mTaxPayerId;
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public void setTaxPayerId(String str) {
        this.mTaxPayerId = str;
    }

    public int getInvoiceType() {
        return this.mInvoiceType;
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public void setInvoiceType(int i) {
        this.mInvoiceType = i;
    }

    public String getCaution() {
        return this.mCaution;
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public void setCaution(String str) {
        this.mCaution = str;
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public void setCautionMap(HashMap<Long, String> hashMap) {
        this.mCautionMap = hashMap;
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public void setInvoice(HashMap<Long, String> hashMap) {
        this.mInvoiceMap = hashMap;
    }

    public HashMap<Long, String> getCautionMap() {
        return this.mCautionMap;
    }

    public HashMap<Long, String> getInvoiceMap() {
        return this.mInvoiceMap;
    }

    public int getSourceType() {
        return this.mSourceType;
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public void setSourceType(int i) {
        this.mSourceType = i;
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public void registerOrderStatusObserver(com.sankuai.waimai.business.order.api.submit.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c31ba89de8351ccbab595b1ee6b0de0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c31ba89de8351ccbab595b1ee6b0de0a");
            return;
        }
        if (this.mOrderStatusObservers == null) {
            this.mOrderStatusObservers = new LinkedList();
        }
        if (this.mOrderStatusObservers.contains(aVar)) {
            return;
        }
        this.mOrderStatusObservers.add(aVar);
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public void unregisterOrderStatusObserver(com.sankuai.waimai.business.order.api.submit.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5cb718f1b5a186b466a0dd4264a7d223", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5cb718f1b5a186b466a0dd4264a7d223");
        } else if (this.mOrderStatusObservers != null) {
            this.mOrderStatusObservers.remove(aVar);
        }
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public void updateOrderStatus() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e61d54af36e4065ed6dbf1205c209eb9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e61d54af36e4065ed6dbf1205c209eb9");
        } else {
            updateOrderStatus("", null);
        }
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public void updateOrderStatus(String str, Uri uri) {
        Object[] objArr = {str, uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59373ab3eede5cd1a6de3926afd1904c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59373ab3eede5cd1a6de3926afd1904c");
        } else if (this.mOrderStatusObservers != null) {
            for (com.sankuai.waimai.business.order.api.submit.a aVar : this.mOrderStatusObservers) {
                aVar.a(str, uri);
            }
        }
    }

    public String getHashId() {
        return this.hashId;
    }

    public void setHashId(String str) {
        this.hashId = str;
    }

    public void resetHashId() {
        this.hashId = "";
    }

    public void setPoiId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c5fded054559eba2c53734f7cfc9b693", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c5fded054559eba2c53734f7cfc9b693");
        } else {
            this.mPoiId = j;
        }
    }

    public long getPoiId() {
        return this.mPoiId;
    }

    public String getPoiIdStr() {
        return this.mPoiIdStr;
    }

    public void setPoiIdStr(String str) {
        this.mPoiIdStr = str;
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public String getToken() {
        return this.mOrderToken;
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public void setToken(String str) {
        this.mOrderToken = str;
    }

    public void resetToken() {
        this.mOrderToken = "";
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public void clearOrder() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54049220ab833f89c9666a4530d25dcf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54049220ab833f89c9666a4530d25dcf");
            return;
        }
        resetToken();
        resetHashId();
        setInvoiceTitle("");
        setTaxPayerId("");
        setInvoiceType(0);
        setCaution("");
    }

    public static void clearErrorGoods(String str, List<com.sankuai.waimai.platform.domain.core.order.a> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c92217581c802c1b42ef0665cee3d5bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c92217581c802c1b42ef0665cee3d5bf");
            return;
        }
        com.sankuai.waimai.platform.domain.manager.poi.a a = com.sankuai.waimai.platform.domain.manager.poi.a.a();
        Object[] objArr2 = {str, list};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.platform.domain.manager.poi.a.a;
        if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "5dff2bddb756a0260964e954b7aee2d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "5dff2bddb756a0260964e954b7aee2d3");
        } else if (a.b != null) {
            for (com.sankuai.waimai.foundation.core.service.poi.b bVar : (com.sankuai.waimai.foundation.core.service.poi.b[]) a.b.toArray(new com.sankuai.waimai.foundation.core.service.poi.b[a.b.size()])) {
                bVar.a(str, list);
            }
        }
    }

    @Deprecated
    public static void updateAllShopCartData(long j, List<OrderedFood> list) {
        Object[] objArr = {new Long(j), list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "865e37d11e7d7eeccc46b93751830022", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "865e37d11e7d7eeccc46b93751830022");
        } else {
            updateAllShopCartData(String.valueOf(j), list);
        }
    }

    public static void updateAllShopCartData(String str, List<OrderedFood> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e1e49901e279e4cccb1a76793f116f05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e1e49901e279e4cccb1a76793f116f05");
        } else if (d.a(list)) {
        } else {
            GlobalCartManager.getInstance().updateShopCartData(str, list, getInstance().getSourceType());
        }
    }

    @Deprecated
    public static void updateShopCartWithMember(long j, List<Map<String, Object>> list) {
        Object[] objArr = {new Long(j), list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "88c88293bdad71075892c04daef13da2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "88c88293bdad71075892c04daef13da2");
        } else {
            updateShopCartWithMember(String.valueOf(j), list);
        }
    }

    public static void updateShopCartWithMember(String str, List<Map<String, Object>> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6ce71bf15255d0a4a786bf644e0af315", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6ce71bf15255d0a4a786bf644e0af315");
        } else {
            GlobalCartManager.getInstance().updateShopCartWithMember(str, list, getInstance().getSourceType());
        }
    }

    @Deprecated
    public void removeCartData(long j, List<WmOrderedFood> list) {
        Object[] objArr = {new Long(j), list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8bd64293e0397d18e17b5668b0386095", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8bd64293e0397d18e17b5668b0386095");
        } else {
            removeCartData(String.valueOf(j), getSourceType(), list);
        }
    }

    public void removeCartData(String str, List<WmOrderedFood> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "182a4a018b70839fbd84fade28f90f0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "182a4a018b70839fbd84fade28f90f0c");
        } else {
            removeCartData(str, getSourceType(), list);
        }
    }

    @Deprecated
    public void removeCartData(long j, int i, List<WmOrderedFood> list) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9ff2babf274ea80581995bc8a224e50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9ff2babf274ea80581995bc8a224e50");
        } else {
            removeCartData(String.valueOf(j), i, list);
        }
    }

    public void removeCartData(String str, int i, List<WmOrderedFood> list) {
        Object[] objArr = {str, Integer.valueOf(i), list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e80d6e82124ec86dffa2f55178864dbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e80d6e82124ec86dffa2f55178864dbf");
            return;
        }
        for (WmOrderedFood wmOrderedFood : list) {
            if (wmOrderedFood != null) {
                GlobalCartManager.getInstance().removeOrderedFoodAll(i, str, new CartProduct().fromWmOrderedFood(wmOrderedFood));
            }
        }
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    @Deprecated
    public void preOrder(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e0ee07e0b690ecaf7e5018346f4acf9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e0ee07e0b690ecaf7e5018346f4acf9");
        } else if ((!aa.a(this.mPoiIdStr) || this.mPoiId >= 0) && activity != null) {
            TextView textView = this.mTxtSubmitSoft != null ? (TextView) this.mTxtSubmitSoft.get() : null;
            d.a aVar = new d.a();
            aVar.b = activity;
            aVar.c = this.mServerExpController;
            d.a a = aVar.a(this.mPoiId);
            a.d = this.mPoiIdStr;
            a.e = this.mIsSelfDelivery;
            a.f = textView;
            a.g = this.mTag;
            a.h = str;
            a.i = this.mRequestCode;
            a.j = this.mLoginFrom;
            a.k = this.mBussinessType;
            a.l = this.mIsFromMTOtherChannel;
            a.m = this.mSourceType;
            a.n = this.mBusinessScene;
            a.o = this.allowanceAllianceScenes;
            a.p = this.adActivityFlag;
            preOrderBase(a.a());
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.order.IOrderSubmitService
    public void perOrder(com.sankuai.waimai.foundation.core.service.order.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0ce0d3f9c182b4d9ba560f583abb7b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0ce0d3f9c182b4d9ba560f583abb7b6");
        } else {
            preOrder(switchSubmitOrderParams(dVar));
        }
    }

    @NonNull
    private com.sankuai.waimai.business.order.api.submit.d switchSubmitOrderParams(@NonNull com.sankuai.waimai.foundation.core.service.order.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32e80e516edf42a759c0cf45c8d5dc77", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.business.order.api.submit.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32e80e516edf42a759c0cf45c8d5dc77");
        }
        d.a aVar = new d.a();
        aVar.b = dVar.b;
        d.a a = aVar.a(dVar.c);
        a.d = dVar.d;
        a.f = dVar.f;
        a.g = dVar.g;
        a.i = dVar.j;
        a.k = dVar.k;
        a.m = dVar.m;
        a.l = dVar.l;
        a.h = dVar.i;
        a.c = new com.sankuai.waimai.platform.domain.core.response.a();
        a.r = dVar.n;
        a.t = dVar.o;
        a.v = dVar.p;
        return aVar.a();
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public void preOrder(final com.sankuai.waimai.business.order.api.submit.d dVar) {
        boolean z = false;
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "427011755c30f825436bfc2b4a1d8764", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "427011755c30f825436bfc2b4a1d8764");
        } else if (dVar == null) {
        } else {
            initMemberVariablesBySubmitOrderParams(dVar);
            dVar.i = "";
            ABStrategy strategy = ABTestManager.getInstance(com.meituan.android.singleton.b.a).getStrategy(SchemeFactory.b, null);
            if (strategy != null && !TextUtils.isEmpty(strategy.expName)) {
                z = strategy.expName.equalsIgnoreCase(ErrorCode.ERROR_TYPE_B);
            }
            if (dVar.o == 15 && z) {
                com.sankuai.waimai.foundation.router.a.a().a(new e() { // from class: com.sankuai.waimai.business.order.submit.SubmitOrderManager.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.router.core.e
                    public final void a(@NonNull j jVar) {
                        Object[] objArr2 = {jVar};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "56c2aa97bb673c8ac977284d65e3e48c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "56c2aa97bb673c8ac977284d65e3e48c");
                        } else if (dVar.g != null) {
                            dVar.g.setEnabled(true);
                        }
                    }

                    @Override // com.sankuai.waimai.router.core.e
                    public final void a(@NonNull j jVar, int i) {
                        Object[] objArr2 = {jVar, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8d1064ed0b48682537abc7cad0f2b95a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8d1064ed0b48682537abc7cad0f2b95a");
                        } else if (dVar.g != null) {
                            dVar.g.setEnabled(true);
                        }
                    }
                }).a(dVar.b, SchemeFactory.a(dVar));
            } else {
                preOrderBase(dVar);
            }
        }
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public void rxInquiryPreOrder(com.sankuai.waimai.foundation.core.service.order.d dVar, String str) {
        Object[] objArr = {dVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a2fda8345314237f0c20cd4d4b589dd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a2fda8345314237f0c20cd4d4b589dd5");
        } else if (dVar == null) {
        } else {
            com.sankuai.waimai.bussiness.order.base.log.b.a().a(dVar.i);
            com.sankuai.waimai.bussiness.order.confirm.model.preview.param.a b = com.sankuai.waimai.bussiness.order.confirm.request.a.b(str);
            if (b == null) {
                com.sankuai.waimai.bussiness.order.base.log.b.a().a("sg_order_preview_request_params_error", str, dVar);
                return;
            }
            com.sankuai.waimai.business.order.api.submit.d switchSubmitOrderParams = switchSubmitOrderParams(dVar);
            Activity activity = switchSubmitOrderParams.b;
            String str2 = switchSubmitOrderParams.e;
            boolean a = aa.a(str2);
            long j = switchSubmitOrderParams.d;
            if ((a && j < 0) || activity == null) {
                com.sankuai.waimai.bussiness.order.base.log.b a2 = com.sankuai.waimai.bussiness.order.base.log.b.a();
                a2.a("sg_order_preview_poiid_invalid", str2 + "---" + j, "");
                return;
            }
            initMemberVariablesBySubmitOrderParams(switchSubmitOrderParams);
            this.mPoiId = b.b;
            this.mPoiIdStr = b.c;
            b.C0904b c0904b = new b.C0904b(j, str2, 0, false, switchSubmitOrderParams.n, switchSubmitOrderParams.k, switchSubmitOrderParams.j, switchSubmitOrderParams.i, switchSubmitOrderParams.l, getBusinessType(switchSubmitOrderParams), -1.0d, null);
            c0904b.o = switchSubmitOrderParams.q;
            c0904b.p = switchSubmitOrderParams.r;
            c0904b.d = switchSubmitOrderParams.p;
            com.sankuai.waimai.bussiness.order.confirm.request.preview.a a3 = new com.sankuai.waimai.bussiness.order.confirm.request.preview.a(activity).a(switchSubmitOrderParams.g);
            a3.e = switchSubmitOrderParams.c;
            com.sankuai.waimai.bussiness.order.confirm.request.b a4 = com.sankuai.waimai.bussiness.order.confirm.request.b.a(0, b, dVar.g);
            a4.e = c0904b;
            a4.f = a3;
            a4.a();
        }
    }

    private AddressItem getNetBarAddressInfo(Context context) {
        AddressItem addressItem;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63048d0e8984b0cc3a8482cde808d41a", RobustBitConfig.DEFAULT_VALUE)) {
            return (AddressItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63048d0e8984b0cc3a8482cde808d41a");
        }
        String sharedValue = StorageUtil.getSharedValue(context, "netbar_address_info");
        if (!aa.a(sharedValue)) {
            try {
                addressItem = (AddressItem) com.sankuai.waimai.mach.utils.b.a().fromJson(sharedValue, (Class<Object>) AddressItem.class);
            } catch (Exception unused) {
                addressItem = null;
            }
            if (addressItem != null && addressItem.id != 0) {
                return addressItem;
            }
        }
        return null;
    }

    private AddressItem getAddressItem(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "147e0a16d4ed9f31acc463a74303861f", RobustBitConfig.DEFAULT_VALUE)) {
            return (AddressItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "147e0a16d4ed9f31acc463a74303861f");
        }
        AddressItem netBarAddressInfo = getNetBarAddressInfo(context);
        return netBarAddressInfo == null ? com.sankuai.waimai.platform.domain.manager.location.a.a(context) : netBarAddressInfo;
    }

    private boolean isNeedRequestRXInquiry(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba53414092fb74cf70864129968c865c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba53414092fb74cf70864129968c865c")).booleanValue() : "1".equals(getCommonParamFromObject(str, "drug_tag"));
    }

    private Map<String, Object> getPrescriptionInfo(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd2cfcca87a9d66bf26205cad81b2545", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd2cfcca87a9d66bf26205cad81b2545");
        }
        String commonParamFromObject = getCommonParamFromObject(str, "prescription_info");
        if (aa.a(commonParamFromObject)) {
            return null;
        }
        return com.sankuai.waimai.mach.utils.b.a(commonParamFromObject);
    }

    private Map<String, Object> getExtParamFromObject(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e163eb6c2fd54c40cc5d4c776e4c153", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e163eb6c2fd54c40cc5d4c776e4c153");
        }
        String commonParamFromObject = getCommonParamFromObject(str, "ext_param");
        if (!aa.a(commonParamFromObject)) {
            return com.sankuai.waimai.mach.utils.b.a(commonParamFromObject);
        }
        return new HashMap();
    }

    public String getCommonParamFromObject(@Nullable String str, @NonNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e55a6e92ab31e51ad6e24445751748c8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e55a6e92ab31e51ad6e24445751748c8");
        }
        if (aa.a(str)) {
            return "";
        }
        try {
            return new JSONObject(str).optString(str2);
        } catch (Exception e) {
            com.sankuai.waimai.foundation.core.exception.a.b(e);
            return "";
        }
    }

    public CyclePurchaseCalculateInfo getCyclePurchaseInfo(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc897579d92c381159a65c033aa5e20c", RobustBitConfig.DEFAULT_VALUE)) {
            return (CyclePurchaseCalculateInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc897579d92c381159a65c033aa5e20c");
        }
        if (aa.a(str)) {
            return null;
        }
        try {
            return (CyclePurchaseCalculateInfo) com.sankuai.waimai.mach.utils.b.a().fromJson(str, (Class<Object>) CyclePurchaseCalculateInfo.class);
        } catch (Exception e) {
            com.sankuai.waimai.foundation.core.exception.a.b(e);
            return null;
        }
    }

    private List<f> getSelectedCoupons(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09d521fccc78837db6704812df43129a", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09d521fccc78837db6704812df43129a");
        }
        if (aa.a(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("sg_brand_selected_coupon")) {
                String string = jSONObject.getString("sg_brand_selected_coupon");
                if (aa.a(string)) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                f fVar = new f();
                fVar.a = 1;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(string);
                fVar.b = arrayList2;
                arrayList.add(fVar);
                return arrayList;
            }
            return null;
        } catch (Throwable th) {
            com.sankuai.waimai.foundation.core.exception.a.b(th);
            return null;
        }
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public void multiPersonPreOrder(Activity activity, MultiPersonCart multiPersonCart, String str) {
        Object[] objArr = {activity, multiPersonCart, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "741823facd06b7d67eeceff6adb60df0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "741823facd06b7d67eeceff6adb60df0");
        } else if (multiPersonCart == null || activity == null) {
        } else {
            com.sankuai.waimai.mach.manager.load.c.a("waimai", "waimai-order");
            long poiId = multiPersonCart.getPoiInfo().getPoiId();
            String poiIdStr = multiPersonCart.getPoiInfo().getPoiIdStr();
            boolean isSelfDelivery = multiPersonCart.isSelfDelivery();
            this.mPoiId = poiId;
            this.mPoiIdStr = poiIdStr;
            AddressItem a = com.sankuai.waimai.platform.domain.manager.location.a.a(activity);
            if (a == null) {
                a = com.sankuai.waimai.platform.domain.manager.location.a.b();
            }
            AddressItem addressItem = a;
            int b = com.sankuai.waimai.platform.capacity.persistent.sp.a.b((Context) activity, "wm_order_pay_type", 0);
            List<WmOrderedFood> requestList = GlobalCartManager.getInstance().getRequestList(this.mPoiIdStr, this.mSourceType);
            com.sankuai.waimai.bussiness.order.confirm.request.preview.a aVar = new com.sankuai.waimai.bussiness.order.confirm.request.preview.a(activity);
            com.sankuai.waimai.bussiness.order.confirm.model.preview.param.a requestParams = getRequestParams(poiId, poiIdStr, addressItem, b, isSelfDelivery ? 1 : 0, com.sankuai.waimai.bussiness.order.crossconfirm.utils.b.c(requestList));
            requestParams.C = multiPersonCart.getGoodsCouponViewId();
            requestParams.E = multiPersonCart.getShoppingCart().getId();
            b.C0904b c0904b = new b.C0904b(poiId, poiIdStr, 2, true, false, -1, "from_multi_order", "", a.EnumC0947a.NONE, isSelfDelivery ? 1 : 0, 0.0d, multiPersonCart);
            com.sankuai.waimai.bussiness.order.confirm.request.b a2 = com.sankuai.waimai.bussiness.order.confirm.request.b.a(0, requestParams, str);
            a2.e = c0904b;
            a2.f = aVar;
            a2.a();
        }
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public void shopCartCrossOrder(Activity activity, com.sankuai.waimai.platform.domain.manager.order.a aVar, String str, int i, a.EnumC0947a enumC0947a, List<GlobalCart> list) {
        Object[] objArr = {activity, aVar, str, Integer.valueOf(i), enumC0947a, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a015a59c22644da0af5c27de85fdf818", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a015a59c22644da0af5c27de85fdf818");
            return;
        }
        this.mServerExpController = new com.sankuai.waimai.platform.domain.core.response.a();
        this.mOrderConfirmCallBack = aVar;
        this.mRequestCode = i;
        this.mLoginFrom = enumC0947a;
        this.mTag = str;
        ABStrategy strategy = ABTestManager.getInstance(com.meituan.android.singleton.b.a).getStrategy(SchemeFactory.c, null);
        if ((strategy == null || TextUtils.isEmpty(strategy.expName)) ? false : strategy.expName.equalsIgnoreCase(ErrorCode.ERROR_TYPE_B)) {
            com.sankuai.waimai.foundation.router.a.a(activity, SchemeFactory.a(list, enumC0947a, i, str));
            return;
        }
        com.sankuai.waimai.mach.manager.load.c.a("waimai", "waimai-order");
        AddressItem a = com.sankuai.waimai.platform.domain.manager.location.a.a(activity);
        if (a != null && a.addressType == 1) {
            com.sankuai.waimai.platform.domain.manager.location.a.b(activity);
            a = null;
        }
        if (a == null) {
            a = getAddressItemCacheDefault();
        }
        com.sankuai.waimai.bussiness.order.crossconfirm.request.c cVar = new com.sankuai.waimai.bussiness.order.crossconfirm.request.c(activity);
        cVar.e = enumC0947a;
        cVar.g = this.mTag;
        cVar.b = aVar;
        cVar.d = this.mRequestCode;
        new d.a().a(cVar).a(PoiAddressParam.formAddress(a)).a(PoiOrderParam.fromGlobalCart(list)).a().a();
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public void commonCrossOrderPreOrder(Activity activity, List<CrossOrderPoiParam> list, String str, com.sankuai.waimai.business.order.api.submit.listener.a aVar, String str2, int i, a.EnumC0947a enumC0947a, String str3) {
        Object[] objArr = {activity, list, str, aVar, str2, Integer.valueOf(i), enumC0947a, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0f7ab1c235357f36b9e4c318be22866", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0f7ab1c235357f36b9e4c318be22866");
            return;
        }
        com.sankuai.waimai.mach.manager.load.c.a("waimai", "waimai-order");
        AddressItem a = com.sankuai.waimai.platform.domain.manager.location.a.a(activity);
        if (a != null && a.addressType == 1) {
            a = null;
            com.sankuai.waimai.platform.domain.manager.location.a.b(activity);
        }
        if (a == null) {
            a = getAddressItemCacheDefault();
        }
        com.sankuai.waimai.bussiness.order.crossconfirm.request.a aVar2 = new com.sankuai.waimai.bussiness.order.crossconfirm.request.a(activity);
        aVar2.g = enumC0947a;
        aVar2.h = str3;
        aVar2.j = str2;
        aVar2.c = aVar;
        aVar2.f = i;
        new d.a().a(aVar2).a(PoiAddressParam.formAddress(a)).a(b.a(list)).a().a();
    }

    private List<OrderedFood> getHasCheckedGoodItem(GlobalCart globalCart) {
        Object[] objArr = {globalCart};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7318c74183119d35ea3e660ad9055a6a", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7318c74183119d35ea3e660ad9055a6a");
        }
        List<GlobalCart.g> list = globalCart.productList;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            GlobalCart.g gVar = list.get(i);
            if (gVar.j != null && gVar.j.c == 1) {
                arrayList.add(GlobalCart.g.a(gVar));
            }
        }
        return arrayList;
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public void shopCartPreOrder(Activity activity, com.sankuai.waimai.platform.domain.manager.order.a aVar, a.EnumC0947a enumC0947a, String str, int i, com.sankuai.waimai.platform.domain.core.response.a aVar2, GlobalCart globalCart) {
        Object[] objArr = {activity, aVar, enumC0947a, str, Integer.valueOf(i), aVar2, globalCart};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b65d4424e625b166512f5c3413fe44d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b65d4424e625b166512f5c3413fe44d3");
        } else if (globalCart != null) {
            if ((!aa.a(globalCart.poiIdStr) || globalCart.poiId >= 0) && activity != null) {
                AddressItem addressItem = null;
                ABStrategy strategy = ABTestManager.getInstance(com.meituan.android.singleton.b.a).getStrategy(SchemeFactory.c, null);
                if ((strategy == null || TextUtils.isEmpty(strategy.expName)) ? false : strategy.expName.equalsIgnoreCase(ErrorCode.ERROR_TYPE_B)) {
                    com.sankuai.waimai.foundation.router.a.a(activity, SchemeFactory.a(globalCart, enumC0947a, i, str));
                    return;
                }
                com.sankuai.waimai.mach.manager.load.c.a("waimai", "waimai-order");
                this.mServerExpController = aVar2;
                this.mPoiId = globalCart.poiId;
                this.mPoiIdStr = globalCart.poiIdStr;
                this.mTag = str;
                this.mRequestCode = i;
                this.mLoginFrom = enumC0947a;
                this.mOrderConfirmCallBack = aVar;
                List<OrderedFood> hasCheckedGoodItem = getHasCheckedGoodItem(globalCart);
                double d = globalCart.clearingInfo != null ? globalCart.clearingInfo.c : 0.0d;
                this.mSourceType = globalCart.getBizType();
                int b = com.sankuai.waimai.platform.capacity.persistent.sp.a.b((Context) activity, "wm_order_pay_type", 0);
                AddressItem a = com.sankuai.waimai.platform.domain.manager.location.a.a(activity);
                if (a == null || a.addressType != 1) {
                    addressItem = a;
                } else {
                    com.sankuai.waimai.platform.domain.manager.location.a.b(activity);
                }
                if (addressItem == null) {
                    addressItem = getAddressItemCacheDefault();
                }
                com.sankuai.waimai.bussiness.order.confirm.request.preview.a aVar3 = new com.sankuai.waimai.bussiness.order.confirm.request.preview.a(activity);
                aVar3.e = aVar2;
                aVar3.f = aVar;
                com.sankuai.waimai.bussiness.order.confirm.model.preview.param.a requestParams = getRequestParams(globalCart.poiId, globalCart.poiIdStr, addressItem, b, 0, com.sankuai.waimai.bussiness.order.crossconfirm.utils.b.b(hasCheckedGoodItem));
                initCouponRequestParams(requestParams, globalCart);
                b.C0904b c0904b = new b.C0904b(globalCart.poiId, globalCart.poiIdStr, 4, false, false, i, "", "", enumC0947a, 0, d, null);
                if (isNeedRequestRXInquiry(globalCart)) {
                    com.sankuai.waimai.bussiness.order.confirm.request.a a2 = com.sankuai.waimai.bussiness.order.confirm.request.a.a(activity, requestParams, str);
                    a2.c = c0904b;
                    a2.e = aVar3;
                    a2.a("");
                    return;
                }
                com.sankuai.waimai.bussiness.order.confirm.request.b a3 = com.sankuai.waimai.bussiness.order.confirm.request.b.a(0, requestParams, str, enumC0947a);
                a3.e = c0904b;
                a3.f = aVar3;
                a3.a();
            }
        }
    }

    private boolean isNeedRequestRXInquiry(@NonNull GlobalCart globalCart) {
        Object[] objArr = {globalCart};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8af6434f675d7c1be39c4d931179033", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8af6434f675d7c1be39c4d931179033")).booleanValue() : globalCart.poiInfo != null && globalCart.poiInfo.k == 2;
    }

    private void initCouponRequestParams(com.sankuai.waimai.bussiness.order.confirm.model.preview.param.a aVar, GlobalCart globalCart) {
        Object[] objArr = {aVar, globalCart};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3e546be717e1fd4f0a1043d3e9390af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3e546be717e1fd4f0a1043d3e9390af");
        } else if (globalCart == null) {
        } else {
            aVar.B = globalCart.poiCouponViewId;
            aVar.A = globalCart.redCouponViewId;
        }
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    @Deprecated
    public void h5CommonOrderPreOrder(Activity activity, long j, int i, List<WmOrderedFood> list, String str, String str2, int i2) {
        Object[] objArr = {activity, new Long(j), Integer.valueOf(i), list, str, str2, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ca292957b4fc9e7c3d06622b188b540", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ca292957b4fc9e7c3d06622b188b540");
        } else {
            h5CommonOrderPreOrder(activity, j, "", i, list, str, str2, i2, null);
        }
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public void h5CommonOrderPreOrder(Activity activity, long j, String str, int i, List<WmOrderedFood> list, String str2, String str3, int i2) {
        Object[] objArr = {activity, new Long(j), str, Integer.valueOf(i), list, str2, str3, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b6495909640bd90a618eace5e9a60e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b6495909640bd90a618eace5e9a60e9");
        } else {
            h5CommonOrderPreOrder(activity, j, str, i, list, str2, str3, i2, null);
        }
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    @Deprecated
    public void h5CommonOrderPreOrder(Activity activity, long j, int i, List<WmOrderedFood> list, String str, String str2, int i2, com.sankuai.waimai.business.order.api.submit.listener.b bVar) {
        Object[] objArr = {activity, new Long(j), Integer.valueOf(i), list, str, str2, Integer.valueOf(i2), bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "83a6b6fd296ec6d18255c9b72dbe6971", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "83a6b6fd296ec6d18255c9b72dbe6971");
        } else {
            h5CommonOrderPreOrder(activity, j, "", i, list, str, str2, i2, bVar);
        }
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public void h5CommonOrderPreOrder(Activity activity, long j, String str, int i, List<WmOrderedFood> list, String str2, String str3, int i2, final com.sankuai.waimai.business.order.api.submit.listener.b bVar) {
        Object[] objArr = {activity, new Long(j), str, Integer.valueOf(i), list, str2, str3, Integer.valueOf(i2), bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3636240f8e77166c2eac30c423357ee2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3636240f8e77166c2eac30c423357ee2");
        } else if ((!aa.a(str) || j >= 0) && activity != null) {
            com.sankuai.waimai.mach.manager.load.c.a("waimai", "waimai-order");
            int b = com.sankuai.waimai.platform.capacity.persistent.sp.a.b((Context) activity, "wm_order_pay_type", 0);
            AddressItem a = com.sankuai.waimai.platform.domain.manager.location.a.a(activity);
            if (a != null && a.addressType == 1) {
                a = null;
                com.sankuai.waimai.platform.domain.manager.location.a.b(activity);
            }
            if (a == null) {
                a = getAddressItemCacheDefault();
            }
            com.sankuai.waimai.bussiness.order.confirm.request.preview.a aVar = new com.sankuai.waimai.bussiness.order.confirm.request.preview.a(activity);
            aVar.h = new com.sankuai.waimai.bussiness.order.transfer.base.c() { // from class: com.sankuai.waimai.business.order.submit.SubmitOrderManager.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.bussiness.order.transfer.base.c
                public final void a(int i3, Map<String, Object> map, String str4) {
                    Object[] objArr2 = {Integer.valueOf(i3), null, str4};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ecda31bfc0c7266b730ffe390ab211da", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ecda31bfc0c7266b730ffe390ab211da");
                    } else if (bVar != null) {
                        bVar.a(i3, null, str4);
                    }
                }
            };
            com.sankuai.waimai.bussiness.order.confirm.model.preview.param.a requestParams = getRequestParams(j, str, a, b, i, com.sankuai.waimai.bussiness.order.crossconfirm.utils.b.c(list));
            requestParams.N = str2;
            b.C0904b c0904b = new b.C0904b(j, str, 1, false, false, i2, "", "", a.EnumC0947a.NONE, i, 0.0d, null);
            String commonParamFromObject = getCommonParamFromObject(str2, "drug_extra");
            if (isNeedRequestRXInquiry(commonParamFromObject)) {
                com.sankuai.waimai.bussiness.order.confirm.request.a a2 = com.sankuai.waimai.bussiness.order.confirm.request.a.a(activity, requestParams, str3);
                a2.c = c0904b;
                a2.e = aVar;
                a2.a(commonParamFromObject);
                return;
            }
            com.sankuai.waimai.bussiness.order.confirm.request.b a3 = com.sankuai.waimai.bussiness.order.confirm.request.b.a(0, requestParams, str3);
            a3.e = c0904b;
            a3.f = aVar;
            a3.a();
        }
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    @Deprecated
    public void postOrderDirectly(Activity activity, long j, List<WmOrderedFood> list, String str, int i, int i2) {
        Object[] objArr = {activity, new Long(j), list, str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d74faa1cbe6d727376893eea4f7117f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d74faa1cbe6d727376893eea4f7117f6");
        } else {
            postOrderDirectly(activity, j, "", list, str, i, i2);
        }
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public void postOrderDirectly(Activity activity, long j, String str, List<WmOrderedFood> list, String str2, int i, int i2) {
        Object[] objArr = {activity, new Long(j), str, list, str2, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e9076de6d91a060daa9c829b7d8d5b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e9076de6d91a060daa9c829b7d8d5b3");
        } else if ((!aa.a(str) || j >= 0) && activity != null) {
            com.sankuai.waimai.mach.manager.load.c.a("waimai", "waimai-order");
            int b = com.sankuai.waimai.platform.capacity.persistent.sp.a.b((Context) activity, "wm_order_pay_type", 0);
            AddressItem addressItem = getAddressItem(activity);
            if (addressItem != null && addressItem.addressType == 1) {
                addressItem = null;
                com.sankuai.waimai.platform.domain.manager.location.a.b(activity);
            }
            com.sankuai.waimai.bussiness.order.confirm.request.preview.a aVar = new com.sankuai.waimai.bussiness.order.confirm.request.preview.a(activity);
            com.sankuai.waimai.bussiness.order.confirm.model.preview.param.a requestParams = getRequestParams(j, str, addressItem, b, i2, com.sankuai.waimai.bussiness.order.crossconfirm.utils.b.c(list));
            b.C0904b c0904b = new b.C0904b(j, str, 5, false, false, i, "", "", a.EnumC0947a.NONE, i2, 0.0d, null);
            com.sankuai.waimai.bussiness.order.confirm.request.b a = com.sankuai.waimai.bussiness.order.confirm.request.b.a(0, requestParams, str2);
            a.e = c0904b;
            a.f = aVar;
            a.a();
        }
    }

    private com.sankuai.waimai.bussiness.order.confirm.model.preview.param.a getRequestParams(long j, String str, AddressItem addressItem, int i, int i2, ArrayList<OrderFoodInput> arrayList) {
        Object[] objArr = {new Long(j), str, addressItem, Integer.valueOf(i), Integer.valueOf(i2), arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6359a9e6bdb80a660e50f272e00716d1", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.bussiness.order.confirm.model.preview.param.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6359a9e6bdb80a660e50f272e00716d1");
        }
        com.sankuai.waimai.bussiness.order.confirm.model.preview.param.a aVar = new com.sankuai.waimai.bussiness.order.confirm.model.preview.param.a();
        aVar.b = j;
        aVar.c = i.b(str);
        aVar.d = getUserId();
        aVar.e = "";
        aVar.f = arrayList;
        if (addressItem != null) {
            aVar.g = addressItem.id;
            aVar.h = addressItem.phone;
            aVar.i = addressItem.userName;
            aVar.j = addressItem.addrBrief;
            aVar.k = addressItem.addrBuildingNum;
            aVar.l = addressItem.gender;
            aVar.m = addressItem.lat;
            aVar.n = addressItem.lng;
            aVar.o = addressItem.category;
            aVar.R = addressItem.addressDistricts;
            aVar.p = addressItem.bindType;
            HashMap hashMap = new HashMap();
            if (addressItem.addressPoiId != 0) {
                hashMap.put("poi_id", Long.valueOf(addressItem.addressPoiId));
            }
            if (addressItem.hasOriginalAddress()) {
                hashMap.put("origin_address_info", com.sankuai.waimai.mach.utils.b.a(com.sankuai.waimai.mach.utils.b.a().toJson(addressItem.originAddressInfo)));
            }
            hashMap.put("need_recommend_aoi_address", Integer.valueOf(com.sankuai.waimai.bussiness.order.confirm.model.preview.param.a.a(addressItem.id)));
            if (!hashMap.isEmpty()) {
                aVar.q = hashMap;
            }
            aVar.U = com.sankuai.waimai.bussiness.order.confirm.model.preview.param.a.a(addressItem.lng, addressItem.lat);
        }
        aVar.F = i2;
        aVar.r = "";
        aVar.s = getInstance().getToken();
        aVar.t = "";
        aVar.u = i;
        aVar.z = 0;
        aVar.y = "";
        aVar.v = 0;
        aVar.A = "0";
        aVar.B = "0";
        aVar.E = "";
        aVar.G = 0;
        aVar.L = 1;
        aVar.S = b.a();
        aVar.V = 1;
        aVar.X = VersionInfo.getVersion();
        com.sankuai.waimai.addrsdk.base.a b = com.sankuai.waimai.addrsdk.manager.a.a().b();
        if (b != null) {
            String k = b.k();
            String l = b.l();
            if (!TextUtils.isEmpty(k) && !TextUtils.isEmpty(l)) {
                aVar.O = k + CommonConstant.Symbol.MINUS + l + "-1";
            }
        }
        return aVar;
    }

    private long getUserId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be3514471ac7a5a655f70e5668e63cad", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be3514471ac7a5a655f70e5668e63cad")).longValue() : com.sankuai.waimai.platform.domain.manager.user.a.i().d();
    }

    private AddressItem getAddressItemCacheDefault() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "897f8c8fc6203a6b0af3075e82abcb9a", RobustBitConfig.DEFAULT_VALUE)) {
            return (AddressItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "897f8c8fc6203a6b0af3075e82abcb9a");
        }
        AddressItem b = com.sankuai.waimai.platform.domain.manager.location.a.b();
        if (b == null || b.addressType != 1) {
            return b;
        }
        com.sankuai.waimai.platform.domain.manager.location.a.c();
        return null;
    }

    public void setRecPoi(TodayRecommendPoi todayRecommendPoi) {
        this.mRecPoi = todayRecommendPoi;
    }

    private void initMemberVariablesBySubmitOrderParams(@NonNull com.sankuai.waimai.business.order.api.submit.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31364f2037a2171c6027c88ed7b5488d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31364f2037a2171c6027c88ed7b5488d");
            return;
        }
        this.mServerExpController = dVar.c;
        this.mPoiId = dVar.d;
        this.mPoiIdStr = dVar.e;
        this.mIsSelfDelivery = dVar.f;
        this.mTxtSubmitSoft = new WeakReference(dVar.g);
        this.mTag = dVar.h;
        this.mRequestCode = dVar.k;
        this.mLoginFrom = a.EnumC0947a.FROM_PRODUCT_LIST_PREORDER;
        this.mBussinessType = dVar.m;
        this.mBusinessScene = dVar.p;
        this.mIsFromMTOtherChannel = dVar.n;
        this.mSourceType = dVar.o;
        this.allowanceAllianceScenes = dVar.q;
        this.adActivityFlag = dVar.r;
    }

    private void preOrderBase(com.sankuai.waimai.business.order.api.submit.d dVar) {
        List<WmOrderedFood> requestList;
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "caece8d84958570fd0fa04cb4daae706", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "caece8d84958570fd0fa04cb4daae706");
        } else if (dVar == null) {
        } else {
            Activity activity = dVar.b;
            String str = dVar.e;
            boolean a = aa.a(str);
            long j = dVar.d;
            if ((!a || j >= 0) && activity != null) {
                com.sankuai.waimai.mach.manager.load.c.a("waimai", "waimai-order");
                int b = com.sankuai.waimai.platform.capacity.persistent.sp.a.b((Context) activity, "wm_order_pay_type", 0);
                AddressItem addressItem = getAddressItem(activity);
                if (addressItem != null && addressItem.addressType == 1) {
                    addressItem = null;
                    com.sankuai.waimai.platform.domain.manager.location.a.b(activity);
                }
                if (addressItem == null) {
                    addressItem = getAddressItemCacheDefault();
                }
                AddressItem addressItem2 = addressItem;
                int businessType = getBusinessType(dVar);
                if (dVar.f) {
                    com.sankuai.waimai.platform.capacity.persistent.sp.a.a((Context) activity, "is_self_delivery", businessType);
                } else {
                    com.sankuai.waimai.platform.capacity.persistent.sp.a.a((Context) activity, "is_self_delivery", 0);
                }
                if (com.sankuai.waimai.foundation.utils.b.b(dVar.x)) {
                    requestList = GlobalCartManager.getInstance().getRequestList(this.mPoiIdStr, this.mSourceType);
                } else {
                    requestList = dVar.x;
                }
                com.sankuai.waimai.bussiness.order.confirm.request.preview.a a2 = new com.sankuai.waimai.bussiness.order.confirm.request.preview.a(activity).a(dVar.g);
                a2.e = dVar.c;
                com.sankuai.waimai.bussiness.order.confirm.model.preview.param.a requestParams = getRequestParams(j, str, addressItem2, b, businessType, com.sankuai.waimai.bussiness.order.crossconfirm.utils.b.c(requestList));
                requestParams.C = dVar.s;
                b.C0904b c0904b = new b.C0904b(j, str, 0, false, dVar.n, dVar.k, dVar.j, dVar.i, dVar.l, businessType, -1.0d, null);
                c0904b.o = dVar.q;
                c0904b.p = dVar.r;
                c0904b.d = dVar.p;
                requestParams.M = dVar.t;
                if (!TextUtils.isEmpty(dVar.w)) {
                    requestParams.A = dVar.w;
                }
                requestParams.H = dVar.q;
                requestParams.P = dVar.u;
                requestParams.I = dVar.r;
                requestParams.J = getPrescriptionInfo(dVar.v);
                requestParams.N = getCommonParamFromObject(dVar.v, "preview_order_callback_info");
                requestParams.Y = getExtParamFromObject(dVar.v);
                com.sankuai.waimai.bussiness.order.confirm.model.preview.param.a cyclePurchaseParam = setCyclePurchaseParam(dVar, requestParams);
                String commonParamFromObject = getCommonParamFromObject(dVar.v, "act_page_code");
                if (!aa.a(commonParamFromObject)) {
                    cyclePurchaseParam.W = commonParamFromObject;
                    c0904b.q = commonParamFromObject;
                }
                List<f> selectedCoupons = getSelectedCoupons(dVar.v);
                if (!com.sankuai.waimai.foundation.utils.b.b(selectedCoupons)) {
                    cyclePurchaseParam.Z = selectedCoupons;
                }
                String commonParamFromObject2 = getCommonParamFromObject(dVar.v, "drug_extra");
                if (isNeedRequestRXInquiry(commonParamFromObject2)) {
                    com.sankuai.waimai.bussiness.order.confirm.request.a a3 = com.sankuai.waimai.bussiness.order.confirm.request.a.a(activity, cyclePurchaseParam, dVar.h);
                    a3.c = c0904b;
                    a3.e = a2;
                    a3.a(dVar.g).a(commonParamFromObject2);
                    return;
                }
                com.sankuai.waimai.bussiness.order.confirm.request.b a4 = com.sankuai.waimai.bussiness.order.confirm.request.b.a(0, cyclePurchaseParam, dVar.h);
                a4.e = c0904b;
                a4.f = a2;
                a4.a();
            }
        }
    }

    public com.sankuai.waimai.bussiness.order.confirm.model.preview.param.a setCyclePurchaseParam(com.sankuai.waimai.business.order.api.submit.d dVar, com.sankuai.waimai.bussiness.order.confirm.model.preview.param.a aVar) {
        String str;
        Object[] objArr = {dVar, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7aa4fcb5d586975bf043c084fd1885f4", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.bussiness.order.confirm.model.preview.param.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7aa4fcb5d586975bf043c084fd1885f4");
        }
        CyclePurchaseCalculateInfo cyclePurchaseInfo = getCyclePurchaseInfo(dVar.v);
        if (cyclePurchaseInfo != null && cyclePurchaseInfo.mCyclePurchaseInfo != null && cyclePurchaseInfo.mCyclePurchaseInfo.mCyclePurchaseOrder == 1) {
            CyclePurchaseCalculateInfo.FoodList foodList = (CyclePurchaseCalculateInfo.FoodList) com.sankuai.waimai.foundation.utils.b.a(cyclePurchaseInfo.mFoodLists, 0);
            if (foodList != null) {
                ArrayList<OrderFoodInput> arrayList = new ArrayList<>();
                arrayList.add(new OrderFoodInput(foodList));
                aVar.f = arrayList;
            }
            try {
                str = new JSONObject(aa.a(cyclePurchaseInfo.mExtra) ? "" : cyclePurchaseInfo.mExtra).optString("preview_order_call_back_info", "");
            } catch (JSONException e) {
                com.sankuai.waimai.foundation.core.exception.a.b(e);
                str = "";
            }
            if (aa.a(str)) {
                str = "";
            }
            aVar.N = str;
            aVar.Q = cyclePurchaseInfo.mCyclePurchaseInfo;
        }
        return aVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int getBusinessType(com.sankuai.waimai.business.order.api.submit.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e043962e449ba5ce839fa08561dc068", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e043962e449ba5ce839fa08561dc068")).intValue();
        }
        switch (dVar.m) {
            case 0:
            case 1:
                if (dVar.f) {
                    return 1;
                }
                break;
            case 2:
                return 2;
            case 3:
                return 3;
        }
        return 0;
    }
}
