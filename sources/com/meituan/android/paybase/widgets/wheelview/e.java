package com.meituan.android.paybase.widgets.wheelview;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements com.meituan.android.paybase.widgets.wheelview.listener.a {
    public static ChangeQuickRedirect a;
    private final WheelViewChooseDialog b;

    public e(WheelViewChooseDialog wheelViewChooseDialog) {
        this.b = wheelViewChooseDialog;
    }

    @Override // com.meituan.android.paybase.widgets.wheelview.listener.a
    public final void a(WheelView wheelView, int i, int i2) {
        Object[] objArr = {wheelView, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a82add0789aaad5278b395dc175ad9b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a82add0789aaad5278b395dc175ad9b9");
        } else {
            WheelViewChooseDialog.a(this.b, wheelView, i, i2);
        }
    }
}
