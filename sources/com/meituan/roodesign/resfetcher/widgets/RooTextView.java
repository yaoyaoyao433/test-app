package com.meituan.roodesign.resfetcher.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.resfetcher.runtime.b;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RooTextView extends AppCompatTextView {
    public static ChangeQuickRedirect a;
    private int b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private final String i;
    private final int j;
    private final int k;

    public RooTextView(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04de2384f887beb9fb3b9af21c17dd99", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04de2384f887beb9fb3b9af21c17dd99");
        }
    }

    public RooTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0057d68b3d2ed0fb10e53475c861c28", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0057d68b3d2ed0fb10e53475c861c28");
        }
    }

    public RooTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dd20b7d108f935c9352fe85e4886ace", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dd20b7d108f935c9352fe85e4886ace");
            return;
        }
        this.b = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842996, 16842997, R.attr.backgroundName, R.attr.project, R.attr.picDrawableLeft, R.attr.picDrawableTop, R.attr.picDrawableRight, R.attr.picDrawableBottom});
        this.h = obtainStyledAttributes.getString(2);
        this.i = obtainStyledAttributes.getString(3);
        this.j = obtainStyledAttributes.getLayoutDimension(0, -2);
        this.k = obtainStyledAttributes.getLayoutDimension(1, -2);
        this.c = obtainStyledAttributes.getString(4);
        this.d = obtainStyledAttributes.getString(5);
        this.e = obtainStyledAttributes.getString(6);
        this.f = obtainStyledAttributes.getString(7);
        obtainStyledAttributes.recycle();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9ec23c68ee970d10180e5ede338968ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9ec23c68ee970d10180e5ede338968ca");
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
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDrawable(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4208cb52e5069b225bfbaeaf3df6859", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4208cb52e5069b225bfbaeaf3df6859");
        } else if (drawable == null) {
        } else {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            switch (this.b) {
                case 0:
                    setCompoundDrawables(drawable, null, null, null);
                    return;
                case 1:
                    setCompoundDrawables(null, drawable, null, null);
                    return;
                case 2:
                    setCompoundDrawables(null, null, drawable, null);
                    return;
                case 3:
                    setCompoundDrawables(null, null, null, drawable);
                    return;
                default:
                    return;
            }
        }
    }

    public void setBackgroundByResName(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dd74642194af666b1025c3e3c1e47f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dd74642194af666b1025c3e3c1e47f9");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.h = str;
            a();
        }
    }

    public void setLeftDrawableKey(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f950cd08da77cf40a7dfa78030832741", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f950cd08da77cf40a7dfa78030832741");
            return;
        }
        this.c = str;
        this.b = 0;
        this.g = this.c;
        a();
    }

    public void setTopDrawableKey(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e591d67a065295945f94c56f965076fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e591d67a065295945f94c56f965076fe");
            return;
        }
        this.d = str;
        this.b = 1;
        this.g = this.d;
        a();
    }

    public void setRightDrawableKey(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6fc20c2fb4cd9e2ac9908ea846ec6a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6fc20c2fb4cd9e2ac9908ea846ec6a4");
            return;
        }
        this.e = str;
        this.b = 2;
        this.g = this.e;
        a();
    }

    public void setBottomDrawableKey(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3793360888ae814640f1e05d26dbfa83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3793360888ae814640f1e05d26dbfa83");
            return;
        }
        this.f = str;
        this.b = 3;
        this.g = this.f;
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1918f9f2d81cf50f90ba13f5a887112e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1918f9f2d81cf50f90ba13f5a887112e");
            return;
        }
        if (!TextUtils.isEmpty(this.h)) {
            a.a(this, this.i, this.h);
        }
        if (TextUtils.isEmpty(this.g)) {
            return;
        }
        a.a(this, this.i, this.g, new b() { // from class: com.meituan.roodesign.resfetcher.widgets.RooTextView.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.roodesign.resfetcher.runtime.b
            public final void a(Drawable drawable, boolean z) {
                Object[] objArr2 = {drawable, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0115b2b6ba910712181aaaa08616529f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0115b2b6ba910712181aaaa08616529f");
                } else {
                    RooTextView.this.setDrawable(drawable);
                }
            }
        });
    }
}
