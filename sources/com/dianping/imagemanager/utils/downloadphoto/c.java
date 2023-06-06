package com.dianping.imagemanager.utils.downloadphoto;

import android.graphics.Bitmap;
import android.os.Looper;
import com.dianping.imagemanager.image.loader.e;
import com.dianping.imagemanager.utils.i;
import com.dianping.imagemanager.utils.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        public static final c a = new c();
    }

    public c() {
    }

    public final boolean a(com.dianping.imagemanager.utils.downloadphoto.a aVar, e eVar) {
        Object[] objArr = {aVar, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d87eae9f9f044ff7f6fb5d66a022597f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d87eae9f9f044ff7f6fb5d66a022597f")).booleanValue() : e.a.a.a(aVar, eVar);
    }

    public final d a(com.dianping.imagemanager.utils.downloadphoto.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "754b9a4d315c2866f77e3709fab8c9ba", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "754b9a4d315c2866f77e3709fab8c9ba");
        }
        com.dianping.imagemanager.image.loader.e eVar = e.a.a;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.dianping.imagemanager.image.loader.e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "a18684ff0957ed5b64a145b1b69d4b36", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "a18684ff0957ed5b64a145b1b69d4b36");
        }
        if (aVar == null) {
            return null;
        }
        if (!com.dianping.imagemanager.base.a.a().b) {
            k.d("GenericImageLoader", "Download environment is not inited yet. Please init download environment with ImageManagerInitHelper or DPImageEnvironment.ensureInit(context) first.");
            return null;
        }
        com.dianping.imagemanager.image.loader.f a2 = eVar.a(aVar);
        Object[] objArr3 = {aVar};
        ChangeQuickRedirect changeQuickRedirect3 = com.dianping.imagemanager.image.loader.f.d;
        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "fdfb7490f13618b2b8f6814d46e9f6bd", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "fdfb7490f13618b2b8f6814d46e9f6bd");
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            com.dianping.imagemanager.image.loader.f.a(10007, aVar.g());
            return new d(10007);
        }
        if (aVar.n()) {
            Bitmap a3 = com.dianping.imagemanager.image.loader.f.e.a(aVar.h(), aVar.f(), aVar.p(), aVar.c() == 0, aVar.o, aVar.b(), aVar.a());
            if (a3 != null) {
                d a4 = new d(true, 0).a(a3);
                a4.o = 0;
                return a4;
            }
        }
        d a5 = a2.a((com.dianping.imagemanager.image.loader.f) aVar);
        if (a5 != null && a5.h && ((a5.b == 0 || a5.b == -1) && aVar.n())) {
            com.dianping.imagemanager.image.loader.f.e.a(aVar.h(), aVar.f(), a5.l, a5.p == i.a.GIF || a5.p == i.a.ANIMATED_WEBP, a5.f, a5.g);
        }
        return a5;
    }
}
