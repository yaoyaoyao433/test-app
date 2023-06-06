package com.sankuai.waimai.mmp.modules.personalization;

import android.text.TextUtils;
import com.meituan.mmp.lib.api.auth.g;
import com.meituan.mmp.lib.api.auth.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements g {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.lib.api.auth.g
    public final j a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2c68564561efc378eb7e7292e98e7f7", RobustBitConfig.DEFAULT_VALUE) ? (j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2c68564561efc378eb7e7292e98e7f7") : new j(Boolean.valueOf(TextUtils.equals(com.sankuai.waimai.platform.settings.a.a().b(), "0")), Boolean.valueOf(TextUtils.equals(com.sankuai.waimai.platform.settings.a.a().c(), "0")));
    }
}
