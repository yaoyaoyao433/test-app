package com.sankuai.waimai.business.page.homepage.model;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class b {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int activityId;
    public Bitmap bitmap;
    public String bottomColor;
    public String btnText;
    public String clickImageUrl;
    public String dspLogo;
    public String gifFileCachePath;
    public long id;
    public int isAd;
    public String landingPageUrl;
    public int matHeight;
    public int matType;
    public String matUrl;
    public int matWidth;
    public String mimeType;
    public double opacity;
    public int screenType;
    public int showMode;
    public String textColor;
    public String topColor;
    public int yyActivityType;

    public boolean isHalfScreenType() {
        return this.screenType == 1;
    }

    public boolean isVideoSource() {
        return this.matType == 1;
    }

    public boolean isAd() {
        return this.isAd != 0;
    }

    public boolean isGif() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b07083fc6e2eb31b98da17b19f80ee02", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b07083fc6e2eb31b98da17b19f80ee02")).booleanValue() : !TextUtils.isEmpty(this.mimeType) && this.mimeType.toLowerCase().contains(CommonConstant.File.GIF);
    }

    public boolean isStaticPic() {
        return this.matType == 0;
    }

    public boolean isCutPicture() {
        return this.showMode == 1;
    }
}
