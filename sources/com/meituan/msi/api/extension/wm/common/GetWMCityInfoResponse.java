package com.meituan.msi.api.extension.wm.common;

import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class GetWMCityInfoResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    public List<ActualCityInfo> actual_city_info;
    public List<CityInfo> city_info;

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    public static class ActualCityInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String adcode;
        public String id;
        public int level;
        public String name;
    }

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    public static class CityInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String adcode;
        public String id;
        public int level;
        public String name;
    }
}
