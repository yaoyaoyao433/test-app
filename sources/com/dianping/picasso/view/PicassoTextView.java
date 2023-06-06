package com.dianping.picasso.view;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import com.dianping.picasso.PicassoCanvasClipper;
import com.dianping.richtext.BaseRichTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PicassoTextView extends BaseRichTextView implements PicassoCanvasClipper.Clippable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private PicassoCanvasClipper clipper;

    public PicassoTextView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a66d78aa5b45a78dc557dcd8decec94c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a66d78aa5b45a78dc557dcd8decec94c");
        }
    }

    public PicassoTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34c50b94bbbdac60899637ba2ac364e4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34c50b94bbbdac60899637ba2ac364e4");
            return;
        }
        setIncludeFontPadding(false);
        if (Build.VERSION.SDK_INT >= 28) {
            setFallbackLineSpacing(false);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf755d58a9a6180822dd0644df51c146", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf755d58a9a6180822dd0644df51c146");
        } else if (this.clipper != null) {
            canvas.save();
            super.onDraw(canvas);
            this.clipper.clip(canvas, this);
            canvas.restore();
            this.clipper.drawShadow(canvas, this);
        } else {
            super.onDraw(canvas);
        }
    }

    @Override // com.dianping.picasso.PicassoCanvasClipper.Clippable
    @NonNull
    public PicassoCanvasClipper getClipper() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e31fb834c6f1f0b6c16e873494ed7f1", RobustBitConfig.DEFAULT_VALUE)) {
            return (PicassoCanvasClipper) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e31fb834c6f1f0b6c16e873494ed7f1");
        }
        if (this.clipper == null) {
            this.clipper = new PicassoCanvasClipper();
        }
        return this.clipper;
    }
}
