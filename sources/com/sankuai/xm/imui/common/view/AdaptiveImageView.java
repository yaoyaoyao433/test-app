package com.sankuai.xm.imui.common.view;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.annotation.DrawableRes;
import android.support.constraint.R;
import android.support.v4.internal.view.SupportMenu;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.n;
import com.sankuai.xm.imui.common.util.h;
import com.sankuai.xm.imui.common.util.l;
import com.sankuai.xm.integration.imageloader.ImageScaleType;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class AdaptiveImageView extends RelativeLayout {
    public static ChangeQuickRedirect a;
    public boolean b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private Uri j;
    private View k;
    private View l;
    private ImageView m;

    public AdaptiveImageView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fcfd6efa2f788621e08d2a26ba910d5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fcfd6efa2f788621e08d2a26ba910d5");
        }
    }

    public AdaptiveImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4aae9d6b3a26289c644935fc2bf5d1fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4aae9d6b3a26289c644935fc2bf5d1fb");
        }
    }

    public AdaptiveImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fc99d2c568894a031b32d3a6e934987", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fc99d2c568894a031b32d3a6e934987");
            return;
        }
        this.b = true;
        this.h = -1;
        this.i = -1;
        inflate(context, R.layout.xm_sdk_view_adaptive_image, this);
        this.k = findViewById(R.id.xm_sdk_chat_img_view);
        this.l = findViewById(R.id.xm_sdk_chat_gif_view);
        this.m = (ImageView) findViewById(R.id.xm_sdk_image_status);
        a(context, attributeSet);
    }

    public final AdaptiveImageView a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a407b0bda5c4e3544644272c7636763", 6917529027641081856L)) {
            return (AdaptiveImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a407b0bda5c4e3544644272c7636763");
        }
        if (this.f > 0 && (i > this.f || i == -1)) {
            i = this.f;
        }
        if (this.g > 0 && (i2 > this.g || i2 == -1)) {
            i2 = this.g;
        }
        this.d = i;
        this.e = i2;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            if (i > 0) {
                layoutParams.width = i;
            }
            if (i2 > 0) {
                layoutParams.height = i2;
            }
        }
        return this;
    }

    public final AdaptiveImageView a(@DrawableRes int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b1d932f2795acfcb7d7a74a6f27ddd0", 6917529027641081856L)) {
            return (AdaptiveImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b1d932f2795acfcb7d7a74a6f27ddd0");
        }
        a(this.d, this.e);
        if (i2 > 0) {
            this.m.getLayoutParams().width = i2;
        }
        if (i3 > 0) {
            this.m.getLayoutParams().height = i3;
        }
        Drawable b = android.support.v7.content.res.b.b(getContext(), i);
        if (b instanceof Animatable) {
            ((Animatable) b).start();
        }
        this.m.setImageDrawable(b);
        this.m.setVisibility(0);
        l.a(8, this.k, this.l);
        return this;
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a678de1b2b26930e8129f4f0ab22ecf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a678de1b2b26930e8129f4f0ab22ecf");
            return;
        }
        Drawable drawable = this.m.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        this.m.setVisibility(8);
    }

    public void setImageResource(@DrawableRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c5b64877b1167be5d7529d5e112b161", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c5b64877b1167be5d7529d5e112b161");
        } else if (i == -1 || i == 0) {
        } else {
            a(com.sankuai.xm.integration.imageloader.utils.a.a(getContext(), i), Boolean.valueOf(n.i(h.a(getContext(), i))));
        }
    }

    public void setPlaceHolderRes(@DrawableRes int i) {
        this.h = i;
    }

    public void setErrorRes(@DrawableRes int i) {
        this.i = i;
    }

    public void setImageResource(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "761f4cafe71c7755ca0b2f555fcdd44f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "761f4cafe71c7755ca0b2f555fcdd44f");
        } else {
            a(uri, (Boolean) null);
        }
    }

    public final void a(Uri uri, Boolean bool) {
        Object[] objArr = {uri, bool};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "854b1d126d49d0f11227f75d7ce91d19", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "854b1d126d49d0f11227f75d7ce91d19");
            return;
        }
        this.j = uri;
        if (bool == null) {
            bool = Boolean.valueOf(n.a(uri));
        }
        a();
        if (bool.booleanValue()) {
            this.k.setVisibility(8);
            this.l.setVisibility(0);
            com.sankuai.xm.integration.imageloader.b.a(uri).b(this.h).c(this.i).a(this.d, this.e).a(this.c).a().a(this.b).a(SupportMenu.USER_MASK).a(this.l);
            return;
        }
        this.l.setVisibility(8);
        this.k.setVisibility(0);
        com.sankuai.xm.integration.imageloader.b.a(uri).b(this.h).c(this.i).a(this.d, this.e).a(this.c).a(this.k);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a3effe752d5c5407b2e3f643c4fda2b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a3effe752d5c5407b2e3f643c4fda2b");
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        if (size > this.f) {
            size = this.f;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, View.MeasureSpec.getMode(i));
        int size2 = View.MeasureSpec.getSize(i2);
        if (size2 > this.g) {
            size2 = this.g;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(size2, View.MeasureSpec.getMode(i2)));
    }

    private void a(Context context, AttributeSet attributeSet) {
        int i = 2;
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86a8d3aab6bccad8aaba72279da7bdc0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86a8d3aab6bccad8aaba72279da7bdc0");
        } else if (attributeSet != null && attributeSet.getAttributeCount() > 0) {
            RelativeLayout.LayoutParams generateLayoutParams = generateLayoutParams(attributeSet);
            this.d = ((ViewGroup.LayoutParams) generateLayoutParams).width;
            this.e = ((ViewGroup.LayoutParams) generateLayoutParams).height;
            ImageView imageView = new ImageView(context, attributeSet);
            this.f = imageView.getMaxWidth();
            this.g = imageView.getMaxHeight();
            ImageView.ScaleType scaleType = imageView.getScaleType();
            Object[] objArr2 = {scaleType, 0};
            ChangeQuickRedirect changeQuickRedirect2 = ImageScaleType.a;
            if (!PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "04c97c3be4d9a56eec49d0dfc119954a", 6917529027641081856L)) {
                switch (ImageScaleType.AnonymousClass1.a[scaleType.ordinal()]) {
                    case 1:
                        break;
                    case 2:
                        i = 1;
                        break;
                    case 3:
                    default:
                        i = 0;
                        break;
                }
            } else {
                i = ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "04c97c3be4d9a56eec49d0dfc119954a")).intValue();
            }
            this.c = i;
            int i2 = 0;
            for (int i3 = 0; i3 < attributeSet.getAttributeCount(); i3++) {
                if (attributeSet.getAttributeNameResource(i3) == 16843033) {
                    i2 = attributeSet.getAttributeResourceValue(16843033, 0);
                }
            }
            setImageResource(i2);
        }
    }
}
