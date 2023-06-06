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
public class ModuleProp implements Parcelable, b {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("data")
    public ExtraProp[] data;
    @SerializedName("key")
    public String key;
    @SerializedName("operation")
    public int operation;
    @SerializedName("targetModule")
    public String targetModule;
    @SerializedName("type")
    public int type;
    @SerializedName("url")
    public String url;
    public static final c<ModuleProp> DECODER = new c<ModuleProp>() { // from class: com.dianping.eunomia.model.models.ModuleProp.1
        public static ChangeQuickRedirect a;

        @Override // com.dianping.archive.c
        public final /* synthetic */ ModuleProp a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bff58709cf119095dc7441e2403f2bfc", RobustBitConfig.DEFAULT_VALUE)) {
                return (ModuleProp) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bff58709cf119095dc7441e2403f2bfc");
            }
            if (i == 50941) {
                return new ModuleProp();
            }
            return null;
        }

        @Override // com.dianping.archive.c
        public final /* bridge */ /* synthetic */ ModuleProp[] b(int i) {
            return new ModuleProp[i];
        }
    };
    public static final Parcelable.Creator<ModuleProp> CREATOR = new Parcelable.Creator<ModuleProp>() { // from class: com.dianping.eunomia.model.models.ModuleProp.2
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ModuleProp createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "399c09a48659b3e2ee0e08e1009e012c", RobustBitConfig.DEFAULT_VALUE) ? (ModuleProp) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "399c09a48659b3e2ee0e08e1009e012c") : new ModuleProp(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ModuleProp[] newArray(int i) {
            return new ModuleProp[i];
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1edf75e1f7aabe2e9d7da142a6adce53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1edf75e1f7aabe2e9d7da142a6adce53");
            return;
        }
        while (true) {
            int g = eVar.g();
            if (g > 0) {
                switch (g) {
                    case 1632:
                        this.targetModule = eVar.d();
                        break;
                    case 36620:
                        this.type = eVar.b();
                        break;
                    case 40542:
                        this.key = eVar.d();
                        break;
                    case 46717:
                        this.operation = eVar.b();
                        break;
                    case 50542:
                        this.url = eVar.d();
                        break;
                    case 61316:
                        this.data = (ExtraProp[]) eVar.b(ExtraProp.DECODER);
                        break;
                    default:
                        eVar.f();
                        break;
                }
            } else {
                return;
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "71895c9b748af24984a6939722e9ac3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "71895c9b748af24984a6939722e9ac3b");
            return;
        }
        parcel.writeInt(1632);
        parcel.writeString(this.targetModule);
        parcel.writeInt(46717);
        parcel.writeInt(this.operation);
        parcel.writeInt(61316);
        parcel.writeTypedArray(this.data, i);
        parcel.writeInt(40542);
        parcel.writeString(this.key);
        parcel.writeInt(36620);
        parcel.writeInt(this.type);
        parcel.writeInt(50542);
        parcel.writeString(this.url);
        parcel.writeInt(-1);
    }

    public ModuleProp() {
    }

    public ModuleProp(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c2c5be2ac2a5f582ebe01d0ab75b10b2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c2c5be2ac2a5f582ebe01d0ab75b10b2");
            return;
        }
        while (true) {
            int readInt = parcel.readInt();
            if (readInt != -1) {
                switch (readInt) {
                    case 1632:
                        this.targetModule = parcel.readString();
                        break;
                    case 36620:
                        this.type = parcel.readInt();
                        break;
                    case 40542:
                        this.key = parcel.readString();
                        break;
                    case 46717:
                        this.operation = parcel.readInt();
                        break;
                    case 50542:
                        this.url = parcel.readString();
                        break;
                    case 61316:
                        this.data = (ExtraProp[]) parcel.createTypedArray(ExtraProp.CREATOR);
                        break;
                }
            } else {
                return;
            }
        }
    }

    public static DPObject[] toDPObjectArray(ModuleProp[] modulePropArr) {
        Object[] objArr = {modulePropArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "78dff86eaf632571c7ad305fc01d681b", RobustBitConfig.DEFAULT_VALUE)) {
            return (DPObject[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "78dff86eaf632571c7ad305fc01d681b");
        }
        if (modulePropArr == null || modulePropArr.length <= 0) {
            return null;
        }
        DPObject[] dPObjectArr = new DPObject[modulePropArr.length];
        int length = modulePropArr.length;
        for (int i = 0; i < length; i++) {
            if (modulePropArr[i] != null) {
                dPObjectArr[i] = modulePropArr[i].toDPObject();
            } else {
                dPObjectArr[i] = null;
            }
        }
        return dPObjectArr;
    }

    public DPObject toDPObject() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14b5d1e64a3aee2190de6b0787e6f994", RobustBitConfig.DEFAULT_VALUE) ? (DPObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14b5d1e64a3aee2190de6b0787e6f994") : new DPObject("ModuleProp").b().a("targetModule", this.targetModule).a("operation", this.operation).a("data", ExtraProp.toDPObjectArray(this.data)).a("key", this.key).a("type", this.type).a("url", this.url).a();
    }

    public String toJson() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e21eb4b34e6bb8b516c8ce5d07c99440", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e21eb4b34e6bb8b516c8ce5d07c99440") : new Gson().toJson(this);
    }
}
