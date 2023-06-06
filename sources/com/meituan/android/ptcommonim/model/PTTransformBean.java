package com.meituan.android.ptcommonim.model;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public final class PTTransformBean {
    public static final String PT_TRANSFORM_INFO = "pt_transform_info";
    public static ChangeQuickRedirect changeQuickRedirect;
    public int category;
    public short channel;
    public long chatID;
    public String entranceSource;
    public String merchantIdStr;
    public String orderId;
    public short peerAppId;
    public long peerUid;
    public String productId;
    public String sid;
    public String skuId;

    public final boolean isValid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "71063d480b73cb5417251b5c46f61e1f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "71063d480b73cb5417251b5c46f61e1f")).booleanValue();
        }
        if (this.channel > 0) {
            return this.chatID > 0 || !TextUtils.isEmpty(this.merchantIdStr);
        }
        return false;
    }
}
