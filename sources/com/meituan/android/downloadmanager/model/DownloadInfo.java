package com.meituan.android.downloadmanager.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DownloadInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<DownloadInfo> CREATOR = new Parcelable.Creator<DownloadInfo>() { // from class: com.meituan.android.downloadmanager.model.DownloadInfo.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DownloadInfo createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0401884217f5982dbb7be80f7e364c70", RobustBitConfig.DEFAULT_VALUE) ? (DownloadInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0401884217f5982dbb7be80f7e364c70") : new DownloadInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DownloadInfo[] newArray(int i) {
            return new DownloadInfo[i];
        }
    };
    public static ChangeQuickRedirect a;
    public long b;
    public long c;
    public String d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public DownloadInfo() {
    }

    public DownloadInfo(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a69022095e75f5eacccb87213dc31c75", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a69022095e75f5eacccb87213dc31c75");
            return;
        }
        this.b = parcel.readLong();
        this.c = parcel.readLong();
        this.d = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "383a3ad872aa3bd572f222536da3d808", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "383a3ad872aa3bd572f222536da3d808");
            return;
        }
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeString(this.d);
    }
}
