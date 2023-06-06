package com.meituan.android.common.locate.api;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.telephony.CellInfo;
import android.telephony.CellLocation;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.android.common.locate.util.j;
import com.meituan.android.common.unionid.oneid.util.AppUtil;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.concurrent.Executor;
@Deprecated
/* loaded from: classes2.dex */
public class MtTelephonyManager extends MtBaseManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private TelephonyManager c;
    private com.meituan.android.privacy.interfaces.MtTelephonyManager d;

    @Deprecated
    /* loaded from: classes2.dex */
    public interface a {
    }

    public MtTelephonyManager(@NonNull Context context, @NonNull String str) {
        super(context, str);
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "757aeb422e5387951a9668a0b833dfe5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "757aeb422e5387951a9668a0b833dfe5");
        } else if (this.a == null) {
        } else {
            try {
                this.d = Privacy.createTelephonyManager(context, str);
            } catch (Exception e) {
                LogUtils.a("TAGinit exception: " + e.getMessage());
            }
            try {
                this.c = (TelephonyManager) this.a.getSystemService("phone");
            } catch (Exception e2) {
                LogUtils.a("TAGinit old exception: " + e2.getMessage());
            }
        }
    }

    public MtTelephonyManager(@Nullable TelephonyManager telephonyManager, @NonNull Context context, @NonNull String str) {
        super(context, str);
        Object[] objArr = {telephonyManager, context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a390569dfa223d299831261cff9e308d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a390569dfa223d299831261cff9e308d");
        } else if (this.a == null) {
        } else {
            this.d = Privacy.createTelephonyManager(context, str);
            this.c = telephonyManager;
        }
    }

    public TelephonyManager createForSubscriptionId(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13dd07650e753c1a99e4d864df7e9d6f", RobustBitConfig.DEFAULT_VALUE)) {
            return (TelephonyManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13dd07650e753c1a99e4d864df7e9d6f");
        }
        if (this.c != null && Build.VERSION.SDK_INT >= 24) {
            return this.c.createForSubscriptionId(i);
        }
        return null;
    }

    @SuppressLint({"MissingPermission"})
    @Nullable
    public List<CellInfo> getAllCellInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "500d2969042ca85b4de05ab792ab664f", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "500d2969042ca85b4de05ab792ab664f");
        }
        if (this.d != null && Build.VERSION.SDK_INT >= 17 && j.d(this.a)) {
            return this.d.getAllCellInfo();
        }
        return null;
    }

    public int getCallState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ef5d349b50ce0ec97c5ff4fcc58d76d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ef5d349b50ce0ec97c5ff4fcc58d76d")).intValue();
        }
        if (this.d != null) {
            return this.d.getCallState();
        }
        return 0;
    }

    @SuppressLint({"MissingPermission"})
    @Nullable
    public CellLocation getCellLocation() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "79062c5e6427b08f149ecf8cd4a8df51", RobustBitConfig.DEFAULT_VALUE)) {
            return (CellLocation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "79062c5e6427b08f149ecf8cd4a8df51");
        }
        if (this.d != null && j.d(this.a)) {
            return this.d.getCellLocation();
        }
        return null;
    }

    public int getDataActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84a0190ef7410e93538895265e7df707", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84a0190ef7410e93538895265e7df707")).intValue();
        }
        if (this.d != null) {
            return this.d.getDataActivity();
        }
        return 0;
    }

    public int getDataState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a7c90de9382aa7092a549b5e15a7345", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a7c90de9382aa7092a549b5e15a7345")).intValue();
        }
        if (this.d != null) {
            return this.d.getDataState();
        }
        return 0;
    }

    @SuppressLint({"MissingPermission"})
    public String getDeviceId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "08e9b53d36c3859689ca1a5aa57561c7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "08e9b53d36c3859689ca1a5aa57561c7") : this.a != null ? AppUtil.getDeviceId(this.a) : "";
    }

    @SuppressLint({"MissingPermission"})
    public String getDeviceId(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d245122f40cbd7bd03e78955ab8190b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d245122f40cbd7bd03e78955ab8190b") : (this.a == null || Build.VERSION.SDK_INT < 23) ? "" : AppUtil.getDeviceId(this.a, i);
    }

    @SuppressLint({"MissingPermission"})
    public String getImei() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b2c69b5325fd03729c032eed82e85c1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b2c69b5325fd03729c032eed82e85c1") : this.a != null ? AppUtil.getIMEI1(this.a) : "";
    }

    @SuppressLint({"MissingPermission"})
    public String getImei(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78757e8bff894f162acbf07e67f15090", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78757e8bff894f162acbf07e67f15090");
        }
        if (this.a == null) {
            return "";
        }
        String imei1 = AppUtil.getIMEI1(this.a);
        return TextUtils.isEmpty(imei1) ? AppUtil.getIMEI2(this.a) : imei1;
    }

    @SuppressLint({"MissingPermission"})
    public String getLine1Number() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a79c380ec5992d555bfd44e81d1d2741", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a79c380ec5992d555bfd44e81d1d2741") : this.a != null ? AppUtil.getLine1Number(this.a) : "";
    }

    @SuppressLint({"MissingPermission"})
    public String getMeid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e5e3fb32afd9f2113ac3c42387eb376", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e5e3fb32afd9f2113ac3c42387eb376") : this.a != null ? AppUtil.getMEID(this.a) : "";
    }

    public String getNetworkCountryIso() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4803bf1dc6fcb858ecf3fe702c9d247", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4803bf1dc6fcb858ecf3fe702c9d247") : this.d != null ? this.d.getNetworkCountryIso() : "";
    }

    public String getNetworkOperator() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb0ce2802799381c084459fc18c96499", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb0ce2802799381c084459fc18c96499") : this.d != null ? this.d.getNetworkOperator() : "";
    }

    public String getNetworkOperatorName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0267bbdb353bff7929519e681109e300", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0267bbdb353bff7929519e681109e300") : this.d != null ? this.d.getNetworkOperatorName() : "";
    }

    public int getNetworkType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad002bb4a6d2ab7fad1e3d9627e439a6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad002bb4a6d2ab7fad1e3d9627e439a6")).intValue();
        }
        if (this.d != null) {
            return this.d.getNetworkType();
        }
        return 0;
    }

    public int getPhoneCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c4d3c2051e1a5fabe883119c084dd5c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c4d3c2051e1a5fabe883119c084dd5c")).intValue();
        }
        if (this.c != null && Build.VERSION.SDK_INT >= 23) {
            return this.c.getPhoneCount();
        }
        return 0;
    }

    public int getPhoneType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bce4e17d71d0113f519dc71a3846973b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bce4e17d71d0113f519dc71a3846973b")).intValue();
        }
        if (this.d != null) {
            return this.d.getPhoneType();
        }
        return 0;
    }

    @SuppressLint({"MissingPermission"})
    public ServiceState getServiceState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7a7379a4881a621032865054854bbca", RobustBitConfig.DEFAULT_VALUE)) {
            return (ServiceState) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7a7379a4881a621032865054854bbca");
        }
        if (this.d != null && Build.VERSION.SDK_INT >= 26 && j.a(this.a) && j.a(this.a, this.b)) {
            return this.d.getServiceState();
        }
        return null;
    }

    public SignalStrength getSignalStrength() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9026e79ea924fe26c48322a8736fba2", RobustBitConfig.DEFAULT_VALUE)) {
            return (SignalStrength) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9026e79ea924fe26c48322a8736fba2");
        }
        if (this.c != null && Build.VERSION.SDK_INT >= 28) {
            return this.c.getSignalStrength();
        }
        return null;
    }

    public String getSimCountryIso() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0d6b587cc26b9951b95ba42332b7e33", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0d6b587cc26b9951b95ba42332b7e33") : this.d != null ? this.d.getSimCountryIso() : "";
    }

    public String getSimOperator() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de79c6acd58448d8f74f4d51ca13df93", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de79c6acd58448d8f74f4d51ca13df93") : this.d != null ? this.d.getSimOperator() : "";
    }

    public String getSimOperatorName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0fa959e2533f070bac70962311662e93", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0fa959e2533f070bac70962311662e93") : this.c == null ? "" : this.c.getSimOperatorName();
    }

    @SuppressLint({"MissingPermission"})
    public String getSimSerialNumber() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "096bc0c876af6075448b7ba9d93ac5bd", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "096bc0c876af6075448b7ba9d93ac5bd") : this.a != null ? AppUtil.getICCID(this.a) : "";
    }

    public int getSimState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cbd98cc67fcf7b9e0709ba0560697f20", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cbd98cc67fcf7b9e0709ba0560697f20")).intValue();
        }
        if (this.d != null) {
            return this.d.getSimState();
        }
        return 0;
    }

    @SuppressLint({"MissingPermission"})
    public String getSubscriberId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ba2bfbaf902a53bc063dff6611144cf", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ba2bfbaf902a53bc063dff6611144cf") : this.a != null ? AppUtil.getIMSI(this.a) : "";
    }

    @SuppressLint({"MissingPermission"})
    public String getVoiceMailNumber() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9545c935e5c92a1d5dacc3dcc69f4c82", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9545c935e5c92a1d5dacc3dcc69f4c82") : this.a != null ? AppUtil.getVoiceMailNumber(this.a) : "";
    }

    public boolean isNetworkRoaming() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "312bef8317639aade2b7be63dbda7f1e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "312bef8317639aade2b7be63dbda7f1e")).booleanValue();
        }
        if (this.d != null) {
            return this.d.isNetworkRoaming();
        }
        return false;
    }

    @Deprecated
    public void listen(PhoneStateListener phoneStateListener, int i) {
        Object[] objArr = {phoneStateListener, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "227d147e56523ae46e3a118317e9e148", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "227d147e56523ae46e3a118317e9e148");
        } else {
            a();
        }
    }

    @SuppressLint({"MissingPermission"})
    public void requestCellInfoUpdate(@NonNull Executor executor, @NonNull final TelephonyManager.CellInfoCallback cellInfoCallback) {
        Object[] objArr = {executor, cellInfoCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70a7bab03366faf3f6a5cb89b195cc78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70a7bab03366faf3f6a5cb89b195cc78");
        } else if (this.d == null) {
        } else {
            int i = Build.VERSION.SDK_INT;
            int i2 = this.a.getApplicationInfo().targetSdkVersion;
            if (i < 29 || i2 < 29 || !j.d(this.a)) {
                return;
            }
            this.d.requestCellInfoUpdate(executor, new TelephonyManager.CellInfoCallback() { // from class: com.meituan.android.common.locate.api.MtTelephonyManager.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.telephony.TelephonyManager.CellInfoCallback
                public void onCellInfo(@NonNull List<CellInfo> list) {
                    Object[] objArr2 = {list};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fc5b44a196f3e1cf09b44e3140b361ba", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fc5b44a196f3e1cf09b44e3140b361ba");
                    } else {
                        cellInfoCallback.onCellInfo(list);
                    }
                }
            });
        }
    }

    @Deprecated
    public void requestCellInfoUpdate(@NonNull Executor executor, @NonNull a aVar) {
        Object[] objArr = {executor, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0626bf35dba430dd514984a4ccd48d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0626bf35dba430dd514984a4ccd48d8");
        } else {
            a();
        }
    }
}
