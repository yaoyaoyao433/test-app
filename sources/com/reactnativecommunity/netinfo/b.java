package com.reactnativecommunity.netinfo;

import android.net.ConnectivityManager;
import android.net.wifi.WifiInfo;
import android.os.Build;
import android.support.v4.net.ConnectivityManagerCompat;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.meituan.android.common.locate.api.MtTelephonyManager;
import com.meituan.android.common.locate.api.MtWifiManager;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.mrn.horn.f;
import com.meituan.robust.common.CommonConstant;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Locale;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class b {
    final ConnectivityManager a;
    final ReactApplicationContext b;
    @Nonnull
    private com.reactnativecommunity.netinfo.types.b c = com.reactnativecommunity.netinfo.types.b.UNKNOWN;
    @Nullable
    private com.reactnativecommunity.netinfo.types.a d = null;
    private boolean e = false;
    private Boolean f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(ReactApplicationContext reactApplicationContext) {
        this.b = reactApplicationContext;
        this.a = (ConnectivityManager) reactApplicationContext.getSystemService("connectivity");
    }

    public void a(@Nullable String str, String str2, Promise promise) {
        promise.resolve(a(str, str2));
    }

    public void a(boolean z) {
        this.f = Boolean.valueOf(z);
        a(this.c, this.d, this.e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(@Nonnull com.reactnativecommunity.netinfo.types.b bVar, @Nullable com.reactnativecommunity.netinfo.types.a aVar, boolean z) {
        if (this.f != null) {
            z = this.f.booleanValue();
        }
        boolean z2 = bVar != this.c;
        boolean z3 = aVar != this.d;
        boolean z4 = z != this.e;
        if (z2 || z3 || z4) {
            this.c = bVar;
            this.d = aVar;
            this.e = z;
            c();
        }
    }

    private void c() {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.b.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("netInfo.networkStatusDidChange", a(null, f.a().a(this.b)));
    }

    private WritableMap a(@Nullable String str, String str2) {
        WritableMap createMap = Arguments.createMap();
        MtWifiManager mtWifiManager = new MtWifiManager(this.b, str2);
        MtTelephonyManager mtTelephonyManager = new MtTelephonyManager(this.b, str2);
        if (d.a(this.b)) {
            createMap.putBoolean("isWifiEnabled", mtWifiManager.isWifiEnabled());
        }
        createMap.putString("type", str != null ? str : this.c.i);
        boolean z = true;
        boolean z2 = (this.c.equals(com.reactnativecommunity.netinfo.types.b.NONE) || this.c.equals(com.reactnativecommunity.netinfo.types.b.UNKNOWN)) ? false : true;
        createMap.putBoolean("isConnected", z2);
        if (!this.e || (str != null && !str.equals(this.c.i))) {
            z = false;
        }
        createMap.putBoolean("isInternetReachable", z);
        if (str == null) {
            str = this.c.i;
        }
        WritableMap a = a(str, mtWifiManager, mtTelephonyManager);
        if (z2) {
            a.putBoolean("isConnectionExpensive", ConnectivityManagerCompat.isActiveNetworkMetered(this.a));
        }
        createMap.putMap("details", a);
        return createMap;
    }

    private WritableMap a(@Nonnull String str, MtWifiManager mtWifiManager, MtTelephonyManager mtTelephonyManager) {
        char c;
        WifiInfo connectionInfo;
        WritableMap createMap = Arguments.createMap();
        int hashCode = str.hashCode();
        if (hashCode != -916596374) {
            if (hashCode == 3649301 && str.equals("wifi")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("cellular")) {
                c = 0;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
                if (this.d != null) {
                    createMap.putString("cellularGeneration", this.d.d);
                }
                String networkOperatorName = mtTelephonyManager.getNetworkOperatorName();
                if (networkOperatorName != null) {
                    createMap.putString("carrier", networkOperatorName);
                    break;
                }
                break;
            case 1:
                if (d.a(this.b) && (connectionInfo = mtWifiManager.getConnectionInfo()) != null) {
                    try {
                        String ssid = connectionInfo.getSSID();
                        if (ssid != null && !ssid.contains("<unknown ssid>")) {
                            createMap.putString(Constants.PRIVACY.KEY_SSID, ssid.replace(CommonConstant.Symbol.DOUBLE_QUOTES, ""));
                        }
                    } catch (Exception unused) {
                    }
                    try {
                        String bssid = connectionInfo.getBSSID();
                        if (bssid != null) {
                            createMap.putString(Constants.Environment.KEY_BSSID, bssid);
                        }
                    } catch (Exception unused2) {
                    }
                    try {
                        createMap.putInt("strength", mtWifiManager.calculateSignalLevel(connectionInfo.getRssi(), 100));
                    } catch (Exception unused3) {
                    }
                    try {
                        if (Build.VERSION.SDK_INT >= 21) {
                            createMap.putInt("frequency", connectionInfo.getFrequency());
                        }
                    } catch (Exception unused4) {
                    }
                    try {
                        byte[] byteArray = BigInteger.valueOf(connectionInfo.getIpAddress()).toByteArray();
                        d.a(byteArray);
                        createMap.putString("ipAddress", InetAddress.getByAddress(byteArray).getHostAddress());
                    } catch (Exception unused5) {
                    }
                    try {
                        byte[] byteArray2 = BigInteger.valueOf(connectionInfo.getIpAddress()).toByteArray();
                        d.a(byteArray2);
                        int networkPrefixLength = (-1) << (32 - NetworkInterface.getByInetAddress(InetAddress.getByAddress(byteArray2)).getInterfaceAddresses().get(1).getNetworkPrefixLength());
                        createMap.putString("subnet", String.format(Locale.US, "%d.%d.%d.%d", Integer.valueOf((networkPrefixLength >> 24) & 255), Integer.valueOf((networkPrefixLength >> 16) & 255), Integer.valueOf((networkPrefixLength >> 8) & 255), Integer.valueOf(networkPrefixLength & 255)));
                        break;
                    } catch (Exception unused6) {
                        break;
                    }
                }
                break;
        }
        return createMap;
    }
}
