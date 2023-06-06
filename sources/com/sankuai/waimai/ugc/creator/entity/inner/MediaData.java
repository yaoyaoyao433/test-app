package com.sankuai.waimai.ugc.creator.entity.inner;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class MediaData implements Parcelable, Comparable<MediaData> {
    public static final Parcelable.Creator<MediaData> CREATOR = new Parcelable.Creator<MediaData>() { // from class: com.sankuai.waimai.ugc.creator.entity.inner.MediaData.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MediaData createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8cabddc1bc807980f7d0a2c17879a0a", RobustBitConfig.DEFAULT_VALUE) ? (MediaData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8cabddc1bc807980f7d0a2c17879a0a") : new MediaData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MediaData[] newArray(int i) {
            return new MediaData[i];
        }
    };
    public static ChangeQuickRedirect d;
    public int e;
    public int f;
    public int g;
    public String h;
    public String i;
    public String j;
    public String k;
    public int l;
    public int m;
    public long n;
    public String o;
    public String p;
    public long q;
    public String r;
    public String s;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(MediaData mediaData) {
        MediaData mediaData2 = mediaData;
        Object[] objArr = {mediaData2};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a703ebb9061275b143c563c8ccf0e9a1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a703ebb9061275b143c563c8ccf0e9a1")).intValue() : Long.compare(mediaData2.q, this.q);
    }

    public MediaData() {
    }

    public MediaData(int i, String str, String str2, int i2, int i3, int i4, String str3, String str4, long j) {
        Object[] objArr = {Integer.valueOf(i), str, str2, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str3, str4, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4bdc6941eeec5ef600c67d3932ec447", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4bdc6941eeec5ef600c67d3932ec447");
            return;
        }
        this.g = i;
        this.i = str;
        this.h = str2;
        this.n = i2;
        this.l = i3;
        this.m = i4;
        this.o = str3;
        this.p = str4;
        this.q = j;
        this.e = 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a32f3bdfb69d70e3ff8899919347df6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a32f3bdfb69d70e3ff8899919347df6a");
            return;
        }
        parcel.writeInt(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.r);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        parcel.writeLong(this.n);
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeInt(this.e);
        parcel.writeString(this.o);
        parcel.writeString(this.p);
        parcel.writeLong(this.q);
        parcel.writeString(this.k);
        parcel.writeInt(this.f);
    }

    public MediaData(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a1ce1610570651ecba0fffd823661b0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a1ce1610570651ecba0fffd823661b0");
            return;
        }
        this.g = parcel.readInt();
        this.h = parcel.readString();
        this.r = parcel.readString();
        this.i = parcel.readString();
        this.j = parcel.readString();
        this.l = parcel.readInt();
        this.m = parcel.readInt();
        this.n = parcel.readLong();
        this.r = parcel.readString();
        this.s = parcel.readString();
        this.e = parcel.readInt();
        this.o = parcel.readString();
        this.p = parcel.readString();
        this.q = parcel.readLong();
        this.k = parcel.readString();
        this.f = parcel.readInt();
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21cd24e3b7f5f4f6b9792230c7e22dc3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21cd24e3b7f5f4f6b9792230c7e22dc3")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaData) {
            MediaData mediaData = (MediaData) obj;
            return this.g == mediaData.g && TextUtils.equals(this.i, mediaData.i) && TextUtils.equals(this.k, mediaData.k);
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a498faa6abfa314e0a15b5d218d6e627", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a498faa6abfa314e0a15b5d218d6e627")).intValue();
        }
        int i = this.g * 31;
        if (this.i != null) {
            i = (i * 31) + this.i.hashCode();
        }
        return this.k != null ? (i * 31) + this.k.hashCode() : i;
    }
}
