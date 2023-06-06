package com.sankuai.waimai.business.page.home.list.future.modulelistheader;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class PersonalizedBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("dp_open_personalized_scheme")
    private String dpOpenPersonalizedScheme;
    @SerializedName("feedback_icon_title")
    public String feedbackIconTitle;
    @SerializedName("feedback_scheme")
    public String feedbackScheme;
    @SerializedName("feedback_title")
    public String feedbackTitle;
    @SerializedName("icon_title")
    public String iconTitle;
    @SerializedName("mt_open_personalized_scheme")
    private String mtOpenPersonalizedScheme;
    @SerializedName("open_personalized_scheme")
    private String openPersonalizedScheme;
    public String title;

    public String getOenPersonalizedScheme() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c98391a8c2475e470a3d58647fec8d7b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c98391a8c2475e470a3d58647fec8d7b");
        }
        if (com.sankuai.waimai.foundation.core.a.f()) {
            return this.dpOpenPersonalizedScheme;
        }
        if (com.sankuai.waimai.foundation.core.a.e()) {
            return this.mtOpenPersonalizedScheme;
        }
        return this.openPersonalizedScheme;
    }

    public boolean isCardDataValid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6a12e91851201cc44b79576398b82df", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6a12e91851201cc44b79576398b82df")).booleanValue() : (TextUtils.isEmpty(this.title) || TextUtils.isEmpty(this.iconTitle)) ? false : true;
    }
}
