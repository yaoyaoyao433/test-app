package com.meituan.mmp.lib.api.device;

import android.content.IntentFilter;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.mmp.lib.api.AbsApi;
import com.meituan.mmp.lib.api.ServiceApi;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class WifiModule extends ServiceApi {
    public static ChangeQuickRedirect a;
    private HashMap<String, MMPWifiImplement> h;

    public WifiModule() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c89d02cfe7237ca30f193460c76d052a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c89d02cfe7237ca30f193460c76d052a");
        } else {
            this.h = new HashMap<>();
        }
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] a(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0da46f60564a6cf99677c8cd5608022", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0da46f60564a6cf99677c8cd5608022");
        }
        if (Build.VERSION.SDK_INT >= 23 && ("getWifiList".equals(str) || "startWifi".equals(str) || "connectWifi".equals(str) || "getConnectedWifi".equals(str))) {
            return new String[]{"Locate.once"};
        }
        return super.a(str, jSONObject);
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93653acbd1245bf2e10ce8d38b30c8d5", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93653acbd1245bf2e10ce8d38b30c8d5") : new String[]{"startWifi", "stopWifi", "connectWifi", "getWifiList", "getConnectedWifi"};
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba0fff0030fa86d76dd4ea339b72b219", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba0fff0030fa86d76dd4ea339b72b219") : new String[]{"startWifi", "stopWifi", "connectWifi", "getWifiList", "getConnectedWifi", "onGetWifiList", "onWifiConnected"};
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(String str, JSONObject jSONObject, IApiCallback iApiCallback) {
        char c;
        boolean z = true;
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cddc08b1702984c43f2627b88296f401", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cddc08b1702984c43f2627b88296f401");
            return;
        }
        try {
            switch (str.hashCode()) {
                case -2129205609:
                    if (str.equals("startWifi")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1756355064:
                    if (str.equals("getConnectedWifi")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 737050313:
                    if (str.equals("getWifiList")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1714903607:
                    if (str.equals("stopWifi")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1724061471:
                    if (str.equals("connectWifi")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    MMPWifiImplement c2 = c(jSONObject);
                    Object[] objArr2 = {iApiCallback, jSONObject};
                    ChangeQuickRedirect changeQuickRedirect2 = MMPWifiImplement.a;
                    if (PatchProxy.isSupport(objArr2, c2, changeQuickRedirect2, false, "d47062babdc155c7706f1aadc8a42ffe", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, c2, changeQuickRedirect2, false, "d47062babdc155c7706f1aadc8a42ffe");
                        return;
                    } else if (!c2.a()) {
                        c2.c = Privacy.createWifiManager(MMPEnvHelper.getContext(), AbsApi.getToken(jSONObject));
                        if (c2.c != null) {
                            if (c2.a(c2.c) == null) {
                                z = false;
                            }
                            c2.d = z;
                            IntentFilter intentFilter = new IntentFilter();
                            intentFilter.addAction("android.net.wifi.STATE_CHANGE");
                            intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
                            intentFilter.addAction("android.net.wifi.supplicant.STATE_CHANGE");
                            c2.e = AbsApi.getToken(jSONObject);
                            MMPEnvHelper.getContext().registerReceiver(c2.f, intentFilter);
                            iApiCallback.onSuccess(AbsApi.codeJson(0, null));
                            try {
                                c2.b(c2.c);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        iApiCallback.onFail(AbsApi.codeJson(12010, "wifiManager is null"));
                        return;
                    } else {
                        iApiCallback.onSuccess(AbsApi.codeJson(0, null));
                        return;
                    }
                case 1:
                    MMPWifiImplement b = b(jSONObject);
                    if (b != null) {
                        b.a(iApiCallback);
                        return;
                    } else {
                        iApiCallback.onFail(codeJson(12000, "not invoke startWifi"));
                        return;
                    }
                case 2:
                    if (Build.VERSION.SDK_INT >= 29) {
                        iApiCallback.onFail(codeJson(-1, "auto connect wifi is invalid beyond targetSdkVersion 29!"));
                        return;
                    }
                    MMPWifiImplement b2 = b(jSONObject);
                    if (b2 != null) {
                        b2.a(jSONObject, iApiCallback);
                        return;
                    } else {
                        iApiCallback.onFail(codeJson(12000, "not invoke startWifi"));
                        return;
                    }
                case 3:
                    MMPWifiImplement b3 = b(jSONObject);
                    if (b3 != null) {
                        b3.b(iApiCallback);
                        return;
                    } else {
                        iApiCallback.onFail(codeJson(12000, "not invoke startWifi"));
                        return;
                    }
                case 4:
                    MMPWifiImplement b4 = b(jSONObject);
                    if (b4 == null) {
                        iApiCallback.onFail(codeJson(12000, "not invoke startWifi"));
                        return;
                    }
                    Object[] objArr3 = {iApiCallback};
                    ChangeQuickRedirect changeQuickRedirect3 = MMPWifiImplement.a;
                    if (PatchProxy.isSupport(objArr3, b4, changeQuickRedirect3, false, "3d25688b79b7f4a30305297c70acaad0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, b4, changeQuickRedirect3, false, "3d25688b79b7f4a30305297c70acaad0");
                        return;
                    } else if (b4.a()) {
                        if (3 != b4.c.getWifiState()) {
                            iApiCallback.onFail(AbsApi.codeJson(12005, "wifi is disable"));
                            return;
                        }
                        WifiInfo a2 = b4.a(b4.c);
                        if (a2 != null) {
                            if (-1 != a2.getNetworkId()) {
                                try {
                                    String a3 = b4.a(a2);
                                    String bssid = a2.getBSSID();
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("SSID", a3);
                                    jSONObject2.put("BSSID", bssid);
                                    jSONObject2.put("secure", !TextUtils.equals("OPEN", b4.a(a3, bssid)));
                                    jSONObject2.put("signalStrength", WifiManager.calculateSignalLevel(a2.getRssi(), 100));
                                    JSONObject codeJson = AbsApi.codeJson(0, null);
                                    codeJson.put("wifi", jSONObject2);
                                    iApiCallback.onSuccess(codeJson);
                                    return;
                                } catch (JSONException e) {
                                    iApiCallback.onFail(AbsApi.codeJson(12010, e.getMessage()));
                                    return;
                                }
                            }
                            iApiCallback.onFail(AbsApi.codeJson(12010, "no wifi is connected"));
                            return;
                        }
                        iApiCallback.onFail(AbsApi.codeJson(12010, "currentWifi is null"));
                        return;
                    } else {
                        iApiCallback.onFail(AbsApi.codeJson(12000, "not invoke startWifi"));
                        return;
                    }
                default:
                    return;
            }
        } catch (Throwable th) {
            iApiCallback.onFail(codeJson(12010, th.getMessage()));
        }
    }

    private synchronized MMPWifiImplement b(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a5cff0c545ad9000be02a884c3570fe", RobustBitConfig.DEFAULT_VALUE)) {
            return (MMPWifiImplement) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a5cff0c545ad9000be02a884c3570fe");
        }
        String token = TextUtils.isEmpty(getToken(jSONObject)) ? "mmp1234" : getToken(jSONObject);
        if (this.h.containsKey(token)) {
            return this.h.get(token);
        }
        return null;
    }

    private synchronized MMPWifiImplement c(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36de626ea3694b6bcac74a4c995d6bfb", RobustBitConfig.DEFAULT_VALUE)) {
            return (MMPWifiImplement) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36de626ea3694b6bcac74a4c995d6bfb");
        }
        String token = TextUtils.isEmpty(getToken(jSONObject)) ? "mmp1234" : getToken(jSONObject);
        if (!this.h.containsKey(token)) {
            this.h.put(token, new MMPWifiImplement(this.d));
        }
        return this.h.get(token);
    }

    @Override // com.meituan.mmp.lib.api.ServiceApi
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac850162b2c54877eaa0816e1cc0bf67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac850162b2c54877eaa0816e1cc0bf67");
            return;
        }
        for (MMPWifiImplement mMPWifiImplement : this.h.values()) {
            mMPWifiImplement.a((IApiCallback) null);
        }
        this.h.clear();
    }
}
