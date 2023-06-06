package com.sankuai.waimai.alita.bundle.download;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.waimai.alita.bundle.a;
import com.sankuai.waimai.alita.bundle.d;
import com.sankuai.waimai.alita.bundle.download.exception.DownloadException;
import com.sankuai.waimai.alita.bundle.download.model.DownloadInfo;
import com.sankuai.waimai.alita.bundle.download.record.b;
import com.sankuai.waimai.alita.bundle.download.service.FileDownloadService;
import com.sankuai.waimai.alita.bundle.download.update.BundleInfo;
import com.sankuai.waimai.alita.core.base.util.AlitaBundleUtil;
import com.sankuai.waimai.alita.core.utils.c;
import com.sankuai.waimai.alita.core.utils.f;
import com.sankuai.waimai.alita.core.utils.l;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public FileDownloadService d;
    public final List<InterfaceC0693a> e;
    public final ConcurrentHashMap<String, DownloadInfo> f;
    private String g;
    private final Map<String, List<DownloadInfo>> h;
    private final Context i;
    private a.c j;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.alita.bundle.download.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0693a {
        void a(DownloadInfo downloadInfo);

        void a(DownloadInfo downloadInfo, DownloadException downloadException);
    }

    public static /* synthetic */ void a(a aVar, DownloadInfo downloadInfo) {
        Object[] objArr = {downloadInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "6d0ff442f973ff834ad353e4c6f1b923", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "6d0ff442f973ff834ad353e4c6f1b923");
            return;
        }
        BundleInfo bundleInfo = downloadInfo.d;
        File file = new File(downloadInfo.h);
        File parentFile = file.getParentFile();
        if (aVar.d()) {
            c.a("模板id为[" + downloadInfo.e() + "]的下载文件[" + downloadInfo.c() + "]解压成功，开始删除目录[" + parentFile.getName() + "]下的其他旧的模板文件");
        }
        File[] listFiles = parentFile.listFiles();
        if (listFiles == null || file.length() <= 1) {
            return;
        }
        for (File file2 : listFiles) {
            if (!TextUtils.equals(file2.getName(), d.a(bundleInfo))) {
                f.c(file2);
                if (aVar.d()) {
                    c.a("删除旧文件[" + file2.getName() + "]成功！");
                }
            }
        }
    }

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ab7196df3d9df4d21385519e40244b5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ab7196df3d9df4d21385519e40244b5");
            return;
        }
        this.e = new CopyOnWriteArrayList();
        this.h = new ConcurrentHashMap();
        this.f = new ConcurrentHashMap<>();
        this.i = context.getApplicationContext();
    }

    public final void a(String str, List<BundleInfo> list, InterfaceC0693a interfaceC0693a) {
        List<DownloadInfo> list2;
        Object[] objArr = {str, list, interfaceC0693a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1ceadadd8b5ef3287f63d20b1c4d2b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1ceadadd8b5ef3287f63d20b1c4d2b3");
        } else if (!f.a(list)) {
            c();
            if (!this.h.containsKey(str)) {
                list2 = new ArrayList<>();
                this.h.put(str, list2);
            } else {
                list2 = this.h.get(str);
            }
            List<BundleInfo> a2 = a(list);
            if (d()) {
                for (BundleInfo bundleInfo : a2) {
                    c.a("去重后需要下载的模板:" + bundleInfo.getJsId() + ",版本号：" + d.b(bundleInfo));
                }
            }
            for (BundleInfo bundleInfo2 : a2) {
                if (b(bundleInfo2)) {
                    if (a(bundleInfo2.getJsId())) {
                        this.f.get(bundleInfo2.getJsId()).a(interfaceC0693a);
                    } else {
                        DownloadInfo downloadInfo = new DownloadInfo(bundleInfo2, a(bundleInfo2), interfaceC0693a);
                        this.f.put(bundleInfo2.getJsId(), downloadInfo);
                        list2.add(downloadInfo);
                        com.sankuai.waimai.alita.bundle.download.record.a aVar = new com.sankuai.waimai.alita.bundle.download.record.a();
                        aVar.b = bundleInfo2.getJsId();
                        downloadInfo.c = aVar;
                        a(downloadInfo, aVar);
                    }
                }
            }
            b();
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0737df4085c0f844b805b16aafbca01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0737df4085c0f844b805b16aafbca01");
            return;
        }
        c.a("BundleDownloader-->notifyDownloadChange:mFetchDataListener=" + this.j);
    }

    private String a(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20d0ca577b863ac9bb2861b9ff82ec85", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20d0ca577b863ac9bb2861b9ff82ec85");
        }
        File file = new File(this.g, bundleInfo.getJsId());
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b155cf90392ccc12aad7006628e4e439", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b155cf90392ccc12aad7006628e4e439");
        } else if (TextUtils.isEmpty(this.g)) {
            this.g = com.sankuai.waimai.alita.bundle.a.a().b(this.i) + File.separator + this.b + File.separator + this.c + File.separator;
            StringBuilder sb = new StringBuilder("BundleDownloader-->setupEnvironment，下载的根目录为:");
            sb.append(this.g);
            c.a(sb.toString());
        }
    }

    private List<BundleInfo> a(List<BundleInfo> list) {
        boolean z = true;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cfa1f337eb425b851214e1cb13a654a", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cfa1f337eb425b851214e1cb13a654a");
        }
        Object[] objArr2 = {list};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "35cc4673b568866e88669cf90fa3e3bc", RobustBitConfig.DEFAULT_VALUE)) {
            HashMap hashMap = new HashMap();
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    break;
                }
                BundleInfo bundleInfo = list.get(i);
                if (hashMap.containsKey(bundleInfo.getJsId())) {
                    z = false;
                    break;
                }
                hashMap.put(bundleInfo.getJsId(), bundleInfo);
                i++;
            }
        } else {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "35cc4673b568866e88669cf90fa3e3bc")).booleanValue();
        }
        if (z) {
            if (d()) {
                c.a("此次下载的模板集合中machId唯一，无需去重");
            }
            return list;
        }
        if (d()) {
            c.a("此次下载的模板集合中存在重复的machId，需要做去重，选择高版本的模板下载");
        }
        HashMap hashMap2 = new HashMap();
        for (int i2 = 0; i2 < list.size(); i2++) {
            BundleInfo bundleInfo2 = list.get(i2);
            if (hashMap2.get(bundleInfo2.getJsId()) == null) {
                hashMap2.put(bundleInfo2.getJsId(), bundleInfo2);
            } else {
                BundleInfo bundleInfo3 = (BundleInfo) hashMap2.get(bundleInfo2.getJsId());
                if (f.a(d.b(bundleInfo2), d.b(bundleInfo3)) > 0) {
                    hashMap2.put(bundleInfo2.getJsId(), bundleInfo2);
                }
                if (d()) {
                    c.a("模板" + bundleInfo3.getJsId() + ",之前版本：" + d.b(bundleInfo3));
                    c.a("模板" + bundleInfo3.getJsId() + ",之后版本：" + d.b(bundleInfo2));
                    c.a("模板" + bundleInfo3.getJsId() + ",选择版本：" + d.b(bundleInfo2) + "下载");
                }
            }
        }
        return new ArrayList(hashMap2.values());
    }

    private boolean b(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a86cf3ea7d982e5fae3760c8c047346", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a86cf3ea7d982e5fae3760c8c047346")).booleanValue() : (bundleInfo == null || TextUtils.isEmpty(bundleInfo.getName()) || !c(bundleInfo)) ? false : true;
    }

    private boolean c(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2398b279909dabc56e5d65df5f4bde4b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2398b279909dabc56e5d65df5f4bde4b")).booleanValue() : (TextUtils.isEmpty(bundleInfo.getBundleVersion()) && TextUtils.isEmpty(bundleInfo.getVersion())) ? false : true;
    }

    private void a(final DownloadInfo downloadInfo, final com.sankuai.waimai.alita.bundle.download.record.a aVar) {
        Object[] objArr = {downloadInfo, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb9a80ca8feb50a18fed2774a691e2bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb9a80ca8feb50a18fed2774a691e2bb");
        } else if (!f.a(this.i)) {
            b.a aVar2 = new b.a();
            aVar2.b = "BundleDownloader-->innerDownload";
            aVar2.c = "网络不可用，下载终止";
            aVar.a(aVar2.a());
            AlitaMonitorCenter.getCenter().getMonitor().availabilityLogBuilder(AlitaMonitorCenter.AlitaMonitorConst.BundleDownload.MONITOR_KEY, 0, AlitaBundleUtil.a(downloadInfo.c())).errorCode(AlitaMonitorCenter.AlitaMonitorConst.BundleDownload.TAG_VALUE_ERROR_CODE_FAILED).bundleId(downloadInfo.c()).addTags("bundle_version", downloadInfo.d()).commit();
            a(downloadInfo, new DownloadException(com.meituan.android.common.aidata.ai.bundle.download.exception.DownloadException.NET_ERROR), aVar);
        } else if (!f.a(downloadInfo.a())) {
            b.a aVar3 = new b.a();
            aVar3.b = "BundleDownloader-->innerDownload";
            aVar3.c = "URL不合法,URL=" + downloadInfo.a();
            aVar.a(aVar3.a());
            AlitaMonitorCenter.getCenter().getMonitor().availabilityLogBuilder(AlitaMonitorCenter.AlitaMonitorConst.BundleDownload.MONITOR_KEY, 0, AlitaBundleUtil.a(downloadInfo.c())).errorCode(AlitaMonitorCenter.AlitaMonitorConst.BundleDownload.TAG_VALUE_ERROR_CODE_FAILED).bundleId(downloadInfo.c()).addTags("bundle_version", downloadInfo.d()).commit();
            a(downloadInfo, new DownloadException(com.meituan.android.common.aidata.ai.bundle.download.exception.DownloadException.ILLEGAL_URL), aVar);
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("bundle_id", downloadInfo.c());
            hashMap.put("version", downloadInfo.d.getBundleVersion());
            hashMap.put("url", downloadInfo.a());
            c.a("alita_download", (String) null, "start", (HashMap<String, Object>) hashMap);
            downloadInfo.a(1001);
            this.d.downloadFile(downloadInfo.a()).a(new com.sankuai.meituan.retrofit2.f<ap>() { // from class: com.sankuai.waimai.alita.bundle.download.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.retrofit2.f
                public final void onResponse(Call<ap> call, Response<ap> response) {
                    Object[] objArr2 = {call, response};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "26d70edbf6e4d58febe524c1efbdbf94", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "26d70edbf6e4d58febe524c1efbdbf94");
                    } else if (!response.f()) {
                        if (aVar != null) {
                            b.a aVar4 = new b.a();
                            aVar4.b = "BundleDownloader-->innerDownload-->onResponse";
                            aVar4.c = "网络连接成功，数据异常";
                            aVar.a(aVar4.a());
                        }
                        AlitaMonitorCenter.getCenter().getMonitor().availabilityLogBuilder(AlitaMonitorCenter.AlitaMonitorConst.BundleDownload.MONITOR_KEY, 0, AlitaBundleUtil.a(downloadInfo.c())).errorCode(AlitaMonitorCenter.AlitaMonitorConst.BundleDownload.TAG_VALUE_ERROR_CODE_FAILED).bundleId(downloadInfo.c()).addTags("bundle_version", downloadInfo.d()).commit();
                        a.this.a(downloadInfo, new DownloadException((int) com.meituan.android.common.aidata.ai.bundle.download.exception.DownloadException.NET_ERROR, response.b()), aVar);
                    } else {
                        a.this.a(response, downloadInfo, aVar);
                    }
                }

                @Override // com.sankuai.meituan.retrofit2.f
                public final void onFailure(Call<ap> call, Throwable th) {
                    int i;
                    Object[] objArr2 = {call, th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0985bb04e246b204bfc6f24b1624f201", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0985bb04e246b204bfc6f24b1624f201");
                        return;
                    }
                    if (call.c()) {
                        i = com.meituan.android.common.aidata.ai.bundle.download.exception.DownloadException.CANCELED;
                    } else {
                        i = th instanceof IOException ? com.meituan.android.common.aidata.ai.bundle.download.exception.DownloadException.NET_ERROR : com.meituan.android.common.aidata.ai.bundle.download.exception.DownloadException.UN_KNOWN;
                    }
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("bundle_id", downloadInfo.c());
                    hashMap2.put("version", downloadInfo.d.getBundleVersion());
                    hashMap2.put("url", downloadInfo.a());
                    hashMap2.put("value", Integer.valueOf(i));
                    c.a("alita_download", (String) null, "fail", (HashMap<String, Object>) hashMap2);
                    DownloadException downloadException = new DownloadException(th, i);
                    downloadInfo.a(1004, downloadException);
                    if (aVar != null) {
                        b.a aVar4 = new b.a();
                        aVar4.b = "BundleDownloader-->innerDownload-->onResponse";
                        StringBuilder sb = new StringBuilder("网络连接失败，详情::");
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.alita.bundle.exception.a.c;
                        sb.append(PatchProxy.isSupport(objArr3, downloadException, changeQuickRedirect3, false, "2ee9f242dd29e0f0e71412e5be7b86a7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, downloadException, changeQuickRedirect3, false, "2ee9f242dd29e0f0e71412e5be7b86a7") : downloadException.a(downloadException.d));
                        aVar4.c = sb.toString();
                        aVar.a(aVar4.a());
                    }
                    AlitaMonitorCenter.getCenter().getMonitor().availabilityLogBuilder(AlitaMonitorCenter.AlitaMonitorConst.BundleDownload.MONITOR_KEY, 0, AlitaBundleUtil.a(downloadInfo.c())).errorCode(AlitaMonitorCenter.AlitaMonitorConst.BundleDownload.TAG_VALUE_ERROR_CODE_FAILED).bundleId(downloadInfo.c()).addTags("bundle_version", downloadInfo.d()).commit();
                    a.this.a(downloadInfo, downloadException, aVar);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0292 A[Catch: all -> 0x02f1, TryCatch #3 {all -> 0x02f1, blocks: (B:80:0x027e, B:82:0x0292, B:83:0x02b7), top: B:98:0x027e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    synchronized void a(com.sankuai.meituan.retrofit2.Response<com.sankuai.meituan.retrofit2.ap> r26, final com.sankuai.waimai.alita.bundle.download.model.DownloadInfo r27, final com.sankuai.waimai.alita.bundle.download.record.a r28) {
        /*
            Method dump skipped, instructions count: 763
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.alita.bundle.download.a.a(com.sankuai.meituan.retrofit2.Response, com.sankuai.waimai.alita.bundle.download.model.DownloadInfo, com.sankuai.waimai.alita.bundle.download.record.a):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(DownloadInfo downloadInfo, DownloadException downloadException, com.sankuai.waimai.alita.bundle.download.record.a aVar) {
        Object[] objArr = {downloadInfo, downloadException, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4cc6758e60f7311651706e469eb03c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4cc6758e60f7311651706e469eb03c2");
            return;
        }
        for (InterfaceC0693a interfaceC0693a : this.e) {
            interfaceC0693a.a(downloadInfo, downloadException);
        }
        synchronized (this) {
            downloadInfo.a(downloadException);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(DownloadInfo downloadInfo, com.sankuai.waimai.alita.bundle.download.record.a aVar) {
        Object[] objArr = {downloadInfo, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b7b13974d28ca793268f6c5e65b337a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b7b13974d28ca793268f6c5e65b337a");
            return;
        }
        for (InterfaceC0693a interfaceC0693a : this.e) {
            interfaceC0693a.a(downloadInfo);
        }
        synchronized (this) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = DownloadInfo.a;
            if (PatchProxy.isSupport(objArr2, downloadInfo, changeQuickRedirect2, false, "14f09a85c704168968304b6f6e05c2e0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, downloadInfo, changeQuickRedirect2, false, "14f09a85c704168968304b6f6e05c2e0");
            } else if (!downloadInfo.b()) {
                c.a("DownloadInfo-->notifyCallbackOnSuccess:模板[" + downloadInfo.e() + "] mCallbackList.size()=" + downloadInfo.i.size());
                for (InterfaceC0693a interfaceC0693a2 : downloadInfo.i) {
                    if (interfaceC0693a2 != null) {
                        c.a("DownloadInfo-->notifyCallbackOnSuccess,[" + downloadInfo.e() + "] callback=" + interfaceC0693a2);
                        interfaceC0693a2.a(downloadInfo);
                    }
                }
                downloadInfo.i.clear();
            }
        }
    }

    void a(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8574ed3b2e2ee7a5e32d7d114f5f23e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8574ed3b2e2ee7a5e32d7d114f5f23e");
        } else if (file == null || !file.exists()) {
        } else {
            file.delete();
        }
    }

    void a(File file, DownloadInfo downloadInfo) {
        File[] listFiles;
        Object[] objArr = {file, downloadInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6324cf563de64cf04eaa66a9f4784446", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6324cf563de64cf04eaa66a9f4784446");
            return;
        }
        String a2 = l.a(file, downloadInfo);
        if (!TextUtils.isEmpty(a2)) {
            File file2 = new File(a2);
            if (file2.exists()) {
                f.b(file2);
            }
        }
        if (TextUtils.isEmpty(downloadInfo.g)) {
            return;
        }
        File file3 = new File(downloadInfo.g);
        if (file3.exists() && (listFiles = file3.listFiles()) != null && listFiles.length == 0) {
            file3.delete();
        }
    }

    private boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b74fd6ea223d1fea990c537a10e5d2f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b74fd6ea223d1fea990c537a10e5d2f")).booleanValue() : com.sankuai.waimai.alita.bundle.a.a().b;
    }

    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c28f1c9021bb808a8fcc38159a176c71", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c28f1c9021bb808a8fcc38159a176c71")).booleanValue();
        }
        DownloadInfo downloadInfo = this.f.get(str);
        if (downloadInfo == null) {
            return false;
        }
        return downloadInfo.f();
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4b2790f206734a667f5b11421fec395", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4b2790f206734a667f5b11421fec395");
            return;
        }
        this.h.clear();
        b();
    }
}
