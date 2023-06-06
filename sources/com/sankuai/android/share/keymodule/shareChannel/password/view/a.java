package com.sankuai.android.share.keymodule.shareChannel.password.view;

import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ImageUtils;
import com.squareup.picasso.Transformation;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements Transformation {
    public static ChangeQuickRedirect a;
    private static final a b = new a();

    @Override // com.squareup.picasso.Transformation
    public final String a() {
        return "com.sankuai.android.share.keymodule.shareChannel.password.view.RoundTransformation";
    }

    public static a b() {
        return b;
    }

    @Override // com.squareup.picasso.Transformation
    public final Bitmap a(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86834a196ed5b56052009609b54061f4", RobustBitConfig.DEFAULT_VALUE) ? (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86834a196ed5b56052009609b54061f4") : ImageUtils.getRoundCornerBitmap(bitmap, bitmap.getWidth(), 0);
    }
}
