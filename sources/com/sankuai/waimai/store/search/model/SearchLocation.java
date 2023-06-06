package com.sankuai.waimai.store.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SearchLocation implements Serializable {
    public static final int SEARCH_ADDRESS_LOCATION_SHOW_TYPE_GONE = -1;
    public static final int SEARCH_ADDRESS_LOCATION_SHOW_TYPE_STRONG = 0;
    public static final String SWITCH_NEW_AGG_MOUDLE = "AGG";
    public static final String SWITCH_OLD_SPU_MOUDLE = "SPU";
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("show_type")
    public int addressLocationShowType;
    @SerializedName("agg_style_switch_button")
    public String moduleSwitchCode;
    @SerializedName("show_addressBar")
    public boolean showAddressLocation;
    public boolean isExposed = false;
    public boolean isExposeOfSwitchBtn = false;
}
