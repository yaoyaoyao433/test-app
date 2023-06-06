package com.meituan.msi.api.systeminfo;

import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class DeviceInfoResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    public DeviceMt _mt;
    public String abi;
    public String brand;
    public String model;
    public String platform;
    public String system;

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    public static class DeviceMt {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String oaid;
    }
}
