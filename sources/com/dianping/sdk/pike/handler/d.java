package com.dianping.sdk.pike.handler;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.dianping.sdk.pike.packet.af;
import com.dianping.sdk.pike.packet.k;
import com.dianping.sdk.pike.service.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class d<R extends com.dianping.sdk.pike.packet.k> {
    public static ChangeQuickRedirect b;
    final q c;
    public b<R> d;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a<R extends com.dianping.sdk.pike.packet.k> implements b<R> {
        @Override // com.dianping.sdk.pike.handler.d.b
        public void a(int i) {
        }

        @Override // com.dianping.sdk.pike.handler.d.b
        public void a(R r) {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface b<R extends com.dianping.sdk.pike.packet.k> {
        void a(int i);

        void a(R r);
    }

    public abstract void a(@NonNull com.dianping.sdk.pike.service.l lVar, @NonNull com.dianping.nvtunnelkit.exception.d dVar);

    public abstract void a(@Nullable com.dianping.sdk.pike.service.l lVar, @NonNull af afVar);

    public d(q qVar) {
        Object[] objArr = {qVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5152d1f4dbc5f36a0f25c48ee1f0b0b8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5152d1f4dbc5f36a0f25c48ee1f0b0b8");
        } else {
            this.c = qVar;
        }
    }

    public void a(com.dianping.sdk.pike.service.l lVar, R r, String str) {
        Object[] objArr = {lVar, r, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd93df93074ec33dee88701819512b8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd93df93074ec33dee88701819512b8e");
        } else {
            a(lVar, r, str, -65, null);
        }
    }

    public final void a(com.dianping.sdk.pike.service.l lVar, int i, String str) {
        Object[] objArr = {lVar, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "514e716f4cf65fb3703d98318e428a01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "514e716f4cf65fb3703d98318e428a01");
        } else {
            a(lVar, null, null, i, str);
        }
    }

    private void a(final com.dianping.sdk.pike.service.l lVar, final R r, final String str, final int i, final String str2) {
        Object[] objArr = {lVar, r, str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f89b7c5cb7b5b0721aa0de168c3bef6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f89b7c5cb7b5b0721aa0de168c3bef6");
        } else if (lVar == null) {
            String str3 = "pike session is null, successMsg: " + str + ", failedMsg: " + str2 + "errCode: " + i;
            com.dianping.sdk.pike.i.a("BaseHandler", str3);
            com.dianping.sdk.pike.util.f.a("pike_err", -4, 0, 0, 0, "", str3, "", 100);
        } else {
            this.c.a(new Runnable() { // from class: com.dianping.sdk.pike.handler.d.1
                public static ChangeQuickRedirect a;

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "293458479a63a7dc6b5f21881bbe239a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "293458479a63a7dc6b5f21881bbe239a");
                        return;
                    }
                    lVar.d = r;
                    if (r != null && r.b()) {
                        if (d.this.d != null) {
                            d.this.d.a((b<R>) r);
                        }
                        q qVar = d.this.c;
                        com.dianping.sdk.pike.service.l lVar2 = lVar;
                        String str4 = str;
                        Object[] objArr3 = {lVar2, str4};
                        ChangeQuickRedirect changeQuickRedirect3 = q.a;
                        if (PatchProxy.isSupport(objArr3, qVar, changeQuickRedirect3, false, "d895584fa168bef995fc298a3ad144c4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, qVar, changeQuickRedirect3, false, "d895584fa168bef995fc298a3ad144c4");
                            return;
                        }
                        qVar.e();
                        lVar2.l = true;
                        lVar2.b();
                        qVar.a(lVar2.g, str4);
                        return;
                    }
                    if (d.this.d != null) {
                        d.this.d.a(i);
                    }
                    d.this.c.a(lVar, i, str2);
                }
            });
        }
    }
}
