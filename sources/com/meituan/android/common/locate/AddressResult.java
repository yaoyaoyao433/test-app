package com.meituan.android.common.locate;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class AddressResult {
    public static final int CITY_NOT_OPEN = 4;
    public static final int ERROR_NETWORK = 1;
    public static final int ERROR_REGEO = 3;
    public static final int ERROR_SERVER = 2;
    public static final int SUCCESS = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    private int a;
    private String b;
    private String c;
    private String d;
    private int e;

    public AddressResult() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85a8039efa554ebbbbbd14d93b1fefba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85a8039efa554ebbbbbd14d93b1fefba");
        } else {
            this.e = 0;
        }
    }

    public String getCity() {
        return this.b;
    }

    public int getCityId() {
        return this.a;
    }

    public String getDetail() {
        return this.d;
    }

    public String getDistrict() {
        return this.c;
    }

    public int getErrorCode() {
        return this.e;
    }

    public void setCity(String str) {
        this.b = str;
    }

    public void setCityId(int i) {
        this.a = i;
    }

    public void setDetail(String str) {
        this.d = str;
    }

    public void setDistrict(String str) {
        this.c = str;
    }

    public void setErrorCode(int i) {
        this.e = i;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0f1f5119ed5fa92ea4a83620233bd54", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0f1f5119ed5fa92ea4a83620233bd54");
        }
        return "AddressResult{cityId=" + this.a + ", city='" + this.b + "', district='" + this.c + "', detail='" + this.d + "', errorCode=" + this.e + '}';
    }
}
