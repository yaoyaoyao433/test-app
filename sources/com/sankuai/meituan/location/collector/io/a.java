package com.sankuai.meituan.location.collector.io;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.os.Handler;
import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.android.cipstorage.x;
import com.meituan.android.common.locate.reporter.f;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.android.common.locate.util.p;
import com.meituan.met.mercury.load.bean.DDLoadConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.location.collector.io.util.a;
import com.sankuai.meituan.location.collector.provider.CollectorDataBuilder;
import com.sankuai.meituan.location.collector.utils.k;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes4.dex */
public class a implements f.a {
    public static ChangeQuickRedirect a;
    private static volatile a b;
    private static p j;
    private static long k;
    private static long l;
    private Context c;
    private h d;
    private i e;
    private volatile boolean f;
    private volatile boolean g;
    private Handler h;
    private f i;

    /* renamed from: com.sankuai.meituan.location.collector.io.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0598a extends BroadcastReceiver {
        public static ChangeQuickRedirect a;

        public C0598a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean z = true;
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ca70ffdb4a7378f8f8de421056eaa78", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ca70ffdb4a7378f8f8de421056eaa78");
                return;
            }
            int intExtra = intent.getIntExtra("status", -1);
            if (intExtra != 2 && intExtra != 5) {
                z = false;
            }
            CollectorDataBuilder.a(z);
        }
    }

    /* loaded from: classes4.dex */
    public class b extends BroadcastReceiver {
        public static ChangeQuickRedirect a;

