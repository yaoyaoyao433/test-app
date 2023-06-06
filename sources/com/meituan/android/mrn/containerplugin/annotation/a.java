package com.meituan.android.mrn.containerplugin.annotation;

import com.meituan.android.common.aidata.mrn.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.model.datarequest.dealfilter.Filter;
import com.sankuai.waimai.alita.core.mlmodel.predictor.bean.TensorConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public enum a {
    input(TensorConfig.KEY_INPUT_ARRAY),
    inputNumber("inputNumber"),
    textArea("textArea"),
    checkbox(Filter.SHOWTYPE_CHECKBOX),
    select(Constants.SQLConstants.KEY_SELECT),
    multiSelect("multiSelect");
    
    public static ChangeQuickRedirect a;
    private String h;

    public static a valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "35622942f6abfcef19dcb06212a3f30e", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "35622942f6abfcef19dcb06212a3f30e") : (a) Enum.valueOf(a.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static a[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d19a744e2264b815a8f3ad09b87d99f4", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d19a744e2264b815a8f3ad09b87d99f4") : (a[]) values().clone();
    }

    a(String str) {
        Object[] objArr = {r10, Integer.valueOf(r11), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e0d450308cd92fb29a2f38f72efe6a1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e0d450308cd92fb29a2f38f72efe6a1");
        } else {
            this.h = str;
        }
    }
}
