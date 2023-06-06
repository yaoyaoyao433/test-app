package com.sankuai.waimai.store.goods.list.viewblocks.newuser;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.r;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SGNewUserAnimatorModel implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("closeProgress")
    public String closeProgress;
    @SerializedName("discountCountdown")
    public String discountCountdown;
    @SerializedName("loopEnd")
    public String loopEnd;
    @SerializedName("loopStart")
    public String loopStart;
    @SerializedName("lotteryProgress")
    public String lotteryProgress;
    @SerializedName("lottieUrl")
    public String lottieUrl;
    @SerializedName("mNeedLoop")
    public String mNeedLoop;
    @SerializedName("type")
    public String type;

    public float getLoopEnd() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff2946edcd4938b21ff81684b0c44100", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff2946edcd4938b21ff81684b0c44100")).floatValue() : r.a(this.loopEnd, 1.0f);
    }

    public float getmNeedLoop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5af5cb9d1139434baad16ce961dda54f", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5af5cb9d1139434baad16ce961dda54f")).floatValue() : r.a(this.mNeedLoop, 0.0f);
    }

    public float getLoopStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7fe2f497e4e5c1c09817cb816e6bee7f", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7fe2f497e4e5c1c09817cb816e6bee7f")).floatValue() : r.a(this.loopStart, 1.0f);
    }
}
