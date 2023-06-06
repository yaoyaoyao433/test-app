package com.meituan.android.legwork.bean;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class MRNShareModel implements Serializable {
    public static final int CAN_SHARE_MOMENTS = 1;
    public static final int DEGRADE_TO_NORMAL_COUPON = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    public int canShareMoments;
    public String cid;
    public int degradeNormalCoupon;
    public String miniProgramId;
    public String miniProgramImage;
    public String miniProgramPath;
    public String miniProgramTitle;
    public String qqPicUrl;
    public String qqSharePath;
    public String qqTitle;
    public String shareBaseUrl;
    public String shareContent;
    public String shareIcon;
    public String shareImage;
    public String shareTitle;
    public String shareUrl;
    public String smsContent;

    private boolean isDegradeToNormal() {
        return this.degradeNormalCoupon == 1;
    }

    public boolean canShareMoments() {
        return this.canShareMoments == 1;
    }

    public boolean isNormalCoupon() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fcf64be05f26e3276ef0a01482394c68", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fcf64be05f26e3276ef0a01482394c68")).booleanValue() : isDegradeToNormal() && !TextUtils.isEmpty(this.shareUrl);
    }
}
