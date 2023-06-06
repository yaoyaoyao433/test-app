package com.sankuai.waimai.store.drug.goods.list.helper;

import android.animation.ValueAnimator;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private boolean b;
    private com.sankuai.waimai.store.platform.domain.manager.poi.a c;
    private int[] d;
    private ValueAnimator e;
    private ValueAnimator f;
    private boolean g;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(int i);

        void b(float f);
    }

    public d(com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1da398981052434a31457860f192077d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1da398981052434a31457860f192077d");
            return;
        }
        this.b = false;
        this.g = true;
        this.c = aVar;
        this.e = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.e.setDuration(100L);
        this.f = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f.setDuration(100L);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@android.support.annotation.Nullable com.sankuai.waimai.store.drug.goods.list.helper.d.a r19, @android.support.annotation.Nullable android.view.View r20, int r21) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.drug.goods.list.helper.d.a(com.sankuai.waimai.store.drug.goods.list.helper.d$a, android.view.View, int):void");
    }

    private void a(Context context, final a aVar, boolean z) {
        Object[] objArr = {context, aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8406d2f11abf092c177aaa2e2cf2a5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8406d2f11abf092c177aaa2e2cf2a5d");
            return;
        }
        ValueAnimator a2 = a(z);
        final int a3 = h.a(context, 40.0f);
        a2.removeAllUpdateListeners();
        a2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.store.drug.goods.list.helper.d.1
            public static ChangeQuickRedirect a;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object[] objArr2 = {valueAnimator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7c4995385503dcf89559fe8d9b0beb67", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7c4995385503dcf89559fe8d9b0beb67");
                    return;
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (aVar != null) {
                    aVar.a((int) (a3 * floatValue));
                    aVar.b(floatValue);
                }
            }
        });
        a2.start();
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c96180524b9a674518373603f33278fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c96180524b9a674518373603f33278fb");
            return;
        }
        if (this.e != null) {
            this.e.removeAllUpdateListeners();
            this.e.cancel();
        }
        if (this.f != null) {
            this.f.removeAllUpdateListeners();
            this.f.cancel();
        }
    }

    private ValueAnimator a(boolean z) {
        return z ? this.e : this.f;
    }
}
