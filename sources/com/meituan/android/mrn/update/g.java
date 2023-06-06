package com.meituan.android.mrn.update;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.unionid.oneid.monitor.MonitorManager;
import com.meituan.android.mrn.engine.y;
import com.meituan.android.mrn.monitor.m;
import com.meituan.android.mrn.update.ResponseBundle;
import com.meituan.android.mrn.update.d;
import com.meituan.android.mrn.utils.p;
import com.meituan.dio.easy.DioFile;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class g {
    public static ChangeQuickRedirect a;
    b b;
    List<d> c;

    public static /* synthetic */ void a(g gVar, d.a aVar, ResponseBundle responseBundle, d dVar) {
        Object[] objArr = {aVar, responseBundle, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "ec5ca5dcb565a795858692fcdb10a344", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "ec5ca5dcb565a795858692fcdb10a344");
        } else if (responseBundle != null) {
            if (aVar.g) {
                try {
                    com.meituan.android.mrn.monitor.g.a().c(responseBundle.name).b(responseBundle.name).d(responseBundle.version).a("type", aVar.d == f.DIFF ? "DioPatch" : "dio").a("hash", responseBundle.getHash(aVar.d)).a("errorCode", Integer.toString(aVar.c.b)).a(false);
                    gVar.a(responseBundle, false, aVar.d, -1L, aVar.c.b);
                } catch (Throwable th) {
                    com.meituan.android.mrn.utils.c.a("mrn_bundle_onBundleInstallFail_report_error", th);
                }
            }
            if (gVar.c != null) {
                for (d dVar2 : gVar.c) {
                    dVar2.a(aVar);
                }
            }
            if (dVar != null) {
                dVar.a(aVar);
            }
        }
    }

    public static /* synthetic */ void a(g gVar, f fVar, a aVar, ResponseBundle responseBundle, ResponseBundle.BundleDiff bundleDiff, e eVar, boolean z, boolean z2, d dVar, File file, long j, int i, int i2) {
        Object[] objArr = {fVar, aVar, responseBundle, bundleDiff, eVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), dVar, file, new Long(j), Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "63c17bf2de5975ab90a03e0a2c5f2e46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "63c17bf2de5975ab90a03e0a2c5f2e46");
            return;
        }
        if (!gVar.b.a(responseBundle.name, responseBundle.version)) {
            p.a("[BundleInstaller@handleBundleInstallSuccess]", String.format("installBundleFromDioFile name=%s version=%s zipUrl=%s", responseBundle.name, responseBundle.version, responseBundle.url));
            if (!gVar.b.a(responseBundle.name, responseBundle.version, file, eVar)) {
                try {
                    com.meituan.android.mrn.utils.k.d(gVar.b.b(responseBundle.name, responseBundle.version));
                } catch (IOException e) {
                    e.printStackTrace();
                    com.meituan.android.mrn.utils.c.a("mrn_bundle_local_install_report_error", e);
                }
                aVar.b(101);
                return;
            }
        }
        gVar.a(new d.c(responseBundle, responseBundle.name, responseBundle.version, bundleDiff == null ? null : bundleDiff.oldVersion, file, fVar, z, z2, j, i, i2, aVar.l), responseBundle, dVar);
    }

    public g(Context context, b bVar) {
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6811612c658e889d0c14b5cddb9fdfc0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6811612c658e889d0c14b5cddb9fdfc0");
            return;
        }
        this.c = new ArrayList();
        this.b = bVar;
        com.sankuai.meituan.bundle.service.h hVar = new com.sankuai.meituan.bundle.service.h();
        hVar.a = 60000;
        hVar.b = true;
        com.sankuai.meituan.bundle.service.b.a(context, 101, hVar);
    }

    private void b(final ResponseBundle responseBundle, final boolean z, final d dVar, e eVar) {
        e eVar2;
        Object[] objArr = {responseBundle, Byte.valueOf(z ? (byte) 1 : (byte) 0), dVar, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20694fe002548d9fc453d1f888354644", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20694fe002548d9fc453d1f888354644");
        } else if (responseBundle == null) {
        } else {
            if (eVar == null) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                eVar2 = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "78e7dd613a21f7056bcb2050799e0d94", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "78e7dd613a21f7056bcb2050799e0d94") : new e();
            } else {
                eVar2 = eVar;
            }
            if (!this.b.a(responseBundle.name, responseBundle.version, responseBundle.isMetaType)) {
                p.a("DioBundleInstaller", "bundle " + responseBundle.getShortBundleInfo() + " 已经存在，直接回调");
                a(f.LOCAL, responseBundle, dVar);
                a(new d.c(responseBundle, responseBundle.name, responseBundle.version, null, null, f.LOCAL, z, false, -1L, -1, -1, false), responseBundle, dVar);
            } else if (responseBundle.hasDiff()) {
                a(f.DIFF, responseBundle, dVar);
                Object[] objArr3 = {responseBundle, Byte.valueOf(z ? (byte) 1 : (byte) 0), dVar, eVar2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b4f44c994a96c6e2df186e7af7751875", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b4f44c994a96c6e2df186e7af7751875");
                } else if (responseBundle != null) {
                    p.a("DioBundleInstaller", String.format("开始增量安装 bundle: %s, bringToFront: %s", responseBundle.getShortBundleInfo(), Boolean.valueOf(z)));
                    final ResponseBundle.BundleDiff bundleDiff = responseBundle.diff;
                    com.sankuai.meituan.bundle.service.a aVar = new com.sankuai.meituan.bundle.service.a();
                    aVar.a = bundleDiff.md5;
                    aVar.b = bundleDiff.url;
                    com.sankuai.meituan.bundle.service.a aVar2 = new com.sankuai.meituan.bundle.service.a();
                    aVar2.a = responseBundle.md5;
                    com.sankuai.meituan.bundle.service.a aVar3 = new com.sankuai.meituan.bundle.service.a();
                    aVar3.c = Uri.fromFile(this.b.c(responseBundle.name, bundleDiff.oldVersion)).toString();
                    com.sankuai.meituan.bundle.service.g gVar = new com.sankuai.meituan.bundle.service.g();
                    gVar.b = z;
                    gVar.e = false;
                    gVar.f = this.b.b(responseBundle.name, responseBundle.version).toString();
                    gVar.c = eVar2.c;
                    final e eVar3 = eVar2;
                    com.sankuai.meituan.bundle.service.b.a(101, aVar, aVar2, aVar3, gVar, new a() { // from class: com.meituan.android.mrn.update.g.1
                        public static ChangeQuickRedirect b;

                        @Override // com.meituan.android.mrn.update.a
                        public final void b(int i) {
                            Object[] objArr4 = {Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect4 = b;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c58080808c488f4a5b3b0768fc5eda06", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c58080808c488f4a5b3b0768fc5eda06");
                            } else if (g.this.b.a(responseBundle.name, responseBundle.version)) {
                                p.a("DioBundleInstaller", String.format("重复增量安装 bundle: %s, error: %s, bringToFront: %s, url: %s", responseBundle.getShortBundleInfo(), Integer.valueOf(i), Boolean.valueOf(z), responseBundle.getUrl(f.DIFF)));
                                g.this.a(new d.c(responseBundle, responseBundle.name, responseBundle.version, bundleDiff.oldVersion, g.this.b.b(responseBundle.name, responseBundle.version), f.DIFF, z, false, -1L, -1, -1, false), responseBundle, dVar);
                            } else {
                                p.a("DioBundleInstaller", String.format("增量安装失败 bundle: %s, error: %s, bringToFront: %s, url: %s", responseBundle.getShortBundleInfo(), Integer.valueOf(i), Boolean.valueOf(z), responseBundle.getUrl(f.DIFF)));
                                com.meituan.android.mrn.monitor.g a2 = com.meituan.android.mrn.monitor.g.a().c(responseBundle.name).b(responseBundle.name).d(responseBundle.version).a(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, String.valueOf(i)).a("patch_from", bundleDiff.oldVersion);
                                a2.d = responseBundle.getHash(f.DIFF);
                                a2.b(false);
                                g.this.a(responseBundle, z, dVar, eVar3, false);
                            }
                        }

                        @Override // com.meituan.android.mrn.update.a
                        public final void a(File file, long j, int i, int i2) {
                            Object[] objArr4 = {file, new Long(j), Integer.valueOf(i), Integer.valueOf(i2)};
                            ChangeQuickRedirect changeQuickRedirect4 = b;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d7e3ff09d18a6563c2ed29501434365d", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d7e3ff09d18a6563c2ed29501434365d");
                            } else {
                                g.a(g.this, f.DIFF, this, responseBundle, bundleDiff, eVar3, z, false, dVar, file, j, i, i2);
                            }
                        }
                    });
                }
            } else {
                a(f.WHOLE, responseBundle, dVar);
                a(responseBundle, z, dVar, eVar2, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final ResponseBundle responseBundle, final boolean z, final d dVar, final e eVar, final boolean z2) {
        Object[] objArr = {responseBundle, Byte.valueOf(z ? (byte) 1 : (byte) 0), dVar, eVar, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8717139b83b4e41643b0df03c0060437", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8717139b83b4e41643b0df03c0060437");
        } else if (responseBundle == null) {
        } else {
            p.a("DioBundleInstaller", String.format("开始全量安装 bundle: %s, bringToFront: %s", responseBundle.getShortBundleInfo(), Boolean.valueOf(z)));
            com.sankuai.meituan.bundle.service.a aVar = new com.sankuai.meituan.bundle.service.a();
            aVar.a = responseBundle.zipMd5;
            aVar.b = responseBundle.url;
            com.sankuai.meituan.bundle.service.a aVar2 = new com.sankuai.meituan.bundle.service.a();
            aVar2.a = responseBundle.md5;
            final com.sankuai.meituan.bundle.service.g gVar = new com.sankuai.meituan.bundle.service.g();
            gVar.b = z;
            gVar.e = false;
            gVar.f = this.b.b(responseBundle.name, responseBundle.version).toString();
            gVar.c = eVar.c;
            gVar.h = eVar.d;
            com.sankuai.meituan.bundle.service.b.a(101, aVar, aVar2, gVar, new a() { // from class: com.meituan.android.mrn.update.g.2
                public static ChangeQuickRedirect b;

                @Override // com.meituan.android.mrn.update.a
                public final void b(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = b;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1585f58ae0cdaca0952ab39d592fe7dc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1585f58ae0cdaca0952ab39d592fe7dc");
                    } else if (g.this.b.a(responseBundle.name, responseBundle.version)) {
                        p.a("DioBundleInstaller", String.format("重复全量安装 bundle: %s, error: %s, bringToFront: %s, url: %s", responseBundle.getShortBundleInfo(), Integer.valueOf(i), Boolean.valueOf(z), responseBundle.getUrl(f.WHOLE)));
                        g.this.a(new d.c(responseBundle, responseBundle.name, responseBundle.version, null, g.this.b.b(responseBundle.name, responseBundle.version), f.WHOLE, z, z2, -1L, -1, -1, false), responseBundle, dVar);
                    } else if (!z2) {
                        p.a("DioBundleInstaller", String.format("重新全量安装 bundle: %s, error: %s, bringToFront: %s, url: %s", responseBundle.getShortBundleInfo(), Integer.valueOf(i), Boolean.valueOf(z), responseBundle.getUrl(f.WHOLE)));
                        com.meituan.android.mrn.utils.k.c(g.this.b.b(responseBundle.name, responseBundle.version));
                        g.this.a(responseBundle, z, dVar, eVar, true);
                    } else {
                        p.a("DioBundleInstaller", String.format("全量安装失败 bundle: %s, error: %s, bringToFront: %s, url: %s", responseBundle.getShortBundleInfo(), Integer.valueOf(i), Boolean.valueOf(z), responseBundle.getUrl(f.WHOLE)));
                        g.a(g.this, new d.a(responseBundle.name, responseBundle.version, new c(f.WHOLE, i), f.WHOLE, z, z2, true), responseBundle, dVar);
                    }
                }

                @Override // com.meituan.android.mrn.update.a
                public final void a(File file, long j, int i, int i2) {
                    Object[] objArr2 = {file, new Long(j), Integer.valueOf(i), Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = b;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "92742b6dafc548e5cc0d26dfff46f490", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "92742b6dafc548e5cc0d26dfff46f490");
                        return;
                    }
                    DioFile dioFile = new DioFile(file);
                    if (!gVar.h) {
                        if (dioFile.c() && dioFile.o()) {
                            return;
                        }
                        y.a(responseBundle, file);
                    } else if (!dioFile.c() || dioFile.o()) {
                        g.a(g.this, f.WHOLE, this, responseBundle, null, eVar, z, z2, dVar, file, j, i, i2);
                    }
                }
            });
        }
    }

    private void a(f fVar, ResponseBundle responseBundle, d dVar) {
        Object[] objArr = {fVar, responseBundle, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0792d6f15201288384f6c83128012625", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0792d6f15201288384f6c83128012625");
            return;
        }
        d.b bVar = new d.b(responseBundle.name, responseBundle.version, fVar);
        if (dVar != null) {
            dVar.a(bVar);
        }
        if (this.c != null) {
            for (d dVar2 : this.c) {
                dVar2.a(bVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(d.c cVar, ResponseBundle responseBundle, d dVar) {
        Object[] objArr = {cVar, responseBundle, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78567df836198f3ef8818b9270a211fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78567df836198f3ef8818b9270a211fa");
        } else if (responseBundle == null) {
            p.a("DioBundleInstaller", "notifyBundleInstallSuccessListener error: bundle is null");
        } else {
            p.a("DioBundleInstaller", String.format("安装成功 type: %s, bundle: %s, bringToFront: %s", cVar.f, responseBundle.getShortBundleInfo(), Boolean.valueOf(cVar.j)));
            if (cVar.l) {
                try {
                    if (cVar.f == f.DIFF) {
                        com.meituan.android.mrn.monitor.g a2 = com.meituan.android.mrn.monitor.g.a().c(responseBundle.name).b(responseBundle.name).d(responseBundle.version).a(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, "0").a("patch_from", cVar.d);
                        a2.d = responseBundle.getHash(cVar.f);
                        a2.b(true);
                    }
                    com.meituan.android.mrn.monitor.g.a().c(responseBundle.name).b(responseBundle.name).d(responseBundle.version).a("type", cVar.f == f.DIFF ? "DioPatch" : "dio").a("hash", responseBundle.getHash(cVar.f)).a("errorCode", "0").a(MonitorManager.RETRYCOUNT, cVar.k ? "1" : "0").a(true);
                    a(responseBundle, true, cVar.f, System.currentTimeMillis() - cVar.g, 0);
                    final m a3 = m.a();
                    String str = responseBundle.name;
                    String url = responseBundle.getUrl(cVar.f);
                    int i = cVar.i;
                    int i2 = cVar.h;
                    Object[] objArr2 = {str, url, 200, Integer.valueOf(i), Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = m.a;
                    if (PatchProxy.isSupport(objArr2, a3, changeQuickRedirect2, false, "ac1b1b0e22e4de4c93e7614d129563d3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, a3, changeQuickRedirect2, false, "ac1b1b0e22e4de4c93e7614d129563d3");
                    } else if (!TextUtils.isEmpty(str)) {
                        if (a3.b == null) {
                            com.meituan.android.mrn.config.e a4 = com.meituan.android.mrn.config.c.a();
                            int f = a4 != null ? a4.f() : 10;
                            final String n = a4 != null ? a4.n() : "";
                            a3.b = new com.dianping.monitor.impl.a(a3.c.get(), f) { // from class: com.meituan.android.mrn.monitor.m.1
                                @Override // com.dianping.monitor.impl.a
                                public final String getUnionid() {
                                    return n;
                                }
                            };
                        }
                        a3.b.pv(0L, String.format("%s_%s", str, url), 0, 8, 200, 0, i, i2);
                    }
                } catch (Throwable th) {
                    com.meituan.android.mrn.utils.c.a("mrn_bundle_onBundleInstallSuccess_report_error", th);
                }
            }
            if (this.c != null) {
                for (d dVar2 : this.c) {
                    dVar2.a(cVar);
                }
            }
            if (dVar != null) {
                dVar.a(cVar);
            }
        }
    }

    private void a(ResponseBundle responseBundle, boolean z, f fVar, long j, int i) {
        long j2 = j;
        Object[] objArr = {responseBundle, Byte.valueOf(z ? (byte) 1 : (byte) 0), fVar, new Long(j2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bedb9d3dbc110f8eaf9a8a6a430c382", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bedb9d3dbc110f8eaf9a8a6a430c382");
        } else if (responseBundle == null) {
        } else {
            Map<String, Object> d = com.meituan.android.mrn.monitor.g.d();
            d.put("bundle_name", responseBundle.name);
            d.put("bundle_version", responseBundle.version);
            d.put("downloadType", fVar == f.DIFF ? "diff" : "xzip");
            d.put("errorCode", Integer.valueOf(i));
            d.put("success", Integer.valueOf(z ? 1 : 0));
            Log.Builder reportChannel = new Log.Builder("").tag("bundleDownload").optional(d).reportChannel("prism-report-mrn");
            if (!z || j2 <= 0) {
                j2 = 0;
            }
            Babel.logRT(reportChannel.value(j2).lv4LocalStatus(true).build());
        }
    }

    public final void a(final ResponseBundle responseBundle, boolean z, final d dVar, e eVar) {
        d dVar2;
        Object[] objArr = {responseBundle, Byte.valueOf(z ? (byte) 1 : (byte) 0), dVar, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbbf2d173cdfe8a76c8be6198e37f1d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbbf2d173cdfe8a76c8be6198e37f1d3");
        } else if (responseBundle != null) {
            if (responseBundle.meta != null && responseBundle.meta.size() > 0) {
                if (dVar != null) {
                    final int size = responseBundle.meta.size() + 1;
                    final AtomicInteger atomicInteger = new AtomicInteger(0);
                    final AtomicReference atomicReference = new AtomicReference(null);
                    dVar2 = new d() { // from class: com.meituan.android.mrn.update.g.3
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.android.mrn.update.d
                        public final void a(@NonNull d.b bVar) {
                            Object[] objArr2 = {bVar};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e582ad5489c685a55187795175fc0130", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e582ad5489c685a55187795175fc0130");
                            } else if (TextUtils.equals(responseBundle.name, bVar.a)) {
                                dVar.a(bVar);
                            }
                        }

                        @Override // com.meituan.android.mrn.update.d
                        public final void a(@NonNull d.c cVar) {
                            Object[] objArr2 = {cVar};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6f47745e0f6fa9f3a3453f53dbe92cb2", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6f47745e0f6fa9f3a3453f53dbe92cb2");
                                return;
                            }
                            if (TextUtils.equals(responseBundle.name, cVar.b)) {
                                atomicReference.set(cVar);
                            }
                            if (atomicInteger.incrementAndGet() == size) {
                                dVar.a((d.c) atomicReference.get());
                            }
                        }

                        @Override // com.meituan.android.mrn.update.d
                        public final void a(@NonNull d.a aVar) {
                            Object[] objArr2 = {aVar};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "29b2c1effb1a5eb29a1e00a2bdc37faa", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "29b2c1effb1a5eb29a1e00a2bdc37faa");
                            } else if (atomicInteger.get() != -1) {
                                atomicInteger.set(-1);
                                dVar.a(aVar);
                            }
                        }
                    };
                } else {
                    dVar2 = dVar;
                }
                for (ResponseBundle responseBundle2 : responseBundle.meta) {
                    responseBundle2.isMetaType = true;
                    b(responseBundle2, z, dVar2, eVar);
                }
                b(responseBundle, z, dVar2, eVar);
                return;
            }
            b(responseBundle, z, dVar, eVar);
        }
    }
}
