package com.sankuai.xm.im.notice;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.component.anno.Component;
import com.sankuai.xm.base.component.b;
import com.sankuai.xm.base.component.d;
import com.sankuai.xm.base.component.e;
import com.sankuai.xm.base.service.l;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
@Component
/* loaded from: classes6.dex */
public class a implements com.sankuai.xm.base.component.a, d {
    public static ChangeQuickRedirect a;
    private e b;
    private final ConcurrentHashMap<String, Object> c;
    private final Object d;

    public final e a() {
        if (this.b == null) {
            synchronized (this.d) {
                if (this.b == null) {
                    this.b = new e(l.class, "mListenerSvc", this);
                }
            }
        }
        return this.b;
    }

    @Override // com.sankuai.xm.base.component.d
    public final <T> T a(String str, Class<T> cls, b bVar) {
        Object[] objArr = {str, cls, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62da40b2f7fe2febfde605858baaa12a", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62da40b2f7fe2febfde605858baaa12a");
        }
        if (cls.isInstance(null)) {
            return cls.cast(null);
        }
        return null;
    }

    @Override // com.sankuai.xm.base.component.a
    public final void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4183d1f31fd08ae5354cf336b6c61888", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4183d1f31fd08ae5354cf336b6c61888");
        } else if (bVar != null) {
            a().a(bVar);
        }
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7be96dc5c3d9e7e41b128299ab21eeb6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7be96dc5c3d9e7e41b128299ab21eeb6");
            return;
        }
        this.c = new ConcurrentHashMap<>();
        this.d = new Object();
        this.b = null;
    }
}
