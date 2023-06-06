package com.sankuai.waimai.mmp.modules.api;

import android.text.TextUtils;
import com.meituan.msi.a;
import com.meituan.msi.api.abtest.GetABParam;
import com.meituan.msi.api.abtest.GetABResponse;
import com.meituan.msi.api.abtest.IABTest;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.abtestv2.d;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ABTestApi extends IABTest {
    public static ChangeQuickRedirect b;

    @Override // com.meituan.msi.api.abtest.IABTest
    public final GetABResponse a(GetABParam getABParam, MsiContext msiContext) {
        Object[] objArr = {getABParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88543f6395786b9646ca4675559c503c", RobustBitConfig.DEFAULT_VALUE)) {
            return (GetABResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88543f6395786b9646ca4675559c503c");
        }
        if (TextUtils.isEmpty(getABParam.key)) {
            msiContext.onError(500, "key is empty!");
            return new GetABResponse();
        }
        String a = d.a(a.f()).a(getABParam.key);
        GetABResponse getABResponse = new GetABResponse();
        if (a == null) {
            a = "";
        }
        getABResponse.data = a;
        msiContext.onSuccess(getABResponse);
        return getABResponse;
    }
}
