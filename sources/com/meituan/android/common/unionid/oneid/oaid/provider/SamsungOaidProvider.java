package com.meituan.android.common.unionid.oneid.oaid.provider;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import android.text.TextUtils;
import com.meituan.android.common.unionid.oneid.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.samsung.android.deviceidservice.IDeviceIdService;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SamsungOaidProvider extends AbstractProvider {
    private static final String TAG = "SamsungOaidProvider";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static SamsungOaidProvider singleton;
    private ServiceConnection mConnection;
    private CountDownLatch mCountDownLatch;
    private IDeviceIdService mIDeviceIdService;
    private Intent mServiceIntent;

    public static SamsungOaidProvider getSingleton() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "71886f0e678e8f3dbd9e6e1f34bb7f34", RobustBitConfig.DEFAULT_VALUE)) {
            return (SamsungOaidProvider) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "71886f0e678e8f3dbd9e6e1f34bb7f34");
        }
        if (singleton == null) {
            synchronized (SamsungOaidProvider.class) {
                if (singleton == null) {
                    singleton = new SamsungOaidProvider();
                }
            }
        }
        return singleton;
    }

    public SamsungOaidProvider() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c7c05fbf56d33c6856705d311dea4c4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c7c05fbf56d33c6856705d311dea4c4");
            return;
        }
        this.mServiceIntent = new Intent();
        this.mConnection = new ServiceConnection() { // from class: com.meituan.android.common.unionid.oneid.oaid.provider.SamsungOaidProvider.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                Object[] objArr2 = {componentName, iBinder};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b265e75d359ce5763bbb375a4353eff2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b265e75d359ce5763bbb375a4353eff2");
                    return;
                }
                SamsungOaidProvider.this.mIDeviceIdService = IDeviceIdService.Stub.asInterface(iBinder);
                SamsungOaidProvider.this.mServiceIntent.setClassName("com.samsung.android.deviceidservice", "com.samsung.android.deviceidservice.DeviceIdService");
                SamsungOaidProvider.this.mCountDownLatch.countDown();
            }
        };
        this.mServiceIntent.setClassName("com.samsung.android.deviceidservice", "com.samsung.android.deviceidservice.DeviceIdService");
    }

    @Override // com.meituan.android.common.unionid.oneid.oaid.provider.AbstractProvider
    public boolean isOaidSupported(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4df068e98578b472ecdd5298859af2e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4df068e98578b472ecdd5298859af2e")).booleanValue();
        }
        try {
            List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(this.mServiceIntent, 0);
            if (queryIntentServices != null) {
                return !queryIntentServices.isEmpty();
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean bindService(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96e65d734b8342119441d6f35e950de2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96e65d734b8342119441d6f35e950de2")).booleanValue() : context.bindService(this.mServiceIntent, this.mConnection, 1);
    }

    public void unBindService(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e1880d6714fd0f4fa46ad24a239c1bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e1880d6714fd0f4fa46ad24a239c1bd");
        } else {
            context.unbindService(this.mConnection);
        }
    }

    @Override // com.meituan.android.common.unionid.oneid.oaid.provider.AbstractProvider
    public BaseResponse getOaid(Context context) {
        String str;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "487cd4d17dd6472f0c9c6a6b8e068c2a", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "487cd4d17dd6472f0c9c6a6b8e068c2a");
        }
        this.mCountDownLatch = new CountDownLatch(1);
        str = "";
        BaseResponse baseResponse = null;
        if (context == null) {
            LogUtils.i(TAG, AbstractProvider.fail_cause_invalid_param);
            return null;
        }
        if (bindService(context)) {
            try {
                try {
                    try {
                        if (!this.mCountDownLatch.await(500L, TimeUnit.MILLISECONDS)) {
                            LogUtils.i(TAG, "getOAID time-out");
                        }
                        str = this.mIDeviceIdService != null ? this.mIDeviceIdService.getOAID() : "";
                        if (!TextUtils.isEmpty(str)) {
                            baseResponse = new BaseResponse(true, str, false, "");
                        }
                        unBindService(context);
                    } catch (Exception e) {
                        e.printStackTrace();
                        baseResponse = new BaseResponse(false, "", false, AbstractProvider.fail_cause_api_exception);
                        unBindService(context);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                try {
                    unBindService(context);
                } catch (Throwable th3) {
                    th3.printStackTrace();
                }
                throw th2;
            }
        }
        return TextUtils.isEmpty(str) ? new BaseResponse(false, "", false, AbstractProvider.fail_cause_api_null) : baseResponse;
    }
}
