package com.meituan.msc.modules.api.msi.components.coverview;

import android.support.annotation.Keep;
import android.view.View;
import android.view.ViewConfiguration;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class MSCCoverViewTouchHelper {
    public static ChangeQuickRedirect a;
    final int b;
    int c;
    int d;
    int e;
    public boolean f;

    public MSCCoverViewTouchHelper(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bae1b6263919aea7081a624d772047d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bae1b6263919aea7081a624d772047d");
            return;
        }
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = false;
        this.b = i;
    }

    public static void a(View view, com.meituan.msc.modules.api.msi.e eVar, Boolean bool) {
        Object[] objArr = {view, eVar, bool};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6cd28c164e7c481ba9980ba47fd3db85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6cd28c164e7c481ba9980ba47fd3db85");
        } else if (bool == null) {
        } else {
            if (view.getTag("msc_touch".hashCode()) != null) {
                h hVar = (h) view.getTag("msc_touch".hashCode());
                if (bool.booleanValue() != hVar.b) {
                    hVar.b = bool.booleanValue();
                }
            } else if (bool.booleanValue()) {
                h hVar2 = new h(eVar, ViewConfiguration.get(view.getContext()).getScaledTouchSlop());
                view.setTag("msc_touch".hashCode(), hVar2);
                view.setOnTouchListener(hVar2);
            }
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    static class TouchInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int id;
        public double x;
        public double y;

        public TouchInfo(int i, double d, double d2) {
            this.id = i;
            this.x = d;
            this.y = d2;
        }
    }
}
