package com.meituan.android.downloadmanager.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DownloadException implements Parcelable {
    public static final Parcelable.Creator<DownloadException> CREATOR = new Parcelable.Creator<DownloadException>() { // from class: com.meituan.android.downloadmanager.model.DownloadException.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DownloadException createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b6418e9dcea46a8414eb6f53d369a99", RobustBitConfig.DEFAULT_VALUE) ? (DownloadException) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b6418e9dcea46a8414eb6f53d369a99") : new DownloadException(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DownloadException[] newArray(int i) {
            return new DownloadException[i];
        }
    };
    public static ChangeQuickRedirect a;
    private List<StackTraceElementCustom> b;
    private String c;
    private String d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public DownloadException(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf412496b545832649e265499cc97276", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf412496b545832649e265499cc97276");
            return;
        }
        this.b = new ArrayList();
        this.c = exc.getClass().getName();
        this.d = exc.getMessage();
        for (StackTraceElement stackTraceElement : exc.getStackTrace()) {
            this.b.add(new StackTraceElementCustom(stackTraceElement));
        }
    }

    public final Exception a() {
        Exception bVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28d9daaabe3519185483bda0665affcc", RobustBitConfig.DEFAULT_VALUE)) {
            return (Exception) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28d9daaabe3519185483bda0665affcc");
        }
        try {
            bVar = (Exception) Class.forName(this.c).getConstructor(String.class).newInstance(this.d);
        } catch (Throwable th) {
            th.printStackTrace();
            bVar = new b(this.d);
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[this.b.size()];
        for (int i = 0; i < this.b.size(); i++) {
            StackTraceElementCustom stackTraceElementCustom = this.b.get(i);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = StackTraceElementCustom.a;
            stackTraceElementArr[i] = PatchProxy.isSupport(objArr2, stackTraceElementCustom, changeQuickRedirect2, false, "8fe2639ae0906780f637f698d2529fc5", RobustBitConfig.DEFAULT_VALUE) ? (StackTraceElement) PatchProxy.accessDispatch(objArr2, stackTraceElementCustom, changeQuickRedirect2, false, "8fe2639ae0906780f637f698d2529fc5") : new StackTraceElement(stackTraceElementCustom.b, stackTraceElementCustom.c, stackTraceElementCustom.d, stackTraceElementCustom.e);
        }
        bVar.setStackTrace(stackTraceElementArr);
        return bVar;
    }

    public DownloadException(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f7b7e8121a2afb704df5b0ef43d9c35", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f7b7e8121a2afb704df5b0ef43d9c35");
            return;
        }
        this.b = new ArrayList();
        this.b = parcel.createTypedArrayList(StackTraceElementCustom.CREATOR);
        this.c = parcel.readString();
        this.d = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5dd7450b548b4d66d9d83f2b313db1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5dd7450b548b4d66d9d83f2b313db1a");
            return;
        }
        parcel.writeTypedList(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class StackTraceElementCustom implements Parcelable {
        public static final Parcelable.Creator<StackTraceElementCustom> CREATOR = new Parcelable.Creator<StackTraceElementCustom>() { // from class: com.meituan.android.downloadmanager.model.DownloadException.StackTraceElementCustom.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ StackTraceElementCustom createFromParcel(Parcel parcel) {
                Object[] objArr = {parcel};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e44ae1b35c640153fdd73db82bfabb6f", RobustBitConfig.DEFAULT_VALUE) ? (StackTraceElementCustom) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e44ae1b35c640153fdd73db82bfabb6f") : new StackTraceElementCustom(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ StackTraceElementCustom[] newArray(int i) {
                return new StackTraceElementCustom[i];
            }
        };
        public static ChangeQuickRedirect a;
        String b;
        String c;
        String d;
        int e;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public StackTraceElementCustom(StackTraceElement stackTraceElement) {
            Object[] objArr = {stackTraceElement};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b147a1887920fa4450d2d9c1e033fd60", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b147a1887920fa4450d2d9c1e033fd60");
                return;
            }
            try {
                Field declaredField = stackTraceElement.getClass().getDeclaredField("declaringClass");
                declaredField.setAccessible(true);
                this.b = (String) declaredField.get(stackTraceElement);
            } catch (Exception e) {
                e.printStackTrace();
                this.b = this.b != null ? this.b : "";
            }
            this.c = stackTraceElement.getMethodName();
            this.d = stackTraceElement.getFileName();
            this.e = stackTraceElement.getLineNumber();
        }

        public StackTraceElementCustom(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d56022c67d36960622aa97bf74e19ff", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d56022c67d36960622aa97bf74e19ff");
                return;
            }
            this.b = parcel.readString();
            this.c = parcel.readString();
            this.d = parcel.readString();
            this.e = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            Object[] objArr = {parcel, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c461461a33ee21eb378f0060d324a85a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c461461a33ee21eb378f0060d324a85a");
                return;
            }
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeInt(this.e);
        }
    }
}
