package com.sankuai.waimai.mmp.modules.api;

import android.content.Intent;
import android.net.Uri;
import com.meituan.msi.addapter.payment.IopenPaymentCommissionContract;
import com.meituan.msi.addapter.payment.OpenPaymentCommissionContractParam;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.a;
import com.sankuai.waimai.platform.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class OpenPaymentCommissionContract extends IopenPaymentCommissionContract {
    public static ChangeQuickRedirect b;

    @Override // com.meituan.msi.addapter.payment.IopenPaymentCommissionContract
    public final void a(MsiCustomContext msiCustomContext, OpenPaymentCommissionContractParam openPaymentCommissionContractParam, i iVar) {
        Object[] objArr = {msiCustomContext, openPaymentCommissionContractParam, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d318f3269abfee028993599ea215a09e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d318f3269abfee028993599ea215a09e");
            return;
        }
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https").authority("npay.meituan.com");
        if (a.b()) {
            if (openPaymentCommissionContractParam.env == null) {
                openPaymentCommissionContractParam.env = "production";
            }
            String str = openPaymentCommissionContractParam.env;
            if (str.equals("staging")) {
                builder.scheme("http").authority("stable.pay.st.sankuai.com");
            } else if (str.equals("test")) {
                builder.scheme("http").authority("stable.pay.test.sankuai.com");
            }
        }
        builder.path("resource").appendPath("deduction").appendPath("index.html");
        builder.appendQueryParameter("nb_app", b.A().r());
        Object[] objArr2 = {builder, openPaymentCommissionContractParam};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "15de1fa1feabe1d4a633cb3b7c96b7bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "15de1fa1feabe1d4a633cb3b7c96b7bb");
        } else {
            if (openPaymentCommissionContractParam.iph_pay_merchant_no != null) {
                builder.appendQueryParameter("iph_pay_merchant_no", openPaymentCommissionContractParam.iph_pay_merchant_no);
            }
            if (openPaymentCommissionContractParam.biz_scene != null) {
                builder.appendQueryParameter("biz_scene", openPaymentCommissionContractParam.biz_scene);
            }
            if (openPaymentCommissionContractParam.partner_id != null) {
                builder.appendQueryParameter("partner_id", String.valueOf(openPaymentCommissionContractParam.partner_id));
            }
            if (openPaymentCommissionContractParam.uuid != null) {
                builder.appendQueryParameter("uuid", String.valueOf(openPaymentCommissionContractParam.uuid));
            }
            if (openPaymentCommissionContractParam.userid != null) {
                builder.appendQueryParameter("userid", String.valueOf(openPaymentCommissionContractParam.userid));
            }
            if (openPaymentCommissionContractParam.envriskParams != null) {
                builder.appendQueryParameter("envriskParams", openPaymentCommissionContractParam.envriskParams);
            }
            if (openPaymentCommissionContractParam.plan_id != null) {
                builder.appendQueryParameter("plan_id", String.valueOf(openPaymentCommissionContractParam.plan_id));
            }
            if (openPaymentCommissionContractParam.mt_plan_id != null) {
                builder.appendQueryParameter("mt_plan_id", String.valueOf(openPaymentCommissionContractParam.mt_plan_id));
            }
            if (openPaymentCommissionContractParam.sellerId != null) {
                builder.appendQueryParameter("sellerId", String.valueOf(openPaymentCommissionContractParam.sellerId));
            }
            if (openPaymentCommissionContractParam.header_marketing != null) {
                builder.appendQueryParameter("header_marketing", openPaymentCommissionContractParam.header_marketing);
            }
            if (openPaymentCommissionContractParam.custom_subtitle != null) {
                builder.appendQueryParameter("custom_subtitle", openPaymentCommissionContractParam.custom_subtitle);
            }
            if (openPaymentCommissionContractParam.show_custom_module != null) {
                builder.appendQueryParameter("show_custom_module", String.valueOf(openPaymentCommissionContractParam.show_custom_module));
            }
            if (openPaymentCommissionContractParam.notice_type != null) {
                builder.appendQueryParameter("notice_type", openPaymentCommissionContractParam.notice_type);
            }
            if (openPaymentCommissionContractParam.callback_type != null) {
                builder.appendQueryParameter("callback_type", openPaymentCommissionContractParam.callback_type);
            }
            if (openPaymentCommissionContractParam.callback_url != null) {
                builder.appendQueryParameter("callback_url", openPaymentCommissionContractParam.callback_url);
            }
            if (openPaymentCommissionContractParam.entry != null) {
                builder.appendQueryParameter("entry", openPaymentCommissionContractParam.entry);
            }
        }
        builder.appendQueryParameter("version_name", b.A().i());
        Intent intent = new Intent();
        intent.setData(Uri.parse(String.format("meituanwaimai://waimai.meituan.com/browser?inner_url=%s", Uri.encode(builder.build().toString()))));
        intent.setPackage(com.meituan.msi.a.f().getPackageName());
        msiCustomContext.startActivityForResult(intent, -1);
        iVar.a("");
    }
}
