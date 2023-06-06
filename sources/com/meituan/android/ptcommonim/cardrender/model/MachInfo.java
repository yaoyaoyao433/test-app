package com.meituan.android.ptcommonim.cardrender.model;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class MachInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String biz;
    public String machId;
    public String moduleId;

    public boolean isValid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a4785c8fe41bc361433ea7d4368d69d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a4785c8fe41bc361433ea7d4368d69d")).booleanValue() : !TextUtils.isEmpty(this.machId);
    }
}
