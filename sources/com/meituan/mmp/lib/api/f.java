package com.meituan.mmp.lib.api;

import com.meituan.mmp.lib.api.address.AbsAddressModule;
import com.meituan.mmp.lib.api.device.AbsScanCodeModule;
import com.meituan.mmp.lib.api.invoice.AbsInvoiceApi;
import com.meituan.mmp.lib.api.location.AbsLbsModule;
import com.meituan.mmp.lib.api.location.AbsMapLocationModule;
import com.meituan.mmp.lib.api.pay.AbsMTPayApi;
import com.meituan.mmp.lib.api.pay.AbsPaymentCommissionContractApi;
import com.meituan.mmp.lib.api.risk.AbsRiskManagementApi;
import com.meituan.mmp.lib.api.share.AbsShareApi;
import com.meituan.mmp.lib.api.ui.AbsCategoryEntryModule;
import com.meituan.mmp.lib.api.update.UpdateHostAppModule;
import com.meituan.mmp.lib.api.user.AbsUserModule;
import com.meituan.mmp.lib.api.utm.AbsUtmModule;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f {
    public static ChangeQuickRedirect a;
    public static e<UpdateHostAppModule.AbsUpdateHostApp> x = g.b();
    public e<AbsUserModule.AbsMtLogin> b;
    public e<AbsUserModule.AbsLogin> c;
    public e<AbsUserModule.AbsMtLogout> d;
    public e<AbsUserModule.AbsMtCheckSession> e;
    public e<AbsUserModule.AbsCheckSession> f;
    public e<AbsUserModule.AbsGetUserInfo> g;
    public e<AbsUserModule.AbsGetMTUserInfo> h;
    public e<AbsUserModule.AbsGetPhoneNumber> i;
    public e<AbsUserModule.AbsAuthorizeFail> j;
    public e<AbsMapLocationModule.AbsOpenLocation> k;
    public e<AbsMapLocationModule.AbsOpenPOILocation> l;
    public e<AbsMapLocationModule.AbsChooseLocation> m;
    public e<AbsShareApi.AbsMtShare> n;
    public e<AbsShareApi.AbsShare> o;
    public e<AbsScanCodeModule.AbsScanCode> p;
    public e<AbsMTPayApi.AbsMtRequestPayment> q;
    public e<AbsPaymentCommissionContractApi.AbsOpenPaymentCommissionContract> r;
    public e<AbsInvoiceApi.AbsChooseInvoiceTitle> s;
    public e<AbsAddressModule.AbsChooseAddress> t;
    public e<AbsLbsModule.AbsGetSelectedCityInfo> u;
    public e<AbsRiskManagementApi.AbsGetRiskControlFingerprint> v;
    public e<AbsUtmModule.AbsGetUTMFromKNB> w;
    public e<AbsCategoryEntryModule.AbsShowCategoryEntry> y;
}
