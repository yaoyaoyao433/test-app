package com.meituan.android.loader.impl.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DynRunParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final boolean isLocalFileAvailable;
    public final boolean shouldDownloadAllDyn;
    public final boolean shouldDownloadAllInnerHotfix;
    public final boolean shouldUnzip;
    public final boolean shouldVerifyAllDyn;
    public final String type;

    public DynRunParam(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), Byte.valueOf(z4 ? (byte) 1 : (byte) 0), Byte.valueOf(z5 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad967555ca2228964faa016de6acc865", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad967555ca2228964faa016de6acc865");
            return;
        }
        this.type = str;
        this.shouldUnzip = z;
        this.isLocalFileAvailable = z2;
        this.shouldDownloadAllDyn = z3;
        this.shouldDownloadAllInnerHotfix = z4;
        this.shouldVerifyAllDyn = z5;
    }

    public static DynRunParam geneCustomInitRunParam() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "82573de5cb36e43f0e9f5741ae5b10ad", RobustBitConfig.DEFAULT_VALUE) ? (DynRunParam) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "82573de5cb36e43f0e9f5741ae5b10ad") : new DynRunParam("CustomInit", true, false, true, true, false);
    }

    public static DynRunParam genePreDownloadAfterLoadRunParam(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "606b65a06426e3e1c0c57fdb1c5efb2d", RobustBitConfig.DEFAULT_VALUE) ? (DynRunParam) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "606b65a06426e3e1c0c57fdb1c5efb2d") : new DynRunParam("PreDownloadAfterLoad", true, z, false, false, false);
    }

    public static DynRunParam genePreDownloadDynInitRunParam() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "272271b139ff617529c5fe5a9f8bb548", RobustBitConfig.DEFAULT_VALUE) ? (DynRunParam) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "272271b139ff617529c5fe5a9f8bb548") : new DynRunParam("PreDownloadDynInit", true, false, false, true, true);
    }

    public static DynRunParam genePreDownloadPreInitRunParam() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5d257e97c2cd099d7114e29f8cf9cef9", RobustBitConfig.DEFAULT_VALUE) ? (DynRunParam) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5d257e97c2cd099d7114e29f8cf9cef9") : new DynRunParam("PreDownloadPreInit", false, false, false, false, false);
    }

    public static DynRunParam geneUserTriggerRunParam() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b581f9a7c8eca6072cc4a1ec204cc890", RobustBitConfig.DEFAULT_VALUE) ? (DynRunParam) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b581f9a7c8eca6072cc4a1ec204cc890") : new DynRunParam("UserTrigger", true, false, false, false, false);
    }
}
