package com.sankuai.waimai.ugc.creator.widgets.round;

import android.content.Context;
import android.graphics.Canvas;
import android.support.v7.widget.AppCompatImageView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class RoundCornerImageView extends AppCompatImageView {
    public static ChangeQuickRedirect a;
    private final a b;

    public RoundCornerImageView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5723a64d81f3aa94ce7fc6b551050c39", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5723a64d81f3aa94ce7fc6b551050c39");
            return;
        }
        this.b = new a(this);
        Object[] objArr2 = {context, null};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "55985741f68cd48218e3ffcea612c515", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "55985741f68cd48218e3ffcea612c515");
        } else {
            this.b.a(context, null);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9259f849e60458bc27d4e26a1d401756", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9259f849e60458bc27d4e26a1d401756");
        } else if (this.b.d > 0.0f) {
            setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
            int measuredWidth = getMeasuredWidth();
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (measuredWidth / this.b.d), 1073741824));
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb0859df59eb51ea310ab7cf5719bd54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb0859df59eb51ea310ab7cf5719bd54");
            return;
        }
        super.draw(canvas);
        this.b.a(canvas);
    }

    public void setBorderWidth(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59a91a581ec72888e39a1374ee3aa2ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59a91a581ec72888e39a1374ee3aa2ff");
        } else {
            this.b.a(i);
        }
    }

    public void setBorderColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5852f3b968bfe8354915d9dab53673e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5852f3b968bfe8354915d9dab53673e");
        } else {
            this.b.b(i);
        }
    }

    public void setCornerRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09180cca0a843abff4394c1c272c702c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09180cca0a843abff4394c1c272c702c");
        } else {
            this.b.a(f);
        }
    }

    public void setRatio(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "059ca5ecb157a9906964548fc7a350a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "059ca5ecb157a9906964548fc7a350a7");
            return;
        }
        a aVar = this.b;
        Object[] objArr2 = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "9e63e24fb4ef80008d0a00c9c1650702", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "9e63e24fb4ef80008d0a00c9c1650702");
            return;
        }
        aVar.d = f;
        aVar.b.invalidateOutline();
        aVar.b.invalidate();
    }
}
