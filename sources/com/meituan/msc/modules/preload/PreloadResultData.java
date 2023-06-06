package com.meituan.msc.modules.preload;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PreloadResultData implements Parcelable {
    public static final Parcelable.Creator<PreloadResultData> CREATOR = new Parcelable.Creator<PreloadResultData>() { // from class: com.meituan.msc.modules.preload.PreloadResultData.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PreloadResultData createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e1b08b1e8656676558c53c2b29af64f", RobustBitConfig.DEFAULT_VALUE) ? (PreloadResultData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e1b08b1e8656676558c53c2b29af64f") : new PreloadResultData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PreloadResultData[] newArray(int i) {
            return new PreloadResultData[i];
        }
    };
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public boolean d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public PreloadResultData(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a850ef3512ad539c1ddd5635b8324b24", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a850ef3512ad539c1ddd5635b8324b24");
            return;
        }
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
    }

    public PreloadResultData(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e619834d686b0936dd1b60ff4cef7cbc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e619834d686b0936dd1b60ff4cef7cbc");
            return;
        }
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ee761d7bff693c65de655a456855f7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ee761d7bff693c65de655a456855f7e");
            return;
        }
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        public boolean d;

        public a(String str, String str2, boolean z) {
            Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a19799d997e2a39454cf095e7faf3031", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a19799d997e2a39454cf095e7faf3031");
                return;
            }
            this.b = str;
            this.c = str2;
            this.d = z;
        }
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81fe962676e2225aa13adc985f8640d2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81fe962676e2225aa13adc985f8640d2");
        }
        return "PreloadResultData{appId='" + this.b + "', targetPath='" + this.c + "', preloadWebView=" + this.d + '}';
    }
}
