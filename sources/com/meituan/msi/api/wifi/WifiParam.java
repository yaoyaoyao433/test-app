package com.meituan.msi.api.wifi;

import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class WifiParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String BSSID;
    public String SSID;
    public WifiMtParam _mt;
    public boolean maunal;
    public String password;

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    public static class WifiMtParam {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String sceneToken;
    }
}
