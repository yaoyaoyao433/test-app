package com.sankuai.xm.monitor.report;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.alipay.sdk.app.PayTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.monitor.report.d;
import com.sankuai.xm.monitor.report.db.ReportBean;
import com.sankuai.xm.monitor.report.db.ReportDB;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b {
    public static ChangeQuickRedirect a;
    volatile boolean b;
    volatile boolean c;
    long d;
    a e;
    Handler f;
    private volatile boolean g;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "317dfb77e346a3c1fa47cd6c61d01064", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "317dfb77e346a3c1fa47cd6c61d01064");
            return;
        }
        this.g = false;
        this.b = false;
        this.c = false;
        this.d = 300000L;
        this.f = new Handler(Looper.getMainLooper()) { // from class: com.sankuai.xm.monitor.report.b.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2f499ea79db1ab4a96fc4efb6b6a4e8e", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2f499ea79db1ab4a96fc4efb6b6a4e8e");
                    return;
                }
                super.handleMessage(message);
                if (!b.this.a()) {
                    com.sankuai.xm.log.c.b("HandlerDispatcher", "HandlerDispatcher::Handler::handleMessage:: report is not run", new Object[0]);
                    return;
                }
                int i = message.what;
                if (i == 30) {
                    b.this.c = false;
                } else if (i != 40 && i != 50) {
                    if (i != 52) {
                        return;
                    }
                    com.sankuai.xm.threadpool.scheduler.a.b().a(22, new a(2, null));
                    return;
                }
                final b bVar = b.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = b.a;
                if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "e411e2ab8f67d5899827b174a8b3b97d", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "e411e2ab8f67d5899827b174a8b3b97d");
                } else if (bVar.e != null && bVar.e.b) {
                    com.sankuai.xm.log.c.b("HandlerDispatcher", "HandlerDispatcher::doReport:: report running", new Object[0]);
                } else {
                    bVar.e = new a(1, new d.a() { // from class: com.sankuai.xm.monitor.report.b.2
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.xm.monitor.report.d.a
                        public final void a(List<ReportBean> list, boolean z) {
                            Object[] objArr4 = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d35b5a9f7f279aff62fad4e5fc665a68", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d35b5a9f7f279aff62fad4e5fc665a68");
                            } else if (!b.this.a()) {
                                com.sankuai.xm.log.c.b("HandlerDispatcher", "HandlerDispatcher::TaskRunnable::doTaskFinished:: report not run", new Object[0]);
                            } else {
                                int size = list != null ? list.size() : 0;
                                com.sankuai.xm.log.c.b("HandlerDispatcher", "HandlerDispatcher::TaskRunnable::doTaskFinished:: report isSuccess=" + z + " reportCount=" + size, new Object[0]);
                                if (!z || size < 500) {
                                    c b = c.b();
                                    Object[] objArr5 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                                    ChangeQuickRedirect changeQuickRedirect5 = c.a;
                                    if (PatchProxy.isSupport(objArr5, b, changeQuickRedirect5, false, "779b18e72c1f25da4f13f7581f97335b", 6917529027641081856L)) {
                                        PatchProxy.accessDispatch(objArr5, b, changeQuickRedirect5, false, "779b18e72c1f25da4f13f7581f97335b");
                                    } else if (!b.f) {
                                        com.sankuai.xm.log.c.b("ReportManager", "ReportManager::updateReport:: not init", new Object[0]);
                                    } else {
                                        if (b.d != 0) {
                                            com.sankuai.xm.log.c.b("ReportManager", "ReportManager::updateReport:: mBgSuccessCount=" + b.e + " appState=" + b.d, new Object[0]);
                                            if (z) {
                                                b.e++;
                                            } else if (b.e > 0) {
                                                b.e--;
                                            }
                                        } else {
                                            b.e = 0;
                                        }
                                        if (b.c == null) {
                                            com.sankuai.xm.log.c.b("ReportManager", "ReportManager::updateReport:: mReportDispatcher not init", new Object[0]);
                                        } else if (b.e > 3) {
                                            b bVar2 = b.c;
                                            Object[] objArr6 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect6 = b.a;
                                            if (PatchProxy.isSupport(objArr6, bVar2, changeQuickRedirect6, false, "876c5e7822371a3c86aa264ef4982cd1", 6917529027641081856L)) {
                                                PatchProxy.accessDispatch(objArr6, bVar2, changeQuickRedirect6, false, "876c5e7822371a3c86aa264ef4982cd1");
                                            } else {
                                                com.sankuai.xm.log.c.b("HandlerDispatcher", "HandlerDispatcher::stop:: report", new Object[0]);
                                                bVar2.b = true;
                                                bVar2.c = false;
                                                bVar2.f.removeMessages(30);
                                                bVar2.f.removeMessages(50);
                                                bVar2.f.removeMessages(40);
                                                bVar2.f.removeMessages(52);
                                            }
                                        } else if (b.c.b) {
                                            b.c.b = false;
                                            b.c.a(b.b);
                                        }
                                    }
                                    b.this.b(b.this.d);
                                    return;
                                }
                                b.this.a(50, PayTask.j);
                            }
                        }
                    });
                    com.sankuai.xm.threadpool.scheduler.a.b().a(22, bVar.e);
                }
            }
        };
        this.b = false;
        this.g = false;
    }

    private void c(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f56a16ac23774d8a8d3df8de89b35f45", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f56a16ac23774d8a8d3df8de89b35f45");
            return;
        }
        this.c = true;
        this.f.removeMessages(30);
        this.f.sendEmptyMessageDelayed(30, j);
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e0f0916c9698d0ae5a19350030c0fa0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e0f0916c9698d0ae5a19350030c0fa0");
        } else if (this.g) {
            com.sankuai.xm.log.c.b("HandlerDispatcher", "HandlerDispatcher::startLooper:: report is release", new Object[0]);
        } else {
            b(j);
        }
    }

    void b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc308531122f9833727b3b7647c56fc5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc308531122f9833727b3b7647c56fc5");
        } else if (!a()) {
            com.sankuai.xm.log.c.b("HandlerDispatcher", "HandlerDispatcher::setLoopTimeAndRun:: report  not run", new Object[0]);
        } else {
            if (j < 0) {
                j = 300000;
            }
            if (j == this.d && this.c) {
                return;
            }
            if (this.c) {
                this.d = j;
                return;
            }
            this.d = j;
            c(j);
        }
    }

    public final boolean a() {
        return (this.g || this.b) ? false : true;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1eed1b0023bb6af8f07d10c0db1baa8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1eed1b0023bb6af8f07d10c0db1baa8");
        } else {
            a(40, 10000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, long j) {
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e41109488a891ac038f50d15166cae3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e41109488a891ac038f50d15166cae3");
        } else if (!a()) {
            com.sankuai.xm.log.c.b("HandlerDispatcher", "HandlerDispatcher::report:: report not run", new Object[0]);
        } else if (this.f.hasMessages(i)) {
            com.sankuai.xm.log.c.b("HandlerDispatcher", "HandlerDispatcher::report:: report has msg", new Object[0]);
        } else {
            this.f.sendEmptyMessageDelayed(i, j);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    class a implements Runnable {
        public static ChangeQuickRedirect a;
        volatile boolean b;
        private int d;
        private d.a e;

        public static /* synthetic */ boolean a(a aVar, boolean z) {
            aVar.b = false;
            return false;
        }

        public a(int i, d.a aVar) {
            Object[] objArr = {b.this, Integer.valueOf(i), aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efd025e640d35d9336644f18300536f2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efd025e640d35d9336644f18300536f2");
                return;
            }
            this.b = false;
            this.d = i;
            this.e = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7468c046db96c21af5744e30e25bfdb0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7468c046db96c21af5744e30e25bfdb0");
                return;
            }
            this.b = true;
            final Callback<List<ReportBean>> callback = new Callback<List<ReportBean>>() { // from class: com.sankuai.xm.monitor.report.b.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.callback.Callback
                public final void onFailure(int i, String str) {
                }

                @Override // com.sankuai.xm.base.callback.Callback
                public final /* synthetic */ void onSuccess(List<ReportBean> list) {
                    List<ReportBean> list2 = list;
                    Object[] objArr2 = {list2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "24f8b0bec0b9630bbe5dacbcaa6ef793", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "24f8b0bec0b9630bbe5dacbcaa6ef793");
                        return;
                    }
                    if (list2 != null && !list2.isEmpty()) {
                        b bVar = b.this;
                        Object[] objArr3 = {list2};
                        ChangeQuickRedirect changeQuickRedirect3 = b.a;
                        if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "ab21c6eb1dcce1dd10c2d191ab2d944b", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "ab21c6eb1dcce1dd10c2d191ab2d944b");
                        } else {
                            int size = list2.size();
                            int i = 0;
                            int i2 = 0;
                            while (true) {
                                if (i >= size) {
                                    break;
                                }
                                ReportBean reportBean = list2.get(i);
                                if (reportBean != null && reportBean.value != null) {
                                    i2 += reportBean.value.length();
                                }
                                if (i2 > 307200) {
                                    i--;
                                    break;
                                }
                                i++;
                            }
                            if (i2 > 307200) {
                                com.sankuai.xm.log.c.b("HandlerDispatcher", "HandlerDispatcher::checkAndResize:: report total size=" + i2 + ",index i=" + i + ",size=" + size, new Object[0]);
                                if (size == 1) {
                                    c.b().a(list2);
                                } else if (i >= 0 && i < size) {
                                    list2.subList(i, size).clear();
                                }
                            }
                        }
                        c b = c.b();
                        Object[] objArr4 = {list2};
                        ChangeQuickRedirect changeQuickRedirect4 = c.a;
                        if (PatchProxy.isSupport(objArr4, b, changeQuickRedirect4, false, "3443dfb03a5eff4b3233ec80912ce8ca", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr4, b, changeQuickRedirect4, false, "3443dfb03a5eff4b3233ec80912ce8ca");
                        } else {
                            synchronized (b) {
                                ReportDB.l().a(list2, 5);
                            }
                        }
                    }
                    StringBuilder sb = new StringBuilder("HandlerDispatcher::TaskRunnable::run:: report  mType=");
                    sb.append(a.this.d);
                    sb.append(" reportBeanList size=");
                    sb.append(list2 != null ? Integer.valueOf(list2.size()) : null);
                    com.sankuai.xm.log.c.b("HandlerDispatcher", sb.toString(), new Object[0]);
                    if (list2 != null && !list2.isEmpty()) {
                        b bVar2 = b.this;
                        d.a aVar = new d.a() { // from class: com.sankuai.xm.monitor.report.b.a.1.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.xm.monitor.report.d.a
                            public final void a(List<ReportBean> list3, boolean z) {
                                Object[] objArr5 = {list3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "43645cf4fabc53351686e13fbe497eba", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "43645cf4fabc53351686e13fbe497eba");
                                    return;
                                }
                                a.a(a.this, false);
                                if (z) {
                                    c.b().a(list3);
                                } else {
                                    c b2 = c.b();
                                    Object[] objArr6 = {list3};
                                    ChangeQuickRedirect changeQuickRedirect6 = c.a;
                                    if (PatchProxy.isSupport(objArr6, b2, changeQuickRedirect6, false, "70ca97c9b4a0689a5195f4e1025e1a39", 6917529027641081856L)) {
                                        PatchProxy.accessDispatch(objArr6, b2, changeQuickRedirect6, false, "70ca97c9b4a0689a5195f4e1025e1a39");
                                    } else {
                                        com.sankuai.xm.log.c.b("ReportManager", "ReportManager::updateFail", new Object[0]);
                                        synchronized (b2) {
                                            ReportDB.l().a(list3, 10);
                                        }
                                    }
                                }
                                if (a.this.e != null) {
                                    a.this.e.a(list3, z);
                                }
                            }
                        };
                        Object[] objArr5 = {list2, aVar, (byte) 1};
                        ChangeQuickRedirect changeQuickRedirect5 = b.a;
                        if (PatchProxy.isSupport(objArr5, bVar2, changeQuickRedirect5, false, "27e53a003785c02ba41ed08bfacb9bd0", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr5, bVar2, changeQuickRedirect5, false, "27e53a003785c02ba41ed08bfacb9bd0");
                            return;
                        } else if (!bVar2.a()) {
                            com.sankuai.xm.log.c.b("HandlerDispatcher", "HandlerDispatcher::dispatch:: report not run", new Object[0]);
                            aVar.a(list2, false);
                            return;
                        } else {
                            d dVar = new d(list2);
                            dVar.b = aVar;
                            dVar.c = true;
                            com.sankuai.xm.threadpool.scheduler.a.b().a(22, dVar);
                            return;
                        }
                    }
                    com.sankuai.xm.log.c.b("HandlerDispatcher", "HandlerDispatcher::TaskRunnable::run::report no data ", new Object[0]);
                    a.a(a.this, false);
                }
            };
            synchronized (c.b()) {
                switch (this.d) {
                    case 1:
                        c b = c.b();
                        Object[] objArr2 = {callback};
                        ChangeQuickRedirect changeQuickRedirect2 = c.a;
                        if (!PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "76ebed51b9c624ab61afee01abc7c8b2", 6917529027641081856L)) {
                            final ReportDB l = ReportDB.l();
                            Object[] objArr3 = {callback};
                            ChangeQuickRedirect changeQuickRedirect3 = ReportDB.j;
                            if (!PatchProxy.isSupport(objArr3, l, changeQuickRedirect3, false, "9f2b08517b524cb8c0c1441eaa6ca22d", 6917529027641081856L)) {
                                l.a(new Runnable() { // from class: com.sankuai.xm.monitor.report.db.ReportDB.8
                                    public static ChangeQuickRedirect a;

                                    /* JADX WARN: Multi-variable type inference failed */
                                    /* JADX WARN: Removed duplicated region for block: B:91:0x008c  */
                                    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
                                    /* JADX WARN: Type inference failed for: r1v3 */
                                    /* JADX WARN: Type inference failed for: r1v6, types: [android.database.Cursor] */
                                    @Override // java.lang.Runnable
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct add '--show-bad-code' argument
                                    */
                                    public final void run() {
                                        /*
                                            r12 = this;
                                            r0 = 0
                                            java.lang.Object[] r8 = new java.lang.Object[r0]
                                            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.xm.monitor.report.db.ReportDB.AnonymousClass8.a
                                            java.lang.String r10 = "5a1e237bc50e87560c106d4ed99ee1f5"
                                            r4 = 0
                                            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
                                            r1 = r8
                                            r2 = r12
                                            r3 = r9
                                            r5 = r10
                                            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                                            if (r1 == 0) goto L18
                                            com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r9, r0, r10)
                                            return
                                        L18:
                                            r0 = 0
                                            com.sankuai.xm.monitor.report.db.ReportDB r1 = r1     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L7b
                                            com.sankuai.xm.base.db.c r2 = r1.bR_()     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L7b
                                            if (r2 != 0) goto L2c
                                            com.sankuai.xm.base.callback.Callback r1 = r2     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L7b
                                            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L7b
                                            r2.<init>()     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L7b
                                            r1.onSuccess(r2)     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L7b
                                            return
                                        L2c:
                                            java.lang.String r5 = "status=1 or status=10"
                                            java.lang.String r3 = "statistics_report"
                                            r4 = 0
                                            r6 = 0
                                            r7 = 0
                                            r8 = 0
                                            java.lang.String r9 = " date(time/1000,'unixepoch','localtime') DESC ,priority ASC LIMIT 500"
                                            android.database.Cursor r1 = r2.a(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L7b
                                            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L89
                                            r0.<init>()     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L89
                                            if (r1 != 0) goto L51
                                            com.sankuai.xm.base.callback.Callback r0 = r2     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L89
                                            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L89
                                            r2.<init>()     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L89
                                            r0.onSuccess(r2)     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L89
                                            if (r1 == 0) goto L50
                                            r1.close()
                                        L50:
                                            return
                                        L51:
                                            boolean r2 = r1.moveToNext()     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L89
                                            if (r2 == 0) goto L69
                                            com.sankuai.xm.base.tinyorm.f r2 = com.sankuai.xm.base.tinyorm.f.a()     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L89
                                            java.lang.Class<com.sankuai.xm.monitor.report.db.ReportBean> r3 = com.sankuai.xm.monitor.report.db.ReportBean.class
                                            java.lang.Object r2 = r2.a(r3, r1)     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L89
                                            com.sankuai.xm.monitor.report.db.ReportBean r2 = (com.sankuai.xm.monitor.report.db.ReportBean) r2     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L89
                                            if (r2 == 0) goto L51
                                            r0.add(r2)     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L89
                                            goto L51
                                        L69:
                                            com.sankuai.xm.base.callback.Callback r2 = r2     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L89
                                            r2.onSuccess(r0)     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L89
                                            if (r1 == 0) goto L88
                                            r1.close()
                                            return
                                        L74:
                                            r0 = move-exception
                                            goto L7f
                                        L76:
                                            r1 = move-exception
                                            r11 = r1
                                            r1 = r0
                                            r0 = r11
                                            goto L8a
                                        L7b:
                                            r1 = move-exception
                                            r11 = r1
                                            r1 = r0
                                            r0 = r11
                                        L7f:
                                            r0.printStackTrace()     // Catch: java.lang.Throwable -> L89
                                            if (r1 == 0) goto L88
                                            r1.close()
                                            return
                                        L88:
                                            return
                                        L89:
                                            r0 = move-exception
                                        L8a:
                                            if (r1 == 0) goto L8f
                                            r1.close()
                                        L8f:
                                            throw r0
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.monitor.report.db.ReportDB.AnonymousClass8.run():void");
                                    }
                                }, callback);
                                break;
                            } else {
                                PatchProxy.accessDispatch(objArr3, l, changeQuickRedirect3, false, "9f2b08517b524cb8c0c1441eaa6ca22d");
                                break;
                            }
                        } else {
                            PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "76ebed51b9c624ab61afee01abc7c8b2");
                            break;
                        }
                    case 2:
                        c b2 = c.b();
                        Object[] objArr4 = {callback};
                        ChangeQuickRedirect changeQuickRedirect4 = c.a;
                        if (!PatchProxy.isSupport(objArr4, b2, changeQuickRedirect4, false, "f872b28dbb30ad8841cb2b4daffb4b70", 6917529027641081856L)) {
                            final ReportDB l2 = ReportDB.l();
                            Object[] objArr5 = {ReportBean.TYPE_ELE, 1, 10, callback};
                            ChangeQuickRedirect changeQuickRedirect5 = ReportDB.j;
                            if (!PatchProxy.isSupport(objArr5, l2, changeQuickRedirect5, false, "126629d366367a046c25405b960f6cc2", 6917529027641081856L)) {
                                l2.a(new Runnable() { // from class: com.sankuai.xm.monitor.report.db.ReportDB.7
                                    public static ChangeQuickRedirect a;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Object[] objArr6 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect6 = a;
                                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "dfd50963253f3d3e9866bbd6017d8c86", 6917529027641081856L)) {
                                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "dfd50963253f3d3e9866bbd6017d8c86");
                                            return;
                                        }
                                        callback.onSuccess(l2.a(r2, "priority", r3, r4));
                                    }
                                }, callback);
                                break;
                            } else {
                                PatchProxy.accessDispatch(objArr5, l2, changeQuickRedirect5, false, "126629d366367a046c25405b960f6cc2");
                                break;
                            }
                        } else {
                            PatchProxy.accessDispatch(objArr4, b2, changeQuickRedirect4, false, "f872b28dbb30ad8841cb2b4daffb4b70");
                            break;
                        }
                }
            }
        }
    }
}
