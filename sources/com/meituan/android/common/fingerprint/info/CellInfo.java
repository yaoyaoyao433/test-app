package com.meituan.android.common.fingerprint.info;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.kitefly.KiteFlyConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CellInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int cid;
    private int lac;
    private int mcc;
    private int mnc;
    @SerializedName(KiteFlyConstants.RT_NAME)
    private String radioType;

    public CellInfo() {
    }

    public CellInfo(int i, int i2, int i3, int i4, String str) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "045686868065326605c3e89cde0b8968", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "045686868065326605c3e89cde0b8968");
            return;
        }
        this.cid = i;
        this.lac = i2;
        this.mcc = i3;
        this.mnc = i4;
        this.radioType = str;
    }

    public int getCid() {
        return this.cid;
    }

    public void setCid(int i) {
        this.cid = i;
    }

    public int getLac() {
        return this.lac;
    }

    public void setLac(int i) {
        this.lac = i;
    }

    public int getMcc() {
        return this.mcc;
    }

    public void setMcc(int i) {
        this.mcc = i;
    }

    public int getMnc() {
        return this.mnc;
    }

    public void setMnc(int i) {
        this.mnc = i;
    }

    public String getRadioType() {
        return this.radioType;
    }

    public void setRadioType(String str) {
        this.radioType = str;
    }
}
