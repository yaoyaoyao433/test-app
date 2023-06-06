package com.sankuai.waimai.store.search.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SortFilterTextView extends LinearLayout {
    public static ChangeQuickRedirect a;
    public boolean b;
    private Drawable c;
    private Drawable d;
    private Drawable e;
    private TextView f;
    private TextView g;
    private FrameLayout h;

    public SortFilterTextView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dd4d500f8f06f545886955464f5ebf2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dd4d500f8f06f545886955464f5ebf2");
            return;
        }
        this.b = false;
        a(context, (AttributeSet) null);
    }

    public SortFilterTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "653646ed562ba3e7711242dd19183786", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "653646ed562ba3e7711242dd19183786");
            return;
        }
        this.b = false;
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de5173b5493918652ba56f3fc4447988", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de5173b5493918652ba56f3fc4447988");
            return;
        }
        setOrientation(0);
        setGravity(16);
        LayoutInflater.from(context).inflate(R.layout.wm_sc_search_sort_filter_text_layout, this);
        this.f = (TextView) findViewById(R.id.tv_search_sort_filter_text);
        this.g = (TextView) findViewById(R.id.tv_search_sort_filter_count);
        this.h = (FrameLayout) findViewById(R.id.tv_search_sort_filter_count_container);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843087, R.attr.customRightDrawable});
            this.f.setText(obtainStyledAttributes.getString(0));
            this.e = obtainStyledAttributes.getDrawable(1);
            obtainStyledAttributes.recycle();
        }
        a(false, 0);
        setHighlight(false);
    }

    public void setHighlight(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d80a85d155ed04bf8e5f8f0de96b10d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d80a85d155ed04bf8e5f8f0de96b10d");
            return;
        }
        this.f.setTextColor(com.sankuai.shangou.stone.util.d.a(z ? "#222426" : "#575859", 0));
        this.f.getPaint().setFakeBoldText(z);
    }

    public final void a(boolean z, int i) {
        Drawable drawable;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8068ddc5b0ae2858c6c9efaec2e104c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8068ddc5b0ae2858c6c9efaec2e104c8");
            return;
        }
        this.b = z;
        this.h.setVisibility(i <= 0 ? 8 : 0);
        this.g.setText(String.valueOf(i));
        if (i > 0) {
            this.f.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        if (this.e != null) {
            drawable = this.e;
        } else if (!z) {
            if (this.c == null) {
                this.c = getContext().getResources().getDrawable(R.drawable.wm_sc_search_sort_group_arrow_down);
            }
            drawable = this.c;
        } else {
            if (this.d == null) {
                this.d = getContext().getResources().getDrawable(R.drawable.wm_sc_search_sort_group_arrow_up);
            }
            drawable = this.d;
        }
        this.f.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
    }

    public void setText(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc476ac84ebebe8672dcc71edcfaabaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc476ac84ebebe8672dcc71edcfaabaa");
        } else {
            this.f.setText(charSequence);
        }
    }

    public void setTitleTextSize(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba3e1c496c5b1714d09b81d42eb68880", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba3e1c496c5b1714d09b81d42eb68880");
        } else {
            this.f.setTextSize(i);
        }
    }

    public void setCustomRightDrawable(Drawable drawable) {
        this.e = drawable;
    }

    public String getText() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4e930ad31776a267a8cf48bc9274d6a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4e930ad31776a267a8cf48bc9274d6a") : this.f.getText().toString();
    }

    public void setMaxLength(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5e32ecca9350bf61fdb96516a42f11e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5e32ecca9350bf61fdb96516a42f11e");
        } else if (this.f == null) {
        } else {
            this.f.setEllipsize(TextUtils.TruncateAt.valueOf("END"));
            this.f.setMaxLines(1);
            Context context = getContext();
            if (context != null) {
                this.f.setMaxWidth(h.a(context, i));
            }
        }
    }

    public float getMeasureTextWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "870a40081ff596501b630c9c3eb3e918", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "870a40081ff596501b630c9c3eb3e918")).floatValue();
        }
        if (this.f == null) {
            return 0.0f;
        }
        return this.f.getMeasuredWidth();
    }
}
