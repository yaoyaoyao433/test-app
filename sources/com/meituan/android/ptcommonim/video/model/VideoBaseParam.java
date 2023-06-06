package com.meituan.android.ptcommonim.video.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.android.ptcommonim.video.utils.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.JsonHelper;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class VideoBaseParam implements Parcelable {
    public static final Parcelable.Creator<VideoBaseParam> CREATOR = new Parcelable.Creator<VideoBaseParam>() { // from class: com.meituan.android.ptcommonim.video.model.VideoBaseParam.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VideoBaseParam createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c19e55437612b1627769b6c80e1b3c26", RobustBitConfig.DEFAULT_VALUE) ? (VideoBaseParam) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c19e55437612b1627769b6c80e1b3c26") : new VideoBaseParam(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VideoBaseParam[] newArray(int i) {
            return new VideoBaseParam[i];
        }
    };
    public static ChangeQuickRedirect e;
    public JSONObject f;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VideoBaseParam(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54e181bfe57110cf48377cc381c518e4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54e181bfe57110cf48377cc381c518e4");
        } else {
            this.f = jSONObject;
        }
    }

    public VideoBaseParam(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f85045d57db4d386f032d0964febbff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f85045d57db4d386f032d0964febbff");
        } else {
            this.f = (JSONObject) e.a(parcel.readString(), JSONObject.class);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9042348426e369519c3ab9effee58cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9042348426e369519c3ab9effee58cc");
        } else {
            parcel.writeString(this.f != null ? JsonHelper.toJsonString(this.f) : "");
        }
    }
}
