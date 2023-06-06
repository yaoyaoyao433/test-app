package com.meituan.android.common.unionid.oneid.oaid.provider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.miui.deviceid.a;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MiOaidProvider extends AbstractProvider {
    private static final String TAG = "MiOaidProvider";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile MiOaidProvider singleton;

    public static MiOaidProvider getSingleton() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "11e6655c86c1cee7abe8af8a81d43acd", RobustBitConfig.DEFAULT_VALUE)) {
            return (MiOaidProvider) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "11e6655c86c1cee7abe8af8a81d43acd");
        }
        if (singleton == null) {
            synchronized (MiOaidProvider.class) {
                if (singleton == null) {
                    singleton = new MiOaidProvider();
                }
            }
        }
        return singleton;
    }

    @Override // com.meituan.android.common.unionid.oneid.oaid.provider.AbstractProvider
    public boolean isOaidSupported(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a5b4039425309739f1e1e14b38883aa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a5b4039425309739f1e1e14b38883aa")).booleanValue();
        }
        try {
            return a.a();
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.meituan.android.common.unionid.oneid.oaid.provider.AbstractProvider
    public BaseResponse getOaid(Context context) {
        BaseResponse baseResponse;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7e0303401fbdfab414937740c85eb89", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7e0303401fbdfab414937740c85eb89");
        }
        if (context == null) {
            Log.e(TAG, AbstractProvider.fail_cause_invalid_param);
            return null;
        }
        try {
            String a = a.a(context);
            if (!TextUtils.isEmpty(a)) {
                baseResponse = new BaseResponse(true, a, false, "");
            } else {
                baseResponse = new BaseResponse(true, "", false, AbstractProvider.fail_cause_api_null);
            }
            return baseResponse;
        } catch (Throwable unused) {
            Log.e(TAG, AbstractProvider.fail_cause_api_exception);
            return new BaseResponse(false, "", false, AbstractProvider.fail_cause_api_exception);
        }
    }
}
