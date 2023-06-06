package com.sankuai.waimai.platform.domain.manager.location.v2;

import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.capacity.log.a;
import com.sankuai.waimai.platform.capacity.log.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    public static boolean b = true;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.domain.manager.location.v2.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static class C1049a extends a.AbstractC1040a {
        @Override // com.sankuai.waimai.platform.capacity.log.a.AbstractC1040a
        public final String a() {
            return "Platform";
        }
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "546cd5710215955704d5ce54efd47660", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "546cd5710215955704d5ce54efd47660");
            return;
        }
        if (com.sankuai.waimai.foundation.utils.log.a.b) {
            com.sankuai.waimai.foundation.utils.log.a.b(str, str2, new Object[0]);
        }
        i.b(new C1049a().a(str).d(str2).b());
    }

    public static void a(String str, String str2, Pair... pairArr) {
        Object[] objArr = {str, str2, pairArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eef5ca661c4d68e7e0db97d9be103c7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eef5ca661c4d68e7e0db97d9be103c7b");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Method:");
        sb.append(str2);
        sb.append(CommonConstant.Symbol.COMMA);
        for (Pair pair : pairArr) {
            sb.append(pair.first);
            sb.append(CommonConstant.Symbol.COLON);
            sb.append(pair.second);
            sb.append(CommonConstant.Symbol.COMMA);
        }
        String sb2 = sb.toString();
        if (com.sankuai.waimai.foundation.utils.log.a.b) {
            com.sankuai.waimai.foundation.utils.log.a.b(str, sb2, new Object[0]);
        }
        i.b(new C1049a().a(str).d(sb2).b());
    }
}
