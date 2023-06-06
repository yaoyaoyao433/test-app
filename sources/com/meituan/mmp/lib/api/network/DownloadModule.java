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
public class DownloadModule extends ServiceApi {
    public static ChangeQuickRedirect a;
    private String h;
    private Map<Integer, Call> i;

    public DownloadModule() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77f6464dcaf74ce844264c029fbbef20", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77f6464dcaf74ce844264c029fbbef20");
        } else {
            this.i = new ConcurrentHashMap();
        }
    }

    public static /* synthetic */ JSONObject a(DownloadModule downloadModule, Response response, int i) {
        Object[] objArr = {response, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, downloadModule, changeQuickRedirect, false, "598234c4ad545d27940aa550628499bb", RobustBitConfig.DEFAULT_VALUE) ? (JSONObject) PatchProxy.accessDispatch(objArr, downloadModule, changeQuickRedirect, false, "598234c4ad545d27940aa550628499bb") : a.a(response, i, downloadModule.d, "onDownloadFileHeadersReceived");
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49bb7b9b32ed9df1d949581ac533a4e3", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49bb7b9b32ed9df1d949581ac533a4e3") : new String[]{"downloadFile", "abortDownloadFile"};
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b7f7680d277da47fdf7283c0ab06864", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b7f7680d277da47fdf7283c0ab06864") : new String[]{"downloadFile", "abortDownloadFile", "onDownloadFileProgressUpdate.onProgressUpdate", "onDownloadFileHeadersReceived.onHeaderReceived"};
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065 A[Catch: Exception -> 0x0179, TryCatch #0 {Exception -> 0x0179, blocks: (B:7:0x003c, B:19:0x0060, B:21:0x0065, B:23:0x007e, B:24:0x0083, B:25:0x008a, B:27:0x00a3, B:28:0x00a8, B:30:0x00d5, B:33:0x00dd, B:35:0x00e3, B:36:0x00ee, B:38:0x0117, B:39:0x0128, B:40:0x016e, B:12:0x004b, B:15:0x0055), top: B:45:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008a A[Catch: Exception -> 0x0179, TryCatch #0 {Exception -> 0x0179, blocks: (B:7:0x003c, B:19:0x0060, B:21:0x0065, B:23:0x007e, B:24:0x0083, B:25:0x008a, B:27:0x00a3, B:28:0x00a8, B:30:0x00d5, B:33:0x00dd, B:35:0x00e3, B:36:0x00ee, B:38:0x0117, B:39:0x0128, B:40:0x016e, B:12:0x004b, B:15:0x0055), top: B:45:0x003c }] */
    @Override // com.meituan.mmp.lib.api.AbsApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void invoke(java.lang.String r19, org.json.JSONObject r20, final com.meituan.mmp.main.IApiCallback r21) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.api.network.DownloadModule.invoke(java.lang.String, org.json.JSONObject, com.meituan.mmp.main.IApiCallback):void");
    }
}
