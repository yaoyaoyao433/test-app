package com.sankuai.waimai.platform.domain.manager.poi.collect;

import android.app.Activity;
import android.support.annotation.StringRes;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.collect.ICollectPoiManagerService;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class CollectPoiManager implements ICollectPoiManagerService {
    private static final int RESP_CODE_COUPON_COLLECT_FAIL = 2;
    public static ChangeQuickRedirect changeQuickRedirect;
    private a mAddCollectCouponCallback;
    private com.sankuai.waimai.foundation.core.service.collect.a mCollectPoiListener;

    public CollectPoiManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc73818e98456121e63cf5c0e11a15c5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc73818e98456121e63cf5c0e11a15c5");
            return;
        }
        this.mCollectPoiListener = null;
        this.mAddCollectCouponCallback = null;
    }

    @Override // com.sankuai.waimai.foundation.core.service.collect.ICollectPoiManagerService
    public void setCollectPoiListener(com.sankuai.waimai.foundation.core.service.collect.a aVar) {
        this.mCollectPoiListener = aVar;
    }

    public void setAddCollectCouponCallback(a aVar) {
        this.mAddCollectCouponCallback = aVar;
    }

    @Override // com.sankuai.waimai.foundation.core.service.collect.ICollectPoiManagerService
    public void collectPoi(final Activity activity, final String str, String str2) {
        Object[] objArr = {activity, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9cc677bc0f11a25caa380bcbcb0e5873", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9cc677bc0f11a25caa380bcbcb0e5873");
        } else {
            b.a(((CollectApi) b.a((Class<Object>) CollectApi.class)).addFavorites(String.valueOf(com.sankuai.waimai.platform.domain.core.poi.b.a(str)), str), new b.AbstractC1042b<BaseResponse<AddCollectResponse>>() { // from class: com.sankuai.waimai.platform.domain.manager.poi.collect.CollectPoiManager.1
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    BaseResponse baseResponse = (BaseResponse) obj;
                    Object[] objArr2 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "34b2b93e1fc80741b3c7a08d4d5d92a6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "34b2b93e1fc80741b3c7a08d4d5d92a6");
                    } else if (baseResponse == null) {
                        CollectPoiManager.this.showToast(activity, (int) R.string.wm_collect_failed);
                    } else if (baseResponse.code == 0) {
                        if (CollectPoiManager.this.mCollectPoiListener != null) {
                            CollectPoiManager.this.mCollectPoiListener.a(str);
                        }
                        if (CollectPoiManager.this.mAddCollectCouponCallback == null || baseResponse.data == 0) {
                            return;
                        }
                        a unused = CollectPoiManager.this.mAddCollectCouponCallback;
                    } else if (baseResponse.code == 2) {
                        if (CollectPoiManager.this.mCollectPoiListener != null) {
                            CollectPoiManager.this.mCollectPoiListener.a(str);
                        }
                        if (CollectPoiManager.this.mAddCollectCouponCallback != null) {
                            a unused2 = CollectPoiManager.this.mAddCollectCouponCallback;
                        }
                    } else if (TextUtils.isEmpty(baseResponse.msg)) {
                    } else {
                        CollectPoiManager.this.showToast(activity, baseResponse.msg);
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7abdad283462b7553f68932b848ba2fb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7abdad283462b7553f68932b848ba2fb");
                        return;
                    }
                    CollectPoiManager.this.showToast(activity, (int) R.string.wm_collect_failed);
                    if (CollectPoiManager.this.mCollectPoiListener != null) {
                        CollectPoiManager.this.mCollectPoiListener.b(str);
                    }
                }
            }, str2);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.collect.ICollectPoiManagerService
    public void cancelCollectPoi(final Activity activity, final String str, String str2) {
        Object[] objArr = {activity, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fcc0683bd41a01fb19dd1d001943c87a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fcc0683bd41a01fb19dd1d001943c87a");
        } else {
            b.a(((CollectApi) b.a((Class<Object>) CollectApi.class)).cancelFavorites(String.valueOf(com.sankuai.waimai.platform.domain.core.poi.b.a(str)), str), new b.AbstractC1042b<BaseResponse>() { // from class: com.sankuai.waimai.platform.domain.manager.poi.collect.CollectPoiManager.2
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    BaseResponse baseResponse = (BaseResponse) obj;
                    Object[] objArr2 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4a195550813d3f6190346f7d1bfda05c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4a195550813d3f6190346f7d1bfda05c");
                    } else if (baseResponse == null) {
                        CollectPoiManager.this.showToast(activity, (int) R.string.wm_cancel_collect_failed);
                    } else if (baseResponse.code != 0) {
                        CollectPoiManager.this.showToast(activity, baseResponse.msg);
                    } else if (CollectPoiManager.this.mCollectPoiListener != null) {
                        CollectPoiManager.this.mCollectPoiListener.c(str);
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1a3279fc66930dbb5ae79a330faeff5a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1a3279fc66930dbb5ae79a330faeff5a");
                        return;
                    }
                    CollectPoiManager.this.showToast(activity, (int) R.string.wm_cancel_collect_failed);
                    if (CollectPoiManager.this.mCollectPoiListener != null) {
                        com.sankuai.waimai.foundation.core.service.collect.a unused = CollectPoiManager.this.mCollectPoiListener;
                    }
                }
            }, str2);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.collect.ICollectPoiManagerService
    public void checkCollectPoi(final Activity activity, final String str, String str2) {
        Object[] objArr = {activity, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eda9008c45a79bc8fa2bdf1d64f98f07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eda9008c45a79bc8fa2bdf1d64f98f07");
        } else {
            b.a(((CollectApi) b.a((Class<Object>) CollectApi.class)).checkFavorites(String.valueOf(com.sankuai.waimai.platform.domain.core.poi.b.a(str)), str), new b.AbstractC1042b<BaseResponse<CheckPoiCollectResponse>>() { // from class: com.sankuai.waimai.platform.domain.manager.poi.collect.CollectPoiManager.3
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    BaseResponse baseResponse = (BaseResponse) obj;
                    Object[] objArr2 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bb7969b93ca11d6cbdcd8ac4dd9442e0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bb7969b93ca11d6cbdcd8ac4dd9442e0");
                    } else if (baseResponse != null) {
                        if (baseResponse.code != 0) {
                            CollectPoiManager.this.showToast(activity, baseResponse.msg);
                        } else if (baseResponse.data == 0 || CollectPoiManager.this.mCollectPoiListener == null) {
                        } else {
                            CollectPoiManager.this.mCollectPoiListener.a(str, ((CheckPoiCollectResponse) baseResponse.data).collect == 1);
                        }
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f9696ef561c2a003cb97b104befb3220", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f9696ef561c2a003cb97b104befb3220");
                    } else if (CollectPoiManager.this.mCollectPoiListener != null) {
                        CollectPoiManager.this.mCollectPoiListener.d(str);
                    }
                }
            }, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showToast(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "873c761820cba1c8ec17aef05ade5766", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "873c761820cba1c8ec17aef05ade5766");
        } else {
            ae.a(activity, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showToast(Activity activity, @StringRes int i) {
        Object[] objArr = {activity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d0e0efd903dcd4ad2ac0d8b3cb9e3e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d0e0efd903dcd4ad2ac0d8b3cb9e3e4");
        } else {
            ae.a(activity, activity.getResources().getString(i));
        }
    }
}
