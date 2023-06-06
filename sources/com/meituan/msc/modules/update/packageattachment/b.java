package com.meituan.msc.modules.update.packageattachment;

import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends com.meituan.msc.modules.preload.executor.c {
    public static ChangeQuickRedirect a;
    private final e b;

    public b(e eVar) {
        super("CleanAbandonedAttachmentTask");
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ecde0404012436fc05be38ee2d028aa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ecde0404012436fc05be38ee2d028aa");
        } else {
            this.b = eVar;
        }
    }

    @Override // com.meituan.msc.modules.preload.executor.c
    public final void a(com.meituan.msc.modules.preload.executor.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11ce538d26ae2f31cb4f2438fbd2ab22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11ce538d26ae2f31cb4f2438fbd2ab22");
            return;
        }
        try {
            this.b.c();
        } catch (IOException e) {
            g.a("PackageAttachmentManager", e);
        }
    }
}
