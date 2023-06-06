package com.sankuai.xm.ui.service.internal.impl;

import android.app.Application;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.util.Base64;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.lifecycle.d;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.base.util.t;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.session.SessionId;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a extends com.sankuai.xm.base.service.a implements com.sankuai.xm.ui.service.a {
    public static ChangeQuickRedirect a;
    private t<com.sankuai.xm.base.callback.b<com.sankuai.xm.ui.entity.a>> b;
    private SharedPreferences c;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1ed17eb4dc583e201b21bf1c146d831", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1ed17eb4dc583e201b21bf1c146d831");
            return;
        }
        this.b = new t<>();
        Application a2 = d.d().a();
        this.c = new com.sankuai.xm.base.sp.c(a2, "xm_sdk_input_draft_" + IMClient.a().k(), 0);
    }

    @Override // com.sankuai.xm.ui.service.a
    public final com.sankuai.xm.ui.entity.a a(@NonNull SessionId sessionId) {
        Object[] objArr = {sessionId};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "867713847f058543e17217faccabe003", 6917529027641081856L)) {
            return (com.sankuai.xm.ui.entity.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "867713847f058543e17217faccabe003");
        }
        com.sankuai.xm.imui.common.util.d.a("DraftServiceImpl::getInputDraft: sessionId is %s", sessionId);
        String string = this.c.getString(c(sessionId), null);
        if (string == null) {
            return null;
        }
        return com.sankuai.xm.ui.entity.a.a(new String(Base64.decode(string, 2)));
    }

    @Override // com.sankuai.xm.ui.service.a
    public final void a(@NonNull final com.sankuai.xm.ui.entity.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eca4e555de2f3b86cc1e2183d4873446", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eca4e555de2f3b86cc1e2183d4873446");
            return;
        }
        String encodeToString = Base64.encodeToString(aVar.toString().getBytes(), 2);
        if (this.c.edit() == null) {
            return;
        }
        this.c.edit().putString(c(aVar.b), encodeToString).apply();
        com.sankuai.xm.threadpool.scheduler.a.b().a(17, 1, j.a(new Runnable() { // from class: com.sankuai.xm.ui.service.internal.impl.a.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "786e45bc31ed6c02066be3481fcd76c3", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "786e45bc31ed6c02066be3481fcd76c3");
                } else {
                    a.this.b.a(new t.a<com.sankuai.xm.base.callback.b<com.sankuai.xm.ui.entity.a>>() { // from class: com.sankuai.xm.ui.service.internal.impl.a.1.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.xm.base.util.t.a
                        public final /* synthetic */ void a(com.sankuai.xm.base.callback.b<com.sankuai.xm.ui.entity.a> bVar) {
                            com.sankuai.xm.base.callback.b<com.sankuai.xm.ui.entity.a> bVar2 = bVar;
                            Object[] objArr3 = {bVar2};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e02c0d29b2002d05d59add1e72fe4185", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e02c0d29b2002d05d59add1e72fe4185");
                            } else if (bVar2 != null) {
                                new com.sankuai.xm.base.entity.b(aVar);
                            }
                        }
                    }, -1, aVar.b.g);
                }
            }
        }));
    }

    @Override // com.sankuai.xm.ui.service.a
    public final void b(@NonNull SessionId sessionId) {
        Object[] objArr = {sessionId};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9aed13d7249600110267b701a2a3001e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9aed13d7249600110267b701a2a3001e");
            return;
        }
        final com.sankuai.xm.ui.entity.a a2 = a(sessionId);
        if (a2 == null || this.c.edit() == null) {
            return;
        }
        this.c.edit().remove(c(sessionId)).apply();
        com.sankuai.xm.threadpool.scheduler.a.b().a(17, 1, j.a(new Runnable() { // from class: com.sankuai.xm.ui.service.internal.impl.a.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fc61f4baa75e8175673da54a6df53fe5", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fc61f4baa75e8175673da54a6df53fe5");
                } else {
                    a.this.b.a(new t.a<com.sankuai.xm.base.callback.b<com.sankuai.xm.ui.entity.a>>() { // from class: com.sankuai.xm.ui.service.internal.impl.a.2.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.xm.base.util.t.a
                        public final /* synthetic */ void a(com.sankuai.xm.base.callback.b<com.sankuai.xm.ui.entity.a> bVar) {
                            com.sankuai.xm.base.callback.b<com.sankuai.xm.ui.entity.a> bVar2 = bVar;
                            Object[] objArr3 = {bVar2};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f22545906932b901af32eb223203c902", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f22545906932b901af32eb223203c902");
                            } else if (bVar2 != null) {
                                new com.sankuai.xm.base.entity.b(a2);
                            }
                        }
                    }, -1, a2.b.g);
                }
            }
        }));
    }

    @Override // com.sankuai.xm.base.service.a
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1f4b6861ff77c2f761be8074db5eb62", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1f4b6861ff77c2f761be8074db5eb62");
        } else {
            super.a(j);
        }
    }

    private String c(SessionId sessionId) {
        Object[] objArr = {sessionId};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54344279788004d5f2873d8da55bee2d", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54344279788004d5f2873d8da55bee2d");
        }
        return "draft_" + sessionId.f();
    }
}
