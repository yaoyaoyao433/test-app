package com.sankuai.waimai.store.drug.home.refactor.card.shopping_guide;

import android.graphics.Bitmap;
import android.util.Pair;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class c implements rx.functions.b {
    public static ChangeQuickRedirect a;
    private final ImageView b;

    public c(ImageView imageView) {
        this.b = imageView;
    }

    @Override // rx.functions.b
    public final void call(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcd15597269f2b69202d99607e1a00e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcd15597269f2b69202d99607e1a00e4");
            return;
        }
        ImageView imageView = this.b;
        Object[] objArr2 = {imageView, obj};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1bbcc436c591440929acfd6d02026afd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1bbcc436c591440929acfd6d02026afd");
        } else if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            if (pair.first instanceof Bitmap) {
                if ((pair.second instanceof Integer) && ((Integer) pair.second).intValue() > 0) {
                    ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                    layoutParams.height = ((Integer) pair.second).intValue();
                    imageView.setLayoutParams(layoutParams);
                }
                imageView.setImageBitmap((Bitmap) pair.first);
            }
        }
    }
}
