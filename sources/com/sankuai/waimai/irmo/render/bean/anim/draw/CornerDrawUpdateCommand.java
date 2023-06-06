package com.sankuai.waimai.irmo.render.bean.anim.draw;

import android.graphics.Canvas;
import android.graphics.Path;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.render.bean.anim.draw.bean.CornerData;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class CornerDrawUpdateCommand implements DrawUpdateCommand<CornerData> {
    public static String TAG = new String("CornerDrawUpdateCommand");
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean changed;
    private final Path path;

    public CornerDrawUpdateCommand() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a9d0bf4f06ec87979cdaa74bee3bb22", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a9d0bf4f06ec87979cdaa74bee3bb22");
        } else {
            this.path = new Path();
        }
    }

    @Override // com.sankuai.waimai.irmo.render.bean.anim.draw.DrawUpdateCommand
    public void update(CornerData cornerData) {
        Object[] objArr = {cornerData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b698f327c7cb971c30ddcd2be447138", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b698f327c7cb971c30ddcd2be447138");
        } else if (cornerData == null || cornerData.rect == null) {
        } else {
            if (cornerData.corner == null || cornerData.corner.length < 8) {
                cornerData.corner = nilCorner;
            }
            this.path.reset();
            this.path.addRoundRect(cornerData.rect, cornerData.corner, Path.Direction.CW);
            this.changed = true;
        }
    }

    @Override // com.sankuai.waimai.mach.widget.decorations.c
    public void draw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "980496f51eb488dd5b2b83d827593ba2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "980496f51eb488dd5b2b83d827593ba2");
        } else if (this.changed) {
            canvas.clipPath(this.path);
            this.changed = false;
        }
    }
}
