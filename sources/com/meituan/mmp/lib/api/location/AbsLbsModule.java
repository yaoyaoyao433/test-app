package com.meituan.mmp.lib.api.location;

import android.support.annotation.Nullable;
import com.meituan.mmp.lib.api.ApiFunction;
import com.meituan.mmp.lib.api.Empty;
import com.meituan.mmp.main.d;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class AbsLbsModule {

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class AbsGetSelectedCityInfo extends ApiFunction<Empty, SelectedCityInfo> {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SelectedCityInfo implements d {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String destinationOffset;
        public long id;
        @Nullable
        public Boolean isDomestic;
        @Nullable
        public Boolean isOversea;
        @Nullable
        public Double latitude;
        @Nullable
        public Double longitude;
        public String name;
        public String pinyin;
        public int rawOffset;
        public String standardOffset;
    }
}
