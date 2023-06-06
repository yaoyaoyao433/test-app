package com.meituan.android.legwork.bean.orderDetail;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class PrivacyPhoneBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String cid;
    public boolean isPrivacy;
    public String orderId;
    public String privacyTipsMsg;
    public String privacyTipsUrl;
    public String riderPhoneNumber;
    public long saveTime;
    public String userBindPhone;
}
