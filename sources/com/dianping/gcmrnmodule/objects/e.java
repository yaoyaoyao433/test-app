package com.dianping.gcmrnmodule.objects;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.dianping.shield.dynamic.model.view.PopViewInfo;
import com.dianping.shield.dynamic.objects.DynamicModuleView;
import com.dianping.shield.dynamic.objects.DynamicModuleViewItemData;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.facebook.react.views.textinput.ReactEditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e extends DynamicModuleView {
    public static ChangeQuickRedirect a;
    public View b;
    private FrameLayout c;
    private c d;
    private a e;

    @Override // com.dianping.shield.dynamic.objects.DynamicModuleView
    public final void paintViewData(Object obj, DynamicModuleViewItemData dynamicModuleViewItemData) {
        Object[] objArr = {obj, dynamicModuleViewItemData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "291dff7a6a4fe473fd98a23c5d7282ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "291dff7a6a4fe473fd98a23c5d7282ed");
        } else if (dynamicModuleViewItemData == null || !(dynamicModuleViewItemData.viewData instanceof f)) {
        } else {
            Object viewInput = dynamicModuleViewItemData.viewData.getViewInput();
            if (viewInput instanceof c) {
                c cVar = (c) viewInput;
                com.dianping.gcmrnmodule.wrapperviews.c cVar2 = cVar.a;
                if (this.d == null || viewInput != this.d || this.c.indexOfChild(cVar2) <= 0) {
                    a(cVar2);
                    this.d = cVar;
                }
            } else if (!(viewInput instanceof a) || TextUtils.isEmpty(dynamicModuleViewItemData.reuseId)) {
            } else {
                com.dianping.gcmrnmodule.wrapperviews.reuse.c cVar3 = com.dianping.gcmrnmodule.wrapperviews.reuse.c.b;
                cVar3.a("painting rid: " + dynamicModuleViewItemData.reuseId, "Nihao12");
                ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
                if (this.e != viewInput) {
                    a aVar = (a) viewInput;
                    if (aVar.f > 0) {
                        layoutParams.height = aVar.f;
                    } else {
                        layoutParams.height = aVar.h;
                    }
                    this.c.setLayoutParams(layoutParams);
                }
                ((a) viewInput).a(this);
            }
        }
    }

    public final void a(com.dianping.gcmrnmodule.wrapperviews.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0dac28dc376404dc2059afee3d3a3f38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0dac28dc376404dc2059afee3d3a3f38");
            return;
        }
        this.c.getLayoutParams().height = -2;
        this.c.removeAllViews();
        View a2 = a((ViewGroup) cVar);
        if (cVar != null) {
            if (cVar.getParent() != null) {
                View.OnFocusChangeListener onFocusChangeListener = null;
                if (a2 != null) {
                    View.OnFocusChangeListener onFocusChangeListener2 = a2.getOnFocusChangeListener();
                    a2.setOnFocusChangeListener(null);
                    onFocusChangeListener = onFocusChangeListener2;
                }
                ((ViewGroup) cVar.getParent()).removeView(cVar);
                if (a2 != null) {
                    a2.setOnFocusChangeListener(onFocusChangeListener);
                }
            }
            this.c.addView(cVar, cVar.getWidth(), cVar.getHeight());
            if (a2 instanceof ReactEditText) {
                ((ReactEditText) a2).requestFocusFromJS();
            }
        }
    }

    public final void a(View view, int i, int i2) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5451b65f1e4ec8432ac8c9e1dcde187", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5451b65f1e4ec8432ac8c9e1dcde187");
            return;
        }
        this.b = view;
        if (this.b == null) {
            return;
        }
        this.c.getLayoutParams().height = -2;
        this.c.removeAllViews();
        this.c.addView(this.b, i, i2);
    }

    public final View a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34eac1e72f002b7287ecc75cae8a6bc3", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34eac1e72f002b7287ecc75cae8a6bc3");
        }
        View view = this.b;
        this.b = null;
        this.c.removeView(view);
        return view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    private View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b229cb2d27c6baa76b84e49e367b5ecd", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b229cb2d27c6baa76b84e49e367b5ecd");
        }
        while (viewGroup != null) {
            if (viewGroup.isFocused()) {
                return viewGroup;
            }
            viewGroup = viewGroup instanceof ViewGroup ? viewGroup.getFocusedChild() : null;
        }
        return null;
    }

    @Override // com.dianping.shield.dynamic.objects.DynamicModuleView
    public final View getModuleView() {
        return this.c;
    }

    @Override // com.dianping.shield.dynamic.objects.DynamicModuleView
    public final void createView(Object obj, Context context, @Nullable DynamicModuleViewItemData dynamicModuleViewItemData) {
        Object[] objArr = {obj, context, dynamicModuleViewItemData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f29c69fae32ab7ffe2ccf477f5dac2f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f29c69fae32ab7ffe2ccf477f5dac2f1");
            return;
        }
        if (((obj instanceof DynamicChassisInterface) && (((DynamicChassisInterface) obj).getDynamicHost() instanceof com.dianping.gcmrnmodule.hostwrapper.d)) || (dynamicModuleViewItemData != null && (dynamicModuleViewItemData.newViewInfo instanceof PopViewInfo))) {
            this.c = new MRNRootFrameLayout(context);
        } else {
            this.c = new FrameLayout(context);
        }
        this.c.setClipChildren(false);
        this.c.setClipToPadding(false);
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f67f171955cfd75b65a9c58bc8001199", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f67f171955cfd75b65a9c58bc8001199");
        } else {
            this.c.removeAllViews();
        }
    }

    public final a c() {
        return this.e;
    }

    public final void a(a aVar) {
        this.e = aVar;
    }
}
