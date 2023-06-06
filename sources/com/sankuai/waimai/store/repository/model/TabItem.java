package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class TabItem implements Serializable {
    public static final int MESSAGE = 1;
    public static final int MINE = 3;
    public static final int ORDER_LIST = 2;
    public static final int POI = 0;
    public static final int VIDEO = 4;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("cartonFileUrl")
    public String cartonFileUrl;
    @SerializedName("cartoonDisplayNum")
    public int cartoonDisplayNum;
    @SerializedName("cartoonJsonUrl")
    public String cartoonJsonUrl;
    @SerializedName("cartoonSwitch")
    public boolean cartoonSwitch;
    @SerializedName("category_type")
    public int categoryType;
    @SerializedName("dynamicConfigSceneSwitch")
    public boolean dynamicConfigSceneSwitch;
    @SerializedName("gifBubbleDisplaySeconds")
    public int gifBubbleDisplaySeconds;
    @SerializedName("gifBubbleSwitch")
    public boolean gifBubbleSwitch;
    @SerializedName("gifBubbleUrl")
    public String gifBubbleUrl;
    @SerializedName("navigate_type")
    public int navigateType;
    @SerializedName("sceneActivityConfigID")
    public String sceneActivityConfigID;
    @SerializedName("sceneBubbleDisplaySeconds")
    public int sceneBubbleDisplaySeconds;
    @SerializedName("sceneText")
    public String sceneText;
    @SerializedName("sceneUrl")
    public String sceneUrl;
    public int sceneUrlResourceType;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String scheme;
    @SerializedName("staticConfigSceneSwitch")
    public boolean staticConfigSceneSwitch;
    @SerializedName("tabDefaultIcon")
    public String tabDefaultIcon;
    @SerializedName("tabName")
    public String tabName;
    @SerializedName("tabSelectedIcon")
    public String tabSelectedIcon;
    @SerializedName("tabType")
    public int tabType;
    @SerializedName("titleBarName")
    public String titleBarName;
    @SerializedName("unreadMessageCount")
    public int unreadMessageCount;
}
