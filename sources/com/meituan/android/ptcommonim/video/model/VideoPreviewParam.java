package com.meituan.android.ptcommonim.video.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class VideoPreviewParam extends VideoBaseParam {
    public static final Parcelable.Creator<VideoPreviewParam> CREATOR = new Parcelable.Creator<VideoPreviewParam>() { // from class: com.meituan.android.ptcommonim.video.model.VideoPreviewParam.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VideoPreviewParam createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e045bed712006dfbbd172e8bea33f0ee", RobustBitConfig.DEFAULT_VALUE) ? (VideoPreviewParam) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e045bed712006dfbbd172e8bea33f0ee") : new VideoPreviewParam(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VideoPreviewParam[] newArray(int i) {
            return new VideoPreviewParam[i];
        }
    };
    public static ChangeQuickRedirect a;
    public final int b;
    public final String c;
    public final String d;
    public final long g;
    public boolean h;
    public String i;

    @Override // com.meituan.android.ptcommonim.video.model.VideoBaseParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VideoPreviewParam(int i, JSONObject jSONObject, String str, String str2, long j) {
        super(jSONObject);
        Object[] objArr = {Integer.valueOf(i), jSONObject, str, str2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5bbf5fc85de19107b5e362d0e88ae52", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5bbf5fc85de19107b5e362d0e88ae52");
            return;
        }
        this.b = i;
        this.c = str;
        this.d = str2;
        this.g = j;
    }

    public VideoPreviewParam(int i, JSONObject jSONObject, String str, String str2, long j, String str3) {
        super(jSONObject);
        Object[] objArr = {0, jSONObject, str, str2, new Long(j), str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "646e064599771ce024f5d51dd598926c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "646e064599771ce024f5d51dd598926c");
            return;
        }
        this.b = 0;
        this.c = str;
        this.d = str2;
        this.g = j;
        this.i = str3;
    }

    public static VideoPreviewParam a(int i, JSONObject jSONObject, String str) {
        Object[] objArr = {1, jSONObject, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "58288a0b3ea8cef49d47ca9168b8ea27", RobustBitConfig.DEFAULT_VALUE)) {
            return (VideoPreviewParam) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "58288a0b3ea8cef49d47ca9168b8ea27");
        }
        VideoPreviewParam videoPreviewParam = new VideoPreviewParam(1, jSONObject, str, "", 0L);
        videoPreviewParam.h = true;
        return videoPreviewParam;
    }

    public VideoPreviewParam(Parcel parcel) {
        super(parcel);
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce18a5bbc5c786bae7dec09794e1948c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce18a5bbc5c786bae7dec09794e1948c");
            return;
        }
        this.b = parcel.readInt();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.g = parcel.readLong();
        this.h = parcel.readByte() != 0;
        this.i = parcel.readString();
    }

    @Override // com.meituan.android.ptcommonim.video.model.VideoBaseParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adba3699ea7614aa7024a3977ca4ac6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adba3699ea7614aa7024a3977ca4ac6c");
            return;
        }
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeLong(this.g);
        parcel.writeByte(this.h ? (byte) 1 : (byte) 0);
        parcel.writeString(this.i);
    }
}
