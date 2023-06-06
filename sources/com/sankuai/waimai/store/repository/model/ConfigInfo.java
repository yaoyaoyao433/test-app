package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public final class ConfigInfo implements Serializable {
    public static final String MODULE_ACROSS_BANNER = "across_banner";
    public static final String MODULE_BANNER = "banner";
    public static final String MODULE_BLOCK = "block";
    public static final String MODULE_DRUG_HOME_SHOPPING_NATIVE_TO_MACH = "drug_home_shopping_native_to_mach";
    public static final String MODULE_KING_KONG = "kingkong";
    public static final String MODULE_MACH_GUESS_YOU_LIKE = "guess_you_like";
    public static final String MODULE_MACH_POI_LEADER_BOARD = "poi_leaderboard";
    public static final String MODULE_NEW_USER_GAME = "supermarket-new-user-task-game";
    public static final String MODULE_NEW_USER_REGION = "new_user_region";
    public static final String MODULE_NEW_USER_REGION_V2 = "new_user_region_v2";
    public static final String MODULE_NEW_USER_REGION_V2_TEMPLATE_ID = "supermarket-new-user-game";
    public static final String MODULE_OFTEN_BUY = "oftenbuy";
    public static final String MODULE_PLATINUM_BANNER = "dynamic_platinum_banner";
    public static final int MODULE_SHOW = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("hide")
    public int hide;
    @SerializedName("moduleName")
    public String moduleName;
    @SerializedName("title")
    public String title;
    @SerializedName("top_padding")
    public int top = -1;
    @SerializedName("bottom_padding")
    public int bottom = -1;
}
