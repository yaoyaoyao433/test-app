package com.sankuai.xm.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class VideoInfo implements Parcelable {
    public static final Parcelable.Creator<VideoInfo> CREATOR = new Parcelable.Creator<VideoInfo>() { // from class: com.sankuai.xm.video.VideoInfo.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VideoInfo createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c77e5c7301eb9d163c55cdc316d156df", 6917529027641081856L) ? (VideoInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c77e5c7301eb9d163c55cdc316d156df") : new VideoInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VideoInfo[] newArray(int i) {
            return new VideoInfo[i];
        }
    };
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public long d;
    public long e;
    public int f;
    public int g;
    private long h;
    private long i;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VideoInfo() {
    }

    public VideoInfo(String str, String str2, long j, long j2, int i, int i2, long j3, long j4) {
        Object[] objArr = {str, str2, new Long(j), new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), new Long(j3), new Long(j4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c144c68124e23eddcc23d06842d4617", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c144c68124e23eddcc23d06842d4617");
            return;
        }
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = j2;
        this.f = i;
        this.g = i2;
        this.h = j3;
        this.i = j4;
    }

    public VideoInfo(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8227e19aaa7035250e012ce50989fc5c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8227e19aaa7035250e012ce50989fc5c");
            return;
        }
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readLong();
        this.e = parcel.readLong();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.readLong();
        this.i = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fc04fc9ac16d3e28f704a9139294073", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fc04fc9ac16d3e28f704a9139294073");
            return;
        }
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeLong(this.h);
        parcel.writeLong(this.i);
    }
}
