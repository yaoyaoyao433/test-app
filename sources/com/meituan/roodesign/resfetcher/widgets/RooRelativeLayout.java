package com.meituan.roodesign.resfetcher.widgets;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RooRelativeLayout extends RelativeLayout {
    public static ChangeQuickRedirect a;
    private String b;

    public RooRelativeLayout(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "715d16c5e875be69ff8f8dc8985928e2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "715d16c5e875be69ff8f8dc8985928e2");
        }
    }

    public RooRelativeLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "495bee9b3f9fb904467b17705300ee09", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "495bee9b3f9fb904467b17705300ee09");
        }
    }

    public RooRelativeLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "248150a2c7e127b403ed34ba04bf74b4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "248150a2c7e127b403ed34ba04bf74b4");
        }
    }

    @TargetApi(21)
    public RooRelativeLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85a57475466fa189d87c1e8a8eb2b9e9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85a57475466fa189d87c1e8a8eb2b9e9");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842996, 16842997, R.attr.backgroundName, R.attr.project});
        String string = obtainStyledAttributes.getString(2);
        this.b = obtainStyledAttributes.getString(3);
        obtainStyledAttributes.getLayoutDimension(2, -2);
        obtainStyledAttributes.getLayoutDimension(3, -2);
        obtainStyledAttributes.recycle();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        a.a(this, this.b, string);
    }

    public void setBackgroundByResName(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "480dcda6672e10bf99340f63e1a09d84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "480dcda6672e10bf99340f63e1a09d84");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            a.a(this, this.b, str);
        }
    }
}
