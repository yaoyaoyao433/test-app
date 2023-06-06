package com.dianping.video.recorder.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class MediaFormatInfo implements Parcelable {
    public static final Parcelable.Creator<MediaFormatInfo> CREATOR = new Parcelable.Creator<MediaFormatInfo>() { // from class: com.dianping.video.recorder.model.MediaFormatInfo.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MediaFormatInfo createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19d2527f9013f2d147a272675897f1f7", RobustBitConfig.DEFAULT_VALUE) ? (MediaFormatInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19d2527f9013f2d147a272675897f1f7") : new MediaFormatInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MediaFormatInfo[] newArray(int i) {
            return new MediaFormatInfo[i];
        }
    };
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public byte[] h;
    public byte[] i;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public MediaFormatInfo() {
    }

    public MediaFormatInfo(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21f26c2894d84857372d2c52ea32bea6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21f26c2894d84857372d2c52ea32bea6");
            return;
        }
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.createByteArray();
        this.i = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "338d75860f016c8f69bb948f60d66001", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "338d75860f016c8f69bb948f60d66001");
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeByteArray(this.h);
        parcel.writeByteArray(this.i);
    }
}
