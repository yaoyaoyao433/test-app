package com.sankuai.eh.component.web.wm.router;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.web.titans.b;
import com.sankuai.meituan.takeoutnew.provider.scheme.interceptor.c;
import com.sankuai.waimai.router.core.g;
import com.sankuai.waimai.router.core.h;
import com.sankuai.waimai.router.core.j;
import java.net.URLEncoder;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends h {
    public static ChangeQuickRedirect a;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "325cd2ca582ee75482ae5e1d7129858a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "325cd2ca582ee75482ae5e1d7129858a");
            return;
        }
        a(new com.sankuai.waimai.launcher.provider.scheme.interceptor.a());
        a(new c());
        a(new com.sankuai.meituan.takeoutnew.provider.scheme.interceptor.a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x01cb, code lost:
        if (com.sankuai.eh.component.service.utils.f.b(com.sankuai.eh.component.service.utils.b.a(r2, "data")) != false) goto L39;
     */
    @Override // com.sankuai.waimai.router.core.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(@android.support.annotation.NonNull com.sankuai.waimai.router.core.j r19) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.eh.component.web.wm.router.a.a(com.sankuai.waimai.router.core.j):boolean");
    }

    @Override // com.sankuai.waimai.router.core.h
    public final void a(@NonNull j jVar, @NonNull g gVar) {
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d596c6604f1bdc7106b5495adbb09da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d596c6604f1bdc7106b5495adbb09da");
            return;
        }
        try {
            Intent intent = new Intent();
            intent.putExtra("ehc_intentData", ((Activity) jVar.e()).getIntent().getDataString());
            String uri = jVar.f().toString();
            Object[] objArr2 = {uri};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "157e6d9d63f1de72811b1fe535024065", RobustBitConfig.DEFAULT_VALUE)) {
                uri = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "157e6d9d63f1de72811b1fe535024065");
            } else if (!TextUtils.isEmpty(uri)) {
                uri = "imeituan://www.meituan.com/eh?url=" + URLEncoder.encode(uri, "utf-8");
            }
            intent.setData(Uri.parse(uri));
            gVar.a(com.sankuai.waimai.router.components.h.a(jVar, intent));
        } catch (Exception unused) {
            gVar.a();
        }
    }
}
