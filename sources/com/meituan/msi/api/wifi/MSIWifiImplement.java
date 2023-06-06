package com.meituan.msi.api.wifi;

import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.CheckBox;
import com.meituan.android.privacy.interfaces.MtWifiManager;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.msi.a;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.dispather.e;
import com.meituan.msi.util.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class MSIWifiImplement {
    public static ChangeQuickRedirect a;
    protected static final Handler b = new Handler(Looper.getMainLooper());
    volatile MtWifiManager c;
    boolean d;
    String e;
    volatile List<ScanResult> f;
    public WifiBroadcastReceiver g;
    private e h;
    private volatile List<WifiConfiguration> i;
    private volatile WifiManager j;
    private volatile String k;
    private volatile String l;
    private ConnectWifiMongolianLayer m;
    private Runnable n;

    public static /* synthetic */ void a(MSIWifiImplement mSIWifiImplement, WifiInfo wifiInfo) {
        int calculateSignalLevel;
        Object[] objArr = {wifiInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mSIWifiImplement, changeQuickRedirect, false, "a0e958144a1d622c4466800df3ee5576", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mSIWifiImplement, changeQuickRedirect, false, "a0e958144a1d622c4466800df3ee5576");
            return;
        }
        String ssid = wifiInfo.getSSID();
        if (ssid != null && ssid.length() > 1 && ssid.charAt(0) == '\"' && ssid.charAt(ssid.length() - 1) == '\"') {
            ssid = ssid.substring(1, ssid.length() - 1);
        }
        String bssid = wifiInfo.getBSSID();
        WifiInfoDetail wifiInfoDetail = new WifiInfoDetail();
        WifiInfoEvent wifiInfoEvent = new WifiInfoEvent();
        wifiInfoDetail.SSID = ssid;
        wifiInfoDetail.BSSID = bssid;
        wifiInfoDetail.secure = !TextUtils.equals("OPEN", mSIWifiImplement.a(ssid, bssid));
        int rssi = wifiInfo.getRssi();
        Object[] objArr2 = {Integer.valueOf(rssi), 100};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, mSIWifiImplement, changeQuickRedirect2, false, "55055c4b2f6250d62e25016fc2b97247", RobustBitConfig.DEFAULT_VALUE)) {
            calculateSignalLevel = ((Integer) PatchProxy.accessDispatch(objArr2, mSIWifiImplement, changeQuickRedirect2, false, "55055c4b2f6250d62e25016fc2b97247")).intValue();
        } else {
            WifiManager wifiManager = mSIWifiImplement.j;
            calculateSignalLevel = WifiManager.calculateSignalLevel(rssi, 100);
        }
        wifiInfoDetail.signalStrength = calculateSignalLevel;
        wifiInfoEvent.wifi = wifiInfoDetail;
        if (mSIWifiImplement.h != null) {
            mSIWifiImplement.h.a("onWifiConnected", wifiInfoEvent);
        }
    }

    public static /* synthetic */ void a(MSIWifiImplement mSIWifiImplement, boolean z, String str, MsiContext msiContext) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mSIWifiImplement, changeQuickRedirect, false, "24317b37ea59cfa96b212f56b4f3d03f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mSIWifiImplement, changeQuickRedirect, false, "24317b37ea59cfa96b212f56b4f3d03f");
            return;
        }
        if (mSIWifiImplement.m != null) {
            mSIWifiImplement.m.dismiss();
            mSIWifiImplement.m = null;
        }
        b.removeCallbacks(mSIWifiImplement.n);
        mSIWifiImplement.k = null;
        mSIWifiImplement.l = null;
        if (z || mSIWifiImplement.i == null) {
            return;
        }
        mSIWifiImplement.a(mSIWifiImplement.i, true);
        mSIWifiImplement.i.clear();
    }

    public MSIWifiImplement(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfb0014ed547b394e6ef76e75997b664", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfb0014ed547b394e6ef76e75997b664");
            return;
        }
        this.h = null;
        this.f = new ArrayList();
        this.j = (WifiManager) a.f().getApplicationContext().getSystemService("wifi");
        this.g = new WifiBroadcastReceiver();
        this.n = new Runnable() { // from class: com.meituan.msi.api.wifi.MSIWifiImplement.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6d29f2afad21bcfe8af3e85c99ce6fb1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6d29f2afad21bcfe8af3e85c99ce6fb1");
                } else {
                    MSIWifiImplement.a(MSIWifiImplement.this, false, "fail to connect wifi:time out", null);
                }
            }
        };
        this.h = eVar;
    }

    public final void a(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec434627af6f0e584f68f10a68d6e958", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec434627af6f0e584f68f10a68d6e958");
        } else if (!a()) {
            if (msiContext != null) {
                msiContext.onError("not invoke startWifi");
            }
        } else {
            this.e = "";
            c.a(a.f(), this.g);
            b.removeCallbacks(this.n);
            this.c = null;
            this.f = null;
            this.l = null;
            this.k = null;
            this.i = null;
            this.d = false;
            this.m = null;
            if (msiContext != null) {
                msiContext.onSuccess(null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0201  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.meituan.msi.api.wifi.WifiParam r22, com.meituan.msi.bean.MsiContext r23) {
        /*
            Method dump skipped, instructions count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msi.api.wifi.MSIWifiImplement.a(com.meituan.msi.api.wifi.WifiParam, com.meituan.msi.bean.MsiContext):void");
    }

    private List<WifiConfiguration> c(MtWifiManager mtWifiManager) {
        Object[] objArr = {mtWifiManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a544e2186ec1c4dbb67fe95ef896782a", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a544e2186ec1c4dbb67fe95ef896782a") : mtWifiManager.getConfiguredNetworks();
    }

    private WifiConfiguration b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf1f02a346ccbdd8c1a9affba4c62d8b", RobustBitConfig.DEFAULT_VALUE)) {
            return (WifiConfiguration) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf1f02a346ccbdd8c1a9affba4c62d8b");
        }
        if (this.c != null) {
            List<WifiConfiguration> c = c(this.c);
            if (c.isEmpty()) {
                return null;
            }
            for (WifiConfiguration wifiConfiguration : c) {
                if (wifiConfiguration != null && TextUtils.equals(wifiConfiguration.SSID, str)) {
                    return wifiConfiguration;
                }
            }
            return null;
        }
        return null;
    }

    public final boolean a() {
        return this.c != null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class WifiBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect a;

        public WifiBroadcastReceiver() {
            Object[] objArr = {MSIWifiImplement.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a9bcc2f68ab319fee58321122538a41", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a9bcc2f68ab319fee58321122538a41");
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4d384c29663f3ca94d2d51398b3e0ce", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4d384c29663f3ca94d2d51398b3e0ce");
            } else if (MSIWifiImplement.this.a()) {
                if ("android.net.wifi.STATE_CHANGE".equals(intent.getAction())) {
                    NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
                    boolean z = networkInfo != null && NetworkInfo.State.CONNECTED == networkInfo.getState();
                    if (networkInfo.getType() != 1) {
                        return;
                    }
                    if (z != MSIWifiImplement.this.d) {
                        MSIWifiImplement.this.d = z;
                    }
                    if (z) {
                        WifiInfo wifiInfo = (WifiInfo) intent.getParcelableExtra("wifiInfo");
                        if (wifiInfo == null) {
                            wifiInfo = MSIWifiImplement.this.c.getConnectionInfo();
                        }
                        if (wifiInfo == null) {
                            return;
                        }
                        MSIWifiImplement.a(MSIWifiImplement.this, wifiInfo);
                        if (TextUtils.equals(MSIWifiImplement.this.k, MSIWifiImplement.this.a(wifiInfo))) {
                            MSIWifiImplement.a(MSIWifiImplement.this, true, null, null);
                        } else {
                            MSIWifiImplement.a(MSIWifiImplement.this, false, "invalid SSID", null);
                        }
                    }
                } else if ("android.net.wifi.SCAN_RESULTS".equals(intent.getAction())) {
                    try {
                        if (com.meituan.msi.privacy.permission.a.a(context, "Locate.once", MSIWifiImplement.this.e) || com.meituan.msi.privacy.permission.a.a(context, PermissionGuard.PERMISSION_LOCATION_CONTINUOUS, MSIWifiImplement.this.e)) {
                            MSIWifiImplement.this.f = MSIWifiImplement.this.a(MSIWifiImplement.this.c);
                        }
                    } catch (Exception unused) {
                        com.meituan.msi.log.a.a("权限检查错误");
                    }
                } else if ("android.net.wifi.supplicant.STATE_CHANGE".equals(intent.getAction()) && f.a(intent, "supplicantError", -1) == 1) {
                    MSIWifiImplement.a(MSIWifiImplement.this, false, "password error", null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5633b30eacf81e1ceb72ecc052a3504", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5633b30eacf81e1ceb72ecc052a3504");
        }
        String str3 = "OPEN";
        if (this.f != null && !this.f.isEmpty()) {
            for (ScanResult scanResult : this.f) {
                if (scanResult.SSID.equals(str) && (str2 == null || scanResult.BSSID.equals(str2))) {
                    str3 = a(scanResult.capabilities);
                }
            }
        }
        return str3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "974dadd5a3444bfdb2b4addb6197fc96", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "974dadd5a3444bfdb2b4addb6197fc96") : str.toLowerCase().contains("wep") ? "WEP" : str.toLowerCase().contains("psk") ? "PSK" : str.toLowerCase().contains("eap") ? "EAP" : "OPEN";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(WifiInfo wifiInfo) {
        Object[] objArr = {wifiInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "378dd992c39279e57f9f9f9b91fe744a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "378dd992c39279e57f9f9f9b91fe744a");
        }
        String ssid = wifiInfo.getSSID();
        return (ssid == null || ssid.length() <= 1 || ssid.charAt(0) != '\"' || ssid.charAt(ssid.length() - 1) != '\"') ? ssid : ssid.substring(1, ssid.length() - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class ConnectWifiMongolianLayer extends Dialog {
        public static ChangeQuickRedirect a;
        public Runnable b;
        private CheckBox[] c;
        private Handler d;
        private Context e;

        public static /* synthetic */ void a(ConnectWifiMongolianLayer connectWifiMongolianLayer, boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, connectWifiMongolianLayer, changeQuickRedirect, false, "482935a3fa1f79f3cc801366bcb4be24", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, connectWifiMongolianLayer, changeQuickRedirect, false, "482935a3fa1f79f3cc801366bcb4be24");
            } else if (z) {
                connectWifiMongolianLayer.d.postDelayed(connectWifiMongolianLayer.b, 200L);
            } else {
                connectWifiMongolianLayer.d.removeCallbacks(connectWifiMongolianLayer.b);
            }
        }

        public ConnectWifiMongolianLayer(Context context) {
            super(context, R.style.ConnectWifiProgress);
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ded58d889da610e8021997bd41b42cf1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ded58d889da610e8021997bd41b42cf1");
                return;
            }
            this.c = new CheckBox[3];
            this.d = new Handler(Looper.getMainLooper());
            this.b = new Runnable() { // from class: com.meituan.msi.api.wifi.MSIWifiImplement.ConnectWifiMongolianLayer.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "939d9b5496a260410a033d017d723a85", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "939d9b5496a260410a033d017d723a85");
                        return;
                    }
                    int i = 0;
                    int i2 = 1;
                    for (int i3 = 0; i3 < 3; i3++) {
                        CheckBox checkBox = ConnectWifiMongolianLayer.this.c[i3];
                        if (checkBox.isChecked()) {
                            checkBox.setChecked(false);
                            i = i3;
                        } else if (checkBox.isEnabled()) {
                            checkBox.setEnabled(false);
                            i2 = i3;
                        }
                    }
                    ConnectWifiMongolianLayer.this.c[(i + 1) % 3].setChecked(true);
                    ConnectWifiMongolianLayer.this.c[(i2 + 1) % 3].setEnabled(true);
                    ConnectWifiMongolianLayer.a(ConnectWifiMongolianLayer.this, true);
                }
            };
            this.e = context;
            setCancelable(false);
            View inflate = View.inflate(context, R.layout.msi_connect_wifi_mongolian, null);
            setContentView(inflate);
            this.c[0] = (CheckBox) inflate.findViewById(R.id.check_box_0);
            this.c[1] = (CheckBox) inflate.findViewById(R.id.check_box_1);
            this.c[2] = (CheckBox) inflate.findViewById(R.id.check_box_2);
            setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.meituan.msi.api.wifi.MSIWifiImplement.ConnectWifiMongolianLayer.1
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    Object[] objArr2 = {dialogInterface};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "31a536c0f46e8e8eb8aed471cf7a7d1e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "31a536c0f46e8e8eb8aed471cf7a7d1e");
                    } else {
                        ConnectWifiMongolianLayer.a(ConnectWifiMongolianLayer.this, true);
                    }
                }
            });
            setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.meituan.msi.api.wifi.MSIWifiImplement.ConnectWifiMongolianLayer.2
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    Object[] objArr2 = {dialogInterface};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "568c0d7adc41866080f3e42dcd760ee0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "568c0d7adc41866080f3e42dcd760ee0");
                    } else {
                        ConnectWifiMongolianLayer.a(ConnectWifiMongolianLayer.this, false);
                    }
                }
            });
            setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.meituan.msi.api.wifi.MSIWifiImplement.ConnectWifiMongolianLayer.3
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i), keyEvent};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d1db40c27a22b63559d2e9612af69f05", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d1db40c27a22b63559d2e9612af69f05")).booleanValue();
                    }
                    if (i == 4) {
                        ConnectWifiMongolianLayer.this.dismiss();
                    }
                    return true;
                }
            });
        }

        @Override // android.app.Dialog
        public void show() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fcb7809fbd9b5422152f07358ad25c4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fcb7809fbd9b5422152f07358ad25c4");
            } else if (this.e instanceof Activity) {
                Activity activity = (Activity) this.e;
                if (activity.isFinishing()) {
                    return;
                }
                if (Build.VERSION.SDK_INT <= 16 || !activity.isDestroyed()) {
                    super.show();
                }
            }
        }
    }

    private void a(List<WifiConfiguration> list, boolean z) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d95f64f141473790a41b72dcb3847f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d95f64f141473790a41b72dcb3847f3");
        } else if (this.c != null && list != null && list != null && !list.isEmpty()) {
            for (WifiConfiguration wifiConfiguration : list) {
                if (z) {
                    a(wifiConfiguration.networkId, false);
                } else {
                    int i = wifiConfiguration.networkId;
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "26cf6fad12721f52fbc98da4a41cc266", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "26cf6fad12721f52fbc98da4a41cc266");
                    } else {
                        this.j.disableNetwork(i);
                    }
                }
            }
        }
    }

    private boolean a(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bee6db0adca497f575bb009435d5b5c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bee6db0adca497f575bb009435d5b5c")).booleanValue() : this.j.enableNetwork(i, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<ScanResult> a(MtWifiManager mtWifiManager) {
        Object[] objArr = {mtWifiManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fbf405f311913d79b625f60f75abad9", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fbf405f311913d79b625f60f75abad9") : mtWifiManager.getScanResults();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(MtWifiManager mtWifiManager) {
        Object[] objArr = {mtWifiManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aae978c2c56e280944919b592f03127b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aae978c2c56e280944919b592f03127b")).booleanValue() : mtWifiManager.startScan();
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9053bef5fc3873c75c3badece2cca5e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9053bef5fc3873c75c3badece2cca5e2");
            return;
        }
        if (this.m == null) {
            this.m = new ConnectWifiMongolianLayer(a.f());
        }
        this.m.show();
    }

    private ScanResult a(MtWifiManager mtWifiManager, String str, String str2) {
        Object[] objArr = {mtWifiManager, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8826b3abab6d8e2aae38f27c01b4c22d", RobustBitConfig.DEFAULT_VALUE)) {
            return (ScanResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8826b3abab6d8e2aae38f27c01b4c22d");
        }
        for (ScanResult scanResult : a(mtWifiManager)) {
            if (TextUtils.isEmpty(str2)) {
                if (scanResult.SSID.equals(str)) {
                    return scanResult;
                }
            } else if (scanResult.SSID.equals(str) && scanResult.BSSID.equals(str2)) {
                return scanResult;
            }
        }
        return null;
    }
}
