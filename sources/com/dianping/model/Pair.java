package com.dianping.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.dianping.archive.c;
import com.dianping.archive.e;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class Pair extends BasicModel {
    public static ChangeQuickRedirect c;
    @SerializedName("parentID")
    public String d;
    @SerializedName("iD")
    public String e;
    @SerializedName("name")
    public String f;
    @SerializedName("type")
    public int g;
    public static final c<Pair> h = new c<Pair>() { // from class: com.dianping.model.Pair.1
        public static ChangeQuickRedirect a;

        @Override // com.dianping.archive.c
        public final /* synthetic */ Pair a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d513ddbfedf379cda1133f33e00f0ad9", RobustBitConfig.DEFAULT_VALUE)) {
                return (Pair) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d513ddbfedf379cda1133f33e00f0ad9");
            }
            if (i == 55007) {
                return new Pair();
            }
            return new Pair(false);
        }

        @Override // com.dianping.archive.c
        public final /* bridge */ /* synthetic */ Pair[] b(int i) {
            return new Pair[i];
        }
    };
    public static final Parcelable.Creator<Pair> CREATOR = new Parcelable.Creator<Pair>() { // from class: com.dianping.model.Pair.2
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Pair createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57e0c497c9b4e84a926563f088a40eb2", RobustBitConfig.DEFAULT_VALUE)) {
                return (Pair) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57e0c497c9b4e84a926563f088a40eb2");
            }
            Pair pair = new Pair();
            while (true) {
                int readInt = parcel.readInt();
                if (readInt == -1) {
                    return pair;
                }
                if (readInt == 882) {
                    pair.g = parcel.readInt();
                } else if (readInt == 2331) {
                    pair.e = parcel.readString();
                } else if (readInt == 2633) {
                    pair.b = parcel.readInt() == 1;
                } else if (readInt == 47744) {
                    pair.d = parcel.readString();
                } else if (readInt == 61071) {
                    pair.f = parcel.readString();
                }
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Pair[] newArray(int i) {
            return new Pair[i];
        }
    };

    @Override // com.dianping.model.BasicModel, com.dianping.archive.b
    public void decode(e eVar) throws com.dianping.archive.a {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68412c6f914dd9092e5529628ef703b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68412c6f914dd9092e5529628ef703b4");
            return;
        }
        while (true) {
            int g = eVar.g();
            if (g <= 0) {
                return;
            }
            if (g == 882) {
                this.g = eVar.b();
            } else if (g == 2331) {
                this.e = eVar.d();
            } else if (g == 2633) {
                this.b = eVar.a();
            } else if (g == 47744) {
                this.d = eVar.d();
            } else if (g == 61071) {
                this.f = eVar.d();
            } else {
                eVar.f();
            }
        }
    }

    @Override // com.dianping.model.BasicModel, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ff7028becf6cbe6e8e92e8da38e20e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ff7028becf6cbe6e8e92e8da38e20e4");
            return;
        }
        parcel.writeInt(2633);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(882);
        parcel.writeInt(this.g);
        parcel.writeInt(61071);
        parcel.writeString(this.f);
        parcel.writeInt(2331);
        parcel.writeString(this.e);
        parcel.writeInt(47744);
        parcel.writeString(this.d);
        parcel.writeInt(-1);
    }

    public Pair() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25fc354818e666f0a31a1a4d2548e545", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25fc354818e666f0a31a1a4d2548e545");
            return;
        }
        this.b = true;
        this.g = 0;
        this.f = "";
        this.e = "";
        this.d = "";
    }

    public Pair(boolean z) {
        Object[] objArr = {(byte) 0};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfe0d80085f8d6cf82d7c8be976524dc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfe0d80085f8d6cf82d7c8be976524dc");
            return;
        }
        this.b = false;
        this.g = 0;
        this.f = "";
        this.e = "";
        this.d = "";
    }
}
