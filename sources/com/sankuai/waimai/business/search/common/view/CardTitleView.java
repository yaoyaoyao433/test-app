package com.sankuai.waimai.business.search.common.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class CardTitleView extends LinearLayout {
    public static ChangeQuickRedirect a;
    public TextView b;
    public TextView c;
    public TextView d;
    public TextView e;
    public TextView f;

    public CardTitleView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ee0e5a95a4d8d30b5ecc4f18b99a589", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ee0e5a95a4d8d30b5ecc4f18b99a589");
        }
    }

    public CardTitleView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df487ee1db895efb7772f2beb903659a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df487ee1db895efb7772f2beb903659a");
        }
    }

    public CardTitleView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03d5df102632590a5f093895616e0e0f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03d5df102632590a5f093895616e0e0f");
            return;
        }
        setOrientation(0);
        setGravity(16);
        LayoutInflater.from(context).inflate(R.layout.wm_nox_search_cardlist_title, this);
        this.b = (TextView) findViewById(R.id.card_title_sep1);
        this.c = (TextView) findViewById(R.id.card_title_sep2);
        this.d = (TextView) findViewById(R.id.card_title_sep3);
        this.e = (TextView) findViewById(R.id.card_title_quote1);
        this.f = (TextView) findViewById(R.id.card_title_quote2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4eaa954fba4777ed69a24f828f471c3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4eaa954fba4777ed69a24f828f471c3e");
        } else if (getOrientation() != 0) {
            super.onMeasure(i, i2);
        } else {
            Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "18c9f67d1cfddfc96b9361827d44f487", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "18c9f67d1cfddfc96b9361827d44f487");
                return;
            }
            int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
            a(this.b);
            a(this.e);
            a(this.f);
            a(this.d);
            if (this.b.getMeasuredWidth() > size) {
                this.b.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0);
            }
            int measuredWidth = this.b.getMeasuredWidth() + this.e.getMeasuredWidth() + this.f.getMeasuredWidth() + this.d.getMeasuredWidth();
            if (measuredWidth > size) {
                this.d.measure(View.MeasureSpec.makeMeasureSpec(size - this.b.getMeasuredWidth(), 1073741824), 0);
                this.c.measure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), 0);
                this.e.measure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), 0);
                this.f.measure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), 0);
            } else {
                a(this.c);
                if (this.c.getMeasuredWidth() + measuredWidth > size) {
                    this.c.measure(View.MeasureSpec.makeMeasureSpec(size - measuredWidth, 1073741824), 0);
                }
            }
            int max = Math.max(this.b.getMeasuredHeight(), this.c.getMeasuredHeight()) + getPaddingTop() + getPaddingBottom();
            Object[] objArr3 = {Integer.valueOf(max), Integer.MAX_VALUE, Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3debfae4faf0c8f8e2b2d20cd93a220f", RobustBitConfig.DEFAULT_VALUE)) {
                i3 = ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3debfae4faf0c8f8e2b2d20cd93a220f")).intValue();
            } else {
                int mode = View.MeasureSpec.getMode(i2);
                int size2 = View.MeasureSpec.getSize(i2);
                if (mode == Integer.MIN_VALUE) {
                    max = Math.min(Math.min(max, size2), Integer.MAX_VALUE);
                } else if (mode == 0) {
                    max = Math.min(max, Integer.MAX_VALUE);
                } else if (mode == 1073741824) {
                    i3 = size2;
                }
                i3 = max;
            }
            setMeasuredDimension(View.MeasureSpec.getSize(i), i3);
        }
    }

    private void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2a3c22327bd188b0fe70d8417febb48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2a3c22327bd188b0fe70d8417febb48");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(marginLayoutParams.width >= 0 ? View.MeasureSpec.makeMeasureSpec(marginLayoutParams.width, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0), marginLayoutParams.height >= 0 ? View.MeasureSpec.makeMeasureSpec(marginLayoutParams.height, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
    }
}
