package com.sankuai.waimai.business.page.home.gray;

import android.support.annotation.Keep;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.gray.HomeGrayModel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import java.util.Objects;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class GrayViewWrapper {
    public static final int DEFAULT_VIEW_TYPE = 0;
    public static final int FEED_LISTVIEW_TYPE = 2;
    public static final int INDICATOR_VIEW_TYPE = 4;
    public static final int RCMD_LISTVIEW_TYPE = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean isGray;
    public int position;
    public View view;
    public int viewLevel;
    public int viewType;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface GrayViewType {
    }

    public GrayViewWrapper() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "427aaab1b602ac2600876c17f5b4f496", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "427aaab1b602ac2600876c17f5b4f496");
        } else {
            this.position = -1;
        }
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84e90fda0bac7a23f3fd9588152fe256", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84e90fda0bac7a23f3fd9588152fe256")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GrayViewWrapper grayViewWrapper = (GrayViewWrapper) obj;
        return this.viewType == grayViewWrapper.viewType && this.viewLevel == grayViewWrapper.viewLevel && this.isGray == grayViewWrapper.isGray && this.position == grayViewWrapper.position && this.view.equals(grayViewWrapper.view);
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6fa27b4d85e94f0cd5324b16e0dcaa59", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6fa27b4d85e94f0cd5324b16e0dcaa59")).intValue() : Objects.hash(Integer.valueOf(this.viewType), Integer.valueOf(this.viewLevel), Boolean.valueOf(this.isGray), this.view, Integer.valueOf(this.position));
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3981a5386584691fba3ad3024de4b42", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3981a5386584691fba3ad3024de4b42");
        }
        return "GrayViewWrapper{viewType=" + this.viewType + ", viewLevel=" + this.viewLevel + ", isGray=" + this.isGray + ", view=" + this.view + ", position=" + this.position + '}';
    }

    public boolean shouldSetGray(HomeGrayModel.PositionsDTO.ResourcesDTO.ConfigDTO configDTO, Map<String, Integer> map) {
        Object[] objArr = {configDTO, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52e926b1e0a61af5d1141c1fcdafc03e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52e926b1e0a61af5d1141c1fcdafc03e")).booleanValue();
        }
        if (configDTO == null) {
            return false;
        }
        switch (configDTO.getGrayLevel()) {
            case 1:
                return this.viewLevel == 1;
            case 2:
                return this.viewLevel == 2;
            case 3:
                return handleFeedScreenGray(configDTO, map);
            case 4:
                return handleRcmdGray(configDTO, map);
            default:
                return false;
        }
    }

    private boolean handleFeedScreenGray(HomeGrayModel.PositionsDTO.ResourcesDTO.ConfigDTO configDTO, Map<String, Integer> map) {
        Object[] objArr = {configDTO, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d796049330be71b76ceffdbe2bfceb5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d796049330be71b76ceffdbe2bfceb5")).booleanValue();
        }
        if (this.viewType == 4 || this.viewLevel == 4) {
            return true;
        }
        return this.viewLevel == 3 && this.position != -1 && this.position < configDTO.getHomeFeedsGraynessCardCount();
    }

    private boolean handleRcmdGray(HomeGrayModel.PositionsDTO.ResourcesDTO.ConfigDTO configDTO, Map<String, Integer> map) {
        Object[] objArr = {configDTO, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59c32c60bf6a4ca69f2bfec5a14ae0a0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59c32c60bf6a4ca69f2bfec5a14ae0a0")).booleanValue();
        }
        if (this.viewType == 4) {
            return true;
        }
        if (configDTO.getHomeRcmdBoardGraynessRange() == 4) {
            return this.viewLevel == 4;
        } else if (configDTO.getHomeRcmdBoardGraynessRange() == 3 && map != null) {
            if (map.containsKey("wm_home_head_poi_category")) {
                return this.viewLevel == 4 && this.position != -1 && this.position <= map.get("wm_home_head_poi_category").intValue();
            }
            return this.viewLevel == 4 && this.position != -1;
        } else if (configDTO.getHomeRcmdBoardGraynessRange() == 2 && map != null) {
            if (map.containsKey("wm_home_head_poi_category")) {
                return this.viewLevel == 4 && this.position != -1 && this.position < map.get("wm_home_head_poi_category").intValue();
            }
            return this.viewLevel == 4 && this.position != -1;
        } else if (configDTO.getHomeRcmdBoardGraynessRange() != 1 || map == null) {
            return false;
        } else {
            if (map.containsKey("wm_home_head_hot_search")) {
                return this.viewLevel == 4 && this.position != -1 && this.position <= map.get("wm_home_head_hot_search").intValue();
            }
            return this.viewLevel == 4 && this.position == 0;
        }
    }
}
