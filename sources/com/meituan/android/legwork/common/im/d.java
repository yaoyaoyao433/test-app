package com.meituan.android.legwork.common.im;

import com.meituan.android.legwork.net.service.CommonAPIService;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements rx.functions.g {
    public static ChangeQuickRedirect a;
    private final String b;

    public d(String str) {
        this.b = str;
    }

    @Override // rx.functions.g
    public final Object call(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cbfe822b12ae58547fbf3bf06cea69a", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cbfe822b12ae58547fbf3bf06cea69a");
        }
        String str = this.b;
        Boolean bool = (Boolean) obj;
        Object[] objArr2 = {str, bool};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "abb115cd304af6bc23b173b39b6a8367", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "abb115cd304af6bc23b173b39b6a8367");
        }
        if (bool.booleanValue()) {
            return null;
        }
        return ((CommonAPIService) com.meituan.android.legwork.net.manager.a.a().a(CommonAPIService.class)).getImInsertMessageList(str);
    }
}
