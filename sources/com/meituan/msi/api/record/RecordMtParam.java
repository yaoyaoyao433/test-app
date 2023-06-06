package com.meituan.msi.api.record;

import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class RecordMtParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String sceneToken;

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "00257420d3470f5ab6ad6482c0b42560", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "00257420d3470f5ab6ad6482c0b42560");
        }
        StringBuilder sb = new StringBuilder("RecordMtParam{sceneToken='");
        sb.append(this.sceneToken);
        return sb.toString() != null ? this.sceneToken : " '}";
    }
}
