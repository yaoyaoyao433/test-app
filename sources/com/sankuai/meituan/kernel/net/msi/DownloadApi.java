package com.sankuai.meituan.kernel.net.msi;

import android.os.SystemClock;
import android.text.TextUtils;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.msi.annotations.MsiNewApi;
import com.meituan.msi.bean.DefaultValue;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.bean.ResponseWithInnerData;
import com.meituan.network.CommonProfile;
import com.meituan.network.HeaderReceivedEvent;
import com.meituan.network.download.DownloadFileParam;
import com.meituan.network.download.DownloadFileResult;
import com.meituan.network.download.IDownloadFileApi;
import com.meituan.network.request.NetworkPerformanceEvent;
import com.meituan.network.request.RequestResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.f;
import com.sankuai.meituan.retrofit2.q;
import com.sankuai.meituan.retrofit2.r;
import com.sankuai.meituan.retrofit2.raw.a;
import com.sankuai.meituan.retrofit2.t;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.CRC32;
/* compiled from: ProGuard */
@MsiNewApi
/* loaded from: classes4.dex */
public class DownloadApi extends IDownloadFileApi {
    public static ChangeQuickRedirect b;
    private final Map<String, Call> c;
    private String d;
    private long e;
    private long f;
    private volatile a.InterfaceC0637a g;

