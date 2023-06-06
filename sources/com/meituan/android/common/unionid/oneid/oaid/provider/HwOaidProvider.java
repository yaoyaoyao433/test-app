package com.meituan.android.common.unionid.oneid.oaid.provider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.ads.identifier.AdvertisingIdClient;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HwOaidProvider extends AbstractProvider {
    private static final String TAG = "HwOaidProvider";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile HwOaidProvider singleton;

    public static HwOaidProvider getSingleton() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "61f79cd6b3030cb39bb70bbdd99e8937", RobustBitConfig.DEFAULT_VALUE)) {
            return (HwOaidProvider) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "61f79cd6b3030cb39bb70bbdd99e8937");
        }
        if (singleton == null) {
            synchronized (HwOaidProvider.class) {
                if (singleton == null) {
                    singleton = new HwOaidProvider();
                }
            }
        }
        return singleton;
    }

    @Override // com.meituan.android.common.unionid.oneid.oaid.provider.AbstractProvider
    public boolean isOaidSupported(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15c7be3ad3d135f023b11b79b3f6baa7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15c7be3ad3d135f023b11b79b3f6baa7")).booleanValue();
        }
        try {
            return AdvertisingIdClient.isAdvertisingIdAvailable(context);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.meituan.android.common.unionid.oneid.oaid.provider.AbstractProvider
    public BaseResponse getOaid(Context context) {
        BaseResponse baseResponse;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "909a9058c55754bec60fac7271700f0e", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "909a9058c55754bec60fac7271700f0e");
        }
        if (context == null) {
            Log.e(TAG, AbstractProvider.fail_cause_invalid_param);
            return null;
        }
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            if (advertisingIdInfo != null) {
                if (!TextUtils.isEmpty(advertisingIdInfo.getId())) {
                    baseResponse = new BaseResponse(true, advertisingIdInfo.getId(), advertisingIdInfo.isLimitAdTrackingEnabled(), "");
                } else {
                    baseResponse = new BaseResponse(true, "", advertisingIdInfo.isLimitAdTrackingEnabled(), AbstractProvider.fail_cause_api_null);
                }
            } else {
                baseResponse = new BaseResponse(false, "", false, AbstractProvider.fail_cause_api_null);
            }
            return baseResponse;
        } catch (Throwable unused) {
            return new BaseResponse(false, "", false, AbstractProvider.fail_cause_api_exception);
        }
    }
}
