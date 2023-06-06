package org.simalliance.openmobileapi.service;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class SmartcardError implements Parcelable {
    public static final Parcelable.Creator<SmartcardError> CREATOR = new Parcelable.Creator<SmartcardError>() { // from class: org.simalliance.openmobileapi.service.SmartcardError.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SmartcardError[] newArray(int i) {
            return new SmartcardError[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SmartcardError createFromParcel(Parcel parcel) {
            return new SmartcardError(parcel);
        }
    };
    private String a;
    private String b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SmartcardError() {
        this.a = "";
        this.b = "";
    }

    private SmartcardError(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
    }

    public final void a() {
        this.a = "";
        this.b = "";
    }

    public final Exception b() {
        try {
            if (this.a.length() == 0) {
                return null;
            }
            return this.b.length() == 0 ? (Exception) Class.forName(this.a).newInstance() : (Exception) Class.forName(this.a).getConstructor(String.class).newInstance(this.b);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void a(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
    }

    public final void c() throws a {
        Exception b = b();
        if (b == null) {
            return;
        }
        if (b instanceof a) {
            throw ((a) b);
        }
        if (b instanceof RuntimeException) {
            throw ((RuntimeException) b);
        }
        throw new RuntimeException(b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
