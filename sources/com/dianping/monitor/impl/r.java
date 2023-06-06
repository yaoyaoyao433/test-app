package com.dianping.monitor.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import com.meituan.ai.speech.sdk.knb.JsErrorCode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.xp.core.XPlayerConstants;
import com.tencent.liteav.audio.TXEAudioDef;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.Random;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class r {
    public static ChangeQuickRedirect a;
    @SuppressLint({"StaticFieldLeak"})
    protected static Context b;
    protected static int c;
    protected static String d;
    public static final Random e = new Random();

    public static void a(String str, String str2, int i, String str3, int i2, int i3, long j, Throwable th) {
        int i4;
        Object[] objArr = {str, str2, Integer.valueOf(i), str3, Integer.valueOf(i2), Integer.valueOf(i3), new Long(j), th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8025a4d163b708d21d751c7d216e5252", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8025a4d163b708d21d751c7d216e5252");
            return;
        }
        if (a.DEBUG) {
            new StringBuilder("self metricUpload --> t: ").append(th != null ? th.getMessage() : "");
        }
        if (b == null || c == 0) {
            return;
        }
        if (e.nextFloat() >= com.dianping.monitor.b.j()) {
            boolean z = a.DEBUG;
            return;
        }
        if (th == null) {
            i4 = i;
        } else if (th instanceof IllegalAccessError) {
            i4 = JsErrorCode.AUDIO_RECORD_START_FAILED;
        } else if (th instanceof SocketTimeoutException) {
            i4 = -104;
        } else if ((th instanceof UnknownHostException) || (th instanceof ConnectException)) {
            i4 = -102;
        } else {
            i4 = ((th instanceof InterruptedIOException) || (th instanceof InterruptedException)) ? -304 : i == 2147483392 ? TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT : -106;
        }
        boolean z2 = a.DEBUG;
        m mVar = new m(XPlayerConstants.FFP_MSG_VIDEO_FROZEN_ENDED, b, d, s.a(b));
        mVar.a("url", str);
        mVar.a("tunnel", str2);
        StringBuilder sb = new StringBuilder();
        sb.append(i4);
        mVar.a("code", sb.toString());
        mVar.a("http_version", str3);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c);
        mVar.a("appId", sb2.toString());
        mVar.a("response_time", Collections.singletonList(Float.valueOf((float) j)));
        mVar.a("request_bytes", Collections.singletonList(Float.valueOf(i2)));
        mVar.a("response_bytes", Collections.singletonList(Float.valueOf(i3)));
        mVar.a();
    }
}
