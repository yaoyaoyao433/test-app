package com.meituan.mmp.lib.api.device;

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
import com.meituan.mmp.lib.api.AbsApi;
import com.meituan.mmp.lib.utils.e;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class MMPWifiImplement {
    public static ChangeQuickRedirect a;
    protected static final Handler b = new Handler(Looper.getMainLooper());
    volatile MtWifiManager c;
    boolean d;
    String e;
    BroadcastReceiver f;
    private volatile WifiManager g;
    private volatile List<ScanResult> h;
    private volatile IApiCallback i;
    private volatile String j;
    private volatile String k;
    private volatile List<WifiConfiguration> l;
    private ConnectWifiMongolianLayer m;
    private com.meituan.mmp.lib.interfaces.c n;
    private Runnable o;

    public static /* synthetic */ void a(MMPWifiImplement mMPWifiImplement, WifiInfo wifiInfo) {
        int calculateSignalLevel;
        Object[] objArr = {wifiInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mMPWifiImplement, changeQuickRedirect, false, "2b3e7d187c65016440af175612604a10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mMPWifiImplement, changeQuickRedirect, false, "2b3e7d187c65016440af175612604a10");
            return;
        }
        try {
            String a2 = mMPWifiImplement.a(wifiInfo);
            String bssid = wifiInfo.getBSSID();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("SSID", a2);
            jSONObject.put("BSSID", bssid);
            jSONObject.put("secure", !TextUtils.equals("OPEN", mMPWifiImplement.a(a2, bssid)));
            int rssi = wifiInfo.getRssi();
            Object[] objArr2 = {Integer.valueOf(rssi), 100};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, mMPWifiImplement, changeQuickRedirect2, false, "3be77bd1313e2ed22dffbe05250be469", RobustBitConfig.DEFAULT_VALUE)) {
                calculateSignalLevel = ((Integer) PatchProxy.accessDispatch(objArr2, mMPWifiImplement, changeQuickRedirect2, false, "3be77bd1313e2ed22dffbe05250be469")).intValue();
            } else {
                WifiManager wifiManager = mMPWifiImplement.g;
                calculateSignalLevel = WifiManager.calculateSignalLevel(rssi, 100);
            }
            jSONObject.put("signalStrength", calculateSignalLevel);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("wifi", jSONObject);
            if (mMPWifiImplement.n != null) {
                mMPWifiImplement.n.a("onWifiConnected", jSONObject2.toString(), 0);
            }
        } catch (JSONException unused) {
        }
    }

    public static /* synthetic */ void a(MMPWifiImplement mMPWifiImplement, boolean z, int i, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mMPWifiImplement, changeQuickRedirect, false, "929ab07f74e4b51f430ff2c03e364e54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mMPWifiImplement, changeQuickRedirect, false, "929ab07f74e4b51f430ff2c03e364e54");
            return;
        }
        if (mMPWifiImplement.m != null) {
            mMPWifiImplement.m.dismiss();
            mMPWifiImplement.m = null;
        }
        if (mMPWifiImplement.o != null) {
            b.removeCallbacks(mMPWifiImplement.o);
            mMPWifiImplement.o = null;
        }
        IApiCallback iApiCallback = mMPWifiImplement.i;
        mMPWifiImplement.i = null;
        mMPWifiImplement.j = null;
        mMPWifiImplement.k = null;
        if (iApiCallback != null) {
            if (z) {
                iApiCallback.onSuccess(AbsApi.codeJson(0, null));
                return;
            }
            if (mMPWifiImplement.l != null) {
                mMPWifiImplement.a(mMPWifiImplement.l, true);
                mMPWifiImplement.l = null;
            }
            iApiCallback.onFail(AbsApi.codeJson(i, str));
        }
    }

    public MMPWifiImplement(com.meituan.mmp.lib.interfaces.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b0f654a6c667b81309bcb7f5e901601", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b0f654a6c667b81309bcb7f5e901601");
            return;
        }
        this.g = (WifiManager) MMPEnvHelper.getContext().getApplicationContext().getSystemService("wifi");
        this.h = new ArrayList();
        this.n = null;
        this.o = new Runnable() { // from class: com.meituan.mmp.lib.api.device.MMPWifiImplement.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "44dc0dd77f44da40ec59988de2321351", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "44dc0dd77f44da40ec59988de2321351");
                } else {
                    MMPWifiImplement.a(MMPWifiImplement.this, false, 12003, "fail to connect wifi:time out");
                }
            }
        };
        this.f = new BroadcastReceiver() { // from class: com.meituan.mmp.lib.api.device.MMPWifiImplement.2
            public static ChangeQuickRedirect a;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                Object[] objArr2 = {context, intent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6c379b10d9b71af8cd7d504853032c39", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6c379b10d9b71af8cd7d504853032c39");
                } else if (MMPWifiImplement.this.a()) {
                    if ("android.net.wifi.STATE_CHANGE".equals(intent.getAction())) {
                        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
                        boolean z = networkInfo != null && NetworkInfo.State.CONNECTED == networkInfo.getState();
                        if (networkInfo.getType() != 1) {
                            return;
                        }
                        if (z != MMPWifiImplement.this.d) {
                            MMPWifiImplement.this.d = z;
                        }
                        if (z) {
                            WifiInfo wifiInfo = (WifiInfo) intent.getParcelableExtra("wifiInfo");
                            if (wifiInfo == null) {
                                wifiInfo = MMPWifiImplement.this.a(MMPWifiImplement.this.c);
                            }
                            if (wifiInfo == null) {
                                return;
                            }
                            MMPWifiImplement.a(MMPWifiImplement.this, wifiInfo);
                            if (TextUtils.equals(MMPWifiImplement.this.j, MMPWifiImplement.this.a(wifiInfo))) {
                                MMPWifiImplement.a(MMPWifiImplement.this, true, 0, null);
                            } else {
                                MMPWifiImplement.a(MMPWifiImplement.this, false, 12008, "invalid SSID");
                            }
                        }
                    } else if ("android.net.wifi.SCAN_RESULTS".equals(intent.getAction())) {
                        try {
                            if (com.meituan.msi.privacy.permission.a.a(context, "Locate.once", MMPWifiImplement.this.e) || com.meituan.msi.privacy.permission.a.a(context, PermissionGuard.PERMISSION_LOCATION_CONTINUOUS, MMPWifiImplement.this.e)) {
                                MMPWifiImplement.this.h = MMPWifiImplement.this.c(MMPWifiImplement.this.c);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else if ("android.net.wifi.supplicant.STATE_CHANGE".equals(intent.getAction()) && f.a(intent, "supplicantError", -1) == 1) {
                        MMPWifiImplement.a(MMPWifiImplement.this, false, 12002, "password error");
                    }
                }
            }
        };
        this.n = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        return this.c != null;
    }

    public final void a(IApiCallback iApiCallback) {
        Object[] objArr = {iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4da670b2d142761bd81d8fcb99ea3f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4da670b2d142761bd81d8fcb99ea3f9");
        } else if (!a()) {
            if (iApiCallback != null) {
                iApiCallback.onFail(AbsApi.codeJson(12000, "not invoke startWifi"));
            }
        } else {
            this.e = "";
            e.a(MMPEnvHelper.getContext(), this.f);
            b.removeCallbacks(this.o);
            this.c = null;
            this.h = null;
            this.i = null;
            this.k = null;
            this.j = null;
            this.l = null;
            this.d = false;
            this.m = null;
            if (iApiCallback != null) {
                iApiCallback.onSuccess(AbsApi.codeJson(0, null));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(org.json.JSONObject r23, com.meituan.mmp.main.IApiCallback r24) {
        /*
            Method dump skipped, instructions count: 878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.api.device.MMPWifiImplement.a(org.json.JSONObject, com.meituan.mmp.main.IApiCallback):void");
    }

    private ScanResult a(MtWifiManager mtWifiManager, String str, String str2) {
        Object[] objArr = {mtWifiManager, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb67a01e622012308a16c2d20b14db54", RobustBitConfig.DEFAULT_VALUE)) {
            return (ScanResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb67a01e622012308a16c2d20b14db54");
        }
        for (ScanResult scanResult : c(mtWifiManager)) {
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

    private void a(List<WifiConfiguration> list, boolean z) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58c93a68aa754be3d627cbff1617e379", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58c93a68aa754be3d627cbff1617e379");
        } else if (this.c != null && list != null && list != null && !list.isEmpty()) {
            for (WifiConfiguration wifiConfiguration : list) {
                if (z) {
                    a(wifiConfiguration.networkId, false);
                } else {
                    int i = wifiConfiguration.networkId;
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "83fd8bdc06a3c3379e586f3850c14880", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "83fd8bdc06a3c3379e586f3850c14880");
                    } else {
                        this.g.disableNetwork(i);
                    }
                }
            }
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d304cacdecda439ad8832cba59004d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d304cacdecda439ad8832cba59004d5");
            return;
        }
        if (this.m == null) {
            this.m = new ConnectWifiMongolianLayer(MMPEnvHelper.getContext());
        }
        this.m.show();
    }

    private WifiConfiguration a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a799e7f84968d03a5c1c82cf91545de", RobustBitConfig.DEFAULT_VALUE)) {
            return (WifiConfiguration) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a799e7f84968d03a5c1c82cf91545de");
        }
        if (this.c != null) {
            List<WifiConfiguration> d = d(this.c);
            if (d.isEmpty()) {
                return null;
            }
            for (WifiConfiguration wifiConfiguration : d) {
                if (wifiConfiguration != null && TextUtils.equals(wifiConfiguration.SSID, str)) {
                    return wifiConfiguration;
                }
            }
            return null;
        }
        return null;
    }

    private String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4e61c38a4655ac8292d78988f86d07c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4e61c38a4655ac8292d78988f86d07c") : str.toLowerCase().contains("wep") ? "WEP" : str.toLowerCase().contains("psk") ? "PSK" : str.toLowerCase().contains("eap") ? "EAP" : "OPEN";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7b267d8eeccdea88127d6ae4e16a8c9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7b267d8eeccdea88127d6ae4e16a8c9");
        }
        String str3 = "OPEN";
        if (this.h != null && !this.h.isEmpty()) {
            for (ScanResult scanResult : this.h) {
                if (scanResult.SSID.equals(str) && (str2 == null || scanResult.BSSID.equals(str2))) {
                    str3 = b(scanResult.capabilities);
                }
            }
        }
        return str3;
    }

    public final void b(IApiCallback iApiCallback) {
        Object[] objArr = {iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a50c10b498814ef5cb0b6e2a084ccc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a50c10b498814ef5cb0b6e2a084ccc6");
        } else if (a()) {
            if (3 != this.c.getWifiState()) {
                iApiCallback.onFail(AbsApi.codeJson(12005, "wifi is disable"));
                return;
            }
            if (this.h == null || this.h.isEmpty()) {
                b(this.c);
                this.h = c(this.c);
            }
            if (this.h != null) {
                iApiCallback.onSuccess(AbsApi.codeJson(0, null));
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (ScanResult scanResult : this.h) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("SSID", scanResult.SSID);
                        jSONObject.put("BSSID", scanResult.BSSID);
                        jSONObject.put("secure", !TextUtils.equals("OPEN", b(scanResult.capabilities)));
                        jSONObject.put("signalStrength", WifiManager.calculateSignalLevel(scanResult.level, 100));
                        jSONArray.put(jSONObject);
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("wifiList", jSONArray);
                    if (this.n != null) {
                        this.n.a("onGetWifiList", jSONObject2.toString(), 0);
                        return;
                    }
                    return;
                } catch (JSONException e) {
                    iApiCallback.onFail(AbsApi.codeJson(12010, e.getMessage()));
                    return;
                }
            }
            iApiCallback.onFail(AbsApi.codeJson(12010, "scanResults is null"));
        } else {
            iApiCallback.onFail(AbsApi.codeJson(12000, "not invoke startWifi"));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(WifiInfo wifiInfo) {
        Object[] objArr = {wifiInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b727b8bac4a6352f18040694afe12393", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b727b8bac4a6352f18040694afe12393");
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
            if (PatchProxy.isSupport(objArr, connectWifiMongolianLayer, changeQuickRedirect, false, "89c54aef4d9a4e5fb6f9fadb006b9ea1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, connectWifiMongolianLayer, changeQuickRedirect, false, "89c54aef4d9a4e5fb6f9fadb006b9ea1");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa977ccfbfb6482cc5924321ed21fee4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa977ccfbfb6482cc5924321ed21fee4");
                return;
            }
            this.c = new CheckBox[3];
            this.d = new Handler(Looper.getMainLooper());
            this.b = new Runnable() { // from class: com.meituan.mmp.lib.api.device.MMPWifiImplement.ConnectWifiMongolianLayer.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "da5da7ba68ea27d104ee7fb3a5f36b7b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "da5da7ba68ea27d104ee7fb3a5f36b7b");
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
            View inflate = View.inflate(context, R.layout.hera_connect_wifi_mongolian, null);
            setContentView(inflate);
            this.c[0] = (CheckBox) inflate.findViewById(R.id.check_box_0);
            this.c[1] = (CheckBox) inflate.findViewById(R.id.check_box_1);
            this.c[2] = (CheckBox) inflate.findViewById(R.id.check_box_2);
            setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.meituan.mmp.lib.api.device.MMPWifiImplement.ConnectWifiMongolianLayer.1
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    Object[] objArr2 = {dialogInterface};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4c043199a61af12522390ddc58ccab20", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4c043199a61af12522390ddc58ccab20");
                    } else {
                        ConnectWifiMongolianLayer.a(ConnectWifiMongolianLayer.this, true);
                    }
                }
            });
            setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.meituan.mmp.lib.api.device.MMPWifiImplement.ConnectWifiMongolianLayer.2
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    Object[] objArr2 = {dialogInterface};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3b7be2e991f8a92e02ccebeb58c77518", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3b7be2e991f8a92e02ccebeb58c77518");
                    } else {
                        ConnectWifiMongolianLayer.a(ConnectWifiMongolianLayer.this, false);
                    }
                }
            });
            setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.meituan.mmp.lib.api.device.MMPWifiImplement.ConnectWifiMongolianLayer.3
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i), keyEvent};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d6ae2cb457d012faaf2967ffd8788c1f", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d6ae2cb457d012faaf2967ffd8788c1f")).booleanValue();
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f334dcacc901a714e35d3135e96facd0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f334dcacc901a714e35d3135e96facd0");
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

    /* JADX INFO: Access modifiers changed from: private */
    public List<ScanResult> c(MtWifiManager mtWifiManager) {
        Object[] objArr = {mtWifiManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74efd42e514f6a18a954cf8f2a449e33", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74efd42e514f6a18a954cf8f2a449e33") : mtWifiManager.getScanResults();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WifiInfo a(MtWifiManager mtWifiManager) {
        Object[] objArr = {mtWifiManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78d3ce4c99ea39d79b3a067a4075eb08", RobustBitConfig.DEFAULT_VALUE) ? (WifiInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78d3ce4c99ea39d79b3a067a4075eb08") : mtWifiManager.getConnectionInfo();
    }

    private List<WifiConfiguration> d(MtWifiManager mtWifiManager) {
        Object[] objArr = {mtWifiManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e5fe5cf1014494fb5059400ac264222", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e5fe5cf1014494fb5059400ac264222") : mtWifiManager.getConfiguredNetworks();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(MtWifiManager mtWifiManager) {
        Object[] objArr = {mtWifiManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c73459f2ba49ed00f0ed9b38d244fcc7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c73459f2ba49ed00f0ed9b38d244fcc7")).booleanValue() : mtWifiManager.startScan();
    }

    private boolean a(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "422c17fb1c36309c88e73d70d22ee51a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "422c17fb1c36309c88e73d70d22ee51a")).booleanValue() : this.g.enableNetwork(i, z);
    }
}
