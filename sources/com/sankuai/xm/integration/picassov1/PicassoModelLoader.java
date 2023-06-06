package com.sankuai.xm.integration.picassov1;

import android.content.Context;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.integration.imageloader.IImageModelLoader;
import com.sankuai.xm.integration.imageloader.c;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.squareup.picasso.Transformation;
import com.squareup.picasso.bitmap.b;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class PicassoModelLoader implements IImageModelLoader {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.integration.imageloader.IImageModelLoader
    public final void a(Context context, View view, c cVar) {
        Object[] objArr = {context, view, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b811c7af15f47a423267108d9fefe86", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b811c7af15f47a423267108d9fefe86");
        } else {
            a(context, view, cVar, false);
        }
    }

    @Override // com.sankuai.xm.integration.imageloader.IImageModelLoader
    public final void b(Context context, View view, c cVar) {
        Object[] objArr = {context, view, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f1d29c9998ca9e1d536b36caa61bf56", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f1d29c9998ca9e1d536b36caa61bf56");
        } else {
            a(context, view, cVar, true);
        }
    }

    private void a(Context context, View view, c cVar, boolean z) {
        Object[] objArr = {context, view, cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c10ff7db6c9e6b114540dcce54dc69ca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c10ff7db6c9e6b114540dcce54dc69ca");
            return;
        }
        Context applicationContext = Build.VERSION.SDK_INT <= 20 ? context.getApplicationContext() : context;
        RequestCreator a2 = Picasso.g(applicationContext).a(cVar.a);
        if (cVar.b > 0 && cVar.c > 0) {
            a2.a(cVar.b, cVar.c);
        } else if (cVar.d != -1 || cVar.e != null) {
            a2.d = true;
        }
        ArrayList arrayList = new ArrayList();
        if (cVar.d != -1) {
            switch (cVar.d) {
                case 0:
                    a2.g();
                    arrayList.add(new b(applicationContext));
                    break;
                case 1:
                    a2.e();
                    arrayList.add(new com.squareup.picasso.bitmap.a(applicationContext));
                    break;
            }
        }
        if (cVar.e != null) {
            Transformation transformation = null;
            switch (cVar.e.a) {
                case 1:
                    transformation = new com.sankuai.xm.integration.picassov1.transformation.b(((com.sankuai.xm.integration.imageloader.shape.a) cVar.e).b, 0);
                    break;
                case 2:
                    transformation = new com.sankuai.xm.integration.picassov1.transformation.a();
                    break;
            }
            if (transformation != null) {
                a2.a(transformation);
                arrayList.add(transformation);
            }
        }
        a2.a(arrayList);
        if (cVar.f != -1) {
            a2.i = ContextCompat.getDrawable(applicationContext, cVar.f);
        }
        if (cVar.g != -1) {
            a2.j = ContextCompat.getDrawable(applicationContext, cVar.g);
        }
        if (com.sankuai.xm.integration.imageloader.utils.a.a(cVar.a)) {
            a2.v = new a(applicationContext);
            a2.w = new a(applicationContext);
        }
        if (z) {
            if (cVar.h) {
                a2.u = true;
                a2.a((ImageView) view, cVar.i >= 0 ? cVar.i : -1);
                return;
            }
            a2.t = true;
            a2.a((ImageView) view);
            return;
        }
        a2.a((ImageView) view);
    }
}
