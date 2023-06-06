package com.sankuai.waimai.irmo.render.bean.anim.draw;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.render.bean.anim.draw.bean.HaloData;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class HaloDrawUpdateCommand implements DrawUpdateCommand<HaloData> {
    public static String TAG = new String("HaloDrawUpdateCommand");
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean changed;
    private final Paint paint;
    private final Path path;

    public HaloDrawUpdateCommand() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e72f2f01ccc1340b808c655de21e7a54", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e72f2f01ccc1340b808c655de21e7a54");
            return;
        }
        this.paint = new Paint();
        this.path = new Path();
    }

    @Override // com.sankuai.waimai.irmo.render.bean.anim.draw.DrawUpdateCommand
    public void update(HaloData haloData) {
        Object[] objArr = {haloData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c97d4b2d899bedc899d07077edc0055", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c97d4b2d899bedc899d07077edc0055");
        } else if (haloData == null || haloData.rect == null || haloData.radius < 0.0f) {
        } else {
            this.paint.reset();
            this.paint.setAntiAlias(true);
            if (haloData.radius > 0.0f) {
                this.paint.setColor(haloData.color);
                this.paint.setMaskFilter(new BlurMaskFilter(haloData.radius, BlurMaskFilter.Blur.NORMAL));
            } else {
                this.paint.setColor(0);
            }
            if (haloData.corner == null || haloData.corner.length < 8) {
                haloData.corner = nilCorner;
            }
            this.path.reset();
            this.path.addRoundRect(haloData.rect, haloData.corner, Path.Direction.CW);
            this.changed = true;
        }
    }

    @Override // com.sankuai.waimai.mach.widget.decorations.c
    public void draw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91328871509b4922c4813fb98de872f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91328871509b4922c4813fb98de872f0");
        } else if (this.changed) {
            canvas.drawPath(this.path, this.paint);
            this.changed = false;
        }
    }
}
