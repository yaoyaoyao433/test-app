package com.sankuai.meituan.xp.stat;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtliveqos.common.c;
import com.sankuai.meituan.xp.core.XPlayer;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends a {
    public static ChangeQuickRedirect s;

    @Override // com.sankuai.meituan.xp.stat.a
    public final boolean g() {
        return false;
    }

    public c(Context context, XPlayer xPlayer, com.sankuai.meituan.mtliveqos.utils.a aVar) {
        super(context, xPlayer, null);
        Object[] objArr = {context, xPlayer, null};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4aeaea06124dde580a9331d1587998bc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4aeaea06124dde580a9331d1587998bc");
        } else {
            this.r = c.f.VOD;
        }
    }

    @Override // com.sankuai.meituan.xp.stat.a
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26257dfcebd6225354ff7945b62728e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26257dfcebd6225354ff7945b62728e2");
            return;
        }
        super.e();
        this.g = false;
    }
}
