package com.meituan.android.hybridcashier.bridge.result;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.meituan.android.paybase.utils.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class NotifyHybridProcessResultHandler extends com.meituan.android.neohybrid.neo.bridge.handler.a {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.neohybrid.neo.bridge.handler.NeoBridgeCustomizeInterface
    @NonNull
    public final String a() {
        return "pay_notifyHybridProcessResult";
    }

    @Override // com.meituan.android.neohybrid.neo.bridge.handler.a, com.meituan.android.neohybrid.neo.bridge.handler.NeoBridgeCustomizeInterface
    public final void a(com.meituan.android.neohybrid.neo.bridge.a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f0b7aa277c0d140c3a3e342bad46e43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f0b7aa277c0d140c3a3e342bad46e43");
            return;
        }
        super.a(aVar, str);
        PayResultBean payResultBean = (PayResultBean) com.meituan.android.neohybrid.util.gson.b.a().fromJson(str, (Class<Object>) PayResultBean.class);
        if (payResultBean == null) {
            a(-1, "入参错误");
        } else if (aVar == null) {
            a(-1, "状态错误");
        } else if (TextUtils.equals(payResultBean.getAction(), "finish") && TextUtils.equals(payResultBean.getStatus(), "success")) {
            Activity d = aVar.d();
            Object[] objArr2 = {this, aVar, payResultBean};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            f.a(d, PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "cf46398a0e6bb073818c1781515f7c8b", RobustBitConfig.DEFAULT_VALUE) ? (f.InterfaceC0337f) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "cf46398a0e6bb073818c1781515f7c8b") : new a(this, aVar, payResultBean));
        } else {
            a(aVar, payResultBean);
        }
    }

    public static /* synthetic */ void a(NotifyHybridProcessResultHandler notifyHybridProcessResultHandler, com.meituan.android.neohybrid.neo.bridge.a aVar, PayResultBean payResultBean, boolean z) {
        Object[] objArr = {notifyHybridProcessResultHandler, aVar, payResultBean, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "162493731ee73b930b0aa13a927bea4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "162493731ee73b930b0aa13a927bea4e");
        } else {
            notifyHybridProcessResultHandler.a(aVar, payResultBean);
        }
    }

    private void a(com.meituan.android.neohybrid.neo.bridge.a aVar, PayResultBean payResultBean) {
        Object[] objArr = {aVar, payResultBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11cb70215baff5ac1bd0970655076a9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11cb70215baff5ac1bd0970655076a9f");
            return;
        }
        com.meituan.android.neohybrid.core.listener.a g = aVar.g();
        if ((g instanceof c) && ((c) g).a(payResultBean)) {
            a((JsonObject) null);
        } else {
            a(-1, "异常流程");
        }
    }
}
