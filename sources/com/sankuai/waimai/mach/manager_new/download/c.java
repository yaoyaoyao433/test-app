package com.sankuai.waimai.mach.manager_new.download;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.meituan.metrics.traffic.reflection.OkHttp2Wrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.sankuai.waimai.mach.common.i;
import com.sankuai.waimai.mach.manager.download.exception.DownloadException;
import com.sankuai.waimai.mach.manager.download.service.FileDownloadService;
import com.sankuai.waimai.mach.manager.download.update.BundleInfo;
import com.sankuai.waimai.mach.manager_new.common.g;
import com.sankuai.waimai.mach.manager_new.common.h;
import com.sankuai.waimai.mach.manager_new.download.a;
import com.squareup.okhttp.t;
import com.squareup.okhttp.v;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class c {
    public static ChangeQuickRedirect a;
    private static final BlockingDeque<Runnable> c = new LinkedBlockingDeque();
    private static final BlockingDeque<Runnable> d = new LinkedBlockingDeque();
    private static ThreadPoolExecutor f;
    private static ThreadPoolExecutor g;
    private final Context b;
    private final FileDownloadService e;
    private final e h;
    private final v i;
    private final com.sankuai.waimai.mach.manager_new.ioq.c j;
    private final ConcurrentHashMap<String, BundleInfo> k;
    private final f l;

    public static /* synthetic */ int a(c cVar, DownloadException downloadException) {
        Object[] objArr = {downloadException};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "483848274484b92315ccf0efb9d4504f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "483848274484b92315ccf0efb9d4504f")).intValue();
        }
        int i = downloadException.c;
        if (i != 5000) {
            if (i != 18014) {
                switch (i) {
                    case com.meituan.android.common.aidata.ai.bundle.download.exception.DownloadException.CANCELED /* 18002 */:
                        return 1;
                    case com.meituan.android.common.aidata.ai.bundle.download.exception.DownloadException.NET_ERROR /* 18003 */:
                        return 2;
                    case com.meituan.android.common.aidata.ai.bundle.download.exception.DownloadException.UNZIP_ERROR /* 18004 */:
                        return 4;
                    default:
                        switch (i) {
                            case com.meituan.android.common.aidata.ai.bundle.download.exception.DownloadException.MD5_VERIFY_FAILED /* 18007 */:
                                return 3;
                            case com.meituan.android.common.aidata.ai.bundle.download.exception.DownloadException.DOWNLOAD_TIME_OUT /* 18008 */:
                                return 5;
                            default:
                                return downloadException.c;
                        }
                }
            }
            return 6;
        }
        return 5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x03ae, code lost:
        if (r14 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d7, code lost:
        if (r14 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0251, code lost:
        if (r14 != null) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03df A[Catch: all -> 0x03ed, TRY_LEAVE, TryCatch #9 {all -> 0x03ed, blocks: (B:23:0x0090, B:114:0x03c1, B:116:0x03df), top: B:135:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.sankuai.waimai.mach.manager_new.download.c r25, com.sankuai.meituan.retrofit2.Response r26, com.sankuai.waimai.mach.manager.download.update.BundleInfo r27) {
        /*
            Method dump skipped, instructions count: 1109
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.mach.manager_new.download.c.a(com.sankuai.waimai.mach.manager_new.download.c, com.sankuai.meituan.retrofit2.Response, com.sankuai.waimai.mach.manager.download.update.BundleInfo):void");
    }

    public static /* synthetic */ void a(c cVar, BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "cb1a592851fd09cf8ba737814663d60e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "cb1a592851fd09cf8ba737814663d60e");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("mach_download_bundle_success");
        intent.putExtra("bundleInfo", bundleInfo);
        LocalBroadcastManager.getInstance(cVar.b).sendBroadcast(intent);
    }

    public static /* synthetic */ void a(c cVar, Throwable th, int i, BundleInfo bundleInfo) {
        Object[] objArr = {th, Integer.valueOf(i), bundleInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "e1fccd6799725f4ea1e56dbbc079d855", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "e1fccd6799725f4ea1e56dbbc079d855");
        } else {
            cVar.l.a(bundleInfo, new DownloadException(i));
        }
    }

    public c(Context context, com.sankuai.waimai.mach.manager_new.ioq.c cVar, e eVar) {
        int i;
        int max;
        ar a2;
        Object[] objArr = {context, cVar, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b05923ccfedfa1f024339b46caf9864", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b05923ccfedfa1f024339b46caf9864");
            return;
        }
        this.l = new com.sankuai.waimai.mach.manager_new.download.b() { // from class: com.sankuai.waimai.mach.manager_new.download.c.2
            public static ChangeQuickRedirect b;

            @Override // com.sankuai.waimai.mach.manager_new.download.b, com.sankuai.waimai.mach.manager_new.download.f
            public final void l(BundleInfo bundleInfo) {
                Object[] objArr2 = {bundleInfo};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1090cc36ce45e1449bd42820bab8c915", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1090cc36ce45e1449bd42820bab8c915");
                    return;
                }
                super.l(bundleInfo);
                Object[] objArr3 = {bundleInfo};
                ChangeQuickRedirect changeQuickRedirect3 = b;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e5efdb57e58275c20099088d16dc4887", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e5efdb57e58275c20099088d16dc4887");
                    return;
                }
                com.sankuai.waimai.mach.manager_new.d.a().a(bundleInfo, 2);
                i.a().e().a(18000, "mach/template/download", b(bundleInfo));
                c.this.k.remove(com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo));
                if (com.sankuai.waimai.mach.manager_new.common.a.c(bundleInfo) && com.sankuai.waimai.machpro.monitor.c.a() != null) {
                    com.sankuai.waimai.machpro.monitor.c a3 = com.sankuai.waimai.machpro.monitor.c.a();
                    String name = bundleInfo.getName();
                    String bundleVersion = bundleInfo.getBundleVersion();
                    Object[] objArr4 = {name, bundleVersion};
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.machpro.monitor.c.a;
                    if (PatchProxy.isSupport(objArr4, a3, changeQuickRedirect4, false, "644ce370fb91df7e6cbd55522c543a49", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, a3, changeQuickRedirect4, false, "644ce370fb91df7e6cbd55522c543a49");
                    } else {
                        HashMap hashMap = new HashMap();
                        hashMap.put("MPBundleDownloadSuccess", 1);
                        Map<String, String> b2 = a3.b();
                        b2.put("bundle_name", name);
                        b2.put("bundle_version", bundleVersion);
                        b2.put("biz", a3.a(name));
                        b2.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, "0");
                        if (a3.b != null) {
                            a3.b.a(hashMap, b2);
                        }
                    }
                } else {
                    a(1, bundleInfo.getMachId(), bundleInfo.getBundleVersion(), h.a().b(), "0", bundleInfo.isRetryDownloadStart(), bundleInfo.isRetryDownloadEnd());
                }
                if (c.this.h != null) {
                    c.this.h.b(bundleInfo);
                }
                a(bundleInfo);
                c.a(c.this, bundleInfo);
            }

            @Override // com.sankuai.waimai.mach.manager_new.download.b, com.sankuai.waimai.mach.manager_new.download.f
            public final void e(BundleInfo bundleInfo, DownloadException downloadException) {
                String str;
                Object[] objArr2 = {bundleInfo, downloadException};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2c29e888b501133b64e2b644fe9beb94", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2c29e888b501133b64e2b644fe9beb94");
                    return;
                }
                super.e(bundleInfo, downloadException);
                Object[] objArr3 = {bundleInfo, downloadException};
                ChangeQuickRedirect changeQuickRedirect3 = b;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d9fd1eb32322fc600919c4af4d538374", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d9fd1eb32322fc600919c4af4d538374");
                    return;
                }
                c.this.k.remove(com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo));
                i.a().e().a(downloadException.c, "mach/template/download", b(bundleInfo));
                if (com.sankuai.waimai.mach.manager_new.common.a.c(bundleInfo) && com.sankuai.waimai.machpro.monitor.c.a() != null) {
                    com.sankuai.waimai.machpro.monitor.c a3 = com.sankuai.waimai.machpro.monitor.c.a();
                    String name = bundleInfo.getName();
                    String bundleVersion = bundleInfo.getBundleVersion();
                    int a4 = c.a(c.this, downloadException);
                    Object[] objArr4 = {name, bundleVersion, Integer.valueOf(a4)};
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.machpro.monitor.c.a;
                    if (PatchProxy.isSupport(objArr4, a3, changeQuickRedirect4, false, "00271f03e342b22ef409f6431c318d3d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, a3, changeQuickRedirect4, false, "00271f03e342b22ef409f6431c318d3d");
                    } else {
                        HashMap hashMap = new HashMap();
                        hashMap.put("MPBundleDownloadSuccess", 0);
                        Map<String, String> b2 = a3.b();
                        b2.put("bundle_name", name);
                        b2.put("bundle_version", bundleVersion);
                        b2.put("biz", a3.a(name));
                        b2.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, String.valueOf(a4));
                        if (a3.b != null) {
                            a3.b.a(hashMap, b2);
                        }
                    }
                } else {
                    String machId = bundleInfo.getMachId();
                    String bundleVersion2 = bundleInfo.getBundleVersion();
                    String b3 = h.a().b();
                    int i2 = downloadException.c;
                    Object[] objArr5 = {Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect5 = DownloadException.a;
                    if (!PatchProxy.isSupport(objArr5, downloadException, changeQuickRedirect5, false, "4e6ee538c172d9a9c8bb30b06f047af9", RobustBitConfig.DEFAULT_VALUE)) {
                        switch (i2) {
                            case com.meituan.android.common.aidata.ai.bundle.download.exception.DownloadException.ILLEGAL_URL /* 18001 */:
                                str = "1";
                                break;
                            case com.meituan.android.common.aidata.ai.bundle.download.exception.DownloadException.CANCELED /* 18002 */:
                                str = "2";
                                break;
                            case com.meituan.android.common.aidata.ai.bundle.download.exception.DownloadException.NET_ERROR /* 18003 */:
                                str = "3";
                                break;
                            case com.meituan.android.common.aidata.ai.bundle.download.exception.DownloadException.UNZIP_ERROR /* 18004 */:
                                str = "5";
                                break;
                            case com.meituan.android.common.aidata.ai.bundle.download.exception.DownloadException.UN_FOUND_FILE /* 18005 */:
                                str = "7";
                                break;
                            case com.meituan.android.common.aidata.ai.bundle.download.exception.DownloadException.UN_KNOWN /* 18006 */:
                            case com.meituan.android.common.aidata.ai.bundle.download.exception.DownloadException.UNZIP_NOT_ZIP_FILE /* 18009 */:
                            case 18010:
                            default:
                                str = "-1";
                                break;
                            case com.meituan.android.common.aidata.ai.bundle.download.exception.DownloadException.MD5_VERIFY_FAILED /* 18007 */:
                                str = "4";
                                break;
                            case com.meituan.android.common.aidata.ai.bundle.download.exception.DownloadException.DOWNLOAD_TIME_OUT /* 18008 */:
                                str = "6";
                                break;
                            case 18011:
                                str = "8";
                                break;
                            case 18012:
                                str = "9";
                                break;
                            case 18013:
                                str = "10";
                                break;
                            case 18014:
                                str = "12";
                                break;
                        }
                    } else {
                        str = (String) PatchProxy.accessDispatch(objArr5, downloadException, changeQuickRedirect5, false, "4e6ee538c172d9a9c8bb30b06f047af9");
                    }
                    a(0, machId, bundleVersion2, b3, str, bundleInfo.isRetryDownloadStart(), bundleInfo.isRetryDownloadEnd());
                }
                if (c.this.h != null) {
                    c.this.h.a(bundleInfo, downloadException);
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("template_id", com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo));
                hashMap2.put("netwok_type", h.a().b());
                i.a().e().a((!bundleInfo.isRetryDownloadStart() || bundleInfo.isRetryDownloadEnd()) ? "mach_v2_download_fault" : "mach_v2_retry_download_fault", "下载失败", downloadException.a(), hashMap2);
                a(bundleInfo);
            }
        };
        this.b = context;
        this.j = cVar;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9671a1661cd408bb936e0cd502bb13b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9671a1661cd408bb936e0cd502bb13b8");
        } else {
            int availableProcessors = Runtime.getRuntime().availableProcessors();
            if (com.sankuai.waimai.mach.manager_new.b.a().d) {
                max = 10;
                i = 20;
            } else {
                i = (availableProcessors * 2) + 1;
                max = availableProcessors == 1 ? availableProcessors : Math.max(2, Math.min(availableProcessors - 1, 4));
            }
            int i2 = max;
            int i3 = i;
            ThreadPoolExecutor a3 = com.sankuai.android.jarvis.c.a("download", i2, i3, 10L, TimeUnit.SECONDS, c, new a("download"));
            f = a3;
            a3.setRejectedExecutionHandler(new b("download"));
            ThreadPoolExecutor a4 = com.sankuai.android.jarvis.c.a("callback", i2, i3, 10L, TimeUnit.SECONDS, d, new a("callback"));
            g = a4;
            a4.setRejectedExecutionHandler(new b("callback"));
            if (com.sankuai.waimai.mach.manager_new.b.a().d) {
                f.prestartCoreThread();
                g.prestartCoreThread();
            }
        }
        v vVar = new v();
        OkHttp2Wrapper.addInterceptorToClient(vVar);
        this.i = com.sankuai.waimai.launcher.util.aop.b.a(vVar);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "eb1b4bae479b10a0df384c3839d9d9ee", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (ar) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "eb1b4bae479b10a0df384c3839d9d9ee");
        } else {
            this.i.a(15L, TimeUnit.SECONDS);
            this.i.b(15L, TimeUnit.SECONDS);
            this.i.c(15L, TimeUnit.SECONDS);
            a2 = new ar.a().a("http://msstestdn.sankuai.com/").a(com.sankuai.meituan.retrofit2.callfactory.okhttp.a.a(this.i)).a();
        }
        this.e = (FileDownloadService) a2.a(FileDownloadService.class);
        this.h = eVar;
        this.k = new ConcurrentHashMap<>();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class b implements RejectedExecutionHandler {
        public static ChangeQuickRedirect a;
        private final String b;

        public b(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a60f0db7346674ae779462dd2edbbb74", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a60f0db7346674ae779462dd2edbbb74");
            } else {
                this.b = str;
            }
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            Object[] objArr = {runnable, threadPoolExecutor};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc354a47bdf64a8a087fa240d059bdf5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc354a47bdf64a8a087fa240d059bdf5");
                return;
            }
            com.sankuai.waimai.mach.e e = i.a().e();
            if (e != null) {
                HashMap hashMap = new HashMap();
                hashMap.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, Integer.valueOf((int) com.meituan.android.common.aidata.ai.bundle.download.exception.DownloadException.UN_KNOWN));
                hashMap.put("thread_name", this.b);
                e.a("mach_template_download", "线程池已满", "线程池已满，模板下载失败", hashMap);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements ThreadFactory {
        public static ChangeQuickRedirect a;
        private final AtomicInteger b;
        private final String c;

        public a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f8ffcf9310e83f168e1c23eae217830", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f8ffcf9310e83f168e1c23eae217830");
                return;
            }
            this.b = new AtomicInteger(1);
            this.c = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(@NonNull Runnable runnable) {
            Object[] objArr = {runnable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2df2feb9c2f67cd452d4f6bee6bc27f", RobustBitConfig.DEFAULT_VALUE)) {
                return (Thread) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2df2feb9c2f67cd452d4f6bee6bc27f");
            }
            String str = "mach-" + this.c + "#" + this.b.getAndIncrement();
            Thread a2 = com.sankuai.android.jarvis.c.a(str, runnable);
            com.sankuai.waimai.mach.manager_new.common.c.e("mach-thread " + str + StringUtil.SPACE + a2.getId());
            return a2;
        }
    }

    public final void a(t tVar) {
        Object[] objArr = {tVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d6d3f5166856f4f30f125087ee8f223", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d6d3f5166856f4f30f125087ee8f223");
        } else if (this.i != null) {
            this.i.g.add(tVar);
        }
    }

    private boolean d(BundleInfo bundleInfo) {
        boolean z;
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44ad3b34a31e32798f98b29dea1700d6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44ad3b34a31e32798f98b29dea1700d6")).booleanValue();
        }
        if (bundleInfo != null && !TextUtils.isEmpty(bundleInfo.getMachId()) && !TextUtils.isEmpty(bundleInfo.getName())) {
            Object[] objArr2 = {bundleInfo};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b97c1b4183a41db935f00081e5fd7860", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b97c1b4183a41db935f00081e5fd7860")).booleanValue();
            } else {
                z = (TextUtils.isEmpty(bundleInfo.getBundleVersion()) && TextUtils.isEmpty(bundleInfo.getVersion())) ? false : true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final void a(List<BundleInfo> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2048a9b783ae533b36a92c0cb4234efa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2048a9b783ae533b36a92c0cb4234efa");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            BundleInfo bundleInfo = list.get(i);
            if (bundleInfo != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (!com.sankuai.waimai.mach.manager_new.b.a().a(bundleInfo) && !this.k.containsKey(com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo))) {
                    a(bundleInfo);
                }
                com.sankuai.waimai.mach.manager_new.common.c.d("Archived | " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " | " + com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo));
            }
        }
    }

    public final void a(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30fa0aabe6ac25be7095773de8f78b4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30fa0aabe6ac25be7095773de8f78b4e");
        } else if (bundleInfo != null && g.a(bundleInfo.getMachId())) {
            if (this.k.putIfAbsent(com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo), bundleInfo) != null) {
                com.sankuai.waimai.mach.manager_new.common.c.e("下载队列中已经有bundle了 | " + com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo));
                return;
            }
            this.l.c(bundleInfo);
            if (!d(bundleInfo)) {
                this.l.a(bundleInfo, new DownloadException(18020));
            } else if (!com.sankuai.waimai.mach.utils.e.b(this.b)) {
                this.l.a(bundleInfo, new DownloadException(18021));
            } else if (!com.sankuai.waimai.mach.utils.e.b(bundleInfo.getUrl())) {
                this.l.a(bundleInfo, new DownloadException(com.meituan.android.common.aidata.ai.bundle.download.exception.DownloadException.ILLEGAL_URL));
            } else {
                e(bundleInfo);
            }
        }
    }

    private void e(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba0c6fea139595a8a6908d0cffb0df6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba0c6fea139595a8a6908d0cffb0df6a");
            return;
        }
        com.sankuai.waimai.mach.manager_new.common.c.a("bundle-submit-download");
        this.l.d(bundleInfo);
        if (c.size() >= 128) {
            com.sankuai.waimai.mach.e e = i.a().e();
            if (e != null) {
                HashMap hashMap = new HashMap();
                hashMap.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, Integer.valueOf((int) com.meituan.android.common.aidata.ai.bundle.download.exception.DownloadException.UN_KNOWN));
                hashMap.put("thread_name", "download");
                e.a("mach_template_download", "线程池满载", "下载线程池满载", hashMap);
            }
            com.sankuai.waimai.mach.manager_new.common.c.f("线程池满载，下载线程池满载，等待任务数量 | " + c.size());
        }
        f(bundleInfo).a();
        com.sankuai.waimai.mach.manager_new.common.c.a();
    }

    private com.sankuai.waimai.mach.manager_new.download.a f(final BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4de5508c9cec57d3b27d495b0d4d8d86", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.manager_new.download.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4de5508c9cec57d3b27d495b0d4d8d86");
        }
        a.C1018a c1018a = new a.C1018a(this.e, bundleInfo);
        c1018a.c = f;
        c1018a.d = g;
        c1018a.b = new a.b() { // from class: com.sankuai.waimai.mach.manager_new.download.c.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.manager_new.download.a.b
            public final void a(Response<ap> response) {
                Object[] objArr2 = {response};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5ee37d9205128c63a2738811a51a3264", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5ee37d9205128c63a2738811a51a3264");
                    return;
                }
                c.a(c.this, response, bundleInfo);
                if (bundleInfo.isRetryDownloadStart()) {
                    bundleInfo.setRetryDownloadEnd(true);
                }
            }

            @Override // com.sankuai.waimai.mach.manager_new.download.a.b
            public final void a(Throwable th, int i) {
                Object[] objArr2 = {th, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6a26bf1ac0d246ab1d7fd886ff2bf94e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6a26bf1ac0d246ab1d7fd886ff2bf94e");
                    return;
                }
                c.a(c.this, th, i, bundleInfo);
                if (bundleInfo.isRetryDownloadStart()) {
                    bundleInfo.setRetryDownloadEnd(true);
                    return;
                }
                bundleInfo.setRetryDownloadStart(true);
                c.this.a(bundleInfo);
            }
        };
        return c1018a.a();
    }

    public final boolean b(@NonNull BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36be249df67fcef4d2e82e554715b2e8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36be249df67fcef4d2e82e554715b2e8")).booleanValue();
        }
        com.sankuai.waimai.mach.manager_new.download.a f2 = f(bundleInfo);
        if (c.removeLastOccurrence(f2)) {
            if (c.offerFirst(f2)) {
                return true;
            }
            com.sankuai.waimai.mach.manager_new.common.c.b("将下载任务往前提时出错，任务已从队列移除但是无法将任务放回队首");
            return false;
        }
        return false;
    }

    private boolean a(Response<ap> response, File file) {
        FileOutputStream fileOutputStream;
        Object[] objArr = {response, file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92a8a8130264d1af5daa138a126c69fc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92a8a8130264d1af5daa138a126c69fc")).booleanValue();
        }
        InputStream inputStream = null;
        if (file != null) {
            try {
                if (file.exists()) {
                    InputStream source = response.e().source();
                    try {
                        fileOutputStream = new FileOutputStream(file);
                        try {
                            long a2 = com.sankuai.waimai.mach.manager_new.common.b.a(source, fileOutputStream);
                            fileOutputStream.getFD().sync();
                            if (a2 == response.e().contentLength()) {
                                com.sankuai.waimai.mach.manager_new.common.b.a(source);
                                com.sankuai.waimai.mach.manager_new.common.b.a(fileOutputStream);
                                return true;
                            }
                            com.sankuai.waimai.mach.manager_new.common.c.b("网络流保存到文件，长度不相等");
                            com.sankuai.waimai.mach.manager_new.common.b.a(source);
                            com.sankuai.waimai.mach.manager_new.common.b.a(fileOutputStream);
                            return false;
                        } catch (Exception e) {
                            e = e;
                            inputStream = source;
                            try {
                                com.sankuai.waimai.mach.manager_new.common.c.b("save2TempFile" + e.getMessage());
                                com.sankuai.waimai.mach.manager_new.common.b.a(inputStream);
                                com.sankuai.waimai.mach.manager_new.common.b.a(fileOutputStream);
                                return false;
                            } catch (Throwable th) {
                                th = th;
                                com.sankuai.waimai.mach.manager_new.common.b.a(inputStream);
                                com.sankuai.waimai.mach.manager_new.common.b.a(fileOutputStream);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            inputStream = source;
                            com.sankuai.waimai.mach.manager_new.common.b.a(inputStream);
                            com.sankuai.waimai.mach.manager_new.common.b.a(fileOutputStream);
                            throw th;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        fileOutputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream = null;
                    }
                }
            } catch (Exception e3) {
                e = e3;
                fileOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
            }
        }
        com.sankuai.waimai.mach.manager_new.common.c.b("临时文件不存在");
        com.sankuai.waimai.mach.manager_new.common.b.a((Closeable) null);
        com.sankuai.waimai.mach.manager_new.common.b.a((Closeable) null);
        return false;
    }

    private String a(@NonNull BundleInfo bundleInfo, Exception exc) {
        Object[] objArr = {bundleInfo, exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "275714ebba0036d0ad1164f598a23f0a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "275714ebba0036d0ad1164f598a23f0a");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("bundleInfo", com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo));
        if (!TextUtils.isEmpty(exc.getMessage())) {
            hashMap.put("errorMessage", exc.getMessage());
        } else if (!TextUtils.isEmpty(exc.toString())) {
            hashMap.put("errorMessage", exc.toString());
        }
        return new JSONObject(hashMap).toString();
    }

    public final boolean c(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13ffe669f3746b5c33f5d1f9f7f4cbd2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13ffe669f3746b5c33f5d1f9f7f4cbd2")).booleanValue();
        }
        if (bundleInfo != null) {
            return this.k.containsKey(com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo));
        }
        return false;
    }
}
