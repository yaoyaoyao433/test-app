package com.meituan.msc.modules.apploader.launchtasks;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class m extends l<String> {
    public static ChangeQuickRedirect f;

    @Override // com.meituan.msc.common.aov_task.task.b, com.meituan.msc.common.aov_task.task.c
    public final void a(com.meituan.msc.common.aov_task.context.b bVar) {
    }

    public m(String str) {
        super("SetLaunchPath", str);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81ecca97a0a574fbbad2344d471c995a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81ecca97a0a574fbbad2344d471c995a");
        }
    }
}
