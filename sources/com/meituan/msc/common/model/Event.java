package com.meituan.msc.common.model;

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
    public static final Parcelable.Creator<Event> CREATOR = new Parcelable.Creator<Event>() { // from class: com.meituan.msc.common.model.Event.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Event createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "764360c13d492ddaef49ea74e68aa2f3", RobustBitConfig.DEFAULT_VALUE) ? (Event) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "764360c13d492ddaef49ea74e68aa2f3") : new Event(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Event[] newArray(int i) {
            return new Event[i];
        }
    };
    public static ChangeQuickRedirect a;
    public String b;
    private String c;
    private volatile JSONObject d;
    private String e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    private Event(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e0aa63902ad4a7df3e4a9e7e3f586a1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e0aa63902ad4a7df3e4a9e7e3f586a1");
            return;
        }
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.e = parcel.readString();
    }

    @NonNull
    public final JSONObject a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6aa5597889e4ffa170f076858ce8a4c8", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6aa5597889e4ffa170f076858ce8a4c8");
        }
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    if (this.c != null) {
                        try {
                            this.d = new JSONObject(this.c);
                        } catch (JSONException unused) {
                            this.d = new JSONObject();
                        }
                    } else {
                        this.d = new JSONObject();
                    }
                }
            }
        }
        return this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02d391061007603cc75dfc0a3beb5443", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02d391061007603cc75dfc0a3beb5443");
            return;
        }
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.e);
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ead6eed5fd0d7e9b32296d24269e048", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ead6eed5fd0d7e9b32296d24269e048")).booleanValue();
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
                return this.e != null ? this.e.equals(event.e) : event.e == null;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19698689eade75466280c7b737a0a7df", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19698689eade75466280c7b737a0a7df")).intValue();
        }
        return ((((this.b != null ? this.b.hashCode() : 0) * 31) + (this.c != null ? this.c.hashCode() : 0)) * 31) + (this.e != null ? this.e.hashCode() : 0);
    }
}
