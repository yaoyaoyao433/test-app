package com.meituan.mmp.lib.update;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class n implements i {
    public static ChangeQuickRedirect a;
    private Context b;
    private MMPAppProp c;
    private MMPUpdateConfig d;
    private i e;

    public n(Context context, MMPAppProp mMPAppProp, MMPUpdateConfig mMPUpdateConfig, i iVar) {
        Object[] objArr = {context, mMPAppProp, mMPUpdateConfig, iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c6a4fe699acbf79cb295cf7f2adce55", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c6a4fe699acbf79cb295cf7f2adce55");
        } else if (iVar == null) {
            throw new RuntimeException("CacheBackGroundUpdateListener Constructor listener should not be empty");
        } else {
            this.b = context;
            this.c = mMPAppProp;
            this.d = mMPUpdateConfig;
            this.e = iVar;
        }
    }

    @Override // com.meituan.mmp.lib.update.i
    public final void a(MMPAppProp mMPAppProp, List<MMPPackageInfo> list) {
        Object[] objArr = {mMPAppProp, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "347ed044e7d3516bc1868cd94b15b237", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "347ed044e7d3516bc1868cd94b15b237");
        } else {
            this.e.a(mMPAppProp, list);
        }
    }

    @Override // com.meituan.mmp.lib.update.i
    public final void a(MMPAppProp mMPAppProp, MMPPackageInfo mMPPackageInfo) {
        Object[] objArr = {mMPAppProp, mMPPackageInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "533d739188246f52e52124630eac23d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "533d739188246f52e52124630eac23d9");
        } else {
            this.e.a(mMPAppProp, mMPPackageInfo);
        }
    }

    @Override // com.meituan.mmp.lib.update.i
    public final void a(MMPAppProp mMPAppProp, String str, Exception exc) {
        MMPPackageInfo subPackageByPath;
        Object[] objArr = {mMPAppProp, str, exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21cf86fba17479cfc7c1e0b04a7a8eff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21cf86fba17479cfc7c1e0b04a7a8eff");
        } else if (this.b != null && this.c != null && this.d != null && ((subPackageByPath = this.c.getSubPackageByPath(this.b, this.d.l)) == null || subPackageByPath.c(this.b))) {
            com.meituan.mmp.lib.trace.b.a("MMPUpdateWithCacheDowngradeListener", exc, "downgrade, msg: " + str);
            com.meituan.mmp.lib.trace.b.d("MMPUpdateWithCacheDowngradeListener", "downgrade to version " + this.c.getPublishId());
            this.c.loadType = 3;
            this.e.a(this.c);
            this.e.a(this.c, subPackageByPath == null ? null : com.meituan.mmp.lib.utils.h.a(subPackageByPath));
        } else {
            this.e.a(mMPAppProp, str, exc);
        }
    }

    @Override // com.meituan.mmp.lib.update.i
    public final void a(MMPAppProp mMPAppProp) {
        Object[] objArr = {mMPAppProp};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a57a707425f618163328782b03c12c1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a57a707425f618163328782b03c12c1c");
        } else {
            this.e.a(mMPAppProp);
        }
    }
}
