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
public class Group implements Parcelable, b {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("modules")
    public ModuleItem[] modules;
    public static final c<Group> DECODER = new c<Group>() { // from class: com.dianping.eunomia.model.models.Group.1
        public static ChangeQuickRedirect a;

        @Override // com.dianping.archive.c
        public final /* synthetic */ Group a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "477c64243fffe232bfa0f852e5c82021", RobustBitConfig.DEFAULT_VALUE)) {
                return (Group) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "477c64243fffe232bfa0f852e5c82021");
            }
            if (i == 577) {
                return new Group();
            }
            return null;
        }

        @Override // com.dianping.archive.c
        public final /* bridge */ /* synthetic */ Group[] b(int i) {
            return new Group[i];
        }
    };
    public static final Parcelable.Creator<Group> CREATOR = new Parcelable.Creator<Group>() { // from class: com.dianping.eunomia.model.models.Group.2
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Group createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d00fdc3a6a73c3796f6482c5321ca9e8", RobustBitConfig.DEFAULT_VALUE) ? (Group) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d00fdc3a6a73c3796f6482c5321ca9e8") : new Group(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Group[] newArray(int i) {
            return new Group[i];
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d132aeb84f7a5fb43be0cfae70a1f82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d132aeb84f7a5fb43be0cfae70a1f82");
            return;
        }
        while (true) {
            int g = eVar.g();
            if (g <= 0) {
                return;
            }
            if (g == 28334) {
                this.modules = (ModuleItem[]) eVar.b(ModuleItem.DECODER);
            } else {
                eVar.f();
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6fbe77642555127f6d21bf5a1d4bb090", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6fbe77642555127f6d21bf5a1d4bb090");
            return;
        }
        parcel.writeInt(28334);
        parcel.writeTypedArray(this.modules, i);
        parcel.writeInt(-1);
    }

    public Group() {
    }

    public Group(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a49edb740c85509aa798e79eb764ff15", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a49edb740c85509aa798e79eb764ff15");
            return;
        }
        while (true) {
            int readInt = parcel.readInt();
            if (readInt == -1) {
                return;
            }
            if (readInt == 28334) {
                this.modules = (ModuleItem[]) parcel.createTypedArray(ModuleItem.CREATOR);
            }
        }
    }

    public static DPObject[] toDPObjectArray(Group[] groupArr) {
        Object[] objArr = {groupArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f3b785d9d5e08e30a3648af06d6f3725", RobustBitConfig.DEFAULT_VALUE)) {
            return (DPObject[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f3b785d9d5e08e30a3648af06d6f3725");
        }
        if (groupArr == null || groupArr.length <= 0) {
            return null;
        }
        DPObject[] dPObjectArr = new DPObject[groupArr.length];
        int length = groupArr.length;
        for (int i = 0; i < length; i++) {
            if (groupArr[i] != null) {
                dPObjectArr[i] = groupArr[i].toDPObject();
            } else {
                dPObjectArr[i] = null;
            }
        }
        return dPObjectArr;
    }

    public DPObject toDPObject() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6803b0c3c3de643f0760a17a3a97bb21", RobustBitConfig.DEFAULT_VALUE) ? (DPObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6803b0c3c3de643f0760a17a3a97bb21") : new DPObject("Group").b().a("modules", ModuleItem.toDPObjectArray(this.modules)).a();
    }

    public String toJson() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3bca50a84ea4f955005f64d1a4cc88e2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3bca50a84ea4f955005f64d1a4cc88e2") : new Gson().toJson(this);
    }
}
