package com.sankuai.waimai.sa.ui.assistant;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class c extends com.sankuai.waimai.platform.base.b {
    public static ChangeQuickRedirect a;
    protected View b;

    public c(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01393aa2c9fdad204f72a463248391aa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01393aa2c9fdad204f72a463248391aa");
        }
    }

    @Override // com.sankuai.waimai.platform.base.b
    public final View h() {
        return this.b;
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7a103ba524094c99b027163ee1d9f07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7a103ba524094c99b027163ee1d9f07");
        } else if (this.b != null) {
            this.b.setVisibility(z ? 0 : 8);
        }
    }
}
