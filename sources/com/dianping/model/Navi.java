package com.dianping.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.dianping.archive.c;
import com.dianping.archive.e;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.model.dao.region.RegionLinkDao;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class Navi extends BasicModel {
    public static ChangeQuickRedirect c;
    @SerializedName("typeExtra")
    public String d;
    @SerializedName(RegionLinkDao.TABLENAME)
    public String e;
    @SerializedName("type")
    public int f;
    @SerializedName("extraId")
    public int g;
    @SerializedName("subLayout")
    public int h;
    @SerializedName("subs")
    public Navi[] i;
    @SerializedName("color")
    public String j;
    @SerializedName(RemoteMessageConst.Notification.ICON)
    public String k;
    @SerializedName("highLight")
    public boolean l;
    @SerializedName("count")
    public int m;
    @SerializedName(DMKeys.KEY_SELECTED)
    public boolean n;
    @SerializedName("selectable")
    public boolean o;
    @SerializedName("enName")
    public String p;
    @SerializedName("name")
    public String q;
    @SerializedName("iD")
    public int r;
    public static final c<Navi> s = new c<Navi>() { // from class: com.dianping.model.Navi.1
        public static ChangeQuickRedirect a;

        @Override // com.dianping.archive.c
        public final /* synthetic */ Navi a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d292e7798ec54e28d153de8c519aa80", RobustBitConfig.DEFAULT_VALUE)) {
                return (Navi) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d292e7798ec54e28d153de8c519aa80");
            }
            if (i == 61410) {
                return new Navi();
            }
            return new Navi(false);
        }

        @Override // com.dianping.archive.c
        public final /* bridge */ /* synthetic */ Navi[] b(int i) {
            return new Navi[i];
        }
    };
    public static final Parcelable.Creator<Navi> CREATOR = new Parcelable.Creator<Navi>() { // from class: com.dianping.model.Navi.2
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Navi createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0a0e78115c139e29c38bd15c438dfe4", RobustBitConfig.DEFAULT_VALUE)) {
                return (Navi) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0a0e78115c139e29c38bd15c438dfe4");
            }
            Navi navi = new Navi();
            while (true) {
                int readInt = parcel.readInt();
                if (readInt != -1) {
                    switch (readInt) {
                        case 882:
                            navi.f = parcel.readInt();
                            break;
                        case 2331:
                            navi.r = parcel.readInt();
                            break;
                        case 2633:
                            navi.b = parcel.readInt() == 1;
                            break;
                        case 4357:
                            navi.p = parcel.readString();
                            break;
                        case 7259:
                            navi.n = parcel.readInt() == 1;
                            break;
                        case 9278:
                            navi.e = parcel.readString();
                            break;
                        case 15404:
                            navi.d = parcel.readString();
                            break;
                        case 15527:
                            navi.j = parcel.readString();
                            break;
                        case 17942:
                            navi.h = parcel.readInt();
                            break;
                        case 25355:
                            navi.m = parcel.readInt();
                            break;
                        case 25664:
                            navi.g = parcel.readInt();
                            break;
                        case 32372:
                            navi.i = (Navi[]) parcel.createTypedArray(Navi.CREATOR);
                            break;
                        case 45243:
                            navi.k = parcel.readString();
                            break;
                        case 56405:
                            navi.o = parcel.readInt() == 1;
                            break;
                        case 61071:
                            navi.q = parcel.readString();
                            break;
                        case 61792:
                            navi.l = parcel.readInt() == 1;
                            break;
                    }
                } else {
                    return navi;
                }
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Navi[] newArray(int i) {
            return new Navi[i];
        }
    };

    @Override // com.dianping.model.BasicModel, com.dianping.archive.b
    public void decode(e eVar) throws com.dianping.archive.a {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09e5cabea680db70f3d8470e485b1ed9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09e5cabea680db70f3d8470e485b1ed9");
            return;
        }
        while (true) {
            int g = eVar.g();
            if (g > 0) {
                switch (g) {
                    case 882:
                        this.f = eVar.b();
                        break;
                    case 2331:
                        this.r = eVar.b();
                        break;
                    case 2633:
                        this.b = eVar.a();
                        break;
                    case 4357:
                        this.p = eVar.d();
                        break;
                    case 7259:
                        this.n = eVar.a();
                        break;
                    case 9278:
                        this.e = eVar.d();
                        break;
                    case 15404:
                        this.d = eVar.d();
                        break;
                    case 15527:
                        this.j = eVar.d();
                        break;
                    case 17942:
                        this.h = eVar.b();
                        break;
                    case 25355:
                        this.m = eVar.b();
                        break;
                    case 25664:
                        this.g = eVar.b();
                        break;
                    case 32372:
                        this.i = (Navi[]) eVar.b(s);
                        break;
                    case 45243:
                        this.k = eVar.d();
                        break;
                    case 56405:
                        this.o = eVar.a();
                        break;
                    case 61071:
                        this.q = eVar.d();
                        break;
                    case 61792:
                        this.l = eVar.a();
                        break;
                    default:
                        eVar.f();
                        break;
                }
            } else {
                return;
            }
        }
    }

    @Override // com.dianping.model.BasicModel, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79eee303715125ef7316c695b10c53b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79eee303715125ef7316c695b10c53b6");
            return;
        }
        parcel.writeInt(2633);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(2331);
        parcel.writeInt(this.r);
        parcel.writeInt(61071);
        parcel.writeString(this.q);
        parcel.writeInt(4357);
        parcel.writeString(this.p);
        parcel.writeInt(56405);
        parcel.writeInt(this.o ? 1 : 0);
        parcel.writeInt(7259);
        parcel.writeInt(this.n ? 1 : 0);
        parcel.writeInt(25355);
        parcel.writeInt(this.m);
        parcel.writeInt(61792);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeInt(45243);
        parcel.writeString(this.k);
        parcel.writeInt(15527);
        parcel.writeString(this.j);
        parcel.writeInt(32372);
        parcel.writeTypedArray(this.i, i);
        parcel.writeInt(17942);
        parcel.writeInt(this.h);
        parcel.writeInt(25664);
        parcel.writeInt(this.g);
        parcel.writeInt(882);
        parcel.writeInt(this.f);
        parcel.writeInt(9278);
        parcel.writeString(this.e);
        parcel.writeInt(15404);
        parcel.writeString(this.d);
        parcel.writeInt(-1);
    }

    public Navi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27baeecd49161a6dd34eb1501d4e6329", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27baeecd49161a6dd34eb1501d4e6329");
            return;
        }
        this.b = true;
        this.r = 0;
        this.q = "";
        this.p = "";
        this.o = false;
        this.n = false;
        this.m = 0;
        this.l = false;
        this.k = "";
        this.j = "";
        this.i = new Navi[0];
        this.h = 0;
        this.g = 0;
        this.f = 0;
        this.e = "";
        this.d = "";
    }

    public Navi(boolean z) {
        Object[] objArr = {(byte) 0};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e3a5ee76e9d87ab6cbb29cf83227d0c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e3a5ee76e9d87ab6cbb29cf83227d0c");
            return;
        }
        this.b = false;
        this.r = 0;
        this.q = "";
        this.p = "";
        this.o = false;
        this.n = false;
        this.m = 0;
        this.l = false;
        this.k = "";
        this.j = "";
        this.i = new Navi[0];
        this.h = 0;
        this.g = 0;
        this.f = 0;
        this.e = "";
        this.d = "";
    }
}
