package com.dianping.picassocontroller.widget;

import android.content.Context;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PCSRefreshView extends FrameLayout implements c {
    public static ChangeQuickRedirect a;
    private View b;

    public PCSRefreshView(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "733ff5f466462377314a765d4eaa4c5e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "733ff5f466462377314a765d4eaa4c5e");
        }
    }

    public PCSRefreshView(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "447a8b9ea5426e962acca9b4c3ca23bd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "447a8b9ea5426e962acca9b4c3ca23bd");
        }
    }

    public void setContent(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28560cf19323da861a9bfabd65343b23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28560cf19323da861a9bfabd65343b23");
            return;
        }
        removeAllViews();
        this.b = view;
        if (view.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) view.getLayoutParams()).gravity = 80;
        } else {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            view.setLayoutParams(layoutParams);
        }
        addView(view);
    }

    public View getContent() {
        return this.b;
    }

    @Override // com.dianping.picassocontroller.widget.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f69f6467cb0b85f5b21996a200ca3abf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f69f6467cb0b85f5b21996a200ca3abf");
        } else if (this.b == null || !(this.b instanceof c)) {
        } else {
            ((c) this.b).a();
        }
    }

    @Override // com.dianping.picassocontroller.widget.c
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b17f23d285164c639670afcc840165e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b17f23d285164c639670afcc840165e");
        } else if (this.b == null || !(this.b instanceof c)) {
        } else {
            ((c) this.b).b();
        }
    }

    @Override // com.dianping.picassocontroller.widget.c
    public final int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "380aeba732cc938dbcc55dd6c1258328", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "380aeba732cc938dbcc55dd6c1258328")).intValue();
        }
        if (this.b == null || !(this.b instanceof c)) {
            return 0;
        }
        return ((c) this.b).c();
    }

    @Override // com.dianping.picassocontroller.widget.c
    public void setProgressRotation(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73f2822d18c658c354c682979c7637b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73f2822d18c658c354c682979c7637b6");
        } else if (this.b == null || !(this.b instanceof c)) {
        } else {
            ((c) this.b).setProgressRotation(f);
        }
    }
}
