package com.meituan.android.neohybrid.v2.neo.adapter;

import android.support.annotation.Nullable;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.meituan.android.neohybrid.protocol.kernel.c;
import com.meituan.android.neohybrid.util.f;
import com.meituan.android.neohybrid.v2.core.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a extends com.meituan.android.neohybrid.framework.webcompat.a {
    public static ChangeQuickRedirect a;
    private final com.meituan.android.neohybrid.v2.core.a b;
    private final List<com.meituan.android.neohybrid.v2.neo.offline.a> c;

    public a(com.meituan.android.neohybrid.v2.core.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87618f1a10b21aea0ed8e0b86dea0ee5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87618f1a10b21aea0ed8e0b86dea0ee5");
            return;
        }
        this.b = aVar;
        this.c = new ArrayList();
    }

    public final void a(com.meituan.android.neohybrid.v2.neo.offline.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ff7d38934944385215bc2928b66fde8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ff7d38934944385215bc2928b66fde8");
        } else {
            this.c.add(aVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
        if (r2.equals(r3) != false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016c A[EDGE_INSN: B:63:0x016c->B:56:0x016c ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.webkit.WebResourceResponse c(com.meituan.android.neohybrid.protocol.kernel.c r21, android.webkit.WebResourceRequest r22) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.neohybrid.v2.neo.adapter.a.c(com.meituan.android.neohybrid.protocol.kernel.c, android.webkit.WebResourceRequest):android.webkit.WebResourceResponse");
    }

    @Override // com.meituan.android.neohybrid.framework.webcompat.a, com.meituan.android.neohybrid.protocol.kernel.d
    @Nullable
    public final WebResourceResponse b(c cVar, WebResourceRequest webResourceRequest) {
        Object[] objArr = {cVar, webResourceRequest};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d4226b7b4fc646043f53c10b411e412", RobustBitConfig.DEFAULT_VALUE)) {
            return (WebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d4226b7b4fc646043f53c10b411e412");
        }
        WebResourceResponse c = c(cVar, webResourceRequest);
        if (c == null && com.meituan.android.neohybrid.init.a.h()) {
            String str = "线上资源";
            if (this.b.c instanceof s) {
                str = "线上资源;NSR流程";
            }
            f.a(str + " url=" + webResourceRequest.getUrl());
        }
        return c;
    }
}
