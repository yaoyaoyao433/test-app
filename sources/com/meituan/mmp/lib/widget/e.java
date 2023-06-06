package com.meituan.mmp.lib.widget;

import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ImageUtils;
import com.squareup.picasso.Transformation;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e implements Transformation {
    public static ChangeQuickRedirect a;
    private static final e b = new e();

    @Override // com.squareup.picasso.Transformation
    public final String a() {
        return "com.meituan.mmp.lib.widget.RoundTransformation";
    }

    public static e b() {
        return b;
    }

    @Override // com.squareup.picasso.Transformation
    public final Bitmap a(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3799049b7a8b186563e6592d9bb5f571", RobustBitConfig.DEFAULT_VALUE) ? (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3799049b7a8b186563e6592d9bb5f571") : ImageUtils.getRoundCornerBitmap(bitmap, bitmap.getWidth(), 0);
    }
}
