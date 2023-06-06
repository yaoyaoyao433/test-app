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
public class KernelConfig extends BaseConfig {
    public static final String CONTAINER_TYPE_KNB = "knb";
    public static final String CONTAINER_TYPE_NEO = "neo";
    public static final Parcelable.Creator<KernelConfig> CREATOR = new Parcelable.Creator<KernelConfig>() { // from class: com.meituan.android.neohybrid.core.config.KernelConfig.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ KernelConfig createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ed1067189c391379868042e4d64fcfa", RobustBitConfig.DEFAULT_VALUE) ? (KernelConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ed1067189c391379868042e4d64fcfa") : new KernelConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ KernelConfig[] newArray(int i) {
            return new KernelConfig[i];
        }
    };
    public static final String KERNEL_SOURCE_DIRECT = "direct";
    public static final String KERNEL_SOURCE_OFFLINE_DOWNGRADE = "offline_downgrade";
    public static final String KERNEL_TYPE_RECCE = "recce";
    public static final String KERNEL_TYPE_WEBVIEW = "webview";
    public static final String KEY_CONTAINER_TYPE = "container_type";
    public static final String KEY_KERNEL_SOURCE = "kernel_source";
    public static final String KEY_KERNEL_TYPE = "kernel_type";
    public static ChangeQuickRedirect changeQuickRedirect;
    @Bean(KEY_CONTAINER_TYPE)
    private String containerType;
    @Bean(KEY_KERNEL_SOURCE)
    private String kernelSource;
    @Bean(KEY_KERNEL_TYPE)
    private String kernelType;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public KernelConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2cc171bb128307fcddf02f2085e6810d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2cc171bb128307fcddf02f2085e6810d");
            return;
        }
        this.containerType = "knb";
        this.kernelType = "webview";
        this.kernelSource = KERNEL_SOURCE_DIRECT;
    }

    public KernelConfig(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3bd14ebe62bee7e4b197fcc7e4f9a4e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3bd14ebe62bee7e4b197fcc7e4f9a4e8");
            return;
        }
        this.containerType = "knb";
        this.kernelType = "webview";
        this.kernelSource = KERNEL_SOURCE_DIRECT;
        this.containerType = parcel.readString();
        this.kernelType = parcel.readString();
        this.kernelSource = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d83054637bff38a9bc48e3e96b7bf02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d83054637bff38a9bc48e3e96b7bf02");
            return;
        }
        parcel.writeString(this.containerType);
        parcel.writeString(this.kernelType);
        parcel.writeString(this.kernelSource);
    }

    public String getContainerType() {
        return this.containerType;
    }

    public void setContainerType(String str) {
        this.containerType = str;
    }

    public String getKernelType() {
        return this.kernelType;
    }

    public void setKernelType(String str) {
        this.kernelType = str;
    }

    public String getKernelSource() {
        return this.kernelSource;
    }

    public void setKernelSource(String str) {
        this.kernelSource = str;
    }
}
