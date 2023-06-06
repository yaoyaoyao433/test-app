package android.support.v7.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.support.v4.graphics.drawable.DrawableWrapper;
import android.util.AttributeSet;
import android.widget.ProgressBar;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class i {
    private static final int[] b = {16843067, 16843068};
    Bitmap a;
    private final ProgressBar c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(ProgressBar progressBar) {
        this.c = progressBar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(AttributeSet attributeSet, int i) {
        aw a = aw.a(this.c.getContext(), attributeSet, b, i, 0);
        Drawable b2 = a.b(0);
        if (b2 != null) {
            ProgressBar progressBar = this.c;
            if (b2 instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) b2;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable a2 = a(animationDrawable.getFrame(i2), true);
                    a2.setLevel(10000);
                    animationDrawable2.addFrame(a2, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                b2 = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(b2);
        }
        Drawable b3 = a.b(1);
        if (b3 != null) {
            this.c.setProgressDrawable(a(b3, false));
        }
        a.a.recycle();
    }

    private Drawable a(Drawable drawable, boolean z) {
        if (drawable instanceof DrawableWrapper) {
            DrawableWrapper drawableWrapper = (DrawableWrapper) drawable;
            Drawable wrappedDrawable = drawableWrapper.getWrappedDrawable();
            if (wrappedDrawable != null) {
                drawableWrapper.setWrappedDrawable(a(wrappedDrawable, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = a(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.a == null) {
                this.a = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }
}
