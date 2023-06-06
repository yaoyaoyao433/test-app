package com.dianping.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.dianping.archive.c;
import com.dianping.archive.e;
import com.dianping.titans.js.JsBridgeResult;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ModulesExtra extends BasicModel {
    public static ChangeQuickRedirect c;
    @SerializedName(JsBridgeResult.PROPERTY_GET_MEDIA_FRAME_FRAME)
    public int d;
    public static final c<ModulesExtra> e = new c<ModulesExtra>() { // from class: com.dianping.model.ModulesExtra.1
        public static ChangeQuickRedirect a;

        @Override // com.dianping.archive.c
        public final /* synthetic */ ModulesExtra a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8fb98eb898626ccf532750b50277b32", RobustBitConfig.DEFAULT_VALUE)) {
                return (ModulesExtra) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8fb98eb898626ccf532750b50277b32");
            }
            if (i == 58700) {
                return new ModulesExtra();
            }
            return new ModulesExtra(false);
        }

        @Override // com.dianping.archive.c
        public final /* bridge */ /* synthetic */ ModulesExtra[] b(int i) {
            return new ModulesExtra[i];
        }
    };
    public static final Parcelable.Creator<ModulesExtra> CREATOR = new Parcelable.Creator<ModulesExtra>() { // from class: com.dianping.model.ModulesExtra.2
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ModulesExtra createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2099a4fec118661688ee92c3acd522b", RobustBitConfig.DEFAULT_VALUE)) {
                return (ModulesExtra) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2099a4fec118661688ee92c3acd522b");
            }
            ModulesExtra modulesExtra = new ModulesExtra();
            while (true) {
                int readInt = parcel.readInt();
                if (readInt == -1) {
                    return modulesExtra;
                }
                if (readInt == 2633) {
                    modulesExtra.b = parcel.readInt() == 1;
                } else if (readInt == 44223) {
                    modulesExtra.d = parcel.readInt();
                }
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ModulesExtra[] newArray(int i) {
            return new ModulesExtra[i];
        }
    };

    @Override // com.dianping.model.BasicModel, com.dianping.archive.b
    public void decode(e eVar) throws com.dianping.archive.a {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa2a39c6bca7137c8d62c18f8a7a311c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa2a39c6bca7137c8d62c18f8a7a311c");
            return;
        }
        while (true) {
            int g = eVar.g();
            if (g <= 0) {
                return;
            }
            if (g == 2633) {
                this.b = eVar.a();
            } else if (g == 44223) {
                this.d = eVar.b();
            } else {
                eVar.f();
            }
        }
    }

    @Override // com.dianping.model.BasicModel, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3276451fa1a633404888f8af0b8b6ed7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3276451fa1a633404888f8af0b8b6ed7");
            return;
        }
        parcel.writeInt(2633);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(44223);
        parcel.writeInt(this.d);
        parcel.writeInt(-1);
    }

    public ModulesExtra() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce34b24a2caf1181042d7eaaddd34ca8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce34b24a2caf1181042d7eaaddd34ca8");
            return;
        }
        this.b = true;
        this.d = 0;
    }

    public ModulesExtra(boolean z) {
        Object[] objArr = {(byte) 0};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a522148ea077059e6130c0c6003065f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a522148ea077059e6130c0c6003065f");
            return;
        }
        this.b = false;
        this.d = 0;
    }

    public ModulesExtra(boolean z, int i) {
        Object[] objArr = {(byte) 0, 0};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53eac3f5f16da25a0b417193e0e70088", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53eac3f5f16da25a0b417193e0e70088");
            return;
        }
        this.b = false;
        this.d = 0;
    }
}
