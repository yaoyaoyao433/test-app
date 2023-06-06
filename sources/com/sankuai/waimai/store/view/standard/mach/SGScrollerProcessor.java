package com.sankuai.waimai.store.view.standard.mach;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.ITagProcessor;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGScrollerProcessor implements ITagProcessor {
    public static ChangeQuickRedirect a;
    private boolean b;

    @Override // com.sankuai.waimai.mach.ITagProcessor
    @NonNull
    public String getTagName() {
        return "sg-scroller";
    }

    public SGScrollerProcessor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "399280c18963b50877104e8308043f1a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "399280c18963b50877104e8308043f1a");
        } else {
            this.b = false;
        }
    }

    public SGScrollerProcessor(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc81174e09167d75f413b2a93aecca7f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc81174e09167d75f413b2a93aecca7f");
        } else {
            this.b = z;
        }
    }

    @Override // com.sankuai.waimai.mach.ITagProcessor
    @NonNull
    public com.sankuai.waimai.mach.component.base.a createComponent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf94384f0b1452b81b35586ad136b9af", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.component.base.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf94384f0b1452b81b35586ad136b9af");
        }
        c cVar = new c();
        cVar.d = this.b;
        return cVar;
    }
}
