package com.sankuai.waimai.business.search.ui.result.rank;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.huawei.hms.actions.SearchIntents;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.xp.core.XPlayerConstants;
import com.sankuai.waimai.business.search.common.message.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements com.sankuai.waimai.mach.b {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.mach.b
    public final boolean b(String str, View view, com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {str, view, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6dfbcce2688d0a67b0afb04fe75383a5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6dfbcce2688d0a67b0afb04fe75383a5")).booleanValue();
        }
        return false;
    }

    @Override // com.sankuai.waimai.mach.b
    public final boolean a(String str, View view, com.sankuai.waimai.mach.node.a aVar) {
        Uri parse;
        Object[] objArr = {str, view, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0587e2a3ceb246af274624b8eea737d2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0587e2a3ceb246af274624b8eea737d2")).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && view != null && aVar != null && (parse = Uri.parse(str)) != null) {
            com.meituan.android.bus.a.a().c(new a.C0861a(parse.getQueryParameter(SearchIntents.EXTRA_QUERY), 8, XPlayerConstants.FFP_MSG_RECEIVE_SEI_FRAME));
        }
        return true;
    }
}
