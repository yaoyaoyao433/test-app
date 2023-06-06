package com.meituan.msi.adapter.mtlogin;

import android.support.annotation.Keep;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class MtUserInfoResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    public MTUserInfo userInfo;
    public String uuid;

    /* compiled from: ProGuard */
    @Keep
    @MsiSupport
    /* loaded from: classes3.dex */
    public static class MTUserInfo extends UserInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        public long userId;
    }
}
