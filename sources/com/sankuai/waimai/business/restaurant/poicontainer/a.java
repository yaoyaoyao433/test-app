package com.sankuai.waimai.business.restaurant.poicontainer;

import android.content.Intent;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements com.sankuai.waimai.platform.shop.a {
    public static ChangeQuickRedirect a;
    private String b;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95e5b6e6762f8b2240e4ad58c07ebb36", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95e5b6e6762f8b2240e4ad58c07ebb36");
        } else {
            this.b = "g_source";
        }
    }

    @Override // com.sankuai.waimai.platform.shop.a
    public final void a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b24b2ec04ea73c01c5a5e5e2c84c984c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b24b2ec04ea73c01c5a5e5e2c84c984c");
            return;
        }
        f.a(intent, "ct_poi");
        String a2 = f.a(intent, "gSource");
        if (TextUtils.isEmpty(a2)) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(this.b, a2);
        Statistics.setValLab(AppUtil.generatePageInfoKey(this), hashMap);
    }
}
