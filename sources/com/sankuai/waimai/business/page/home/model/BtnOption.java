package com.sankuai.waimai.business.page.home.model;

import android.os.Bundle;
import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class BtnOption implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean checkAuthority = false;
    public boolean checkLogin = false;
    @SerializedName("btn_icon")
    public String icon;
    public int iconHeight;
    public int iconPlaceHolder;
    public int iconWidth;
    @SerializedName("id")
    public int id;
    @SerializedName("btn_scheme")
    public String scheme;
    public Bundle schemeExtra;
    @SerializedName("title")
    public String title;
}