    public DownloadApi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b67905ab950c380dd30113ba0b29fda", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b67905ab950c380dd30113ba0b29fda");
        } else {
            this.c = new ConcurrentHashMap();
        }
    }

    public static /* synthetic */ RequestResult a(DownloadApi downloadApi, Response response, String str, MsiContext msiContext) {
        Object[] objArr = {response, str, msiContext};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, downloadApi, changeQuickRedirect, false, "6b56e3f3524d973b6f31d5598f5d9079", RobustBitConfig.DEFAULT_VALUE)) {
            return (RequestResult) PatchProxy.accessDispatch(objArr, downloadApi, changeQuickRedirect, false, "6b56e3f3524d973b6f31d5598f5d9079");
        }
        RequestResult requestResult = new RequestResult();
        HashMap hashMap = new HashMap();
        List<q> list = response.g;
        HashSet hashSet = new HashSet();
        if (list != null) {
            for (q qVar : list) {
                if ("Set-Cookie".equalsIgnoreCase(qVar.b)) {
                    hashSet.add(qVar.c);
                } else {
                    hashMap.put(qVar.b, qVar.c);
                }
            }
        }
        hashMap.put("Set-Cookie", TextUtils.join(CommonConstant.Symbol.COMMA, hashSet));
        requestResult.cookies = (String[]) hashSet.toArray(new String[0]);
        requestResult.header = hashMap;
        HeaderReceivedEvent headerReceivedEvent = new HeaderReceivedEvent();
        headerReceivedEvent.header = hashMap;
        headerReceivedEvent.header.put("Set-Cookie", TextUtils.join(CommonConstant.Symbol.COMMA, hashSet));
        headerReceivedEvent.cookies = new ArrayList();
        headerReceivedEvent.cookies.addAll(hashSet);
        msiContext.dispatchEvent("DownloadTask.onHeadersReceived", headerReceivedEvent, str);
        return requestResult;
    }

    public static /* synthetic */ void a(DownloadApi downloadApi, CommonProfile commonProfile, com.sankuai.meituan.kernel.net.msi.okhttp3.a aVar) {
        long j;
        int i = 2;
        Object[] objArr = {commonProfile, aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, downloadApi, changeQuickRedirect, false, "f4f7c7031870b57040d0006b8ed91f1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, downloadApi, changeQuickRedirect, false, "f4f7c7031870b57040d0006b8ed91f1b");
        } else if (aVar != null) {
            long currentTimeMillis = System.currentTimeMillis() - downloadApi.e;
            long a = d.a();
            if (currentTimeMillis != 0) {
                j = (((a - downloadApi.f) / 1024) * 1000) / currentTimeMillis;
            } else {
                com.sankuai.meituan.kernel.net.msi.log.a.a("can not divide by zero");
                j = 0;
            }
            commonProfile.throughputKbps = j;
            if (j == 0) {
                i = 1;
            } else if (j >= 50) {
                i = j <= 100 ? 3 : j <= ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE ? 4 : j <= 100000 ? 5 : 6;
            }
            commonProfile.estimate_nettype = i;
            commonProfile.CallEnd = aVar.b;
            commonProfile.CallStart = aVar.b;
            commonProfile.connectEnd = aVar.g;
            commonProfile.connectStart = aVar.f;
            commonProfile.domainLookUpEnd = aVar.e;
            commonProfile.domainLookUpStart = aVar.d;
            commonProfile.peerIP = aVar.m;
            commonProfile.port = aVar.n;
            commonProfile.requestEnd = aVar.k;
            commonProfile.requestStart = aVar.j;
            commonProfile.responseEnd = aVar.l;
            commonProfile.socketReused = aVar.o;
            commonProfile.SSLconnectionStart = aVar.h;
            commonProfile.SSLconnectionEnd = aVar.i;
        }
    }

    @Override // com.meituan.network.download.IDownloadFileApi
    public final void a(final MsiContext msiContext, final DownloadFileParam downloadFileParam) {
        int intValue;
        aj.a aVar;
        Object[] objArr = {msiContext, downloadFileParam};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c75010ae2ff7e9a90991ff3834cf80be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c75010ae2ff7e9a90991ff3834cf80be");
            return;
        }
        final com.meituan.msi.provider.a fileProvider = msiContext.getFileProvider();
        if (TextUtils.isEmpty(this.d)) {
            this.d = fileProvider.b();
        }
        final String str = downloadFileParam.url;
        String str2 = "";
        if (!TextUtils.isEmpty(downloadFileParam.filePath)) {
            str2 = fileProvider.a(downloadFileParam.filePath);
            if (str2 == null) {
                msiContext.onError(400, "invalid path" + downloadFileParam.filePath);
                return;
            } else if (!a.a(str2, fileProvider.c())) {
                msiContext.onError(401, "permission denied" + downloadFileParam.filePath);
                return;
            }
        }
        final String str3 = str2;
        final String asString = msiContext.getInnerArgs().get(ResponseWithInnerData.TASK_ID).getAsString();
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        if (TextUtils.isEmpty(this.d)) {
            msiContext.onError("mTempDir is empty ");
            return;
        }
        final t e = t.e(str);
        if (e == null) {
            msiContext.onError("illegal url");
            return;
        }
        aj.a aVar2 = new aj.a();
        aVar2.b = str;
        Map<String, String> map = downloadFileParam.header;
        if (map != null) {
            aVar2.a(r.a(map).b);
        }
        int i = downloadFileParam.timeout;
        Object[] objArr2 = {msiContext, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2768738dd97e58845d4fa664a7f6be30", RobustBitConfig.DEFAULT_VALUE)) {
            intValue = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2768738dd97e58845d4fa664a7f6be30")).intValue();
        } else if (i > 0) {
            intValue = i;
        } else {
            Integer num = (Integer) msiContext.getDefaultValue(DefaultValue.DEFAULT_VALUE_DOWNLOAD_TIMEOUT);
            intValue = num != null ? num.intValue() : 60000;
        }
        if (intValue > 0) {
            aVar = aVar2;
            aVar.e = intValue;
        } else {
            aVar = aVar2;
        }
        if (this.g == null) {
            this.g = com.sankuai.meituan.kernel.net.msi.callfactory.a.a("download");
        }
        ar a = new ar.a().a(b.b).a(this.g).a(new com.sankuai.meituan.kernel.net.msi.progress.a(new com.sankuai.meituan.kernel.net.msi.progress.b("DownloadTask.onProgressUpdate", asString, msiContext))).a();
        final String valueOf = String.valueOf(a.hashCode());
        aVar.b("CallHashCode", valueOf);
        final aj a2 = aVar.a();
        Call<ap> a3 = a.a(a2);
        final NetworkPerformanceEvent a4 = d.a(str);
        final Map<String, Object> b2 = d.b(a4.url);
        a3.a(new f<ap>() { // from class: com.sankuai.meituan.kernel.net.msi.DownloadApi.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.retrofit2.f
            public final void onFailure(Call<ap> call, Throwable th) {
                MsiContext msiContext2;
                String message;
                Object[] objArr3 = {call, th};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e7c04760b1d35aed990c9d4f48773124", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e7c04760b1d35aed990c9d4f48773124");
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put(ResponseWithInnerData.TASK_ID, asString);
                if (th != null && TextUtils.equals("Already canceled", th.getMessage())) {
                    msiContext2 = msiContext;
                    message = "downloadFile:fail abort";
                } else {
                    msiContext2 = msiContext;
                    message = th == null ? "" : th.getMessage();
                }
                msiContext2.onError(message, hashMap);
                DownloadApi.this.c.remove(asString);
                com.sankuai.meituan.kernel.net.msi.okhttp3.c.b(valueOf);
                d.a(msiContext, a4, a2, null, elapsedRealtime, "download");
                b2.put("statusCode", -1);
                b2.put("message", th.getMessage());
                com.sankuai.meituan.kernel.net.msi.log.a.a(b2, msiContext.request, "msi.api.network", (int) a4.value, 1.0f);
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [T, com.meituan.network.download.DownloadFileResult] */
            @Override // com.sankuai.meituan.retrofit2.f
            public final void onResponse(Call<ap> call, Response<ap> response) {
                String str4;
                ap apVar;
                String str5;
                boolean z;
                String str6;
                Object[] objArr3 = {call, response};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f1018d82a53584c1d82624724549b857", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f1018d82a53584c1d82624724549b857");
                    return;
                }
                DownloadApi.this.e = System.currentTimeMillis();
                DownloadApi.this.f = d.a();
                DownloadApi.a(DownloadApi.this, response, asString, msiContext);
                d.a(msiContext, a4, a2, response, elapsedRealtime, "download");
                b2.put("statusCode", Integer.valueOf(response.c));
                com.sankuai.meituan.kernel.net.msi.log.a.a(b2, msiContext.request, "msi.api.network", (int) a4.value, 1.0f);
                String h = e.h();
                Object[] objArr4 = {h};
                ChangeQuickRedirect changeQuickRedirect4 = a.a;
                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "12da21ad2586922ad7169ca2fabbf9a7", RobustBitConfig.DEFAULT_VALUE)) {
                    str4 = (String) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "12da21ad2586922ad7169ca2fabbf9a7");
                } else {
                    if (!TextUtils.isEmpty(h)) {
                        int lastIndexOf = h.lastIndexOf("/");
                        int lastIndexOf2 = h.lastIndexOf(CommonConstant.Symbol.DOT);
                        if (lastIndexOf2 != -1 && lastIndexOf2 >= lastIndexOf) {
                            str4 = h.substring(lastIndexOf2);
                        }
                    }
                    str4 = "";
                }
                if (TextUtils.isEmpty(str4)) {
                    List<q> list = response.g;
                    String str7 = "";
                    if (list != null) {
                        Iterator<q> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            q next = it.next();
                            if (next.b.equalsIgnoreCase("Content-Type")) {
                                str7 = next.c;
                                break;
                            }
                        }
                    }
                    str4 = CommonConstant.Symbol.DOT + b.c(str7);
                }
                File a5 = DownloadApi.this.a(DownloadApi.this.a(str), str4);
                if (response.e != null) {
                    apVar = response.e;
                } else {
                    apVar = response.f;
                }
                if (apVar != null && !a.a(apVar.source(), a5)) {
                    a5 = null;
                }
                int i2 = response.c;
                String path = a5 != null ? a5.getPath() : "";
                if (a5 != null && a5.exists()) {
                    if (TextUtils.isEmpty(str3)) {
                        str5 = path;
                        z = false;
                    } else {
                        File file = new File(str3);
                        file.delete();
                        z = a5.renameTo(file);
                        str5 = z ? downloadFileParam.filePath : "";
                    }
                    if (z) {
                        path = str5;
                    } else {
                        if (fileProvider instanceof com.meituan.msi.provider.b) {
                            str6 = "tmp_" + msiContext.getContainerInfo().name + CommonConstant.Symbol.UNDERLINE + fileProvider.a(a.a(a5), 1) + str4;
                        } else {
                            str6 = fileProvider.a(a.a(a5), 0) + str4;
                        }
                        File file2 = new File(DownloadApi.this.d, str6);
                        if (!file2.exists()) {
                            a5.renameTo(file2);
                        } else {
                            a5.delete();
                        }
                        if (fileProvider instanceof com.meituan.msi.provider.b) {
                            path = "msifile://" + file2.getName();
                        } else {
                            path = fileProvider.b(file2.getName());
                        }
                    }
                }
                if (!TextUtils.isEmpty(path)) {
                    ?? downloadFileResult = new DownloadFileResult();
                    CommonProfile commonProfile = new CommonProfile();
                    DownloadApi.a(DownloadApi.this, commonProfile, com.sankuai.meituan.kernel.net.msi.okhttp3.c.a(valueOf));
                    downloadFileResult.profile = commonProfile;
                    downloadFileResult.statusCode = i2;
                    if (TextUtils.isEmpty(downloadFileParam.filePath)) {
                        downloadFileResult.tempFilePath = path;
                    } else {
                        downloadFileResult.filePath = downloadFileParam.filePath;
                    }
                    ResponseWithInnerData responseWithInnerData = new ResponseWithInnerData();
                    responseWithInnerData.response = downloadFileResult;
                    HashMap hashMap = new HashMap();
                    hashMap.put(ResponseWithInnerData.TASK_ID, asString);
                    responseWithInnerData.innerData = hashMap;
                    msiContext.onSuccess(responseWithInnerData);
                    DownloadApi.this.c.remove(asString);
                    return;
                }
                msiContext.onError("downloadFile failed");
                DownloadApi.this.c.remove(asString);
            }
        });
        this.c.put(asString, a3);
    }

    @Override // com.meituan.network.download.IDownloadFileApi
    public final void a(MsiContext msiContext, String str) {
        Object[] objArr = {msiContext, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77f43cc19294b896acba5044601156a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77f43cc19294b896acba5044601156a9");
        } else if (!this.c.containsKey(str)) {
            msiContext.onError(400, "taskId 不存在 ");
        } else {
            this.c.get(str).cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37bb08f1c13aca554fa391afb02f460c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37bb08f1c13aca554fa391afb02f460c");
        }
        try {
            CRC32 crc32 = new CRC32();
            crc32.update(str.getBytes());
            return Long.toHexString(crc32.getValue());
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File a(String str, String str2) {
        File file;
        do {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d091cdb84169775569297b17b61ba66", RobustBitConfig.DEFAULT_VALUE)) {
                return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d091cdb84169775569297b17b61ba66");
            }
            String str3 = this.d;
            file = new File(str3, UUID.randomUUID().toString() + str + str2);
        } while (file.exists());
        return file;
    }
}
