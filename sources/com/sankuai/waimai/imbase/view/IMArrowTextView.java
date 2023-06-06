package com.sankuai.waimai.imbase.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.R;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class IMArrowTextView extends FrameLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static ChangeQuickRedirect a;
    private static int f;
    private TextView b;
    private View c;
    private int d;
    private String e;

    public IMArrowTextView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3987b541586ac8713af589c43232b582", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3987b541586ac8713af589c43232b582");
        }
    }

    public IMArrowTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df50a1f2e440dbc4a7245dfe8390de7d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df50a1f2e440dbc4a7245dfe8390de7d");
        }
    }

    public IMArrowTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b01ecc979b30792b2a81d3238dbd86e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b01ecc979b30792b2a81d3238dbd86e8");
            return;
        }
        this.d = 2;
        this.e = "";
        Object[] objArr2 = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e7babcc2d52cc480b4e49afc402e7f51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e7babcc2d52cc480b4e49afc402e7f51");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.arrowLine});
        if (obtainStyledAttributes != null) {
            this.d = Math.max(1, obtainStyledAttributes.getInt(0, 2));
            obtainStyledAttributes.recycle();
        }
        f = g.a(getContext(), 6.0f);
        LayoutInflater.from(context).inflate(R.layout.wm_imbase_arrow_layout, (ViewGroup) this, true);
        this.b = (TextView) findViewById(R.id.wm_imbase_txt);
        this.c = findViewById(R.id.wm_imbase_arrow);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a91eb541d51eec0070f51f9a2f929fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a91eb541d51eec0070f51f9a2f929fb");
            return;
        }
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b7d3373305eaa7febf9919aeb8351b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b7d3373305eaa7febf9919aeb8351b6");
            return;
        }
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    public void setText(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16cea42baa0a31c3e7b3800b9af90c70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16cea42baa0a31c3e7b3800b9af90c70");
            return;
        }
        this.e = str;
        this.b.setText(this.e);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2ac5fe1a32eaae76e729a899bf32e4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2ac5fe1a32eaae76e729a899bf32e4d");
        } else {
            a();
        }
    }

    private void a() {
        while (true) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b421537eaccbaf4fd8e38fa59cb51394", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b421537eaccbaf4fd8e38fa59cb51394");
                return;
            }
            Layout layout = this.b.getLayout();
            if (layout == null) {
                return;
            }
            int lineCount = layout.getLineCount();
            if (lineCount <= this.d) {
                a(layout, lineCount);
                return;
            }
            c(layout, lineCount);
        }
    }

    private void a(Layout layout, int i) {
        Object[] objArr = {layout, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fc2e360be8d0bdfd4fd0524be03606a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fc2e360be8d0bdfd4fd0524be03606a");
            return;
        }
        int i2 = i - 1;
        if (a(layout, Math.max(0, i2), Math.max(0, i2) == 0 ? getTotalWidth() : layout.getLineWidth(i - 2))) {
            b(layout, Math.max(0, i2));
            return;
        }
        c(layout, i);
        a();
    }

    private int getTotalWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8edde1999c2aed02d6a900a1df992276", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8edde1999c2aed02d6a900a1df992276")).intValue() : (getMeasuredWidth() - getPaddingRight()) - getPaddingLeft();
    }

    private boolean a(Layout layout, int i, float f2) {
        Object[] objArr = {layout, Integer.valueOf(i), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33d0b82ad79c01d04dfbaa7bb7fe2c7b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33d0b82ad79c01d04dfbaa7bb7fe2c7b")).booleanValue() : (layout.getLineWidth(i) + ((float) this.c.getWidth())) + ((float) f) <= f2;
    }

    private void b(Layout layout, int i) {
        Object[] objArr = {layout, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5621782591f514d21ce17d21da00cf03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5621782591f514d21ce17d21da00cf03");
            return;
        }
        this.c.setX((getTotalWidth() - this.c.getWidth()) - f);
        this.c.setY(((layout.getLineTop(i) + layout.getLineBottom(i)) - this.c.getHeight()) / 2.0f);
    }

    private void c(Layout layout, int i) {
        int length;
        Object[] objArr = {layout, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed59c5e937f34180e634fa99b7ec8836", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed59c5e937f34180e634fa99b7ec8836");
            return;
        }
        String str = this.e;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (i > this.d) {
            length = Math.min(layout.getLineEnd(this.d - 1), str.length() - 1);
        } else {
            length = str.length() > 0 ? str.length() - 1 : 0;
        }
        if (length >= 0) {
            this.e = str.substring(0, length);
        }
        TextView textView = this.b;
        textView.setText(this.e + "...");
    }
}
