package com.meituan.msc.modules.apploader.launchtasks;

import android.support.annotation.NonNull;
import com.meituan.msc.modules.update.bean.PackageInfoWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class j extends com.meituan.msc.common.aov_task.task.a<Void> {
    public static ChangeQuickRedirect d;
    private final com.meituan.msc.modules.engine.h e;

    @Override // com.meituan.msc.common.aov_task.task.b, com.meituan.msc.common.aov_task.task.c
    public final void a(com.meituan.msc.common.aov_task.context.b bVar) {
    }

    public j(@NonNull com.meituan.msc.modules.engine.h hVar) {
        super("InjectBuzPkgTask");
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e04c9adf12e73e5467d5a423fe9013ef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e04c9adf12e73e5467d5a423fe9013ef");
        } else {
            this.e = hVar;
        }
    }

    @Override // com.meituan.msc.common.aov_task.task.a
    public final com.meituan.msc.common.support.java.util.concurrent.a<Void> b(com.meituan.msc.common.aov_task.context.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3492faae0f758bbc447e0354eba7674", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.common.support.java.util.concurrent.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3492faae0f758bbc447e0354eba7674");
        }
        List<PackageInfoWrapper> arrayList = new ArrayList<>();
        com.meituan.msc.common.aov_task.task.c<?> b = aVar.b(f.class);
        if (b != null) {
            arrayList = (List) aVar.a((f) b);
        }
        final com.meituan.msc.common.support.java.util.concurrent.a<Void> aVar2 = new com.meituan.msc.common.support.java.util.concurrent.a<>();
        ((com.meituan.msc.modules.update.c) this.e.c(com.meituan.msc.modules.update.c.class)).a(arrayList, new com.meituan.msc.modules.update.j() { // from class: com.meituan.msc.modules.apploader.launchtasks.j.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.modules.update.j
            public final void a(PackageInfoWrapper packageInfoWrapper, boolean z) {
            }

            @Override // com.meituan.msc.modules.update.j
            public final void a(PackageInfoWrapper packageInfoWrapper, String str, Exception exc) {
                Object[] objArr2 = {packageInfoWrapper, str, exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "790b8730bbec1568652aef63d5d82515", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "790b8730bbec1568652aef63d5d82515");
                } else {
                    aVar2.b((Throwable) new com.meituan.msc.modules.apploader.events.a(3002, str, exc));
                }
            }

            @Override // com.meituan.msc.modules.update.j
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d58d83bb5cebbbbda2bf47051664ef70", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d58d83bb5cebbbbda2bf47051664ef70");
                } else {
                    aVar2.d((com.meituan.msc.common.support.java.util.concurrent.a) null);
                }
            }
        });
        return aVar2;
    }
}
