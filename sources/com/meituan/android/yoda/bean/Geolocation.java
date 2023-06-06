package com.meituan.android.yoda.bean;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class Geolocation {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("hint")
    public String hint;
    @SerializedName("items")
    public List<Item> items;
    @SerializedName("selectcnt")
    public int selectcnt;
}
