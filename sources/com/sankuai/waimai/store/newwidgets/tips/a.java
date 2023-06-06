package com.sankuai.waimai.store.newwidgets.tips;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.ColorRes;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.manipulator.annotation.SkipInstrumentation;
import com.sankuai.waimai.platform.utils.p;
import com.sankuai.waimai.store.newwidgets.TipsView;
import com.sankuai.waimai.store.util.b;
import com.sankuai.waimai.store.util.l;
/* compiled from: ProGuard */
@SkipInstrumentation
/* loaded from: classes5.dex */
public final class a extends PopupWindow {
    public static ChangeQuickRedirect a;
    private TipsView b;
    private int c;
    private int d;
    private final int e;
    private int f;

    private a(Context context, int i, @ColorRes int i2, int i3) {
        Object[] objArr = {context, Integer.valueOf((int) R.layout.wm_sc_pop_view_tips), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0c7ad2dc79dfcdcd14c1adac184ead4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0c7ad2dc79dfcdcd14c1adac184ead4");
            return;
        }
        this.f = 0;
        View inflate = LayoutInflater.from(context).inflate(R.layout.wm_sc_tips_popup_window, (ViewGroup) null);
        this.b = (TipsView) inflate.findViewById(R.id.decorView);
        LayoutInflater.from(context).inflate(R.layout.wm_sc_pop_view_tips, (ViewGroup) this.b, true);
        int a2 = this.b.a(R.dimen.wm_sc_common_dimen_5);
        this.c = a2;
        this.d = a2;
        this.e = this.b.a(R.dimen.wm_sc_common_dimen_8);
        setContentView(inflate);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.newwidgets.tips.a.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d0487493b4817bd2bd013a03b8fb0b34", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d0487493b4817bd2bd013a03b8fb0b34");
                    return;
                }
                try {
                    p.b(a.this);
                } catch (Exception e) {
                    com.sankuai.shangou.stone.util.log.a.a(e);
                }
            }
        });
        if (i2 != 0) {
            this.b.setBackground(b.b(context, i2));
        }
        if (i3 != 0) {
            this.b.setCorner(i3);
        }
        setWidth(-1);
        setHeight(-2);
        a();
        setAnimationStyle(0);
        setBackgroundDrawable(new ColorDrawable(context.getResources().getColor(17170445)));
        setFocusable(true);
        setOutsideTouchable(true);
    }

    @Override // android.widget.PopupWindow
    @SkipInstrumentation
    public final void showAsDropDown(View view, int i, int i2, int i3) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb62498bc2040e15030c91a15895f4c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb62498bc2040e15030c91a15895f4c4");
            return;
        }
        a();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        a(view, iArr[0] + (view.getMeasuredWidth() / 2), i2);
    }

    @Override // android.widget.PopupWindow
    @SkipInstrumentation
    public final void showAtLocation(View view, int i, int i2, int i3) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ae1dce3a0b346c2f6c4da5abe7190d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ae1dce3a0b346c2f6c4da5abe7190d7");
            return;
        }
        a();
        if (i == 0) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            a(view, iArr[0] + (view.getMeasuredWidth() / 2), 0);
            return;
        }
        super.showAtLocation(view, i, 0, i3 - this.e);
        a(i2, i);
    }

    @SkipInstrumentation
    private void a(View view, int i, int i2) {
        int measuredHeight;
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a81c2f3da7c9a00693294d3c881339e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a81c2f3da7c9a00693294d3c881339e");
            return;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int d = h.d(this.b.getContext());
        int i3 = iArr[1];
        int measuredHeight2 = (d - iArr[1]) - view.getMeasuredHeight();
        int i4 = 48;
        if (this.f == 48 || this.f == 80) {
            i4 = this.f;
        } else if (i3 > measuredHeight2) {
            i4 = 80;
        }
        if (i4 == 80) {
            measuredHeight = ((d - iArr[1]) - this.e) + i2;
        } else {
            measuredHeight = ((iArr[1] + view.getMeasuredHeight()) - this.e) + i2;
        }
        super.showAtLocation(view, i4, 0, measuredHeight);
        a(i, i4);
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c201370592abf68f2ca28317ac41b0ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c201370592abf68f2ca28317ac41b0ad");
            return;
        }
        this.b.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    private void a(int i, int i2) {
        int i3;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fea61da9719abe02b02535afe78d626", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fea61da9719abe02b02535afe78d626");
            return;
        }
        int measuredWidth = this.b.getMeasuredWidth();
        int a2 = h.a(this.b.getContext());
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.b.getLayoutParams();
        layoutParams.bottomMargin = this.e;
        layoutParams.topMargin = this.e;
        if (this.d + measuredWidth + this.c <= a2) {
            int i4 = (a2 - i) - this.d;
            int measuredWidth2 = this.b.getMeasuredWidth() / 2;
            if (i - this.c > measuredWidth2 && i4 > measuredWidth2) {
                i3 = measuredWidth / 2;
                layoutParams.rightMargin = this.d;
                layoutParams.leftMargin = i - i3;
                if (layoutParams.leftMargin < 0) {
                    layoutParams.leftMargin = this.c;
                }
            } else if (i4 <= measuredWidth2) {
                layoutParams.addRule(11);
                layoutParams.leftMargin = this.c;
                layoutParams.rightMargin = this.d;
                i3 = i - ((a2 - measuredWidth) - this.d);
            }
            this.b.setLayoutParams(layoutParams);
            this.b.a(i3, i2);
        }
        layoutParams.leftMargin = this.c;
        layoutParams.rightMargin = this.d;
        i3 = i - this.c;
        this.b.setLayoutParams(layoutParams);
        this.b.a(i3, i2);
    }

    public static PopupWindow a(Context context, String str, int i, int i2) {
        Object[] objArr = {context, str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8757db68845b1d63f82880c3b9013773", RobustBitConfig.DEFAULT_VALUE)) {
            return (PopupWindow) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8757db68845b1d63f82880c3b9013773");
        }
        Object[] objArr2 = {context, str, Integer.valueOf(i), Integer.valueOf(i2), 0, 0, 0};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "9471a0a3ceee96aa353ed3e9eda2eb00", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "9471a0a3ceee96aa353ed3e9eda2eb00");
        }
        if (context == null) {
            return null;
        }
        a aVar = new a(context, R.layout.wm_sc_pop_view_tips, 0, 0);
        aVar.d = i2;
        aVar.c = i;
        ((TextView) aVar.b.findViewById(R.id.tip_content)).setText(l.a(str));
        return aVar;
    }
}
