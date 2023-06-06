package com.sankuai.waimai.business.restaurant.poicontainer.share;

import android.app.Activity;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.log.judas.JudasManualManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.meituan.android.cube.pga.viewmodel.a<d> implements com.sankuai.waimai.foundation.core.service.share.listener.a {
    public static ChangeQuickRedirect o;
    public c p;
    Activity q;
    boolean r;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "277f741c9ec69c374bf95cbe833062c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "277f741c9ec69c374bf95cbe833062c3");
        } else {
            this.r = false;
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.share.listener.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "089e584eb49ba2dd0104e2a8ba11f408", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "089e584eb49ba2dd0104e2a8ba11f408");
            return;
        }
        JudasManualManager.a a = JudasManualManager.a("b_RvD9N");
        a.b = AppUtil.generatePageInfoKey(this.q);
        a.a("c_CijEL").a("channel_id", i).a();
    }
}
