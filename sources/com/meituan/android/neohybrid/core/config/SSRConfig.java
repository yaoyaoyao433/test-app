package com.meituan.android.neohybrid.core.config;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.meituan.android.neohybrid.util.bean.BaseConfig;
import com.meituan.android.neohybrid.util.bean.Bean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SSRConfig extends BaseConfig {
    public static final Parcelable.Creator<SSRConfig> CREATOR = new Parcelable.Creator<SSRConfig>() { // from class: com.meituan.android.neohybrid.core.config.SSRConfig.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SSRConfig createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7754a9b65488b63be657d3f5eff21c7", RobustBitConfig.DEFAULT_VALUE) ? (SSRConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7754a9b65488b63be657d3f5eff21c7") : new SSRConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SSRConfig[] newArray(int i) {
            return new SSRConfig[i];
        }
    };
    public static ChangeQuickRedirect a;
    @Bean("neo_ssr_load_url")
    public String b;
    @Bean("neo_ssr_request_url")
    public String c;
    public Map<String, Object> d;
    public transient String e;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SSRConfig() {
    }

    private SSRConfig(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f97e346e036f2393c2984b53218b5f0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f97e346e036f2393c2984b53218b5f0");
            return;
        }
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readHashMap(getClass().getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "524b4c684680136b0a733b90864b16fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "524b4c684680136b0a733b90864b16fe");
            return;
        }
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeMap(this.d);
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa51e2d0c42cbaf1b2f22c4434a8429f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa51e2d0c42cbaf1b2f22c4434a8429f")).booleanValue() : (TextUtils.isEmpty(this.b) || TextUtils.isEmpty(this.c)) ? false : true;
    }
}
