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
public class ModuleConfig implements Parcelable, b {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("extra")
    public ModulesExtra extra;
    @SerializedName("groups")
    public Group[] groups;
    @SerializedName("key")
    public String key;
    public static final c<ModuleConfig> DECODER = new c<ModuleConfig>() { // from class: com.dianping.eunomia.model.models.ModuleConfig.1
        public static ChangeQuickRedirect a;

        @Override // com.dianping.archive.c
        public final /* synthetic */ ModuleConfig a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72229173d668180281a18b790c7e4ec1", RobustBitConfig.DEFAULT_VALUE)) {
                return (ModuleConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72229173d668180281a18b790c7e4ec1");
            }
            if (i == 53993) {
                return new ModuleConfig();
            }
            return null;
        }

        @Override // com.dianping.archive.c
        public final /* bridge */ /* synthetic */ ModuleConfig[] b(int i) {
            return new ModuleConfig[i];
        }
    };
    public static final Parcelable.Creator<ModuleConfig> CREATOR = new Parcelable.Creator<ModuleConfig>() { // from class: com.dianping.eunomia.model.models.ModuleConfig.2
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ModuleConfig createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "978c5e784e6ba61566af31e28e771fb9", RobustBitConfig.DEFAULT_VALUE) ? (ModuleConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "978c5e784e6ba61566af31e28e771fb9") : new ModuleConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ModuleConfig[] newArray(int i) {
            return new ModuleConfig[i];
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5793ef4b99f225d676515a78cee4eab6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5793ef4b99f225d676515a78cee4eab6");
            return;
        }
        while (true) {
            int g = eVar.g();
            if (g <= 0) {
                return;
            }
            if (g == 28649) {
                this.groups = (Group[]) eVar.b(Group.DECODER);
            } else if (g == 37335) {
                this.extra = (ModulesExtra) eVar.a(ModulesExtra.DECODER);
            } else if (g == 40542) {
                this.key = eVar.d();
            } else {
                eVar.f();
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68eaedb380b9130f002aca56922f5bec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68eaedb380b9130f002aca56922f5bec");
            return;
        }
        parcel.writeInt(37335);
        parcel.writeParcelable(this.extra, i);
        parcel.writeInt(28649);
        parcel.writeTypedArray(this.groups, i);
        parcel.writeInt(40542);
        parcel.writeString(this.key);
        parcel.writeInt(-1);
    }

    public ModuleConfig() {
    }

    public ModuleConfig(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57b489a0ef822d967eec481b698a3285", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57b489a0ef822d967eec481b698a3285");
            return;
        }
        while (true) {
            int readInt = parcel.readInt();
            if (readInt == -1) {
                return;
            }
            if (readInt == 28649) {
                this.groups = (Group[]) parcel.createTypedArray(Group.CREATOR);
            } else if (readInt == 37335) {
                this.extra = (ModulesExtra) parcel.readParcelable(new SingleClassLoader(ModulesExtra.class));
            } else if (readInt == 40542) {
                this.key = parcel.readString();
            }
        }
    }

    public static DPObject[] toDPObjectArray(ModuleConfig[] moduleConfigArr) {
        Object[] objArr = {moduleConfigArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "91243b37cbb184a154c2f072ab013517", RobustBitConfig.DEFAULT_VALUE)) {
            return (DPObject[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "91243b37cbb184a154c2f072ab013517");
        }
        if (moduleConfigArr == null || moduleConfigArr.length <= 0) {
            return null;
        }
        DPObject[] dPObjectArr = new DPObject[moduleConfigArr.length];
        int length = moduleConfigArr.length;
        for (int i = 0; i < length; i++) {
            if (moduleConfigArr[i] != null) {
                dPObjectArr[i] = moduleConfigArr[i].toDPObject();
            } else {
                dPObjectArr[i] = null;
            }
        }
        return dPObjectArr;
    }

    public DPObject toDPObject() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f663f22687266c7b57df8b21d63f4d4c", RobustBitConfig.DEFAULT_VALUE)) {
            return (DPObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f663f22687266c7b57df8b21d63f4d4c");
        }
        return new DPObject("ModuleConfig").b().a("extra", this.extra == null ? null : this.extra.toDPObject()).a("groups", Group.toDPObjectArray(this.groups)).a("key", this.key).a();
    }

    public String toJson() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ca2ed632022049ee16a6bb4936986a3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ca2ed632022049ee16a6bb4936986a3") : new Gson().toJson(this);
    }
}
