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
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes.dex */
public class ModuleItem implements Parcelable, b {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("key")
    public String key;
    @SerializedName("pri")
    public int pri;
    public static final c<ModuleItem> DECODER = new c<ModuleItem>() { // from class: com.dianping.eunomia.model.models.ModuleItem.1
        public static ChangeQuickRedirect a;

        @Override // com.dianping.archive.c
        public final /* synthetic */ ModuleItem a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2ce3953696dea0250e6a0d3b35c55e85", RobustBitConfig.DEFAULT_VALUE)) {
                return (ModuleItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2ce3953696dea0250e6a0d3b35c55e85");
            }
            if (i == 6480) {
                return new ModuleItem();
            }
            return null;
        }

        @Override // com.dianping.archive.c
        public final /* bridge */ /* synthetic */ ModuleItem[] b(int i) {
            return new ModuleItem[i];
        }
    };
    public static final Parcelable.Creator<ModuleItem> CREATOR = new Parcelable.Creator<ModuleItem>() { // from class: com.dianping.eunomia.model.models.ModuleItem.2
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ModuleItem createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c16e5bed156811dd911aed40b60a6bc", RobustBitConfig.DEFAULT_VALUE) ? (ModuleItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c16e5bed156811dd911aed40b60a6bc") : new ModuleItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ModuleItem[] newArray(int i) {
            return new ModuleItem[i];
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ff9208be4169f73b994c4661a2da4e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ff9208be4169f73b994c4661a2da4e7");
            return;
        }
        while (true) {
            int g = eVar.g();
            if (g <= 0) {
                return;
            }
            if (g == 40542) {
                this.key = eVar.d();
            } else if (g == 45734) {
                this.pri = eVar.b();
            } else {
                eVar.f();
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7455aef27f916241b6d133523abddd45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7455aef27f916241b6d133523abddd45");
            return;
        }
        parcel.writeInt(40542);
        parcel.writeString(this.key);
        parcel.writeInt(45734);
        parcel.writeInt(this.pri);
        parcel.writeInt(-1);
    }

    public ModuleItem() {
    }

    public ModuleItem(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c6b11d6ec5357712fd91ba8fb414051", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c6b11d6ec5357712fd91ba8fb414051");
            return;
        }
        while (true) {
            int readInt = parcel.readInt();
            if (readInt == -1) {
                return;
            }
            if (readInt == 40542) {
                this.key = parcel.readString();
            } else if (readInt == 45734) {
                this.pri = parcel.readInt();
            }
        }
    }

    public static DPObject[] toDPObjectArray(ModuleItem[] moduleItemArr) {
        Object[] objArr = {moduleItemArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "baf99866b30e17b1b303e89aa3dae45f", RobustBitConfig.DEFAULT_VALUE)) {
            return (DPObject[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "baf99866b30e17b1b303e89aa3dae45f");
        }
        if (moduleItemArr == null || moduleItemArr.length <= 0) {
            return null;
        }
        DPObject[] dPObjectArr = new DPObject[moduleItemArr.length];
        int length = moduleItemArr.length;
        for (int i = 0; i < length; i++) {
            if (moduleItemArr[i] != null) {
                dPObjectArr[i] = moduleItemArr[i].toDPObject();
            } else {
                dPObjectArr[i] = null;
            }
        }
        return dPObjectArr;
    }

    public DPObject toDPObject() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a2945f2dba15f073d37f63df642ce45", RobustBitConfig.DEFAULT_VALUE) ? (DPObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a2945f2dba15f073d37f63df642ce45") : new DPObject("ModuleItem").b().a("key", this.key).a("pri", this.pri).a();
    }

    public String toJson() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ebf916b9752571c42ac9648eae9ef6c6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ebf916b9752571c42ac9648eae9ef6c6") : new Gson().toJson(this);
    }
}
