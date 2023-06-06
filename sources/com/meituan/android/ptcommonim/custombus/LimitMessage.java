package com.meituan.android.ptcommonim.custombus;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class LimitMessage {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int alwaysShow;
    public int period;
    public String type;
    public String userTips;

    public boolean isValid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e57a3fc6a2f0e2f99a6819da4705d7e3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e57a3fc6a2f0e2f99a6819da4705d7e3")).booleanValue() : (TextUtils.isEmpty(this.type) || TextUtils.isEmpty(this.userTips) || this.period <= 0) ? false : true;
    }
}
