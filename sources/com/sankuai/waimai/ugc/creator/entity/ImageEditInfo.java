package com.sankuai.waimai.ugc.creator.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class ImageEditInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<ImageEditInfo> CREATOR = new Parcelable.Creator<ImageEditInfo>() { // from class: com.sankuai.waimai.ugc.creator.entity.ImageEditInfo.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ImageEditInfo createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a50c8b52725f6f2e3179a769334137f", RobustBitConfig.DEFAULT_VALUE) ? (ImageEditInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a50c8b52725f6f2e3179a769334137f") : new ImageEditInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ImageEditInfo[] newArray(int i) {
            return new ImageEditInfo[i];
        }
    };
    public static ChangeQuickRedirect a;
    @SerializedName("rawSource")
    public int b;
    @SerializedName("rawPath")
    public String c;
    @SerializedName("rawUrl")
    public String d;
    @SerializedName("cropBoundsRatio")
    public float e;
    @SerializedName("matrixValues")
    public float[] f;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ImageEditInfo() {
    }

    public ImageEditInfo(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57d6b9518b6aed80adc809b880e2c668", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57d6b9518b6aed80adc809b880e2c668");
            return;
        }
        this.b = parcel.readInt();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readFloat();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            this.f = new float[readInt];
            parcel.readFloatArray(this.f);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e24548cf6d040d5080601fb67ef2152", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e24548cf6d040d5080601fb67ef2152");
            return;
        }
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeFloat(this.e);
        if (this.f != null) {
            parcel.writeInt(this.f.length);
            parcel.writeFloatArray(this.f);
        }
    }
}
