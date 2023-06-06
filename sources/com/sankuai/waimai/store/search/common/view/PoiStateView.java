package com.sankuai.waimai.store.search.common.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PoiStateView extends FrameLayout {
    public static ChangeQuickRedirect a;
    private int b;
    private TextView c;
    private TextView d;
    private Context e;

    public PoiStateView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb5c3cf503001791a4f394a7a894711c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb5c3cf503001791a4f394a7a894711c");
            return;
        }
        this.e = context;
        a();
    }

    public PoiStateView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8523de7cc42176bed90feae38784a04", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8523de7cc42176bed90feae38784a04");
            return;
        }
        this.e = context;
        a();
    }

    public PoiStateView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b5d1dfaeb963823c84d12276fba9710", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b5d1dfaeb963823c84d12276fba9710");
            return;
        }
        this.e = context;
        a();
    }

    public PoiStateView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "beac8702bd2ce44aa6eb6dfc26e5e8d2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "beac8702bd2ce44aa6eb6dfc26e5e8d2");
            return;
        }
        this.e = context;
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3587a48b71b88af452a7bb0a8d37a22d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3587a48b71b88af452a7bb0a8d37a22d");
            return;
        }
        this.b = g.a(this.e, 4.0f);
        LayoutInflater.from(this.e).inflate(R.layout.wm_sc_nox_search_common_layout_poi_state_view, this);
        this.c = (TextView) findViewById(R.id.txt_state);
        this.d = (TextView) findViewById(R.id.txt_state_desc);
    }

    public final void a(@NonNull String str, @Nullable String str2, @ColorInt int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a95c402349a4771717defee12be7200", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a95c402349a4771717defee12be7200");
        } else {
            a(str, str2, i, -1);
        }
    }

    public final void a(@NonNull String str, @Nullable String str2, @ColorInt int i, @ColorInt int i2) {
        int i3 = 0;
        Object[] objArr = {str, str2, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "970c8baf3a755c0b625d20a2c88f0aca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "970c8baf3a755c0b625d20a2c88f0aca");
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            this.d.setVisibility(8);
            i3 = this.b;
        } else {
            this.d.setVisibility(0);
            this.d.setText(str2);
            this.d.setTextColor(i);
            this.d.setBackground(a(g.a(this.e, 0.5f), i, -1, 0.0f, this.b, this.b, 0.0f));
        }
        this.c.setText(str);
        this.c.setTextColor(i2);
        float f = i3;
        this.c.setBackground(a(g.a(this.e, 0.5f), i, i, this.b, f, f, this.b));
    }

    private GradientDrawable a(int i, @ColorInt int i2, @ColorInt int i3, float f, float f2, float f3, float f4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf7dafce6e119d1c680b43834e16d02e", RobustBitConfig.DEFAULT_VALUE)) {
            return (GradientDrawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf7dafce6e119d1c680b43834e16d02e");
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        if (i > 0 && i2 != 0) {
            gradientDrawable.setStroke(i, i2);
        }
        gradientDrawable.setColor(i3);
        gradientDrawable.setCornerRadii(new float[]{f, f, f2, f2, f3, f3, f4, f4});
        return gradientDrawable;
    }
}
