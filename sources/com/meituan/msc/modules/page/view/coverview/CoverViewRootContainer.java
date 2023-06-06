package com.meituan.msc.modules.page.view.coverview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.gson.JsonObject;
import com.meituan.msc.common.utils.x;
import com.meituan.msc.modules.api.input.textarea.d;
import com.meituan.msc.modules.page.render.webview.f;
import com.meituan.msc.modules.page.view.CoverViewWrapper;
import com.meituan.msi.api.component.input.c;
import com.meituan.msi.view.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class CoverViewRootContainer extends FrameLayout implements f, e {
    public static ChangeQuickRedirect a;
    public d b;
    public FixedViewContainer c;
    public CoverViewNormalContainer d;
    private com.meituan.msc.modules.page.view.a e;

    public CoverViewRootContainer(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "138ff4f848a4d562f92307ed97373d88", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "138ff4f848a4d562f92307ed97373d88");
            return;
        }
        this.c = null;
        this.d = null;
        this.e = new com.meituan.msc.modules.page.view.a();
        a();
    }

    public int getCoverViewScrollY() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b6cda5cfe999530b311ac63fb3796e5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b6cda5cfe999530b311ac63fb3796e5")).intValue() : this.d.getScrollY();
    }

    public CoverViewRootContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "218aa3df6512c9cca6944424d87d870a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "218aa3df6512c9cca6944424d87d870a");
            return;
        }
        this.c = null;
        this.d = null;
        this.e = new com.meituan.msc.modules.page.view.a();
        a();
    }

    public final CoverViewWrapper a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85b6c7ea86bd58df1be4eb2ff3be63b4", RobustBitConfig.DEFAULT_VALUE)) {
            return (CoverViewWrapper) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85b6c7ea86bd58df1be4eb2ff3be63b4");
        }
        CoverViewWrapper a2 = com.meituan.msc.modules.page.view.e.a(this.c, i);
        return a2 == null ? com.meituan.msc.modules.page.view.e.a(this.d, i) : a2;
    }

    public boolean a(View view, JsonObject jsonObject) {
        Object[] objArr = {view, jsonObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3719e45d19ba93a29779d0b10d11530f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3719e45d19ba93a29779d0b10d11530f")).booleanValue();
        }
        if (!(view instanceof c) && jsonObject.has("fixed") && jsonObject.get("fixed").getAsBoolean()) {
            jsonObject.remove("parentId");
            return this.c.a(view, jsonObject);
        }
        String asString = jsonObject.has("parentId") ? jsonObject.get("parentId").getAsString() : null;
        if ((TextUtils.isEmpty(asString) ? null : com.meituan.msc.modules.page.view.e.a(this.c, asString.hashCode())) != null) {
            return this.c.a(view, jsonObject);
        }
        return this.d.a(view, jsonObject);
    }

    public void a(CoverViewWrapper coverViewWrapper, JsonObject jsonObject) {
        Object[] objArr = {coverViewWrapper, jsonObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddf8df4d5160c4ed34271a2bd2fc3de4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddf8df4d5160c4ed34271a2bd2fc3de4");
            return;
        }
        coverViewWrapper.a(jsonObject);
        if (coverViewWrapper.a()) {
            this.c.b(coverViewWrapper, jsonObject);
        } else {
            this.d.b(coverViewWrapper, jsonObject);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8e834c852f3989cd651500e2ad58b85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8e834c852f3989cd651500e2ad58b85");
        } else {
            super.onAttachedToWindow();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a893c7995338730b2b4e3971accea445", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a893c7995338730b2b4e3971accea445");
        } else {
            super.onDetachedFromWindow();
        }
    }

    @Override // com.meituan.msc.modules.page.render.webview.f
    public final void a(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "027c485e031eaae50570970a13b8fd77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "027c485e031eaae50570970a13b8fd77");
        } else {
            this.d.scrollTo(i, i2);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b56e562a9b1d5c6ab0e5ea6eb96066b4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b56e562a9b1d5c6ab0e5ea6eb96066b4")).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            x.a(getContext(), getWindowToken(), 0);
            com.meituan.msc.modules.page.view.a aVar = this.e;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.page.view.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "b2d032a76ebb9e56732906bea0f3eb29", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "b2d032a76ebb9e56732906bea0f3eb29");
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fefa7772133e815f638f8a2531ed5b80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fefa7772133e815f638f8a2531ed5b80");
            return;
        }
        this.b = new d();
        this.c = new FixedViewContainer(getContext());
        this.d = new CoverViewNormalContainer(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        addView(this.d, layoutParams);
        addView(this.c, layoutParams2);
    }

    public d getTextAreaHeightChangeManager() {
        return this.b;
    }

    @Override // com.meituan.msi.view.e
    public final boolean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51f4377f90629bb78175bcc3982dd0ae", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51f4377f90629bb78175bcc3982dd0ae")).booleanValue();
        }
        if (this.c.c(str)) {
            return true;
        }
        return this.d.c(str);
    }

    @Override // com.meituan.msi.view.e
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "325f1b2a70eff6a0b2b0982ec43ca5b8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "325f1b2a70eff6a0b2b0982ec43ca5b8")).booleanValue();
        }
        if (this.c.b()) {
            return true;
        }
        return this.d.b();
    }

    @Override // com.meituan.msi.view.e
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33f205427cde13580554c6a8ee5d973e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33f205427cde13580554c6a8ee5d973e");
            return;
        }
        this.c.b(i);
        this.d.b(i);
    }

    @Override // com.meituan.msi.view.e
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec8423c356a88c7a1c4fdd3a03057938", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec8423c356a88c7a1c4fdd3a03057938");
            return;
        }
        this.c.c();
        this.d.c();
    }

    public com.meituan.msc.modules.page.view.a getContainerObserver() {
        return this.e;
    }
}
