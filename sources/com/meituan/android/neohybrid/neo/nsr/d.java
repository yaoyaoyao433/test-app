package com.meituan.android.neohybrid.neo.nsr;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.neohybrid.core.config.NeoConfig;
import com.meituan.android.neohybrid.core.m;
import com.meituan.android.neohybrid.core.t;
import com.meituan.android.neohybrid.core.w;
import com.meituan.android.neohybrid.neo.nsr.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d implements c.b {
    public static ChangeQuickRedirect a;
    com.meituan.android.neohybrid.core.a b;
    String c;
    a d;
    long e;
    boolean f;
    private NeoConfig g;
    private String h;
    private Handler i;

    public d(NeoConfig neoConfig, c.b bVar, long j, boolean z) {
        Object[] objArr = {neoConfig, bVar, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54b07137286517782fb93f37b7459461", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54b07137286517782fb93f37b7459461");
            return;
        }
        this.i = new Handler(Looper.getMainLooper());
        m a2 = m.a();
        a2.b = t.NATIVE_SIDE_RENDER;
        this.b = a2.b();
        this.b.a(bVar, this);
        if (neoConfig == null || !neoConfig.isLegal()) {
            this.d = a.FAIL;
            return;
        }
        this.g = neoConfig;
        this.h = this.g.getUrl();
        this.c = a(this.h);
        this.g.setUrl(this.c);
        this.e = j;
        this.f = z;
        com.meituan.android.neohybrid.neo.report.d.a(this.b, "neo_nsr", "1");
        a(a.READY);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10e828f15728e0b06e964aa20aa1e889", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10e828f15728e0b06e964aa20aa1e889");
        } else if (this.b == null) {
        } else {
            if (this.d != a.READY) {
                this.b.b(this.c, PushConstants.BROADCAST_MESSAGE_ARRIVE, "NSR流程错误");
                return;
            }
            this.d = a.RENDER;
            Context d = com.meituan.android.neohybrid.init.a.d();
            Bundle newNeoArguments = this.g.newNeoArguments(null);
            if (this.f) {
                this.i.post(f.a(this, d, newNeoArguments));
                this.i.post(g.a(this, d));
                this.i.post(h.a(this));
                return;
            }
            this.b.a(w.a(d, this.b), newNeoArguments);
            this.b.a(LayoutInflater.from(d), (ViewGroup) null);
            this.b.a((View) null, (Bundle) null);
            this.b.a((Bundle) null);
        }
    }

    public final com.meituan.android.neohybrid.core.a a(boolean z) {
        if (this.d == a.SUCC || z) {
            return this.b;
        }
        return null;
    }

    @Override // com.meituan.android.neohybrid.neo.nsr.c.b
    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3a1873871071e488b0504a560db7be4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3a1873871071e488b0504a560db7be4");
            return;
        }
        this.d = a.SUCC;
        a(a.SUCC);
    }

    @Override // com.meituan.android.neohybrid.neo.nsr.c.b
    public final void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7526fedc434dd2e5f9d7596f9a563e50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7526fedc434dd2e5f9d7596f9a563e50");
            return;
        }
        this.d = a.FETCHED;
        a(a.FETCHED);
        this.b = null;
    }

    @Override // com.meituan.android.neohybrid.neo.nsr.c.b
    public final void b(String str, int i, String str2) {
        Object[] objArr = {str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0809314ffdc6614ca9f9576bde769f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0809314ffdc6614ca9f9576bde769f4");
            return;
        }
        this.d = a.FAIL;
        a(a.FAIL);
    }

    @Override // com.meituan.android.neohybrid.neo.nsr.c.b
    public final void e(String str) {
        this.d = a.DESTROY;
    }

    private String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e94e43232b9612634a9a0df307e17bd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e94e43232b9612634a9a0df307e17bd");
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter("neo_nsr", "1").toString();
        } catch (Exception e) {
            com.meituan.android.neohybrid.neo.report.b.a(e, "NSRPersist_appendNSRQuery", (Map<String, Object>) null);
            return str;
        }
    }

    private void a(@NonNull a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7543ffe2a2750ced37f5314b978dcc00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7543ffe2a2750ced37f5314b978dcc00");
            return;
        }
        String[] strArr = new String[2];
        switch (aVar) {
            case READY:
                strArr[0] = "b_pay_neo_nsr_start_mv";
                strArr[1] = "neo_nsr_start";
                break;
            case SUCC:
                strArr[0] = "b_pay_neo_nsr_succ_mv";
                strArr[1] = "neo_nsr_succ";
                break;
            case FETCHED:
                strArr[0] = "b_pay_neo_nsr_fetch_mv";
                strArr[1] = "neo_nsr_fetch";
                break;
            case FAIL:
                strArr[0] = "b_pay_neo_nsr_fail_mv";
                strArr[1] = "neo_nsr_fail";
                break;
        }
        if (this.b == null || this.g == null || TextUtils.isEmpty(strArr[0]) || TextUtils.isEmpty(strArr[1])) {
            return;
        }
        com.meituan.android.neohybrid.neo.report.d.a(this.b, strArr[0], "c_pay_7c9fc4b4", null, com.meituan.android.neohybrid.neo.report.a.c("url", this.c).a("flag", this.f ? "idle" : "normal").b);
        com.meituan.android.neohybrid.neo.report.d.c(this.b, strArr[1], null);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum a {
        READY,
        RENDER,
        SUCC,
        FAIL,
        DESTROY,
        FETCHED;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c37e91c760d37b4a270a0ec25d1ceea", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c37e91c760d37b4a270a0ec25d1ceea");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "abcbc8b0365968d622d44d28e426fab8", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "abcbc8b0365968d622d44d28e426fab8") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "831cc54eb92d56a2b76a0e6da947ddf8", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "831cc54eb92d56a2b76a0e6da947ddf8") : (a[]) values().clone();
        }
    }
}
