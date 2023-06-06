package com.meituan.android.common.aidata.data;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class EventFilter {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String bid;
    public String category;
    public String cid;
    public int[] isAuto;
    public String nm;
    public int[] nt;
    public String val_lab;

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31932419a22cbee93baafebbc44d2045", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31932419a22cbee93baafebbc44d2045");
        }
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.category)) {
            sb.append("category:");
            sb.append(this.category);
            sb.append(CommonConstant.Symbol.COMMA);
        }
        if (!TextUtils.isEmpty(this.nm)) {
            sb.append("nm:");
            sb.append(this.nm);
            sb.append(CommonConstant.Symbol.COMMA);
        }
        if (!TextUtils.isEmpty(this.cid)) {
            sb.append("cid:");
            sb.append(this.cid);
            sb.append(CommonConstant.Symbol.COMMA);
        }
        if (!TextUtils.isEmpty(this.bid)) {
            sb.append("bid:");
            sb.append(this.bid);
            sb.append(CommonConstant.Symbol.COMMA);
        }
        if (!TextUtils.isEmpty(this.val_lab)) {
            sb.append("val_lab:");
            sb.append(this.val_lab);
            sb.append(CommonConstant.Symbol.COMMA);
        }
        if (this.nt != null && this.nt.length > 0) {
            sb.append("nt:");
            sb.append(Arrays.toString(this.nt));
            sb.append(CommonConstant.Symbol.COMMA);
        }
        if (this.isAuto != null && this.isAuto.length > 0) {
            sb.append("isAuto:");
            sb.append(Arrays.toString(this.isAuto));
        }
        return sb.toString();
    }
}
