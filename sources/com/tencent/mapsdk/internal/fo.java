package com.tencent.mapsdk.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class fo implements Parcelable {
    public static final Parcelable.Creator<fo> CREATOR = new Parcelable.Creator<fo>() { // from class: com.tencent.mapsdk.internal.fo.1
        private static fo a(Parcel parcel) {
            return new fo(parcel);
        }

        private static fo[] a(int i) {
            return new fo[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ fo[] newArray(int i) {
            return new fo[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ fo createFromParcel(Parcel parcel) {
            return new fo(parcel);
        }
    };
    public int a;
    public String b;
    public int c;
    public int d;
    public float e;
    public float f;
    public float g;
    public String h;
    public int i;
    public int j;
    public String k;
    public float l;
    public float m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public LatLng u;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public fo() {
        this.e = 0.5f;
        this.f = 0.5f;
        this.g = 1.0f;
        this.n = 0;
        this.o = 3;
    }

    protected fo(Parcel parcel) {
        this.e = 0.5f;
        this.f = 0.5f;
        this.g = 1.0f;
        this.n = 0;
        this.o = 3;
        this.a = parcel.readInt();
        this.b = parcel.readString();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readFloat();
        this.f = parcel.readFloat();
        this.g = parcel.readFloat();
        this.h = parcel.readString();
        this.i = parcel.readInt();
        this.j = parcel.readInt();
        this.k = parcel.readString();
        this.l = parcel.readFloat();
        this.m = parcel.readFloat();
        this.n = parcel.readInt();
        this.o = parcel.readInt();
        this.p = parcel.readInt();
        this.q = parcel.readInt();
        this.r = parcel.readInt();
        this.u = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeFloat(this.e);
        parcel.writeFloat(this.f);
        parcel.writeFloat(this.g);
        parcel.writeString(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        parcel.writeString(this.k);
        parcel.writeFloat(this.l);
        parcel.writeFloat(this.m);
        parcel.writeInt(this.n);
        parcel.writeInt(this.o);
        parcel.writeInt(this.p);
        parcel.writeInt(this.q);
        parcel.writeInt(this.r);
        parcel.writeParcelable(this.u, i);
    }
}
