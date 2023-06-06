package com.dianping.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.dianping.archive.c;
import com.dianping.archive.e;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ResultList<T extends Parcelable> extends BasicModel {
    public static ChangeQuickRedirect c;
    @SerializedName("recordCount")
    public int d;
    @SerializedName("startIndex")
    public int e;
    @SerializedName("isEnd")
    public boolean f;
    @SerializedName("nextStartIndex")
    public int g;
    @SerializedName("emptyMsg")
    public String h;
    @SerializedName("queryID")
    public String i;
    public static final c<ResultList> j = new c<ResultList>() { // from class: com.dianping.model.ResultList.1
        public static ChangeQuickRedirect a;

        @Override // com.dianping.archive.c
        public final /* synthetic */ ResultList a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34c69e95c6afa07222a8c380159ee591", RobustBitConfig.DEFAULT_VALUE)) {
                return (ResultList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34c69e95c6afa07222a8c380159ee591");
            }
            if (i == 9923) {
                return new ResultList();
            }
            return new ResultList(false);
        }

        @Override // com.dianping.archive.c
        public final /* bridge */ /* synthetic */ ResultList[] b(int i) {
            return new ResultList[i];
        }
    };
    public static final Parcelable.Creator<ResultList> CREATOR = new Parcelable.Creator<ResultList>() { // from class: com.dianping.model.ResultList.2
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ResultList createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f76f85aa0cf7e7a805b40c96dc004ee", RobustBitConfig.DEFAULT_VALUE)) {
                return (ResultList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f76f85aa0cf7e7a805b40c96dc004ee");
            }
            ResultList resultList = new ResultList();
            while (true) {
                int readInt = parcel.readInt();
                if (readInt == -1) {
                    return resultList;
                }
                if (readInt == 2633) {
                    resultList.b = parcel.readInt() == 1;
                } else if (readInt == 3851) {
                    resultList.f = parcel.readInt() == 1;
                } else if (readInt == 6013) {
                    resultList.d = parcel.readInt();
                } else if (readInt == 11655) {
                    resultList.i = parcel.readString();
                } else if (readInt == 22275) {
                    resultList.g = parcel.readInt();
                } else if (readInt == 42085) {
                    resultList.h = parcel.readString();
                } else if (readInt == 43620) {
                    resultList.e = parcel.readInt();
                }
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ResultList[] newArray(int i) {
            return new ResultList[i];
        }
    };

    @Override // com.dianping.model.BasicModel, com.dianping.archive.b
    public void decode(e eVar) throws com.dianping.archive.a {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05b56e0e4bf8f6812b699337a4f1c06e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05b56e0e4bf8f6812b699337a4f1c06e");
            return;
        }
        while (true) {
            int g = eVar.g();
            if (g <= 0) {
                return;
            }
            if (g == 2633) {
                this.b = eVar.a();
            } else if (g == 3851) {
                this.f = eVar.a();
            } else if (g == 6013) {
                this.d = eVar.b();
            } else if (g == 11655) {
                this.i = eVar.d();
            } else if (g == 22275) {
                this.g = eVar.b();
            } else if (g == 42085) {
                this.h = eVar.d();
            } else if (g == 43620) {
                this.e = eVar.b();
            } else {
                eVar.f();
            }
        }
    }

    @Override // com.dianping.model.BasicModel, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e934645fb6061f1b007cf9d5568ff5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e934645fb6061f1b007cf9d5568ff5a");
            return;
        }
        parcel.writeInt(2633);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(11655);
        parcel.writeString(this.i);
        parcel.writeInt(42085);
        parcel.writeString(this.h);
        parcel.writeInt(22275);
        parcel.writeInt(this.g);
        parcel.writeInt(3851);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(43620);
        parcel.writeInt(this.e);
        parcel.writeInt(6013);
        parcel.writeInt(this.d);
        parcel.writeInt(-1);
    }

    public ResultList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a468e3fb84d7450576448dca2ad6a1d9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a468e3fb84d7450576448dca2ad6a1d9");
            return;
        }
        this.b = true;
        this.i = "";
        this.h = "";
        this.g = 0;
        this.f = false;
        this.e = 0;
        this.d = 0;
    }

    public ResultList(boolean z) {
        Object[] objArr = {(byte) 0};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "864c3df60fd3e6344fa85ca4e2271b7c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "864c3df60fd3e6344fa85ca4e2271b7c");
            return;
        }
        this.b = false;
        this.i = "";
        this.h = "";
        this.g = 0;
        this.f = false;
        this.e = 0;
        this.d = 0;
    }
}
