package com.meituan.mmp.lib.page.coverview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsoluteLayout;
import android.widget.FrameLayout;
import com.google.gson.JsonObject;
import com.meituan.mmp.lib.ae;
import com.meituan.mmp.lib.api.input.d;
import com.meituan.mmp.lib.page.view.CoverViewWrapper;
import com.meituan.mmp.lib.utils.p;
import com.meituan.msi.view.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ViewBaseContainer extends AbsoluteLayout implements e {
    public static ChangeQuickRedirect b;
    private final List<e> a;

    public ViewBaseContainer(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e369a5a934605f959925fde1071b7299", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e369a5a934605f959925fde1071b7299");
        } else {
            this.a = new LinkedList();
        }
    }

    public ViewBaseContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5d6517970b9e5847169b552986e935f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5d6517970b9e5847169b552986e935f");
        } else {
            this.a = new LinkedList();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {view, Integer.valueOf(i), layoutParams};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "409c5bd1afdc5bac623c3e2415349e54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "409c5bd1afdc5bac623c3e2415349e54");
        } else if (view instanceof CoverViewWrapper) {
            super.addView(view, i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
            com.meituan.mmp.lib.trace.b.e("view not support");
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32d902d8be5018e181c74f2150c70c87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32d902d8be5018e181c74f2150c70c87");
            return;
        }
        if (view instanceof CoverViewWrapper) {
            View content = ((CoverViewWrapper) view).getContent();
            if (content instanceof e) {
                synchronized (this.a) {
                    this.a.remove(content);
                }
            }
        }
        super.removeView(view);
    }

    private void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f252ea8757f920fd8503345ca52d130", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f252ea8757f920fd8503345ca52d130");
        } else if (view instanceof e) {
            synchronized (this.a) {
                this.a.add((e) view);
            }
        }
    }

    public boolean a(View view, JSONObject jSONObject) {
        Object[] objArr = {view, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17829ca0e5653f916fad8a781164f93d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17829ca0e5653f916fad8a781164f93d")).booleanValue();
        }
        CoverViewWrapper coverViewWrapper = new CoverViewWrapper(getContext(), view);
        if (this instanceof FixedViewContainer) {
            coverViewWrapper.setFixed(true);
        }
        a(view);
        String optString = jSONObject.optString("parentId");
        if (!TextUtils.isEmpty(optString)) {
            CoverViewWrapper a = ae.a(this, optString.hashCode());
            if (a == null) {
                com.meituan.mmp.lib.trace.b.e(String.format("parentId %s not found ", optString));
                return false;
            }
            a.addView(coverViewWrapper);
        } else {
            addView(coverViewWrapper);
        }
        b(coverViewWrapper, jSONObject);
        return true;
    }

    public final boolean a(View view, JsonObject jsonObject) {
        Object[] objArr = {view, jsonObject};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4a049ad463606dbe5eaf7ec48ba57ea", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4a049ad463606dbe5eaf7ec48ba57ea")).booleanValue();
        }
        CoverViewWrapper coverViewWrapper = new CoverViewWrapper(getContext(), view);
        if (this instanceof FixedViewContainer) {
            coverViewWrapper.setFixed(true);
        }
        a(view);
        String asString = jsonObject.has("parentId") ? jsonObject.get("parentId").getAsString() : null;
        if (!TextUtils.isEmpty(asString)) {
            CoverViewWrapper a = ae.a(this, asString.hashCode());
            if (a == null) {
                com.meituan.mmp.lib.trace.b.e(String.format("parentId %s not found ", asString));
                return false;
            }
            a.addView(coverViewWrapper);
        } else {
            addView(coverViewWrapper);
        }
        b(coverViewWrapper, jsonObject);
        return true;
    }

    public void b(View view, JSONObject jSONObject) {
        Object[] objArr = {view, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3e84019f7cb199d7230bd7c9345edd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3e84019f7cb199d7230bd7c9345edd2");
            return;
        }
        CoverViewWrapper coverViewWrapper = (CoverViewWrapper) view;
        boolean optBoolean = jSONObject.optBoolean("mpView_embed_render");
        float[] a = p.a(jSONObject);
        if (a == null || coverViewWrapper.a(a)) {
            return;
        }
        coverViewWrapper.setPositionData(a);
        if (coverViewWrapper.getParent() == this || coverViewWrapper.getParent() == null) {
            AbsoluteLayout.LayoutParams layoutParams = (AbsoluteLayout.LayoutParams) coverViewWrapper.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new AbsoluteLayout.LayoutParams(0, 0, 0, 0);
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("position");
            if (optJSONObject.has("left")) {
                layoutParams.x = (int) a[0];
            }
            if (optJSONObject.has("top")) {
                layoutParams.y = (int) a[1];
            }
            if (!optBoolean) {
                layoutParams.width = (int) a[2];
                layoutParams.height = (int) a[3];
            }
            coverViewWrapper.setLayoutParams(layoutParams);
        } else {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(0, 0);
            layoutParams2.leftMargin = (int) a[0];
            layoutParams2.topMargin = (int) a[1];
            if (!optBoolean) {
                layoutParams2.width = (int) a[2];
                layoutParams2.height = (int) a[3];
            }
            coverViewWrapper.setLayoutParams(layoutParams2);
        }
        requestLayout();
    }

    public final void b(View view, JsonObject jsonObject) {
        Object[] objArr = {view, jsonObject};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3ad8eefa772f0e0f07500a8f517b959", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3ad8eefa772f0e0f07500a8f517b959");
            return;
        }
        CoverViewWrapper coverViewWrapper = (CoverViewWrapper) view;
        boolean asBoolean = jsonObject.has("mpView_embed_render") ? jsonObject.get("mpView_embed_render").getAsBoolean() : false;
        float[] a = p.a(jsonObject);
        if (a == null || coverViewWrapper.a(a)) {
            return;
        }
        coverViewWrapper.setPositionData(a);
        if (coverViewWrapper.getParent() == this || coverViewWrapper.getParent() == null) {
            AbsoluteLayout.LayoutParams layoutParams = (AbsoluteLayout.LayoutParams) coverViewWrapper.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new AbsoluteLayout.LayoutParams(0, 0, 0, 0);
            }
            JsonObject asJsonObject = jsonObject.has("position") ? jsonObject.get("position").getAsJsonObject() : null;
            if (asJsonObject != null && asJsonObject.has("left")) {
                layoutParams.x = (int) a[0];
            }
            if (asJsonObject != null && asJsonObject.has("top")) {
                layoutParams.y = (int) a[1];
            }
            if (!asBoolean) {
                layoutParams.width = (int) a[2];
                layoutParams.height = (int) a[3];
            }
            coverViewWrapper.setLayoutParams(layoutParams);
        } else {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) a[2], (int) a[3]);
            layoutParams2.leftMargin = (int) a[0];
            layoutParams2.topMargin = (int) a[1];
            if (!asBoolean) {
                layoutParams2.width = (int) a[2];
                layoutParams2.height = (int) a[3];
            }
            coverViewWrapper.setLayoutParams(layoutParams2);
        }
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a1be2e2627ca678def7bb2021c93cf5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a1be2e2627ca678def7bb2021c93cf5");
        } else {
            super.onAttachedToWindow();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07b835f3b4e9265277b331930f1864f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07b835f3b4e9265277b331930f1864f3");
            return;
        }
        this.a.clear();
        super.onDetachedFromWindow();
    }

    public final com.meituan.mmp.lib.api.input.c a(boolean z, int i) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5beff3f25e69a594d49267190ada6bac", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.mmp.lib.api.input.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5beff3f25e69a594d49267190ada6bac");
        }
        com.meituan.mmp.lib.api.input.c cVar = new com.meituan.mmp.lib.api.input.c();
        cVar.c = -1;
        View findFocus = findFocus();
        if (findFocus instanceof d) {
            d dVar = (d) findFocus;
            if (dVar.hasFocus()) {
                cVar.d = dVar.I_();
                cVar.c = dVar.a();
                cVar.e = dVar.getValue();
                cVar.a = dVar.getCursor();
                cVar.b = dVar.getInputHeight();
                if (z && i > 0) {
                    dVar.b(i);
                }
                return cVar;
            }
        }
        return cVar;
    }

    @Override // com.meituan.msi.view.e
    public final boolean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b0219433fe5de8104d67262d01a0099", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b0219433fe5de8104d67262d01a0099")).booleanValue();
        }
        synchronized (this.a) {
            for (e eVar : this.a) {
                if (eVar.c(str)) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // com.meituan.msi.view.e
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e5a2deb44da32fc50196c6636a7c52f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e5a2deb44da32fc50196c6636a7c52f")).booleanValue();
        }
        synchronized (this.a) {
            for (e eVar : this.a) {
                if (eVar.b()) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // com.meituan.msi.view.e
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "526d574f0f38218e28fd09f0ef30d90c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "526d574f0f38218e28fd09f0ef30d90c");
            return;
        }
        synchronized (this.a) {
            for (e eVar : this.a) {
                eVar.b(i);
            }
        }
    }

    @Override // com.meituan.msi.view.e
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80af7dc4ab9d44498cf4acc26b306b21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80af7dc4ab9d44498cf4acc26b306b21");
            return;
        }
        synchronized (this.a) {
            for (e eVar : this.a) {
                eVar.c();
            }
        }
    }
}
