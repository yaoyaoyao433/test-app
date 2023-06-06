package com.sankuai.eh.component.web.module;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.listener.OnAppendUAListener;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements OnAppendUAListener {
    public static ChangeQuickRedirect a;
    private static final g b = new g();

    public static OnAppendUAListener a() {
        return b;
    }

    @Override // com.sankuai.meituan.android.knb.listener.OnAppendUAListener
    public final String onAppendUA() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de276f5611f80c25ceff92bc5f050027", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de276f5611f80c25ceff92bc5f050027") : f.i();
    }
}