        public b() {
            Object[] objArr = {a.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5daaa6e04c0e616a98dbee54c9cbb75", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5daaa6e04c0e616a98dbee54c9cbb75");
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, final Intent intent) {
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74297fb3ee256ba9d33122f08ae7ab62", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74297fb3ee256ba9d33122f08ae7ab62");
            } else if (a.this.h == null) {
                LogUtils.a("CollectorStoreUploadManager  onReceive workHandler == null ");
            } else {
                a.this.h.post(new Runnable() { // from class: com.sankuai.meituan.location.collector.io.a.b.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4e79a14970db64680817e64f15005cda", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4e79a14970db64680817e64f15005cda");
                        } else if (intent.getAction().equals("android.net.wifi.STATE_CHANGE")) {
                            LogUtils.a("CollectorStoreUploadManager  WifiConnStateReceiver onReceive NETWORK_STATE_CHANGED_ACTION ");
                            if (((NetworkInfo) intent.getParcelableExtra("networkInfo")).getState().equals(NetworkInfo.State.CONNECTED)) {
                                LogUtils.a("CollectorStoreUploadManager  WifiConnStateReceiver onReceive NETWORK_STATE_CHANGED_ACTION routinuework");
                                a.b();
                            }
                        }
                    }
                });
            }
        }
    }

    public static a a(Context context, Handler handler, e eVar) {
        Object[] objArr = {context, handler, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4755b5f1d2a59dce96c6c508f58d3682", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4755b5f1d2a59dce96c6c508f58d3682");
        }
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a(context, handler, eVar);
                }
            }
        }
        return b;
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "01966b304c9422a9a3f41822a3ff9ea8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "01966b304c9422a9a3f41822a3ff9ea8");
            return;
        }
        b.d.a();
        b();
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        aVar.g = false;
        return false;
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "89e49b45e2ebb45adaf6a4a7a4192a61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "89e49b45e2ebb45adaf6a4a7a4192a61");
            return;
        }
        b.c();
        b.f();
    }

    public static /* synthetic */ boolean b(a aVar, boolean z) {
        aVar.f = false;
        return false;
    }

    public static /* synthetic */ long d() {
        long j2 = l;
        l = 1 + j2;
        return j2;
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ba309ba72730d72d216d788a1ecb3d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ba309ba72730d72d216d788a1ecb3d3");
        } else if (this.g) {
        } else {
            this.g = true;
            a(true);
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25625b7f2cec21d5a14f6dd0a4234231", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25625b7f2cec21d5a14f6dd0a4234231");
        } else if (this.f) {
        } else {
            this.f = true;
            a(false);
        }
    }

    @Override // com.meituan.android.common.locate.reporter.f.a
    public void onCollectConfigChange() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98a2b0c7570dc7978f212fd1e569417b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98a2b0c7570dc7978f212fd1e569417b");
            return;
        }
        long j2 = com.meituan.android.common.locate.reporter.f.b().getLong("coll_interval_upload_time", DDLoadConstants.CACHE_MULTIPLE_PROCESS_PROCTECT_TIME);
        if (j2 == k || j2 >= DDLoadConstants.CACHE_MULTIPLE_PROCESS_PROCTECT_TIME) {
            return;
        }
        j.a();
        j.a(j2).b();
        LogUtils.a("coll_interval_upload_time : " + j2);
    }

    @Override // com.meituan.android.common.locate.reporter.f.a
    public void onLocateConfigChange() {
    }

    @Override // com.meituan.android.common.locate.reporter.f.a
    public void onTrackConfigChange() {
    }

    private a(Context context, Handler handler, e eVar) {
        Object[] objArr = {context, handler, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e6c85275b7c3a52807011c3565bb3ca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e6c85275b7c3a52807011c3565bb3ca");
            return;
        }
        this.f = false;
        this.g = false;
        this.c = context;
        this.d = new h(context, handler, eVar);
        this.e = new i(context, this.d, eVar);
        this.h = handler;
        this.i = new f();
        final f fVar = this.i;
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "a1a4d1c43b127fc2930d2121b50afd10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "a1a4d1c43b127fc2930d2121b50afd10");
        } else {
            final File c = d.c(context);
            if (c == null) {
                LogUtils.a("ProcessLockHolder got lock fail:null");
            } else {
                k a2 = new k().a(1000L);
                a2.b = new Runnable() { // from class: com.sankuai.meituan.location.collector.io.f.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "95c6884d4f737bb11a74c52679db4932", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "95c6884d4f737bb11a74c52679db4932");
                            return;
                        }
                        fVar.c = com.sankuai.meituan.location.collector.io.util.a.a(c);
                        if (fVar.c != null) {
                            f.d.countDown();
                            fVar.b.a();
                            str = "ProcessLockHolder got self lock success";
                        } else {
                            str = "ProcessLockHolder got self lock failed,will retry";
                        }
                        LogUtils.a(str);
                    }
                };
                a2.c = new Runnable() { // from class: com.sankuai.meituan.location.collector.io.f.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cf2702aa0360bb3b8214a3949552fba1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cf2702aa0360bb3b8214a3949552fba1");
                        } else if (f.d.getCount() > 0) {
                            f.d.countDown();
                        }
                    }
                };
                Object[] objArr3 = {5L};
                ChangeQuickRedirect changeQuickRedirect3 = k.a;
                if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "49b0559d7d481f25665264d6ee9480d1", RobustBitConfig.DEFAULT_VALUE)) {
                    a2 = (k) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "49b0559d7d481f25665264d6ee9480d1");
                } else {
                    a2.g = 5L;
                    a2.f = true;
                    a2.h = 0L;
                }
                fVar.b = a2;
                fVar.b.b();
            }
        }
        Object[] objArr4 = {context};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9d3bee9bc78bc4802e30f4c6a7a7701b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9d3bee9bc78bc4802e30f4c6a7a7701b");
        } else {
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.wifi.STATE_CHANGE");
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(new b(), intentFilter);
                LogUtils.a("registerReceiver CollectorStoreUploadManager initWifiStateListener WifiConnStateReceiver");
            } catch (Throwable unused) {
            }
        }
        Object[] objArr5 = {context};
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "86aea8d97cb8e454d863f16d08b53872", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "86aea8d97cb8e454d863f16d08b53872");
        } else {
            try {
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.BATTERY_CHANGED");
                context.registerReceiver(new C0598a(), intentFilter2);
                LogUtils.a("registerReceiver CollectorStoreUploadManager initBatteryStateListener BatteryBroadcast");
            } catch (Throwable th) {
                LogUtils.a(th);
            }
        }
        com.meituan.android.common.locate.reporter.f.a(this);
        k = com.meituan.android.common.locate.reporter.f.b().getLong("coll_interval_upload_time", DDLoadConstants.CACHE_MULTIPLE_PROCESS_PROCTECT_TIME);
        LogUtils.a("CollectorStoreUploadManager  mRoutineWorkTimerJobinterval = " + k);
        p a3 = new p().a(new Runnable() { // from class: com.sankuai.meituan.location.collector.io.a.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr6 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "76635f148923feb48766ac74d68e29a4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "76635f148923feb48766ac74d68e29a4");
                    return;
                }
                LogUtils.a("CollectorStoreUploadManager  routineWork start ");
                a.d();
                LogUtils.a("CollectorStoreUploadManager  routineNum = " + a.l);
                a.a();
            }
        }).a(k);
        j = a3;
        a3.b();
        LogUtils.a("CollectorStoreUploadManager  init ok");
    }

    public static void a(final c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9dea04c6b3526229654c097bf415685d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9dea04c6b3526229654c097bf415685d");
            return;
        }
        a aVar = b;
        Object[] objArr2 = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "5b2b899278a84e9dd62ce939cd832ee6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "5b2b899278a84e9dd62ce939cd832ee6");
            return;
        }
        com.sankuai.meituan.location.collector.utils.f.a(new Runnable() { // from class: com.sankuai.meituan.location.collector.io.a.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "20b123fa8635244c42b55a6a0e89b4e8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "20b123fa8635244c42b55a6a0e89b4e8");
                } else {
                    g.a(a.this.c, cVar);
                }
            }
        });
        final h hVar = aVar.d;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = h.a;
        if (PatchProxy.isSupport(objArr3, hVar, changeQuickRedirect3, false, "2aefaea6ab4012735cd7503b9ec50a0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, hVar, changeQuickRedirect3, false, "2aefaea6ab4012735cd7503b9ec50a0a");
            return;
        }
        hVar.j++;
        if (hVar.j >= 10) {
            LogUtils.a("collector strategy onStoreNewCollectorData reach limit,upload all");
            hVar.g.post(new Runnable() { // from class: com.sankuai.meituan.location.collector.io.h.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4f0fb6aaf08d81342ec9042c656a9aa9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4f0fb6aaf08d81342ec9042c656a9aa9");
                    } else {
                        a.a(hVar.b, hVar.h, hVar.i).c();
                    }
                }
            });
        }
        hVar.j %= 10;
    }

    private synchronized void a(final boolean z) {
        boolean z2 = true;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa9915a6f9afd0cf3a482093dab1e888", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa9915a6f9afd0cf3a482093dab1e888");
            return;
        }
        h hVar = this.d;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = h.a;
        if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "7175353d4e3e9069507ea2854a04d72c", RobustBitConfig.DEFAULT_VALUE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "7175353d4e3e9069507ea2854a04d72c")).booleanValue();
        } else {
            LogUtils.a("collector strategy report file count:" + hVar.f + " limit:500");
            if (hVar.f > 500) {
                z2 = false;
            }
        }
        if (z2) {
            com.sankuai.meituan.location.collector.utils.f.a(new Runnable() { // from class: com.sankuai.meituan.location.collector.io.a.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    boolean z3;
                    ArrayList arrayList;
                    File a2;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "158eafef20896749ec293f6f58ae4eab", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "158eafef20896749ec293f6f58ae4eab");
                        return;
                    }
                    LogUtils.a("CollectorStoreUploadManager doInBackground");
                    try {
                        if (z) {
                            i iVar = a.this.e;
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = i.a;
                            if (PatchProxy.isSupport(objArr4, iVar, changeQuickRedirect4, false, "0d919f282fe5172c15d542443d1241d8", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, iVar, changeQuickRedirect4, false, "0d919f282fe5172c15d542443d1241d8");
                            } else {
                                LogUtils.a("collector UploadManager tryUploadOtherProcess");
                                Context context = iVar.b;
                                Object[] objArr5 = {context};
                                ChangeQuickRedirect changeQuickRedirect5 = d.a;
                                if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "48db19c3d1a96da16aa57b571361b6a3", RobustBitConfig.DEFAULT_VALUE)) {
                                    arrayList = (ArrayList) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "48db19c3d1a96da16aa57b571361b6a3");
                                } else {
                                    x.a(context, com.meituan.android.common.locate.util.a.a, u.e, "collector_store_dir/");
                                    File a3 = q.a(context, com.meituan.android.common.locate.util.a.a, "collector_store_dir/", u.e);
                                    LogUtils.a("FileNameProvider detectOtherProcessLocks " + a3.getPath());
                                    LogUtils.a("FileNameProvider detectOtherProcessLocks rootdir=" + a3.getAbsolutePath());
                                    File[] listFiles = a3.listFiles();
                                    ArrayList arrayList2 = new ArrayList();
                                    for (File file : listFiles) {
                                        String name = file.getName();
                                        if (name.endsWith(".lock") && !d.b(context).equals(name)) {
                                            LogUtils.a("FileNameProvider detect lock " + name);
                                            arrayList2.add(file);
                                        }
                                    }
                                    arrayList = arrayList2;
                                }
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    File file2 = (File) it.next();
                                    if (file2.exists()) {
                                        a.C0599a a4 = com.sankuai.meituan.location.collector.io.util.a.a(file2);
                                        if (a4 == null || a4.b == null) {
                                            LogUtils.a("collector UploadManager other process alive,no need report");
                                            break;
                                        }
                                        Context context2 = iVar.b;
                                        Object[] objArr6 = {context2, file2};
                                        ChangeQuickRedirect changeQuickRedirect6 = d.a;
                                        if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "a5e0ec9be3a62bf89281474bdfbb1914", RobustBitConfig.DEFAULT_VALUE)) {
                                            a2 = (File) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "a5e0ec9be3a62bf89281474bdfbb1914");
                                        } else {
                                            String name2 = file2.getName();
                                            Object[] objArr7 = {name2};
                                            ChangeQuickRedirect changeQuickRedirect7 = d.a;
                                            String substring = PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "5abdaffaec6ba6e6ef424650257196ce", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "5abdaffaec6ba6e6ef424650257196ce") : (TextUtils.isEmpty(name2) || !name2.endsWith(".lock")) ? null : name2.substring(0, name2.length() - 5);
                                            if (TextUtils.isEmpty(substring)) {
                                                a2 = null;
                                            } else {
                                                String str = "collector_store_dir/" + substring;
                                                x.a(context2, com.meituan.android.common.locate.util.a.a, u.e, str);
                                                LogUtils.a("FileNameProvider getDirectoryFileFromLockFile " + q.a(context2, com.meituan.android.common.locate.util.a.a, str, u.e).getPath());
                                                a2 = q.a(context2, com.meituan.android.common.locate.util.a.a, str, u.e);
                                            }
                                        }
                                        if (a2 != null) {
                                            LogUtils.a("collector UploadManager  dirFile.getAbsolutePath= " + a2.getAbsolutePath());
                                            iVar.a(0L, a2, false);
                                        }
                                        com.sankuai.meituan.location.collector.io.util.a.a(a4);
                                    }
                                }
                            }
                        } else {
                            h hVar2 = a.this.d;
                            Object[] objArr8 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect8 = h.a;
                            if (PatchProxy.isSupport(objArr8, hVar2, changeQuickRedirect8, false, "734326d4fcd5f6bd7c5aa33f0746aa48", RobustBitConfig.DEFAULT_VALUE)) {
                                z3 = ((Boolean) PatchProxy.accessDispatch(objArr8, hVar2, changeQuickRedirect8, false, "734326d4fcd5f6bd7c5aa33f0746aa48")).booleanValue();
                            } else {
                                Object[] objArr9 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect9 = h.a;
                                if (PatchProxy.isSupport(objArr9, hVar2, changeQuickRedirect9, false, "afccd620b40ed2767ad953d378eb736d", RobustBitConfig.DEFAULT_VALUE)) {
                                    z3 = ((Boolean) PatchProxy.accessDispatch(objArr9, hVar2, changeQuickRedirect9, false, "afccd620b40ed2767ad953d378eb736d")).booleanValue();
                                } else {
                                    z3 = System.currentTimeMillis() - hVar2.d > 180000;
                                    LogUtils.a("collector strategy isUploadTimeGapLongEnough " + z3);
                                }
                            }
                            if (z3) {
                                LogUtils.a("CollectorStoreUploadManager will upload all");
                                i iVar2 = a.this.e;
                                Object[] objArr10 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect10 = i.a;
                                if (PatchProxy.isSupport(objArr10, iVar2, changeQuickRedirect10, false, "6327baa41e738836be5271c582ae2e94", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr10, iVar2, changeQuickRedirect10, false, "6327baa41e738836be5271c582ae2e94");
                                } else {
                                    iVar2.a(0L, d.a(iVar2.b), true);
                                }
                            } else {
                                LogUtils.a("CollectorStoreUploadManager will upload file reached limited");
                                i iVar3 = a.this.e;
                                Object[] objArr11 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect11 = i.a;
                                if (PatchProxy.isSupport(objArr11, iVar3, changeQuickRedirect11, false, "048fbfc71d8a9b045eec223f1337f118", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr11, iVar3, changeQuickRedirect11, false, "048fbfc71d8a9b045eec223f1337f118");
                                } else {
                                    iVar3.a(51200L, d.a(iVar3.b), true);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        LogUtils.a(th);
                    }
                    LogUtils.a("CollectorStoreUploadManager change upload state");
                    if (z) {
                        a.a(a.this, false);
                    } else {
                        a.b(a.this, false);
                    }
                }
            });
        }
    }
}
