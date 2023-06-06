package com.sankuai.xm.network.setting;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b extends a {
    public static ChangeQuickRedirect b;

    @Override // com.sankuai.xm.network.setting.g
    public final String a(int i) {
        return i == 1 ? "fallback.live.xm.meituan.com" : "fallback.signal.xm.meituan.com";
    }

    @Override // com.sankuai.xm.network.setting.g
    public final String a(boolean z) {
        return "https://api.neixin.cn";
    }

    @Override // com.sankuai.xm.network.setting.g
    public final String b() {
        return "https://chatroom.meituan.com";
    }

    @Override // com.sankuai.xm.network.setting.g
    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c95c8fb4ab8cb033fc01d96a0b1d020a", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c95c8fb4ab8cb033fc01d96a0b1d020a") : (f.a().b == 7 || f.a().b == 21 || f.a().b == 18 || f.a().b == 3 || f.a().b == 14 || f.a().b == 17) ? "dxlvs.meituan.com" : "dxl.sankuai.com";
    }

    @Override // com.sankuai.xm.network.setting.g
    public final short d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd2c313a140fa178cc3784c064f321c8", 6917529027641081856L) ? ((Short) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd2c313a140fa178cc3784c064f321c8")).shortValue() : (f.a().b == 7 || f.a().b == 21 || f.a().b == 18 || f.a().b == 3 || f.a().b == 14 || f.a().b == 17) ? (short) 80 : (short) 8400;
    }

    @Override // com.sankuai.xm.network.setting.g
    public final e e() {
        return e.ENV_RELEASE;
    }
}
