package com.meituan.android.common.locate.wifi;

import android.net.wifi.ScanResult;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.android.common.locate.util.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* loaded from: classes2.dex */
    public static class a implements b {
        public static ChangeQuickRedirect changeQuickRedirect;
        private long a;
        private int b;

        public a(long j, int i) {
            Object[] objArr = {new Long(j), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99cbbe93228029b390286e3bf69a1823", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99cbbe93228029b390286e3bf69a1823");
                return;
            }
            this.a = j;
            this.b = i;
        }

        @Override // com.meituan.android.common.locate.wifi.b
        public long a() {
            return this.a;
        }

        @Override // com.meituan.android.common.locate.wifi.b
        public int b() {
            return this.b;
        }
    }

    public static synchronized void a(List<ScanResult> list) {
        synchronized (c.class) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1310841cd4cdff3bfda59faf6dcb3bc4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1310841cd4cdff3bfda59faf6dcb3bc4");
                return;
            }
            LogUtils.a("updateWifis[all]", list);
            if (list != null && !list.isEmpty()) {
                ArrayList arrayList = new ArrayList(list.size());
                for (ScanResult scanResult : list) {
                    arrayList.add(new a(s.b(scanResult.BSSID), scanResult.level));
                }
                com.meituan.android.common.locate.wifi.a.a().a(arrayList);
            }
        }
    }
}
