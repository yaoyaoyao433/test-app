package com.meituan.metrics.traffic.okhttp;

import android.support.annotation.Keep;
import com.meituan.metrics.traffic.reflection.ReflectWrapper;
import com.meituan.privacy.PrivacyUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.okhttp.internal.http.l;
import com.squareup.okhttp.r;
import com.squareup.okhttp.t;
import com.squareup.okhttp.v;
import com.squareup.okhttp.w;
import com.squareup.okhttp.x;
import com.squareup.okhttp.z;
import java.io.IOException;
import okio.c;
import okio.m;
import okio.s;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class OkHttp2PrivacyInterceptor implements ReflectWrapper, t {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.squareup.okhttp.t
    public z intercept(t.a aVar) throws IOException {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "827ab5e2aa762db42a1e690ca5ef129f", RobustBitConfig.DEFAULT_VALUE)) {
            return (z) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "827ab5e2aa762db42a1e690ca5ef129f");
        }
        x a = aVar.a();
        if (!PrivacyUtil.a()) {
            return aVar.a(a);
        }
        if (PrivacyUtil.a(a.a())) {
            PrivacyUtil.b a2 = PrivacyUtil.a(1, a.a());
            if (a2.a == 2) {
                z.a aVar2 = new z.a();
                aVar2.a = a;
                aVar2.b = w.HTTP_1_0;
                aVar2.c = 403;
                aVar2.d = "CIPPrivacy forbid request";
                aVar2.g = new l(r.a(new String[0]), m.a(new ErrorLengthSource()));
                return aVar2.a();
            } else if (a2.a == 1) {
                return aVar.a(a.f().a(a2.b).a());
            }
        }
        return aVar.a(a);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class ErrorLengthSource implements s {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // okio.s
        public long read(c cVar, long j) throws IOException {
            return -1L;
        }

        public ErrorLengthSource() {
        }

        @Override // okio.s
        public okio.t timeout() {
            return okio.t.NONE;
        }
    }

    @Override // com.meituan.metrics.traffic.reflection.ReflectWrapper
    public void onWrapper(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ca011032f42767af6b6332c415d4a8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ca011032f42767af6b6332c415d4a8e");
        } else if (obj instanceof v) {
            v vVar = (v) obj;
            vVar.g.add(this);
            vVar.g.add(new OkHttp2CandyInterceptor());
        }
    }
}
