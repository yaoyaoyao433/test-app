package com.meituan.msc.modules.service.codecache;

import android.text.TextUtils;
import com.meituan.dio.easy.DioFile;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msc.modules.update.bean.PackageInfoWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f extends com.meituan.msc.modules.preload.executor.c {
    public static ChangeQuickRedirect a;
    private final c b;
    private final String g;
    private final String h;
    private final PackageInfoWrapper i;

    public f(c cVar, String str, String str2, PackageInfoWrapper packageInfoWrapper) {
        super(packageInfoWrapper.getLocalPath());
        Object[] objArr = {cVar, str, str2, packageInfoWrapper};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c470427a463471275b420dc329d45a71", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c470427a463471275b420dc329d45a71");
            return;
        }
        this.g = str;
        this.h = str2;
        this.i = packageInfoWrapper;
        this.b = cVar;
    }

    @Override // com.meituan.msc.modules.preload.executor.c
    public final void a(com.meituan.msc.modules.preload.executor.d dVar) {
        String str;
        boolean z;
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f26036fada00b06bb853932b00dc5787", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f26036fada00b06bb853932b00dc5787");
            return;
        }
        try {
            for (DioFile dioFile : DioFile.a(new DioFile(this.i.getLocalPath()))) {
                if (dioFile.a().endsWith(".js")) {
                    String str2 = this.g;
                    String str3 = this.h;
                    PackageInfoWrapper packageInfoWrapper = this.i;
                    PackageInfoWrapper packageInfoWrapper2 = this.i;
                    String a2 = dioFile.a();
                    Object[] objArr2 = {packageInfoWrapper2, a2};
                    ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.update.d.a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "10b8ef0f617fbf7d4a942697fbd9df8d", RobustBitConfig.DEFAULT_VALUE)) {
                        str = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "10b8ef0f617fbf7d4a942697fbd9df8d");
                    } else {
                        if (!TextUtils.isEmpty(packageInfoWrapper2.getLocalPath())) {
                            if (packageInfoWrapper2.packageType == 1) {
                                str = "/" + packageInfoWrapper2.getDDResourceName() + ".dio/" + a2;
                            } else if (packageInfoWrapper2.packageType == 2) {
                                str = "/main_app.dio/" + a2;
                            } else if (packageInfoWrapper2.packageType == 3) {
                                str = "/" + packageInfoWrapper2.getDDResourceName() + ".dio/" + a2;
                            }
                        }
                        str = "unknown";
                    }
                    a aVar = new a(str2, str3, packageInfoWrapper, dioFile, str);
                    com.meituan.msc.modules.preload.executor.e eVar = dVar.b;
                    String b = aVar.b();
                    Object[] objArr3 = {b};
                    ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.modules.preload.executor.e.b;
                    if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "95d0bf3af1613f9e9ee2e78ae9bea4ac", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "95d0bf3af1613f9e9ee2e78ae9bea4ac")).booleanValue();
                    } else {
                        z = eVar.b(b) != null;
                    }
                    if (z) {
                        dVar.b.a(aVar.b());
                    }
                    if (this.b.a(aVar, true)) {
                        this.b.a(aVar);
                    }
                }
            }
        } catch (IOException e) {
            g.a("CreatePackageCodeCacheTask", e);
        }
    }
}
