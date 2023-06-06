package com.meituan.android.legwork.bean.address;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class PoiConfirmBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int addressType;
    public int businessType;
    public int businessTypeTag;
    public CityBean city;
    public MrnAddress currentAddress;
    public MrnAddress fetchAddress;
    public String from;
    public boolean isAddressInfoDegrade;
    public String keyword;
    public MrnAddress originalAddress;
    public PoiBean poi;
    public MrnAddress recipientAddress;
    public int scene;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes2.dex */
    public static class CityBean implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String cityName;
        public double latitude;
        public double longitude;
    }
}
