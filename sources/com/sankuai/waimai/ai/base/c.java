package com.sankuai.waimai.ai.base;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class c implements com.sankuai.waimai.alita.base.c<String> {
    public static ChangeQuickRedirect a;
    public a b;

    public abstract String a();

    @Override // com.sankuai.waimai.alita.base.c
    public final /* synthetic */ boolean a(String str) {
        String str2 = str;
        Object[] objArr = {str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49178fbf2577ca6f4ac860351ce2bd8e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49178fbf2577ca6f4ac860351ce2bd8e")).booleanValue() : !TextUtils.isEmpty(str2) && TextUtils.equals(str2, a());
    }
}
