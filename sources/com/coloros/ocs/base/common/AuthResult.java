package com.coloros.ocs.base.common;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class AuthResult implements Parcelable {
    public static final Parcelable.Creator<AuthResult> CREATOR = new Parcelable.Creator<AuthResult>() { // from class: com.coloros.ocs.base.common.AuthResult.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ AuthResult[] newArray(int i) {
            return new AuthResult[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AuthResult createFromParcel(Parcel parcel) {
            return new AuthResult(parcel);
        }
    };
    public int a;
    private String b;
    private int c;
    private int d;
    private byte[] e;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public AuthResult(String str, int i, int i2, int i3, byte[] bArr) {
        this.b = str;
        this.c = 0;
        this.d = 0;
        this.a = i3;
        this.e = bArr;
        com.coloros.ocs.base.a.a.b("AuthResult", "AuthResult errorCode is " + this.a);
    }

    protected AuthResult(Parcel parcel) {
        this.b = parcel.readString();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.a = parcel.readInt();
        this.e = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.a);
        parcel.writeByteArray(this.e);
    }
}
