package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.mapsdk.internal.em;
import com.tencent.mapsdk.internal.pe;
import com.tencent.tencentmap.mapsdk.maps.TencentMapContext;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class pd extends ek {
    TextView a;
    public pe.a b;
    private Context c;

    @Override // com.tencent.mapsdk.internal.em
    public final void a(em.b bVar) {
    }

    @Override // com.tencent.mapsdk.internal.ff
    public final void b(int i, int i2) {
    }

    @Override // com.tencent.mapsdk.internal.em
    public final void c() {
    }

    @Override // com.tencent.mapsdk.internal.em
    public final em.b d() {
        return null;
    }

    public pd(Context context, TencentMapContext tencentMapContext) {
        this.c = context;
        this.a = new mk(this.c, tencentMapContext);
    }

    @Override // com.tencent.mapsdk.internal.em
    public final boolean a(final ViewGroup viewGroup, Bundle bundle) {
        if (viewGroup == null || this.a == null) {
            return false;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.a.setLayoutParams(layoutParams);
        int measuredWidth = viewGroup.getMeasuredWidth();
        int measuredHeight = viewGroup.getMeasuredHeight();
        this.a.setTextSize(18.0f);
        this.a.setTextColor(-16777216);
        this.a.setText("鉴权失败,请检查你的key");
        Bitmap a = gx.a(this.a);
        jy.a(new Runnable() { // from class: com.tencent.mapsdk.internal.pd.1
            @Override // java.lang.Runnable
            public final void run() {
                viewGroup.addView(pd.this.a);
            }
        });
        if (this.b != null) {
            this.b.a(a, measuredWidth, measuredHeight);
            return true;
        }
        return true;
    }

    @Override // com.tencent.mapsdk.internal.ek
    public final View[] b() {
        return new View[0];
    }

    private Bitmap e() {
        this.a.setTextSize(18.0f);
        this.a.setTextColor(-16777216);
        this.a.setText("鉴权失败,请检查你的key");
        return gx.a(this.a);
    }

    private void a(pe.a aVar) {
        this.b = aVar;
    }
}
