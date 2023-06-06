package com.dianping.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.text.DecimalFormat;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class GPSCoordinate implements Parcelable {
    public static ChangeQuickRedirect a;
    private final double d;
    private final double e;
    private final int f;
    private final long g;
    private final String h;
    public static final GPSCoordinate b = new GPSCoordinate(Double.NaN, Double.NaN, 0, 0, StringUtil.NULL);
    public static final Parcelable.Creator<GPSCoordinate> CREATOR = new Parcelable.Creator<GPSCoordinate>() { // from class: com.dianping.model.GPSCoordinate.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ GPSCoordinate createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "813ecead44bc04631def17eca9873380", RobustBitConfig.DEFAULT_VALUE) ? (GPSCoordinate) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "813ecead44bc04631def17eca9873380") : new GPSCoordinate(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ GPSCoordinate[] newArray(int i) {
            return new GPSCoordinate[i];
        }
    };
    private static final DecimalFormat c = new DecimalFormat("0.#####");

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GPSCoordinate(double d, double d2, int i, long j, String str) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), Integer.valueOf(i), new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a7839a80445d4b59078485be1453e4b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a7839a80445d4b59078485be1453e4b");
            return;
        }
        this.d = d;
        this.e = d2;
        this.f = i;
        this.g = j;
        this.h = str;
    }

    private GPSCoordinate(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e78888481d4748c4ad1f731f9b43247", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e78888481d4748c4ad1f731f9b43247");
            return;
        }
        this.d = parcel.readDouble();
        this.e = parcel.readDouble();
        this.f = parcel.readInt();
        this.g = parcel.readLong();
        this.h = parcel.readString();
    }

    public Object clone() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a4a645e01c224f6ab14d2278d5baec4", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a4a645e01c224f6ab14d2278d5baec4") : new GPSCoordinate(this.d, this.e, this.f, this.g, this.h);
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd276b7df3ca550b4dfec8781ed6b52c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd276b7df3ca550b4dfec8781ed6b52c");
        }
        if (this == b) {
            return "(?,?) [null]";
        }
        return CommonConstant.Symbol.BRACKET_LEFT + c.format(this.d) + CommonConstant.Symbol.COMMA + c.format(this.e) + ") [" + this.f + CommonConstant.Symbol.COMMA + this.h + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "714ae140bbba147527a1b0c6dc87d009", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "714ae140bbba147527a1b0c6dc87d009");
            return;
        }
        parcel.writeDouble(this.d);
        parcel.writeDouble(this.e);
        parcel.writeInt(this.f);
        parcel.writeLong(this.g);
        parcel.writeString(this.h);
    }
}
