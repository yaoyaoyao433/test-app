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
public class ModuleConfigResponse implements Parcelable, b {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("configs")
    public ModuleConfig[] configs;
    @SerializedName("env")
    public int env;
    @SerializedName("md5")
    public String md5;
    @SerializedName("moduleProps")
    public ModuleProp[] moduleProps;
    @SerializedName("patch")
    public boolean patch;
    @SerializedName("timeStamp")
    public long timeStamp;
    public static final c<ModuleConfigResponse> DECODER = new c<ModuleConfigResponse>() { // from class: com.dianping.eunomia.model.models.ModuleConfigResponse.1
        public static ChangeQuickRedirect a;

        @Override // com.dianping.archive.c
        public final /* synthetic */ ModuleConfigResponse a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e899dc67ce8c6937d525e688c8253d28", RobustBitConfig.DEFAULT_VALUE)) {
                return (ModuleConfigResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e899dc67ce8c6937d525e688c8253d28");
            }
            if (i == 40351) {
                return new ModuleConfigResponse();
            }
            return null;
        }

        @Override // com.dianping.archive.c
        public final /* bridge */ /* synthetic */ ModuleConfigResponse[] b(int i) {
            return new ModuleConfigResponse[i];
        }
    };
    public static final Parcelable.Creator<ModuleConfigResponse> CREATOR = new Parcelable.Creator<ModuleConfigResponse>() { // from class: com.dianping.eunomia.model.models.ModuleConfigResponse.2
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ModuleConfigResponse createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c3b36417cb9c75d9d84c77d06f93d9bc", RobustBitConfig.DEFAULT_VALUE) ? (ModuleConfigResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c3b36417cb9c75d9d84c77d06f93d9bc") : new ModuleConfigResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ModuleConfigResponse[] newArray(int i) {
            return new ModuleConfigResponse[i];
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ae3db8fd595659b80730f9f5859c205", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ae3db8fd595659b80730f9f5859c205");
            return;
        }
        while (true) {
            int g = eVar.g();
            if (g <= 0) {
                return;
            }
            if (g == 9744) {
                this.patch = eVar.a();
            } else if (g == 14704) {
                this.timeStamp = eVar.c();
            } else if (g == 35052) {
                this.env = eVar.b();
            } else if (g == 42367) {
                this.md5 = eVar.d();
            } else if (g == 56769) {
                this.configs = (ModuleConfig[]) eVar.b(ModuleConfig.DECODER);
            } else if (g == 57744) {
                this.moduleProps = (ModuleProp[]) eVar.b(ModuleProp.DECODER);
            } else {
                eVar.f();
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ce5d3cde07cab616e962d79c7eb38c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ce5d3cde07cab616e962d79c7eb38c9");
            return;
        }
        parcel.writeInt(35052);
        parcel.writeInt(this.env);
        parcel.writeInt(9744);
        parcel.writeInt(this.patch ? 1 : 0);
        parcel.writeInt(42367);
        parcel.writeString(this.md5);
        parcel.writeInt(14704);
        parcel.writeLong(this.timeStamp);
        parcel.writeInt(57744);
        parcel.writeTypedArray(this.moduleProps, i);
        parcel.writeInt(56769);
        parcel.writeTypedArray(this.configs, i);
        parcel.writeInt(-1);
    }

    public ModuleConfigResponse() {
    }

    public ModuleConfigResponse(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5503f66be1f824c7f48d0d3610683d45", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5503f66be1f824c7f48d0d3610683d45");
            return;
        }
        while (true) {
            int readInt = parcel.readInt();
            if (readInt == -1) {
                return;
            }
            if (readInt != 9744) {
                if (readInt == 14704) {
                    this.timeStamp = parcel.readLong();
                } else if (readInt == 35052) {
                    this.env = parcel.readInt();
                } else if (readInt == 42367) {
                    this.md5 = parcel.readString();
                } else if (readInt == 56769) {
                    this.configs = (ModuleConfig[]) parcel.createTypedArray(ModuleConfig.CREATOR);
                } else if (readInt == 57744) {
                    this.moduleProps = (ModuleProp[]) parcel.createTypedArray(ModuleProp.CREATOR);
                }
            }
            this.patch = parcel.readInt() == 1;
        }
    }

    public static DPObject[] toDPObjectArray(ModuleConfigResponse[] moduleConfigResponseArr) {
        Object[] objArr = {moduleConfigResponseArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "36c14d9d93be3119677ad68a255d6767", RobustBitConfig.DEFAULT_VALUE)) {
            return (DPObject[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "36c14d9d93be3119677ad68a255d6767");
        }
        if (moduleConfigResponseArr == null || moduleConfigResponseArr.length <= 0) {
            return null;
        }
        DPObject[] dPObjectArr = new DPObject[moduleConfigResponseArr.length];
        int length = moduleConfigResponseArr.length;
        for (int i = 0; i < length; i++) {
            if (moduleConfigResponseArr[i] != null) {
                dPObjectArr[i] = moduleConfigResponseArr[i].toDPObject();
            } else {
                dPObjectArr[i] = null;
            }
        }
        return dPObjectArr;
    }

    public DPObject toDPObject() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b1ea8041a819274da976ed5d1a752b69", RobustBitConfig.DEFAULT_VALUE) ? (DPObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b1ea8041a819274da976ed5d1a752b69") : new DPObject("ModuleConfigResponse").b().a("env", this.env).a("patch", this.patch).a("md5", this.md5).a("timeStamp", this.timeStamp).a("moduleProps", ModuleProp.toDPObjectArray(this.moduleProps)).a("configs", ModuleConfig.toDPObjectArray(this.configs)).a();
    }

    public String toJson() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7854e32ddaf670f9bd2871244fce22d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7854e32ddaf670f9bd2871244fce22d") : new Gson().toJson(this);
    }
}
