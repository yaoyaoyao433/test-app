package com.meituan.mmp.lib.api.network;

import com.meituan.mmp.lib.api.ServiceApi;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.Call;
import okhttp3.Response;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class UploadModule extends ServiceApi {
    public static ChangeQuickRedirect a;
    private Map<Integer, Call> h;

    public UploadModule() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "053cacde22f129918918cb16f44f2eaa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "053cacde22f129918918cb16f44f2eaa");
        } else {
            this.h = new ConcurrentHashMap();
        }
    }

    public static /* synthetic */ JSONObject a(UploadModule uploadModule, Response response, int i) {
        Object[] objArr = {response, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, uploadModule, changeQuickRedirect, false, "69a512b4f1aa6bb8a69cd2826800081e", RobustBitConfig.DEFAULT_VALUE) ? (JSONObject) PatchProxy.accessDispatch(objArr, uploadModule, changeQuickRedirect, false, "69a512b4f1aa6bb8a69cd2826800081e") : a.a(response, i, uploadModule.d, "onUploadFileHeadersReceived");
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf0d53c3b91912302a0ba0892d2811e9", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf0d53c3b91912302a0ba0892d2811e9") : new String[]{"uploadFile", "abortUploadFile"};
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0b6ca828436cc4c8f93ee863ae8acd1", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0b6ca828436cc4c8f93ee863ae8acd1") : new String[]{"uploadFile", "abortUploadFile", "onUploadFileProgressUpdate.onProgressUpdate", "onUploadFileHeadersReceived.onHeaderReceived"};
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058 A[Catch: Exception -> 0x0212, TryCatch #0 {Exception -> 0x0212, blocks: (B:7:0x002e, B:19:0x0053, B:21:0x0058, B:23:0x0071, B:24:0x0076, B:25:0x007d, B:27:0x0096, B:28:0x009b, B:30:0x00d4, B:32:0x00da, B:35:0x00e2, B:37:0x00eb, B:42:0x010f, B:43:0x011b, B:45:0x0126, B:46:0x0132, B:47:0x0150, B:49:0x0156, B:50:0x016f, B:52:0x01a7, B:53:0x01c1, B:38:0x00ff, B:40:0x0108, B:54:0x0206, B:12:0x003d, B:15:0x0047), top: B:59:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d A[Catch: Exception -> 0x0212, TryCatch #0 {Exception -> 0x0212, blocks: (B:7:0x002e, B:19:0x0053, B:21:0x0058, B:23:0x0071, B:24:0x0076, B:25:0x007d, B:27:0x0096, B:28:0x009b, B:30:0x00d4, B:32:0x00da, B:35:0x00e2, B:37:0x00eb, B:42:0x010f, B:43:0x011b, B:45:0x0126, B:46:0x0132, B:47:0x0150, B:49:0x0156, B:50:0x016f, B:52:0x01a7, B:53:0x01c1, B:38:0x00ff, B:40:0x0108, B:54:0x0206, B:12:0x003d, B:15:0x0047), top: B:59:0x002e }] */
    @Override // com.meituan.mmp.lib.api.AbsApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void invoke(java.lang.String r19, org.json.JSONObject r20, final com.meituan.mmp.main.IApiCallback r21) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.api.network.UploadModule.invoke(java.lang.String, org.json.JSONObject, com.meituan.mmp.main.IApiCallback):void");
    }
}
