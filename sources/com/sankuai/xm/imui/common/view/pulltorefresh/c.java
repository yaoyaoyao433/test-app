package com.sankuai.xm.imui.common.view.pulltorefresh;

import android.annotation.TargetApi;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.imui.common.view.pulltorefresh.e;
/* compiled from: ProGuard */
@TargetApi(9)
/* loaded from: classes6.dex */
public final class c {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.imui.common.view.pulltorefresh.c$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a = new int[e.i.valuesCustom().length];

        static {
            try {
                a[e.i.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static boolean a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1dc044e428b08f22facbeb75557125fc", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1dc044e428b08f22facbeb75557125fc")).booleanValue() : view.getOverScrollMode() != 2;
    }
}
