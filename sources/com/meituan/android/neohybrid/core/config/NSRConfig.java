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
public class NSRConfig extends BaseConfig {
    public static final Parcelable.Creator<NSRConfig> CREATOR = new Parcelable.Creator<NSRConfig>() { // from class: com.meituan.android.neohybrid.core.config.NSRConfig.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ NSRConfig createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ae1d40548fe682ffaeafdf90e8e4387", RobustBitConfig.DEFAULT_VALUE) ? (NSRConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ae1d40548fe682ffaeafdf90e8e4387") : new NSRConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ NSRConfig[] newArray(int i) {
            return new NSRConfig[i];
        }
    };
    public static final String NEO_NSR_DELAY = "nsr_delay";
    public static final String NEO_NSR_UNFINISHED_USED = "nsr_unfinished_used";
    public static final String NEO_NSR_URL = "nsr_url";
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isIdleExecute;
    @Bean(NEO_NSR_DELAY)
    private long nsrDelay;
    private long nsrExpireTime;
    @Bean(NEO_NSR_UNFINISHED_USED)
    private boolean nsrUnfinishedUsedEnabled;
    @Bean(NEO_NSR_URL)
    private String nsrUrl;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public NSRConfig() {
    }

    public NSRConfig(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "222dade09da3a90d6ee1e7dad63d2daa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "222dade09da3a90d6ee1e7dad63d2daa");
            return;
        }
        this.nsrUrl = parcel.readString();
        this.nsrDelay = parcel.readLong();
        this.nsrExpireTime = parcel.readLong();
        this.nsrUnfinishedUsedEnabled = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aacc3a9b5d0d01b3e5bd8dd5eb1b595b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aacc3a9b5d0d01b3e5bd8dd5eb1b595b");
            return;
        }
        parcel.writeString(this.nsrUrl);
        parcel.writeLong(this.nsrDelay);
        parcel.writeLong(this.nsrExpireTime);
        parcel.writeByte(this.nsrUnfinishedUsedEnabled ? (byte) 1 : (byte) 0);
    }

    public String getNsrUrl() {
        return this.nsrUrl;
    }

    public void setNsrUrl(String str) {
        this.nsrUrl = str;
    }

    public long getNsrDelay() {
        return this.nsrDelay;
    }

    public void setNsrDelay(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78d9f6da9abc0f29b02adf938f6a4228", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78d9f6da9abc0f29b02adf938f6a4228");
        } else {
            this.nsrDelay = j;
        }
    }

    public long getNsrExpireTime() {
        return this.nsrExpireTime;
    }

    public void setNsrExpireTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dba7b3e2b03a1898f4088a0c583085b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dba7b3e2b03a1898f4088a0c583085b3");
        } else {
            this.nsrExpireTime = j;
        }
    }

    public boolean isNsrUnfinishedUsedEnabled() {
        return this.nsrUnfinishedUsedEnabled;
    }

    public void setNsrUnfinishedUsedEnabled(boolean z) {
        this.nsrUnfinishedUsedEnabled = z;
    }

    public boolean isLegal() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c65f62df7ffa395ef97240ccf4ffca40", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c65f62df7ffa395ef97240ccf4ffca40")).booleanValue() : !TextUtils.isEmpty(this.nsrUrl) && this.nsrDelay >= 0 && this.nsrExpireTime >= 0;
    }

    public boolean isIdleExecute() {
        return this.isIdleExecute;
    }

    public void setIdleExecute(boolean z) {
        this.isIdleExecute = z;
    }
}
