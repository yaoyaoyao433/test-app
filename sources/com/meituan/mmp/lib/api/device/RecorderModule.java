package com.meituan.mmp.lib.api.device;

import android.os.Handler;
import android.os.HandlerThread;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.mmp.lib.api.ServiceApi;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RecorderModule extends ServiceApi {
    public static ChangeQuickRedirect a;
    private volatile boolean h;
    private volatile boolean i;
    private Handler j;
    private HandlerThread l;
    private int m;
    private boolean n;

    /* JADX WARN: Removed duplicated region for block: B:109:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0267 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0271  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.meituan.mmp.lib.api.device.RecorderModule r19, org.json.JSONObject r20, com.meituan.mmp.main.IApiCallback r21) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.api.device.RecorderModule.a(com.meituan.mmp.lib.api.device.RecorderModule, org.json.JSONObject, com.meituan.mmp.main.IApiCallback):void");
    }

    public RecorderModule() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc76402b9d6f8112c7d02c8c5b23dde6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc76402b9d6f8112c7d02c8c5b23dde6");
            return;
        }
        this.m = -1;
        this.n = true;
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d025a9e678f3807a0af22fab8399ed94", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d025a9e678f3807a0af22fab8399ed94") : new String[]{"operateRecorder"};
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b283460d2ce75b65944169b536ab379", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b283460d2ce75b65944169b536ab379") : new String[]{"operateRecorder", "operateRecorder.start", "operateRecorder.pause", "operateRecorder.resume", "operateRecorder.stop", "onRecorderStateChange.start", "onRecorderStateChange.pause", "onRecorderStateChange.resume", "onRecorderStateChange.stop", "onRecorderStateChange.error"};
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] a(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "635eba400fa7888426a421d6fa23b3a4", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "635eba400fa7888426a421d6fa23b3a4") : new String[]{PermissionGuard.PERMISSION_MICROPHONE};
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084 A[Catch: JSONException -> 0x012a, TryCatch #0 {JSONException -> 0x012a, blocks: (B:6:0x002b, B:29:0x007f, B:31:0x0084, B:32:0x0089, B:34:0x00a1, B:35:0x00a6, B:37:0x00aa, B:39:0x00ae, B:40:0x00b8, B:41:0x00c0, B:43:0x00d8, B:44:0x00dc, B:46:0x00e0, B:48:0x00e4, B:49:0x00ed, B:50:0x00f4, B:52:0x00f8, B:54:0x00ff, B:56:0x0103, B:57:0x011e, B:15:0x004c, B:18:0x0058, B:21:0x0064, B:24:0x0070), top: B:63:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089 A[Catch: JSONException -> 0x012a, TryCatch #0 {JSONException -> 0x012a, blocks: (B:6:0x002b, B:29:0x007f, B:31:0x0084, B:32:0x0089, B:34:0x00a1, B:35:0x00a6, B:37:0x00aa, B:39:0x00ae, B:40:0x00b8, B:41:0x00c0, B:43:0x00d8, B:44:0x00dc, B:46:0x00e0, B:48:0x00e4, B:49:0x00ed, B:50:0x00f4, B:52:0x00f8, B:54:0x00ff, B:56:0x0103, B:57:0x011e, B:15:0x004c, B:18:0x0058, B:21:0x0064, B:24:0x0070), top: B:63:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c0 A[Catch: JSONException -> 0x012a, TryCatch #0 {JSONException -> 0x012a, blocks: (B:6:0x002b, B:29:0x007f, B:31:0x0084, B:32:0x0089, B:34:0x00a1, B:35:0x00a6, B:37:0x00aa, B:39:0x00ae, B:40:0x00b8, B:41:0x00c0, B:43:0x00d8, B:44:0x00dc, B:46:0x00e0, B:48:0x00e4, B:49:0x00ed, B:50:0x00f4, B:52:0x00f8, B:54:0x00ff, B:56:0x0103, B:57:0x011e, B:15:0x004c, B:18:0x0058, B:21:0x0064, B:24:0x0070), top: B:63:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f4 A[Catch: JSONException -> 0x012a, TryCatch #0 {JSONException -> 0x012a, blocks: (B:6:0x002b, B:29:0x007f, B:31:0x0084, B:32:0x0089, B:34:0x00a1, B:35:0x00a6, B:37:0x00aa, B:39:0x00ae, B:40:0x00b8, B:41:0x00c0, B:43:0x00d8, B:44:0x00dc, B:46:0x00e0, B:48:0x00e4, B:49:0x00ed, B:50:0x00f4, B:52:0x00f8, B:54:0x00ff, B:56:0x0103, B:57:0x011e, B:15:0x004c, B:18:0x0058, B:21:0x0064, B:24:0x0070), top: B:63:0x002b }] */
    @Override // com.meituan.mmp.lib.api.AbsApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void invoke(java.lang.String r20, final org.json.JSONObject r21, final com.meituan.mmp.main.IApiCallback r22) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.api.device.RecorderModule.invoke(java.lang.String, org.json.JSONObject, com.meituan.mmp.main.IApiCallback):void");
    }

    @Override // com.meituan.mmp.lib.api.ServiceApi
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f36ddbe2bf40bc1b08ac29fa54aca53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f36ddbe2bf40bc1b08ac29fa54aca53");
            return;
        }
        this.h = false;
        if (this.l != null) {
            this.l.quit();
        }
    }

    private void a(JSONObject jSONObject, IApiCallback iApiCallback) {
        Object[] objArr = {jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "438535631e8d5bfe516f094ac5238847", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "438535631e8d5bfe516f094ac5238847");
        } else if (this.h) {
            this.h = false;
            this.i = false;
            b("stop", null);
            this.m = -1;
        } else {
            a("stop fail: no AudioRecord");
        }
    }

    private void b(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fb6887b7c4604d11c7b683dad2dda83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fb6887b7c4604d11c7b683dad2dda83");
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("state", str);
            final String jSONObject2 = jSONObject.toString();
            com.meituan.mmp.lib.executor.a.b(new com.meituan.mmp.lib.executor.b() { // from class: com.meituan.mmp.lib.api.device.RecorderModule.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f88ed78ac1a0c9e3368b3a096c9e0a39", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f88ed78ac1a0c9e3368b3a096c9e0a39");
                    } else {
                        RecorderModule.this.a("onRecorderStateChange", jSONObject2, 0);
                    }
                }
            });
        } catch (JSONException unused) {
        }
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9525d758203c0b6e0b9be09269c52d55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9525d758203c0b6e0b9be09269c52d55");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errMsg", str);
            b("error", jSONObject);
        } catch (JSONException unused) {
        }
    }
}
