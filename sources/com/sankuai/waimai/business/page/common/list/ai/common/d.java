package com.sankuai.waimai.business.page.common.list.ai.common;

import com.meituan.android.common.aidata.mrn.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends a {
    public static ChangeQuickRedirect f;

    @Override // com.sankuai.waimai.business.page.common.list.ai.common.c
    public final String b() {
        return "waimai";
    }

    public d(String str) {
        super(str);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c404e6d1c648de4c6bfbbd7318be53d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c404e6d1c648de4c6bfbbd7318be53d");
        }
    }

    @Override // com.sankuai.waimai.business.page.common.list.ai.common.a
    public final String a(@Nullable Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9f772656b814bac5519e0fc72bd6479", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9f772656b814bac5519e0fc72bd6479");
        }
        if (map == null) {
            return null;
        }
        return map.get(Constants.JSBundleConstants.KEY_BUNDLE_ID);
    }

    @Override // com.sankuai.waimai.business.page.common.list.ai.common.c
    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ed590fc09cf81803a985fa3aa7e9dd9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ed590fc09cf81803a985fa3aa7e9dd9")).booleanValue() : this.e != null && "1".equals(this.e.get("is_dynamicPaging"));
    }
}
