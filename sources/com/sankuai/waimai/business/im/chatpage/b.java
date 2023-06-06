package com.sankuai.waimai.business.im.chatpage;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.imui.session.SessionFragment;
import com.sankuai.xm.imui.session.SessionProvider;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends SessionProvider {
    public static ChangeQuickRedirect a;
    private int b;
    private Bundle c;

    public b(int i, Bundle bundle) {
        Object[] objArr = {Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22d7fccc3baffc77e387350d2ad8dc8d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22d7fccc3baffc77e387350d2ad8dc8d");
            return;
        }
        this.c = bundle;
        this.b = i;
    }

    public b() {
    }

    @Override // com.sankuai.xm.imui.session.SessionProvider
    public final SessionFragment createSessionFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90ffae12cd465a55800e43f709ae21ea", RobustBitConfig.DEFAULT_VALUE) ? (SessionFragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90ffae12cd465a55800e43f709ae21ea") : BaseChatFragment.a(this.c, this.b);
    }
}
