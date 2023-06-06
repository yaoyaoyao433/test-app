package com.meituan.android.ptcommonim.video.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PicItemParam implements Parcelable {
    public static final Parcelable.Creator<PicItemParam> CREATOR = new Parcelable.Creator<PicItemParam>() { // from class: com.meituan.android.ptcommonim.video.model.PicItemParam.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PicItemParam createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c89011a3272c4a9024a529e3592e9ae1", RobustBitConfig.DEFAULT_VALUE) ? (PicItemParam) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c89011a3272c4a9024a529e3592e9ae1") : new PicItemParam(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PicItemParam[] newArray(int i) {
            return new PicItemParam[i];
        }
    };
    public static ChangeQuickRedirect a;
    public String b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public PicItemParam(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44866200f63968b45f9074a9491625fe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44866200f63968b45f9074a9491625fe");
        } else {
            this.b = str;
        }
    }

    public PicItemParam(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1fadf482dd40d0844cdb66be638ff14", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1fadf482dd40d0844cdb66be638ff14");
        } else {
            this.b = parcel.readString();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8be1c0cdc28049c9bb7123ddd8d941b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8be1c0cdc28049c9bb7123ddd8d941b");
        } else {
            parcel.writeString(this.b);
        }
    }
}
