package com.sankuai.eh.component.web.chain;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.utils.thread.a;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements a.InterfaceC0552a {
    public static ChangeQuickRedirect a;
    private final String b;
    private final String c;

    public h(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    @Override // com.sankuai.eh.component.service.utils.thread.a.InterfaceC0552a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a779ccaae2ec2e5f0e6a9e9a48c11b82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a779ccaae2ec2e5f0e6a9e9a48c11b82");
        } else {
            f.b(this.b, this.c);
        }
    }
}
