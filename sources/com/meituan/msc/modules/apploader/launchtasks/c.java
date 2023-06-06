package com.meituan.msc.modules.apploader.launchtasks;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class c extends a {
    public static ChangeQuickRedirect f;

    @Override // com.meituan.msc.modules.apploader.launchtasks.a
    public final String d() {
        return "create_msc_renderer";
    }

    public c(@NonNull com.meituan.msc.modules.engine.h hVar) {
        super("CreateMSCRenderer", hVar);
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6eeddc1a9e8e6507b06971469f30f72", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6eeddc1a9e8e6507b06971469f30f72");
        }
    }

    @Override // com.meituan.msc.modules.apploader.launchtasks.a
    public final com.meituan.msc.b c() {
        return com.meituan.msc.b.NATIVE;
    }
}
