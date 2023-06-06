package com.meituan.android.paybase.widgets.keyboard;

import android.graphics.Rect;
import android.view.View;
import android.widget.EditText;
import com.meituan.android.paybase.utils.aj;
import com.meituan.android.paybase.widgets.ProgressButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {
    public static ChangeQuickRedirect a;
    private final a b;

    private e(a aVar) {
        this.b = aVar;
    }

    public static Runnable a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7328b0b1da9c33ddf3d383f95d383fa4", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7328b0b1da9c33ddf3d383f95d383fa4") : new e(aVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83738a8d8eee90e5123fcfac36e9f4c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83738a8d8eee90e5123fcfac36e9f4c4");
            return;
        }
        a aVar = this.b;
        boolean z = true;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        View view = null;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7433c2183cfedee4488a75e01fb291c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7433c2183cfedee4488a75e01fb291c8");
            return;
        }
        EditText editText = aVar.c;
        List<View> list = aVar.k;
        Object[] objArr3 = {editText, list};
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "612eaa39bc4e2260fa5ef99b086d7995", RobustBitConfig.DEFAULT_VALUE)) {
            view = (View) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "612eaa39bc4e2260fa5ef99b086d7995");
        } else {
            int i = 0;
            while (true) {
                if (i >= list.size() - 1) {
                    break;
                } else if (editText == list.get(i)) {
                    view = list.get(i + 1);
                    break;
                } else {
                    i++;
                }
            }
        }
        if (view != null) {
            Object[] objArr4 = {view};
            ChangeQuickRedirect changeQuickRedirect4 = a.a;
            if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "0bde72531ef4b6c1e809e338450d1247", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "0bde72531ef4b6c1e809e338450d1247")).booleanValue();
            } else {
                Rect rect = new Rect();
                if (aVar.d != null && view != null) {
                    aVar.d.getDrawingRect(rect);
                    float c = aVar.c(view);
                    float measuredHeight = view.getMeasuredHeight() + c;
                    if (rect.top >= c || rect.bottom <= measuredHeight) {
                        z = false;
                    }
                }
            }
            if (!z) {
                int measuredHeight2 = (view.getMeasuredHeight() + aVar.c(view)) - aVar.d.getMeasuredHeight();
                if (measuredHeight2 < 0) {
                    measuredHeight2 = 0;
                } else if (view instanceof ProgressButton) {
                    measuredHeight2 += aj.a(view.getContext(), 15.0f);
                }
                aVar.d.smoothScrollTo(0, measuredHeight2);
            }
        }
        aVar.g = false;
    }
}
