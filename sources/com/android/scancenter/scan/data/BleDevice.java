package com.android.scancenter.scan.data;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class BleDevice implements Parcelable {
    public static final Parcelable.Creator<BleDevice> CREATOR = new Parcelable.Creator<BleDevice>() { // from class: com.android.scancenter.scan.data.BleDevice.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ BleDevice[] newArray(int i) {
            return new BleDevice[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BleDevice createFromParcel(Parcel parcel) {
            return new BleDevice(parcel);
        }
    };
    private final BluetoothDevice a;
    private byte[] b;
    private int c;
    private long d;
    private int e;
    private int f;
    private boolean g;
    private int h;
    private int i;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface ScanResultType {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private BleDevice(Parcel parcel) {
        this.e = 1;
        this.g = true;
        this.h = 6;
        this.a = (BluetoothDevice) parcel.readParcelable(BluetoothDevice.class.getClassLoader());
        this.b = parcel.createByteArray();
        this.c = parcel.readInt();
        this.d = parcel.readLong();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt() != 0;
        this.h = parcel.readInt();
        this.i = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeByteArray(this.b);
        parcel.writeInt(this.c);
        parcel.writeLong(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
    }

    private String a() {
        if (this.a != null) {
            return this.a.getAddress();
        }
        return null;
    }

    public String toString() {
        return "BleDevice{mDevice=" + this.a + ", mScanRecord=" + Arrays.toString(this.b) + ", mRssi=" + this.c + ", mTimestampNanos=" + this.d + ", mSource=" + this.e + ", mSecondaryPhy=" + this.f + ", isLegacy=" + this.g + ", isConnectable=" + this.h + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BleDevice bleDevice = (BleDevice) obj;
        if (bleDevice.a() == null || a() == null) {
            return false;
        }
        return bleDevice.a().equalsIgnoreCase(a());
    }

    public int hashCode() {
        String a = a();
        if (a == null) {
            a = "";
        }
        return a.toUpperCase().hashCode();
    }
}
