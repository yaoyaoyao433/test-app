package com.dianping.eunomia.model.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import com.dianping.archive.DPObject;
import com.dianping.archive.a;
import com.dianping.archive.b;
import com.dianping.archive.c;
import com.dianping.archive.e;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.mrn.analytics.library.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes.dex */
public class ExtraProp implements Parcelable, b {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("key")
    public String key;
    @SerializedName(Constants.TagConstants.TAG_VALUE)
    public String val;
    public static final c<ExtraProp> DECODER = new c<ExtraProp>() { // from class: com.dianping.eunomia.model.models.ExtraProp.1
        public static ChangeQuickRedirect a;

        @Override // com.dianping.archive.c
        public final /* synthetic */ ExtraProp a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "04d87dbe4acd1df065ac78fbb2ef5ab3", RobustBitConfig.DEFAULT_VALUE)) {
                return (ExtraProp) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "04d87dbe4acd1df065ac78fbb2ef5ab3");
            }
            if (i == 11044) {
                return new ExtraProp();
            }
            return null;
        }

        @Override // com.dianping.archive.c
        public final /* bridge */ /* synthetic */ ExtraProp[] b(int i) {
            return new ExtraProp[i];
        }
    };
    public static final Parcelable.Creator<ExtraProp> CREATOR = new Parcelable.Creator<ExtraProp>() { // from class: com.dianping.eunomia.model.models.ExtraProp.2
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ExtraProp createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f29ac5dee5559234c01a12566c53801", RobustBitConfig.DEFAULT_VALUE) ? (ExtraProp) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f29ac5dee5559234c01a12566c53801") : new ExtraProp(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ExtraProp[] newArray(int i) {
            return new ExtraProp[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.dianping.archive.b
    public void decode(e eVar) throws a {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "653979199ef0c7e21ab911118039785e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "653979199ef0c7e21ab911118039785e");
            return;
        }
        while (true) {
            int g = eVar.g();
            if (g <= 0) {
                return;
            }
            if (g == 40542) {
                this.key = eVar.d();
            } else if (g == 50976) {
                this.val = eVar.d();
            } else {
                eVar.f();
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6776b8489672e1ce878817016da21a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6776b8489672e1ce878817016da21a9");
            return;
        }
        parcel.writeInt(50976);
        parcel.writeString(this.val);
        parcel.writeInt(40542);
        parcel.writeString(this.key);
        parcel.writeInt(-1);
    }

    public ExtraProp() {
    }

    public ExtraProp(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1281a9d6d0221412193e38781aabdc7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1281a9d6d0221412193e38781aabdc7");
            return;
        }
        while (true) {
            int readInt = parcel.readInt();
            if (readInt == -1) {
                return;
            }
            if (readInt == 40542) {
                this.key = parcel.readString();
            } else if (readInt == 50976) {
                this.val = parcel.readString();
            }
        }
    }

    public static DPObject[] toDPObjectArray(ExtraProp[] extraPropArr) {
        Object[] objArr = {extraPropArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "852176f579e49090d04e4dc2cbaebda1", RobustBitConfig.DEFAULT_VALUE)) {
            return (DPObject[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "852176f579e49090d04e4dc2cbaebda1");
        }
        if (extraPropArr == null || extraPropArr.length <= 0) {
            return null;
        }
        DPObject[] dPObjectArr = new DPObject[extraPropArr.length];
        int length = extraPropArr.length;
        for (int i = 0; i < length; i++) {
            if (extraPropArr[i] != null) {
                dPObjectArr[i] = extraPropArr[i].toDPObject();
            } else {
                dPObjectArr[i] = null;
            }
        }
        return dPObjectArr;
    }

    public DPObject toDPObject() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5b83ba8e25f36fc456d5af5a52cbdfe", RobustBitConfig.DEFAULT_VALUE) ? (DPObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5b83ba8e25f36fc456d5af5a52cbdfe") : new DPObject("ExtraProp").b().a(Constants.TagConstants.TAG_VALUE, this.val).a("key", this.key).a();
    }

    public String toJson() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "713bdde85dc39da71d5f896eb058570e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "713bdde85dc39da71d5f896eb058570e") : new Gson().toJson(this);
    }
}
