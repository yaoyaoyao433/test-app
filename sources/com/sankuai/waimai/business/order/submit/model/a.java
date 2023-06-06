package com.sankuai.waimai.business.order.submit.model;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.confirm.model.ap.ApDataWrapper;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a implements Serializable {
    public static ChangeQuickRedirect a;
    @SerializedName("hint_text")
    public String b;

    public static String a(ApDataWrapper apDataWrapper) {
        com.sankuai.waimai.bussiness.order.confirm.model.ap.b bottomPayTipData;
        a aVar;
        boolean z = true;
        Object[] objArr = {apDataWrapper};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ef49660ae76de3054523a46217b3269a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ef49660ae76de3054523a46217b3269a");
        }
        if (apDataWrapper != null && (bottomPayTipData = apDataWrapper.getBottomPayTipData()) != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.bussiness.order.confirm.model.ap.b.a;
            if (PatchProxy.isSupport(objArr2, bottomPayTipData, changeQuickRedirect2, false, "f43efbb2646ca22c67cd563dd7878d9a", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, bottomPayTipData, changeQuickRedirect2, false, "f43efbb2646ca22c67cd563dd7878d9a")).booleanValue();
            } else if (TextUtils.isEmpty(bottomPayTipData.c)) {
                z = false;
            }
            if (z && (aVar = (a) new Gson().fromJson(bottomPayTipData.c, (Class<Object>) a.class)) != null) {
                return aVar.b;
            }
            return null;
        }
        return null;
    }
}
