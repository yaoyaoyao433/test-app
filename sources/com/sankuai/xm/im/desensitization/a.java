package com.sankuai.xm.im.desensitization;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.vcard.d;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private Map<Short, c> b;

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2828a40f35b83dcdf5fc44e48b689630", 6917529027641081856L) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2828a40f35b83dcdf5fc44e48b689630") : C1388a.a;
    }

    public final synchronized void a(short s, c cVar) {
        Object[] objArr = {Short.valueOf(s), cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a755883355be23090e28c55140bd468", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a755883355be23090e28c55140bd468");
        } else {
            this.b.put(Short.valueOf(s), cVar);
        }
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bffd0a7d49c641375fd7e8617bf56817", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bffd0a7d49c641375fd7e8617bf56817");
        } else {
            this.b = new HashMap();
        }
    }

    private synchronized c a(short s) {
        Object[] objArr = {Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "449f434070e32cd4f78f07823e997954", 6917529027641081856L)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "449f434070e32cd4f78f07823e997954");
        }
        return this.b.get(Short.valueOf(s));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.im.desensitization.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C1388a {
        private static a a = new a();
    }

    public final void a(com.sankuai.xm.im.vcard.entity.a aVar, @NonNull d dVar, com.sankuai.xm.im.a<com.sankuai.xm.im.vcard.entity.a> aVar2) {
        Object[] objArr = {aVar, dVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f6c638b16de115b4a503a9989b4c594", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f6c638b16de115b4a503a9989b4c594");
            return;
        }
        c a2 = a(dVar.d);
        if (a2 == null || aVar == null) {
            aVar2.onSuccess(aVar);
            return;
        }
        try {
            a2.a(aVar, dVar, aVar2);
        } catch (Throwable th) {
            com.sankuai.xm.base.callback.a.a(aVar2, -1, "custom provider desensitize failed: " + th.getMessage());
        }
    }
}
