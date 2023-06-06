package com.sankuai.meituan.kernel.net.msi;

import android.os.SystemClock;
import android.text.TextUtils;
import com.meituan.msi.annotations.MsiNewApi;
import com.meituan.msi.bean.DefaultValue;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.bean.ResponseWithInnerData;
import com.meituan.network.HeaderReceivedEvent;
import com.meituan.network.request.NetworkPerformanceEvent;
import com.meituan.network.upload.IUploadFileApi;
import com.meituan.network.upload.UploadFileParam;
import com.meituan.network.upload.UploadFileResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.kernel.net.msi.progress.e;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.ad;
import com.sankuai.meituan.retrofit2.ae;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.al;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.f;
import com.sankuai.meituan.retrofit2.q;
import com.sankuai.meituan.retrofit2.r;
import com.sankuai.meituan.retrofit2.raw.a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
@MsiNewApi
/* loaded from: classes4.dex */
public class UploadApi extends IUploadFileApi {
    public static ChangeQuickRedirect b;
    private final Map<String, Call> c;
    private volatile a.InterfaceC0637a d;

    public UploadApi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2cc186dd316ef340aceaad43cba605e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2cc186dd316ef340aceaad43cba605e");
        } else {
            this.c = new ConcurrentHashMap();
        }
    }

    @Override // com.meituan.network.upload.IUploadFileApi
    public final void a(final MsiContext msiContext, UploadFileParam uploadFileParam) {
        Object[] objArr = {msiContext, uploadFileParam};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01bfef34fc59252bc2f48e8f61c21e51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01bfef34fc59252bc2f48e8f61c21e51");
            return;
        }
        String str = uploadFileParam.url;
        String str2 = uploadFileParam.filePath;
        String str3 = uploadFileParam.name;
        final String asString = msiContext.getInnerArgs().get(ResponseWithInnerData.TASK_ID).getAsString();
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        String a = msiContext.getFileProvider().a(str2);
        File file = new File(a);
        if (!file.exists()) {
            msiContext.onError(400, "file not exist " + a);
            return;
        }
        ae.a aVar = new ae.a();
        aVar.a(ae.f);
        Map<String, String> map = uploadFileParam.formData;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                aVar.a(ae.b.a(entry.getKey(), null, al.a((ad) null, entry.getValue().getBytes())));
            }
        }
        aVar.a(ae.b.a(str3, file.getName(), al.a(file, b.b(a))));
        aj.a a2 = new aj.a().a((uploadFileParam.header == null ? new r.a().a() : r.a(uploadFileParam.header)).b);
        a2.b = str;
        a2.d = aVar.a();
        a2.c = "POST";
        int i = uploadFileParam.timeout;
        Object[] objArr2 = {msiContext, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aeece22b3b16b8722b59cfc0421bfa81", RobustBitConfig.DEFAULT_VALUE)) {
            i = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aeece22b3b16b8722b59cfc0421bfa81")).intValue();
        } else if (i <= 0) {
            Integer num = (Integer) msiContext.getDefaultValue(DefaultValue.DEFAULT_VALUE_UPLOAD_TIMEOUT);
            i = num != null ? num.intValue() : 60000;
        }
        if (i > 0) {
            a2.e = i;
        }
        if (this.d == null) {
            this.d = com.sankuai.meituan.kernel.net.msi.callfactory.a.a("upload");
        }
        ar a3 = new ar.a().a(b.b).a(this.d).a(new com.sankuai.meituan.kernel.net.msi.progress.d(new e("UploadTask.onProgressUpdate", asString, msiContext))).a();
        final NetworkPerformanceEvent a4 = d.a(str);
        final Map<String, Object> b2 = d.b(a4.url);
        final aj a5 = a2.a();
        Call<ap> a6 = a3.a(a5);
        a6.a(new f<ap>() { // from class: com.sankuai.meituan.kernel.net.msi.UploadApi.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.retrofit2.f
            public final void onFailure(Call<ap> call, Throwable th) {
                MsiContext msiContext2;
                String message;
                Object[] objArr3 = {call, th};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7e837670eeebd38f73bc5691ef9134b3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7e837670eeebd38f73bc5691ef9134b3");
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put(ResponseWithInnerData.TASK_ID, asString);
                if (th != null && TextUtils.equals("Already canceled", th.getMessage())) {
                    msiContext2 = msiContext;
                    message = "uploadFile:fail abort";
                } else {
                    msiContext2 = msiContext;
                    message = th == null ? "" : th.getMessage();
                }
                msiContext2.onError(message, hashMap);
                UploadApi.this.c.remove(asString);
                d.a(msiContext, a4, a5, null, elapsedRealtime, "upload");
                b2.put("statusCode", -1);
                b2.put("message", th.getMessage());
                com.sankuai.meituan.kernel.net.msi.log.a.a(b2, msiContext.request, "msi.api.network", (int) a4.value, 1.0f);
            }

            /* JADX WARN: Type inference failed for: r11v6, types: [T, com.meituan.network.upload.UploadFileResult] */
            @Override // com.sankuai.meituan.retrofit2.f
            public final void onResponse(Call<ap> call, Response<ap> response) {
                Object[] objArr3 = {call, response};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a9f1fe43421b243a9875602e18609ced", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a9f1fe43421b243a9875602e18609ced");
                    return;
                }
                HeaderReceivedEvent headerReceivedEvent = new HeaderReceivedEvent();
                headerReceivedEvent.header = new HashMap();
                List<q> list = response.g;
                ArrayList arrayList = new ArrayList();
                if (list != null) {
                    for (q qVar : list) {
                        if ("Set-Cookie".equalsIgnoreCase(qVar.b)) {
                            arrayList.add(b.a(qVar.c));
                        } else {
                            headerReceivedEvent.header.put(qVar.b, b.a(qVar.c));
                        }
                    }
                }
                headerReceivedEvent.header.put("Set-Cookie", TextUtils.join(CommonConstant.Symbol.COMMA, arrayList));
                headerReceivedEvent.cookies = arrayList;
                msiContext.dispatchEvent("UploadTask.onHeadersReceived", headerReceivedEvent, asString);
                d.a(msiContext, a4, a5, response, elapsedRealtime, "upload");
                b2.put("statusCode", Integer.valueOf(response.c));
                com.sankuai.meituan.kernel.net.msi.log.a.a(b2, msiContext.request, "msi.api.network", (int) a4.value, 1.0f);
                ?? uploadFileResult = new UploadFileResult();
                uploadFileResult.statusCode = response.c;
                uploadFileResult.data = response.e != null ? response.e.string() : null;
                ResponseWithInnerData responseWithInnerData = new ResponseWithInnerData();
                responseWithInnerData.response = uploadFileResult;
                HashMap hashMap = new HashMap();
                hashMap.put(ResponseWithInnerData.TASK_ID, asString);
                responseWithInnerData.innerData = hashMap;
                msiContext.onSuccess(responseWithInnerData);
                UploadApi.this.c.remove(asString);
            }
        });
        this.c.put(asString, a6);
    }

    @Override // com.meituan.network.upload.IUploadFileApi
    public final void a(MsiContext msiContext, String str) {
        Object[] objArr = {msiContext, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "114f2aa87f4cf0480f3ac61865cb5770", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "114f2aa87f4cf0480f3ac61865cb5770");
        } else if (!this.c.containsKey(str)) {
            msiContext.onError(400, "taskId 不存在 ");
        } else {
            this.c.get(str).cancel();
        }
    }
}
