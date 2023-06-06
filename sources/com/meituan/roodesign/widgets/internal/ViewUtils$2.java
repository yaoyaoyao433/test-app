package com.meituan.roodesign.widgets.internal;

import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.WindowInsetsCompat;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.internal.d;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ViewUtils$2 implements OnApplyWindowInsetsListener {
    public static ChangeQuickRedirect a;
    public final /* synthetic */ d.a b;
    public final /* synthetic */ d.b c;

    @Override // android.support.v4.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        Object[] objArr = {view, windowInsetsCompat};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c53e204992d570e5072b9230816c3fed", RobustBitConfig.DEFAULT_VALUE) ? (WindowInsetsCompat) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c53e204992d570e5072b9230816c3fed") : this.b.a(view, windowInsetsCompat, new d.b(this.c));
    }
}
