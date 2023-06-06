package com.sankuai.waimai.launcher.provider.scheme;

import android.net.Uri;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends com.sankuai.waimai.foundation.router.interfaces.e {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.router.interfaces.e
    public final boolean a(@Nullable Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f066379c19448cd1d907c068c9856977", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f066379c19448cd1d907c068c9856977")).booleanValue() : uri != null && TextUtils.equals(uri.getScheme(), com.sankuai.waimai.foundation.router.interfaces.b.a) && TextUtils.equals(uri.getHost(), com.sankuai.waimai.foundation.router.interfaces.b.b);
    }
}
