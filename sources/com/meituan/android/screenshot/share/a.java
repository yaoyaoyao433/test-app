package com.meituan.android.screenshot.share;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.RestrictTo;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public View b;
    public Bitmap c;
    public Bitmap d;
    public Context e;
    private View f;
    private ImageView g;
    private ImageView h;

    public a(Context context, Bitmap bitmap, Bitmap bitmap2) {
        Object[] objArr = {context, bitmap, bitmap2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1539370ad0cacffab9d08c48864854b4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1539370ad0cacffab9d08c48864854b4");
            return;
        }
        this.c = bitmap;
        this.d = bitmap2;
        this.e = context;
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c40059c30bc563b0e13176dc01fed23e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c40059c30bc563b0e13176dc01fed23e");
            return;
        }
        this.f = LayoutInflater.from(context).inflate(R.layout.share_bitmap_template, (ViewGroup) null);
        this.g = (ImageView) this.f.findViewById(R.id.background_image);
        if (this.d != null) {
            this.g.setImageBitmap(this.d);
        } else {
            this.g.setVisibility(4);
        }
        this.b = this.f.findViewById(R.id.relative_layout);
        this.h = (ImageView) this.f.findViewById(R.id.screen_share_qr_code);
        if (this.c != null) {
            this.h.setImageBitmap(this.c);
        } else {
            this.h.setVisibility(4);
        }
    }
}
