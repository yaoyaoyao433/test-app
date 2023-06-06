package com.sankuai.waimai.store.router;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.monitor.cache.SchemeCache;
import com.sankuai.waimai.store.util.monitor.monitor.SGCommonScheme;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements com.sankuai.waimai.router.core.e {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.router.core.e
    public final void a(@NonNull com.sankuai.waimai.router.core.j jVar, int i) {
        Object[] objArr = {jVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7de621569c1d6883e8a01f9d2b0ee94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7de621569c1d6883e8a01f9d2b0ee94");
            return;
        }
        if (i != -1) {
            SGCommonScheme sGCommonScheme = SGCommonScheme.OpenError;
            com.sankuai.waimai.store.util.monitor.c.a(sGCommonScheme, "url=" + jVar.d.toString() + "###" + jVar.b(), String.valueOf(i));
        }
        com.sankuai.waimai.store.util.monitor.cache.b.a(SchemeCache.create(jVar.d.toString(), "failed"));
        for (j jVar2 : com.sankuai.waimai.router.service.e.a(j.class).a()) {
            jVar2.a(jVar, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a0, code lost:
        if ("sgc".equals(r2) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cc, code lost:
        if ((com.meituan.robust.PatchProxy.isSupport(r10, null, r11, true, "299137f5d6ecc849f59eafa0bd79163a", com.meituan.robust.utils.RobustBitConfig.DEFAULT_VALUE) ? ((java.lang.Boolean) com.meituan.robust.PatchProxy.accessDispatch(r10, null, r11, true, "299137f5d6ecc849f59eafa0bd79163a")).booleanValue() : android.webkit.URLUtil.isNetworkUrl(r1)) != false) goto L9;
     */
    @Override // com.sankuai.waimai.router.core.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@android.support.annotation.NonNull com.sankuai.waimai.router.core.j r14) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.router.b.a(com.sankuai.waimai.router.core.j):void");
    }
}
