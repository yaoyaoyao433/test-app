package com.meituan.passport.pojo;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.RestrictTo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class YodaConfirmData implements Parcelable {
    public static final Parcelable.Creator<YodaConfirmData> CREATOR = new Parcelable.Creator<YodaConfirmData>() { // from class: com.meituan.passport.pojo.YodaConfirmData.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final YodaConfirmData createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f8fb2e692321549364f2b1d2f9fabc9", RobustBitConfig.DEFAULT_VALUE) ? (YodaConfirmData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f8fb2e692321549364f2b1d2f9fabc9") : new YodaConfirmData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final YodaConfirmData[] newArray(int i) {
            return new YodaConfirmData[i];
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    public String jumpUrl;
    public String param;
    public String succCallbackUrl;
    public String userTicket;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public YodaConfirmData() {
    }

    public YodaConfirmData(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9839b767a98906029e2163129234c61", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9839b767a98906029e2163129234c61");
            return;
        }
        this.jumpUrl = parcel.readString();
        this.userTicket = parcel.readString();
        this.succCallbackUrl = parcel.readString();
        this.param = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e7046a8bd8c7b32594e9fdac898fa146", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e7046a8bd8c7b32594e9fdac898fa146");
            return;
        }
        parcel.writeString(this.jumpUrl);
        parcel.writeString(this.userTicket);
        parcel.writeString(this.succCallbackUrl);
        parcel.writeString(this.param);
    }
}
