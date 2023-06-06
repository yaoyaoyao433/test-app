package com.meituan.android.neohybrid.core.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.android.neohybrid.util.bean.BaseConfig;
import com.meituan.android.neohybrid.util.bean.Bean;
import com.meituan.android.pay.common.promotion.bean.PayLabelConstants;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class BreatheConfig extends BaseConfig {
    public static final Parcelable.Creator<BreatheConfig> CREATOR = new Parcelable.Creator<BreatheConfig>() { // from class: com.meituan.android.neohybrid.core.config.BreatheConfig.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BreatheConfig createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a315a3cadae44a4edb10d5ea0cc020e", RobustBitConfig.DEFAULT_VALUE) ? (BreatheConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a315a3cadae44a4edb10d5ea0cc020e") : new BreatheConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ BreatheConfig[] newArray(int i) {
            return new BreatheConfig[i];
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    @Bean("breathe_death_options")
    private String breatheDeathOptions;
    @Bean("breathe_delaymillis")
    private long breatheDelayMillis;
    @Bean("breathe_interval_timemillis")
    private long breatheIntervalTimeMillis;
    @Bean("breathe_timeoutmillis")
    private long breatheTimeoutMillis;
    @Bean("breathe_unresponsive_times_as_broken")
    private int breatheUnresponsiveTimesAsBroken;
    @Bean(defNumBool = 0, value = "enable_check_dom_count")
    private boolean enableCheckDomCount;
    @Bean(defNumBool = 0, value = "enable_neo_breathe")
    private boolean enableNeoBreathe;
    @Bean(defNumBool = 0, value = "enable_pixel_color")
    private boolean enablePixelColor;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public BreatheConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ebc3b6d6ef77ddad3699fc97b81d8d3e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ebc3b6d6ef77ddad3699fc97b81d8d3e");
            return;
        }
        this.enableNeoBreathe = false;
        this.enablePixelColor = false;
        this.enableCheckDomCount = false;
        this.breatheUnresponsiveTimesAsBroken = 2;
        this.breatheIntervalTimeMillis = ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE;
        this.breatheDelayMillis = 100L;
        this.breatheTimeoutMillis = ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE;
        this.breatheDeathOptions = PayLabelConstants.KEY_LABEL_CHECK;
    }

    public BreatheConfig(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4299dd2543f42d9581557661f56c78a7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4299dd2543f42d9581557661f56c78a7");
            return;
        }
        this.enableNeoBreathe = false;
        this.enablePixelColor = false;
        this.enableCheckDomCount = false;
        this.breatheUnresponsiveTimesAsBroken = 2;
        this.breatheIntervalTimeMillis = ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE;
        this.breatheDelayMillis = 100L;
        this.breatheTimeoutMillis = ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE;
        this.breatheDeathOptions = PayLabelConstants.KEY_LABEL_CHECK;
        this.enableNeoBreathe = parcel.readByte() != 0;
        this.enablePixelColor = parcel.readByte() != 0;
        this.enableCheckDomCount = parcel.readByte() != 0;
        this.breatheUnresponsiveTimesAsBroken = parcel.readInt();
        this.breatheIntervalTimeMillis = parcel.readLong();
        this.breatheDelayMillis = parcel.readLong();
        this.breatheTimeoutMillis = parcel.readLong();
        this.breatheDeathOptions = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a4770ed3e7763abaccee6336c1d680c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a4770ed3e7763abaccee6336c1d680c");
            return;
        }
        parcel.writeByte(this.enableNeoBreathe ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.enablePixelColor ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.enableCheckDomCount ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.breatheUnresponsiveTimesAsBroken);
        parcel.writeLong(this.breatheIntervalTimeMillis);
        parcel.writeLong(this.breatheDelayMillis);
        parcel.writeLong(this.breatheTimeoutMillis);
        parcel.writeString(this.breatheDeathOptions);
    }

    public boolean isEnableNeoBreathe() {
        return this.enableNeoBreathe;
    }

    public void setEnableNeoBreathe(boolean z) {
        this.enableNeoBreathe = z;
    }

    public boolean isEnablePixelColor() {
        return this.enablePixelColor;
    }

    public void setEnablePixelColor(boolean z) {
        this.enablePixelColor = z;
    }

    public int getBreatheUnresponsiveTimesAsBroken() {
        return this.breatheUnresponsiveTimesAsBroken;
    }

    public void setBreatheUnresponsiveTimesAsBroken(int i) {
        this.breatheUnresponsiveTimesAsBroken = i;
    }

    public long getBreatheIntervalTimeMillis() {
        return this.breatheIntervalTimeMillis;
    }

    public void setBreatheIntervalTimeMillis(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81793fd6059db49f157e2c4d176f88b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81793fd6059db49f157e2c4d176f88b8");
        } else {
            this.breatheIntervalTimeMillis = j;
        }
    }

    public long getBreatheDelayMillis() {
        return this.breatheDelayMillis;
    }

    public void setBreatheDelayMillis(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dfa91894f4924d7abe19d88a00a6beae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dfa91894f4924d7abe19d88a00a6beae");
        } else {
            this.breatheDelayMillis = j;
        }
    }

    public long getBreatheTimeoutMillis() {
        return this.breatheTimeoutMillis;
    }

    public void setBreatheTimeoutMillis(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4646c167b3bd743b38d91da7c0389ad0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4646c167b3bd743b38d91da7c0389ad0");
        } else {
            this.breatheTimeoutMillis = j;
        }
    }

    public String getBreatheDeathOptions() {
        return this.breatheDeathOptions;
    }

    public void setBreatheDeathOptions(String str) {
        this.breatheDeathOptions = str;
    }

    public boolean isEnableCheckDomCount() {
        return this.enableCheckDomCount;
    }

    public void setEnableCheckDomCount(boolean z) {
        this.enableCheckDomCount = z;
    }
}
