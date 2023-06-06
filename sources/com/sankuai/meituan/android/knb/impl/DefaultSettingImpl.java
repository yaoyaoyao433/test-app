package com.sankuai.meituan.android.knb.impl;

import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.meituan.android.knb.KNBWebManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class DefaultSettingImpl implements KNBWebManager.ISetting {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.meituan.android.knb.KNBWebManager.ISetting
    public final int getWebTimeout() {
        return KNBWebManager.ISetting.DEFAULT_TIMEOUT;
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebManager.ISetting
    public final boolean isDebug() {
        return false;
    }
}
