package com.sankuai.waimai.mmp.modules.api;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.msi.a;
import com.meituan.msi.addapter.invoicetitle.IchooseInvoiceTitle;
import com.meituan.msi.addapter.invoicetitle.InvoiceTitleParam;
import com.meituan.msi.addapter.invoicetitle.InvoiceTitleResult;
import com.meituan.msi.api.g;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WmChooseInvoiceTitle extends IchooseInvoiceTitle implements g {
    public static ChangeQuickRedirect b;

    @Override // com.meituan.msi.addapter.invoicetitle.IchooseInvoiceTitle
    public final void a(MsiCustomContext msiCustomContext, InvoiceTitleParam invoiceTitleParam, i<InvoiceTitleResult> iVar) {
        Object[] objArr = {msiCustomContext, invoiceTitleParam, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1785efcd5e3e10035898cf879a10525", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1785efcd5e3e10035898cf879a10525");
        } else if (invoiceTitleParam == null) {
        } else {
            UserCenter userCenter = UserCenter.getInstance(a.f());
            if (userCenter == null || !userCenter.isLogin()) {
                iVar.a(500, "userCenter is null or not login");
                return;
            }
            Uri.Builder builder = new Uri.Builder();
            builder.scheme("https").authority("invoice.meituan.com").path("index.html");
            if (com.sankuai.waimai.foundation.core.a.b()) {
                if (invoiceTitleParam.env == null) {
                    invoiceTitleParam.env = "production";
                }
                if (invoiceTitleParam.env.equals("staging")) {
                    builder.scheme("https").authority("invoicefe.fsp.st.meituan.com").path("index.html");
                } else if (invoiceTitleParam.env.equals("test")) {
                    builder.scheme("https").authority("invoicefe.fsp.test.meituan.com").path("index.html");
                }
            }
            builder.appendQueryParameter("appChannel", "mmp_" + msiCustomContext.getContainerInfo().containerId);
            builder.appendQueryParameter("useInvoice", "1");
            if ("0".equals(invoiceTitleParam.type)) {
                builder.appendQueryParameter("titleType", "1");
            } else if ("1".equals(invoiceTitleParam.type)) {
                builder.appendQueryParameter("titleType", "2");
            }
            builder.appendQueryParameter("specialInvoice", "1");
            builder.appendQueryParameter("showNotice", "1");
            builder.appendQueryParameter("requestForResult", "true");
            builder.appendQueryParameter(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, Integer.toString(97));
            Intent intent = new Intent();
            intent.setData(Uri.parse(String.format("meituanwaimai://waimai.meituan.com/browser?inner_url=%s", Uri.encode(builder.build().toString()))));
            intent.setPackage(a.f().getPackageName());
            msiCustomContext.startActivityForResult(intent, 97);
        }
    }

    @Override // com.meituan.msi.api.g
    public final void a(int i, Intent intent, MsiContext msiContext) {
        Object[] objArr = {Integer.valueOf(i), intent, msiContext};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01138d9c326a20fc99b9594a3b08e816", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01138d9c326a20fc99b9594a3b08e816");
        } else if (i == 0) {
            msiContext.onError("cancel");
        } else if (i != -1) {
        } else {
            String a = f.a(intent, "resultData");
            if (TextUtils.isEmpty(a)) {
                msiContext.onError("resultData is null");
                return;
            }
            InvoiceTitleResult invoiceTitleResult = new InvoiceTitleResult();
            try {
                JSONObject jSONObject = new JSONObject(a);
                String optString = jSONObject.optString("type");
                if ("1".equals(optString)) {
                    invoiceTitleResult.type = "0";
                } else if ("2".equals(optString)) {
                    invoiceTitleResult.type = "1";
                } else {
                    invoiceTitleResult.type = optString;
                }
                invoiceTitleResult.title = jSONObject.optString("title");
                invoiceTitleResult.taxNumber = jSONObject.optString("companyTaxId");
                invoiceTitleResult.companyAddress = jSONObject.optString("companyAddress", "");
                invoiceTitleResult.telephone = jSONObject.optString("phone", "");
                invoiceTitleResult.bankName = jSONObject.optString("bankName", "");
                invoiceTitleResult.bankAccount = jSONObject.optString("bankAccount", "");
                msiContext.onSuccess(invoiceTitleResult);
            } catch (JSONException unused) {
                msiContext.onError("json exception");
            }
        }
    }
}
