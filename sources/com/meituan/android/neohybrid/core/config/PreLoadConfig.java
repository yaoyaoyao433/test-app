package com.meituan.android.neohybrid.core.config;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.meituan.android.neohybrid.util.bean.BaseConfig;
import com.meituan.android.neohybrid.util.bean.Bean;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class PreLoadConfig extends BaseConfig {
    public static final Parcelable.Creator<PreLoadConfig> CREATOR = new Parcelable.Creator<PreLoadConfig>() { // from class: com.meituan.android.neohybrid.core.config.PreLoadConfig.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PreLoadConfig createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47490cc3d1ff4c1f7f1f9ff9269b08ef", RobustBitConfig.DEFAULT_VALUE) ? (PreLoadConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47490cc3d1ff4c1f7f1f9ff9269b08ef") : new PreLoadConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PreLoadConfig[] newArray(int i) {
            return new PreLoadConfig[i];
        }
    };
    public static final String PRELOAD_DELAY = "preload_delay";
    public static final String PRELOAD_URL = "preload_url";
    public static ChangeQuickRedirect changeQuickRedirect;
    @Bean(PRELOAD_DELAY)
    private long preloadDelay;
    @Bean(PRELOAD_URL)
    private String preloadUrl;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public PreLoadConfig() {
    }

    public PreLoadConfig(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a9eaa69a1e958d5a0580a6432581aa7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a9eaa69a1e958d5a0580a6432581aa7");
            return;
        }
        this.preloadUrl = parcel.readString();
        this.preloadDelay = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "20e70e9d68521c01e7b02f6161f1d90f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "20e70e9d68521c01e7b02f6161f1d90f");
            return;
        }
        parcel.writeString(this.preloadUrl);
        parcel.writeLong(this.preloadDelay);
    }

    public String getPreloadUrl() {
        return this.preloadUrl;
    }

    public void setPreloadUrl(String str) {
        this.preloadUrl = str;
    }

    public long getPreloadDelay() {
        return this.preloadDelay;
    }

    public void setPreloadDelay(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f23629e55c119615fd788fbefb589b70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f23629e55c119615fd788fbefb589b70");
        } else {
            this.preloadDelay = j;
        }
    }

    public boolean isLegal() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba4b9a1f443106322b87c5a5e613f4cc", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba4b9a1f443106322b87c5a5e613f4cc")).booleanValue() : !TextUtils.isEmpty(this.preloadUrl) && this.preloadDelay >= 0;
    }
}
