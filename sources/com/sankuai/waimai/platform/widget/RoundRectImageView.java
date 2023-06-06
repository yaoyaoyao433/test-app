package com.sankuai.waimai.platform.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class RoundRectImageView extends AppCompatImageView {
    public static ChangeQuickRedirect a;
    public float b;
    public float c;
    public float d;
    public float e;
    private Paint f;
    private Paint g;
    private boolean h;
    private Path i;
    private RectF j;
    private boolean k;
    private String l;

    public void setPicUrl(String str) {
        this.l = str;
    }

    public RoundRectImageView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b7d5993a928b9a718117cd528f36042", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b7d5993a928b9a718117cd528f36042");
        }
    }

    public RoundRectImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37b3c5f72bc6237541dc655d39a07266", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37b3c5f72bc6237541dc655d39a07266");
        }
    }

    public RoundRectImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eed06f7594d5c9c0aa434b6db6e23725", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eed06f7594d5c9c0aa434b6db6e23725");
            return;
        }
        this.k = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.cornerRadius, R.attr.topLeftCornerRadius, R.attr.topRightCornerRadius, R.attr.bottomLeftCornerRadius, R.attr.bottomRightCornerRadius, R.attr.cropBackground});
            float dimension = obtainStyledAttributes.getDimension(0, 0.0f);
            this.b = obtainStyledAttributes.getDimension(1, dimension);
            this.c = obtainStyledAttributes.getDimension(2, dimension);
            this.d = obtainStyledAttributes.getDimension(3, dimension);
            this.e = obtainStyledAttributes.getDimension(4, dimension);
            this.h = obtainStyledAttributes.getBoolean(5, false);
            obtainStyledAttributes.recycle();
        }
        this.f = new Paint();
        this.f.setColor(-1);
        this.f.setAntiAlias(true);
        this.f.setStyle(Paint.Style.FILL);
        this.f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.g = new Paint();
        this.g.setXfermode(null);
        this.i = new Path();
        this.j = new RectF();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        boolean z = false;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13b706eed0c1e83834e2ed30d6c765e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13b706eed0c1e83834e2ed30d6c765e6");
            return;
        }
        if (!this.h || getBackground() == null) {
            canvas.saveLayer(new RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight()), this.g, 31);
            z = true;
        }
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            String message = e.getMessage();
            if (!this.k && message != null && message.contains("trying to draw too large")) {
                String str = "";
                int id = getId();
                try {
                    str = getResources().getResourceName(id);
                } catch (Resources.NotFoundException unused) {
                }
                com.sankuai.waimai.foundation.utils.log.a.b(new RuntimeException("crash view id: " + id + " resName: " + str + " pic_url: " + this.l, e));
                this.k = true;
            } else {
                throw e;
            }
        }
        int width = getWidth();
        int height = getHeight();
        if (this.b > 0.0f) {
            this.i.moveTo(0.0f, this.b);
            this.i.lineTo(0.0f, 0.0f);
            this.i.lineTo(this.b, 0.0f);
            this.j.set(0.0f, 0.0f, this.b * 2.0f, this.b * 2.0f);
            this.i.arcTo(this.j, -90.0f, -90.0f);
            this.i.close();
            canvas.drawPath(this.i, this.f);
        }
        if (this.c > 0.0f) {
            float f = width;
            this.i.moveTo(f - this.c, 0.0f);
            this.i.lineTo(f, 0.0f);
            this.i.lineTo(f, this.c);
            this.j.set(f - (this.c * 2.0f), 0.0f, f, this.c * 2.0f);
            this.i.arcTo(this.j, 0.0f, -90.0f);
            this.i.close();
            canvas.drawPath(this.i, this.f);
        }
        if (this.d > 0.0f) {
            float f2 = height;
            this.i.moveTo(0.0f, f2 - this.d);
            this.i.lineTo(0.0f, f2);
            this.i.lineTo(this.d, f2);
            this.j.set(0.0f, f2 - (this.d * 2.0f), this.d * 2.0f, f2);
            this.i.arcTo(this.j, 90.0f, 90.0f);
            this.i.close();
            canvas.drawPath(this.i, this.f);
        }
        if (this.e > 0.0f) {
            float f3 = width;
            float f4 = height;
            this.i.moveTo(f3 - this.e, f4);
            this.i.lineTo(f3, f4);
            this.i.lineTo(f3, f4 - this.e);
            this.j.set(f3 - (this.e * 2.0f), f4 - (this.e * 2.0f), f3, f4);
            this.i.arcTo(this.j, 0.0f, 90.0f);
            this.i.close();
            canvas.drawPath(this.i, this.f);
        }
        if (z) {
            canvas.restore();
        }
    }
}
