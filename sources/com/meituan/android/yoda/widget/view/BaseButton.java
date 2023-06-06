package com.meituan.android.yoda.widget.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import com.meituan.android.yoda.model.b;
import com.meituan.android.yoda.util.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class BaseButton extends AppCompatButton implements b.InterfaceC0379b {
    public static ChangeQuickRedirect a;
    private boolean b;
    private b.c c;

    public void a() {
    }

    public BaseButton(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "906dc77f05589b12b41e29f7a4bbdc32", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "906dc77f05589b12b41e29f7a4bbdc32");
            return;
        }
        this.b = false;
        this.c = new b.c();
    }

    public BaseButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2131559332);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3ec04fbe6d8e4cd659258023b3b5d8c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3ec04fbe6d8e4cd659258023b3b5d8c");
        }
    }

    public BaseButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4ca23ad6904249ac35aeddace9d3cbd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4ca23ad6904249ac35aeddace9d3cbd");
            return;
        }
        this.b = false;
        this.c = new b.c();
        v a2 = v.a(context, attributeSet, new int[]{R.attr.yoda_switch, R.attr.yoda_reverse, R.attr.yoda_animate, R.attr.yoda_touchMode, R.attr.yoda_paint_color, R.attr.yoda_paint_width});
        this.b = a2.a(0, false);
        a2.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        StateListDrawable stateListDrawable;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca69202089cde38f2ed5a59daa52eef3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca69202089cde38f2ed5a59daa52eef3");
            return;
        }
        super.onAttachedToWindow();
        if (!this.b || com.meituan.android.yoda.config.ui.d.a().a()) {
            return;
        }
        Drawable n = com.meituan.android.yoda.config.ui.d.a().n();
        if (n != null) {
            stateListDrawable = n;
            if (Build.VERSION.SDK_INT >= 16) {
                setBackground(n);
                return;
            }
        } else if (getContext() == null) {
            return;
        } else {
            int k = com.meituan.android.yoda.config.ui.d.a().k();
            int l = com.meituan.android.yoda.config.ui.d.a().l();
            int m = com.meituan.android.yoda.config.ui.d.a().m();
            Object[] objArr2 = {Integer.valueOf(k), Integer.valueOf(l), Integer.valueOf(m)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b9f0930dd0903bca265390ecd87f8f71", RobustBitConfig.DEFAULT_VALUE)) {
                stateListDrawable = (StateListDrawable) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b9f0930dd0903bca265390ecd87f8f71");
            } else {
                StateListDrawable stateListDrawable2 = new StateListDrawable();
                com.meituan.android.yoda.widget.drawable.b bVar = new com.meituan.android.yoda.widget.drawable.b(getContext(), k);
                com.meituan.android.yoda.widget.drawable.b bVar2 = k == l ? bVar : new com.meituan.android.yoda.widget.drawable.b(getContext(), l);
                com.meituan.android.yoda.widget.drawable.b bVar3 = new com.meituan.android.yoda.widget.drawable.b(getContext(), m);
                stateListDrawable2.addState(new int[]{16842910, 16842919}, bVar);
                stateListDrawable2.addState(new int[]{16842910}, bVar2);
                stateListDrawable2.addState(new int[0], bVar3);
                stateListDrawable = stateListDrawable2;
            }
        }
        setBackgroundDrawable(stateListDrawable);
    }

    @Override // android.view.View
    public boolean performClick() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3eb7da3c3f1dcabe3bfeb5d9851e52c6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3eb7da3c3f1dcabe3bfeb5d9851e52c6")).booleanValue();
        }
        com.meituan.android.yoda.model.b.a(this).b();
        return super.performClick();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7ac7980ab2083a9b2b7e4cff35201a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7ac7980ab2083a9b2b7e4cff35201a5");
            return;
        }
        super.onDetachedFromWindow();
        if (getBackground() != null) {
            getBackground().setCallback(null);
        }
        setBackgroundDrawable(null);
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public final b.InterfaceC0379b c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a92cfa63a6b16e41ffee4a0c5a35e8d4", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.InterfaceC0379b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a92cfa63a6b16e41ffee4a0c5a35e8d4");
        }
        b.c cVar = this.c;
        cVar.b = str;
        return cVar;
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public String getBid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a66af98790dda72eadd7edeb2317e2aa", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a66af98790dda72eadd7edeb2317e2aa") : this.c.getBid();
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public final b.InterfaceC0379b a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae30703527873a60ddb6bee496f46d27", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.InterfaceC0379b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae30703527873a60ddb6bee496f46d27");
        }
        b.c cVar = this.c;
        cVar.c = i;
        return cVar;
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public int getConfirmType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edcd991573cd74ac02f495deb4f216fc", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edcd991573cd74ac02f495deb4f216fc")).intValue() : this.c.getConfirmType();
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public final b.InterfaceC0379b d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01607e1c220987699cfd32ce83f1ca3b", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.InterfaceC0379b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01607e1c220987699cfd32ce83f1ca3b");
        }
        b.c cVar = this.c;
        cVar.d = str;
        return cVar;
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public String getRequestCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d0f586465d9e2f8cf66ed56ba132f1f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d0f586465d9e2f8cf66ed56ba132f1f") : this.c.getRequestCode();
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public long getPageDuration() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3df81905ed07645d2df6eac3cb3cadd", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3df81905ed07645d2df6eac3cb3cadd")).longValue() : this.c.getPageDuration();
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public final b.InterfaceC0379b e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd16e2ce86b7e0a9cc76ab1347d86779", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.InterfaceC0379b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd16e2ce86b7e0a9cc76ab1347d86779");
        }
        b.c cVar = this.c;
        cVar.e = str;
        return cVar;
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public String getAction() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ac5d0d3276a1e6203b41a1e121588ef", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ac5d0d3276a1e6203b41a1e121588ef") : this.c.getAction();
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public final b.InterfaceC0379b f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a04efaac675f81fa24b949b343f9a18", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.InterfaceC0379b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a04efaac675f81fa24b949b343f9a18");
        }
        b.c cVar = this.c;
        cVar.f = str;
        return cVar;
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public String getPageCid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21bd9c251f4292a06f216a49713227e0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21bd9c251f4292a06f216a49713227e0") : this.c.getPageCid();
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public final b.InterfaceC0379b g(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72aac1591cbf66e0276023378759752b", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.InterfaceC0379b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72aac1591cbf66e0276023378759752b");
        }
        b.c cVar = this.c;
        cVar.g = str;
        return cVar;
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public String getPageInfoKey() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a518bfda4f91b3f3842bfe0f5cae2780", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a518bfda4f91b3f3842bfe0f5cae2780") : this.c.getPageInfoKey();
    }
}
