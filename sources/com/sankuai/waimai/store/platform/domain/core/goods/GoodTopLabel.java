package com.sankuai.waimai.store.platform.domain.core.goods;

import android.graphics.drawable.Drawable;
import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.store.platform.domain.core.view.SingleColorLabelStyle;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class GoodTopLabel implements Serializable {
    public static final int TYPE_RANK = 1;
    public static final int TYPE_RECIPE = 2;
    public static final int TYPE_RECOMMEND_REASON = 7;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("content")
    public String content;
    @SerializedName("id")
    public String id;
    public transient Drawable leftDrawable;
    @SerializedName("left_icon")
    public String leftIcon;
    @SerializedName("rank_code")
    public int rankCode;
    public transient Drawable rightDrawable;
    @SerializedName("right_icon")
    public String rightIcon;
    @SerializedName("style")
    public SingleColorLabelStyle style;
    @SerializedName("type")
    public int type;
}
