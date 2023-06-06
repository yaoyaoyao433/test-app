package com.sankuai.meituan.trafficcontroller;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.q;
import java.io.InputStream;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements com.sankuai.meituan.retrofit2.raw.b {
    public static ChangeQuickRedirect a;
    private final String b;
    private final String c;
    private final int d;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.trafficcontroller.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0656a extends ap {
        @Override // com.sankuai.meituan.retrofit2.ap
        public final long contentLength() {
            return 0L;
        }

        @Override // com.sankuai.meituan.retrofit2.ap
        public final String contentType() {
            return null;
        }

        @Override // com.sankuai.meituan.retrofit2.ap
        public final InputStream source() {
            return null;
        }
    }

    @Override // com.sankuai.meituan.retrofit2.raw.b
    public final List<q> headers() {
        return null;
    }

    public a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7188b0c135f8dd7b5e28bd2e7f3009e1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7188b0c135f8dd7b5e28bd2e7f3009e1");
            return;
        }
        this.b = str;
        this.d = 10;
        this.c = "Requests are too frequent";
    }

    @Override // com.sankuai.meituan.retrofit2.raw.b
    public final String url() {
        return this.b;
    }

    @Override // com.sankuai.meituan.retrofit2.raw.b
    public final int code() {
        return this.d;
    }

    @Override // com.sankuai.meituan.retrofit2.raw.b
    public final String reason() {
        return this.c;
    }

    @Override // com.sankuai.meituan.retrofit2.raw.b
    public final ap body() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7720872730844cca9567a0c2a1d97213", RobustBitConfig.DEFAULT_VALUE) ? (ap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7720872730844cca9567a0c2a1d97213") : new C0656a();
    }
}
