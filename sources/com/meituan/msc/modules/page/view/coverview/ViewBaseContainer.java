package com.meituan.msc.modules.page.view.coverview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsoluteLayout;
import android.widget.FrameLayout;
import com.google.gson.JsonObject;
import com.meituan.msc.common.utils.n;
import com.meituan.msc.modules.page.view.CoverViewWrapper;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msi.view.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ViewBaseContainer extends AbsoluteLayout implements e {
    public static ChangeQuickRedirect b;
    private final List<e> a;

    public ViewBaseContainer(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "879e32b329384bc0a0802c223f7d9af9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "879e32b329384bc0a0802c223f7d9af9");
        } else {
            this.a = new LinkedList();
        }
    }

    public ViewBaseContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec7503081efef3e54a0ff743ca6cbb7d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec7503081efef3e54a0ff743ca6cbb7d");
        } else {
            this.a = new LinkedList();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {view, Integer.valueOf(i), layoutParams};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d44aa4977f5039f5ddf614854301f26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d44aa4977f5039f5ddf614854301f26");
        } else if (view instanceof CoverViewWrapper) {
            super.addView(view, i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
            g.d("view not support");
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcdb45b4b4cb68390c5e54d985efc952", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcdb45b4b4cb68390c5e54d985efc952");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e97c5940b85f60a06a392a448266fe5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e97c5940b85f60a06a392a448266fe5");
        } else if (view instanceof e) {
            synchronized (this.a) {
                this.a.add((e) view);
            }
        }
    }

    public final boolean a(View view, JsonObject jsonObject) {
        Object[] objArr = {view, jsonObject};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef9a61f16ef021ff26cac6bd0118c145", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef9a61f16ef021ff26cac6bd0118c145")).booleanValue();
        }
        CoverViewWrapper coverViewWrapper = new CoverViewWrapper(getContext(), view);
        if (this instanceof FixedViewContainer) {
            coverViewWrapper.setFixed(true);
        }
        a(view);
        String asString = jsonObject.has("parentId") ? jsonObject.get("parentId").getAsString() : null;
        if (!TextUtils.isEmpty(asString)) {
            CoverViewWrapper a = com.meituan.msc.modules.page.view.e.a(this, asString.hashCode());
            if (a == null) {
                g.a("ViewBaseContainer", String.format("view(id: %s，pageId: %s)insert failed for parentId %s not found ", jsonObject.get("viewId").getAsString(), jsonObject.get("pageId").getAsString(), asString));
                return false;
            }
            a.addView(coverViewWrapper);
        } else {
            addView(coverViewWrapper);
        }
        b(coverViewWrapper, jsonObject);
        return true;
    }

    public final void b(View view, JsonObject jsonObject) {
        Object[] objArr = {view, jsonObject};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f8ad6aafbe6bdc5e3258949a4630538", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f8ad6aafbe6bdc5e3258949a4630538");
            return;
        }
        CoverViewWrapper coverViewWrapper = (CoverViewWrapper) view;
        boolean asBoolean = jsonObject.has("mpView_embed_render") ? jsonObject.get("mpView_embed_render").getAsBoolean() : false;
        float[] a = n.a(jsonObject);
        if (a == null) {
            return;
        }
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b977a182905650970cb9dc63add549b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b977a182905650970cb9dc63add549b6");
        } else {
            super.onAttachedToWindow();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa19cc897b957c036ec5dc49c4a4bb5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa19cc897b957c036ec5dc49c4a4bb5c");
            return;
        }
        this.a.clear();
        super.onDetachedFromWindow();
    }

    public final com.meituan.msc.modules.api.input.a a(boolean z, int i) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c16e9acbba5b9c448fa6e9f22a839fd", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.modules.api.input.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c16e9acbba5b9c448fa6e9f22a839fd");
        }
        com.meituan.msc.modules.api.input.a aVar = new com.meituan.msc.modules.api.input.a();
        aVar.c = -1;
        View findFocus = findFocus();
        if (findFocus instanceof com.meituan.msc.modules.api.input.b) {
            com.meituan.msc.modules.api.input.b bVar = (com.meituan.msc.modules.api.input.b) findFocus;
            if (bVar.f()) {
                aVar.d = bVar.b();
                aVar.c = bVar.a();
                aVar.e = bVar.e();
                aVar.a = bVar.c();
                aVar.b = bVar.d();
                return aVar;
            }
        }
        return aVar;
    }

    @Override // com.meituan.msi.view.e
    public final boolean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7de7a791f64a37f5da27b23c8a9ade3f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7de7a791f64a37f5da27b23c8a9ade3f")).booleanValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "063d78428acdc3bf2a8183dc71f07466", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "063d78428acdc3bf2a8183dc71f07466")).booleanValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44cc1b55dc9662db50c7144f2163b851", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44cc1b55dc9662db50c7144f2163b851");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f98d846eec64912610b76e810118083", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f98d846eec64912610b76e810118083");
            return;
        }
        synchronized (this.a) {
            for (e eVar : this.a) {
                eVar.c();
            }
        }
    }
}
