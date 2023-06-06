package com.meituan.mmp.lib.page.coverview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.gson.JsonObject;
import com.meituan.mmp.lib.ae;
import com.meituan.mmp.lib.page.view.CoverViewWrapper;
import com.meituan.mmp.lib.utils.y;
import com.meituan.mmp.lib.web.i;
import com.meituan.msi.view.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class CoverViewRootContainer extends FrameLayout implements com.meituan.mmp.lib.page.b, i, e {
    public static ChangeQuickRedirect a;
    public com.meituan.mmp.lib.api.input.textarea.e b;
    public FixedViewContainer c;
    public CoverViewNormalContainer d;
    private com.meituan.mmp.lib.page.a e;

    public CoverViewRootContainer(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f72f7b629e88982eeb1628ac896e9551", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f72f7b629e88982eeb1628ac896e9551");
            return;
        }
        this.c = null;
        this.d = null;
        this.e = new com.meituan.mmp.lib.page.a();
        a();
    }

    public int getCoverViewScrollY() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0f99edfb797d9d863448353ea5a22ae", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0f99edfb797d9d863448353ea5a22ae")).intValue() : this.d.getScrollY();
    }

    public CoverViewRootContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e06f0cf1f71bd2e01f9d25ea1aa7eae9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e06f0cf1f71bd2e01f9d25ea1aa7eae9");
            return;
        }
        this.c = null;
        this.d = null;
        this.e = new com.meituan.mmp.lib.page.a();
        a();
    }

    public boolean a(View view, JSONObject jSONObject) {
        Object[] objArr = {view, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f48542fabcb084e481ed21631642db62", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f48542fabcb084e481ed21631642db62")).booleanValue();
        }
        if (!(view instanceof com.meituan.mmp.lib.api.input.a) && jSONObject.has("fixed") && jSONObject.optBoolean("fixed")) {
            jSONObject.remove("parentId");
            return this.c.a(view, jSONObject);
        }
        String optString = jSONObject.optString("parentId");
        if ((TextUtils.isEmpty(optString) ? null : ae.a(this.c, optString.hashCode())) != null) {
            return this.c.a(view, jSONObject);
        }
        return this.d.a(view, jSONObject);
    }

    public boolean a(View view, JsonObject jsonObject) {
        Object[] objArr = {view, jsonObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a198d3f079f9fe7f8b96e1e6b6f22681", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a198d3f079f9fe7f8b96e1e6b6f22681")).booleanValue();
        }
        if (!(view instanceof com.meituan.mmp.lib.api.input.a) && jsonObject.has("fixed") && jsonObject.get("fixed").getAsBoolean()) {
            jsonObject.remove("parentId");
            return this.c.a(view, jsonObject);
        }
        String asString = jsonObject.has("parentId") ? jsonObject.get("parentId").getAsString() : null;
        if ((TextUtils.isEmpty(asString) ? null : ae.a(this.c, asString.hashCode())) != null) {
            return this.c.a(view, jsonObject);
        }
        return this.d.a(view, jsonObject);
    }

    public void a(CoverViewWrapper coverViewWrapper, JSONObject jSONObject) {
        Object[] objArr = {coverViewWrapper, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "260f94ad32c6c1a050da24076270178a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "260f94ad32c6c1a050da24076270178a");
        } else if (coverViewWrapper.b()) {
            this.c.b(coverViewWrapper, jSONObject);
        } else {
            this.d.b(coverViewWrapper, jSONObject);
        }
    }

    public void a(CoverViewWrapper coverViewWrapper, JsonObject jsonObject) {
        Object[] objArr = {coverViewWrapper, jsonObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2a7ea73917e25931d53330e1258d58e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2a7ea73917e25931d53330e1258d58e");
        } else if (coverViewWrapper.b()) {
            this.c.b(coverViewWrapper, jsonObject);
        } else {
            this.d.b(coverViewWrapper, jsonObject);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a13f4d219b8aca0733933a0bef55c49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a13f4d219b8aca0733933a0bef55c49");
        } else {
            super.onAttachedToWindow();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e11ae5741ec765df306615d142c92e13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e11ae5741ec765df306615d142c92e13");
        } else {
            super.onDetachedFromWindow();
        }
    }

    @Override // com.meituan.mmp.lib.web.i
    public final void a(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee3a52bc8dcfb75dd99dbf49f9590fbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee3a52bc8dcfb75dd99dbf49f9590fbb");
        } else {
            this.d.scrollTo(i, i2);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7188b305c96ff163a7d942e272fba859", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7188b305c96ff163a7d942e272fba859")).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            y.a(getContext(), getWindowToken(), 0);
            com.meituan.mmp.lib.page.a aVar = this.e;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.lib.page.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "476af715ce02efc6bde6d8d5f572a012", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "476af715ce02efc6bde6d8d5f572a012");
            } else if (aVar.b != null) {
                aVar.b.g();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c447dc59bd9817272ab3d117c72e2e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c447dc59bd9817272ab3d117c72e2e5");
            return;
        }
        this.b = new com.meituan.mmp.lib.api.input.textarea.e();
        this.c = new FixedViewContainer(getContext());
        this.d = new CoverViewNormalContainer(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        addView(this.d, layoutParams);
        addView(this.c, layoutParams2);
    }

    public com.meituan.mmp.lib.api.input.textarea.e getTextAreaHeightChangeManager() {
        return this.b;
    }

    @Override // com.meituan.msi.view.e
    public final boolean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bad3754553b88b92f510bf567922072f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bad3754553b88b92f510bf567922072f")).booleanValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03f69fa202fc6a4d2efe1da4967db42c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03f69fa202fc6a4d2efe1da4967db42c")).booleanValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dfb74240548ed5f785244ebb62ffb84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dfb74240548ed5f785244ebb62ffb84");
            return;
        }
        this.c.b(i);
        this.d.b(i);
    }

    @Override // com.meituan.msi.view.e
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9ec1f81e93cd4b0dc2a1ab07542a1bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9ec1f81e93cd4b0dc2a1ab07542a1bf");
            return;
        }
        this.c.c();
        this.d.c();
    }

    @Override // com.meituan.mmp.lib.page.b
    public com.meituan.mmp.lib.page.a getContainerObserver() {
        return this.e;
    }
}
