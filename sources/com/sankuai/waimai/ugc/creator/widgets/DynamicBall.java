package com.sankuai.waimai.ugc.creator.widgets;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class DynamicBall extends View {
    public static ChangeQuickRedirect a;
    ValueAnimator b;
    float c;
    float d;
    private Paint e;
    private float f;
    private boolean g;

    public DynamicBall(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15c334ba0047dac24abb0d5f5aeb8369", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15c334ba0047dac24abb0d5f5aeb8369");
        }
    }

    private DynamicBall(Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83e6d948cd0e59542077c38976a162c0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83e6d948cd0e59542077c38976a162c0");
        }
    }

    public DynamicBall(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6282083a1ae1c5465f3953ed715cc9c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6282083a1ae1c5465f3953ed715cc9c");
            return;
        }
        this.f = 0.0f;
        this.g = false;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2deac72a534d7062c757a36681c87c41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2deac72a534d7062c757a36681c87c41");
            return;
        }
        this.e = new Paint();
        this.e.setAntiAlias(true);
        this.e.setDither(true);
        this.b = new ValueAnimator();
        this.b.setDuration(1000L);
        this.b.setRepeatMode(2);
        this.b.setRepeatCount(-1);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e7a86b393a2bf719800f0a4450f9d2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e7a86b393a2bf719800f0a4450f9d2a");
            return;
        }
        super.onMeasure(i, i2);
        if (this.g) {
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "57ede4015e5a39d06e41c30298536529", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "57ede4015e5a39d06e41c30298536529");
            return;
        }
        this.e.setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), -7859, -15539, Shader.TileMode.CLAMP));
        this.g = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58e114db20df32e4276b51b787c8a666", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58e114db20df32e4276b51b787c8a666");
            return;
        }
        super.onDraw(canvas);
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, this.f, this.e);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "357c9bcf3e4bef8bfd9a4bc2f01b7e91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "357c9bcf3e4bef8bfd9a4bc2f01b7e91");
            return;
        }
        if (this.b != null) {
            this.b.removeAllUpdateListeners();
            this.b.removeAllListeners();
            this.b.cancel();
        }
        this.f = this.c;
        invalidate();
    }
}
