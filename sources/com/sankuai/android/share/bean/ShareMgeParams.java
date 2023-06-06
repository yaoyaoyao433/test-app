package com.sankuai.android.share.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ShareMgeParams implements Parcelable {
    public static final Parcelable.Creator<ShareMgeParams> CREATOR = new Parcelable.Creator<ShareMgeParams>() { // from class: com.sankuai.android.share.bean.ShareMgeParams.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShareMgeParams createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4215f02c41ad667295e1699384b6719d", RobustBitConfig.DEFAULT_VALUE) ? (ShareMgeParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4215f02c41ad667295e1699384b6719d") : new ShareMgeParams(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShareMgeParams[] newArray(int i) {
            return new ShareMgeParams[i];
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    private Params failedMge;
    private int from;
    private Params successMge;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ShareMgeParams() {
    }

    public ShareMgeParams(Params params, Params params2) {
        Object[] objArr = {params, params2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a58fa3ee73deb36ddf8bac0b29e4d77", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a58fa3ee73deb36ddf8bac0b29e4d77");
            return;
        }
        this.successMge = params;
        this.failedMge = params2;
    }

    public ShareMgeParams(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "86f7b6a8f347385bf1ee67ad2b20160b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "86f7b6a8f347385bf1ee67ad2b20160b");
            return;
        }
        this.from = parcel.readInt();
        this.successMge = (Params) parcel.readParcelable(Params.class.getClassLoader());
        this.failedMge = (Params) parcel.readParcelable(Params.class.getClassLoader());
    }

    public int getFrom() {
        return this.from;
    }

    public void setFrom(int i) {
        this.from = i;
    }

    public Params getSuccessMge() {
        return this.successMge;
    }

    public void setSuccessMge(Params params) {
        this.successMge = params;
    }

    public Params getFailedMge() {
        return this.failedMge;
    }

    public void setFailedMge(Params params) {
        this.failedMge = params;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4cc60bf941164fa5caaa1851edd4272", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4cc60bf941164fa5caaa1851edd4272");
            return;
        }
        parcel.writeInt(this.from);
        parcel.writeParcelable(this.successMge, i);
        parcel.writeParcelable(this.failedMge, i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class Params implements Parcelable {
        public static final Parcelable.Creator<Params> CREATOR = new Parcelable.Creator<Params>() { // from class: com.sankuai.android.share.bean.ShareMgeParams.Params.1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Params createFromParcel(Parcel parcel) {
                Object[] objArr = {parcel};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db43fa3e68124e83690ea584670f2293", RobustBitConfig.DEFAULT_VALUE) ? (Params) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db43fa3e68124e83690ea584670f2293") : new Params(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Params[] newArray(int i) {
                return new Params[i];
            }
        };
        public static ChangeQuickRedirect changeQuickRedirect;
        public String act;
        public String cid;
        public String lab;
        public String val;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public Params(String str, String str2, String str3, String str4) {
            Object[] objArr = {str, str2, str3, str4};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ebaeba880ac69b6ddc73428eba5a19fb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ebaeba880ac69b6ddc73428eba5a19fb");
                return;
            }
            this.cid = str;
            this.act = str2;
            this.lab = str3;
            this.val = str4;
        }

        public Params(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "946967df40d08aa4ddeace0f7db5c935", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "946967df40d08aa4ddeace0f7db5c935");
                return;
            }
            this.val = parcel.readString();
            this.lab = parcel.readString();
            this.act = parcel.readString();
            this.cid = parcel.readString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            Object[] objArr = {parcel, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c135dcb8d3535b2a4cab52f52495315b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c135dcb8d3535b2a4cab52f52495315b");
                return;
            }
            parcel.writeString(this.val);
            parcel.writeString(this.lab);
            parcel.writeString(this.act);
            parcel.writeString(this.cid);
        }
    }
}
