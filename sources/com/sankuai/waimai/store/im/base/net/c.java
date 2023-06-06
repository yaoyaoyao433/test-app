package com.sankuai.waimai.store.im.base.net;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ae;
import com.sankuai.waimai.store.base.net.i;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.base.net.upload.ImageInfo;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class c extends com.sankuai.waimai.store.base.net.d<SGIMFileService> {
    public static ChangeQuickRedirect a;

    public static c a(Object obj) {
        Object[] objArr = {null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "93a1ba8b72c0326c91773eec27e2906a", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "93a1ba8b72c0326c91773eec27e2906a");
        }
        c cVar = (c) com.sankuai.waimai.store.base.net.c.a((Object) null, c.class);
        if (cVar == null) {
            c cVar2 = new c();
            com.sankuai.waimai.store.base.net.c.a((Object) null, cVar2);
            return cVar2;
        }
        return cVar;
    }

    @Override // com.sankuai.waimai.store.base.net.d
    @NonNull
    public final i a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59f4917ee6e62380bfa48c3b4dadfcfc", RobustBitConfig.DEFAULT_VALUE) ? (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59f4917ee6e62380bfa48c3b4dadfcfc") : new com.sankuai.waimai.store.base.net.file.b();
    }

    public final void a(ae.b bVar, j<ImageInfo> jVar) {
        Object[] objArr = {bVar, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa94a3f083b6e223cab471afecb02b02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa94a3f083b6e223cab471afecb02b02");
        } else {
            a(jVar, ((SGIMFileService) this.d).uploadFile(bVar));
        }
    }
}
