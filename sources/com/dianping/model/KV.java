package com.dianping.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.dianping.archive.DPObject;
import com.dianping.archive.c;
import com.dianping.archive.e;
import com.dianping.titans.js.JsBridgeResult;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class KV extends BasicModel {
    public static ChangeQuickRedirect c;
    @SerializedName("extra")
    public ModulesExtra d;
    @SerializedName("value")
    public String e;
    @SerializedName("key")
    public String f;
    public static final c<KV> g = new c<KV>() { // from class: com.dianping.model.KV.1
        public static ChangeQuickRedirect a;

        @Override // com.dianping.archive.c
        public final /* synthetic */ KV a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6dbc37c0b4c0fc47fc8fa91ea4b585cc", RobustBitConfig.DEFAULT_VALUE)) {
                return (KV) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6dbc37c0b4c0fc47fc8fa91ea4b585cc");
            }
            if (i == 2411) {
                return new KV();
            }
            return new KV(false);
        }

        @Override // com.dianping.archive.c
        public final /* bridge */ /* synthetic */ KV[] b(int i) {
            return new KV[i];
        }
    };
    public static final Parcelable.Creator<KV> CREATOR = new Parcelable.Creator<KV>() { // from class: com.dianping.model.KV.2
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ KV createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2004eab62679cea718c10126bd4b86ed", RobustBitConfig.DEFAULT_VALUE)) {
                return (KV) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2004eab62679cea718c10126bd4b86ed");
            }
            KV kv = new KV();
            while (true) {
                int readInt = parcel.readInt();
                if (readInt == -1) {
                    return kv;
                }
                if (readInt == 2633) {
                    kv.b = parcel.readInt() == 1;
                } else if (readInt == 9790) {
                    kv.f = parcel.readString();
                } else if (readInt == 42424) {
                    kv.e = parcel.readString();
                } else if (readInt == 42996) {
                    kv.d = (ModulesExtra) parcel.readParcelable(new a(ModulesExtra.class));
                }
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ KV[] newArray(int i) {
            return new KV[i];
        }
    };

    @Override // com.dianping.model.BasicModel, com.dianping.archive.b
    public void decode(e eVar) throws com.dianping.archive.a {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fccd27cd7eaafebf2653219ba6a566a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fccd27cd7eaafebf2653219ba6a566a");
            return;
        }
        while (true) {
            int g2 = eVar.g();
            if (g2 <= 0) {
                return;
            }
            if (g2 == 2633) {
                this.b = eVar.a();
            } else if (g2 == 9790) {
                this.f = eVar.d();
            } else if (g2 == 42424) {
                this.e = eVar.d();
            } else if (g2 == 42996) {
                this.d = (ModulesExtra) eVar.a(ModulesExtra.e);
            } else {
                eVar.f();
            }
        }
    }

    @Override // com.dianping.model.BasicModel, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "314758e6b6eb3d81d10c0b7289fc8768", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "314758e6b6eb3d81d10c0b7289fc8768");
            return;
        }
        parcel.writeInt(2633);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(9790);
        parcel.writeString(this.f);
        parcel.writeInt(42424);
        parcel.writeString(this.e);
        parcel.writeInt(42996);
        parcel.writeParcelable(this.d, i);
        parcel.writeInt(-1);
    }

    public static DPObject[] a(KV[] kvArr) {
        DPObject dPObject;
        DPObject a;
        Object[] objArr = {kvArr};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0bca5db39d236dbca9c64a69129e6a3a", RobustBitConfig.DEFAULT_VALUE)) {
            return (DPObject[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0bca5db39d236dbca9c64a69129e6a3a");
        }
        if (kvArr == null || kvArr.length <= 0) {
            return null;
        }
        DPObject[] dPObjectArr = new DPObject[kvArr.length];
        int length = kvArr.length;
        for (int i = 0; i < length; i++) {
            if (kvArr[i] != null) {
                KV kv = kvArr[i];
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = c;
                if (PatchProxy.isSupport(objArr2, kv, changeQuickRedirect2, false, "9010cf26d2d748760ecb2ceb3996b5e9", RobustBitConfig.DEFAULT_VALUE)) {
                    a = (DPObject) PatchProxy.accessDispatch(objArr2, kv, changeQuickRedirect2, false, "9010cf26d2d748760ecb2ceb3996b5e9");
                } else {
                    DPObject.e a2 = new DPObject("KV").b().a("IsPresent", kv.b).a("Key", kv.f).a("Value", kv.e);
                    if (kv.d.b) {
                        ModulesExtra modulesExtra = kv.d;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = ModulesExtra.c;
                        dPObject = PatchProxy.isSupport(objArr3, modulesExtra, changeQuickRedirect3, false, "c84a37497944a59989eb293b0264c28e", RobustBitConfig.DEFAULT_VALUE) ? (DPObject) PatchProxy.accessDispatch(objArr3, modulesExtra, changeQuickRedirect3, false, "c84a37497944a59989eb293b0264c28e") : new DPObject("ModulesExtra").b().a("IsPresent", modulesExtra.b).a(JsBridgeResult.PROPERTY_GET_MEDIA_FRAME_FRAME, modulesExtra.d).a();
                    } else {
                        dPObject = null;
                    }
                    a = a2.a("Extra", dPObject).a();
                }
                dPObjectArr[i] = a;
            } else {
                dPObjectArr[i] = null;
            }
        }
        return dPObjectArr;
    }

    public KV() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d4f29a1366b085ecb1c95d65061b0ad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d4f29a1366b085ecb1c95d65061b0ad");
            return;
        }
        this.b = true;
        this.f = "";
        this.e = "";
        this.d = new ModulesExtra(false, 0);
    }

    public KV(boolean z) {
        Object[] objArr = {(byte) 0};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26d7cd75b93409886435de259035c979", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26d7cd75b93409886435de259035c979");
            return;
        }
        this.b = false;
        this.f = "";
        this.e = "";
        this.d = new ModulesExtra(false, 0);
    }
}
