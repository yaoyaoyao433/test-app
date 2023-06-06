package com.meituan.mmp.lib.update;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MMPUpdateConfig implements Parcelable {
    public static final Parcelable.Creator<MMPUpdateConfig> CREATOR = new Parcelable.Creator<MMPUpdateConfig>() { // from class: com.meituan.mmp.lib.update.MMPUpdateConfig.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MMPUpdateConfig createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cfe46378f2b89e31b8d341fadc595cc", RobustBitConfig.DEFAULT_VALUE) ? (MMPUpdateConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cfe46378f2b89e31b8d341fadc595cc") : new MMPUpdateConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MMPUpdateConfig[] newArray(int i) {
            return new MMPUpdateConfig[i];
        }
    };
    public static ChangeQuickRedirect a;
    public String b;
    public boolean c;
    public String d;
    public String e;
    public MMPAppProp f;
    public boolean g;
    public int h;
    public boolean i;
    public boolean j;
    public String k;
    public String l;
    public List<MMPPackageInfo> m;
    public List<MMPPackageInfo> n;
    public List<MMPPackageInfo> o;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public MMPUpdateConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4a5e41535269f7581f4b13316c791e1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4a5e41535269f7581f4b13316c791e1");
            return;
        }
        this.c = true;
        this.i = false;
        this.n = new CopyOnWriteArrayList();
        this.o = new CopyOnWriteArrayList();
    }

    public MMPUpdateConfig(MMPUpdateConfig mMPUpdateConfig) {
        Object[] objArr = {mMPUpdateConfig};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "548b1ed6ab0ae633fe30ad1e0f9c1bc5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "548b1ed6ab0ae633fe30ad1e0f9c1bc5");
            return;
        }
        this.c = true;
        this.i = false;
        this.n = new CopyOnWriteArrayList();
        this.o = new CopyOnWriteArrayList();
        this.b = mMPUpdateConfig.b;
        this.c = mMPUpdateConfig.c;
        this.h = mMPUpdateConfig.h;
        this.l = mMPUpdateConfig.l;
        this.d = mMPUpdateConfig.d;
        this.e = mMPUpdateConfig.e;
        this.g = mMPUpdateConfig.g;
        this.k = mMPUpdateConfig.k;
        this.f = mMPUpdateConfig.f;
        this.m = mMPUpdateConfig.m;
    }

    public MMPUpdateConfig(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9c0c91ee0569ded58a4fabff0302510", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9c0c91ee0569ded58a4fabff0302510");
            return;
        }
        this.c = true;
        this.i = false;
        this.n = new CopyOnWriteArrayList();
        this.o = new CopyOnWriteArrayList();
        this.b = parcel.readString();
        this.c = parcel.readByte() != 0;
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = (MMPAppProp) parcel.readParcelable(MMPAppProp.class.getClassLoader());
        this.g = parcel.readByte() != 0;
        this.h = parcel.readInt();
        this.i = parcel.readByte() != 0;
        this.k = parcel.readString();
        this.l = parcel.readString();
        this.m = parcel.createTypedArrayList(MMPPackageInfo.CREATOR);
        this.n = new CopyOnWriteArrayList(parcel.createTypedArrayList(MMPPackageInfo.CREATOR));
        this.o = new CopyOnWriteArrayList(parcel.createTypedArrayList(MMPPackageInfo.CREATOR));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f882664f96737ef3a9a7f5cff85a4f69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f882664f96737ef3a9a7f5cff85a4f69");
            return;
        }
        parcel.writeString(this.b);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeParcelable(this.f, i);
        parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.h);
        parcel.writeByte(this.i ? (byte) 1 : (byte) 0);
        parcel.writeString(this.k);
        parcel.writeString(this.l);
        parcel.writeTypedList(this.m);
        parcel.writeTypedList(this.n);
        parcel.writeTypedList(this.o);
    }

    public final boolean a() {
        return this.h == 1 || this.h == 7;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9cffad4bfdf8f71b96a29bda1dce231", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9cffad4bfdf8f71b96a29bda1dce231");
        }
        return getClass().getName() + "@" + Integer.toHexString(hashCode()) + " appId:" + this.b + " path: " + this.l + " dtype: " + this.h;
    }
}
