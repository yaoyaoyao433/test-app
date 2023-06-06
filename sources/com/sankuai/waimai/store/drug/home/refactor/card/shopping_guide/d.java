package com.sankuai.waimai.store.drug.home.refactor.card.shopping_guide;

import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import rx.d;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class d implements d.a {
    public static ChangeQuickRedirect a;
    private final int[] b;
    private final int c;
    private final Bitmap d;
    private final int e;

    public d(int[] iArr, int i, Bitmap bitmap, int i2) {
        this.b = iArr;
        this.c = i;
        this.d = bitmap;
        this.e = i2;
    }

    @Override // rx.functions.b
    public final void call(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9eda70c0af6ee1e8ba45379987a1c1aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9eda70c0af6ee1e8ba45379987a1c1aa");
            return;
        }
        int[] iArr = this.b;
        int i = this.c;
        Bitmap bitmap = this.d;
        int i2 = this.e;
        j jVar = (j) obj;
        Object[] objArr2 = {iArr, Integer.valueOf(i), bitmap, Integer.valueOf(i2), jVar};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ea7df5bc7e5dcaec2046d8cdb58ec2b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ea7df5bc7e5dcaec2046d8cdb58ec2b4");
        } else if (iArr[0] + i > bitmap.getWidth() || iArr[1] + i2 > bitmap.getHeight()) {
            jVar.onNext(null);
        } else {
            jVar.onNext(bitmap);
        }
    }
}
