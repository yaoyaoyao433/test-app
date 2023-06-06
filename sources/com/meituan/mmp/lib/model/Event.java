package com.meituan.mmp.lib.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class Event implements Parcelable {
    public static final Parcelable.Creator<Event> CREATOR = new Parcelable.Creator<Event>() { // from class: com.meituan.mmp.lib.model.Event.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Event createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "477c78e2b01c091f6c1a81763cd0cb82", RobustBitConfig.DEFAULT_VALUE) ? (Event) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "477c78e2b01c091f6c1a81763cd0cb82") : new Event(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Event[] newArray(int i) {
            return new Event[i];
        }
    };
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public String d;
    private volatile JSONObject e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    private Event(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad14bb895042eeb4459387707227759a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad14bb895042eeb4459387707227759a");
            return;
        }
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
    }

    public Event(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5f2352aa0c7111e918f34f6bf124b97", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5f2352aa0c7111e918f34f6bf124b97");
            return;
        }
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @NonNull
    public final JSONObject a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ff382cd5d0eb3e120320dba27251ed6", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ff382cd5d0eb3e120320dba27251ed6");
        }
        if (this.e == null) {
            synchronized (this) {
                if (this.e == null) {
                    if (this.c != null) {
                        try {
                            this.e = new JSONObject(this.c);
                        } catch (JSONException unused) {
                            this.e = new JSONObject();
                        }
                    } else {
                        this.e = new JSONObject();
                    }
                }
            }
        }
        return this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c45e40fb98dd232bf1171b349f2d419", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c45e40fb98dd232bf1171b349f2d419");
            return;
        }
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97d87d10160f62a88e3a86ae00371479", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97d87d10160f62a88e3a86ae00371479")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Event event = (Event) obj;
        if (this.b == null ? event.b == null : this.b.equals(event.b)) {
            if (this.c == null ? event.c == null : this.c.equals(event.c)) {
                return this.d != null ? this.d.equals(event.d) : event.d == null;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d1be1f2482262ea9ce67d7ad5f4319b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d1be1f2482262ea9ce67d7ad5f4319b")).intValue();
        }
        return ((((this.b != null ? this.b.hashCode() : 0) * 31) + (this.c != null ? this.c.hashCode() : 0)) * 31) + (this.d != null ? this.d.hashCode() : 0);
    }
}
