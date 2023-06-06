package com.sankuai.xm.network.net;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class b {
    public static ChangeQuickRedirect a;
    public long b;
    public long c;
    public List<a> d;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        d a(d dVar);

        e a(d dVar, e eVar);
    }

    public abstract com.sankuai.xm.network.net.a a(d dVar);

    public abstract void a(Context context, com.sankuai.xm.network.net.config.a aVar);

    public abstract void cancel();

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa47afd63cf96d7c9327352a4d9be032", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa47afd63cf96d7c9327352a4d9be032");
            return;
        }
        this.b = 10000L;
        this.c = 10000L;
        this.d = new ArrayList();
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de265d45eaf1e9b99c675747b00b8f0d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de265d45eaf1e9b99c675747b00b8f0d");
        } else if (this.d.contains(aVar)) {
        } else {
            this.d.add(aVar);
        }
    }
}
