package com.meituan.mmp.lib.engine;

import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.mmp.lib.update.MMPAppProp;
import com.meituan.mmp.lib.update.MMPPackageInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class w extends com.meituan.mmp.lib.update.a {
    public static ChangeQuickRedirect a;

    public w(com.meituan.mmp.lib.trace.h hVar) {
        super(hVar);
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b71d1e548bbae1b2998ba984d0e804b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b71d1e548bbae1b2998ba984d0e804b");
        }
    }

    @Override // com.meituan.mmp.lib.update.a, com.meituan.mmp.lib.update.m
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2886378373213aff8df6b626e3738887", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2886378373213aff8df6b626e3738887");
            return;
        }
        this.c.a("checkUpdateMode", (Object) (z ? "network" : "cache"));
        if (z) {
            this.c.a("mmp.launch.duration.check.update");
            this.c.a("mmp.launch.check.update");
        }
    }

    @Override // com.meituan.mmp.lib.update.a, com.meituan.mmp.lib.update.m
    public final void a(boolean z, MMPAppProp mMPAppProp) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), mMPAppProp};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b85f5e64e305bdd8e67a44df39af85f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b85f5e64e305bdd8e67a44df39af85f");
            return;
        }
        this.c.a("mmp.launch.duration.check.update", com.meituan.mmp.lib.utils.v.a("state", "success"));
        this.c.b("mmp.launch.check.update");
        this.c.c("mmp.launch.point.check.update");
    }

    @Override // com.meituan.mmp.lib.update.a, com.meituan.mmp.lib.update.m
    public final void a(String str, Throwable th) {
        Object[] objArr = {str, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2886a470fee33d9124a522c9d78315fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2886a470fee33d9124a522c9d78315fb");
        } else {
            this.c.a("mmp.launch.duration.check.update", com.meituan.mmp.lib.utils.v.a("state", "fail", "message", str, GearsLocator.DETAIL, th != null ? th.getMessage() : ""));
        }
    }

    @Override // com.meituan.mmp.lib.update.a, com.meituan.mmp.lib.update.m
    public final void a(MMPAppProp mMPAppProp, List<MMPPackageInfo> list) {
        Object[] objArr = {mMPAppProp, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ad2b8fee66e8af7aed73ce2ca3c38dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ad2b8fee66e8af7aed73ce2ca3c38dd");
            return;
        }
        this.c.a("mmp.launch.duration.download.files");
        this.c.a("mmp.launch.download.files");
    }

    @Override // com.meituan.mmp.lib.update.a, com.meituan.mmp.lib.update.m
    public final void b(MMPAppProp mMPAppProp, List<MMPPackageInfo> list) {
        Object[] objArr = {mMPAppProp, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6adaa790d7075e2768e817d9cfd83876", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6adaa790d7075e2768e817d9cfd83876");
            return;
        }
        this.c.a("mmp.launch.duration.download.files", com.meituan.mmp.lib.utils.v.a("state", "success"));
        this.c.b("mmp.launch.download.files");
        this.c.c("mmp.launch.point.download.files");
    }

    @Override // com.meituan.mmp.lib.update.a, com.meituan.mmp.lib.update.m
    public final void a(MMPAppProp mMPAppProp, MMPPackageInfo mMPPackageInfo) {
        Object[] objArr = {mMPAppProp, mMPPackageInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69bd7425394ca669c53df09cf8cdb604", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69bd7425394ca669c53df09cf8cdb604");
            return;
        }
        this.c.a("needDownloadPackages", Boolean.TRUE);
        super.a(mMPAppProp, mMPPackageInfo);
        if (mMPPackageInfo == null) {
            return;
        }
        this.c.a(mMPPackageInfo.d() ? "mmp.launch.duration.download.foundation" : "mmp.launch.duration.download.business", mMPPackageInfo.g);
    }

    @Override // com.meituan.mmp.lib.update.a, com.meituan.mmp.lib.update.m
    public final void a(MMPAppProp mMPAppProp, MMPPackageInfo mMPPackageInfo, boolean z) {
        Object[] objArr = {mMPAppProp, mMPPackageInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45abcb9503656a37487bf817b5211669", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45abcb9503656a37487bf817b5211669");
            return;
        }
        super.a(mMPAppProp, mMPPackageInfo, z);
        if (mMPPackageInfo == null) {
            return;
        }
        this.c.a(mMPPackageInfo.d() ? "mmp.launch.duration.download.foundation" : "mmp.launch.duration.download.business", mMPPackageInfo.g, t.a(mMPPackageInfo));
    }

    @Override // com.meituan.mmp.lib.update.a, com.meituan.mmp.lib.update.m
    public final void a(MMPAppProp mMPAppProp, MMPPackageInfo mMPPackageInfo, String str, Throwable th) {
        Object[] objArr = {mMPAppProp, mMPPackageInfo, str, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4bdbbaf2118f039a0965b459fb79650", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4bdbbaf2118f039a0965b459fb79650");
            return;
        }
        super.a(mMPAppProp, mMPPackageInfo, str, th);
        if (mMPPackageInfo == null) {
            return;
        }
        this.c.a(mMPPackageInfo.d() ? "mmp.launch.duration.download.foundation" : "mmp.launch.duration.download.business", mMPPackageInfo.g, t.a(mMPPackageInfo, str));
        this.c.a("mmp.launch.duration.download.files", t.a(mMPPackageInfo, str));
    }

    @Override // com.meituan.mmp.lib.update.a, com.meituan.mmp.lib.update.m
    public final void b(MMPAppProp mMPAppProp, MMPPackageInfo mMPPackageInfo) {
        Object[] objArr = {mMPAppProp, mMPPackageInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35951dc548cd87c9524a643cce9986f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35951dc548cd87c9524a643cce9986f4");
            return;
        }
        super.b(mMPAppProp, mMPPackageInfo);
        if (mMPPackageInfo == null) {
            return;
        }
        this.c.a(mMPPackageInfo.d() ? "mmp.launch.duration.unpack.foundation" : "mmp.launch.duration.unpack.business", mMPPackageInfo.g);
    }

    @Override // com.meituan.mmp.lib.update.a, com.meituan.mmp.lib.update.m
    public final void b(MMPAppProp mMPAppProp, MMPPackageInfo mMPPackageInfo, boolean z) {
        Object[] objArr = {mMPAppProp, mMPPackageInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8eb7d0b29127b91dc35fd8e405b3f9cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8eb7d0b29127b91dc35fd8e405b3f9cf");
            return;
        }
        super.b(mMPAppProp, mMPPackageInfo, z);
        if (mMPPackageInfo == null) {
            return;
        }
        this.c.a(mMPPackageInfo.d() ? "mmp.launch.duration.unpack.foundation" : "mmp.launch.duration.unpack.business", mMPPackageInfo.g, t.a(mMPPackageInfo));
    }

    @Override // com.meituan.mmp.lib.update.a, com.meituan.mmp.lib.update.m
    public final void b(MMPAppProp mMPAppProp, MMPPackageInfo mMPPackageInfo, String str, Throwable th) {
        Object[] objArr = {mMPAppProp, mMPPackageInfo, str, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbd7dda7dd203553c97e03e8c4eeefd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbd7dda7dd203553c97e03e8c4eeefd1");
            return;
        }
        super.b(mMPAppProp, mMPPackageInfo, str, th);
        if (mMPPackageInfo == null) {
            return;
        }
        this.c.a(mMPPackageInfo.d() ? "mmp.launch.duration.unpack.foundation" : "mmp.launch.duration.unpack.business", mMPPackageInfo.g, t.a(mMPPackageInfo, str));
    }
}
