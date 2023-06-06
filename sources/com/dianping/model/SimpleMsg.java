package com.dianping.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.dianping.archive.b;
import com.dianping.archive.c;
import com.dianping.archive.e;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SimpleMsg implements Parcelable, b {
    public static ChangeQuickRedirect a;
    public boolean c;
    protected String d;
    protected int e;
    protected int f;
    protected String g;
    protected String h;
    protected int i;
    protected int j;
    protected int k;
    protected String l;
    public static final c<SimpleMsg> b = new c<SimpleMsg>() { // from class: com.dianping.model.SimpleMsg.1
        public static ChangeQuickRedirect a;

        @Override // com.dianping.archive.c
        public final /* synthetic */ SimpleMsg a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb5ac8ae22721fa0cd4a941d77725b54", RobustBitConfig.DEFAULT_VALUE)) {
                return (SimpleMsg) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb5ac8ae22721fa0cd4a941d77725b54");
            }
            if (i == 37021) {
                return new SimpleMsg();
            }
            return new SimpleMsg(false);
        }

        @Override // com.dianping.archive.c
        public final /* bridge */ /* synthetic */ SimpleMsg[] b(int i) {
            return new SimpleMsg[i];
        }
    };
    public static final Parcelable.Creator<SimpleMsg> CREATOR = new Parcelable.Creator<SimpleMsg>() { // from class: com.dianping.model.SimpleMsg.2
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SimpleMsg createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9884bf4ac73bd661e3691d76edff3d9d", RobustBitConfig.DEFAULT_VALUE) ? (SimpleMsg) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9884bf4ac73bd661e3691d76edff3d9d") : new SimpleMsg(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SimpleMsg[] newArray(int i) {
            return new SimpleMsg[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SimpleMsg(String str, String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb1e07ebd7f27ecb86b31745252aaa0a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb1e07ebd7f27ecb86b31745252aaa0a");
            return;
        }
        this.c = true;
        this.g = str;
        this.h = str2;
        this.k = i;
    }

    public SimpleMsg() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f61f0a205ab350386ebcfcc8e1d324d1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f61f0a205ab350386ebcfcc8e1d324d1");
            return;
        }
        this.c = true;
        this.k = 0;
        this.g = "";
        this.h = "";
        this.i = 0;
        this.j = 0;
        this.l = "";
        this.d = "";
        this.e = 0;
        this.f = 0;
    }

    public SimpleMsg(boolean z) {
        Object[] objArr = {(byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f59e59b245b7bb4b715a6a4ae2b82a6b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f59e59b245b7bb4b715a6a4ae2b82a6b");
            return;
        }
        this.c = false;
        this.k = 0;
        this.g = "";
        this.h = "";
        this.i = 0;
        this.j = 0;
        this.l = "";
        this.d = "";
        this.e = 0;
        this.f = 0;
    }

    public SimpleMsg(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ded7f6c7b73f2a634c529869e616b505", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ded7f6c7b73f2a634c529869e616b505");
            return;
        }
        this.c = parcel.readInt() == 1;
        this.k = parcel.readInt();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readInt();
        this.j = parcel.readInt();
        this.l = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
    }

    public final int a() {
        return this.k;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9eb60d6e9ea08d976b97c92ceb38820b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9eb60d6e9ea08d976b97c92ceb38820b");
        }
        return this.g + " : " + this.h;
    }

    @Override // com.dianping.archive.b
    public void decode(e eVar) throws com.dianping.archive.a {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e541f0db2acd279280592b5b6cf63315", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e541f0db2acd279280592b5b6cf63315");
            return;
        }
        while (true) {
            int g = eVar.g();
            if (g <= 0) {
                return;
            }
            if (g == 141) {
                this.k = eVar.b();
            } else if (g == 2633) {
                this.c = eVar.a();
            } else if (g == 14057) {
                this.g = eVar.d();
            } else if (g == 17659) {
                this.e = eVar.b();
            } else if (g == 22454) {
                this.h = eVar.d();
            } else if (g == 25578) {
                this.l = eVar.d();
            } else if (g == 29544) {
                this.d = eVar.d();
            } else if (g == 29613) {
                this.j = eVar.b();
            } else if (g == 45243) {
                this.i = eVar.b();
            } else if (g == 61413) {
                this.f = eVar.b();
            } else {
                eVar.f();
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29a0cb4c1bf8f304985da33dddb1eda0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29a0cb4c1bf8f304985da33dddb1eda0");
            return;
        }
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.k);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        parcel.writeString(this.l);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50a5f9c841e215f86e533b4618b7922f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50a5f9c841e215f86e533b4618b7922f");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("statusCode", Integer.valueOf(this.k));
            jSONObject.putOpt("title", this.g);
            jSONObject.putOpt("content", this.h);
            jSONObject.putOpt(RemoteMessageConst.Notification.ICON, Integer.valueOf(this.i));
            jSONObject.putOpt("flag", Integer.valueOf(this.j));
            jSONObject.putOpt("data", this.l);
            jSONObject.putOpt("errorMsg", this.d);
            jSONObject.putOpt("errorCode", Integer.valueOf(this.e));
            jSONObject.putOpt("returnID", Integer.valueOf(this.f));
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }
}
