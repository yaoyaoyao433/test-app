package com.meituan.mmp.lib.utils;

import com.meituan.android.recce.props.gens.LineHeight;
import com.meituan.mmp.lib.widget.MMPTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class al {
    public static ChangeQuickRedirect a;

    public static void a(MMPTextView mMPTextView, JSONObject jSONObject) {
        Object[] objArr = {mMPTextView, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "10809d1e0c9eceb2f1e30e7e6df2692d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "10809d1e0c9eceb2f1e30e7e6df2692d");
        } else if (jSONObject != null && jSONObject.has(LineHeight.LOWER_CASE_NAME)) {
            mMPTextView.setLineHeightEx(p.c((float) jSONObject.optDouble(LineHeight.LOWER_CASE_NAME)));
        } else {
            mMPTextView.setLineHeightEx(Math.round(mMPTextView.getTextSize() * 1.2f));
        }
    }
}
