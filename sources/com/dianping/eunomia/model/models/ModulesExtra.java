package com.dianping.eunomia.model.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import com.dianping.archive.DPObject;
import com.dianping.archive.a;
import com.dianping.archive.b;
import com.dianping.archive.c;
import com.dianping.archive.e;
import com.dianping.titans.js.JsBridgeResult;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes.dex */
public class ModulesExtra implements Parcelable, b {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName(JsBridgeResult.PROPERTY_GET_MEDIA_FRAME_FRAME)
    public int frame;
    public static final c<ModulesExtra> DECODER = new c<ModulesExtra>() { // from class: com.dianping.eunomia.model.models.ModulesExtra.1
        public static ChangeQuickRedirect a;

        @Override // com.dianping.archive.c
        public final /* synthetic */ ModulesExtra a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b94df8e732b45a6f0dc5aa7ff5661b35", RobustBitConfig.DEFAULT_VALUE)) {
                return (ModulesExtra) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b94df8e732b45a6f0dc5aa7ff5661b35");
            }
            if (i == 58700) {
                return new ModulesExtra();
            }
            return null;
        }

        @Override // com.dianping.archive.c
        public final /* bridge */ /* synthetic */ ModulesExtra[] b(int i) {
            return new ModulesExtra[i];
        }
    };
    public static final Parcelable.Creator<ModulesExtra> CREATOR = new Parcelable.Creator<ModulesExtra>() { // from class: com.dianping.eunomia.model.models.ModulesExtra.2
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ModulesExtra createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9857f30498fca050f2caf9926426a5df", RobustBitConfig.DEFAULT_VALUE) ? (ModulesExtra) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9857f30498fca050f2caf9926426a5df") : new ModulesExtra(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ModulesExtra[] newArray(int i) {
            return new ModulesExtra[i];
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99c1ca504dec4c74b192a24d3056a521", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99c1ca504dec4c74b192a24d3056a521");
            return;
        }
        while (true) {
            int g = eVar.g();
            if (g <= 0) {
                return;
            }
            if (g == 44223) {
                this.frame = eVar.b();
            } else {
                eVar.f();
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90a53312c8b695918deb8f63c8b49fea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90a53312c8b695918deb8f63c8b49fea");
            return;
        }
        parcel.writeInt(44223);
        parcel.writeInt(this.frame);
        parcel.writeInt(-1);
    }

    public ModulesExtra() {
    }

    public ModulesExtra(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ac54c3b758fdc23f0f4df8dfb3b2447", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ac54c3b758fdc23f0f4df8dfb3b2447");
            return;
        }
        while (true) {
            int readInt = parcel.readInt();
            if (readInt == -1) {
                return;
            }
            if (readInt == 44223) {
                this.frame = parcel.readInt();
            }
        }
    }

    public static DPObject[] toDPObjectArray(ModulesExtra[] modulesExtraArr) {
        Object[] objArr = {modulesExtraArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c71361f99c041ff2bae9cfcaa6482291", RobustBitConfig.DEFAULT_VALUE)) {
            return (DPObject[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c71361f99c041ff2bae9cfcaa6482291");
        }
        if (modulesExtraArr == null || modulesExtraArr.length <= 0) {
            return null;
        }
        DPObject[] dPObjectArr = new DPObject[modulesExtraArr.length];
        int length = modulesExtraArr.length;
        for (int i = 0; i < length; i++) {
            if (modulesExtraArr[i] != null) {
                dPObjectArr[i] = modulesExtraArr[i].toDPObject();
            } else {
                dPObjectArr[i] = null;
            }
        }
        return dPObjectArr;
    }

    public DPObject toDPObject() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7020ec8d83de345f487d47d40d9b0728", RobustBitConfig.DEFAULT_VALUE) ? (DPObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7020ec8d83de345f487d47d40d9b0728") : new DPObject("ModulesExtra").b().a(JsBridgeResult.PROPERTY_GET_MEDIA_FRAME_FRAME, this.frame).a();
    }

    public String toJson() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4e5d23283b44c1082af7f567f5e58ea", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4e5d23283b44c1082af7f567f5e58ea") : new Gson().toJson(this);
    }
}
