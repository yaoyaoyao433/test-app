package com.sankuai.meituan.location.collector;

import android.content.BroadcastReceiver;
import android.os.Handler;
import android.os.Message;
import com.meituan.android.common.locate.reporter.f;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.location.collector.locator.d;
import com.sankuai.meituan.location.collector.provider.j;
import com.sankuai.meituan.location.collector.provider.m;
import com.sankuai.meituan.location.collector.provider.n;
import com.sankuai.meituan.location.collector.utils.k;
import java.lang.ref.WeakReference;
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a = null;
    private static long i = 300000;
    d b;
    d c;
    j d;
    n e;
    m f;
    a g;
    BroadcastReceiver h;
    private boolean j;
    private k k;

    /* loaded from: classes4.dex */
    public class a extends Handler {
        public static ChangeQuickRedirect a;
        public WeakReference<c> b;

        public a(c cVar) {
            Object[] objArr = {c.this, cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f052e1a0b5b527ab55117310f946704", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f052e1a0b5b527ab55117310f946704");
            } else {
                this.b = new WeakReference<>(cVar);
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e457865b561767b221689ab190714173", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e457865b561767b221689ab190714173");
                return;
            }
            super.handleMessage(message);
            c cVar = this.b.get();
            if (cVar == null) {
                LogUtils.a("LocationCollectorMananger  MyHandler is null");
            } else if (message.what != 1) {
            } else {
                LogUtils.a("LocationCollectorMananger  MyHandler handleMessage : 1");
                c.c(cVar);
            }
        }
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3260f2c026cb9c1dad6def28d74de539", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3260f2c026cb9c1dad6def28d74de539");
            return;
        }
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = new a(this);
        this.j = false;
        this.h = null;
        k kVar = new k();
        kVar.b = new Runnable() { // from class: com.sankuai.meituan.location.collector.c.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "77bd3a6a41094d0ac5502d4c7c2a271d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "77bd3a6a41094d0ac5502d4c7c2a271d");
                    return;
                }
                c.a(c.this);
                LogUtils.a("LocationCollectorManager stopScan");
                c.this.k.a();
            }
        };
        this.k = kVar;
    }

    public static /* synthetic */ void a(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "769cf3c3ac754a7b6fffedd7364da819", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "769cf3c3ac754a7b6fffedd7364da819");
        } else if (cVar.j) {
            LogUtils.a("LocationCollectorMananger stopWifiAndCellScan");
            if (cVar.e == null) {
                LogUtils.a("LocationCollectorMananger  wifiRadioScanner is null");
                return;
            }
            cVar.e.b();
            cVar.k.a();
            cVar.j = false;
        }
    }

    public static /* synthetic */ void c(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "6cd4853f8f2ba39ccfc87e63b598d6ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "6cd4853f8f2ba39ccfc87e63b598d6ab");
        } else if (!cVar.j) {
            LogUtils.a("LocationCollectorMananger startWifiAndCellScan");
            if (cVar.e == null) {
                LogUtils.a("LocationCollectorMananger  wifiRadioScanner is null");
                return;
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            long j = 300000;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2f013bc16b944bd67b92334b6ad484bb", RobustBitConfig.DEFAULT_VALUE)) {
                j = ((Long) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2f013bc16b944bd67b92334b6ad484bb")).longValue();
            } else if (b.c() != null) {
                long j2 = f.b().getLong("coll_wifiscan_duration", 300000L);
                if (j2 <= 0) {
                    i = 300000L;
                } else {
                    i = j2;
                }
                j = j2;
            }
            LogUtils.a("LocationCollectorMananger wifi scan duration time:" + j);
            cVar.k.a(j);
            k kVar = cVar.k;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = k.a;
            if (PatchProxy.isSupport(objArr3, kVar, changeQuickRedirect3, false, "cb798299f675a8cb9f71e051240ee467", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, kVar, changeQuickRedirect3, false, "cb798299f675a8cb9f71e051240ee467");
            } else {
                kVar.i = true;
                long j3 = kVar.d;
                Object[] objArr4 = {new Long(j3)};
                ChangeQuickRedirect changeQuickRedirect4 = k.a;
                if (PatchProxy.isSupport(objArr4, kVar, changeQuickRedirect4, false, "75853ab949a15224abb3a977c0e1aa4c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, kVar, changeQuickRedirect4, false, "75853ab949a15224abb3a977c0e1aa4c");
                } else {
                    kVar.i = true;
                    if (kVar.e.hasMessages(1)) {
                        kVar.e.removeMessages(1);
                    }
                    kVar.e.sendEmptyMessageDelayed(1, j3);
                }
            }
            cVar.e.a();
            n nVar = cVar.e;
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = n.a;
            if (PatchProxy.isSupport(objArr5, nVar, changeQuickRedirect5, false, "ececdd7677c8653a123098f8961acc08", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, nVar, changeQuickRedirect5, false, "ececdd7677c8653a123098f8961acc08");
            } else {
                try {
                    n.a(nVar.d, nVar.f);
                    LogUtils.a(n.b + "enableWifiAlwaysScan success");
                } catch (Throwable th) {
                    LogUtils.a(n.b + "enableWifiAlwaysScan error: " + th.getMessage());
                }
            }
            cVar.j = true;
        }
    }
}
