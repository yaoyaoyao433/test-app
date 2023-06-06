package com.meituan.msc.devsupport.perf;

import android.os.Handler;
import android.os.Message;
import com.meituan.android.common.aidata.jsengine.utils.JSExecuteUtil;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msc.util.perf.PerfEventRecorder;
import com.meituan.msc.util.perf.PerfTrace;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RenderPerf {
    public static ChangeQuickRedirect a = null;
    public static boolean b = true;
    public static long h;
    public final boolean c;
    public boolean d;
    public long e;
    public long f;
    protected long g;
    public ScheduledExecutorService i;
    private final PerfEventRecorder j;
    private final Map<Integer, a> k;
    private boolean l;
    private long m;
    private final Handler n;

    public RenderPerf(boolean z, PerfEventRecorder perfEventRecorder) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), perfEventRecorder};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b346a28f1016899fcbcf4a14e2359662", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b346a28f1016899fcbcf4a14e2359662");
            return;
        }
        this.d = false;
        this.k = new ConcurrentHashMap();
        this.l = false;
        this.e = 0L;
        this.m = 0L;
        this.f = 0L;
        this.g = 0L;
        this.i = c.c("RenderPerf");
        this.c = z;
        this.j = perfEventRecorder;
        this.n = new b(this);
    }

    public final void a(int i, long j) {
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7024e9b4bfddf51c96bdbfc85cea4e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7024e9b4bfddf51c96bdbfc85cea4e0");
        } else if (this.c) {
            if (!this.l) {
                PerfTrace.instant("RenderStart");
                this.l = true;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8f8113fa295781a50abd80e592efb4fd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8f8113fa295781a50abd80e592efb4fd");
                } else if (this.c) {
                    this.i.scheduleAtFixedRate(new Runnable() { // from class: com.meituan.msc.devsupport.perf.RenderPerf.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5283c618b74f4f2c04d5af537152a173", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5283c618b74f4f2c04d5af537152a173");
                                return;
                            }
                            RenderPerf.this.n.sendMessageDelayed(RenderPerf.this.n.obtainMessage(1, Long.valueOf(RenderPerf.this.g)), LocationStrategy.LOCATION_TIMEOUT);
                        }
                    }, LocationStrategy.LOCATION_TIMEOUT, LocationStrategy.LOCATION_TIMEOUT, TimeUnit.MILLISECONDS);
                }
            }
            this.d = true;
            b(i).i = j;
        }
    }

    public final void a(int i) {
        long j;
        long j2;
        PerfEventRecorder perfEventRecorder;
        String str;
        HashMap hashMap;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "302dfc357b9376390b721fbbafe6dce7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "302dfc357b9376390b721fbbafe6dce7");
        } else if (this.c) {
            a b2 = b(i);
            b2.b(JSExecuteUtil.VALUE_JS_OPTIONS_EXECUTE_MODE_BATCH);
            this.d = false;
            PerfEventRecorder perfEventRecorder2 = this.j;
            long e = b2.e(JSExecuteUtil.VALUE_JS_OPTIONS_EXECUTE_MODE_BATCH);
            long c = b2.c(JSExecuteUtil.VALUE_JS_OPTIONS_EXECUTE_MODE_BATCH);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, b2, changeQuickRedirect2, false, "eb917a6a9fffbde4f84a56cd5425aa2f", RobustBitConfig.DEFAULT_VALUE)) {
                hashMap = (Map) PatchProxy.accessDispatch(objArr2, b2, changeQuickRedirect2, false, "eb917a6a9fffbde4f84a56cd5425aa2f");
                perfEventRecorder = perfEventRecorder2;
                str = "render_batch";
                j2 = e;
                j = c;
            } else {
                long a2 = b2.a();
                long e2 = b2.e("cascade");
                long e3 = b2.e("updateStyleProperties");
                long e4 = b2.e("notifyBeforeLayout");
                long e5 = b2.e("layout");
                long e6 = b2.e("updateLayoutProperties");
                HashMap hashMap2 = new HashMap();
                j = c;
                hashMap2.put("batchId", Integer.valueOf(b2.d));
                j2 = e;
                perfEventRecorder = perfEventRecorder2;
                str = "render_batch";
                hashMap2.put("fromBatch", Long.valueOf(b2.h - b2.n));
                hashMap2.put("setChildren", Long.valueOf(b2.f("setChildren")));
                hashMap2.put("createView", Long.valueOf(b2.f("createView")));
                hashMap2.put("manageChildren", Long.valueOf(b2.f("manageChildren")));
                hashMap2.put("updateView", Long.valueOf(b2.f("updateView")));
                hashMap2.put("cascade", Long.valueOf(e2 + e3));
                hashMap2.put("cascade_process", Long.valueOf(e2));
                hashMap2.put("cascade_setValue", Long.valueOf(e3));
                hashMap2.put("layout", Long.valueOf(e4 + e5 + e6));
                hashMap2.put("layout_before", Long.valueOf(e4));
                hashMap2.put("layout_process", Long.valueOf(e5));
                hashMap2.put("layout_setValue", Long.valueOf(e6));
                hashMap2.put("batchGap", Long.valueOf(b2.i));
                hashMap2.put("commandProcess", Integer.valueOf(b2.e));
                hashMap2.put("commandGap", Long.valueOf(a2 - b2.e));
                hashMap2.put("nodeCount", Integer.valueOf(b2.j));
                hashMap2.put("needUpdatePropertiesNodeCount", Integer.valueOf(b2.k));
                hashMap = hashMap2;
            }
            perfEventRecorder.a(str, j2, j, hashMap, false);
        }
    }

    public final void a(String str, long j, int i) {
        Object[] objArr = {str, new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22c717cdc131b55907ae2433ef719800", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22c717cdc131b55907ae2433ef719800");
        } else if (this.c && this.d) {
            a b2 = b(i);
            Object[] objArr2 = {str, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, b2, changeQuickRedirect2, false, "a83b449c8b1b4a0aa8eaf3844cb637d3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, b2, changeQuickRedirect2, false, "a83b449c8b1b4a0aa8eaf3844cb637d3");
            } else {
                b2.c.put(str, Long.valueOf(b2.f(str) + j));
            }
        }
    }

    public final void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "690c07f69df26dda49fe2d4bb16c371e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "690c07f69df26dda49fe2d4bb16c371e");
        } else if (this.c && this.d) {
            b(i).a(str);
        }
    }

    public final a b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "475b2e437601dd9428e32bf984f3ff38", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "475b2e437601dd9428e32bf984f3ff38");
        }
        a aVar = this.k.get(Integer.valueOf(i));
        if (aVar == null) {
            a aVar2 = new a(i);
            this.k.put(Integer.valueOf(i), aVar2);
            return aVar2;
        }
        return aVar;
    }

    public final void b(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5e6ad4f9a73b85d6d92adf129a91e17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5e6ad4f9a73b85d6d92adf129a91e17");
        } else if (this.c && this.d) {
            this.g = System.currentTimeMillis();
            b(i).b(str);
        }
    }

    public final void a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd2084315f7be0800e112ba12c0d6026", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd2084315f7be0800e112ba12c0d6026");
        } else if (this.c) {
            a b2 = b(i);
            b2.j = i2;
            b2.k = i3;
        }
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e1c3830041d826817ecbc5b16cd84731", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e1c3830041d826817ecbc5b16cd84731");
        } else if (b) {
            h = System.currentTimeMillis();
        }
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc428585f34cd4e252fdcdbcc9da71be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc428585f34cd4e252fdcdbcc9da71be");
        } else {
            this.m = j;
        }
    }

    public final void b(long j) {
        Iterator it;
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b171b32a4c637546b610379bc35c065c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b171b32a4c637546b610379bc35c065c");
            return;
        }
        a aVar = null;
        ArrayList arrayList = new ArrayList(this.k.values());
        Collections.sort(arrayList, new Comparator<a>() { // from class: com.meituan.msc.devsupport.perf.RenderPerf.2
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(a aVar2, a aVar3) {
                return aVar2.d - aVar3.d;
            }
        });
        Iterator it2 = arrayList.iterator();
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        long j19 = 0;
        long j20 = 0;
        long j21 = 0;
        int i = 0;
        while (it2.hasNext()) {
            a aVar2 = (a) it2.next();
            long j22 = j4;
            if (aVar2.m == j2) {
                g.d("RenderPerf", "value.batchDidCompleteEndTime == 0", aVar2);
            } else if (aVar2.d < 0) {
                g.d("RenderPerf", "value.batchID < 0", aVar2, Integer.valueOf(aVar2.d));
            } else if (aVar2.m <= j) {
                long j23 = aVar2.h - aVar2.n;
                j3 += j23;
                j4 = Math.max(j22, j23);
                it = it2;
                j5 += aVar2.e;
                j6 += aVar2.f;
                j7 += aVar2.f("setChildren");
                j8 += aVar2.f("createView");
                j9 += aVar2.f("updateView");
                j10 += aVar2.f("manageChildren");
                j11 += aVar2.e("cascade") + aVar2.e("updateStyleProperties");
                j12 += aVar2.e("cascade");
                j13 += aVar2.e("updateStyleProperties");
                j14 += aVar2.e("layout") + aVar2.e("notifyBeforeLayout") + aVar2.e("updateLayoutProperties");
                j15 += aVar2.e("notifyBeforeLayout");
                j16 += aVar2.e("updateLayoutProperties");
                j17 += aVar2.e("layout");
                j18 += aVar2.i;
                j20 += aVar2.e(JSExecuteUtil.VALUE_JS_OPTIONS_EXECUTE_MODE_BATCH);
                i += aVar2.l;
                j19 += aVar2.a();
                j21 = j23;
                aVar = aVar2;
                it2 = it;
                j2 = 0;
            }
            it = it2;
            j4 = j22;
            it2 = it;
            j2 = 0;
        }
        long j24 = j4;
        int i2 = aVar != null ? aVar.j : 0;
        HashMap hashMap = new HashMap();
        hashMap.put("cssParse", Long.valueOf(this.e));
        hashMap.put("batchCount", Integer.valueOf(i));
        hashMap.put("nodeCount", Integer.valueOf(i2));
        hashMap.put("lastBatchToFFP", Long.valueOf(aVar == null ? 0L : j - aVar.d(JSExecuteUtil.VALUE_JS_OPTIONS_EXECUTE_MODE_BATCH)));
        hashMap.put("fromBatch", Long.valueOf(j3));
        hashMap.put("fromBatchLast", Long.valueOf(j21));
        hashMap.put("fromBatchMax", Long.valueOf(j24));
        hashMap.put("setChildren", Long.valueOf(j7));
        hashMap.put("createView", Long.valueOf(j8));
        hashMap.put("manageChildren", Long.valueOf(j10));
        hashMap.put("updateView", Long.valueOf(j9));
        hashMap.put("cascade", Long.valueOf(j11));
        hashMap.put("cascade_process", Long.valueOf(j12));
        hashMap.put("cascade_setValue", Long.valueOf(j13));
        hashMap.put("layout", Long.valueOf(j14));
        hashMap.put("layout_before", Long.valueOf(j15));
        hashMap.put("layout_process", Long.valueOf(j17));
        hashMap.put("layout_setValue", Long.valueOf(j16));
        hashMap.put("batchGap", Long.valueOf(j18));
        hashMap.put("commandProcess", Long.valueOf(j5));
        hashMap.put("commandCount", Long.valueOf(j6));
        hashMap.put("commandGap", Long.valueOf(j19 - j5));
        hashMap.put("ffp", Long.valueOf(j - this.m));
        hashMap.put("fp", Long.valueOf(this.f - this.m));
        this.j.a("render_ffp", j20, aVar == null ? System.currentTimeMillis() : aVar.d(JSExecuteUtil.VALUE_JS_OPTIONS_EXECUTE_MODE_BATCH), hashMap, true);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class b extends Handler {
        public static ChangeQuickRedirect a;
        private final WeakReference<RenderPerf> b;

        public b(RenderPerf renderPerf) {
            Object[] objArr = {renderPerf};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77c2be085cf27782c9f507a0b3349cac", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77c2be085cf27782c9f507a0b3349cac");
            } else {
                this.b = new WeakReference<>(renderPerf);
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2272e2019dbacd115b204c1952b86a50", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2272e2019dbacd115b204c1952b86a50");
                return;
            }
            super.handleMessage(message);
            if (message.what == 1) {
                long longValue = ((Long) message.obj).longValue();
                RenderPerf renderPerf = this.b.get();
                if (renderPerf != null && renderPerf.g == longValue) {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = RenderPerf.a;
                    if (PatchProxy.isSupport(objArr2, renderPerf, changeQuickRedirect2, false, "5746e3b57b0b53c918e98c483e81065f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, renderPerf, changeQuickRedirect2, false, "5746e3b57b0b53c918e98c483e81065f");
                    } else if (renderPerf.c) {
                        renderPerf.i.shutdown();
                    }
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public Map<String, Long> b;
        public Map<String, Long> c;
        public int d;
        public int e;
        public int f;
        public long g;
        public long h;
        public long i;
        public int j;
        public int k;
        public int l;
        public long m;
        public long n;

        public a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "247767e3b0a55e4161f5fbaa84ebf99c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "247767e3b0a55e4161f5fbaa84ebf99c");
                return;
            }
            this.b = new HashMap();
            this.c = new HashMap();
            this.d = i;
            this.g = RenderPerf.h;
            a(JSExecuteUtil.VALUE_JS_OPTIONS_EXECUTE_MODE_BATCH);
        }

        public final long a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "945c7c7ebc099e53b10b177b2a7a8df8", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "945c7c7ebc099e53b10b177b2a7a8df8")).longValue();
            }
            if (this.h == 0) {
                return 0L;
            }
            return this.h - c(JSExecuteUtil.VALUE_JS_OPTIONS_EXECUTE_MODE_BATCH);
        }

        public final void a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "289718bfe9aff87f9348ea21f9a82c49", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "289718bfe9aff87f9348ea21f9a82c49");
            } else {
                a(str, true);
            }
        }

        public final void b(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c3d1d528f6eb92efa76c083f71e567d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c3d1d528f6eb92efa76c083f71e567d");
            } else {
                a(str, false);
            }
        }

        private void a(String str, boolean z) {
            Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac07a07cc9ee830d3296dad5b8aa56b7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac07a07cc9ee830d3296dad5b8aa56b7");
                return;
            }
            String c = c(str, z);
            if (z && this.b.containsKey(c)) {
                return;
            }
            this.b.put(c, Long.valueOf(System.currentTimeMillis()));
        }

        private long b(String str, boolean z) {
            Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72d215aa65e7029609db26e9691d2c02", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72d215aa65e7029609db26e9691d2c02")).longValue();
            }
            String c = c(str, z);
            if (this.b.containsKey(c)) {
                return this.b.get(c).longValue();
            }
            return 0L;
        }

        public final long c(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee3d5b0087ae0016561c8bc03c75f1a2", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee3d5b0087ae0016561c8bc03c75f1a2")).longValue() : b(str, true);
        }

        public final long d(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "124e3c9d05948624ed38235253bae98b", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "124e3c9d05948624ed38235253bae98b")).longValue() : b(str, false);
        }

        private String c(String str, boolean z) {
            Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4aed71a9551b705042fc51e0901b82ae", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4aed71a9551b705042fc51e0901b82ae");
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(z ? "-start" : "-end");
            return sb.toString();
        }

        public final long e(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07827835290de3ca1b519e119c8da2e5", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07827835290de3ca1b519e119c8da2e5")).longValue() : Math.max(d(str) - c(str), 0L);
        }

        public final long f(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc4de56c8e5cde6707aca87d636898ae", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc4de56c8e5cde6707aca87d636898ae")).longValue();
            }
            Long l = this.c.get(str);
            if (l == null) {
                return 0L;
            }
            return l.longValue();
        }
    }
}
