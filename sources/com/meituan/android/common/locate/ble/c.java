package com.meituan.android.common.locate.ble;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.os.Build;
import android.os.Handler;
import android.os.ParcelUuid;
import android.support.annotation.RequiresApi;
import com.alipay.sdk.app.PayTask;
import com.meituan.android.common.locate.provider.g;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.android.common.locate.util.n;
import com.meituan.android.privacy.interfaces.MtBluetoothAdapter;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
@RequiresApi(api = 21)
/* loaded from: classes2.dex */
public class c extends ScanCallback {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static c k;
    private MtBluetoothAdapter a;
    private b b;
    private final Runnable c;
    private l d;
    private ScanSettings e;
    private Handler f;
    private int g;
    private boolean h;
    private final Deque<com.meituan.android.common.locate.provider.c> i;
    private final Deque<com.meituan.android.common.locate.provider.c> j;

    /* loaded from: classes2.dex */
    public static class a implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final WeakReference<c> a;

        public a(WeakReference<c> weakReference) {
            Object[] objArr = {weakReference};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4395d3fb842ce9e2b0f25489a106e79c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4395d3fb842ce9e2b0f25489a106e79c");
            } else {
                this.a = weakReference;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4d381ff638b5eca737cb9b03b4c90d18", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4d381ff638b5eca737cb9b03b4c90d18");
                return;
            }
            if (this.a != null) {
                c cVar = this.a.get();
                if (cVar == null) {
                    LogUtils.a("MtBLEInfoProvider-> BLEScanRunnable run: mtBLEInfoProvider is null");
                    return;
                } else if (!cVar.h) {
                    try {
                        LogUtils.a("MtBLEInfoProvider -> BLEScanRunnable -> run -> startScan");
                        if (cVar.d != null) {
                            cVar.d.a(null, cVar.e, cVar);
                        }
                        cVar.h = true;
                        return;
                    } catch (Exception e) {
                        LogUtils.a("MtBLEInfoProvider -> BLEScanRunnable -> run -> startScan, exception: " + e.getMessage());
                        cVar.f.removeCallbacksAndMessages(null);
                        cVar.f.postDelayed(cVar.c, PayTask.j);
                        return;
                    }
                } else {
                    str = "MtBLEInfoProvider-> BLEScanRunnable run: isScanning";
                }
            } else {
                str = "MtBLEInfoProvider-> BLEScanRunnable run: mWRBLEInfoProvider is null";
            }
            LogUtils.a(str);
        }
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be045889fc069098739fb8b705209d6b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be045889fc069098739fb8b705209d6b");
            return;
        }
        this.g = 0;
        this.h = false;
        this.i = new LinkedList();
        this.j = new LinkedList();
        this.c = new a(new WeakReference(this));
    }

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3848d66401c5f4d5947cf9172813c42b", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3848d66401c5f4d5947cf9172813c42b");
        }
        if (k == null) {
            synchronized (c.class) {
                if (k == null) {
                    k = new c();
                }
            }
        }
        return k;
    }

    private void a(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        boolean z = true;
        Object[] objArr = {bluetoothDevice, Integer.valueOf(i), bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c33cfe753dfb92942b8df116cadd9349", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c33cfe753dfb92942b8df116cadd9349");
            return;
        }
        int i2 = 2;
        while (i2 <= 5) {
            int i3 = i2 + 3;
            try {
                if (i3 >= bArr.length) {
                    break;
                } else if ((bArr[i2 + 2] & 255) == 2 && (bArr[i3] & 255) == 21) {
                    break;
                } else {
                    i2++;
                }
            } catch (Throwable th) {
                LogUtils.a(th);
                return;
            }
        }
        z = false;
        if (z) {
            a(bluetoothDevice, i, bArr, i2);
        } else if (com.meituan.android.common.locate.reporter.a.a(g.a()).b()) {
            b(bluetoothDevice, i, bArr);
        }
    }

    private void a(BluetoothDevice bluetoothDevice, int i, byte[] bArr, int i2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Object[] objArr = {bluetoothDevice, Integer.valueOf(i), bArr, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff8d5ec731da94c01e2230e88a2f1904", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff8d5ec731da94c01e2230e88a2f1904");
            return;
        }
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, i2 + 4, bArr2, 0, 16);
        String d = n.d(bArr2);
        String str8 = d.substring(0, 8) + CommonConstant.Symbol.MINUS + d.substring(8, 12) + CommonConstant.Symbol.MINUS + d.substring(12, 16) + CommonConstant.Symbol.MINUS + d.substring(16, 20) + CommonConstant.Symbol.MINUS + d.substring(20, 32);
        int a2 = n.a(bArr[i2 + 20], bArr[i2 + 21]);
        int a3 = n.a(bArr[i2 + 22], bArr[i2 + 23]);
        String address = bluetoothDevice.getAddress();
        byte b = bArr[i2 + 24];
        String str9 = "";
        String str10 = "";
        String str11 = "";
        n a4 = n.a(bArr);
        try {
            str = a4.a();
        } catch (Throwable th) {
            th = th;
            str = "";
        }
        try {
            str2 = a4.d();
            try {
                StringBuilder sb = new StringBuilder();
                if (a4.c() != null) {
                    for (Map.Entry<ParcelUuid, byte[]> entry : a4.c().entrySet()) {
                        sb.append(entry.getKey());
                        sb.append(CommonConstant.Symbol.SINGLE_QUOTES);
                        sb.append(n.c(entry.getValue()));
                        sb.append(CommonConstant.Symbol.COLON);
                    }
                    if (sb.toString().endsWith(CommonConstant.Symbol.COLON)) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                }
                String sb2 = sb.toString();
                try {
                    LogUtils.a("MtBLEInfoProviderparseBeaconInfo is " + sb2);
                    String name = bluetoothDevice.getName();
                    try {
                        String a5 = n.a(bArr, 0, bArr.length);
                        try {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(a4.b());
                            str7 = sb3.toString();
                            str3 = str2;
                            str6 = a5;
                            str5 = sb2;
                            str4 = name;
                        } catch (Throwable th2) {
                            th = th2;
                            str11 = a5;
                            str9 = name;
                            str10 = sb2;
                            LogUtils.a(th);
                            str3 = str2;
                            str4 = str9;
                            str5 = str10;
                            str6 = str11;
                            str7 = "";
                            this.j.add(new com.meituan.android.common.locate.provider.c(System.currentTimeMillis(), address, str8, a2, a3, b, i, str, str4, str3, str5, str6, str7));
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
            str2 = "";
            LogUtils.a(th);
            str3 = str2;
            str4 = str9;
            str5 = str10;
            str6 = str11;
            str7 = "";
            this.j.add(new com.meituan.android.common.locate.provider.c(System.currentTimeMillis(), address, str8, a2, a3, b, i, str, str4, str3, str5, str6, str7));
        }
        this.j.add(new com.meituan.android.common.locate.provider.c(System.currentTimeMillis(), address, str8, a2, a3, b, i, str, str4, str3, str5, str6, str7));
    }

    private synchronized void a(ScanResult scanResult) {
        Object[] objArr = {scanResult};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d31150826c0876403c68da03883a46f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d31150826c0876403c68da03883a46f1");
            return;
        }
        a(scanResult.getDevice(), scanResult.getRssi(), scanResult.getScanRecord().getBytes());
        a(this.j);
        a(this.i);
    }

    private void a(Deque<com.meituan.android.common.locate.provider.c> deque) {
        Object[] objArr = {deque};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c8e43697227a436c909aa84f13327c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c8e43697227a436c909aa84f13327c1");
            return;
        }
        while (deque != null && deque.size() > 0 && System.currentTimeMillis() - deque.getFirst().a > com.meituan.android.common.locate.reporter.a.a(g.a()).c()) {
            deque.removeFirst();
        }
    }

    private void b(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        String str;
        String str2;
        Object[] objArr = {bluetoothDevice, Integer.valueOf(i), bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bef115a0dd681bd9c890a7a087c66ad4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bef115a0dd681bd9c890a7a087c66ad4");
            return;
        }
        String address = bluetoothDevice.getAddress();
        String str3 = "";
        n a2 = n.a(bArr);
        if (a2 == null) {
            return;
        }
        try {
            String d = a2.d();
            try {
                str = bluetoothDevice.getName();
                str2 = d;
            } catch (Throwable th) {
                th = th;
                str3 = d;
                LogUtils.a(th);
                str = "";
                str2 = str3;
                this.i.add(new com.meituan.android.common.locate.provider.c(System.currentTimeMillis(), address, null, -1, -1, -1, i, null, str, str2, null, null, null));
            }
        } catch (Throwable th2) {
            th = th2;
        }
        this.i.add(new com.meituan.android.common.locate.provider.c(System.currentTimeMillis(), address, null, -1, -1, -1, i, null, str, str2, null, null, null));
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "98307271d4b94e10aec6698049013f70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "98307271d4b94e10aec6698049013f70");
            return;
        }
        ScanSettings.Builder scanMode = new ScanSettings.Builder().setScanMode(1);
        if (Build.VERSION.SDK_INT >= 26) {
            scanMode.setLegacy(false);
        }
        this.e = scanMode.build();
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce6ca4cbbfdc6faf06951741fa047889", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce6ca4cbbfdc6faf06951741fa047889");
        } else if (this.a != null) {
        } else {
            this.a = Privacy.createBluetoothAdapter("pt-c140c5921e4d3392");
            if (this.a == null) {
                return;
            }
            f();
            this.d = this.a.getBluetoothLeScanner();
        }
    }

    public synchronized void b() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "800aa56f746b5c53b8ea21404bfb8a05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "800aa56f746b5c53b8ea21404bfb8a05");
        } else if (com.meituan.android.common.locate.reporter.a.a(g.a()).a()) {
            g();
            if (this.a != null && this.a.isEnabled()) {
                LogUtils.a("MtBLEInfoProvider -> startUp");
                com.meituan.android.common.locate.platform.logs.c.a("MtBLEInfoProvider -> startUp", 1);
                if (this.g != 0) {
                    LogUtils.a("MtBLEInfoProvider -> startUp failed cause state has been started");
                    return;
                }
                this.g = 1;
                if (this.b == null) {
                    this.b = new b("ble_info_thread");
                } else {
                    LogUtils.a("MtBLEInfoProvider -> startUp mBLEHandlerThread not null");
                }
                if (this.b.isAlive()) {
                    str = "MtBLEInfoProvider -> startUp isAlive false";
                } else {
                    this.b.start();
                    if (this.f == null) {
                        this.f = new Handler(this.b.b());
                        this.f.removeCallbacksAndMessages(null);
                        this.f.post(this.c);
                        return;
                    }
                    str = "MtBLEInfoProvider -> startUp mBLEHandler not null";
                }
                LogUtils.a(str);
                this.f.removeCallbacksAndMessages(null);
                this.f.post(this.c);
                return;
            }
            this.a = null;
            this.d = null;
        }
    }

    public synchronized void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "857890b566a6072184a2663d47eef4f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "857890b566a6072184a2663d47eef4f8");
        } else if (this.g != 1) {
            LogUtils.a("MtBLEInfoProvider -> shutdown failed cause state has been idle");
        } else {
            LogUtils.a("MtBLEInfoProvider -> shutdown");
            com.meituan.android.common.locate.platform.logs.c.a("MtBLEInfoProvider -> shutdown", 1);
            this.g = 0;
            this.h = false;
            if (!this.b.isAlive()) {
                LogUtils.a("MtBLEInfoProvider -> shutdown failed cause isAlive false");
                return;
            }
            if (this.a != null && this.a.isEnabled() && this.d != null) {
                this.d.a(this);
            }
            this.f.removeCallbacksAndMessages(null);
            this.b.c();
            this.f = null;
            this.b = null;
        }
    }

    public synchronized List<com.meituan.android.common.locate.provider.c> d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "926c3542078ad8df9713c9163a313053", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "926c3542078ad8df9713c9163a313053");
        }
        LogUtils.a("MtBLEInfoProvider -> getBeaconInfoList");
        List arrayList = new ArrayList();
        if (this.j != null && this.j.size() > 0) {
            ArrayList arrayList2 = new ArrayList(new HashSet(this.j));
            Collections.sort(arrayList2, new Comparator<com.meituan.android.common.locate.provider.c>() { // from class: com.meituan.android.common.locate.ble.c.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.util.Comparator
                /* renamed from: a */
                public int compare(com.meituan.android.common.locate.provider.c cVar, com.meituan.android.common.locate.provider.c cVar2) {
                    return cVar2.f - cVar.f;
                }
            });
            arrayList.addAll(arrayList2);
        }
        if (this.i != null && this.i.size() > 0) {
            ArrayList arrayList3 = new ArrayList(new HashSet(this.i));
            Collections.sort(arrayList3, new Comparator<com.meituan.android.common.locate.provider.c>() { // from class: com.meituan.android.common.locate.ble.c.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.util.Comparator
                /* renamed from: a */
                public int compare(com.meituan.android.common.locate.provider.c cVar, com.meituan.android.common.locate.provider.c cVar2) {
                    return cVar2.f - cVar.f;
                }
            });
            arrayList.addAll(arrayList3);
        }
        if (arrayList.size() > 30) {
            arrayList = arrayList.subList(0, 30);
        }
        return arrayList;
    }

    public synchronized int e() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c96cc6abcc9d4e252b77540032b884d8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c96cc6abcc9d4e252b77540032b884d8")).intValue();
        }
        if (this.j != null && this.j.size() > 0) {
            i = 0 + new HashSet(this.j).size();
        }
        if (this.i != null && this.i.size() > 0) {
            i += new HashSet(this.i).size();
        }
        return i;
    }

    @Override // android.bluetooth.le.ScanCallback
    public void onScanFailed(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd40db6bfbe95d1d70c2ac170341cdd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd40db6bfbe95d1d70c2ac170341cdd9");
            return;
        }
        LogUtils.a("MtBLEInfoProvider -> onScanFailed: " + i);
        if (i != 3) {
            return;
        }
        this.f.removeCallbacksAndMessages(null);
        this.f.postDelayed(this.c, PayTask.j);
    }

    @Override // android.bluetooth.le.ScanCallback
    public void onScanResult(int i, ScanResult scanResult) {
        Object[] objArr = {Integer.valueOf(i), scanResult};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ff7f251bcb349a834ff30fd78d02db3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ff7f251bcb349a834ff30fd78d02db3");
            return;
        }
        LogUtils.a("MtBLEInfoProvider -> onScanResult");
        a(scanResult);
    }
}
