package com.sankuai.waimai.irmo.render.bean.anim.draw;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.render.bean.anim.draw.bean.BorderData;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class BorderDrawUpdateCommand implements DrawUpdateCommand<BorderData> {
    public static String TAG = new String("BorderDrawUpdateCommand");
    public static ChangeQuickRedirect changeQuickRedirect;
    private final RectF borderRect;
    public boolean changed;
    private final Paint paint;
    private final Path path;

    public BorderDrawUpdateCommand() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9738748005b269ae58621d7ef73d63ce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9738748005b269ae58621d7ef73d63ce");
            return;
        }
        this.path = new Path();
        this.paint = new Paint();
        this.borderRect = new RectF();
    }

    @Override // com.sankuai.waimai.irmo.render.bean.anim.draw.DrawUpdateCommand
    public void update(BorderData borderData) {
        Object[] objArr = {borderData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1012bdfedbf4681400342d1f661930f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1012bdfedbf4681400342d1f661930f");
        } else if (borderData == null || borderData.rect == null) {
        } else {
            if (borderData.corner == null || borderData.corner.length < 8) {
                borderData.corner = nilCorner;
            }
            float f = borderData.width * 0.5f;
            this.path.reset();
            this.borderRect.left = borderData.rect.left + f;
            this.borderRect.top = borderData.rect.top + f;
            this.borderRect.right = borderData.rect.right - f;
            this.borderRect.bottom = borderData.rect.bottom - f;
            this.path.addRoundRect(this.borderRect, borderData.corner, Path.Direction.CW);
            this.paint.reset();
            this.paint.setStyle(Paint.Style.STROKE);
            this.paint.setAntiAlias(true);
            this.paint.setColor(borderData.color);
            this.paint.setStrokeWidth(borderData.width);
            this.changed = true;
        }
    }

    @Override // com.sankuai.waimai.mach.widget.decorations.c
    public void draw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4bc9ebacf38fe194df4ad2ba23822a86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4bc9ebacf38fe194df4ad2ba23822a86");
        } else if (this.changed) {
            canvas.drawPath(this.path, this.paint);
            this.changed = false;
        }
    }
}
