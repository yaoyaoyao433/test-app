package com.meituan.mmp.lib.api.network;

import android.os.SystemClock;
import android.support.v4.app.NotificationCompat;
import com.meituan.msi.bean.ResponseWithInnerData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a = null;
    private static String b = "ProgressListener";
    private long c;
    private com.meituan.mmp.lib.interfaces.c d;
    private String e;
    private int f;

    public b(com.meituan.mmp.lib.interfaces.c cVar, String str, int i) {
        Object[] objArr = {cVar, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ced6168c47cef0ead781d5526d17fc9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ced6168c47cef0ead781d5526d17fc9");
            return;
        }
        this.d = cVar;
        this.e = str;
        this.f = i;
    }

    public final void a(long j, long j2, boolean z) {
        double d;
        Object[] objArr = {new Long(j), new Long(j2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ae67a94222db76e2b815f8efc18d013", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ae67a94222db76e2b815f8efc18d013");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ResponseWithInnerData.TASK_ID, this.f);
            jSONObject.put("totalBytesWritten", j);
            jSONObject.put("totalBytesExpectedToWrite", j2);
            if (j2 == 0) {
                com.meituan.mmp.lib.trace.b.b(b, "Content-Length is 0! Event:" + this.e);
                d = 0.0d;
            } else {
                d = (j * 100) / j2;
            }
            jSONObject.put(NotificationCompat.CATEGORY_PROGRESS, d);
            if (Math.abs(SystemClock.elapsedRealtime() - this.c) > 100 || z) {
                this.c = SystemClock.elapsedRealtime();
                this.d.a(this.e, jSONObject.toString(), 0);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
