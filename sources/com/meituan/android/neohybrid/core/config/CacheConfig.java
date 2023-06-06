package com.meituan.android.neohybrid.core.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.android.neohybrid.util.bean.BaseConfig;
import com.meituan.android.neohybrid.util.bean.Bean;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class CacheConfig extends BaseConfig {
    public static final Parcelable.Creator<CacheConfig> CREATOR = new Parcelable.Creator<CacheConfig>() { // from class: com.meituan.android.neohybrid.core.config.CacheConfig.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CacheConfig createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b3810d57088835906308fb4b9ba2523", RobustBitConfig.DEFAULT_VALUE) ? (CacheConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b3810d57088835906308fb4b9ba2523") : new CacheConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CacheConfig[] newArray(int i) {
            return new CacheConfig[i];
        }
    };
    public static final String NEO_CLEAR_CACHE = "clear_cache";
    public static final String NEO_DISABLE_CACHE = "disable_cache";
    public static ChangeQuickRedirect changeQuickRedirect;
    @Bean(defNumBool = 0, value = NEO_CLEAR_CACHE)
    private boolean clearCache;
    @Bean(defNumBool = 0, value = NEO_DISABLE_CACHE)
    private boolean disableCache;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CacheConfig() {
    }

    public CacheConfig(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c30d0717828986e4addf452ea98e797", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c30d0717828986e4addf452ea98e797");
            return;
        }
        this.disableCache = parcel.readByte() != 0;
        this.clearCache = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85bf63204b97717bd417c5ddd6d1777b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85bf63204b97717bd417c5ddd6d1777b");
            return;
        }
        parcel.writeByte(this.disableCache ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.clearCache ? (byte) 1 : (byte) 0);
    }

    public boolean isDisableCache() {
        return this.disableCache;
    }

    public void setDisableCache(boolean z) {
        this.disableCache = z;
    }

    public boolean isClearCache() {
        return this.clearCache;
    }

    public void setClearCache(boolean z) {
        this.clearCache = z;
    }
}
