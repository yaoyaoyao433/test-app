package com.sankuai.waimai.ugc.creator.entity.inner;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ugc.creator.entity.e;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class VideoData extends MediaData {
    public static final Parcelable.Creator<VideoData> CREATOR = new Parcelable.Creator<VideoData>() { // from class: com.sankuai.waimai.ugc.creator.entity.inner.VideoData.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VideoData createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4e367fc6f1ee0fea0018f72e2ea9f36", RobustBitConfig.DEFAULT_VALUE) ? (VideoData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4e367fc6f1ee0fea0018f72e2ea9f36") : new VideoData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VideoData[] newArray(int i) {
            return new VideoData[i];
        }
    };
    public static ChangeQuickRedirect a;
    public long b;
    public String c;
    public ImageData t;

    public VideoData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e34a78eb75bb4e82b8308d5a3f73f17", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e34a78eb75bb4e82b8308d5a3f73f17");
        } else {
            this.g = 2;
        }
    }

    public VideoData(String str, String str2, int i, int i2, int i3, String str3, String str4, long j, long j2, String str5) {
        super(2, str, str2, i, i2, i3, str3, str4, j);
        Object[] objArr = {str, str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str3, str4, new Long(j), new Long(j2), str5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49dc7c3e94fe67e1efe68b3f4b52028d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49dc7c3e94fe67e1efe68b3f4b52028d");
            return;
        }
        this.b = j2;
        this.c = str5;
    }

    public VideoData(Parcel parcel) {
        super(parcel);
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ab98be236ee0650b962ed7eb4935239", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ab98be236ee0650b962ed7eb4935239");
            return;
        }
        this.b = parcel.readLong();
        this.c = parcel.readString();
        this.t = (ImageData) parcel.readParcelable(ImageData.class.getClassLoader());
    }

    @Override // com.sankuai.waimai.ugc.creator.entity.inner.MediaData, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "017bdd9b00d13dcfab7bde3ac09ba922", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "017bdd9b00d13dcfab7bde3ac09ba922");
            return;
        }
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.t, i);
    }

    public final e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afefeddb05c1bdce285cb62208de70ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afefeddb05c1bdce285cb62208de70ff");
        }
        e eVar = new e();
        eVar.c = this.t.r;
        eVar.d = this.t.r;
        eVar.e = this.t.h;
        eVar.f = this.r;
        eVar.g = this.r;
        eVar.h = this.h;
        eVar.i = this.l;
        eVar.j = this.m;
        eVar.k = this.b;
        eVar.l = this.n;
        return eVar;
    }
}
