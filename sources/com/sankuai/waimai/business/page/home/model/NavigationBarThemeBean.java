package com.sankuai.waimai.business.page.home.model;

import android.support.annotation.Keep;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class NavigationBarThemeBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("navigation_bar_theme")
    public a navigationBarTheme;
    @SerializedName("show_windows_style")
    public boolean showWindowsStyle;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements Serializable {
        public static ChangeQuickRedirect a;
        @SerializedName("start_color")
        public String b;
        @SerializedName("end_color")
        public String c;
        @SerializedName(DMKeys.KEY_GRADIENT_COLOR_INFO_ORIENTATION)
        public int d;
        @SerializedName("scene_type")
        public int e;

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32a717d1605cf7d867841d182ef1268d", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32a717d1605cf7d867841d182ef1268d");
            }
            return "ConfigInfo{startColor='" + this.b + "', endColor='" + this.c + "', orientation=" + this.d + ", sceneType=" + this.e + '}';
        }
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a040cb17ba6ccf844bd2dd5aca594c63", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a040cb17ba6ccf844bd2dd5aca594c63");
        }
        return "FutureHornThemeConfigBean{navigationBarTheme=" + this.navigationBarTheme + '}';
    }
}
