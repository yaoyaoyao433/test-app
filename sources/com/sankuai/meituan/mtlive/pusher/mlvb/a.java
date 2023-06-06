package com.sankuai.meituan.mtlive.pusher.mlvb;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.liteav.beauty.TXBeautyManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements com.sankuai.meituan.mtlive.pusher.library.a {
    public static ChangeQuickRedirect a;
    private TXBeautyManager b;

    public a(TXBeautyManager tXBeautyManager) {
        Object[] objArr = {tXBeautyManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "279cca911596ece5bdb7c805bde7a7e1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "279cca911596ece5bdb7c805bde7a7e1");
        } else {
            this.b = tXBeautyManager;
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0541bc702ad06f5a464839ed4ceb260d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0541bc702ad06f5a464839ed4ceb260d");
        } else {
            this.b.setBeautyLevel(i);
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.a
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18cca7db261960100eba95513f5e69bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18cca7db261960100eba95513f5e69bc");
        } else {
            this.b.setWhitenessLevel(i);
        }
    }
}
