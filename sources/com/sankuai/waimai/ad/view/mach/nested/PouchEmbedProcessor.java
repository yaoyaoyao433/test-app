package com.sankuai.waimai.ad.view.mach.nested;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.ITagProcessor;
import com.sankuai.waimai.platform.mach.dialog.DynamicDialog;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PouchEmbedProcessor implements ITagProcessor {
    public static ChangeQuickRedirect b;
    private DynamicDialog.d a;
    private com.sankuai.waimai.pouch.model.c c;
    private b d;

    @Override // com.sankuai.waimai.mach.ITagProcessor
    @NonNull
    public String getTagName() {
        return "pouchembed";
    }

    public PouchEmbedProcessor(DynamicDialog.d dVar, com.sankuai.waimai.pouch.model.c cVar) {
        Object[] objArr = {dVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ed727a79faff3818d2724e5f242fec4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ed727a79faff3818d2724e5f242fec4");
            return;
        }
        this.a = dVar;
        this.c = cVar;
    }

    @Override // com.sankuai.waimai.mach.ITagProcessor
    @NonNull
    public com.sankuai.waimai.mach.component.base.a<?> createComponent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6dc165c6659c0a088a348b928105017", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.component.base.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6dc165c6659c0a088a348b928105017");
        }
        this.d = new b(this.a, this.c);
        return this.d;
    }

    public final void a(DynamicDialog.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "072b1b86bec867b9ed0339231450864a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "072b1b86bec867b9ed0339231450864a");
            return;
        }
        this.a = dVar;
        if (this.d != null) {
            this.d.a(dVar);
        }
    }
}
