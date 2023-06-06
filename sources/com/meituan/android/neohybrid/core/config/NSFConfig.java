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
import java.util.Map;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class NSFConfig extends BaseConfig {
    public static final Parcelable.Creator<NSFConfig> CREATOR = new Parcelable.Creator<NSFConfig>() { // from class: com.meituan.android.neohybrid.core.config.NSFConfig.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ NSFConfig createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "151baf2617d5cca58589375f2c9f9cc4", RobustBitConfig.DEFAULT_VALUE) ? (NSFConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "151baf2617d5cca58589375f2c9f9cc4") : new NSFConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ NSFConfig[] newArray(int i) {
            return new NSFConfig[i];
        }
    };
    public static final String NEO_NSF = "nsf";
    public static ChangeQuickRedirect changeQuickRedirect;
    @Bean(NEO_NSF)
    private String nsf;
    private Map<String, Object> nsfParams;
    private boolean nsfSaved;
    private transient String predata;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public NSFConfig() {
    }

    public NSFConfig(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4bd3de2ca8ee8d24f60899d8f0f88fa7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4bd3de2ca8ee8d24f60899d8f0f88fa7");
            return;
        }
        this.nsf = parcel.readString();
        this.nsfParams = parcel.readHashMap(getClass().getClassLoader());
        this.nsfSaved = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46751720a845aef438ff866f59a9f04a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46751720a845aef438ff866f59a9f04a");
            return;
        }
        parcel.writeString(this.nsf);
        parcel.writeMap(this.nsfParams);
        parcel.writeByte(this.nsfSaved ? (byte) 1 : (byte) 0);
    }

    public String getNsf() {
        return this.nsf;
    }

    public void setNsf(String str) {
        this.nsf = str;
    }

    public Map<String, Object> getNsfParams() {
        return this.nsfParams;
    }

    public void setNsfParams(Map<String, Object> map) {
        this.nsfParams = map;
    }

    public String getPredata() {
        return this.predata;
    }

    public void setPredata(String str) {
        this.predata = str;
    }

    public boolean isNSF() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "79cfbbda078003ac8f92c14feb67faff", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "79cfbbda078003ac8f92c14feb67faff")).booleanValue() : !TextUtils.isEmpty(this.nsf);
    }

    public boolean isNsfSaved() {
        return this.nsfSaved;
    }

    public void setNsfSaved(boolean z) {
        this.nsfSaved = z;
    }
}
