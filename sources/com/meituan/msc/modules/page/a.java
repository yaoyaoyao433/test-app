package com.meituan.msc.modules.page;

import android.content.Context;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class a extends RelativeLayout {
    public static ChangeQuickRedirect a;
    public final boolean b;
    public final com.meituan.msc.modules.engine.h c;
    public final Context d;
    public final com.meituan.msc.modules.container.p e;
    public final com.meituan.msc.common.framework.interfaces.b f;
    public final boolean g;

    public abstract void a();

    public abstract void a(int i);

    public abstract e b(int i);

    public abstract void b();

    public abstract l getPage();

    public abstract String getRoutePath();

    public abstract int getViewId();

    public a(com.meituan.msc.modules.engine.h hVar, com.meituan.msc.modules.container.p pVar, com.meituan.msc.common.framework.interfaces.b bVar, boolean z) {
        super(pVar.C());
        Object[] objArr = {hVar, pVar, bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26dc525b4d63638b2a531647cea5cea3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26dc525b4d63638b2a531647cea5cea3");
            return;
        }
        this.d = getContext();
        this.c = hVar;
        this.e = pVar;
        this.f = bVar;
        this.b = z;
        this.g = pVar.A();
    }

    public com.meituan.msc.modules.page.reload.a getSavedPageInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed173069f05e0853a0abd6925c7ad68d", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.modules.page.reload.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed173069f05e0853a0abd6925c7ad68d");
        }
        com.meituan.msc.modules.page.reload.a aVar = new com.meituan.msc.modules.page.reload.a();
        aVar.b = getViewId();
        aVar.a = getRoutePath();
        aVar.c = getPageInfos();
        return aVar;
    }

    public com.meituan.msc.modules.page.reload.b[] getPageInfos() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ba0feb6348ffe9e750d5a1779a7bfd3", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msc.modules.page.reload.b[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ba0feb6348ffe9e750d5a1779a7bfd3") : new com.meituan.msc.modules.page.reload.b[]{getPageInfoOne()};
    }

    public com.meituan.msc.modules.page.reload.b getPageInfoOne() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c499e70881267581dd5f407dfd4ee966", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.modules.page.reload.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c499e70881267581dd5f407dfd4ee966");
        }
        com.meituan.msc.modules.page.reload.b bVar = new com.meituan.msc.modules.page.reload.b();
        bVar.c = getViewId();
        bVar.a = getRoutePath();
        return bVar;
    }
}
