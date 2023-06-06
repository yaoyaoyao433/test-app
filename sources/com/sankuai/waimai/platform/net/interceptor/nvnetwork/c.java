package com.sankuai.waimai.platform.net.interceptor.nvnetwork;

import android.text.TextUtils;
import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.q;
import com.dianping.nvnetwork.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.v;
import com.sankuai.waimai.platform.capacity.log.g;
import com.squareup.okhttp.u;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends g implements r {
    public static ChangeQuickRedirect b;
    final v c;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86665251dd0a9c590665f5e98de0d25d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86665251dd0a9c590665f5e98de0d25d");
        } else {
            this.c = new v();
        }
    }

    @Override // com.dianping.nvnetwork.r
    public final rx.d<q> intercept(r.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0cec0c85bfb6614c3b945da5b8bef73", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0cec0c85bfb6614c3b945da5b8bef73");
        }
        final Request a2 = aVar.a();
        final String str = a2.d;
        if (!str.startsWith(com.sankuai.waimai.platform.capacity.log.d.b)) {
            return aVar.a(a2);
        }
        return aVar.a(a2).d(new rx.functions.g<q, q>() { // from class: com.sankuai.waimai.platform.net.interceptor.nvnetwork.c.1
            public static ChangeQuickRedirect a;

            @Override // rx.functions.g
            public final /* synthetic */ q call(q qVar) {
                q qVar2 = qVar;
                Object[] objArr2 = {qVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6f70e4455db229d44d6ff25fb6d99e1f", RobustBitConfig.DEFAULT_VALUE)) {
                    return (q) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6f70e4455db229d44d6ff25fb6d99e1f");
                }
                c.this.c.execute(new a(qVar2, a2, str));
                return qVar2;
            }
        });
    }

    String a(q qVar) {
        byte[] result;
        Object[] objArr = {qVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba43324bb7f3c0ee3ae457e73c486cb5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba43324bb7f3c0ee3ae457e73c486cb5");
        }
        if (qVar == null || (result = qVar.result()) == null || result.length == 0) {
            return null;
        }
        try {
            String str = qVar.headers().get("Content-Type");
            u a2 = !TextUtils.isEmpty(str) ? u.a(str) : null;
            Charset charset = StandardCharsets.UTF_8;
            if (a2 != null) {
                charset = a2.a(charset);
            }
            return com.sankuai.waimai.platform.net.util.c.a(result, charset, qVar.headers().get("Content-Encoding"));
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            return null;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class a implements Runnable {
        public static ChangeQuickRedirect a;
        private final q c;
        private final Request d;
        private final String e;

        public a(q qVar, Request request, String str) {
            Object[] objArr = {c.this, qVar, request, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1349db3908d25163c3bf5e7d7183de67", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1349db3908d25163c3bf5e7d7183de67");
                return;
            }
            this.c = qVar;
            this.d = request;
            this.e = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 242
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.net.interceptor.nvnetwork.c.a.run():void");
        }
    }
}
