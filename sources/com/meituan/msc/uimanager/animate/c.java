package com.meituan.msc.uimanager.animate;

import com.meituan.msc.jse.bridge.Callback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class c {
    public static ChangeQuickRedirect a;
    public boolean b;
    public boolean c;
    public a d;
    public List<Callback> e;

    public void a() {
    }

    public abstract void a(long j);

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98184e9c5707b425cad73063392a76f5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98184e9c5707b425cad73063392a76f5");
            return;
        }
        this.b = false;
        this.c = false;
        this.e = new ArrayList();
    }

    public void a(Callback callback) {
        Object[] objArr = {callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11e17315f0cdd21c4a2999d19c8e6e8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11e17315f0cdd21c4a2999d19c8e6e8e");
        } else {
            this.e.add(callback);
        }
    }
}
