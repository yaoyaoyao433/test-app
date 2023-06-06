package com.meituan.android.ptcommonim.video.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PicPreviewParam extends VideoBaseParam {
    public static final Parcelable.Creator<PicPreviewParam> CREATOR = new Parcelable.Creator<PicPreviewParam>() { // from class: com.meituan.android.ptcommonim.video.model.PicPreviewParam.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PicPreviewParam createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3318d84d8635dae11dd54f1013893696", RobustBitConfig.DEFAULT_VALUE) ? (PicPreviewParam) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3318d84d8635dae11dd54f1013893696") : new PicPreviewParam(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PicPreviewParam[] newArray(int i) {
            return new PicPreviewParam[i];
        }
    };
    public static ChangeQuickRedirect a;
    public List<PicItemParam> b;
    public PicItemParam c;
    public String d;

    @Override // com.meituan.android.ptcommonim.video.model.VideoBaseParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public PicPreviewParam(JSONObject jSONObject, List<PicItemParam> list, PicItemParam picItemParam, String str) {
        super(jSONObject);
        Object[] objArr = {jSONObject, list, null, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6bb017c1db702f47ad2492c625ddd0b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6bb017c1db702f47ad2492c625ddd0b");
            return;
        }
        this.b = list;
        this.c = null;
        this.d = str;
    }

    public PicPreviewParam(Parcel parcel) {
        super(parcel);
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50d189fce9aa065dc106b21dcd769e5e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50d189fce9aa065dc106b21dcd769e5e");
            return;
        }
        this.b = parcel.createTypedArrayList(PicItemParam.CREATOR);
        this.c = (PicItemParam) parcel.readParcelable(PicItemParam.class.getClassLoader());
        this.d = parcel.readString();
    }

    @Override // com.meituan.android.ptcommonim.video.model.VideoBaseParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e82bec1a86e70d590581a5591efcd01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e82bec1a86e70d590581a5591efcd01");
            return;
        }
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d);
    }
}
