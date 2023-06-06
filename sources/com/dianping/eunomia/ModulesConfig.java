package com.dianping.eunomia;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import com.dianping.archive.DPObject;
import com.dianping.eunomia.model.models.ModuleConfigResponse;
import com.dianping.eunomia.model.models.SingleClassLoader;
import com.dianping.model.KV;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes.dex */
public class ModulesConfig implements Parcelable, com.dianping.archive.b {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("config")
    public String config;
    @SerializedName("configs")
    public KV[] configs;
    @SerializedName("isPresent")
    public boolean isPresent;
    @SerializedName("moduleConfigRes")
    public ModuleConfigResponse moduleConfigRes;
    public static final com.dianping.archive.c<ModulesConfig> DECODER = new com.dianping.archive.c<ModulesConfig>() { // from class: com.dianping.eunomia.ModulesConfig.1
        public static ChangeQuickRedirect a;

        @Override // com.dianping.archive.c
        public final /* synthetic */ ModulesConfig a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a291a5d6afff30b1291ece9d99541032", RobustBitConfig.DEFAULT_VALUE)) {
                return (ModulesConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a291a5d6afff30b1291ece9d99541032");
            }
            if (i == 25237) {
                return new ModulesConfig();
            }
            return null;
        }

        @Override // com.dianping.archive.c
        public final /* bridge */ /* synthetic */ ModulesConfig[] b(int i) {
            return new ModulesConfig[i];
        }
    };
    public static final Parcelable.Creator<ModulesConfig> CREATOR = new Parcelable.Creator<ModulesConfig>() { // from class: com.dianping.eunomia.ModulesConfig.2
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ModulesConfig createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1fc2879fd4a7b600371cba977dce67d8", RobustBitConfig.DEFAULT_VALUE) ? (ModulesConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1fc2879fd4a7b600371cba977dce67d8") : new ModulesConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ModulesConfig[] newArray(int i) {
            return new ModulesConfig[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.dianping.archive.b
    public void decode(com.dianping.archive.e eVar) throws com.dianping.archive.a {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54c4f2e266294c6aac1de1da71552eea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54c4f2e266294c6aac1de1da71552eea");
            return;
        }
        while (true) {
            int g = eVar.g();
            if (g <= 0) {
                return;
            }
            if (g == 6086) {
                this.config = eVar.d();
            } else if (g == 35099) {
                this.moduleConfigRes = (ModuleConfigResponse) eVar.a(ModuleConfigResponse.DECODER);
            } else if (g == 59064) {
                this.configs = (KV[]) eVar.b(KV.g);
            } else {
                eVar.f();
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b568af1287fc0f7d5a9f95f96c3aeabc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b568af1287fc0f7d5a9f95f96c3aeabc");
            return;
        }
        parcel.writeInt(35099);
        parcel.writeParcelable(this.moduleConfigRes, i);
        parcel.writeInt(59064);
        parcel.writeTypedArray(this.configs, i);
        parcel.writeInt(6086);
        parcel.writeString(this.config);
        parcel.writeInt(-1);
    }

    public ModulesConfig() {
    }

    public ModulesConfig(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "73f17b53d0f47ded93f43b89ac7da458", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "73f17b53d0f47ded93f43b89ac7da458");
            return;
        }
        while (true) {
            int readInt = parcel.readInt();
            if (readInt == -1) {
                return;
            }
            if (readInt == 6086) {
                this.config = parcel.readString();
            } else if (readInt == 35099) {
                this.moduleConfigRes = (ModuleConfigResponse) parcel.readParcelable(new SingleClassLoader(ModuleConfigResponse.class));
            } else if (readInt == 59064) {
                this.configs = (KV[]) parcel.createTypedArray(KV.CREATOR);
            }
        }
    }

    public static DPObject[] toDPObjectArray(ModulesConfig[] modulesConfigArr) {
        Object[] objArr = {modulesConfigArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7f54cd5bc350e0fdc326e7ad9c74443d", RobustBitConfig.DEFAULT_VALUE)) {
            return (DPObject[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7f54cd5bc350e0fdc326e7ad9c74443d");
        }
        if (modulesConfigArr == null || modulesConfigArr.length <= 0) {
            return null;
        }
        DPObject[] dPObjectArr = new DPObject[modulesConfigArr.length];
        int length = modulesConfigArr.length;
        for (int i = 0; i < length; i++) {
            if (modulesConfigArr[i] != null) {
                dPObjectArr[i] = modulesConfigArr[i].toDPObject();
            } else {
                dPObjectArr[i] = null;
            }
        }
        return dPObjectArr;
    }

    public DPObject toDPObject() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57f405d323ecdb8e1e1cf2669f90ce28", RobustBitConfig.DEFAULT_VALUE)) {
            return (DPObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57f405d323ecdb8e1e1cf2669f90ce28");
        }
        return new DPObject("ModulesConfig").b().a("moduleConfigRes", this.moduleConfigRes == null ? null : this.moduleConfigRes.toDPObject()).a("Configs", KV.a(this.configs)).a("Config", this.config).a();
    }

    public String toJson() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90cda0781159f615f50f43b31d495a8a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90cda0781159f615f50f43b31d495a8a") : new Gson().toJson(this);
    }
}
