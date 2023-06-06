package com.sankuai.waimai.ugc.creator.entity.inner;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ugc.creator.entity.ImageEditInfo;
import com.sankuai.waimai.ugc.creator.entity.d;
import com.sankuai.waimai.ugc.creator.widgets.tag.TagData;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class ImageData extends MediaData {
    public static final Parcelable.Creator<ImageData> CREATOR = new Parcelable.Creator<ImageData>() { // from class: com.sankuai.waimai.ugc.creator.entity.inner.ImageData.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ImageData createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efc02213f60cccb135193758bd5e0c19", RobustBitConfig.DEFAULT_VALUE) ? (ImageData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efc02213f60cccb135193758bd5e0c19") : new ImageData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ImageData[] newArray(int i) {
            return new ImageData[i];
        }
    };
    public static ChangeQuickRedirect a;
    public ArrayList<TagData> b;
    public ImageEditInfo c;

    public ImageData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cff1dd8130c0cc9815863b7a470e7b02", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cff1dd8130c0cc9815863b7a470e7b02");
        } else {
            this.g = 1;
        }
    }

    public ImageData(String str, String str2, int i, int i2, int i3, String str3, String str4, long j) {
        super(1, str, str2, i, i2, i3, str3, str4, j);
        Object[] objArr = {str, str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str3, str4, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c64f7e75acfd2e4a4962b452a616792a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c64f7e75acfd2e4a4962b452a616792a");
        }
    }

    public ImageData(Parcel parcel) {
        super(parcel);
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "075bfeea33abf6152e07f799f42b45f6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "075bfeea33abf6152e07f799f42b45f6");
            return;
        }
        this.b = parcel.readArrayList(TagData.class.getClassLoader());
        this.c = (ImageEditInfo) parcel.readParcelable(ImageEditInfo.class.getClassLoader());
    }

    @Override // com.sankuai.waimai.ugc.creator.entity.inner.MediaData, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c6d13455f9ea75c9d3c174a6501d5c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c6d13455f9ea75c9d3c174a6501d5c8");
            return;
        }
        super.writeToParcel(parcel, i);
        parcel.writeList(this.b);
        parcel.writeParcelable(this.c, i);
    }

    public final d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d754d45af8f60d1660e8200f288b4293", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d754d45af8f60d1660e8200f288b4293");
        }
        d dVar = new d();
        dVar.c = this.r;
        dVar.a = this.s;
        dVar.d = this.h;
        dVar.f = this.n;
        dVar.h = this.j;
        dVar.i = this.b;
        dVar.j = this.c;
        if (this.e == 1) {
            dVar.e = this.j;
        } else {
            dVar.e = this.i;
        }
        return dVar;
    }
}
