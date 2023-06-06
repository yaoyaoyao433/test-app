package com.sankuai.waimai.store.view;

import android.support.annotation.NonNull;
import android.text.style.ClickableSpan;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class e extends ClickableSpan {
    public static ChangeQuickRedirect c;

    @Override // android.text.style.ClickableSpan
    public void onClick(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58d5cf24375b625638e0c0e94b89fd9f", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58d5cf24375b625638e0c0e94b89fd9f");
        }
    }
}
