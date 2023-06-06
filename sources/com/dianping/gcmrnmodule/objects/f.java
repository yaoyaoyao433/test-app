package com.dianping.gcmrnmodule.objects;

import com.dianping.agentsdk.framework.aq;
import com.dianping.shield.dynamic.objects.DynamicModuleViewData;
import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.node.cellnode.AttachStatus;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f extends DynamicModuleViewData {
    public static ChangeQuickRedirect a;
    private c b;
    private a c;

    @Override // com.dianping.shield.dynamic.objects.DynamicModuleViewData
    public final int getInputWidth() {
        return 0;
    }

    @Override // com.dianping.shield.dynamic.objects.DynamicModuleViewData
    public final Object getViewInput() {
        if (this.b != null) {
            return this.b;
        }
        if (this.c != null) {
            return this.c;
        }
        return null;
    }

    @Override // com.dianping.shield.dynamic.objects.DynamicModuleViewData
    public final void setViewInput(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "377e00ed06b145c2281469be5c580c9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "377e00ed06b145c2281469be5c580c9e");
        } else if (obj instanceof c) {
            this.b = (c) obj;
        } else if (obj instanceof a) {
            this.c = (a) obj;
        }
    }

    @Override // com.dianping.shield.dynamic.objects.DynamicModuleViewData
    public final boolean hasInput() {
        return (this.b == null && this.c == null) ? false : true;
    }

    @Override // com.dianping.shield.dynamic.objects.DynamicModuleViewData
    public final int getInputHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5b044d54572c1d540cdf0cd7e530927", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5b044d54572c1d540cdf0cd7e530927")).intValue();
        }
        if (this.c != null) {
            return aq.b(this.c.k, this.c.h);
        }
        if (this.b == null || this.b.a == null) {
            return 0;
        }
        return aq.b(this.b.a.getContext(), this.b.a.getHeight());
    }

    @Override // com.dianping.shield.dynamic.objects.DynamicModuleViewData
    public final void onStatusChanged(AttachStatus attachStatus, ScrollDirection scrollDirection) {
        Object[] objArr = {attachStatus, scrollDirection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd49d32817d53645db6f5b0910ca95e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd49d32817d53645db6f5b0910ca95e6");
        } else if (this.c != null) {
            this.c.a(attachStatus, scrollDirection);
        }
    }
}
