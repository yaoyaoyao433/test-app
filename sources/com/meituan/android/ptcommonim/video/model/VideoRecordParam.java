package com.meituan.android.ptcommonim.video.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.alipay.sdk.app.PayTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class VideoRecordParam extends VideoBaseParam {
    public static final Parcelable.Creator<VideoRecordParam> CREATOR = new Parcelable.Creator<VideoRecordParam>() { // from class: com.meituan.android.ptcommonim.video.model.VideoRecordParam.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VideoRecordParam createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86d9cb1a6af8cfd1a0da33a4b6768a45", RobustBitConfig.DEFAULT_VALUE) ? (VideoRecordParam) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86d9cb1a6af8cfd1a0da33a4b6768a45") : new VideoRecordParam(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VideoRecordParam[] newArray(int i) {
            return new VideoRecordParam[i];
        }
    };
    public static ChangeQuickRedirect a;
    private final long b;

    @Override // com.meituan.android.ptcommonim.video.model.VideoBaseParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VideoRecordParam(JSONObject jSONObject, long j) {
        super(jSONObject);
        Object[] objArr = {jSONObject, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5fda49269d593d90c9757a32831ff5d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5fda49269d593d90c9757a32831ff5d");
        } else {
            this.b = j;
        }
    }

    public VideoRecordParam(Parcel parcel) {
        super(parcel);
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00b39f1eb34062b273f2c2bb9779d168", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00b39f1eb34062b273f2c2bb9779d168");
        } else {
            this.b = parcel.readLong();
        }
    }

    @Override // com.meituan.android.ptcommonim.video.model.VideoBaseParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2c5bb50ebd5574ac788eee4d7378bb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2c5bb50ebd5574ac788eee4d7378bb8");
            return;
        }
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.b);
    }

    public final long a() {
        if (this.b < PayTask.j) {
            return 2700L;
        }
        if (this.b > 600000) {
            return 599700L;
        }
        return this.b - 300;
    }
}
