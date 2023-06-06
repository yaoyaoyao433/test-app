package com.dianping.video.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class Frame implements Parcelable {
    public static final Parcelable.Creator<Frame> CREATOR = new Parcelable.Creator<Frame>() { // from class: com.dianping.video.model.Frame.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Frame createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cb6f162b78eb49edb3df467ddaac2ef", RobustBitConfig.DEFAULT_VALUE) ? (Frame) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cb6f162b78eb49edb3df467ddaac2ef") : new Frame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Frame[] newArray(int i) {
            return new Frame[i];
        }
    };
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public long g;
    public long h;
    public String i;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Frame() {
    }

    public Frame(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94de6e0acd7d2fcc82d7b71aac0ec6c5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94de6e0acd7d2fcc82d7b71aac0ec6c5");
            return;
        }
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readLong();
        this.h = parcel.readLong();
        this.i = parcel.readString();
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cab40e67e67364ebe0ed6f28a2a4f342", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cab40e67e67364ebe0ed6f28a2a4f342");
        }
        return "Frame{frameType=" + this.c + ", position=" + this.d + ", limit=" + this.e + ", flags=" + this.f + ", presentationTimeUs=" + this.g + ", offset=" + this.h + ", dataPath='" + this.i + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee833c4ceee967da22cf02ded0013079", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee833c4ceee967da22cf02ded0013079");
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeLong(this.g);
        parcel.writeLong(this.h);
        parcel.writeString(this.i);
    }
}
