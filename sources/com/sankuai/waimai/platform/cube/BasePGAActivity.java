package com.sankuai.waimai.platform.cube;

import com.meituan.android.cube.core.f;
import com.meituan.android.cube.core.g;
import com.meituan.android.cube.pga.core.a;
import com.meituan.android.cube.pga.core.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class BasePGAActivity extends BaseCubeActivity {
    public static ChangeQuickRedirect n;

    public abstract a f();

    @Override // com.sankuai.waimai.platform.cube.BaseCubeActivity
    public final g o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7faf8b45bf88b9945c3800e3d41b0494", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7faf8b45bf88b9945c3800e3d41b0494") : new b() { // from class: com.sankuai.waimai.platform.cube.BasePGAActivity.1
            public static ChangeQuickRedirect g;

            @Override // com.meituan.android.cube.core.g
            public final f g() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = g;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "036524e8fec40a567cc176533e9c35d6", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "036524e8fec40a567cc176533e9c35d6") : BasePGAActivity.this.g();
            }

            @Override // com.meituan.android.cube.pga.core.b
            public final a h() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = g;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6a78ec44d0c103b9a99901146fa503dd", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6a78ec44d0c103b9a99901146fa503dd") : BasePGAActivity.this.f();
            }
        };
    }
}
