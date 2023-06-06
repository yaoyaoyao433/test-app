package com.sankuai.waimai.alita.core.feature.repo;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.base.f;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a implements f<String> {
    public static ChangeQuickRedirect a;

    public abstract String a();

    @Override // com.sankuai.waimai.alita.core.base.f
    public final /* synthetic */ boolean a(@Nullable String str) {
        String str2 = str;
        Object[] objArr = {str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4faecfcd1e1ce46ac83dd20ce9e52e4a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4faecfcd1e1ce46ac83dd20ce9e52e4a")).booleanValue();
        }
        String a2 = a();
        return a2 != null && a2.equals(str2);
    }
}
