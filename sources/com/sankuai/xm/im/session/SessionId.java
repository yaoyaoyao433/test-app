package com.sankuai.xm.im.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.util.p;
import com.sankuai.xm.im.message.bean.Message;
import com.sankuai.xm.im.utils.MessageUtils;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class SessionId implements Parcelable {
    public static final Parcelable.Creator<SessionId> CREATOR = new Parcelable.Creator<SessionId>() { // from class: com.sankuai.xm.im.session.SessionId.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SessionId createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6524899a2a545e0b332757ac7d2f464", 6917529027641081856L) ? (SessionId) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6524899a2a545e0b332757ac7d2f464") : new SessionId(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SessionId[] newArray(int i) {
            return new SessionId[i];
        }
    };
    public static ChangeQuickRedirect a;
    public long b;
    public long c;
    public short d;
    public int e;
    public int f;
    public short g;
    private String h;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4c41b0e750344a2557e483634028c59", 6917529027641081856L)) {
            return (SessionId) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4c41b0e750344a2557e483634028c59");
        }
        SessionId sessionId = new SessionId();
        sessionId.b = this.b;
        sessionId.c = this.c;
        sessionId.e = this.e;
        sessionId.d = this.d;
        sessionId.g = this.g;
        sessionId.f = this.f;
        sessionId.h = this.h;
        return sessionId;
    }

    public SessionId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "598519c17f905b23f6534fca1f5b8ecb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "598519c17f905b23f6534fca1f5b8ecb");
        } else {
            this.h = "";
        }
    }

    public SessionId(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0095fac29927a241aa367e1da4cd9ff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0095fac29927a241aa367e1da4cd9ff");
            return;
        }
        this.h = "";
        this.b = parcel.readLong();
        this.c = parcel.readLong();
        this.d = (short) parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = (short) parcel.readInt();
        this.h = parcel.readString();
    }

    public static SessionId a(long j, long j2, int i, short s, short s2) {
        Object[] objArr = {new Long(j), new Long(j2), Integer.valueOf(i), Short.valueOf(s), Short.valueOf(s2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "61bdbb6f2777040e0dec59c048abbf64", 6917529027641081856L) ? (SessionId) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "61bdbb6f2777040e0dec59c048abbf64") : a(j, j2, i, s, s2, null);
    }

    public static SessionId a(@NonNull Message message) {
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fe687b075f057a89e3f57670bcf5b5ed", 6917529027641081856L) ? (SessionId) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fe687b075f057a89e3f57670bcf5b5ed") : a(message.getChatId(), message.getPeerUid(), message.getCategory(), message.getPeerAppId(), message.getChannel(), message.getSID());
    }

    public static SessionId a(long j, long j2, int i, short s, short s2, String str) {
        Object[] objArr = {new Long(j), new Long(j2), Integer.valueOf(i), Short.valueOf(s), Short.valueOf(s2), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2423d365a02a27b98b46eb753b0c43f3", 6917529027641081856L)) {
            return (SessionId) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2423d365a02a27b98b46eb753b0c43f3");
        }
        SessionId sessionId = new SessionId();
        sessionId.b = j;
        sessionId.c = j2;
        sessionId.e = i;
        sessionId.g = s2;
        sessionId.d = s;
        if (MessageUtils.isPubService(i)) {
            sessionId.d = (short) 0;
            sessionId.f = j2 == 0 ? 4 : 5;
        }
        if (sessionId.e >= 9 && sessionId.e <= 11) {
            sessionId.h = str;
            if (str != null && str.length() > 64) {
                sessionId.h = str.substring(0, 63);
            }
        }
        return sessionId;
    }

    public static SessionId a(String str) {
        SessionId a2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "27e83d0ed51c90aebdd0f7d66101fd89", 6917529027641081856L)) {
            return (SessionId) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "27e83d0ed51c90aebdd0f7d66101fd89");
        }
        SessionId sessionId = new SessionId();
        if (TextUtils.isEmpty(str)) {
            return sessionId;
        }
        try {
            String[] split = str.split(CommonConstant.Symbol.UNDERLINE);
            if (split.length == 4) {
                a2 = a(Long.valueOf(split[0]).longValue(), Long.valueOf(split[1]).longValue(), Integer.valueOf(split[3]).intValue(), (short) 0, Short.valueOf(split[2]).shortValue());
            } else if (split.length != 5) {
                return sessionId;
            } else {
                a2 = a(Long.valueOf(split[0]).longValue(), Long.valueOf(split[1]).longValue(), Integer.valueOf(split[3]).intValue(), (short) 0, Short.valueOf(split[2]).shortValue(), split[4]);
            }
            return a2;
        } catch (Exception unused) {
            return sessionId;
        }
    }

    public final JSONObject a() {
        JSONObject jSONObject;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83988eb27b3e1dfd260bc98e84f2093e", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83988eb27b3e1dfd260bc98e84f2093e");
        }
        try {
            jSONObject = new JSONObject();
        } catch (JSONException unused) {
            jSONObject = null;
        }
        try {
            jSONObject.put("chatID", this.b);
            jSONObject.put(Message.PEER_UID, this.c);
            jSONObject.put(Message.PEER_APPID, (int) this.d);
            jSONObject.put("channel", (int) this.g);
            jSONObject.put("category", this.e);
            jSONObject.put("chatType", MessageUtils.categoryToPushChatType(this.e, this.f));
            jSONObject.put(Message.SID, this.h);
        } catch (JSONException unused2) {
            com.sankuai.xm.im.utils.a.c("SessionId getJson params error:" + f(), new Object[0]);
            return jSONObject;
        }
        return jSONObject;
    }

    public final long b() {
        return this.b;
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28a207ae2fc58805fe78bb463d9d3c7c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28a207ae2fc58805fe78bb463d9d3c7c");
        } else {
            this.b = j;
        }
    }

    public final long c() {
        return this.c;
    }

    public final short d() {
        return this.g;
    }

    public final int e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6ecde2a5fc0b289141ba1f4dcb1c9f5", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6ecde2a5fc0b289141ba1f4dcb1c9f5")).intValue();
        }
        if (MessageUtils.isPubService(this.e) && this.f == 0) {
            this.f = this.c == 0 ? 4 : 5;
        }
        return this.f;
    }

    public final String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eecf2c763da4fac93325254deee2413a", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eecf2c763da4fac93325254deee2413a");
        }
        if (TextUtils.isEmpty(this.h)) {
            return this.b + CommonConstant.Symbol.UNDERLINE + this.c + CommonConstant.Symbol.UNDERLINE + ((int) this.g) + CommonConstant.Symbol.UNDERLINE + this.e;
        }
        return this.b + CommonConstant.Symbol.UNDERLINE + this.c + CommonConstant.Symbol.UNDERLINE + ((int) this.g) + CommonConstant.Symbol.UNDERLINE + this.e + CommonConstant.Symbol.UNDERLINE + this.h;
    }

    public final String g() {
        if (this.h == null) {
            this.h = "";
        }
        return this.h;
    }

    public final String h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b0c21ad676304c758610623a7a50ff1", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b0c21ad676304c758610623a7a50ff1") : MessageUtils.categoryToPushChatType(this.e, this.f);
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d51199a527966812f705fe344f8ac59d", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d51199a527966812f705fe344f8ac59d");
        }
        return this.b + CommonConstant.Symbol.UNDERLINE + this.c + CommonConstant.Symbol.UNDERLINE + ((int) this.g) + CommonConstant.Symbol.UNDERLINE + this.e + CommonConstant.Symbol.UNDERLINE + ((int) this.d) + CommonConstant.Symbol.UNDERLINE + this.f + CommonConstant.Symbol.UNDERLINE + this.h;
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a99f3e95f8ab93e686028c06833c0d2a", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a99f3e95f8ab93e686028c06833c0d2a")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SessionId sessionId = (SessionId) obj;
        return this.b == sessionId.b && this.c == sessionId.c && this.g == sessionId.g && TextUtils.equals(this.h, sessionId.h) && this.e == sessionId.e;
    }

    @RequiresApi(api = 19)
    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b281f68be21b492b3f76a5d2d7cffea6", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b281f68be21b492b3f76a5d2d7cffea6")).intValue() : p.a(Long.valueOf(this.b), Long.valueOf(this.c), Integer.valueOf(this.e), Short.valueOf(this.g), this.h);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e74ba6cb4c8f5edf54758e4b86f047c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e74ba6cb4c8f5edf54758e4b86f047c3");
            return;
        }
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeString(this.h);
    }

    public final boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69b4088118ca2ded1dfcc765eca67981", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69b4088118ca2ded1dfcc765eca67981")).booleanValue();
        }
        if (this.e == 4 || this.e == 5) {
            return false;
        }
        if (this.e == -2) {
            return true;
        }
        boolean isIMPeerService = MessageUtils.isIMPeerService(this.e);
        return this.b > 0 && this.g >= 0 && this.e > 0 && ((isIMPeerService && this.d > 0) || (!isIMPeerService && this.d >= 0)) && j();
    }

    private boolean j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "704b3e88496c541e6be9b077f9014adb", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "704b3e88496c541e6be9b077f9014adb")).booleanValue() : TextUtils.isEmpty(this.h) ? this.e < 9 : this.e >= 9 && this.h.length() <= 64;
    }
}
