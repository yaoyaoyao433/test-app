package com.sankuai.waimai.store.platform.domain.core.poi;

import android.support.annotation.Keep;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.store.repository.model.PrimaryFilterCondList;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class CategoryInfo implements Serializable {
    public static final String NORMAL_TYPE = "normal";
    public static final String OPS_TYPE = "ops";
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("bubble")
    public PrimaryFilterCondList.Bubble bubble;
    @SerializedName("category_code_type")
    public int categoryCodeType;
    public transient int cellSize;
    @SerializedName("code")
    public String code;
    @SerializedName("extra")
    public String extra;
    @SerializedName(RemoteMessageConst.Notification.ICON)
    public String icon;
    @SerializedName("icon_title")
    public String icon_title;
    public transient int index;
    public transient boolean isDataLoadedSuccess;
    public transient boolean isLoading;
    @SerializedName(DMKeys.KEY_SELECTED)
    public int isShow;
    public transient boolean isShowRedDot;
    @SerializedName("jump_url")
    public String jumpUrl;
    @SerializedName("name")
    public String name;
    public transient String rankTraceId;
    public transient long recordStartPoint = -1;
    public transient int requestMode;
    @SerializedName("sub_name")
    public String subName;
    public transient long tabStayTime;
    @SerializedName("tag_icon")
    public String tagIcon;
    @SerializedName("hint_type")
    public int tagIconType;
    @SerializedName("template_code")
    public int template_code;
    @SerializedName("text_title")
    public String text_title;
    public transient String traceId;
    @SerializedName("type")
    public String type;
}
