package com.sankuai.waimai.ad.view.mach.nested;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.platform.mach.dialog.DynamicDialog;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends PouchEmbedProcessor {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.ad.view.mach.nested.PouchEmbedProcessor, com.sankuai.waimai.mach.ITagProcessor
    @NonNull
    public final String getTagName() {
        return "embed";
    }

    public a(DynamicDialog.d dVar, com.sankuai.waimai.pouch.model.c cVar) {
        super(dVar, cVar);
        Object[] objArr = {dVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e21e45b3941cf666dbead7f5552bda4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e21e45b3941cf666dbead7f5552bda4");
        }
    }
}
