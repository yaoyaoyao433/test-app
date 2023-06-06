package com.meituan.msi.api.wifi;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.api.l;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.lifecycle.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class WifiApi implements IMsiApi, l, a {
    public static ChangeQuickRedirect a;
    public String b;
    private HashMap<String, MSIWifiImplement> c;

    @Override // com.meituan.msi.lifecycle.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3255c320abac7888462807af408015b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3255c320abac7888462807af408015b9");
        }
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08cd2645b40e9fbd16e6fc4da9587a0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08cd2645b40e9fbd16e6fc4da9587a0e");
        }
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5282aefe0634cc64bac85c2084132b28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5282aefe0634cc64bac85c2084132b28");
        }
    }

    @MsiApiMethod(isCallback = true, name = "offGetWifiList")
    public void offGetWifiList(MsiContext msiContext) {
    }

    @MsiApiMethod(isCallback = true, name = "offWifiConnected")
    public void offWifiConnected(MsiContext msiContext) {
    }

    @MsiApiMethod(isCallback = true, name = "onGetWifiList", response = WifiListEvent.class)
    public void onGetWifiList(MsiContext msiContext) {
    }

    @MsiApiMethod(isCallback = true, name = "onWifiConnected", response = WifiInfoEvent.class)
    public void onWifiConnected(MsiContext msiContext) {
    }

    public WifiApi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7982c2980d9014f2e8c4ca35f986c0c2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7982c2980d9014f2e8c4ca35f986c0c2");
            return;
        }
        this.c = new HashMap<>();
        this.b = "";
    }

    @MsiApiMethod(name = "startWifi", request = WifiParam.class)
    public synchronized void startWifi(WifiParam wifiParam, MsiContext msiContext) {
        Object[] objArr = {wifiParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45407609b048d58f37519ac98d1aee99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45407609b048d58f37519ac98d1aee99");
            return;
        }
        MSIWifiImplement a2 = a(wifiParam, msiContext);
        if (a2 == null) {
            msiContext.onError("token is null");
        }
        String str = this.b;
        Object[] objArr2 = {str, msiContext};
        ChangeQuickRedirect changeQuickRedirect2 = MSIWifiImplement.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "458b5ff63ced4f4e2f6205b0c372c67d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "458b5ff63ced4f4e2f6205b0c372c67d");
            return;
        }
        if (!a2.a()) {
            a2.e = str;
            a2.c = Privacy.createWifiManager(com.meituan.msi.a.f(), a2.e);
            if (a2.c != null) {
                a2.d = a2.c.getConnectionInfo() != null;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.wifi.STATE_CHANGE");
                intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
                intentFilter.addAction("android.net.wifi.supplicant.STATE_CHANGE");
                com.meituan.msi.a.f().registerReceiver(a2.g, intentFilter);
                msiContext.onSuccess(null);
                try {
                    a2.b(a2.c);
                } catch (Exception unused) {
                    com.meituan.msi.log.a.a("wifi startScan fail");
                }
            } else {
                msiContext.onError("wifiManager is null");
            }
        } else {
            msiContext.onSuccess(null);
        }
    }

    @MsiApiMethod(name = "stopWifi", request = WifiParam.class)
    public synchronized void stopWifi(WifiParam wifiParam, MsiContext msiContext) {
        Object[] objArr = {wifiParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60d343afb9ab5e4109dc1ef071c33a2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60d343afb9ab5e4109dc1ef071c33a2c");
            return;
        }
        MSIWifiImplement a2 = a(wifiParam);
        if (a2 != null) {
            a2.a(msiContext);
        } else {
            msiContext.onError("not invoke startWifi");
        }
    }

    @MsiApiMethod(name = "getWifiList", request = WifiParam.class, response = WifiListEvent.class)
    public synchronized void getWifiList(WifiParam wifiParam, MsiContext msiContext) {
        Object[] objArr = {wifiParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "322a901f50d33f9a8bbbea6441b653e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "322a901f50d33f9a8bbbea6441b653e5");
            return;
        }
        MSIWifiImplement a2 = a(wifiParam);
        if (a2 != null) {
            Object[] objArr2 = {msiContext};
            ChangeQuickRedirect changeQuickRedirect2 = MSIWifiImplement.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "67849140460d8ba031dbdde93d190231", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "67849140460d8ba031dbdde93d190231");
            } else if (a2.a()) {
                if (3 != a2.c.getWifiState()) {
                    msiContext.onError("wifi is disable");
                } else {
                    if (a2.f == null || a2.f.isEmpty()) {
                        a2.b(a2.c);
                        a2.f = a2.a(a2.c);
                    }
                    if (a2.f != null) {
                        msiContext.onSuccess(null);
                        ArrayList arrayList = new ArrayList();
                        for (ScanResult scanResult : a2.f) {
                            WifiInfoDetail wifiInfoDetail = new WifiInfoDetail();
                            wifiInfoDetail.SSID = scanResult.SSID;
                            wifiInfoDetail.BSSID = scanResult.BSSID;
                            wifiInfoDetail.secure = !TextUtils.equals("OPEN", a2.a(scanResult.capabilities));
                            wifiInfoDetail.signalStrength = WifiManager.calculateSignalLevel(scanResult.level, 100);
                            arrayList.add(wifiInfoDetail);
                        }
                        WifiListEvent wifiListEvent = new WifiListEvent();
                        wifiListEvent.wifiList = arrayList;
                        msiContext.dispatchEvent("onGetWifiList", wifiListEvent);
                    } else {
                        msiContext.onError("scanResults is null");
                    }
                }
            } else {
                msiContext.onError("not invoke startWifi");
            }
        } else {
            msiContext.onError("not invoke startWifi");
        }
    }

    @MsiApiMethod(name = "getConnectedWifi", request = WifiParam.class, response = WifiInfoEvent.class)
    public synchronized void getConnectedWifi(WifiParam wifiParam, MsiContext msiContext) {
        Object[] objArr = {wifiParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f818276bbe6ad29e2e5297b10850b2fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f818276bbe6ad29e2e5297b10850b2fe");
            return;
        }
        MSIWifiImplement a2 = a(wifiParam);
        if (a2 != null) {
            Object[] objArr2 = {msiContext};
            ChangeQuickRedirect changeQuickRedirect2 = MSIWifiImplement.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "820efadccc8b25cf1ef9bc67f3778314", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "820efadccc8b25cf1ef9bc67f3778314");
            } else if (!a2.a()) {
                msiContext.onError("not invoke startWifi");
            } else if (3 != a2.c.getWifiState()) {
                msiContext.onError("wifi is disable");
            } else {
                WifiInfo connectionInfo = a2.c.getConnectionInfo();
                if (connectionInfo != null) {
                    if (-1 != connectionInfo.getNetworkId()) {
                        String a3 = a2.a(connectionInfo);
                        String bssid = connectionInfo.getBSSID();
                        WifiInfoDetail wifiInfoDetail = new WifiInfoDetail();
                        wifiInfoDetail.SSID = a3;
                        wifiInfoDetail.BSSID = bssid;
                        wifiInfoDetail.secure = !TextUtils.equals("OPEN", a2.a(a3, bssid));
                        wifiInfoDetail.signalStrength = WifiManager.calculateSignalLevel(connectionInfo.getRssi(), 100);
                        WifiInfoEvent wifiInfoEvent = new WifiInfoEvent();
                        wifiInfoEvent.wifi = wifiInfoDetail;
                        msiContext.onSuccess(wifiInfoEvent);
                    } else {
                        msiContext.onError("no wifi is connected");
                    }
                } else {
                    msiContext.onError("currentWifi is null");
                }
            }
        } else {
            msiContext.onError("not invoke startWifi");
        }
    }

    @MsiApiMethod(name = "connectWifi", request = WifiParam.class)
    public synchronized void connectWifi(WifiParam wifiParam, MsiContext msiContext) {
        Object[] objArr = {wifiParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ee0fe4951980f621bba70f8844c135e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ee0fe4951980f621bba70f8844c135e");
        } else if (Build.VERSION.SDK_INT >= 29) {
            Intent intent = new Intent();
            try {
                if (Build.VERSION.SDK_INT >= 11) {
                    intent.setClassName("com.android.settings", "com.android.settings.Settings$WifiSettingsActivity");
                } else {
                    intent.setClassName("com.android.settings", "com.android.settings.wifi.WifiSettings");
                }
                msiContext.startActivityForResult(intent, -1);
            } catch (Exception unused) {
                msiContext.onError("open fail");
            }
        } else {
            MSIWifiImplement a2 = a(wifiParam);
            if (a2 != null) {
                a2.a(wifiParam, msiContext);
            } else {
                msiContext.onError("not invoke startWifi");
            }
        }
    }

    @Override // com.meituan.msi.api.l
    public final String[] a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffe4553a31e5876ebf08a0c0e6b1b810", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffe4553a31e5876ebf08a0c0e6b1b810");
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if ("getWifiList".equals(str) || "startWifi".equals(str) || "connectWifi".equals(str) || "getConnectedWifi".equals(str)) {
                return new String[]{"Locate.once"};
            }
            return null;
        }
        return null;
    }

    private synchronized MSIWifiImplement a(WifiParam wifiParam, MsiContext msiContext) {
        String str;
        Object[] objArr = {wifiParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d94ae357a9cc98571071f5e3eb40433", RobustBitConfig.DEFAULT_VALUE)) {
            return (MSIWifiImplement) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d94ae357a9cc98571071f5e3eb40433");
        }
        if (wifiParam._mt == null) {
            str = "msi1234";
        } else {
            str = TextUtils.isEmpty(wifiParam._mt.sceneToken) ? "msi1234" : wifiParam._mt.sceneToken;
        }
        this.b = str;
        if (!this.c.containsKey(this.b)) {
            this.c.put(this.b, new MSIWifiImplement(msiContext.getEventDispatcher()));
        }
        return this.c.get(this.b);
    }

    private synchronized MSIWifiImplement a(WifiParam wifiParam) {
        String str;
        Object[] objArr = {wifiParam};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b009ecf4d10bbae893a3f19f03f6df55", RobustBitConfig.DEFAULT_VALUE)) {
            return (MSIWifiImplement) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b009ecf4d10bbae893a3f19f03f6df55");
        }
        if (wifiParam._mt == null) {
            str = "msi1234";
        } else {
            str = TextUtils.isEmpty(wifiParam._mt.sceneToken) ? "msi1234" : wifiParam._mt.sceneToken;
        }
        this.b = str;
        if (this.c.containsKey(this.b)) {
            return this.c.get(this.b);
        }
        return null;
    }

    private synchronized void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c27a5edcab08061a659bebb84e656b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c27a5edcab08061a659bebb84e656b4");
            return;
        }
        if (this.c != null && this.c.size() > 0) {
            for (String str : this.c.keySet()) {
                MSIWifiImplement mSIWifiImplement = this.c.get(str);
                if (mSIWifiImplement != null) {
                    mSIWifiImplement.a((MsiContext) null);
                }
            }
            this.c.clear();
        }
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98610cb4b9da0d17361c9a8c02d55f59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98610cb4b9da0d17361c9a8c02d55f59");
        } else {
            e();
        }
    }
}
