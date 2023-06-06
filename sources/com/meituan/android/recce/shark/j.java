package com.meituan.android.recce.shark;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class j implements com.dianping.nvnetwork.r {
    public static ChangeQuickRedirect a;
    private final Context b;

    public j(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08eaf7c9f5b55b3f59e331cb775d2444", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08eaf7c9f5b55b3f59e331cb775d2444");
        } else {
            this.b = context;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00f6 A[Catch: IOException -> 0x0140, TryCatch #2 {IOException -> 0x0140, blocks: (B:6:0x001e, B:8:0x005e, B:25:0x00f6, B:27:0x00fb, B:28:0x011b, B:30:0x0121, B:31:0x0137, B:9:0x008a, B:11:0x0097, B:12:0x009e, B:14:0x00b1, B:16:0x00bb, B:17:0x00cb, B:22:0x00e5, B:23:0x00e8), top: B:40:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fb A[Catch: IOException -> 0x0140, TryCatch #2 {IOException -> 0x0140, blocks: (B:6:0x001e, B:8:0x005e, B:25:0x00f6, B:27:0x00fb, B:28:0x011b, B:30:0x0121, B:31:0x0137, B:9:0x008a, B:11:0x0097, B:12:0x009e, B:14:0x00b1, B:16:0x00bb, B:17:0x00cb, B:22:0x00e5, B:23:0x00e8), top: B:40:0x001e }] */
    @Override // com.dianping.nvnetwork.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final rx.d<com.dianping.nvnetwork.q> intercept(com.dianping.nvnetwork.r.a r14) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.recce.shark.j.intercept(com.dianping.nvnetwork.r$a):rx.d");
    }
}
