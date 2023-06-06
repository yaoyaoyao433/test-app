package com.sankuai.waimai.popup.spfx.particle.initializers;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Random;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c implements b {
    public static ChangeQuickRedirect a;
    private int b;
    private int c;

    public c(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35f3b543b6132b360e6d6fd2e29bd726", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35f3b543b6132b360e6d6fd2e29bd726");
            return;
        }
        this.b = i;
        this.c = i2;
    }

    @Override // com.sankuai.waimai.popup.spfx.particle.initializers.b
    public final void a(com.sankuai.waimai.popup.spfx.particle.a aVar, Random random) {
        Object[] objArr = {aVar, random};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fbf7e5145cc0e510de078bf01da683e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fbf7e5145cc0e510de078bf01da683e");
        } else {
            aVar.i = this.b == this.c ? this.b : random.nextInt(this.c - this.b) + this.b;
        }
    }
}
