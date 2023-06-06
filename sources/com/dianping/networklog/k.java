package com.dianping.networklog;

import android.text.TextUtils;
import com.dianping.networklog.ai;
import com.dianping.networklog.c;
import com.dianping.networklog.z;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* loaded from: classes.dex */
public abstract class k implements Runnable {
    public static ChangeQuickRedirect a;
    protected af b;
    protected z c;
    protected ai d;
    protected c.a e;
    protected a f;

    /* loaded from: classes.dex */
    public interface a {
        void a(int i);
    }

    private k(af afVar, z zVar, ai aiVar) {
        Object[] objArr = {afVar, zVar, aiVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "378668aa5faea4a13e8219e1e112a173", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "378668aa5faea4a13e8219e1e112a173");
            return;
        }
        this.b = afVar;
        this.c = zVar;
        this.d = aiVar;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0a16cd05bc719dce7b4450a98460a12", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0a16cd05bc719dce7b4450a98460a12");
        } else if (this.f != null) {
            this.f.a(10002);
        }
    }

    public final void a(c.a aVar) {
        this.e = aVar;
    }

    public final void a(a aVar) {
        this.f = aVar;
    }

    public final boolean a(af afVar) {
        Object[] objArr = {afVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef02e62f20c92ce9a1b5bea0a48548a0", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef02e62f20c92ce9a1b5bea0a48548a0")).booleanValue();
        }
        String a2 = r.a(afVar.y);
        if (TextUtils.isEmpty(a2)) {
            return false;
        }
        afVar.x = a2;
        return true;
    }

    public k(af afVar) {
        this(afVar, z.a.a, ai.a.a);
        Object[] objArr = {afVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a48d2c80ac9f60974c17734250c0908", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a48d2c80ac9f60974c17734250c0908");
        }
    }
}
