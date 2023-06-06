package com.sankuai.waimai.platform.machpro.textarea;

import android.content.Context;
import android.graphics.Canvas;
import android.support.v4.view.GravityCompat;
import android.support.v7.widget.AppCompatEditText;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.view.decoration.d;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MPEditText extends AppCompatEditText {
    public static ChangeQuickRedirect a;
    WeakReference<a> b;
    private final int c;
    private String d;
    private d e;

    public MPEditText(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a61b73a519c38bc7e0dfac12b264fe31", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a61b73a519c38bc7e0dfac12b264fe31");
        } else {
            this.c = getGravity() & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        }
    }

    public void setGravityHorizontal(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44bf8ee7cb987fedabc7a8f3314823db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44bf8ee7cb987fedabc7a8f3314823db");
            return;
        }
        if (i == 0) {
            i = this.c;
        }
        setGravity(i | (getGravity() & (-8) & (-8388616)));
    }

    public a getComponent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d180ed110a60d4fe47f1d9a6daa4fc67", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d180ed110a60d4fe47f1d9a6daa4fc67");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.get();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ca25e49c1de650722b1ffe9213c4fb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ca25e49c1de650722b1ffe9213c4fb3");
            return;
        }
        Object[] objArr2 = {canvas};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7a4ebeb1b25fb38bd350f59c264688cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7a4ebeb1b25fb38bd350f59c264688cf");
        } else {
            a component = getComponent();
            if (component != null) {
                String boxShadow = component.getBoxShadow();
                if (TextUtils.isEmpty(boxShadow)) {
                    this.d = "";
                } else {
                    if (!boxShadow.equals(this.d)) {
                        this.d = boxShadow;
                        String[] split = this.d.split("\\s+");
                        if (split.length == 4) {
                            this.e = new d(split);
                        }
                    }
                    if (this.e != null) {
                        this.e.a(getWidth(), getHeight());
                        this.e.a(component.getBorderRadii());
                        this.e.a(canvas);
                    }
                }
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9636ce9a14bff7e05458eace7f17b4a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9636ce9a14bff7e05458eace7f17b4a5");
        } else {
            super.onDraw(canvas);
        }
    }
}
