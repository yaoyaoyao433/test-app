package com.meituan.roodesign.widgets.iconfont;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.iconfont.c;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RooIconFontTextView extends AppCompatTextView {
    public static ChangeQuickRedirect a;
    private int b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private int h;
    private int i;

    public RooIconFontTextView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b871cd493b261358aea1770a9f2065d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b871cd493b261358aea1770a9f2065d");
        }
    }

    public RooIconFontTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb93456607f3728191f67704791658c1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb93456607f3728191f67704791658c1");
        }
    }

    public RooIconFontTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b5e4521239db919f038609953e7ee4d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b5e4521239db919f038609953e7ee4d");
            return;
        }
        this.b = 0;
        Object[] objArr2 = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4427df36f3db97660c4cddf19d0b2022", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4427df36f3db97660c4cddf19d0b2022");
        } else {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.iconDrawableLeft, R.attr.iconDrawableTop, R.attr.iconDrawableRight, R.attr.iconDrawableBottom, R.attr.iconDrawableColor, R.attr.iconDpSize});
            this.c = obtainStyledAttributes.getString(0);
            this.d = obtainStyledAttributes.getString(1);
            this.e = obtainStyledAttributes.getString(2);
            this.f = obtainStyledAttributes.getString(3);
            this.h = obtainStyledAttributes.getInt(4, 0);
            this.i = (int) obtainStyledAttributes.getDimension(5, 0.0f);
            obtainStyledAttributes.recycle();
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1010fae7f169e6eb2731647c1f8713d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1010fae7f169e6eb2731647c1f8713d6");
        } else if (this.c != null) {
            this.b = 0;
            this.g = this.c;
        } else if (this.d != null) {
            this.b = 1;
            this.g = this.d;
        } else if (this.e != null) {
            this.b = 2;
            this.g = this.e;
        } else if (this.f != null) {
            this.b = 3;
            this.g = this.f;
        }
        b();
    }

    private void setDrawable(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "659bf20d5288ccb9907fbbf46f1d3f13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "659bf20d5288ccb9907fbbf46f1d3f13");
        } else if (cVar == null) {
        } else {
            cVar.setBounds(0, 0, cVar.getMinimumWidth(), cVar.getMinimumHeight());
            switch (this.b) {
                case 0:
                    setCompoundDrawables(cVar, null, null, null);
                    return;
                case 1:
                    setCompoundDrawables(null, cVar, null, null);
                    return;
                case 2:
                    setCompoundDrawables(null, null, cVar, null);
                    return;
                case 3:
                    setCompoundDrawables(null, null, null, cVar);
                    return;
                default:
                    return;
            }
        }
    }

    private c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af40289312c3e591bbba304113a1a5b0", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af40289312c3e591bbba304113a1a5b0");
        }
        if (TextUtils.isEmpty(this.g)) {
            return null;
        }
        c.a aVar = new c.a(getContext());
        aVar.c = this.g;
        aVar.g = this.h;
        aVar.e = this.i;
        return aVar.a();
    }

    public void setLeftFontKey(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94643974d62a3dea87fe7cb5444cc069", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94643974d62a3dea87fe7cb5444cc069");
            return;
        }
        this.c = str;
        this.b = 0;
        this.g = this.c;
        b();
    }

    public void setTopFontKey(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0362b75c4c97c41f7e8afaccf3ef2281", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0362b75c4c97c41f7e8afaccf3ef2281");
            return;
        }
        this.d = str;
        this.b = 1;
        this.g = this.d;
        b();
    }

    public void setRightFontKey(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e2b29b22f059f60a1740860f2d8421e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e2b29b22f059f60a1740860f2d8421e");
            return;
        }
        this.e = str;
        this.b = 2;
        this.g = this.e;
        b();
    }

    public void setBottomFontKey(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef49853665df7a4983bee0043353a5a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef49853665df7a4983bee0043353a5a9");
            return;
        }
        this.f = str;
        this.b = 3;
        this.g = this.f;
        b();
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d039f9a121a77b8aa3cb13382270f02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d039f9a121a77b8aa3cb13382270f02");
        } else {
            setDrawable(a());
        }
    }
}
