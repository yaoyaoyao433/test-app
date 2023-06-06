package com.meituan.msc.modules.api.msi;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.meituan.msc.modules.container.p;
import com.meituan.msc.modules.container.q;
import com.meituan.msc.modules.engine.h;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class MSCApi implements a, IMsiApi {
    public static ChangeQuickRedirect b;
    protected h c;

    @Override // com.meituan.msc.modules.api.msi.a
    public final void a(h hVar) {
        this.c = hVar;
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fbd7e672fb5e93038ca9c57c0d7e9f2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fbd7e672fb5e93038ca9c57c0d7e9f2") : this.c.a();
    }

    public final <T> T a(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "454d26c361d55594cd946303229ec9b4", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "454d26c361d55594cd946303229ec9b4") : (T) this.c.c(cls);
    }

    public final boolean a(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26f496f7e3ed624d1a6cc75c4d7df045", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26f496f7e3ed624d1a6cc75c4d7df045")).booleanValue();
        }
        q b2 = this.c.b();
        return b2 != null && b2.a(msiContext.getPageId());
    }

    public final p b(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5872c1e886130085cb35990120cbaff3", RobustBitConfig.DEFAULT_VALUE)) {
            return (p) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5872c1e886130085cb35990120cbaff3");
        }
        q b2 = this.c.b();
        if (b2 != null) {
            return b2.f(msiContext.getPageId());
        }
        return null;
    }

    public final com.meituan.msc.modules.page.e c(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "978c4adc34da940fee2efef838a0e7b5", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.modules.page.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "978c4adc34da940fee2efef838a0e7b5");
        }
        q b2 = this.c.b();
        if (b2 != null) {
            return b2.c(msiContext.getPageId());
        }
        return null;
    }

    public final com.meituan.msc.modules.page.e a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08da2238c4c712d52914388e2067fd03", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.modules.page.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08da2238c4c712d52914388e2067fd03");
        }
        q b2 = this.c.b();
        if (b2 == null) {
            return null;
        }
        return b2.b(i);
    }

    public static int d(MsiContext msiContext) {
        JsonElement jsonElement;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fff72a158627f269b5eb8ef9bb406835", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fff72a158627f269b5eb8ef9bb406835")).intValue();
        }
        JsonObject uIArgs = msiContext.getUIArgs();
        if (uIArgs == null || (jsonElement = uIArgs.get("pageId")) == null) {
            return -1;
        }
        return jsonElement.getAsInt();
    }

    public static void a(MsiContext msiContext, int i) {
        Object[] objArr = {msiContext, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4369c00b2333d4492bd40b8e384ab21a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4369c00b2333d4492bd40b8e384ab21a");
            return;
        }
        msiContext.onError("can not find page by pageId: " + i);
    }

    public static void e(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a50ad8fbb36fa7020090735636da491c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a50ad8fbb36fa7020090735636da491c");
        } else {
            msiContext.onSuccess(null);
        }
    }
}
