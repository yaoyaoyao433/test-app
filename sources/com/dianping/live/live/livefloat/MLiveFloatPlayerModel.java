package com.dianping.live.live.livefloat;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class MLiveFloatPlayerModel implements Parcelable {
    public static final Parcelable.Creator<MLiveFloatPlayerModel> CREATOR = new Parcelable.Creator<MLiveFloatPlayerModel>() { // from class: com.dianping.live.live.livefloat.MLiveFloatPlayerModel.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MLiveFloatPlayerModel createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82f9292f378f52467719fc7ca97d7be0", RobustBitConfig.DEFAULT_VALUE) ? (MLiveFloatPlayerModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82f9292f378f52467719fc7ca97d7be0") : new MLiveFloatPlayerModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MLiveFloatPlayerModel[] newArray(int i) {
            return new MLiveFloatPlayerModel[i];
        }
    };
    public static ChangeQuickRedirect a;
    public HashMap b;
    public HashMap c;
    public String d;
    public HashMap e;
    public HashMap f;
    public HashMap g;
    public ArrayList h;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public MLiveFloatPlayerModel(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58be92a53faf7133ba48711b089cb9ab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58be92a53faf7133ba48711b089cb9ab");
            return;
        }
        this.b = parcel.readHashMap(HashMap.class.getClassLoader());
        this.c = parcel.readHashMap(HashMap.class.getClassLoader());
        this.d = parcel.readString();
        this.e = parcel.readHashMap(HashMap.class.getClassLoader());
        this.f = parcel.readHashMap(HashMap.class.getClassLoader());
        this.g = parcel.readHashMap(HashMap.class.getClassLoader());
        this.h = parcel.readArrayList(ArrayList.class.getClassLoader());
    }

    public MLiveFloatPlayerModel() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f053db6537140bac964529a7fa9f39a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f053db6537140bac964529a7fa9f39a4");
            return;
        }
        parcel.writeMap(this.b);
        parcel.writeMap(this.c);
        parcel.writeString(this.d);
        parcel.writeMap(this.e);
        parcel.writeMap(this.f);
        parcel.writeMap(this.g);
        parcel.writeList(this.h);
    }
}
