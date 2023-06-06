package com.meituan.android.privacy.interfaces.def;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.telephony.CellInfo;
import android.telephony.CellLocation;
import android.telephony.NeighboringCellInfo;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
import android.telephony.emergency.EmergencyNumber;
import com.meituan.android.common.unionid.oneid.util.AppUtil;
import com.meituan.android.privacy.interfaces.MtTelephonyManager;
import com.meituan.android.privacy.interfaces.ad;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class u extends c implements MtTelephonyManager {
    public static ChangeQuickRedirect c;
    private TelephonyManager d;

    public u(Context context, String str) {
        super(context, str);
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18ffcac9943e1a57cc93375c3ed43df7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18ffcac9943e1a57cc93375c3ed43df7");
        } else if (this.a != null) {
            try {
                this.d = (TelephonyManager) this.a.getSystemService("phone");
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    @SuppressLint({"MissingPermission"})
    public final String getDeviceSoftwareVersion() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0cd35d35caaf8916263fea2a446cb45", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0cd35d35caaf8916263fea2a446cb45");
        }
        com.meituan.android.privacy.interfaces.a.a();
        return null;
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    @SuppressLint({"MissingPermission", "HardwareIds"})
    public final String getDeviceId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "914b7a95e0572c2935b3dc9e340e35b4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "914b7a95e0572c2935b3dc9e340e35b4");
        }
        if (this.d == null) {
            return null;
        }
        return com.meituan.android.privacy.aop.d.a(this.d);
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    @RequiresApi(api = 23)
    @SuppressLint({"MissingPermission", "HardwareIds"})
    public final String getDeviceId(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe8136fcae5e7675d6fdcb716f32f208", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe8136fcae5e7675d6fdcb716f32f208");
        }
        if (this.d == null) {
            return null;
        }
        return com.meituan.android.privacy.aop.d.a(this.d, i);
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    @SuppressLint({"MissingPermission"})
    public final String getImei() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72395e3204d5e2c156b8e5ddad9decc2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72395e3204d5e2c156b8e5ddad9decc2");
        }
        if (Build.VERSION.SDK_INT < 26 || this.d == null) {
            return null;
        }
        return com.meituan.android.privacy.aop.d.b(this.d);
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    @RequiresApi(api = 26)
    @SuppressLint({"MissingPermission"})
    public final String getImei(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8704ee1df4d134784587254609a528d4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8704ee1df4d134784587254609a528d4");
        }
        if (this.d == null) {
            return null;
        }
        return this.d.getImei(i);
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    @SuppressLint({"MissingPermission"})
    public final String getMeid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bd3ca0e677cfedb1bbdf4598b925301", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bd3ca0e677cfedb1bbdf4598b925301");
        }
        if (Build.VERSION.SDK_INT < 26 || this.d == null) {
            return null;
        }
        return com.meituan.android.privacy.aop.d.c(this.d);
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    @RequiresApi(api = 26)
    @SuppressLint({"MissingPermission"})
    public final String getMeid(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a3c5c9ca6cb4a81418c519288fed084", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a3c5c9ca6cb4a81418c519288fed084");
        }
        if (this.d == null) {
            return null;
        }
        return this.d.getMeid(i);
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    @SuppressLint({"MissingPermission", "HardwareIds"})
    public final String getSimSerialNumber() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b222f2e442f6250dd5373e868d0e6fae", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b222f2e442f6250dd5373e868d0e6fae");
        }
        if (this.d == null) {
            return null;
        }
        return com.meituan.android.privacy.aop.d.d(this.d);
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    @SuppressLint({"MissingPermission", "HardwareIds"})
    public final String getSubscriberId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09c96ee0f21c652ccb053c9734f7dd95", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09c96ee0f21c652ccb053c9734f7dd95");
        }
        if (this.d == null) {
            return null;
        }
        return com.meituan.android.privacy.aop.d.e(this.d);
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    @RequiresApi(api = 28)
    @SuppressLint({"MissingPermission"})
    public final String getNai() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21a2afc1ab12c6ff1f9dae144e9aeea8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21a2afc1ab12c6ff1f9dae144e9aeea8");
        }
        com.meituan.android.privacy.interfaces.a.a();
        return null;
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    @RequiresApi(api = 26)
    @SuppressLint({"MissingPermission"})
    public final PersistableBundle getCarrierConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4b0417c74e4189f57b05b76e0be028d", RobustBitConfig.DEFAULT_VALUE)) {
            return (PersistableBundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4b0417c74e4189f57b05b76e0be028d");
        }
        com.meituan.android.privacy.interfaces.a.a();
        return null;
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    @SuppressLint({"MissingPermission"})
    public final int getNetworkType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "facdf67d4707d51c788101f322c89d2b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "facdf67d4707d51c788101f322c89d2b")).intValue();
        }
        if (this.d == null) {
            return 0;
        }
        return this.d.getNetworkType();
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    @RequiresApi(api = 24)
    @SuppressLint({"MissingPermission"})
    public final int getDataNetworkType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c596978336353194f77d90249e630609", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c596978336353194f77d90249e630609")).intValue();
        }
        if (this.d == null) {
            return 0;
        }
        return this.d.getDataNetworkType();
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    @RequiresApi(api = 24)
    @SuppressLint({"MissingPermission"})
    public final int getVoiceNetworkType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db2f9890b126cd692677a2f2222de2c2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db2f9890b126cd692677a2f2222de2c2")).intValue();
        }
        com.meituan.android.privacy.interfaces.a.a();
        return 0;
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    @RequiresApi(api = 18)
    @SuppressLint({"MissingPermission"})
    public final String getGroupIdLevel1() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e6cf07c5cd573a6fb1183e850afa8eb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e6cf07c5cd573a6fb1183e850afa8eb");
        }
        com.meituan.android.privacy.interfaces.a.a();
        return null;
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    @SuppressLint({"MissingPermission", "HardwareIds"})
    public final String getLine1Number() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c982d94bb506028fe607eee4f9564121", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c982d94bb506028fe607eee4f9564121");
        }
        if (this.d == null) {
            return null;
        }
        return com.meituan.android.privacy.aop.d.g(this.d);
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    @SuppressLint({"MissingPermission"})
    public final String getVoiceMailNumber() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5e2159e6a7dddaf3bac34282c5be8fb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5e2159e6a7dddaf3bac34282c5be8fb");
        }
        if (this.d == null) {
            return null;
        }
        Object[] objArr2 = {this.d};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.takeoutnew.util.aop.l.a;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4bd6ed5d41ef0e3d08ab33dd7c7d8730", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4bd6ed5d41ef0e3d08ab33dd7c7d8730") : AppUtil.getVoiceMailNumber(com.meituan.android.singleton.b.a);
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    @RequiresApi(api = 26)
    @SuppressLint({"MissingPermission"})
    @Nullable
    public final String getVisualVoicemailPackageName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8ab744a5a33a3dbe746cbeaed487615", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8ab744a5a33a3dbe746cbeaed487615");
        }
        com.meituan.android.privacy.interfaces.a.a();
        return null;
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    @SuppressLint({"MissingPermission"})
    public final String getVoiceMailAlphaTag() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a65d8581c24ffa7159ac0df5efe7e71", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a65d8581c24ffa7159ac0df5efe7e71");
        }
        com.meituan.android.privacy.interfaces.a.a();
        return null;
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    @RequiresApi(api = 26)
    @SuppressLint({"MissingPermission"})
    public final String[] getForbiddenPlmns() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fba869e4776eb2d0c8df721f9490b99", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fba869e4776eb2d0c8df721f9490b99");
        }
        com.meituan.android.privacy.interfaces.a.a();
        return null;
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    @RequiresApi(api = 29)
    @SuppressLint({"MissingPermission"})
    public final boolean isDataRoamingEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a6f1cc48b8286cec6de028ccc19d74d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a6f1cc48b8286cec6de028ccc19d74d")).booleanValue();
        }
        com.meituan.android.privacy.interfaces.a.a();
        return false;
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    @RequiresApi(api = 26)
    @SuppressLint({"MissingPermission"})
    public final ServiceState getServiceState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "236a988350cd5f57aa90a178af1330cf", RobustBitConfig.DEFAULT_VALUE)) {
            return (ServiceState) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "236a988350cd5f57aa90a178af1330cf");
        }
        if (this.d == null) {
            return null;
        }
        return com.meituan.android.privacy.aop.d.h(this.d);
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    @NonNull
    @RequiresApi(api = 29)
    @SuppressLint({"MissingPermission"})
    public final Map<Integer, List<EmergencyNumber>> getEmergencyNumberList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "042946df5a348da43f907de055813185", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "042946df5a348da43f907de055813185");
        }
        com.meituan.android.privacy.interfaces.a.a();
        return new HashMap();
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    @NonNull
    @RequiresApi(api = 29)
    @SuppressLint({"MissingPermission"})
    public final Map<Integer, List<EmergencyNumber>> getEmergencyNumberList(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8310c4faf983f22e7cba812c2c9873bc", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8310c4faf983f22e7cba812c2c9873bc");
        }
        com.meituan.android.privacy.interfaces.a.a();
        return new HashMap();
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    @RequiresApi(api = 29)
    @SuppressLint({"MissingPermission"})
    public final int getPreferredOpportunisticDataSubscription() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e99fe5bef8327cd53b3cdc396c8c54fd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e99fe5bef8327cd53b3cdc396c8c54fd")).intValue();
        }
        com.meituan.android.privacy.interfaces.a.a();
        return -1;
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    @RequiresApi(api = 29)
    @SuppressLint({"MissingPermission"})
    public final int isMultiSimSupported() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c728808fa35ff8e0bdf3ec5ed0e4b12", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c728808fa35ff8e0bdf3ec5ed0e4b12")).intValue();
        }
        com.meituan.android.privacy.interfaces.a.a();
        return 1;
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    @RequiresApi(api = 29)
    @SuppressLint({"MissingPermission"})
    public final boolean doesSwitchMultiSimConfigTriggerReboot() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7d5e046419725df91fca6d7b2dba01b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7d5e046419725df91fca6d7b2dba01b")).booleanValue();
        }
        com.meituan.android.privacy.interfaces.a.a();
        return false;
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    @SuppressLint({"MissingPermission"})
    public final void listen(PhoneStateListener phoneStateListener, int i) {
        Object[] objArr = {phoneStateListener, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b2f9327aa0b87540405646abf005a88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b2f9327aa0b87540405646abf005a88");
        } else if (this.d != null) {
            this.d.listen(phoneStateListener, i);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final void listenLocationEvents(PhoneStateListener phoneStateListener, int i) {
        Object[] objArr = {phoneStateListener, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00dd8d9e6d3a4881d37726a9b423c971", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00dd8d9e6d3a4881d37726a9b423c971");
        } else if (this.d != null) {
            this.d.listen(phoneStateListener, i);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    @RequiresApi(api = 17)
    @SuppressLint({"MissingPermission"})
    public final List<CellInfo> getAllCellInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f976433ba3775f9d376fa1941d5f558c", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f976433ba3775f9d376fa1941d5f558c") : this.d == null ? new ArrayList() : com.meituan.android.privacy.aop.d.i(this.d);
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    @SuppressLint({"MissingPermission"})
    public final CellLocation getCellLocation() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a77456bf60384bebec9cfb8cb54265cc", RobustBitConfig.DEFAULT_VALUE)) {
            return (CellLocation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a77456bf60384bebec9cfb8cb54265cc");
        }
        if (this.d == null) {
            return null;
        }
        return com.meituan.android.privacy.aop.d.j(this.d);
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    @RequiresApi(api = 29)
    @SuppressLint({"MissingPermission"})
    public final void requestCellInfoUpdate(@NonNull Executor executor, @NonNull TelephonyManager.CellInfoCallback cellInfoCallback) {
        Object[] objArr = {executor, cellInfoCallback};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2214c4c2d5259f1138db9fd5c13dae2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2214c4c2d5259f1138db9fd5c13dae2c");
        } else if (this.d != null) {
            com.meituan.android.privacy.aop.d.a(this.d, executor, cellInfoCallback);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final List<NeighboringCellInfo> getNeighboringCellInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c3bd6ed64f52052c63f666ffaac79a6", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c3bd6ed64f52052c63f666ffaac79a6");
        }
        if (this.d != null) {
            try {
                ad.a(this.d, "getNeighboringCellInfo", new Object[0]);
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final String getNetworkOperator() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "740914f95b668f305d890cdb2aac27b6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "740914f95b668f305d890cdb2aac27b6") : this.d == null ? "" : this.d.getNetworkOperator();
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final boolean isNetworkRoaming() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4918c277d13d2e88cea8cf8460224a51", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4918c277d13d2e88cea8cf8460224a51")).booleanValue() : this.d != null && this.d.isNetworkRoaming();
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final int getSimState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "469b24f1839b08ca30d4aad4603b6439", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "469b24f1839b08ca30d4aad4603b6439")).intValue();
        }
        if (this.d == null) {
            return 0;
        }
        return this.d.getSimState();
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final int getDataState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3f7cc83c3d9e5f4c81c60bf564b12ed", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3f7cc83c3d9e5f4c81c60bf564b12ed")).intValue();
        }
        if (this.d == null) {
            return 0;
        }
        return this.d.getDataState();
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final int getPhoneType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a371f2a1f9bfc380d13663e915425df2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a371f2a1f9bfc380d13663e915425df2")).intValue();
        }
        if (this.d == null) {
            return 0;
        }
        return this.d.getPhoneType();
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final int getDataActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a5141227501b03f9286fa9da05d3bf2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a5141227501b03f9286fa9da05d3bf2")).intValue();
        }
        if (this.d == null) {
            return 0;
        }
        return this.d.getDataActivity();
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final String getSimCountryIso() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfb8f022edb96fcaf89901eeb6fb090b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfb8f022edb96fcaf89901eeb6fb090b") : this.d == null ? "" : this.d.getSimCountryIso();
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final String getNetworkCountryIso() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e3d254785f9ad9c7d2739d514ae55ed", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e3d254785f9ad9c7d2739d514ae55ed") : this.d == null ? "" : this.d.getNetworkCountryIso();
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final int getCallState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "761128e053e6bbb4c15da398d0f014ba", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "761128e053e6bbb4c15da398d0f014ba")).intValue();
        }
        if (this.d == null) {
            return 0;
        }
        return this.d.getCallState();
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final String getSimOperator() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01df456c9ba8b81140458047661c8156", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01df456c9ba8b81140458047661c8156") : this.d == null ? "" : com.meituan.android.privacy.aop.d.f(this.d);
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final String getNetworkOperatorName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27ffc163ace7ecb8ef72101c9dfd6b92", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27ffc163ace7ecb8ef72101c9dfd6b92") : this.d == null ? "" : this.d.getNetworkOperatorName();
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    @RequiresApi(api = 26)
    @SuppressLint({"MissingPermission"})
    public final String getSerial() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31afad8b899a0864aa998c068dc9ccf3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31afad8b899a0864aa998c068dc9ccf3") : com.meituan.android.privacy.aop.d.a();
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final String getAndroidId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce934c15fb35c8759da95cd708ee6e09", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce934c15fb35c8759da95cd708ee6e09") : com.sankuai.meituan.takeoutnew.util.aop.l.a(this.a.getContentResolver(), "android_id");
    }
}
