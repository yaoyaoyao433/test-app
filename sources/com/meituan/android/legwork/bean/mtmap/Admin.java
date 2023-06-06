package com.meituan.android.legwork.bean.mtmap;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class Admin implements Serializable {
    public static final String LEVEL_PREFECTURES = "5";
    public static final String LEVEL_PROVINCES = "4";
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("admin_code")
    public String code;
    @SerializedName("admin_level")
    public String level;
    @SerializedName("name")
    public String name;
}
