package com.meituan.roodesign.widgets.iconfont;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RooIconFont extends AppCompatTextView {
    public static ChangeQuickRedirect a;
    private String b;

    public RooIconFont(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61c797ec5d3b73788fdde1c233ba00c7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61c797ec5d3b73788fdde1c233ba00c7");
        }
    }

    public RooIconFont(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.rooIconFontStyle);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "423883c5a91caabce7ac978ec856c2e7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "423883c5a91caabce7ac978ec856c2e7");
        }
    }

    public RooIconFont(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a97fd12196685632dbcf15f8be4c2c2e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a97fd12196685632dbcf15f8be4c2c2e");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843692}, i, 2131559113);
        this.b = obtainStyledAttributes.getString(0);
        obtainStyledAttributes.recycle();
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fae9e4a0fe5f4d503137a261ff178a1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fae9e4a0fe5f4d503137a261ff178a1a");
            return;
        }
        if (!a.a().b) {
            a.a().a(context.getApplicationContext());
        }
        setTypeface(a.a().a(this.b));
    }

    public void setFontFamily(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bfceb98cf9332988f03fe7e42f40838", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bfceb98cf9332988f03fe7e42f40838");
            return;
        }
        this.b = str;
        setTypeface(a.a().a(str));
    }
}
