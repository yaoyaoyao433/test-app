package com.sankuai.xm.imui.session.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.imui.session.event.e;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class h extends d {
    public static ChangeQuickRedirect b;
    List<IMMessage> c;

    @Override // com.sankuai.xm.imui.session.widget.d
    public final int a() {
        return 3;
    }

    @Override // com.sankuai.xm.imui.common.widget.b
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void a(IMMessage iMMessage, boolean z) {
    }

    public h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d5fe9feb0004521a9fb95f7817b1980", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d5fe9feb0004521a9fb95f7817b1980");
        } else {
            this.c = new ArrayList();
        }
    }

    @Override // com.sankuai.xm.imui.common.widget.b
    public final void b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "492c4073bd0d06b1235e5a3979aa14ba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "492c4073bd0d06b1235e5a3979aa14ba");
            return;
        }
        super.b(context);
        a(e.f.class, new com.sankuai.xm.base.callback.c<e.f>() { // from class: com.sankuai.xm.imui.session.widget.h.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.base.callback.c
            public final /* synthetic */ boolean a(e.f fVar) {
                e.f fVar2 = fVar;
                Object[] objArr2 = {fVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "91065f967330c3b1599be7017b288ce8", 6917529027641081856L)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "91065f967330c3b1599be7017b288ce8")).booleanValue();
                }
                h.this.a(fVar2.b);
                return false;
            }
        });
        a(e.c.class, new com.sankuai.xm.base.callback.c<e.c>() { // from class: com.sankuai.xm.imui.session.widget.h.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.base.callback.c
            public final /* synthetic */ boolean a(e.c cVar) {
                e.c cVar2 = cVar;
                Object[] objArr2 = {cVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c203dfd7ec1621ba0ea54b2d4bb0ad62", 6917529027641081856L)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c203dfd7ec1621ba0ea54b2d4bb0ad62")).booleanValue();
                }
                if (cVar2.c != null) {
                    if (!cVar2.b) {
                        h.this.c.remove(cVar2.c);
                    } else if (!h.this.c.contains(cVar2.c)) {
                        h.this.c.add(cVar2.c);
                    }
                    h.this.a(cVar2.c, cVar2.b);
                }
                return false;
            }
        });
    }
}
