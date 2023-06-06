package com.meituan.msi.api.extension.wm.common;

import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class GetGBCityInfoResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    public List<ActualCityInfo> actual_city_info;
    public List<CityInfo> city_info;
    public long location_timestamp;

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    public static class ActualCityInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String admin_code;
        public String admin_level;
        public String level_desc;
        public String name;
    }

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    public static class CityInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String admin_code;
        public String admin_level;
        public String level_desc;
        public String name;
    }
}
