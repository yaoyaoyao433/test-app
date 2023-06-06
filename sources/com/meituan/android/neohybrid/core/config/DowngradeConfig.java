package com.meituan.android.neohybrid.core.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.android.neohybrid.util.bean.BaseConfig;
import com.meituan.android.neohybrid.util.bean.Bean;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class DowngradeConfig extends BaseConfig {
    public static final Parcelable.Creator<DowngradeConfig> CREATOR = new Parcelable.Creator<DowngradeConfig>() { // from class: com.meituan.android.neohybrid.core.config.DowngradeConfig.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DowngradeConfig createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df1189296f968805338fab9b0221a1c0", RobustBitConfig.DEFAULT_VALUE) ? (DowngradeConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df1189296f968805338fab9b0221a1c0") : new DowngradeConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DowngradeConfig[] newArray(int i) {
            return new DowngradeConfig[i];
        }
    };
    public static final String LOADING_CANCEL_DOWNGRADE = "d_loadingcancel";
    public static final String LOADING_TIMEOUT_DOWNGRADE = "d_loadingtimeout";
    public static final String NO_RESPONSE_TIME = "d_noresponsetime";
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<List<String>> enableChromeVersion;
    @Bean(defNumBool = 0, value = LOADING_CANCEL_DOWNGRADE)
    private boolean loadingCancel;
    @Bean(defNumBool = 0, value = LOADING_TIMEOUT_DOWNGRADE)
    private boolean loadingTimeout;
    @Bean(NO_RESPONSE_TIME)
    private long noResponseTime;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public DowngradeConfig() {
    }

    public DowngradeConfig(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2151ce7f025ff6f4780919815967473", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2151ce7f025ff6f4780919815967473");
            return;
        }
        this.noResponseTime = parcel.readLong();
        this.loadingCancel = parcel.readByte() != 0;
        this.loadingTimeout = parcel.readByte() != 0;
        this.enableChromeVersion = new ArrayList();
        parcel.readList(this.enableChromeVersion, List.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c199799b5eb454d0251d173a856b110", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c199799b5eb454d0251d173a856b110");
            return;
        }
        parcel.writeLong(this.noResponseTime);
        parcel.writeByte(this.loadingCancel ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.loadingTimeout ? (byte) 1 : (byte) 0);
        parcel.writeList(this.enableChromeVersion);
    }

    public long getNoResponseTime() {
        return this.noResponseTime;
    }

    public void setNoResponseTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88e351e4e1cdcda7165f1ba6e9e46833", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88e351e4e1cdcda7165f1ba6e9e46833");
        } else {
            this.noResponseTime = j;
        }
    }

    public boolean isLoadingCancel() {
        return this.loadingCancel;
    }

    public void setLoadingCancel(boolean z) {
        this.loadingCancel = z;
    }

    public boolean isLoadingTimeout() {
        return this.loadingTimeout;
    }

    public void setLoadingTimeout(boolean z) {
        this.loadingTimeout = z;
    }

    public List<List<String>> getEnableChromeVersion() {
        return this.enableChromeVersion;
    }

    public void setEnableChromeVersion(List<List<String>> list) {
        this.enableChromeVersion = list;
    }
}
