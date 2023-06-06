package com.meituan.android.downloadmanager.model;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class Request implements Parcelable {
    public static final Parcelable.Creator<Request> CREATOR = new Parcelable.Creator<Request>() { // from class: com.meituan.android.downloadmanager.model.Request.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Request createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eadbad3c79a1eae503aea85c5f008dd6", RobustBitConfig.DEFAULT_VALUE) ? (Request) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eadbad3c79a1eae503aea85c5f008dd6") : new Request(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Request[] newArray(int i) {
            return new Request[i];
        }
    };
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public String d;
    public int e;
    public String f;
    public Map<String, String> g;
    public int h;
    public boolean i;
    public PendingIntent j;
    public String k;
    public String l;
    public int m;

    /* compiled from: ProGuard */
    @Target({ElementType.PARAMETER, ElementType.FIELD, ElementType.LOCAL_VARIABLE})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface NetworkType {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Request(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c07fcb4ebfcf8e7c55b1019aa934b724", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c07fcb4ebfcf8e7c55b1019aa934b724");
            return;
        }
        this.h = 1;
        this.i = false;
        this.d = str;
    }

    public Request(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "448904c29fcd338fa16400b898abd4d5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "448904c29fcd338fa16400b898abd4d5");
            return;
        }
        this.h = 1;
        this.i = false;
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readHashMap(HashMap.class.getClassLoader());
        this.h = parcel.readInt();
        this.i = parcel.readByte() != 0;
        this.j = (PendingIntent) parcel.readParcelable(Intent.class.getClassLoader());
        this.k = parcel.readString();
        this.l = parcel.readString();
        this.m = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c81fb57a30681c40d6864e1b8187dbce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c81fb57a30681c40d6864e1b8187dbce");
            return;
        }
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeMap(this.g);
        parcel.writeInt(this.h);
        parcel.writeByte(this.i ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.j, i);
        parcel.writeString(this.k);
        parcel.writeString(this.l);
        parcel.writeInt(this.m);
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57559edb00d73a4e1dd74b834551b6be", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57559edb00d73a4e1dd74b834551b6be");
        }
        return "Request{uuid='" + this.b + "', reportType='" + this.c + "', url='" + this.d + "', state=" + this.e + ", destDir='" + this.f + "', headers=" + this.g + ", allowNetworkType=" + this.h + ", isNotificationEnabled=" + this.i + ", title='" + this.k + "', description='" + this.l + "', icon=" + this.m + '}';
    }
}
