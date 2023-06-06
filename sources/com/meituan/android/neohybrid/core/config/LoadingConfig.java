package com.meituan.android.neohybrid.core.config;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.LayoutRes;
import com.meituan.android.neohybrid.util.bean.BaseConfig;
import com.meituan.android.neohybrid.util.bean.Bean;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class LoadingConfig extends BaseConfig {
    public static final Parcelable.Creator<LoadingConfig> CREATOR = new Parcelable.Creator<LoadingConfig>() { // from class: com.meituan.android.neohybrid.core.config.LoadingConfig.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LoadingConfig createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc74378ee44819ad249f7ce615885735", RobustBitConfig.DEFAULT_VALUE) ? (LoadingConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc74378ee44819ad249f7ce615885735") : new LoadingConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LoadingConfig[] newArray(int i) {
            return new LoadingConfig[i];
        }
    };
    public static final String LOADING_CANCELABLE = "loading_cancelable";
    public static final String LOADING_CANCEL_OUTSIDE = "loading_cancel_outside";
    public static final String LOADING_DURATION = "loading_duration";
    public static final String LOADING_ENABLED = "enable_loading";
    public static final String LOADING_FORCED_DURATION = "loading_forced_duration";
    public static final String LOADING_LAYOUT_ID = "loading_layout_id";
    public static final String LOADING_NO_VIEW = "loading_no_view";
    public static ChangeQuickRedirect changeQuickRedirect;
    @Bean(defNumBool = 0, value = LOADING_CANCEL_OUTSIDE)
    private boolean loadingCancelOutside;
    @Bean(defNumBool = 0, value = LOADING_CANCELABLE)
    private boolean loadingCancelable;
    @Bean(LOADING_DURATION)
    private long loadingDuration;
    @Bean(defNumBool = 0, value = LOADING_ENABLED)
    private boolean loadingEnabled;
    @Bean(LOADING_FORCED_DURATION)
    private long loadingForcedDuration;
    @LayoutRes
    @Bean(LOADING_LAYOUT_ID)
    private int loadingLayoutId;
    @Bean(defNumBool = 0, value = LOADING_NO_VIEW)
    private boolean loadingNoView;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LoadingConfig() {
    }

    public LoadingConfig(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d77a19d295899323ce477c9a89fabad2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d77a19d295899323ce477c9a89fabad2");
            return;
        }
        this.loadingEnabled = parcel.readByte() != 0;
        this.loadingDuration = parcel.readLong();
        this.loadingForcedDuration = parcel.readLong();
        this.loadingLayoutId = parcel.readInt();
        this.loadingCancelable = parcel.readByte() != 0;
        this.loadingCancelOutside = parcel.readByte() != 0;
        this.loadingNoView = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "83fcb759011ec9181c55e310e3f56291", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "83fcb759011ec9181c55e310e3f56291");
            return;
        }
        parcel.writeByte(this.loadingEnabled ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.loadingDuration);
        parcel.writeLong(this.loadingForcedDuration);
        parcel.writeInt(this.loadingLayoutId);
        parcel.writeByte(this.loadingCancelable ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.loadingCancelOutside ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.loadingNoView ? (byte) 1 : (byte) 0);
    }

    public boolean isLoadingEnabled() {
        return this.loadingEnabled;
    }

    public void setLoadingEnabled(boolean z) {
        this.loadingEnabled = z;
    }

    public long getLoadingDuration() {
        return this.loadingDuration;
    }

    public void setLoadingDuration(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9a0672cc3aec170379e37f44ad7e468", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9a0672cc3aec170379e37f44ad7e468");
        } else {
            this.loadingDuration = j;
        }
    }

    public long getLoadingForcedDuration() {
        return this.loadingForcedDuration;
    }

    public void setLoadingForcedDuration(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf538b5156d0bfd997f90f6843e2b211", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf538b5156d0bfd997f90f6843e2b211");
        } else {
            this.loadingForcedDuration = j;
        }
    }

    public int getLoadingLayoutId() {
        return this.loadingLayoutId;
    }

    public void setLoadingLayoutId(int i) {
        this.loadingLayoutId = i;
    }

    public boolean isLoadingCancelable() {
        return this.loadingCancelable;
    }

    public void setLoadingCancelable(boolean z) {
        this.loadingCancelable = z;
    }

    public boolean isLoadingCancelOutside() {
        return this.loadingCancelOutside;
    }

    public void setLoadingCancelOutside(boolean z) {
        this.loadingCancelOutside = z;
    }

    public boolean isLoadingNoView() {
        return this.loadingNoView;
    }

    public void setLoadingNoView(boolean z) {
        this.loadingNoView = z;
    }
}
