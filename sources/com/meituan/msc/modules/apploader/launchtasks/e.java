package com.meituan.msc.modules.apploader.launchtasks;

import android.support.annotation.NonNull;
import com.meituan.met.mercury.load.core.DDResource;
import com.meituan.msc.modules.update.MSCHornBasePackageReloadConfig;
import com.meituan.msc.modules.update.PackageLoadReporter;
import com.meituan.msc.modules.update.bean.PackageInfoWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class e extends com.meituan.msc.common.aov_task.task.a<PackageInfoWrapper> {
    public static ChangeQuickRedirect d;
    public com.meituan.msc.modules.engine.h e;
    public String f;

    public static /* synthetic */ void a(e eVar, DDResource dDResource) {
        Object[] objArr = {dDResource};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "2edf73aa38700b84e51eb6768fa95d52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "2edf73aa38700b84e51eb6768fa95d52");
            return;
        }
        String[] d2 = MSCHornBasePackageReloadConfig.e().d();
        if (MSCHornBasePackageReloadConfig.e().a(dDResource.getVersion(), d2)) {
            String str = eVar.c;
            com.meituan.msc.modules.reporter.g.d(str, "loadLatestBasePackage failed, version in reload list:" + dDResource.getVersion());
            com.meituan.msc.modules.update.pkg.d.a().b();
            PackageLoadReporter a = PackageLoadReporter.a(eVar.e);
            String str2 = dDResource.isFromNet() ? "network" : PackageLoadReporter.LoadType.LOCAL;
            Object[] objArr2 = {d2, str2};
            ChangeQuickRedirect changeQuickRedirect2 = PackageLoadReporter.d;
            if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect2, false, "de7e75fa6c258b72fb0a192823601441", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect2, false, "de7e75fa6c258b72fb0a192823601441");
            } else {
                a.b("msc.base.package.version.illegal.count").a("sdkReloadVersions", a.a(d2)).a("loadType", str2).b();
            }
        }
    }

    public e(@NonNull com.meituan.msc.modules.engine.h hVar) {
        super("DownloadBasePackage");
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1bad49481ac3579bfc261ae18ac6141", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1bad49481ac3579bfc261ae18ac6141");
        } else {
            this.e = hVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d9  */
    @Override // com.meituan.msc.common.aov_task.task.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.meituan.msc.common.support.java.util.concurrent.a<com.meituan.msc.modules.update.bean.PackageInfoWrapper> b(com.meituan.msc.common.aov_task.context.a r26) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.modules.apploader.launchtasks.e.b(com.meituan.msc.common.aov_task.context.a):com.meituan.msc.common.support.java.util.concurrent.a");
    }
}
