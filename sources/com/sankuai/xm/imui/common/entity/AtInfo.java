package com.sankuai.xm.imui.common.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class AtInfo implements Parcelable {
    public static final Parcelable.Creator<AtInfo> CREATOR = new Parcelable.Creator<AtInfo>() { // from class: com.sankuai.xm.imui.common.entity.AtInfo.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AtInfo createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61794540318a86fa01e4d38e278155ed", 6917529027641081856L) ? (AtInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61794540318a86fa01e4d38e278155ed") : new AtInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ AtInfo[] newArray(int i) {
            return new AtInfo[i];
        }
    };
    public static ChangeQuickRedirect a;
    public long b;
    public String c;
    public long[] d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public AtInfo(long j, String str) {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0fa304c50344b9f56ce11b07d01135a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0fa304c50344b9f56ce11b07d01135a");
            return;
        }
        this.b = j;
        this.c = str;
        this.d = null;
    }

    public AtInfo(long[] jArr, String str) {
        Object[] objArr = {jArr, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f31ead54aee2de99fbbf4f8bf5e78a6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f31ead54aee2de99fbbf4f8bf5e78a6");
            return;
        }
        this.d = jArr;
        this.c = str;
        this.b = 0L;
    }

    public AtInfo(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9f066f9e169b4951987852dff8ad015", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9f066f9e169b4951987852dff8ad015");
            return;
        }
        this.b = parcel.readLong();
        this.c = parcel.readString();
        this.d = parcel.createLongArray();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "746dd18880b53d06e0c68456dcee5250", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "746dd18880b53d06e0c68456dcee5250");
            return;
        }
        parcel.writeLong(this.b);
        parcel.writeString(this.c);
        parcel.writeLongArray(this.d);
    }

    public final boolean a() {
        return this.b != 0;
    }

    public final boolean b() {
        return this.d != null && this.d.length > 0;
    }
}
