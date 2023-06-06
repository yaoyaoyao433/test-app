package com.dianping.eunomia;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import com.dianping.eunomia.model.models.ModuleConfigResponse;
import com.dianping.eunomia.model.models.SingleClassLoader;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes.dex */
public class ModuleConfigPersist implements Parcelable {
    public static final Parcelable.Creator<ModuleConfigPersist> CREATOR = new Parcelable.Creator<ModuleConfigPersist>() { // from class: com.dianping.eunomia.ModuleConfigPersist.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ModuleConfigPersist createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85938de31622016e3ce256d562b99527", RobustBitConfig.DEFAULT_VALUE) ? (ModuleConfigPersist) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85938de31622016e3ce256d562b99527") : new ModuleConfigPersist(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ModuleConfigPersist[] newArray(int i) {
            return new ModuleConfigPersist[i];
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("appVersion")
    public int appVersion;
    @SerializedName("moduleConfigResponse")
    public ModuleConfigResponse moduleConfigResponse;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "25e15553564cc3157ef05d95dd9c2fc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "25e15553564cc3157ef05d95dd9c2fc9");
            return;
        }
        parcel.writeParcelable(this.moduleConfigResponse, i);
        parcel.writeInt(this.appVersion);
    }

    public ModuleConfigPersist() {
    }

    public ModuleConfigPersist(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e488782ea52c54e183acdb91e8354f32", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e488782ea52c54e183acdb91e8354f32");
            return;
        }
        this.moduleConfigResponse = (ModuleConfigResponse) parcel.readParcelable(new SingleClassLoader(ModuleConfigResponse.class));
        this.appVersion = parcel.readInt();
    }
}
