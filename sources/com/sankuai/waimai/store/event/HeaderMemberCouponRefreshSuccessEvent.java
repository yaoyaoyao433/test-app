package com.sankuai.waimai.store.event;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class HeaderMemberCouponRefreshSuccessEvent {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int status;

    public HeaderMemberCouponRefreshSuccessEvent(int i) {
        this.status = i;
    }
}
