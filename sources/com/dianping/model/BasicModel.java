package com.dianping.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.dianping.archive.b;
import com.dianping.archive.e;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class BasicModel implements Parcelable, b {
    public static final Parcelable.Creator<BasicModel> CREATOR = new Parcelable.Creator<BasicModel>() { // from class: com.dianping.model.BasicModel.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BasicModel createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0711e926b338ea6f17db06d597e59809", RobustBitConfig.DEFAULT_VALUE) ? (BasicModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0711e926b338ea6f17db06d597e59809") : new BasicModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ BasicModel[] newArray(int i) {
            return new BasicModel[i];
        }
    };
    public static ChangeQuickRedirect a;
    @SerializedName("isPresent")
    public boolean b;

    @Override // com.dianping.archive.b
    public void decode(e eVar) throws com.dianping.archive.a {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }

    public BasicModel(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13349386499d3d3b39dcebda7ec6ffd4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13349386499d3d3b39dcebda7ec6ffd4");
        }
    }

    public BasicModel() {
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c6ed4dd1264664cade09fdce21d8d00", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c6ed4dd1264664cade09fdce21d8d00") : new Gson().toJson(this);
    }
}
