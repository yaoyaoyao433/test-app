package com.sankuai.waimai.business.page.home.gray;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class HomeGrayModel implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("positions")
    public List<PositionsDTO> positions;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class PositionsDTO implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("resources")
        public List<ResourcesDTO> resources;

        /* compiled from: ProGuard */
        @Keep
        /* loaded from: classes4.dex */
        public static class ResourcesDTO implements Serializable {
            public static ChangeQuickRedirect changeQuickRedirect;
            @SerializedName("config")
            public ConfigDTO config;
            @SerializedName("resourceId")
            public int resourceId;

            /* compiled from: ProGuard */
            @Keep
            /* loaded from: classes4.dex */
            public static class ConfigDTO implements Serializable {
                public static ChangeQuickRedirect changeQuickRedirect;
                @SerializedName("grayness_type")
                private String grayLevel;
                @SerializedName("gray_rate")
                private String grayRate;
                @SerializedName("home_feeds_grayness_card_count")
                private String homeFeedsGraynessCardCount;
                @SerializedName("home_rcmd_board_grayness_range")
                private String homeRcmdBoardGraynessRange;

                public ConfigDTO(String str) {
                    Object[] objArr = {str};
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "17bbf04b62135e2726407098a9ee7763", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "17bbf04b62135e2726407098a9ee7763");
                    } else {
                        this.grayLevel = str;
                    }
                }

                public ConfigDTO() {
                }

                public int getHomeFeedsGraynessCardCount() {
                    Object[] objArr = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8f8e1d3e03540a0daf90e999438fc0f", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8f8e1d3e03540a0daf90e999438fc0f")).intValue();
                    }
                    try {
                        return Integer.valueOf(this.homeFeedsGraynessCardCount).intValue();
                    } catch (Exception unused) {
                        return 0;
                    }
                }

                public boolean graySwitch() {
                    Object[] objArr = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c29be0079c8cd5071933378cf1ca416d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c29be0079c8cd5071933378cf1ca416d")).booleanValue() : getGrayLevel() > 0;
                }

                public int getGrayLevel() {
                    Object[] objArr = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce7debb3d3aff4646e29b3d214341460", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce7debb3d3aff4646e29b3d214341460")).intValue();
                    }
                    try {
                        return Integer.valueOf(this.grayLevel).intValue();
                    } catch (Exception unused) {
                        return 0;
                    }
                }

                public int getHomeRcmdBoardGraynessRange() {
                    Object[] objArr = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67b30d39881b3f6214fd1d248f5fe340", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67b30d39881b3f6214fd1d248f5fe340")).intValue();
                    }
                    try {
                        return Integer.valueOf(this.homeRcmdBoardGraynessRange).intValue();
                    } catch (Exception unused) {
                        return 0;
                    }
                }

                public float getGrayRate() {
                    Object[] objArr = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "730bbd8c956ecf507331660ca2a62eb1", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "730bbd8c956ecf507331660ca2a62eb1")).floatValue();
                    }
                    try {
                        float floatValue = 1.0f - Float.valueOf(this.grayRate).floatValue();
                        if (floatValue < 0.0f) {
                            floatValue = 0.0f;
                        }
                        if (floatValue > 1.0f) {
                            return 1.0f;
                        }
                        return floatValue;
                    } catch (Exception unused) {
                        return 1.0f;
                    }
                }

                public boolean equals(Object obj) {
                    Object[] objArr = {obj};
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a25977afc78dfe03db15d1fede61b4f6", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a25977afc78dfe03db15d1fede61b4f6")).booleanValue();
                    }
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    ConfigDTO configDTO = (ConfigDTO) obj;
                    return TextUtils.equals(this.homeFeedsGraynessCardCount, configDTO.homeFeedsGraynessCardCount) && TextUtils.equals(this.grayLevel, configDTO.grayLevel) && TextUtils.equals(this.homeRcmdBoardGraynessRange, configDTO.homeRcmdBoardGraynessRange) && TextUtils.equals(this.grayRate, configDTO.grayRate);
                }

                public int hashCode() {
                    Object[] objArr = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b7e93aa499f8d658e48ebbc80dc5611", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b7e93aa499f8d658e48ebbc80dc5611")).intValue() : Objects.hash(this.homeFeedsGraynessCardCount, this.grayLevel, this.homeRcmdBoardGraynessRange, this.grayRate);
                }
            }
        }
    }
}
