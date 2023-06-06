package com.sankuai.waimai.store.view.standard;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.m;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class FlashImageLabel extends LinearLayout {
    public static ChangeQuickRedirect a;
    private Context b;
    private ImageView c;
    private int d;
    private Drawable e;

    public FlashImageLabel(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af516861bca723ae5d78d7d9cae2792d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af516861bca723ae5d78d7d9cae2792d");
        }
    }

    private FlashImageLabel(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b15a2197fa17f851f9d592731b985eee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b15a2197fa17f851f9d592731b985eee");
        }
    }

    public FlashImageLabel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c7e0fd29f036a6b6346a2c5142ce50e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c7e0fd29f036a6b6346a2c5142ce50e");
            return;
        }
        Object[] objArr2 = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f6ef4eec1d774948420fe9881dab8cf0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f6ef4eec1d774948420fe9881dab8cf0");
            return;
        }
        this.b = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.labelImgSize, R.attr.labelImgRes}, i, 0);
        this.d = obtainStyledAttributes.getInt(0, -1);
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        if (resourceId > 0) {
            try {
                this.e = getResources().getDrawable(resourceId);
            } catch (Exception unused) {
            }
        }
        obtainStyledAttributes.recycle();
        this.c = new ImageView(this.b);
        this.c.setScaleType(ImageView.ScaleType.FIT_XY);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "be5a3f4ae29468568fa7a1b82778fca2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "be5a3f4ae29468568fa7a1b82778fca2");
        } else {
            removeAllViews();
            addView(this.c, new ViewGroup.LayoutParams(-2, a.a(this.b, this.d)));
        }
        setLabelImg(this.e);
    }

    public void setLabelImg(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98e17bf0857761cbf1c94f8948b69b9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98e17bf0857761cbf1c94f8948b69b9d");
        } else if (drawable == null || this.c == null) {
        } else {
            this.c.setImageDrawable(drawable);
        }
    }

    public void setLabelImg(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e3a274bfb94a7670080537aaf0b53f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e3a274bfb94a7670080537aaf0b53f8");
        } else if (TextUtils.isEmpty(str) || this.c == null) {
        } else {
            m.a(str).a(this.c);
        }
    }
}
