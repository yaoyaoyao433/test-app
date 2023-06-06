package com.meituan.android.pay.desk.pack;

import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.paycommon.lib.webview.specialcontainer.dialogclose.WebViewDialogCloseActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final e b;
    private final Fragment c;
    private final MTPayment d;

    private g(e eVar, Fragment fragment, MTPayment mTPayment) {
        this.b = eVar;
        this.c = fragment;
        this.d = mTPayment;
    }

    public static View.OnClickListener a(e eVar, Fragment fragment, MTPayment mTPayment) {
        Object[] objArr = {eVar, fragment, mTPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6cc35f4defa0f233b8a3555ff81fe2f6", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6cc35f4defa0f233b8a3555ff81fe2f6") : new g(eVar, fragment, mTPayment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7946c37714a4e53d017f1289e7f7e502", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7946c37714a4e53d017f1289e7f7e502");
            return;
        }
        e eVar = this.b;
        Fragment fragment = this.c;
        MTPayment mTPayment = this.d;
        Object[] objArr2 = {eVar, fragment, mTPayment, view};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6fe8a6dbb475e11dab0cbfb4fd6bb867", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6fe8a6dbb475e11dab0cbfb4fd6bb867");
            return;
        }
        Object[] objArr3 = {fragment, mTPayment};
        ChangeQuickRedirect changeQuickRedirect3 = e.a;
        if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "28ffe832789fd21bace9b17a7296f4ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "28ffe832789fd21bace9b17a7296f4ad");
        } else if (mTPayment != null) {
            if (mTPayment.getCommonAgreement() != null) {
                String url = mTPayment.getCommonAgreement().getUrl();
                if (!TextUtils.isEmpty(url)) {
                    WebViewDialogCloseActivity.b(fragment.getContext(), url);
                    return;
                }
            }
            com.meituan.android.paybase.common.analyse.cat.a.a("urlIsNull", mTPayment.getPayType() + "协议链接为空");
        }
    }
}
