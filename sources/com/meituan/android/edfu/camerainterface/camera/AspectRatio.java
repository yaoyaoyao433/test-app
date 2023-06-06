package com.meituan.android.edfu.camerainterface.camera;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AspectRatio implements Parcelable, Comparable<AspectRatio> {
    public static ChangeQuickRedirect a;
    public final int c;
    public final int d;
    public static final AspectRatio b = new AspectRatio(16, 9);
    private static final SparseArray<SparseArray<AspectRatio>> e = new SparseArray<>(16);
    public static final Parcelable.Creator<AspectRatio> CREATOR = new Parcelable.Creator<AspectRatio>() { // from class: com.meituan.android.edfu.camerainterface.camera.AspectRatio.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AspectRatio createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba3b2048267224c251a3c79904b3af36", RobustBitConfig.DEFAULT_VALUE) ? (AspectRatio) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba3b2048267224c251a3c79904b3af36") : AspectRatio.a(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ AspectRatio[] newArray(int i) {
            return new AspectRatio[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(AspectRatio aspectRatio) {
        AspectRatio aspectRatio2 = aspectRatio;
        Object[] objArr = {aspectRatio2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b36883e1c0c57517a89f18cda36f7ccd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b36883e1c0c57517a89f18cda36f7ccd")).intValue();
        }
        if (equals(aspectRatio2)) {
            return 0;
        }
        return a() - aspectRatio2.a() > 0.0f ? 1 : -1;
    }

    public static AspectRatio a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1e8a9ecf8e35ae766cdfacfdd4d4816c", RobustBitConfig.DEFAULT_VALUE)) {
            return (AspectRatio) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1e8a9ecf8e35ae766cdfacfdd4d4816c");
        }
        int b2 = b(i, i2);
        int i3 = i / b2;
        int i4 = i2 / b2;
        SparseArray<AspectRatio> sparseArray = e.get(i3);
        if (sparseArray == null) {
            AspectRatio aspectRatio = new AspectRatio(i3, i4);
            SparseArray<AspectRatio> sparseArray2 = new SparseArray<>();
            sparseArray2.put(i4, aspectRatio);
            e.put(i3, sparseArray2);
            return aspectRatio;
        }
        AspectRatio aspectRatio2 = sparseArray.get(i4);
        if (aspectRatio2 == null) {
            AspectRatio aspectRatio3 = new AspectRatio(i3, i4);
            sparseArray.put(i4, aspectRatio3);
            return aspectRatio3;
        }
        return aspectRatio2;
    }

    public static AspectRatio a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "26e87a05531406ec9382290b1bbff154", RobustBitConfig.DEFAULT_VALUE)) {
            return (AspectRatio) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "26e87a05531406ec9382290b1bbff154");
        }
        int indexOf = str.indexOf(58);
        if (indexOf == -1) {
            throw new IllegalArgumentException("Malformed aspect ratio: " + str);
        }
        try {
            return a(Integer.parseInt(str.substring(0, indexOf)), Integer.parseInt(str.substring(indexOf + 1)));
        } catch (NumberFormatException e2) {
            throw new IllegalArgumentException("Malformed aspect ratio: " + str, e2);
        }
    }

    private AspectRatio(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d3ec5f8a30dd93ed7bf539b958fba14", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d3ec5f8a30dd93ed7bf539b958fba14");
            return;
        }
        this.c = i;
        this.d = i2;
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccddb43550f032c141d4ac06bc897694", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccddb43550f032c141d4ac06bc897694")).booleanValue();
        }
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof AspectRatio) {
            AspectRatio aspectRatio = (AspectRatio) obj;
            return this.c == aspectRatio.c && this.d == aspectRatio.d;
        }
        return false;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4ff053961acb0168cf629bb3514453c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4ff053961acb0168cf629bb3514453c");
        }
        return this.c + CommonConstant.Symbol.COLON + this.d;
    }

    public final float a() {
        return this.c / this.d;
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a27f2d130026c67d6a213a1835e6d1f5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a27f2d130026c67d6a213a1835e6d1f5")).intValue() : this.d ^ ((this.c << 16) | (this.c >>> 16));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fb7845ffa88336f7bff00d603570f0c0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fb7845ffa88336f7bff00d603570f0c0")).intValue();
        }
        while (true) {
            int i3 = i2;
            int i4 = i;
            i = i3;
            if (i == 0) {
                return i4;
            }
            i2 = i4 % i;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bd85d211621bb7cbc4222fda923ae3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bd85d211621bb7cbc4222fda923ae3c");
            return;
        }
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }
}
