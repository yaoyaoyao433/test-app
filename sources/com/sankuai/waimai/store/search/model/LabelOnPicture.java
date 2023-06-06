package com.sankuai.waimai.store.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class LabelOnPicture {
    public static final int LABEL_ON_PRODUCT_PICTURE_DRUG_INSURANCE = 1;
    public static final int LABEL_ON_PRODUCT_PICTURE_NEW_PRODUCT = 4;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("label_text")
    public String labelText;
    @SerializedName("type")
    public int labelType;
    @SerializedName("label_url")
    public String labelUrl;
}
