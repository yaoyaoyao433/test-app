package com.meituan.msc.modules.apploader.launchtasks;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class d extends a {
    public static ChangeQuickRedirect f;

    @Override // com.meituan.msc.modules.apploader.launchtasks.a
    public final String d() {
        return "create_rn_renderer";
    }

    public d(@NonNull com.meituan.msc.modules.engine.h hVar) {
        super("CreateRNRenderer", hVar);
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3993f4afdaec3342bed877a63f24a00b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3993f4afdaec3342bed877a63f24a00b");
        }
    }

    @Override // com.meituan.msc.modules.apploader.launchtasks.a
    public final com.meituan.msc.b c() {
        return com.meituan.msc.b.RN;
    }
}
