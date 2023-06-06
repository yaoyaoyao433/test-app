package com.meituan.android.neohybrid.framework.titans.delegate;

import android.view.View;
import com.dianping.titans.ui.ITitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBWebCompat;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a implements com.meituan.android.neohybrid.framework.webcompat.element.a {
    public static ChangeQuickRedirect a;
    private final KNBWebCompat b;
    private final ITitleBar c;

    public a(KNBWebCompat kNBWebCompat, ITitleBar iTitleBar) {
        Object[] objArr = {kNBWebCompat, iTitleBar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d9f7170a98498181f47dabee025b503", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d9f7170a98498181f47dabee025b503");
            return;
        }
        this.b = kNBWebCompat;
        this.c = iTitleBar;
    }

    @Override // com.meituan.android.neohybrid.framework.webcompat.element.a
    public final View a() {
        return (View) this.c;
    }

    @Override // com.meituan.android.neohybrid.framework.webcompat.element.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5d4d699d7f583f3c007adc4ead67285", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5d4d699d7f583f3c007adc4ead67285");
        } else {
            this.b.getWebSettings().invisibleTitleBar();
        }
    }

    @Override // com.meituan.android.neohybrid.framework.webcompat.element.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04b13571b5f40cdee56f37c90b8227ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04b13571b5f40cdee56f37c90b8227ec");
        } else {
            this.b.getWebSettings().visibleTitleBar();
        }
    }

    @Override // com.meituan.android.neohybrid.framework.webcompat.element.a
    public final void a(int i) {
        Object[] objArr = {-1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69a6b4085018d46bb5fae06d8b20551a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69a6b4085018d46bb5fae06d8b20551a");
        } else {
            this.b.getWebHandler().setTitleBarBackground(-1);
        }
    }
}
