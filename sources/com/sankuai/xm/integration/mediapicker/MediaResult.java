package com.sankuai.xm.integration.mediapicker;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class MediaResult implements Parcelable {
    public static final Parcelable.Creator<MediaResult> CREATOR = new Parcelable.Creator<MediaResult>() { // from class: com.sankuai.xm.integration.mediapicker.MediaResult.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MediaResult createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8a2704b9f9447aea4cd816c02dd5cdb", 6917529027641081856L) ? (MediaResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8a2704b9f9447aea4cd816c02dd5cdb") : new MediaResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MediaResult[] newArray(int i) {
            return new MediaResult[i];
        }
    };
    public static ChangeQuickRedirect a;
    public Uri b;
    public int c;
    public boolean d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public MediaResult(Uri uri, int i) {
        Object[] objArr = {uri, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef7a75d8febefb9390497edd6100eda5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef7a75d8febefb9390497edd6100eda5");
            return;
        }
        this.d = false;
        this.b = uri;
        this.c = i;
    }

    public MediaResult(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58b9be30eee3066034302ac771528d7c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58b9be30eee3066034302ac771528d7c");
            return;
        }
        this.d = false;
        this.b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.c = parcel.readInt();
        this.d = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2f785d13bef0f9f8df195fbfe88765e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2f785d13bef0f9f8df195fbfe88765e");
            return;
        }
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
    }
}
