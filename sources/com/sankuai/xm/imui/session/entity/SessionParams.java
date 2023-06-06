package com.sankuai.xm.imui.session.entity;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.utils.MessageUtils;
import com.sankuai.xm.imui.common.util.c;
import com.sankuai.xm.imui.session.widget.d;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class SessionParams implements Parcelable {
    public static ChangeQuickRedirect a;
    public boolean b;
    public int c;
    public long d;
    public long e;
    public long f;
    public boolean g;
    public long h;
    public int i;
    public int[] j;
    public int k;
    public boolean l;
    public boolean m;
    public int[] n;
    public String[] o;
    public String[] p;
    public boolean q;
    public boolean r;
    public float s;
    public boolean t;
    public Bundle u;
    private boolean x;
    private int y;
    private int[] z;
    private static final int[] v = c.a();
    private static final int[] w = new int[0];
    public static final Parcelable.Creator<SessionParams> CREATOR = new Parcelable.Creator<SessionParams>() { // from class: com.sankuai.xm.imui.session.entity.SessionParams.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SessionParams createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7264fe846c56a2998a9f23333745615", 6917529027641081856L) ? (SessionParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7264fe846c56a2998a9f23333745615") : new SessionParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SessionParams[] newArray(int i) {
            return new SessionParams[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SessionParams() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4038bccf97644ef542b587ae1f1b582", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4038bccf97644ef542b587ae1f1b582");
            return;
        }
        this.x = true;
        this.b = true;
        this.c = 1;
        this.f = 600000L;
        this.g = false;
        this.h = 604800000L;
        this.i = 0;
        this.j = new int[0];
        this.k = 4;
        this.l = true;
        this.m = true;
        this.y = -1;
        this.n = new int[0];
        this.z = new int[v.length];
        this.q = false;
        this.r = false;
        this.s = 0.0f;
        this.t = true;
        this.u = new Bundle();
    }

    public SessionParams(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06cd3e2e562b8f971c8c631683fc213d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06cd3e2e562b8f971c8c631683fc213d");
            return;
        }
        this.x = true;
        this.b = true;
        this.c = 1;
        this.f = 600000L;
        this.g = false;
        this.h = 604800000L;
        this.i = 0;
        this.j = new int[0];
        this.k = 4;
        this.l = true;
        this.m = true;
        this.y = -1;
        this.n = new int[0];
        this.z = new int[v.length];
        this.q = false;
        this.r = false;
        this.s = 0.0f;
        this.t = true;
        this.u = new Bundle();
        this.x = parcel.readByte() != 0;
        this.b = parcel.readByte() != 0;
        this.c = parcel.readInt();
        this.d = parcel.readLong();
        this.e = parcel.readLong();
        this.f = parcel.readLong();
        this.g = parcel.readByte() != 0;
        this.h = parcel.readLong();
        this.i = parcel.readInt();
        this.j = parcel.createIntArray();
        this.k = parcel.readInt();
        this.l = parcel.readByte() != 0;
        this.m = parcel.readByte() != 0;
        this.y = parcel.readInt();
        this.n = parcel.createIntArray();
        this.o = parcel.createStringArray();
        this.p = parcel.createStringArray();
        this.z = parcel.createIntArray();
        this.q = parcel.readByte() != 0;
        this.r = parcel.readByte() != 0;
        this.s = parcel.readFloat();
        this.t = parcel.readByte() != 0;
        this.u = parcel.readBundle(getClass().getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2185db9803c0abb80b4483f204044455", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2185db9803c0abb80b4483f204044455");
            return;
        }
        parcel.writeByte(this.x ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
        parcel.writeLong(this.f);
        parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.h);
        parcel.writeInt(this.i);
        parcel.writeIntArray(this.j);
        parcel.writeInt(this.k);
        parcel.writeByte(this.l ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.m ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.y);
        parcel.writeIntArray(this.n);
        parcel.writeStringArray(this.o);
        parcel.writeStringArray(this.p);
        parcel.writeIntArray(this.z);
        parcel.writeByte(this.q ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.r ? (byte) 1 : (byte) 0);
        parcel.writeFloat(this.s);
        parcel.writeByte(this.t ? (byte) 1 : (byte) 0);
        parcel.writeBundle(this.u);
    }

    @NonNull
    public static SessionParams a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d0d1d0d7dd7802a444c0dc56a418b027", 6917529027641081856L)) {
            return (SessionParams) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d0d1d0d7dd7802a444c0dc56a418b027");
        }
        com.sankuai.xm.imui.session.b b = com.sankuai.xm.imui.session.b.b(context);
        if (b == null) {
            return new SessionParams();
        }
        return b.c;
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07a4ea5def36db14ce5768313491ed53", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07a4ea5def36db14ce5768313491ed53");
        } else {
            this.d = j;
        }
    }

    public final Bundle a() {
        return this.u;
    }

    @NonNull
    public final int[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "313e165d2e287a4f95203efbd12ff8e5", 6917529027641081856L) ? (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "313e165d2e287a4f95203efbd12ff8e5") : a(2, MessageUtils.getMsgForwardSupportTypes());
    }

    @NonNull
    public final int[] c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf6c019b6c6d7c75b2b744c9c2180b71", 6917529027641081856L) ? (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf6c019b6c6d7c75b2b744c9c2180b71") : a(1, c.b());
    }

    private int[] a(int i, int[] iArr) {
        int[] iArr2;
        Object[] objArr = {Integer.valueOf(i), iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b229f46ff182bbe90e90f64bf1668b80", 6917529027641081856L)) {
            return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b229f46ff182bbe90e90f64bf1668b80");
        }
        if (this.z == null || this.z.length == 0) {
            return w;
        }
        int[] iArr3 = new int[v.length];
        int i2 = 0;
        for (int i3 : v) {
            int binarySearch = Arrays.binarySearch(v, i3);
            if (binarySearch >= 0 && ((iArr == null || Arrays.binarySearch(iArr, i3) >= 0) && (this.z[binarySearch] & i) != 0)) {
                iArr3[i2] = i3;
                i2++;
            }
        }
        return i2 == 0 ? w : Arrays.copyOf(iArr3, i2);
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "176135638e0776a3fbd3a73c5483bf74", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "176135638e0776a3fbd3a73c5483bf74");
        }
        return "SessionParams{mEnableMsgReadStatus=" + this.x + ", mShowOppositeStatus=" + this.b + ", mMsgQueryType=" + this.c + ", mMsgStartStamp=" + this.d + ", mMsgEndStamp=" + this.e + ", mCancelTimeSlot=" + this.f + ", mEnableMsgAdminCancel=" + this.g + ", mAdminCancelTimeSlot=" + this.h + ", mMaxRecordDuration=" + this.i + ", mInputDraftEnable=" + this.m + ", mSupportMsgTypeArr=" + Arrays.toString(this.j) + ", mUnreadWidgetOp=" + this.k + ", mAutoQueryRemoteHistoryMsg=" + this.l + ", mUIAnnotationIdentify=" + this.y + ", mSaveMenuSupportMsgTypeArr=" + Arrays.toString(this.n) + ", mEmotionPackageIds=" + Arrays.toString(this.o) + ", mCustomWidgets=" + Arrays.toString(this.p) + ", mMsgSwitchFlags=" + Arrays.toString(this.z) + ", mExtraParam=" + this.u + '}';
    }

    public final void a(Class<? extends d>... clsArr) {
        Object[] objArr = {clsArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a5ac2b2245c4e5e954545e198525fe6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a5ac2b2245c4e5e954545e198525fe6");
        } else if (com.sankuai.xm.base.util.b.b(clsArr)) {
            this.p = null;
        } else {
            this.p = new String[1];
            for (int i = 0; i <= 0; i++) {
                this.p[0] = clsArr[0].getName();
            }
        }
    }

    public final void a(boolean z, float f) {
        this.r = false;
        this.s = 0.0f;
    }
}
