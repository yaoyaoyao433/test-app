package com.meituan.android.privacy.proxy;

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
import android.util.Log;
import com.meituan.android.common.unionid.oneid.util.AppUtil;
import com.meituan.android.privacy.interfaces.MtTelephonyManager;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.ad;
import com.meituan.android.privacy.proxy.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class w implements MtTelephonyManager {
    public static ChangeQuickRedirect a;
    private Context b;
    private TelephonyManager c;
    private u d;
    private String e;

    public w(@NonNull Context context, @NonNull String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b66852e1dcb96917870839aec3b32cc4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b66852e1dcb96917870839aec3b32cc4");
            return;
        }
        this.e = str;
        this.b = context;
        this.d = new u();
        try {
            this.c = (TelephonyManager) context.getApplicationContext().getSystemService("phone");
        } catch (Exception e) {
            Log.e("MtTelephonyManagerImpl", e.toString());
        }
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final String getDeviceId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd70dbd8acb60db09f2eb25d34d5b43a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd70dbd8acb60db09f2eb25d34d5b43a");
        }
        if (z.a(PermissionGuard.PERMISSION_PHONE_READ, this.e, "tel.gDId")) {
            return AppUtil.getDeviceId(this.b);
        }
        return null;
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    @RequiresApi(api = 23)
    public final String getDeviceId(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c0a639b0ee40397bc73ce8ddd5bdf5a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c0a639b0ee40397bc73ce8ddd5bdf5a");
        }
        if (z.a(PermissionGuard.PERMISSION_PHONE_READ, this.e, "tel.gDId_i")) {
            return AppUtil.getDeviceId(this.b, i);
        }
        return null;
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final String getImei() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3208cbc334acb6e29c45e5afd2530ce9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3208cbc334acb6e29c45e5afd2530ce9");
        }
        if (z.a(PermissionGuard.PERMISSION_PHONE_READ, this.e, "tel.gImei")) {
            return AppUtil.getIMEI1(this.b);
        }
        return null;
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    @RequiresApi(api = 26)
    public final String getImei(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2a3d38aaf9131314ac4e008f523bef7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2a3d38aaf9131314ac4e008f523bef7");
        }
        if (z.a(PermissionGuard.PERMISSION_PHONE_READ, this.e, "tel.gImei_i")) {
            return AppUtil.getImei(this.b, i);
        }
        return null;
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final String getMeid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "593e0a4da4ddf131d502a27aa5bbfa4d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "593e0a4da4ddf131d502a27aa5bbfa4d");
        }
        if (z.a(PermissionGuard.PERMISSION_PHONE_READ, this.e, "tel.gMeid")) {
            return AppUtil.getMEID(this.b);
        }
        return null;
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    @RequiresApi(api = 26)
    public final String getMeid(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33285b2a1737ee31ba26cb7ab38fec4b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33285b2a1737ee31ba26cb7ab38fec4b");
        }
        if (z.a(PermissionGuard.PERMISSION_PHONE_READ, this.e, "tel.gMeid_i")) {
            return AppUtil.getMeid(this.b, i);
        }
        return null;
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final String getSimSerialNumber() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce430baaf1783ae73ad96d833d0cd9a9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce430baaf1783ae73ad96d833d0cd9a9") : z.a(PermissionGuard.PERMISSION_PHONE_READ, this.e, "tel.gSSNumber") ? AppUtil.getICCID(this.b) : "";
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final String getSubscriberId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9674a8d554bacc0595e70c42d4b32d48", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9674a8d554bacc0595e70c42d4b32d48");
        }
        if (z.a(PermissionGuard.PERMISSION_PHONE_READ, this.e, "tel.gSId")) {
            return AppUtil.getIMSI(this.b);
        }
        return null;
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final int getNetworkType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "358e46f968f9efb1751e8aea6d7d6682", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "358e46f968f9efb1751e8aea6d7d6682")).intValue();
        }
        if (this.c == null) {
            return 0;
        }
        if (this.b.getApplicationContext().getApplicationInfo().targetSdkVersion > 28) {
            Integer num = (Integer) this.d.a("tel.gNType", this.e, new String[]{PermissionGuard.PERMISSION_PHONE_READ}, new u.a<Integer>() { // from class: com.meituan.android.privacy.proxy.w.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.privacy.proxy.u.a
                public final /* synthetic */ Integer a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "893096f4a471a0fbbe5e74f3f7b1fa61", RobustBitConfig.DEFAULT_VALUE) ? (Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "893096f4a471a0fbbe5e74f3f7b1fa61") : Integer.valueOf(w.this.c.getNetworkType());
                }
            });
            if (num == null) {
                return 0;
            }
            return num.intValue();
        }
        return this.c.getNetworkType();
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final String getLine1Number() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "796f494109b5d52b3c6e58fdeeb12e42", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "796f494109b5d52b3c6e58fdeeb12e42");
        }
        if (z.a(PermissionGuard.PERMISSION_PHONE_BAN, this.e, "tel.gL1Number")) {
            return AppUtil.getLine1Number(this.b);
        }
        return null;
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final String getVoiceMailNumber() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47b0572a2a0f408946fbe53f0afb2fd1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47b0572a2a0f408946fbe53f0afb2fd1");
        }
        if (z.a(PermissionGuard.PERMISSION_PHONE_BAN, this.e, "tel.gVMNumber")) {
            return AppUtil.getVoiceMailNumber(this.b);
        }
        return null;
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    @RequiresApi(api = 26)
    @SuppressLint({"MissingPermission"})
    public final ServiceState getServiceState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7cf2438658fbe42a6ac14671504ce4d", RobustBitConfig.DEFAULT_VALUE)) {
            return (ServiceState) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7cf2438658fbe42a6ac14671504ce4d");
        }
        if (this.c == null || Build.VERSION.SDK_INT < 26) {
            return null;
        }
        return (ServiceState) this.d.a("tel.gSState", this.e, new String[]{PermissionGuard.PERMISSION_PHONE_BAN, y.a(this.e, "Locate.once")}, new u.a<ServiceState>() { // from class: com.meituan.android.privacy.proxy.w.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.proxy.u.a
            public final /* synthetic */ ServiceState a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "55c155a46dba09ea2e3f310a0a557250", RobustBitConfig.DEFAULT_VALUE) ? (ServiceState) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "55c155a46dba09ea2e3f310a0a557250") : w.this.c.getServiceState();
            }
        });
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final void listen(PhoneStateListener phoneStateListener, int i) {
        Object[] objArr = {phoneStateListener, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "352493316d9fd685ff66fd1cf2b89999", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "352493316d9fd685ff66fd1cf2b89999");
        } else if (this.c == null) {
        } else {
            this.c.listen(phoneStateListener, i & (Build.VERSION.SDK_INT >= 29 ? -20971533 : -13) & (-274));
        }
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final void listenLocationEvents(final PhoneStateListener phoneStateListener, int i) {
        Object[] objArr = {phoneStateListener, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7157bd43120a7b8066aa2c1d02c720f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7157bd43120a7b8066aa2c1d02c720f");
        } else if (this.c == null) {
        } else {
            final int i2 = i & (Build.VERSION.SDK_INT >= 29 ? -20971533 : -13);
            this.d.a("tel.lLEvents", this.e, new String[]{y.a(this.e, "Locate.once")}, new u.a<Void>() { // from class: com.meituan.android.privacy.proxy.w.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.privacy.proxy.u.a
                public final /* synthetic */ Void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c77a257ac49db08ab42420d5a39dc29a", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Void) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c77a257ac49db08ab42420d5a39dc29a");
                    }
                    w.this.c.listen(phoneStateListener, i2);
                    return null;
                }
            }, false);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    @SuppressLint({"MissingPermission"})
    public final List<CellInfo> getAllCellInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbcc183e57d973c6049ab92081ee3ffb", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbcc183e57d973c6049ab92081ee3ffb");
        }
        if (this.c == null) {
            return null;
        }
        return (List) this.d.a("tel.gACInfo", this.e, new String[]{y.a(this.e, "Locate.once")}, new u.a<List<CellInfo>>() { // from class: com.meituan.android.privacy.proxy.w.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.proxy.u.a
            public final /* synthetic */ List<CellInfo> a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ffa0c1051ecb98a54479b9f58bd0762d", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ffa0c1051ecb98a54479b9f58bd0762d") : w.this.c.getAllCellInfo();
            }
        });
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    @SuppressLint({"MissingPermission"})
    public final CellLocation getCellLocation() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "275e5536c3fab6028c9d9cf655c969be", RobustBitConfig.DEFAULT_VALUE)) {
            return (CellLocation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "275e5536c3fab6028c9d9cf655c969be");
        }
        if (this.c == null) {
            return null;
        }
        return (CellLocation) this.d.a("tel.gCLocation", this.e, new String[]{y.a(this.e, "Locate.once")}, new u.a<CellLocation>() { // from class: com.meituan.android.privacy.proxy.w.5
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.proxy.u.a
            public final /* synthetic */ CellLocation a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "44b47458c71313156e2a9a6b7e260356", RobustBitConfig.DEFAULT_VALUE) ? (CellLocation) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "44b47458c71313156e2a9a6b7e260356") : w.this.c.getCellLocation();
            }
        });
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    @RequiresApi(api = 29)
    @SuppressLint({"MissingPermission"})
    public final void requestCellInfoUpdate(@NonNull final Executor executor, @NonNull final TelephonyManager.CellInfoCallback cellInfoCallback) {
        Object[] objArr = {executor, cellInfoCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "371561c3343af365ad57673362f2ce68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "371561c3343af365ad57673362f2ce68");
        } else if (this.c == null) {
        } else {
            this.d.a("tel.rCIUpdate", this.e, new String[]{y.a(this.e, "Locate.once")}, new u.a<Void>() { // from class: com.meituan.android.privacy.proxy.w.6
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.privacy.proxy.u.a
                public final /* synthetic */ Void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7767de0dec2428bfa98bf5210943ae9d", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Void) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7767de0dec2428bfa98bf5210943ae9d");
                    }
                    w.this.c.requestCellInfoUpdate(executor, cellInfoCallback);
                    return null;
                }
            }, false);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final List<NeighboringCellInfo> getNeighboringCellInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a7cc6b52a09acccc724b396deb5a9e1", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a7cc6b52a09acccc724b396deb5a9e1");
        }
        if (this.c == null) {
            return null;
        }
        return (List) this.d.a("tel.gNCInfo", this.e, new String[]{y.a(this.e, "Locate.once")}, new u.a<List<NeighboringCellInfo>>() { // from class: com.meituan.android.privacy.proxy.w.7
            public static ChangeQuickRedirect a;

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meituan.android.privacy.proxy.u.a
            /* renamed from: b */
            public List<NeighboringCellInfo> a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5d3e469b8ae97b30cd2e7680723df138", RobustBitConfig.DEFAULT_VALUE)) {
                    return (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5d3e469b8ae97b30cd2e7680723df138");
                }
                try {
                    if (Build.VERSION.SDK_INT < 29) {
                        return (List) ad.a(w.this.c, "getNeighboringCellInfo", new Object[0]);
                    }
                    return null;
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final String getNetworkOperator() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "103eb85c9a9cc7cabb008d6ba57f43ac", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "103eb85c9a9cc7cabb008d6ba57f43ac") : this.c != null ? this.c.getNetworkOperator() : "";
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final boolean isNetworkRoaming() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b569082004afac3eba778b4eb5d1c0d8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b569082004afac3eba778b4eb5d1c0d8")).booleanValue() : this.c != null && this.c.isNetworkRoaming();
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final int getSimState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c4c021a41215a97dea974ceb24a4d63", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c4c021a41215a97dea974ceb24a4d63")).intValue();
        }
        if (this.c != null) {
            return this.c.getSimState();
        }
        return 0;
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final int getDataState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0efdf9f15a4f264740478141f64cba8b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0efdf9f15a4f264740478141f64cba8b")).intValue();
        }
        if (this.c != null) {
            return this.c.getDataState();
        }
        return 0;
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final int getPhoneType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13051dad5d7c33559346d369b8d0cc78", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13051dad5d7c33559346d369b8d0cc78")).intValue();
        }
        if (this.c != null) {
            return this.c.getPhoneType();
        }
        return 0;
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final int getDataActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17ffa140818c6a3861c75115920827a8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17ffa140818c6a3861c75115920827a8")).intValue();
        }
        if (this.c != null) {
            return this.c.getDataActivity();
        }
        return 0;
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final String getSimCountryIso() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ae0adc6a544e85e1ce66bc8e7765465", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ae0adc6a544e85e1ce66bc8e7765465") : this.c != null ? this.c.getSimCountryIso() : "";
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final String getNetworkCountryIso() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a5b0fc9c50a00c9be6a8b7f015f96d7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a5b0fc9c50a00c9be6a8b7f015f96d7") : this.c != null ? this.c.getNetworkCountryIso() : "";
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final int getCallState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ca6057495c0a085c53f4cde6edeaed7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ca6057495c0a085c53f4cde6edeaed7")).intValue();
        }
        if (this.c != null) {
            return this.c.getCallState();
        }
        return 0;
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final String getSimOperator() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "588b57b337775b494ba9624393691a28", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "588b57b337775b494ba9624393691a28") : AppUtil.getSafeSimoperator(this.b);
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final String getNetworkOperatorName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83170147b3903c590de2b538975c096c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83170147b3903c590de2b538975c096c") : this.c != null ? this.c.getNetworkOperatorName() : "";
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final String getSerial() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b06383d9f287ec881e4cae7597b2f55", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b06383d9f287ec881e4cae7597b2f55") : z.a(PermissionGuard.PERMISSION_PHONE_READ, this.e, "tel.gS") ? AppUtil.getSerial(this.b) : "";
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final String getDeviceSoftwareVersion() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "848df7e5c65a1da6421f0cdba82648f6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "848df7e5c65a1da6421f0cdba82648f6");
        }
        com.meituan.android.privacy.interfaces.a.a();
        return null;
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    @NonNull
    public final Map<Integer, List<EmergencyNumber>> getEmergencyNumberList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6b85ff5b6016c127eebaa6c677b9613", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6b85ff5b6016c127eebaa6c677b9613");
        }
        com.meituan.android.privacy.interfaces.a.a();
        return new HashMap();
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    @NonNull
    public final Map<Integer, List<EmergencyNumber>> getEmergencyNumberList(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb41e469335c670e1171744f65c4d721", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb41e469335c670e1171744f65c4d721");
        }
        com.meituan.android.privacy.interfaces.a.a();
        return new HashMap();
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final int getPreferredOpportunisticDataSubscription() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95d6ac332f512fd11fedbde4d9663669", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95d6ac332f512fd11fedbde4d9663669")).intValue();
        }
        com.meituan.android.privacy.interfaces.a.a();
        return -1;
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final int isMultiSimSupported() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc392a5e6fbbd7ab02cf4495d1d65ba3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc392a5e6fbbd7ab02cf4495d1d65ba3")).intValue();
        }
        com.meituan.android.privacy.interfaces.a.a();
        return 1;
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final boolean doesSwitchMultiSimConfigTriggerReboot() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89aa1e14e6dc1888ab0a0256d8abcbd8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89aa1e14e6dc1888ab0a0256d8abcbd8")).booleanValue();
        }
        com.meituan.android.privacy.interfaces.a.a();
        return false;
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    @Nullable
    public final String getVisualVoicemailPackageName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cac66efa39b6e536ab210f6e2a1b5a5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cac66efa39b6e536ab210f6e2a1b5a5");
        }
        com.meituan.android.privacy.interfaces.a.a();
        return null;
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final String getVoiceMailAlphaTag() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4795ef0fef4b5926b3cb26372e36e4b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4795ef0fef4b5926b3cb26372e36e4b");
        }
        com.meituan.android.privacy.interfaces.a.a();
        return null;
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final String[] getForbiddenPlmns() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "924a8b0b527d8200bd5a076bafb923cc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "924a8b0b527d8200bd5a076bafb923cc");
        }
        com.meituan.android.privacy.interfaces.a.a();
        return new String[0];
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final boolean isDataRoamingEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b62b0b2aea361ac18a379e930423ad5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b62b0b2aea361ac18a379e930423ad5")).booleanValue();
        }
        com.meituan.android.privacy.interfaces.a.a();
        return false;
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    @RequiresApi(api = 24)
    @SuppressLint({"MissingPermission"})
    public final int getDataNetworkType() {
        Integer num;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3996795389980e780aa326ea500515ff", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3996795389980e780aa326ea500515ff")).intValue();
        }
        if (this.c == null || (num = (Integer) this.d.a("tel.gDNType", this.e, new String[]{PermissionGuard.PERMISSION_PHONE_BAN}, new u.a<Integer>() { // from class: com.meituan.android.privacy.proxy.w.8
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.proxy.u.a
            public final /* synthetic */ Integer a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b291406f46febca06b07000a5962d250", RobustBitConfig.DEFAULT_VALUE) ? (Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b291406f46febca06b07000a5962d250") : Integer.valueOf(w.this.c.getDataNetworkType());
            }
        })) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final int getVoiceNetworkType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47131c4ce3fca4f45a79e2d5ea6aa268", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47131c4ce3fca4f45a79e2d5ea6aa268")).intValue();
        }
        com.meituan.android.privacy.interfaces.a.a();
        return 0;
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final String getGroupIdLevel1() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0805f13cf16820221464dcf9b9dc5eb6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0805f13cf16820221464dcf9b9dc5eb6");
        }
        com.meituan.android.privacy.interfaces.a.a();
        return null;
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final String getNai() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58aafb586b208482008a8860b7cf99ea", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58aafb586b208482008a8860b7cf99ea");
        }
        com.meituan.android.privacy.interfaces.a.a();
        return null;
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final PersistableBundle getCarrierConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ada31afe2bc917b2e8cde55091b4da09", RobustBitConfig.DEFAULT_VALUE)) {
            return (PersistableBundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ada31afe2bc917b2e8cde55091b4da09");
        }
        com.meituan.android.privacy.interfaces.a.a();
        return null;
    }

    @Override // com.meituan.android.privacy.interfaces.MtTelephonyManager
    public final String getAndroidId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65d5902e4959f7ec67c811c9af5067b9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65d5902e4959f7ec67c811c9af5067b9");
        }
        if (Privacy.createPermissionGuard().a(this.b)) {
            return "";
        }
        String androidId = AppUtil.getAndroidId(this.b);
        com.meituan.android.privacy.histories.a a2 = com.meituan.android.privacy.histories.a.a(this.b);
        Object[] objArr2 = {androidId};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.privacy.histories.a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "9263b92ba3235c487a4828bab283a940", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "9263b92ba3235c487a4828bab283a940");
        } else {
            a2.c.addAndGet(1);
            if (a2.d == null || (androidId != null && androidId.length() != 0)) {
                a2.d = androidId;
            }
        }
        return androidId;
    }
}
