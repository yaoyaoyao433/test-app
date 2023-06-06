package com.sankuai.waimai.bussiness.order.base.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PayParams implements Parcelable {
    public static final Parcelable.Creator<PayParams> CREATOR = new Parcelable.Creator<PayParams>() { // from class: com.sankuai.waimai.bussiness.order.base.pay.PayParams.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PayParams createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38873e9904f7cec35ca27df6e03d8638", RobustBitConfig.DEFAULT_VALUE) ? (PayParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38873e9904f7cec35ca27df6e03d8638") : new PayParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PayParams[] newArray(int i) {
            return new PayParams[i];
        }
    };
    public static ChangeQuickRedirect a = null;
    public static String b = "oneclickpay";
    public static String c = "traditionpay";
    public static String d = "weekpay";
    public int e;
    public String f;
    public String g;
    public boolean h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public PayParams() {
    }

    public PayParams(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d60f572015854af7675d242f0f5b329", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d60f572015854af7675d242f0f5b329");
            return;
        }
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readInt() == 1;
        this.i = parcel.readString();
        this.j = parcel.readString();
        this.k = parcel.readString();
        this.l = parcel.readString();
        this.m = parcel.readString();
        this.n = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc25d58453f31874466a60c40a51de19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc25d58453f31874466a60c40a51de19");
            return;
        }
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeString(this.l);
        parcel.writeString(this.m);
        parcel.writeString(this.n);
    }
}
