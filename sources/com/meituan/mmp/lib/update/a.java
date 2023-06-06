package com.meituan.mmp.lib.update;

import android.text.TextUtils;
import com.meituan.mmp.lib.engine.t;
import com.meituan.mmp.lib.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a implements m {
    public static ChangeQuickRedirect b;
    protected com.meituan.mmp.lib.trace.h c;

    @Override // com.meituan.mmp.lib.update.m
    public void a(MMPAppProp mMPAppProp, List<MMPPackageInfo> list) {
    }

    @Override // com.meituan.mmp.lib.update.m
    public void a(String str, Throwable th) {
    }

    @Override // com.meituan.mmp.lib.update.m
    public void a(boolean z) {
    }

    @Override // com.meituan.mmp.lib.update.m
    public void a(boolean z, MMPAppProp mMPAppProp) {
    }

    @Override // com.meituan.mmp.lib.update.m
    public void b(MMPAppProp mMPAppProp, List<MMPPackageInfo> list) {
    }

    public a(com.meituan.mmp.lib.trace.h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95fcb5efc250f98c3d53df0d7b18c7b3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95fcb5efc250f98c3d53df0d7b18c7b3");
        } else {
            this.c = hVar;
        }
    }

    @Override // com.meituan.mmp.lib.update.m
    public void a(MMPAppProp mMPAppProp, MMPPackageInfo mMPPackageInfo) {
        Object[] objArr = {mMPAppProp, mMPPackageInfo};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02a145e258413d50d2b726fb6d19f056", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02a145e258413d50d2b726fb6d19f056");
        } else if (this.c == null || mMPPackageInfo == null) {
        } else {
            this.c.a("mmp.package.download", mMPPackageInfo.g);
        }
    }

    @Override // com.meituan.mmp.lib.update.m
    public void a(MMPAppProp mMPAppProp, MMPPackageInfo mMPPackageInfo, boolean z) {
        Object[] objArr = {mMPAppProp, mMPPackageInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "855df5b92a55c08e388ccb464b194ae9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "855df5b92a55c08e388ccb464b194ae9");
        } else if (this.c == null || mMPPackageInfo == null) {
        } else {
            this.c.b("mmp.page.load.duration.download.package", (Map<String, Object>) v.a("state", "success"));
            this.c.a("mmp.package.download", mMPPackageInfo.g, t.a(mMPPackageInfo, true, (String) null, a(mMPAppProp)));
        }
    }

    @Override // com.meituan.mmp.lib.update.m
    public void a(MMPAppProp mMPAppProp, MMPPackageInfo mMPPackageInfo, String str, Throwable th) {
        Object[] objArr = {mMPAppProp, mMPPackageInfo, str, th};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f752b73a251205e997ae4ba51e11eacc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f752b73a251205e997ae4ba51e11eacc");
        } else if (this.c == null || mMPPackageInfo == null) {
        } else {
            this.c.b("mmp.page.load.duration.download.package", (Map<String, Object>) v.a("state", "fail"));
            this.c.a("mmp.package.download", mMPPackageInfo.g, t.a(mMPPackageInfo, false, str, a(mMPAppProp)));
        }
    }

    @Override // com.meituan.mmp.lib.update.m
    public void b(MMPAppProp mMPAppProp, MMPPackageInfo mMPPackageInfo) {
        Object[] objArr = {mMPAppProp, mMPPackageInfo};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45da0f5226a25fba4672c1b8a0d2725d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45da0f5226a25fba4672c1b8a0d2725d");
        } else if (this.c == null || mMPPackageInfo == null) {
        } else {
            this.c.a("mmp.package.unzip", mMPPackageInfo.g);
        }
    }

    @Override // com.meituan.mmp.lib.update.m
    public void b(MMPAppProp mMPAppProp, MMPPackageInfo mMPPackageInfo, boolean z) {
        Object[] objArr = {mMPAppProp, mMPPackageInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2ae3e296533a415ba8ea14bdb9dd68e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2ae3e296533a415ba8ea14bdb9dd68e");
        } else if (this.c == null || mMPPackageInfo == null) {
        } else {
            this.c.a("mmp.package.unzip", mMPPackageInfo.g, t.b(mMPPackageInfo, true, null, a(mMPAppProp)));
        }
    }

    @Override // com.meituan.mmp.lib.update.m
    public void b(MMPAppProp mMPAppProp, MMPPackageInfo mMPPackageInfo, String str, Throwable th) {
        Object[] objArr = {mMPAppProp, mMPPackageInfo, str, th};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "743f6a0fceae104f0c6e7e748c010152", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "743f6a0fceae104f0c6e7e748c010152");
        } else if (this.c == null || mMPPackageInfo == null) {
        } else {
            this.c.a("mmp.package.unzip", mMPPackageInfo.g, t.b(mMPPackageInfo, false, null, a(mMPAppProp)));
        }
    }

    private boolean a(MMPAppProp mMPAppProp) {
        Object[] objArr = {mMPAppProp};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "303a50373e57c36475612896455e5b2e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "303a50373e57c36475612896455e5b2e")).booleanValue();
        }
        if (mMPAppProp == null || TextUtils.isEmpty(mMPAppProp.appid)) {
            return false;
        }
        return mMPAppProp.appid.equals(com.meituan.mmp.lib.t.b());
    }
}
