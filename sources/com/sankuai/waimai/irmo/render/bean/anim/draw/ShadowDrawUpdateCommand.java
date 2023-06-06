package com.sankuai.waimai.irmo.render.bean.anim.draw;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.render.bean.anim.draw.bean.ShadowData;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ShadowDrawUpdateCommand implements DrawUpdateCommand<ShadowData> {
    public static String TAG = new String("HaloDrawUpdateCommand");
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean changed;
    private final Paint paint;
    private final Path path;

    public ShadowDrawUpdateCommand() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc16992e10297140a5bf6c70e3b55846", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc16992e10297140a5bf6c70e3b55846");
            return;
        }
        this.path = new Path();
        this.paint = new Paint();
    }

    @Override // com.sankuai.waimai.irmo.render.bean.anim.draw.DrawUpdateCommand
    public void update(ShadowData shadowData) {
        Object[] objArr = {shadowData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1fce5109194e1912c03aaeb3c7a0378", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1fce5109194e1912c03aaeb3c7a0378");
        } else if (shadowData == null || shadowData.rect == null) {
        } else {
            this.paint.reset();
            this.paint.setAntiAlias(true);
            this.paint.setColor(shadowData.color);
            this.paint.setShadowLayer(3.0f, shadowData.hOffset, shadowData.vOffset, shadowData.color);
            if (shadowData.corner == null || shadowData.corner.length < 8) {
                shadowData.corner = nilCorner;
            }
            this.path.reset();
            this.path.addRoundRect(shadowData.rect, shadowData.corner, Path.Direction.CW);
            this.changed = true;
        }
    }

    @Override // com.sankuai.waimai.mach.widget.decorations.c
    public void draw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6dc051070f1b7b3cc644f147dc2d2fa8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6dc051070f1b7b3cc644f147dc2d2fa8");
        } else if (this.changed) {
            canvas.drawPath(this.path, this.paint);
            this.changed = false;
        }
    }
}
