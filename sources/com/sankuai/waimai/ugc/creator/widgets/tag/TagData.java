package com.sankuai.waimai.ugc.creator.widgets.tag;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TagData implements Parcelable, Serializable {
    public static final Parcelable.Creator<TagData> CREATOR = new Parcelable.Creator<TagData>() { // from class: com.sankuai.waimai.ugc.creator.widgets.tag.TagData.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TagData createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "326b28b21e3a79bc24b3c49dfb0f3be5", RobustBitConfig.DEFAULT_VALUE) ? (TagData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "326b28b21e3a79bc24b3c49dfb0f3be5") : new TagData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TagData[] newArray(int i) {
            return new TagData[i];
        }
    };
    public static ChangeQuickRedirect a;
    @SerializedName("type")
    public int b;
    @SerializedName("direction")
    public int c;
    @SerializedName("text")
    public String d;
    @SerializedName("tagReferId")
    public String e;
    @SerializedName("anchorX")
    public float f;
    @SerializedName("anchorY")
    public float g;
    @SerializedName("extra")
    public String h;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public TagData() {
    }

    public TagData(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96c9976a4fa386e78129df94294020e1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96c9976a4fa386e78129df94294020e1");
            return;
        }
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readFloat();
        this.g = parcel.readFloat();
        this.h = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20a8359799c851972dde90c63b48bce4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20a8359799c851972dde90c63b48bce4");
            return;
        }
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeFloat(this.f);
        parcel.writeFloat(this.g);
        parcel.writeString(this.h);
    }
}
