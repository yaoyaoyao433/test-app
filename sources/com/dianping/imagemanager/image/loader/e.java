package com.dianping.imagemanager.image.loader;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private boolean b;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        public static final e a = new e();
    }

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "033f14a3133ec644ba85a8727afa5c56", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "033f14a3133ec644ba85a8727afa5c56");
        } else {
            this.b = false;
        }
    }

    public f a(com.dianping.imagemanager.utils.downloadphoto.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b809ff888903fb8d85f36abdfd36becc", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b809ff888903fb8d85f36abdfd36becc");
        }
        if (aVar instanceof com.dianping.imagemanager.utils.downloadphoto.h) {
            return i.a();
        }
        if (aVar instanceof com.dianping.imagemanager.utils.downloadphoto.b) {
            return c.a();
        }
        return g.a();
    }

    public final boolean a(com.dianping.imagemanager.utils.downloadphoto.a aVar, com.dianping.imagemanager.utils.downloadphoto.e eVar) {
        Object[] objArr = {aVar, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0770f615cde9e6a3e46c0ba56752bbff", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0770f615cde9e6a3e46c0ba56752bbff")).booleanValue();
        }
        if (aVar == null || TextUtils.isEmpty(aVar.g()) || eVar == null) {
            return false;
        }
        if (!com.dianping.imagemanager.base.a.a().b) {
            com.dianping.imagemanager.utils.k.d("GenericImageLoader", "Download environment is not inited yet. Please init download environment with ImageManagerInitHelper or DPImageEnvironment.ensureInit(context) first.");
            return false;
        }
        a(aVar).a((f) aVar, eVar);
        return true;
    }

    public final boolean b(com.dianping.imagemanager.utils.downloadphoto.a aVar, com.dianping.imagemanager.utils.downloadphoto.e eVar) {
        Object[] objArr = {aVar, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "850672c809ea066468a6864d33259b34", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "850672c809ea066468a6864d33259b34")).booleanValue();
        }
        if (aVar == null || eVar == null) {
            return false;
        }
        if (!com.dianping.imagemanager.base.a.a().b) {
            com.dianping.imagemanager.utils.k.d("GenericImageLoader", "Download environment is not inited yet. Please init download environment with ImageManagerInitHelper or DPImageEnvironment.ensureInit(context) first.");
            return false;
        }
        a(aVar).b(aVar, eVar);
        return true;
    }
}
