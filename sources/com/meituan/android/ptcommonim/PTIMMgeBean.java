package com.meituan.android.ptcommonim;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.JsonHelper;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PTIMMgeBean implements Parcelable {
    public static final Parcelable.Creator<PTIMMgeBean> CREATOR = new Parcelable.Creator<PTIMMgeBean>() { // from class: com.meituan.android.ptcommonim.PTIMMgeBean.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PTIMMgeBean createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bad2c27a18b83fac02f8a450f662161", RobustBitConfig.DEFAULT_VALUE) ? (PTIMMgeBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bad2c27a18b83fac02f8a450f662161") : new PTIMMgeBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PTIMMgeBean[] newArray(int i) {
            return new PTIMMgeBean[i];
        }
    };
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public String d;
    public a e;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum a {
        TYPE_C,
        TYPE_B;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46bf86e8bbb43eb24b6da05fcfbec654", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46bf86e8bbb43eb24b6da05fcfbec654");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f5c46b3ef08737948405c65a8dd87a3", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f5c46b3ef08737948405c65a8dd87a3") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "64e3e52913eb725a069ded376d70cc9f", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "64e3e52913eb725a069ded376d70cc9f") : (a[]) values().clone();
        }
    }

    public PTIMMgeBean() {
    }

    public PTIMMgeBean(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f59d0ac4f9dae9192d9da3da3cb1d1d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f59d0ac4f9dae9192d9da3da3cb1d1d");
            return;
        }
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readInt() == 0 ? a.TYPE_C : a.TYPE_B;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1440c3dcfbc681b4ec8ed61cd2cf227", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1440c3dcfbc681b4ec8ed61cd2cf227");
            return;
        }
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e != a.TYPE_C ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.String] */
    public final Map<String, Object> a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73acfc06cee5df74a46e0429caffef0d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73acfc06cee5df74a46e0429caffef0d");
        }
        HashMap hashMap = new HashMap(8);
        hashMap.put(z ? "buId" : Constants.Business.KEY_BU_ID, !TextUtils.isEmpty(this.b) ? this.b : "-999");
        hashMap.put(z ? "poiId" : "poi_id", !TextUtils.isEmpty(this.c) ? this.c : "-999");
        Map a2 = a();
        Map map = a2;
        if (a2 == null) {
            map = "-999";
        }
        hashMap.put("trace", map);
        return hashMap;
    }

    private Map a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed8b15e062230afbf3fd39778cc330fb", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed8b15e062230afbf3fd39778cc330fb");
        }
        if (TextUtils.isEmpty(this.d)) {
            return null;
        }
        try {
            return (Map) JsonHelper.fromJsonString(this.d, Map.class);
        } catch (Throwable unused) {
            return null;
        }
    }
}
