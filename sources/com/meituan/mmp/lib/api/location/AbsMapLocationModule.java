package com.meituan.mmp.lib.api.location;

import com.meituan.mmp.lib.api.ApiFunction;
import com.meituan.mmp.lib.api.Empty;
import com.meituan.mmp.main.annotation.Required;
import com.meituan.mmp.main.d;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class AbsMapLocationModule {

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class AbsChooseLocation extends ApiFunction<ChooseLocationParams, LocationParams> {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class AbsOpenLocation extends ApiFunction<OpenLocationParams, Empty> {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class AbsOpenPOILocation extends ApiFunction<OpenPOILocationParams, Empty> {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class ChooseLocationParams implements d {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String latitude;
        public String longitude;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class LocationParams implements d {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String address;
        @Required
        public double latitude;
        @Required
        public double longitude;
        public String name;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class OpenLocationParams extends LocationParams {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int scale = 18;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class OpenPOILocationParams implements d {
        public static ChangeQuickRedirect changeQuickRedirect;
        @Required
        public double latitude;
        @Required
        public double longitude;
        @Required
        public String poiId;
        public String overseas = "0";
        public int scale = 14;
    }
}
