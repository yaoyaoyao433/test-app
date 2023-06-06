package com.sankuai.titans.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class InjectPath {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("more")
    @Expose
    public List<String> more;
    @SerializedName("page")
    @Expose
    public String page;
}
