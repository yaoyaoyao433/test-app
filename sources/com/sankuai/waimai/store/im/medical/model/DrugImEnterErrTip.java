package com.sankuai.waimai.store.im.medical.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class DrugImEnterErrTip implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("code")
    public long code;
    @SerializedName("haveHistory")
    public boolean haveHistory;
    @SerializedName("tip")
    public String tip;
    @SerializedName("title")
    public String title;
}
