package com.tencent.mapsdk.internal;

import android.text.TextUtils;
import com.meituan.android.mrn.engine.MRNBundleManager;
import com.meituan.robust.common.CommonConstant;
import com.tencent.map.sdk.comps.offlinemap.OfflineItem;
import com.tencent.map.sdk.comps.offlinemap.OfflineItemController;
import com.tencent.map.sdk.comps.offlinemap.OfflineStatus;
import com.tencent.map.sdk.comps.offlinemap.OfflineStatusChangedListener;
import com.tencent.mapsdk.internal.jy;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class by implements OfflineItemController {
    OfflineStatusChangedListener a;
    a b;
    private final me c;
    private final bz d;
    private final OfflineItem e;
    private final String f;
    private final File g;
    private final File h;
    private final File i;
    private String j;
    private final lg k = new lg();
    private final b l = new b(this, (byte) 0);
    private boolean m;
    private final bn n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void a(OfflineItem offlineItem, int i);

        void a(OfflineItem offlineItem, boolean z);

        void b(OfflineItem offlineItem, boolean z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public by(bn bnVar, String str, OfflineItem offlineItem, bz bzVar, me meVar, OfflineStatusChangedListener offlineStatusChangedListener) {
        this.n = bnVar;
        this.c = meVar;
        this.e = offlineItem;
        this.d = bzVar;
        this.a = offlineStatusChangedListener;
        this.k.b = hd.d();
        this.f = str;
        this.g = new File(str, bzVar.c + MRNBundleManager.MRN_BUNDLE_SUFFIX);
        this.h = new File(str, bzVar.a());
        this.i = new File(mi.a(bnVar.getContext(), (TencentMapOptions) null).d(), bzVar.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0 A[Catch: all -> 0x00b9, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x002f, B:10:0x0064, B:14:0x006f, B:16:0x0089, B:18:0x008d, B:20:0x0095, B:22:0x009d, B:27:0x00ac, B:29:0x00b0), top: B:35:0x0001 }] */
    @Override // com.tencent.map.sdk.comps.offlinemap.OfflineItemController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean checkInvalidate() {
        /*
            r7 = this;
            monitor-enter(r7)
            com.tencent.mapsdk.internal.bz r0 = r7.d     // Catch: java.lang.Throwable -> Lb9
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Lab
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb9
            r3.<init>()     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r4 = r0.a     // Catch: java.lang.Throwable -> Lb9
            r3.append(r4)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r4 = java.io.File.separator     // Catch: java.lang.Throwable -> Lb9
            r3.append(r4)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r4 = r0.c     // Catch: java.lang.Throwable -> Lb9
            r3.append(r4)     // Catch: java.lang.Throwable -> Lb9
            int r4 = r0.e     // Catch: java.lang.Throwable -> Lb9
            r3.append(r4)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r4 = ".zip"
            r3.append(r4)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Lb9
            r7.j = r3     // Catch: java.lang.Throwable -> Lb9
            com.tencent.mapsdk.internal.me r3 = r7.c     // Catch: java.lang.Throwable -> Lb9
            if (r3 == 0) goto L6e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb9
            r4.<init>()     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r5 = r0.c     // Catch: java.lang.Throwable -> Lb9
            r4.append(r5)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r5 = "-md5"
            r4.append(r5)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r4 = r3.a(r4)     // Catch: java.lang.Throwable -> Lb9
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb9
            r5.<init>()     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r6 = r0.c     // Catch: java.lang.Throwable -> Lb9
            r5.append(r6)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r6 = "-version"
            r5.append(r6)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> Lb9
            r6 = -1
            int r3 = r3.b(r5, r6)     // Catch: java.lang.Throwable -> Lb9
            int r5 = r0.e     // Catch: java.lang.Throwable -> Lb9
            if (r5 != r3) goto L6c
            if (r4 == 0) goto L6e
            java.lang.String r0 = r0.b     // Catch: java.lang.Throwable -> Lb9
            boolean r0 = r4.equals(r0)     // Catch: java.lang.Throwable -> Lb9
            if (r0 != 0) goto L6e
        L6c:
            r0 = 1
            goto L6f
        L6e:
            r0 = 0
        L6f:
            java.lang.String r3 = "OM"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r5 = "检查是否需要更新:["
            r4.<init>(r5)     // Catch: java.lang.Throwable -> Lb9
            r4.append(r0)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r5 = "]"
            r4.append(r5)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lb9
            com.tencent.mapsdk.internal.kj.c(r3, r4)     // Catch: java.lang.Throwable -> Lb9
            if (r0 != 0) goto La9
            boolean r3 = r7.m     // Catch: java.lang.Throwable -> Lb9
            if (r3 != 0) goto La9
            java.io.File r3 = r7.h     // Catch: java.lang.Throwable -> Lb9
            boolean r3 = r3.exists()     // Catch: java.lang.Throwable -> Lb9
            if (r3 != 0) goto La9
            java.io.File r0 = r7.g     // Catch: java.lang.Throwable -> Lb9
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> Lb9
            if (r0 == 0) goto Lac
            r7.a()     // Catch: java.lang.Throwable -> Lb9
            java.io.File r0 = r7.h     // Catch: java.lang.Throwable -> Lb9
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> Lb9
            if (r0 != 0) goto Lab
            goto Lac
        La9:
            r1 = r0
            goto Lac
        Lab:
            r1 = 0
        Lac:
            com.tencent.mapsdk.internal.by$a r0 = r7.b     // Catch: java.lang.Throwable -> Lb9
            if (r0 == 0) goto Lb7
            com.tencent.mapsdk.internal.by$a r0 = r7.b     // Catch: java.lang.Throwable -> Lb9
            com.tencent.map.sdk.comps.offlinemap.OfflineItem r2 = r7.e     // Catch: java.lang.Throwable -> Lb9
            r0.b(r2, r1)     // Catch: java.lang.Throwable -> Lb9
        Lb7:
            monitor-exit(r7)
            return r1
        Lb9:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.by.checkInvalidate():boolean");
    }

    @Override // com.tencent.map.sdk.comps.offlinemap.OfflineItemController
    public final boolean open() {
        return a(this.n);
    }

    @Override // com.tencent.map.sdk.comps.offlinemap.OfflineItemController
    public final boolean close() {
        return b(this.n);
    }

    @Override // com.tencent.map.sdk.comps.offlinemap.OfflineItemController
    public final void startDownload() {
        if (this.n == null) {
            if (this.a != null) {
                this.a.onStatusChanged(this.e, OfflineStatus.ERROR);
            }
        } else if (this.g.exists()) {
            jy.a((jy.g) new jy.g<Boolean>() { // from class: com.tencent.mapsdk.internal.by.2
                private Boolean a() {
                    return Boolean.valueOf(by.this.a(by.this.n));
                }

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() throws Exception {
                    return Boolean.valueOf(by.this.a(by.this.n));
                }
            }).a((jy.a) new jy.a<Boolean>() { // from class: com.tencent.mapsdk.internal.by.1
                @Override // com.tencent.mapsdk.internal.jy.a, com.tencent.map.tools.Callback
                public final /* synthetic */ void callback(Object obj) {
                    if (((Boolean) obj).booleanValue()) {
                        if (by.this.a != null) {
                            by.this.a.onStatusChanged(by.this.e, OfflineStatus.COMPLETED);
                            return;
                        }
                        return;
                    }
                    by.this.startDownload();
                }

                private void a(Boolean bool) {
                    if (bool.booleanValue()) {
                        if (by.this.a != null) {
                            by.this.a.onStatusChanged(by.this.e, OfflineStatus.COMPLETED);
                            return;
                        }
                        return;
                    }
                    by.this.startDownload();
                }
            });
        } else if (!checkInvalidate() || TextUtils.isEmpty(this.j)) {
            if (this.a != null) {
                this.a.onStatusChanged(this.e, OfflineStatus.ERROR);
            }
        } else {
            if (this.a != null) {
                this.k.a(this.l);
            }
            kj.c(ki.u, "请求下载:[" + this.j + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            this.k.a(this.j, this.l);
            if (this.a != null) {
                this.a.onStatusChanged(this.e, OfflineStatus.READY);
            }
        }
    }

    @Override // com.tencent.map.sdk.comps.offlinemap.OfflineItemController
    public final void stopDownload() {
        if (TextUtils.isEmpty(this.j)) {
            return;
        }
        kj.c(ki.u, "停止下载:[" + this.j + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        this.k.b(this.j);
    }

    @Override // com.tencent.map.sdk.comps.offlinemap.OfflineItemController
    public final boolean removeCache() {
        boolean b2 = kc.b(this.g);
        kj.c(ki.u, "删除[" + this.d.c + "]离线缓存");
        return b2;
    }

    private void a(OfflineStatusChangedListener offlineStatusChangedListener) {
        this.a = offlineStatusChangedListener;
    }

    private void a(a aVar) {
        this.b = aVar;
    }

    final synchronized boolean a(bn bnVar) {
        if (bnVar == null) {
            return false;
        }
        a();
        if (this.h.exists()) {
            bs y = bnVar.y();
            y.d();
            kc.a(this.h, this.i);
            y.e();
            y.f();
            this.m = true;
            if (this.b != null) {
                this.b.a(this.e, true);
            }
            if (this.a != null) {
                this.a.onStatusChanged(this.e, OfflineStatus.OPEN);
            }
            kj.c(ki.u, "开启[" + this.d.c + "]离线");
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean b(bn bnVar) {
        if (this.i.exists() && bnVar != null) {
            bs y = bnVar.y();
            y.d();
            kc.a(this.i, this.h);
            y.e();
            y.f();
            if (this.b != null) {
                this.b.a(this.e, false);
            }
            if (this.a != null) {
                this.a.onStatusChanged(this.e, OfflineStatus.CLOSE);
            }
            this.m = false;
            kj.c(ki.u, "关闭[" + this.d.c + "]离线");
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.g.exists()) {
            try {
                kj.c(ki.u, "开始缓存文件校验...");
                String a2 = ks.a(this.g);
                kj.c(ki.u, "结束缓存文件校验...");
                if (!this.d.b.equals(a2)) {
                    kj.d(ki.u, "缓存文件MD5不一致！");
                    kc.b(this.g);
                    return;
                }
                kc.b(this.h);
                kf.a(this.g, this.h.getParent(), new FilenameFilter() { // from class: com.tencent.mapsdk.internal.by.3
                    @Override // java.io.FilenameFilter
                    public final boolean accept(File file, String str) {
                        return by.this.h.getName().equals(str);
                    }
                });
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void b() {
        this.b = null;
        this.a = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public final class b extends li implements lf {
        private lh c;
        private File d;

        private b() {
        }

        /* synthetic */ b(by byVar, byte b) {
            this();
        }

        @Override // com.tencent.mapsdk.internal.lf
        public final void a(String str) {
            String str2 = by.this.f;
            this.d = new File(str2, this.b + ".tmp");
            kj.c(ki.u, "开始下载:[" + this.d + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            if (by.this.a != null) {
                by.this.a.onStatusChanged(by.this.e, OfflineStatus.START);
            }
        }

        @Override // com.tencent.mapsdk.internal.lf
        public final void b(String str) {
            if (this.d != null) {
                kj.d(ki.u, "取消下载:[" + this.d + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                kc.b(this.d);
            }
            if (by.this.a != null) {
                by.this.a.onStatusChanged(by.this.e, OfflineStatus.CANCEL);
            }
        }

        @Override // com.tencent.mapsdk.internal.lf
        public final void c(String str) {
            if (this.d == null || !this.d.exists()) {
                return;
            }
            kj.c(ki.u, "完成下载:[" + this.d + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            kj.c(ki.u, "创建城市缓存文件:[" + by.this.h + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            kc.b(by.this.h);
            kc.a(this.d, by.this.g);
            by.this.a();
            if (!by.this.h.exists()) {
                kj.d(ki.u, "缓存文件创建失败！");
                return;
            }
            kj.c(ki.u, "解压成功:[" + by.this.h + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            bz bzVar = by.this.d;
            me meVar = by.this.c;
            if (meVar != null) {
                meVar.a(bzVar.c + "-md5", bzVar.b);
                meVar.a(bzVar.c + "-version", bzVar.e);
            }
            kj.c(ki.u, "保持城市缓存信息:[" + bzVar + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            by.this.k.b(by.this.l);
            if (by.this.b != null) {
                by.this.b.a(by.this.e, 100);
                by.this.b.b(by.this.e, false);
            }
            if (by.this.a != null) {
                by.this.a.onStatusChanged(by.this.e, OfflineStatus.COMPLETED);
            }
        }

        @Override // com.tencent.mapsdk.internal.lf
        public final void a(String str, byte[] bArr) {
            if (TextUtils.isEmpty(str) || !str.equals(by.this.j) || bArr == null) {
                return;
            }
            if (this.c == lh.RUNNING && this.d != null) {
                int length = (int) ((this.d.length() * 100) / by.this.d.d);
                if (by.this.b != null) {
                    by.this.b.a(by.this.e, length);
                }
                kj.c(ki.u, "缓存文件下载中:：length: " + this.d.length() + "：" + length + "%");
                kc.b(this.d, bArr);
            }
            if (by.this.a != null) {
                by.this.a.onStatusChanged(by.this.e, OfflineStatus.DOWNLOADING);
            }
        }

        @Override // com.tencent.mapsdk.internal.lf
        public final void d(String str) {
            if (this.d != null) {
                kj.d(ki.u, "缓存文件下载失败！");
                kc.b(this.d);
            }
            if (by.this.a != null) {
                by.this.a.onStatusChanged(by.this.e, OfflineStatus.ERROR);
            }
        }

        @Override // com.tencent.mapsdk.internal.lf
        public final void a(lh lhVar) {
            kj.c(ki.u, "下载状态：".concat(String.valueOf(lhVar)));
            this.c = lhVar;
        }
    }
}
