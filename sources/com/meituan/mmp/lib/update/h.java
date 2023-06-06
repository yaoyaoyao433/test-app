package com.meituan.mmp.lib.update;

import android.support.annotation.Nullable;
import com.meituan.mmp.main.Logger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h {
    public static ChangeQuickRedirect a;
    ConcurrentHashMap<MMPUpdateConfig, m> b;
    Logger c;
    private ConcurrentHashMap<MMPUpdateConfig, i> d;

    public h(Logger logger) {
        Object[] objArr = {logger};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f821bbeee355acca65a43fabf51daf10", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f821bbeee355acca65a43fabf51daf10");
            return;
        }
        this.d = new ConcurrentHashMap<>();
        this.b = new ConcurrentHashMap<>();
        this.c = logger;
    }

    public final void a(MMPUpdateConfig mMPUpdateConfig, i iVar, m mVar) {
        Object[] objArr = {mMPUpdateConfig, iVar, mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "551d0e0808776719d17076f382333a6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "551d0e0808776719d17076f382333a6f");
            return;
        }
        this.c.i("MMPUpdateInnerEventManager@addUpdateListener", mMPUpdateConfig);
        if (iVar != null) {
            this.d.put(mMPUpdateConfig, iVar);
        }
        if (mVar != null) {
            this.b.put(mMPUpdateConfig, mVar);
        }
    }

    public final void a(MMPUpdateConfig mMPUpdateConfig, MMPAppProp mMPAppProp, ArrayList<MMPPackageInfo> arrayList) {
        Object[] objArr = {mMPUpdateConfig, mMPAppProp, arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2c2ced83db63fecea76e7eea435e939", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2c2ced83db63fecea76e7eea435e939");
            return;
        }
        this.c.i("MMPUpdateInnerEventManager@onAllPackageReady", arrayList);
        i remove = this.d.remove(mMPUpdateConfig);
        if (remove != null) {
            remove.a(mMPAppProp, arrayList);
        }
    }

    public final void a(MMPUpdateConfig mMPUpdateConfig, MMPAppProp mMPAppProp, MMPPackageInfo mMPPackageInfo) {
        Object[] objArr = {mMPUpdateConfig, mMPAppProp, mMPPackageInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "380ed4e58c5b02b43758318c8d06a7f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "380ed4e58c5b02b43758318c8d06a7f3");
            return;
        }
        this.c.i("MMPUpdateInnerEventManager@onPackageReady", mMPPackageInfo, Integer.valueOf(mMPPackageInfo.s));
        i iVar = this.d.get(mMPUpdateConfig);
        if (iVar != null) {
            iVar.a(mMPAppProp, mMPPackageInfo);
        }
    }

    public final void a(MMPUpdateConfig mMPUpdateConfig, MMPAppProp mMPAppProp, String str, @Nullable Exception exc) {
        Object[] objArr = {mMPUpdateConfig, mMPAppProp, str, exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87916670fc00375c0dfff6483690db53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87916670fc00375c0dfff6483690db53");
            return;
        }
        this.c.e("MMPUpdateInnerEventManager@onPackageFailed", exc, mMPAppProp, str);
        i remove = this.d.remove(mMPUpdateConfig);
        if (remove != null) {
            remove.a(mMPAppProp, str, exc);
        }
    }

    public final void a(MMPUpdateConfig mMPUpdateConfig, MMPAppProp mMPAppProp) {
        Object[] objArr = {mMPUpdateConfig, mMPAppProp};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60f3d1706e6ba9e624d6ef36c34b9a1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60f3d1706e6ba9e624d6ef36c34b9a1d");
            return;
        }
        this.c.i("MMPUpdateInnerEventManager@onAppPropUpdate", mMPAppProp);
        i iVar = this.d.get(mMPUpdateConfig);
        if (iVar != null) {
            iVar.a(mMPAppProp);
        }
    }

    public final void a(MMPUpdateConfig mMPUpdateConfig, boolean z) {
        Object[] objArr = {mMPUpdateConfig, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a47303e638c6881b76a489e0987f097", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a47303e638c6881b76a489e0987f097");
            return;
        }
        this.c.i("MMPUpdateInnerEventManager@onCheckUpdateStart", Boolean.TRUE);
        m mVar = this.b.get(mMPUpdateConfig);
        if (mVar != null) {
            mVar.a(true);
        }
    }

    public final void a(MMPUpdateConfig mMPUpdateConfig, boolean z, MMPAppProp mMPAppProp) {
        Object[] objArr = {mMPUpdateConfig, Byte.valueOf(z ? (byte) 1 : (byte) 0), mMPAppProp};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "991f42e3b49356b6538de6eeb3a4bbb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "991f42e3b49356b6538de6eeb3a4bbb2");
            return;
        }
        this.c.i("MMPUpdateInnerEventManager@onCheckUpdateSuccess", mMPAppProp);
        m mVar = this.b.get(mMPUpdateConfig);
        if (mVar != null) {
            mVar.a(z, mMPAppProp);
        }
    }

    public final void a(MMPUpdateConfig mMPUpdateConfig, MMPAppProp mMPAppProp, List<MMPPackageInfo> list) {
        Object[] objArr = {mMPUpdateConfig, mMPAppProp, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcbaa766f4609576b4c81e975e9f1dfb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcbaa766f4609576b4c81e975e9f1dfb");
            return;
        }
        Logger logger = this.c;
        Object[] objArr2 = new Object[2];
        objArr2[0] = mMPUpdateConfig;
        objArr2[1] = Integer.valueOf(list != null ? list.size() : 0);
        logger.i("MMPUpdateInnerEventManager@onDownloadPackagesEnd", objArr2);
        m mVar = this.b.get(mMPUpdateConfig);
        if (mVar != null) {
            mVar.b(mMPAppProp, list);
        }
    }
}
