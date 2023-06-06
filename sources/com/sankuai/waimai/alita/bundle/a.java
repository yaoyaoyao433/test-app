package com.sankuai.waimai.alita.bundle;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.android.cipstorage.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.bundle.cache.a;
import com.sankuai.waimai.alita.bundle.checkupdate.AlitaCheckUpdateResponse;
import com.sankuai.waimai.alita.bundle.checkupdate.AlitaCheckUpdateStatus;
import com.sankuai.waimai.alita.bundle.checkupdate.a;
import com.sankuai.waimai.alita.bundle.download.a;
import com.sankuai.waimai.alita.bundle.download.exception.DownloadException;
import com.sankuai.waimai.alita.bundle.download.model.DownloadInfo;
import com.sankuai.waimai.alita.bundle.download.update.BundleInfo;
import com.sankuai.waimai.alita.core.base.util.AlitaBundleUtil;
import com.sankuai.waimai.alita.core.utils.a;
import com.sankuai.waimai.alita.core.utils.f;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static a j;
    public boolean b;
    public volatile com.sankuai.waimai.alita.bundle.download.a c;
    public volatile com.sankuai.waimai.alita.bundle.cache.a d;
    public final Map<String, com.sankuai.waimai.alita.bundle.cache.c> e;
    public final Map<String, ReentrantReadWriteLock> f;
    public AbstractC0689a g;
    public volatile boolean h;
    @AlitaCheckUpdateStatus.State
    public int i;
    private final List<String> k;
    private final Map<String, List<BundleInfo>> l;
    private final Set<BundleInfo> m;
    private final List<String> n;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface c {
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae9be179659a48c155b3b7ad4cc0e32e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae9be179659a48c155b3b7ad4cc0e32e");
            return;
        }
        this.e = new ConcurrentHashMap();
        this.f = new ConcurrentHashMap();
        this.k = new ArrayList();
        this.h = false;
        this.l = new ConcurrentHashMap();
        this.m = new CopyOnWriteArraySet();
        this.n = new ArrayList();
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ee8e052d80fd2d7b959191c066f6d065", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ee8e052d80fd2d7b959191c066f6d065");
        }
        if (j == null) {
            synchronized (a.class) {
                if (j == null) {
                    j = new a();
                }
            }
        }
        return j;
    }

    public final void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f62534d0212fd272e6ba9a47041d61e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f62534d0212fd272e6ba9a47041d61e8");
        } else {
            x.a(context, "alita_bundles", u.e, AlitaMonitorCenter.AlitaExceptionMonitorConst.BUSINESS);
        }
    }

    public final void a(AlitaCheckUpdateResponse alitaCheckUpdateResponse, boolean z) {
        Object[] objArr = {alitaCheckUpdateResponse, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "777d24e0249803dc19a7d9707bcc5fec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "777d24e0249803dc19a7d9707bcc5fec");
        } else if (this.h && alitaCheckUpdateResponse != null && alitaCheckUpdateResponse.body != null) {
            List<BundleInfo> list = alitaCheckUpdateResponse.body.b;
            if (list != null && !list.isEmpty()) {
                com.sankuai.waimai.alita.core.utils.c.a("AlitaBundle", "handleUpdateResponse response bundleList: " + list + " isCache :" + z);
                b();
                if (!z) {
                    this.i = 2;
                }
                a(list);
                com.sankuai.waimai.alita.core.utils.c.a("AlitaBundle", "handleUpdateResponse 2 saveAll :" + this.n);
                b(list);
                com.sankuai.waimai.alita.core.utils.c.a("AlitaBundle", "handleUpdateResponse 3 过滤出Lazy-download的模板 :" + this.m);
                List<BundleInfo> c2 = c(list);
                com.sankuai.waimai.alita.core.utils.c.a("AlitaBundle", "handleUpdateResponse 4 过滤掉本地已有的模板:" + c2);
                a("startup", c2);
                com.sankuai.waimai.alita.core.utils.c.a("AlitaBundle", "handleUpdateResponse 5 按照Tag进行分组 :" + this.l);
                c();
            } else {
                this.i = 3;
            }
            if (z) {
                return;
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9d1a049099bfd40dbcb2bce09fb93ec6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9d1a049099bfd40dbcb2bce09fb93ec6");
            } else if (this.n.isEmpty()) {
            } else {
                List<String> list2 = this.n;
                Object[] objArr3 = {list2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "027c9c7ec866b87271c410b619a36322", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "027c9c7ec866b87271c410b619a36322");
                } else if (this.d != null) {
                    this.d.a(list2);
                }
            }
        } else {
            this.i = 3;
        }
    }

    public final String b(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d883f6365f8117a0a681ae1c39857acf", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d883f6365f8117a0a681ae1c39857acf") : q.a(context, "alita_bundles", AlitaMonitorCenter.AlitaExceptionMonitorConst.BUSINESS, u.e).getAbsolutePath();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.alita.bundle.a$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass1 implements a.InterfaceC0692a {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.alita.bundle.checkupdate.a.InterfaceC0692a
        public final void a(AlitaCheckUpdateResponse alitaCheckUpdateResponse) {
            Object[] objArr = {alitaCheckUpdateResponse};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "098c0657bc2d59f4204699a7471d2798", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "098c0657bc2d59f4204699a7471d2798");
            } else {
                a.a().a(alitaCheckUpdateResponse, false);
            }
        }

        @Override // com.sankuai.waimai.alita.bundle.checkupdate.a.InterfaceC0692a
        public final void b(AlitaCheckUpdateResponse alitaCheckUpdateResponse) {
            Object[] objArr = {alitaCheckUpdateResponse};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee4e5ef898f439988701bdb61e24ad5a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee4e5ef898f439988701bdb61e24ad5a");
            } else {
                a.a().a(alitaCheckUpdateResponse, true);
            }
        }

        @Override // com.sankuai.waimai.alita.bundle.checkupdate.a.InterfaceC0692a
        public final void a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65cf8ee3107525a892df1ea48c2ac0f2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65cf8ee3107525a892df1ea48c2ac0f2");
            } else {
                a.a().i = i;
            }
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b95dfceea71a17ebb6dfa6b4c012454d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b95dfceea71a17ebb6dfa6b4c012454d");
        } else if (this.h) {
            this.e.clear();
            this.c.a();
        }
    }

    private void a(List<BundleInfo> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3080ec1358baa3b9fd2dd6909194c4c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3080ec1358baa3b9fd2dd6909194c4c2");
            return;
        }
        for (BundleInfo bundleInfo : list) {
            if (bundleInfo != null) {
                this.n.add(bundleInfo.getJsId());
            }
        }
    }

    private void b(List<BundleInfo> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d13c74900d4a53812c13d89196d08d73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d13c74900d4a53812c13d89196d08d73");
        } else if (list != null && !list.isEmpty()) {
            if (!this.m.isEmpty()) {
                this.m.clear();
            }
            for (BundleInfo bundleInfo : list) {
                if (bundleInfo != null) {
                    String tags = bundleInfo.getTags();
                    if (!TextUtils.isEmpty(tags) && tags.contains("lazy-download")) {
                        this.m.add(bundleInfo);
                    }
                }
            }
        }
    }

    private void a(String str, List<BundleInfo> list) {
        String[] split;
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa4a933ebec014ea1328045870f7a36b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa4a933ebec014ea1328045870f7a36b");
            return;
        }
        if (!this.l.isEmpty()) {
            this.l.clear();
        }
        for (BundleInfo bundleInfo : list) {
            if (!bundleInfo.hasTag()) {
                bundleInfo.setTags(str);
            }
            for (String str2 : bundleInfo.getTags().contains(";") ? bundleInfo.getTags().split(";") : new String[]{bundleInfo.getTags()}) {
                if (!this.l.containsKey(str2)) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(bundleInfo);
                    this.l.put(str2, arrayList);
                } else {
                    this.l.get(str2).add(bundleInfo);
                }
            }
        }
    }

    private List<BundleInfo> c(List<BundleInfo> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc28af5e4e24901a00a820873d86c2ce", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc28af5e4e24901a00a820873d86c2ce");
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            BundleInfo bundleInfo = list.get(i);
            boolean a2 = this.d.a(bundleInfo);
            if (a2 && this.b) {
                com.sankuai.waimai.alita.core.utils.c.a("AlitaBundle", "本地缓存中已存在[" + bundleInfo.getJsId() + "] 此次无需下载");
            }
            if (!a2) {
                arrayList.add(bundleInfo);
                this.f.put(bundleInfo.getJsId(), new ReentrantReadWriteLock());
            }
        }
        if (this.b) {
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.sankuai.waimai.alita.core.utils.c.a("AlitaBundle", "需要下载的bundle[" + ((BundleInfo) it.next()).getJsId() + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                }
            } else {
                com.sankuai.waimai.alita.core.utils.c.a("AlitaBundle", "downloadList集合为空,此次无需下载模板");
            }
        }
        return arrayList;
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d8f7991fe516f6e9b9d696f2e40945b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d8f7991fe516f6e9b9d696f2e40945b");
            return;
        }
        c("startup");
        for (String str : this.k) {
            a(str);
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7809bef9ee863b13d1a593e01431ba9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7809bef9ee863b13d1a593e01431ba9");
        } else if (!this.h || this.l.isEmpty() || TextUtils.isEmpty(str)) {
            c(str);
        } else {
            List<BundleInfo> list = this.l.get(str);
            com.sankuai.waimai.alita.core.utils.c.a("AlitaBundle", "分tag下载，tag:" + str + ", bundleInfoList：" + list);
            b(str, list);
            b(str);
        }
    }

    public final void a(final String str, final String str2, final a.InterfaceC0691a interfaceC0691a) {
        Object[] objArr = {str, str2, interfaceC0691a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0939458597662d7e157a9f66a80007fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0939458597662d7e157a9f66a80007fa");
            return;
        }
        Object[] objArr2 = {interfaceC0691a, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        a.InterfaceC0691a interfaceC0691a2 = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "95bc2aca00b85af6fd0f2b71c24fc08b", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0691a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "95bc2aca00b85af6fd0f2b71c24fc08b") : new a.InterfaceC0691a() { // from class: com.sankuai.waimai.alita.bundle.a.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.alita.bundle.cache.a.InterfaceC0691a
            public final void a(@NonNull com.sankuai.waimai.alita.bundle.model.a aVar) {
                Object[] objArr3 = {aVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "46bfb7dab2cc88f91a280e86eacb677e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "46bfb7dab2cc88f91a280e86eacb677e");
                    return;
                }
                if (a.InterfaceC0691a.this != null) {
                    a.InterfaceC0691a.this.a(aVar);
                }
                com.sankuai.waimai.alita.core.utils.c.a("异步 bundle 加载 | 成功 | bundleId：" + str + " | 版本：" + aVar.d);
                AlitaMonitorCenter.getCenter().getMonitor().availabilityLogBuilder(AlitaMonitorCenter.AlitaMonitorConst.BundleLoad.MONITOR_KEY, 1, AlitaBundleUtil.a(str)).errorCode(AlitaMonitorCenter.AlitaMonitorConst.BundleLoad.TAG_VALUE_ERROR_CODE_SUCCESS).bundleId(str).addTags(AlitaMonitorCenter.AlitaMonitorConst.BundleLoad.TAG_KEY_RESOURCE_TYPE, str2).commit();
            }

            @Override // com.sankuai.waimai.alita.bundle.cache.a.InterfaceC0691a
            public final void a(@NonNull com.sankuai.waimai.alita.bundle.cache.b bVar) {
                String str3;
                Object[] objArr3 = {bVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7c119c307e3b3103b985d0847f1a0a75", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7c119c307e3b3103b985d0847f1a0a75");
                    return;
                }
                if (a.InterfaceC0691a.this != null) {
                    a.InterfaceC0691a.this.a(bVar);
                }
                com.sankuai.waimai.alita.core.utils.c.a("异步 bundle 加载 | 失败 | bundleId：" + str);
                int i = bVar.d;
                if (i != 0) {
                    switch (i) {
                        case 2:
                        case 3:
                            str3 = AlitaMonitorCenter.AlitaMonitorConst.BundleLoad.TAG_VALUE_ERROR_CODE_FAILED_DOWNLOADING;
                            break;
                        case 4:
                        case 5:
                        case 6:
                            str3 = AlitaMonitorCenter.AlitaMonitorConst.BundleLoad.TAG_VALUE_ERROR_CODE_FAILED_DOWNLOAD_ERROR;
                            break;
                        default:
                            str3 = "-1";
                            break;
                    }
                } else {
                    str3 = AlitaMonitorCenter.AlitaMonitorConst.BundleLoad.TAG_VALUE_ERROR_CODE_FAILED_CHECK_ERROR;
                }
                AlitaMonitorCenter.getCenter().getMonitor().availabilityLogBuilder(AlitaMonitorCenter.AlitaMonitorConst.BundleLoad.MONITOR_KEY, 0, AlitaBundleUtil.a(str)).errorCode(str3).bundleId(str).addTags(AlitaMonitorCenter.AlitaMonitorConst.BundleLoad.TAG_KEY_RESOURCE_TYPE, str2).commit();
            }
        };
        if (!this.h) {
            interfaceC0691a2.a(new com.sankuai.waimai.alita.bundle.cache.b(6));
            return;
        }
        AbstractC0689a abstractC0689a = this.g;
        AbstractC0689a.C0690a c0690a = new AbstractC0689a.C0690a(str, str2, interfaceC0691a2);
        Object[] objArr3 = {c0690a};
        ChangeQuickRedirect changeQuickRedirect3 = AbstractC0689a.a;
        if (PatchProxy.isSupport(objArr3, abstractC0689a, changeQuickRedirect3, false, "0a6831af591edcb2550e38e91624c564", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, abstractC0689a, changeQuickRedirect3, false, "0a6831af591edcb2550e38e91624c564");
        } else {
            abstractC0689a.a(c0690a, (com.sankuai.waimai.alita.bundle.cache.b) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public com.sankuai.waimai.alita.bundle.cache.c b(String str, String str2) {
        boolean z;
        File[] listFiles;
        com.sankuai.waimai.alita.bundle.cache.c a2;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a26ea7d820bfc2b0446ce2539167d30", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.alita.bundle.cache.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a26ea7d820bfc2b0446ce2539167d30");
        }
        if (TextUtils.isEmpty(str)) {
            com.sankuai.waimai.alita.bundle.cache.c cVar = new com.sankuai.waimai.alita.bundle.cache.c();
            cVar.b = 0;
            return cVar;
        } else if (this.e.containsKey(str)) {
            return this.e.get(str);
        } else {
            com.sankuai.waimai.alita.bundle.cache.a aVar = this.d;
            Object[] objArr2 = {str, str2};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.alita.bundle.cache.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "631807f96a5526427a30d0edbb78441d", RobustBitConfig.DEFAULT_VALUE)) {
                a2 = (com.sankuai.waimai.alita.bundle.cache.c) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "631807f96a5526427a30d0edbb78441d");
            } else {
                com.sankuai.waimai.alita.bundle.cache.c cVar2 = new com.sankuai.waimai.alita.bundle.cache.c();
                if (!TextUtils.isEmpty(str)) {
                    a a3 = a();
                    Object[] objArr3 = {str};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.alita.bundle.cache.a.a;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "a3d029c99cd9300eb0377ffe05059b43", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "a3d029c99cd9300eb0377ffe05059b43")).booleanValue();
                    } else {
                        if (!TextUtils.isEmpty(str)) {
                            File file = new File(aVar.a());
                            if (file.exists() && (listFiles = file.listFiles()) != null && listFiles.length > 0) {
                                for (File file2 : listFiles) {
                                    if (str.equals(file2.getName())) {
                                        z = aVar.a(file2);
                                        break;
                                    }
                                }
                            }
                        }
                        z = false;
                    }
                    if (!z) {
                        if (a3.i == 1) {
                            if (aVar.b()) {
                                com.sankuai.waimai.alita.core.utils.c.a("当前正在请求CheckUpdate接口");
                            }
                            cVar2.b = 2;
                        } else if (a3.c.a(str)) {
                            if (aVar.b()) {
                                com.sankuai.waimai.alita.core.utils.c.a("AlitaCacheManager", "当前模板[" + str + "]正在下载中");
                            }
                            cVar2.b = 3;
                        }
                    }
                    File[] listFiles2 = new File(aVar.a()).listFiles();
                    if (listFiles2 == null || listFiles2.length == 0) {
                        if (aVar.b()) {
                            com.sankuai.waimai.alita.core.utils.c.a("当前模板[" + str + "]在缓存目录中不存在");
                        }
                        cVar2.b = 4;
                    } else {
                        for (File file3 : listFiles2) {
                            if (str.equals(file3.getName())) {
                                a2 = aVar.a(file3, cVar2, str, str2);
                                break;
                            }
                        }
                        cVar2.b = 6;
                        if (aVar.b()) {
                            com.sankuai.waimai.alita.core.utils.c.a("当前模板[" + str + "]在缓存目录中不存在");
                        }
                    }
                } else {
                    cVar2.b = 0;
                }
                a2 = cVar2;
            }
            if (a2.a != null) {
                this.e.put(str, a2);
            }
            return a2;
        }
    }

    private void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "640eaaaf913aea0dac012ce01335ebc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "640eaaaf913aea0dac012ce01335ebc2");
        } else if (f.a(this.l)) {
        } else {
            Iterator<Map.Entry<String, List<BundleInfo>>> it = this.l.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, List<BundleInfo>> next = it.next();
                if (TextUtils.equals(next.getKey(), str)) {
                    it.remove();
                } else {
                    List<BundleInfo> value = next.getValue();
                    if (!f.a(value)) {
                        Iterator<BundleInfo> it2 = value.iterator();
                        while (it2.hasNext()) {
                            BundleInfo next2 = it2.next();
                            if (next2 != null && !TextUtils.isEmpty(next2.getTags()) && next2.getTags().contains(str)) {
                                it2.remove();
                            }
                        }
                    }
                }
            }
        }
    }

    private void b(String str, List<BundleInfo> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21404d646caee1f1daa54bb1a6576536", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21404d646caee1f1daa54bb1a6576536");
        } else if (!this.h || list == null || list.isEmpty()) {
        } else {
            this.c.a(str, list, new a.InterfaceC0693a() { // from class: com.sankuai.waimai.alita.bundle.a.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.alita.bundle.download.a.InterfaceC0693a
                public final void a(DownloadInfo downloadInfo) {
                    Object[] objArr2 = {downloadInfo};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f6fe6608927cc3756c5444d84f139c6a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f6fe6608927cc3756c5444d84f139c6a");
                        return;
                    }
                    a.this.f.remove(downloadInfo.e());
                    com.sankuai.waimai.alita.bundle.download.record.a aVar = downloadInfo.c;
                    if (aVar != null) {
                        aVar.a();
                    }
                }

                @Override // com.sankuai.waimai.alita.bundle.download.a.InterfaceC0693a
                public final void a(DownloadInfo downloadInfo, DownloadException downloadException) {
                    Object[] objArr2 = {downloadInfo, downloadException};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e6cb809bade3cacb5f0faf42b653f685", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e6cb809bade3cacb5f0faf42b653f685");
                        return;
                    }
                    a.this.f.remove(downloadInfo.e());
                    com.sankuai.waimai.alita.bundle.download.record.a aVar = downloadInfo.c;
                    if (aVar != null) {
                        aVar.b();
                    }
                }
            });
        }
    }

    public final com.sankuai.waimai.alita.bundle.model.a a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a5927890dc527d8430c6d0e5abb7c15", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.alita.bundle.model.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a5927890dc527d8430c6d0e5abb7c15");
        }
        if (this.h) {
            return b(str, str2).a;
        }
        return null;
    }

    private void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a02c685931227ad858ac7c54c0b21e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a02c685931227ad858ac7c54c0b21e4");
        } else if (this.k.contains(str)) {
        } else {
            this.k.add(str);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class b extends AbstractC0689a implements a.InterfaceC0693a {
        public static ChangeQuickRedirect c;
        private final ConcurrentHashMap<String, CopyOnWriteArrayList<AbstractC0689a.C0690a>> e;

        private b() {
            super(null);
            Object[] objArr = {a.this};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba0d854ee65aebc453437a8429cec548", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba0d854ee65aebc453437a8429cec548");
            } else {
                this.e = new ConcurrentHashMap<>();
            }
        }

        public /* synthetic */ b(a aVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.sankuai.waimai.alita.bundle.a.AbstractC0689a
        public final void a(final AbstractC0689a.C0690a c0690a, com.sankuai.waimai.alita.bundle.cache.b bVar) {
            boolean z;
            Object[] objArr = {c0690a, bVar};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7af30c2960eca62d25b2706ab3731d86", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7af30c2960eca62d25b2706ab3731d86");
                return;
            }
            final String str = c0690a.b;
            com.sankuai.waimai.alita.bundle.download.a aVar = a.this.c;
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.alita.bundle.download.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "1014233fd8b580f4c93a2d3cfd38b8f1", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "1014233fd8b580f4c93a2d3cfd38b8f1")).booleanValue();
            } else {
                DownloadInfo downloadInfo = aVar.f.get(str);
                z = downloadInfo != null && downloadInfo.e == 1001;
            }
            if (z || a.this.c.a(str)) {
                com.sankuai.waimai.alita.core.utils.c.a("异步 bundle 加载 | 有新版本在下载，等待新版本 | bundleId：" + str);
                Object[] objArr3 = {c0690a};
                ChangeQuickRedirect changeQuickRedirect3 = c;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7a62f90a98b4f60a4d1ed541d74c060e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7a62f90a98b4f60a4d1ed541d74c060e");
                } else {
                    CopyOnWriteArrayList<AbstractC0689a.C0690a> copyOnWriteArrayList = this.e.get(c0690a.b);
                    if (copyOnWriteArrayList == null) {
                        copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                    }
                    CopyOnWriteArrayList<AbstractC0689a.C0690a> putIfAbsent = this.e.putIfAbsent(c0690a.b, copyOnWriteArrayList);
                    if (putIfAbsent != null) {
                        putIfAbsent.addIfAbsent(c0690a);
                    } else {
                        copyOnWriteArrayList.addIfAbsent(c0690a);
                    }
                }
                com.sankuai.waimai.alita.core.utils.a.a(new Runnable() { // from class: com.sankuai.waimai.alita.bundle.a.b.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "7dd7aea7ed9151e02e61644f3a01de53", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "7dd7aea7ed9151e02e61644f3a01de53");
                        } else if (b.this.a(c0690a)) {
                            com.sankuai.waimai.alita.core.utils.c.a("异步 bundle 加载 | 有新版本，但新版本未在指定时间内下载成功，加载本地版本 | bundleId：" + str);
                            b.this.b(c0690a, null);
                        }
                    }
                }, 15000L, TimeUnit.MILLISECONDS);
                return;
            }
            com.sankuai.waimai.alita.core.utils.c.a("异步 bundle 加载 | 无新版本在下载，加载本地版本 | bundleId：" + str + " | bundleId：" + str);
            b(c0690a, null);
        }

        boolean a(AbstractC0689a.C0690a c0690a) {
            Object[] objArr = {c0690a};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d7f06e4d9759a718d43822c3ba13d84", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d7f06e4d9759a718d43822c3ba13d84")).booleanValue();
            }
            CopyOnWriteArrayList<AbstractC0689a.C0690a> copyOnWriteArrayList = this.e.get(c0690a.b);
            if (copyOnWriteArrayList != null) {
                return copyOnWriteArrayList.remove(c0690a);
            }
            return false;
        }

        @Override // com.sankuai.waimai.alita.bundle.download.a.InterfaceC0693a
        public final void a(DownloadInfo downloadInfo) {
            Object[] objArr = {downloadInfo};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c81f07ffd5b4f78efd052272cf098bd7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c81f07ffd5b4f78efd052272cf098bd7");
                return;
            }
            String jsId = downloadInfo.d.getJsId();
            CopyOnWriteArrayList<AbstractC0689a.C0690a> copyOnWriteArrayList = this.e.get(jsId);
            if (copyOnWriteArrayList == null) {
                return;
            }
            for (AbstractC0689a.C0690a c0690a : copyOnWriteArrayList) {
                com.sankuai.waimai.alita.bundle.model.a a = a.this.a(jsId, c0690a.c);
                if (a != null && a(c0690a)) {
                    com.sankuai.waimai.alita.core.utils.c.a("异步 bundle 加载 | 有新版本，新版本下载成功 | bundleId：" + jsId + " | 版本：" + a.d);
                    a(c0690a, a);
                }
            }
        }

        @Override // com.sankuai.waimai.alita.bundle.download.a.InterfaceC0693a
        public final void a(DownloadInfo downloadInfo, DownloadException downloadException) {
            Object[] objArr = {downloadInfo, downloadException};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6746e497b3092a65275bd841dbb75ca2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6746e497b3092a65275bd841dbb75ca2");
                return;
            }
            String jsId = downloadInfo.d.getJsId();
            CopyOnWriteArrayList<AbstractC0689a.C0690a> copyOnWriteArrayList = this.e.get(jsId);
            if (copyOnWriteArrayList == null) {
                return;
            }
            for (AbstractC0689a.C0690a c0690a : copyOnWriteArrayList) {
                if (a(c0690a)) {
                    com.sankuai.waimai.alita.core.utils.c.a("异步 bundle 加载 | 有新版本，但新版本下载失败 | bundleId：" + jsId);
                    b(c0690a, null);
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class d extends AbstractC0689a {
        public static ChangeQuickRedirect c;

        private d() {
            super(null);
            Object[] objArr = {a.this};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3eecbd4559f7595e1853806082b60432", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3eecbd4559f7595e1853806082b60432");
            }
        }

        public /* synthetic */ d(a aVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.sankuai.waimai.alita.bundle.a.AbstractC0689a
        public final void a(final AbstractC0689a.C0690a c0690a, com.sankuai.waimai.alita.bundle.cache.b bVar) {
            Object[] objArr = {c0690a, bVar};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e3d90e434eda9ed47557abfc2786f99", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e3d90e434eda9ed47557abfc2786f99");
            } else {
                com.sankuai.waimai.alita.core.utils.a.a(new a.c<com.sankuai.waimai.alita.bundle.cache.c>() { // from class: com.sankuai.waimai.alita.bundle.a.d.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.alita.core.utils.a.c
                    public final /* synthetic */ com.sankuai.waimai.alita.bundle.cache.c a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "19bcc52b0d00d7885db62c0e83caeca0", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.alita.bundle.cache.c) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "19bcc52b0d00d7885db62c0e83caeca0") : a.this.b(c0690a.b, c0690a.c);
                    }

                    @Override // com.sankuai.waimai.alita.core.utils.a.c
                    public final /* synthetic */ void a(com.sankuai.waimai.alita.bundle.cache.c cVar) {
                        com.sankuai.waimai.alita.bundle.cache.c cVar2 = cVar;
                        Object[] objArr2 = {cVar2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "356514d60ff907bf7c6e9bac2029b284", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "356514d60ff907bf7c6e9bac2029b284");
                        } else if (cVar2 != null && cVar2.a != null) {
                            d.this.a(c0690a, cVar2.a);
                        } else {
                            d.this.b(c0690a, new com.sankuai.waimai.alita.bundle.cache.b(cVar2 == null ? 6 : cVar2.b));
                        }
                    }
                }, "MachAsyncUtil");
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.alita.bundle.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC0689a {
        public static ChangeQuickRedirect a;
        public AbstractC0689a b;

        public abstract void a(C0690a c0690a, @Nullable com.sankuai.waimai.alita.bundle.cache.b bVar);

        public AbstractC0689a() {
        }

        public /* synthetic */ AbstractC0689a(AnonymousClass1 anonymousClass1) {
            this();
        }

        /* compiled from: ProGuard */
        /* renamed from: com.sankuai.waimai.alita.bundle.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static class C0690a {
            public static ChangeQuickRedirect a;
            @NonNull
            public String b;
            @NonNull
            public String c;
            @NonNull
            final a.InterfaceC0691a d;

            public C0690a(@NonNull String str, @NonNull String str2, @NonNull a.InterfaceC0691a interfaceC0691a) {
                Object[] objArr = {str, str2, interfaceC0691a};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef9ec092912425a2bdcc792e5f73c83b", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef9ec092912425a2bdcc792e5f73c83b");
                    return;
                }
                this.b = str;
                this.c = str2;
                this.d = interfaceC0691a;
            }
        }

        public final void b(C0690a c0690a, com.sankuai.waimai.alita.bundle.cache.b bVar) {
            Object[] objArr = {c0690a, bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8bcfd066ee3a724a5e4ecabf2e25cca", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8bcfd066ee3a724a5e4ecabf2e25cca");
            } else if (this.b != null) {
                this.b.a(c0690a, bVar);
            } else {
                c0690a.d.a(bVar);
            }
        }

        public final void a(C0690a c0690a, com.sankuai.waimai.alita.bundle.model.a aVar) {
            Object[] objArr = {c0690a, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "454cb7c9c003cbc3d38128de7f62eab4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "454cb7c9c003cbc3d38128de7f62eab4");
            } else {
                c0690a.d.a(aVar);
            }
        }
    }
}
