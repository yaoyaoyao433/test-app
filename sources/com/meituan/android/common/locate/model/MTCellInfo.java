package com.meituan.android.common.locate.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class MTCellInfo implements Parcelable {
    public static final Parcelable.Creator<MTCellInfo> CREATOR = new Parcelable.Creator<MTCellInfo>() { // from class: com.meituan.android.common.locate.model.MTCellInfo.1
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final MTCellInfo createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c8b8cbae071b12d8e79fad9318f887fa", RobustBitConfig.DEFAULT_VALUE) ? (MTCellInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c8b8cbae071b12d8e79fad9318f887fa") : new MTCellInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final MTCellInfo[] newArray(int i) {
            return new MTCellInfo[i];
        }
    };
    public static final String TYPE_5G_NR = "5G-NR";
    public static final String TYPE_CDMA = "CDMA";
    public static final String TYPE_GSM = "GSM";
    public static final String TYPE_LTE = "LTE";
    public static final String TYPE_TDSCDMA = "TD-SCDMA";
    public static final String TYPE_WCDMA = "WCDMA";
    public static ChangeQuickRedirect changeQuickRedirect;
    public long bid;
    public long cdmalat;
    public long cdmalon;
    public int cgiage;
    public int ci;
    public long cid;
    public boolean isRegistered;
    public long lac;
    public int mcc;
    public int mnc;
    public long nanoTimeStamp;
    public long nci;
    public long nid;
    public int nrarfcn;
    public int pci;
    public String radio_type;
    public long rss;
    public long sid;
    public int tac;
    public long timeStamp;

    public MTCellInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14b02cc43b626bb25b0cf265274294fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14b02cc43b626bb25b0cf265274294fb");
            return;
        }
        this.mnc = 0;
        this.mcc = 0;
        this.isRegistered = false;
        this.radio_type = "";
        this.cgiage = 0;
        this.rss = 0L;
        this.lac = 0L;
        this.cid = 0L;
        this.sid = 0L;
        this.nid = 0L;
        this.bid = 0L;
        this.cdmalon = 0L;
        this.cdmalat = 0L;
        this.ci = 0;
        this.nci = 0L;
        this.pci = 0;
        this.tac = 0;
        this.nanoTimeStamp = 0L;
        this.timeStamp = 0L;
    }

    public MTCellInfo(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2db5be597e4dd6a954c520ef337c61d7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2db5be597e4dd6a954c520ef337c61d7");
            return;
        }
        this.mnc = 0;
        this.mcc = 0;
        this.isRegistered = false;
        this.radio_type = "";
        this.cgiage = 0;
        this.rss = 0L;
        this.lac = 0L;
        this.cid = 0L;
        this.sid = 0L;
        this.nid = 0L;
        this.bid = 0L;
        this.cdmalon = 0L;
        this.cdmalat = 0L;
        this.ci = 0;
        this.nci = 0L;
        this.pci = 0;
        this.tac = 0;
        this.nanoTimeStamp = 0L;
        this.timeStamp = 0L;
        this.mnc = parcel.readInt();
        this.mcc = parcel.readInt();
        this.isRegistered = parcel.readByte() != 0;
        this.radio_type = parcel.readString();
        this.cgiage = parcel.readInt();
        this.rss = parcel.readLong();
        this.lac = parcel.readLong();
        this.cid = parcel.readLong();
        this.sid = parcel.readLong();
        this.nid = parcel.readLong();
        this.bid = parcel.readLong();
        this.cdmalon = parcel.readLong();
        this.cdmalat = parcel.readLong();
        this.ci = parcel.readInt();
        this.nci = parcel.readLong();
        this.pci = parcel.readInt();
        this.tac = parcel.readInt();
        this.nrarfcn = parcel.readInt();
        this.timeStamp = parcel.readLong();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e3, code lost:
        if (r1.equals(com.meituan.android.common.locate.model.MTCellInfo.TYPE_TDSCDMA) != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean compareCellEqual(com.meituan.android.common.locate.model.MTCellInfo r13, com.meituan.android.common.locate.model.MTCellInfo r14) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.locate.model.MTCellInfo.compareCellEqual(com.meituan.android.common.locate.model.MTCellInfo, com.meituan.android.common.locate.model.MTCellInfo):boolean");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05247d2dbef866de742c17fa14e8b0d2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05247d2dbef866de742c17fa14e8b0d2");
        }
        return "radio_type:" + this.radio_type + " mnc:" + this.mnc + " mcc:" + this.mcc + " lac:" + this.lac + " cid:" + this.cid + " sid:" + this.sid + " nid:" + this.nid + " bid:" + this.bid + " cdmalng:" + this.cdmalon + " cdmalat:" + this.cdmalat + " rss:" + this.rss + " cgiage:" + this.cgiage + " ci:" + this.ci + " nci:" + this.nci + " pci:" + this.pci + " tac:" + this.tac + " nrarfcn:" + this.nrarfcn + " isRegistered:" + this.isRegistered + "timeStamp" + this.nanoTimeStamp;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a23239596702b5a0104bbd0b84eea7ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a23239596702b5a0104bbd0b84eea7ff");
            return;
        }
        parcel.writeInt(this.mnc);
        parcel.writeInt(this.mcc);
        parcel.writeByte(this.isRegistered ? (byte) 1 : (byte) 0);
        parcel.writeString(this.radio_type);
        parcel.writeInt(this.cgiage);
        parcel.writeLong(this.rss);
        parcel.writeLong(this.lac);
        parcel.writeLong(this.cid);
        parcel.writeLong(this.sid);
        parcel.writeLong(this.nid);
        parcel.writeLong(this.bid);
        parcel.writeLong(this.cdmalon);
        parcel.writeLong(this.cdmalat);
        parcel.writeInt(this.ci);
        parcel.writeLong(this.nci);
        parcel.writeInt(this.pci);
        parcel.writeInt(this.tac);
        parcel.writeInt(this.nrarfcn);
        parcel.writeLong(this.timeStamp);
    }
}
