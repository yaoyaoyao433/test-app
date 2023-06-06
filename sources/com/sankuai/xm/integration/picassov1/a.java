package com.sankuai.xm.integration.picassov1;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.integration.crypto.CryptoProxy;
import com.squareup.picasso.BitmapStreamDecoder;
import com.squareup.picasso.bitmap.c;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a implements BitmapStreamDecoder {
    public static ChangeQuickRedirect a;
    private c b;

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1488894b4b3b0a8a54446e528ffee24", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1488894b4b3b0a8a54446e528ffee24");
        } else {
            this.b = new c(context.getApplicationContext());
        }
    }

    @Override // com.squareup.picasso.BitmapStreamDecoder
    public final Bitmap a(InputStream inputStream, int i, int i2) {
        Object[] objArr = {inputStream, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33c5031da3fc74eca64bc45468452a63", 6917529027641081856L)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33c5031da3fc74eca64bc45468452a63");
        }
        l<Bitmap> a2 = this.b.a.a(CryptoProxy.c().a(inputStream, 1), i, i2);
        if (a2 != null) {
            return a2.a();
        }
        return null;
    }
}
