package com.meituan.roodesign.resfetcher.widgets;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.widget.AppCompatImageView;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.resfetcher.runtime.e;
import com.meituan.roodesign.widgets.iconfont.c;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RooImageView extends AppCompatImageView {
    public static ChangeQuickRedirect a;
    private TypedArray b;
    private String c;

    public RooImageView(Context context) throws Exception {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a5c0a9ab6bec2f2ed0033a044f3f848", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a5c0a9ab6bec2f2ed0033a044f3f848");
        }
    }

    public RooImageView(Context context, @Nullable AttributeSet attributeSet) throws Exception {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d78b60e65db88f079e52e3d0be5d047c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d78b60e65db88f079e52e3d0be5d047c");
        }
    }

    public RooImageView(Context context, @Nullable AttributeSet attributeSet, int i) throws Exception {
        super(context, attributeSet, i);
        Object[] objArr;
        ChangeQuickRedirect changeQuickRedirect;
        Typeface typeface;
        Object[] objArr2 = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aa05d4f6a198c7070563d14ad541b453", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aa05d4f6a198c7070563d14ad541b453");
            return;
        }
        this.b = context.obtainStyledAttributes(attributeSet, new int[]{16842901, 16842904, 16842996, 16842997, 16843087, 16843692, R.attr.backgroundName, R.attr.project, R.attr.srcName}, i, 0);
        String string = this.b.getString(6);
        String string2 = this.b.getString(8);
        this.c = this.b.getString(7);
        String string3 = this.b.getString(4);
        this.b.getLayoutDimension(2, -2);
        this.b.getLayoutDimension(3, -2);
        float dimension = this.b.getDimension(0, PatchProxy.isSupport(new Object[]{context, Float.valueOf(32.0f)}, this, a, false, "41f47dee6b0495f216280a25c45e9049", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41f47dee6b0495f216280a25c45e9049")).intValue() : (int) ((context.getResources().getDisplayMetrics().density * 32.0f) + 0.5f));
        int color = this.b.getColor(1, 0);
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                typeface = this.b.getFont(5);
            } else {
                typeface = ResourcesCompat.getFont(context, this.b.getResourceId(5, 0));
            }
        } catch (Resources.NotFoundException | UnsupportedOperationException e) {
            e.printStackTrace();
            typeface = null;
        }
        this.b.recycle();
        if (!TextUtils.isEmpty(string3)) {
            if (typeface != null) {
                c.a aVar = new c.a(context);
                aVar.g = color;
                aVar.c = string3;
                aVar.d = typeface;
                aVar.e = (int) dimension;
                setImageDrawable(aVar.a());
                return;
            }
            return;
        }
        if (!TextUtils.isEmpty(string2)) {
            String str = this.c;
            Object[] objArr3 = {this, str, string2};
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "d72605d616be6bc57889b8e3c404ab7a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "d72605d616be6bc57889b8e3c404ab7a");
            } else if (!a.b(this, str, string2)) {
                if (!isInEditMode()) {
                    if (!TextUtils.isEmpty(string2)) {
                        com.meituan.roodesign.resfetcher.runtime.c.a(this, string2, 0, 0);
                    }
                } else if (!TextUtils.isEmpty(string2)) {
                    e.a(this, str, string2);
                }
            }
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        a.a(this, this.c, string);
    }

    public void setImageResourceByResName(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87a45f6252a8de5ec74f6e5af4fb44e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87a45f6252a8de5ec74f6e5af4fb44e2");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            com.meituan.roodesign.resfetcher.runtime.c.a(this, str);
        }
    }

    public void setBackgroundByResName(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0484d78d21e0ae928c49217bbfc0b106", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0484d78d21e0ae928c49217bbfc0b106");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            a.a(this, this.c, str);
        }
    }
}
