package com.dianping.nvnetwork;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class t implements com.dianping.nvnetwork.http.a {
    public static ChangeQuickRedirect a;
    com.dianping.nvnetwork.cache.i b;
    private com.dianping.nvnetwork.fork.b c;
    private Context d;
    private final List<r> e;
    private boolean f;

    public t(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc37178dc7b96ef92820ceb64ca25357", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc37178dc7b96ef92820ceb64ca25357");
            return;
        }
        this.d = aVar.d;
        this.e = aVar.b;
        this.f = aVar.c;
        this.c = com.dianping.nvnetwork.fork.b.a(this.d);
        this.b = new com.dianping.nvnetwork.cache.i(this.d);
    }

    @Override // com.dianping.nvnetwork.http.a
    public final rx.d<q> exec(Request request) {
        Object[] objArr = {request};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d845b2af83efc1abaedeabd2a2a3b4a1", 6917529027641081856L)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d845b2af83efc1abaedeabd2a2a3b4a1");
        }
        Object[] objArr2 = {request};
        ChangeQuickRedirect changeQuickRedirect2 = com.dianping.nvnetwork.util.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "cb322cde9da04c1f67e0ad0be0ed1007", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "cb322cde9da04c1f67e0ad0be0ed1007");
        } else if (request != null) {
            request.d = h.h().b(request.d);
            if (!request.c) {
                request.b = h.h().O ? 1 : 0;
            }
        }
        return rx.d.a((d.a) new m(request, this.c, this.b, this.e, this.f));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class a {
        public static ChangeQuickRedirect a;
        public final List<r> b;
        public boolean c;
        public Context d;

        public a(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d469bfe39f96303b45d397b759f53d8e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d469bfe39f96303b45d397b759f53d8e");
                return;
            }
            this.b = new ArrayList();
            this.d = context.getApplicationContext();
        }
    }
}
