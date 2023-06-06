package com.meituan.msc.modules.apploader.launchtasks;

import android.support.annotation.NonNull;
import com.meituan.mmp.lib.engine.LaunchMode;
import com.meituan.msc.modules.update.bean.PackageInfoWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class i extends com.meituan.msc.common.aov_task.task.a<PackageInfoWrapper> {
    public static ChangeQuickRedirect d;
    public com.meituan.msc.modules.engine.h e;

    public i(@NonNull com.meituan.msc.modules.engine.h hVar) {
        super("InjectBasePackage");
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43f6a5440a53705534bd14e6691a6d42", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43f6a5440a53705534bd14e6691a6d42");
        } else {
            this.e = hVar;
        }
    }

    @Override // com.meituan.msc.common.aov_task.task.a
    public final com.meituan.msc.common.support.java.util.concurrent.a<PackageInfoWrapper> b(com.meituan.msc.common.aov_task.context.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e502e39f7ff7adc3624fed15cac72faa", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.common.support.java.util.concurrent.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e502e39f7ff7adc3624fed15cac72faa");
        }
        com.meituan.msc.modules.reporter.g.d(b(), "Start to InjectBasePackage");
        final com.meituan.msc.common.support.java.util.concurrent.a<PackageInfoWrapper> aVar2 = new com.meituan.msc.common.support.java.util.concurrent.a<>();
        final long currentTimeMillis = System.currentTimeMillis();
        ((com.meituan.msc.modules.engine.a) this.e.c(com.meituan.msc.modules.engine.a.class)).a((PackageInfoWrapper) aVar.a(e.class), new com.meituan.msc.modules.engine.g() { // from class: com.meituan.msc.modules.apploader.launchtasks.i.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.modules.engine.g
            public final void a(@NonNull PackageInfoWrapper packageInfoWrapper, boolean z) {
                Object[] objArr2 = {packageInfoWrapper, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "030df0347f34487be826769f56772fec", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "030df0347f34487be826769f56772fec");
                    return;
                }
                com.meituan.msc.modules.reporter.g.d(i.this.c, "inject base package success");
                com.meituan.msc.modules.engine.h hVar = i.this.e;
                long j = currentTimeMillis;
                Object[] objArr3 = {new Long(j)};
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.modules.reporter.preformance.c.a;
                hVar.D = PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "6a2b903f244c5e6d9ff718ae36df956b", RobustBitConfig.DEFAULT_VALUE) ? (JSONObject) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "6a2b903f244c5e6d9ff718ae36df956b") : new com.meituan.msc.modules.reporter.preformance.b().a("script").a(j).b("evaluateScript").b(System.currentTimeMillis());
                aVar2.d((com.meituan.msc.common.support.java.util.concurrent.a) packageInfoWrapper);
                i.this.e.o.b(LaunchMode.LAUNCH_MODE_PRELOAD);
            }

            @Override // com.meituan.msc.modules.engine.g
            public final void a(@NonNull PackageInfoWrapper packageInfoWrapper, Exception exc) {
                Object[] objArr2 = {packageInfoWrapper, exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c55c8dda39db09aa95e9e1d7d9e2fb0d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c55c8dda39db09aa95e9e1d7d9e2fb0d");
                    return;
                }
                com.meituan.msc.modules.reporter.g.d(i.this.c, "inject base package failed");
                com.meituan.msc.common.support.java.util.concurrent.a aVar3 = aVar2;
                aVar3.b((Throwable) new com.meituan.msc.modules.apploader.events.a(3001, i.this.c + ":加载基础包失败", exc));
                i.this.e.o.b(LaunchMode.LAUNCH_MODE_PRELOAD);
            }
        });
        return aVar2;
    }
}
