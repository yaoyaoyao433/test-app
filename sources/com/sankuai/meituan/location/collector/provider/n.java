package com.sankuai.meituan.location.collector.provider;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.telephony.CellLocation;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.text.TextUtils;
import com.meituan.android.common.locate.platform.sniffer.c;
import com.meituan.android.common.locate.reporter.s;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.android.privacy.interfaces.MtTelephonyManager;
import com.meituan.android.privacy.interfaces.MtWifiManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.shortcut.ShortcutUtils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public final class n {
    public static ChangeQuickRedirect a = null;
    public static String b = "WifiRadioScaner ";
    private static long i = 30000;
    public final String c;
    public MtWifiManager d;
    public b e;
    public Context f;
    public List<a> g;
    public Handler h;
    private PhoneStateListener j;
    private com.sankuai.meituan.location.collector.utils.k k;
    private long l;
    private long m;
    private long n;

    /* loaded from: classes4.dex */
    public interface a {
        void a();

        void a(SignalStrength signalStrength);

        void b();

        void c();

        void d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b extends BroadcastReceiver {
        public static ChangeQuickRedirect a;

        public b() {
            Object[] objArr = {n.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c8513dee3fa5db1be6048413cf90120", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c8513dee3fa5db1be6048413cf90120");
            }
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            boolean z = false;
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d04d73ee090e889caa42e6c630ebee1c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d04d73ee090e889caa42e6c630ebee1c");
                return;
            }
            com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_trigger_entrance", "WifiRadioScaner_onReceive"));
            com.sankuai.meituan.location.collector.reporter.c.a().k++;
            if (n.this.h == null) {
                LogUtils.a(n.b + "WifiReceiver handler null");
            } else if (intent == null || TextUtils.isEmpty(intent.getAction())) {
                LogUtils.a(n.b + "intent or its action is null");
            } else if (n.this.d == null) {
                LogUtils.a(n.b + "mainWifi is null");
            } else {
                String action = intent.getAction();
                if (!"android.net.wifi.SCAN_RESULTS".equals(action) && !"android.net.wifi.WIFI_STATE_CHANGED".equals(action)) {
                    LogUtils.a(n.b + "action content is :" + action);
                    return;
                }
                LogUtils.a(n.b + "in WifiReceiver " + intent.getAction());
                if ("android.net.wifi.WIFI_STATE_CHANGED".equals(action)) {
                    try {
                        int wifiState = n.this.d.getWifiState();
                        LogUtils.a(n.b + "wifi state :" + wifiState);
                        if (wifiState == 1 || wifiState == 0 || wifiState == 4) {
                            z = true;
                        }
                    } catch (Throwable th) {
                        LogUtils.a(n.b + "exception: " + th.getMessage());
                    }
                }
                Message obtainMessage = n.this.h.obtainMessage();
                if (z) {
                    obtainMessage.what = 13;
                    n.this.h.sendMessage(obtainMessage);
                } else if ("android.net.wifi.SCAN_RESULTS".equals(action)) {
                    obtainMessage.what = 12;
                    n.this.h.sendMessage(obtainMessage);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    class c extends PhoneStateListener {
        public static ChangeQuickRedirect a;

        private c() {
            Object[] objArr = {n.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f11157f796e8db989cb963631e6de20c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f11157f796e8db989cb963631e6de20c");
            }
        }

        @Override // android.telephony.PhoneStateListener
        public final void onCellLocationChanged(CellLocation cellLocation) {
            Object[] objArr = {cellLocation};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1d7eb46e014279b87a160d4123cae64", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1d7eb46e014279b87a160d4123cae64");
                return;
            }
            super.onCellLocationChanged(cellLocation);
            com.meituan.android.common.locate.api.a.a("onCellLocationChanged_coll", 1);
            com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_perm_count", " onCellLocationChanged_coll"));
            com.sankuai.meituan.location.collector.reporter.c.a().i++;
            if (SystemClock.elapsedRealtime() - n.this.m < s.a().i) {
                return;
            }
            n.this.m = SystemClock.elapsedRealtime();
            com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_trigger_entrance", "WifiRadioScaner_onCellLocationChanged"));
            if (n.this.h == null) {
                LogUtils.a(n.b + "onCellLocationChanged handler null");
                return;
            }
            LogUtils.a(n.b + "in onCellLocationChanged");
            Message obtainMessage = n.this.h.obtainMessage();
            obtainMessage.what = 10;
            n.this.h.sendMessage(obtainMessage);
        }

        @Override // android.telephony.PhoneStateListener
        public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
            Object[] objArr = {signalStrength};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d358219f0b9b61418b61289561c6d3a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d358219f0b9b61418b61289561c6d3a");
                return;
            }
            super.onSignalStrengthsChanged(signalStrength);
            long elapsedRealtime = SystemClock.elapsedRealtime() - n.this.l;
            com.sankuai.meituan.location.collector.reporter.c.a().j++;
            if (elapsedRealtime < s.a().j) {
                return;
            }
            n.this.l = SystemClock.elapsedRealtime();
            com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_trigger_entrance", "WifiRadioScaner_onSignalStrengthsChanged"));
            if (n.this.h == null) {
                LogUtils.a(n.b + "onSignalStrengthsChanged handler null");
                return;
            }
            LogUtils.a(n.b + "in onSignalStrengthsChanged");
            Message obtainMessage = n.this.h.obtainMessage();
            obtainMessage.what = 11;
            Bundle bundle = new Bundle();
            bundle.putParcelable("signalStrengthsChangedStr", signalStrength);
            obtainMessage.setData(bundle);
            n.this.h.sendMessage(obtainMessage);
        }
    }

    private long a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fad06b0f7117205041c6f925ddaf4850", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fad06b0f7117205041c6f925ddaf4850")).longValue();
        }
        if (j < 10 || j > 60) {
            return 30000L;
        }
        return j * 1000;
    }

    public static void a(MtWifiManager mtWifiManager, Context context) {
        Object[] objArr = {mtWifiManager, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6f580545f158137f1d6a5c0bc8f4acb9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6f580545f158137f1d6a5c0bc8f4acb9");
        } else if (mtWifiManager == null || context == null || Build.VERSION.SDK_INT <= 17) {
        } else {
            ContentResolver contentResolver = context.getContentResolver();
            Object[] objArr2 = {contentResolver, "wifi_scan_always_enabled"};
            Class<?>[] clsArr = {ContentResolver.class, String.class};
            try {
                Class<?> cls = Class.forName("android.provider.Settings$Global");
                Method declaredMethod = cls.getDeclaredMethod("getInt", clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                if (((Integer) declaredMethod.invoke(null, objArr2)).intValue() == 0) {
                    Object[] objArr3 = {contentResolver, "wifi_scan_always_enabled", 1};
                    Method declaredMethod2 = cls.getDeclaredMethod("putInt", ContentResolver.class, String.class, Integer.TYPE);
                    if (!declaredMethod2.isAccessible()) {
                        declaredMethod2.setAccessible(true);
                    }
                    declaredMethod2.invoke(null, objArr3);
                }
            } catch (Exception e) {
                LogUtils.a("enableWifiAlwaysScan invoke error: " + e.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c3c4c8d7223ca0c9dc4fb4c42247a21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c3c4c8d7223ca0c9dc4fb4c42247a21");
            return;
        }
        i = a(com.meituan.android.common.locate.reporter.f.b().getLong("coll_wifi_interval", 23000L));
        if (this.k != null) {
            this.k.a(i * 10);
        }
    }

    public final synchronized void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc7c7486c0ec4908332074952b12ab93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc7c7486c0ec4908332074952b12ab93");
        } else if (this.g != null) {
            this.g.add(aVar);
        } else {
            LogUtils.a(b + "addListener listeners null");
        }
    }

    public n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48625eed2ae879298a1d52b9cc96c898", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48625eed2ae879298a1d52b9cc96c898");
            return;
        }
        this.c = "signalStrengthsChangedStr";
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = new ArrayList();
        this.l = 0L;
        this.m = 0L;
        this.n = 0L;
        this.h = new Handler() { // from class: com.sankuai.meituan.location.collector.provider.n.2
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2fc26b22fffa8b5585da450410a21ab9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2fc26b22fffa8b5585da450410a21ab9");
                    return;
                }
                super.handleMessage(message);
                n nVar = n.this;
                try {
                    int i2 = message.what;
                    if (nVar.g == null) {
                        LogUtils.a(n.b + "handleMessage listeners null, id " + i2);
                        return;
                    }
                    LogUtils.a(n.b + "handleMessage id " + i2);
                    switch (i2) {
                        case 10:
                            for (a aVar : nVar.g) {
                                aVar.a();
                            }
                            return;
                        case 11:
                            Bundle data = message.getData();
                            nVar.getClass();
                            SignalStrength signalStrength = (SignalStrength) data.getParcelable("signalStrengthsChangedStr");
                            for (a aVar2 : nVar.g) {
                                aVar2.a(signalStrength);
                            }
                            return;
                        case 12:
                            for (a aVar3 : nVar.g) {
                                aVar3.b();
                            }
                            return;
                        case 13:
                            for (a aVar4 : nVar.g) {
                                aVar4.c();
                            }
                            return;
                        default:
                            return;
                    }
                } catch (Throwable th) {
                    LogUtils.a(th);
                }
            }
        };
        if (com.sankuai.meituan.location.collector.b.c() == null) {
            return;
        }
        try {
            this.j = new c();
        } catch (Throwable th) {
            LogUtils.a(getClass(), th);
        }
        this.f = com.sankuai.meituan.location.collector.b.c();
        this.d = Privacy.createWifiManager(this.f, "pt-c140c5921e4d3392");
        this.e = new b();
        com.sankuai.meituan.location.collector.utils.k a2 = new com.sankuai.meituan.location.collector.utils.k().a(i * 10);
        a2.b = new Runnable() { // from class: com.sankuai.meituan.location.collector.provider.n.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "253d2f43716153a8063424c492c5330e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "253d2f43716153a8063424c492c5330e");
                    return;
                }
                n.this.d();
                CellLocation.requestLocationUpdate();
                com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_trigger_entrance", "WifiRadioScaner_run"));
            }
        };
        this.k = a2;
        d();
    }

    public final synchronized void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e49832372d113f043ae3fc25eb1d542", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e49832372d113f043ae3fc25eb1d542");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a4cd0b687f539c56062e53af6ddc304a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a4cd0b687f539c56062e53af6ddc304a");
        } else {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            this.f.registerReceiver(this.e, intentFilter);
            LogUtils.a("registerReceiver WifiRadioScanner registerWifiAndCellScanResultReceiver WifiReceiver");
            MtTelephonyManager createTelephonyManager = Privacy.createTelephonyManager(this.f, "pt-c140c5921e4d3392");
            if (createTelephonyManager != null) {
                createTelephonyManager.listen(this.j, ShortcutUtils.SHORTCUT_TYPE_ENABLE);
            }
        }
        this.k.b();
    }

    public final synchronized void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a330035d6d189171c5416b31eae32938", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a330035d6d189171c5416b31eae32938");
            return;
        }
        this.k.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "565743858e9758fc9142ba8a19ee6565", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "565743858e9758fc9142ba8a19ee6565");
            return;
        }
        try {
            if (this.e != null) {
                try {
                    this.f.unregisterReceiver(this.e);
                } catch (Throwable th) {
                    LogUtils.a(getClass(), th);
                }
                this.e = null;
                if (this.g != null) {
                    for (a aVar : this.g) {
                        aVar.d();
                    }
                }
            }
        } catch (Exception e) {
            LogUtils.a(b + "unregisterReceiver exception: " + e.getMessage());
        }
        if (this.f != null) {
            MtTelephonyManager createTelephonyManager = Privacy.createTelephonyManager(this.f, "pt-c140c5921e4d3392");
            if (this.j != null && createTelephonyManager != null) {
                createTelephonyManager.listen(this.j, 0);
            }
            LogUtils.a(b + "stop and unregisterReceiver");
        }
    }
}
