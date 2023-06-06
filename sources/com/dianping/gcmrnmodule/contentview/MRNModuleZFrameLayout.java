package com.dianping.gcmrnmodule.contentview;

import android.content.Context;
import android.util.AttributeSet;
import com.dianping.shield.layoutcontrol.ZFrameLayout;
import com.facebook.react.uimanager.ai;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0014J\b\u0010\u0013\u001a\u00020\rH\u0016R\u000e\u0010\n\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/dianping/gcmrnmodule/contentview/MRNModuleZFrameLayout;", "Lcom/dianping/shield/layoutcontrol/ZFrameLayout;", "Lcom/facebook/react/uimanager/ReactZIndexedViewGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "oldHeightMeasureSpec", "oldWidthMeasureSpec", "forceMeasure", "", "getZIndexMappedChildIndex", "index", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "updateDrawingOrder", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class MRNModuleZFrameLayout extends ZFrameLayout implements ai {
    public static ChangeQuickRedirect a;
    private int b;
    private int c;

    @JvmOverloads
    public MRNModuleZFrameLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc624ca484dbf03535a9215368a13b7f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc624ca484dbf03535a9215368a13b7f");
        }
    }

    @JvmOverloads
    public MRNModuleZFrameLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31024587308975f02f1974e51b782d28", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31024587308975f02f1974e51b782d28");
        }
    }

    @Override // com.facebook.react.uimanager.ai
    public final void updateDrawingOrder() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MRNModuleZFrameLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.b(context, "context");
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c11ac08eb11b35d4f475d4fe79ead46e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c11ac08eb11b35d4f475d4fe79ead46e");
            return;
        }
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
    }

    public /* synthetic */ MRNModuleZFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // com.facebook.react.uimanager.ai
    public final int getZIndexMappedChildIndex(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51eac9d0eabc6bbc370b2b6df339b604", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51eac9d0eabc6bbc370b2b6df339b604")).intValue() : getChildDrawingOrder(getChildCount(), i);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3298b064d54b81698ecfb140eb8fd287", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3298b064d54b81698ecfb140eb8fd287");
            return;
        }
        super.onMeasure(i, i2);
        this.b = i;
        this.c = i2;
    }

    @Override // com.dianping.shield.layoutcontrol.ZFrameLayout, com.dianping.shield.layoutcontrol.IZViewContainer
    public final void forceMeasure() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3be3a1e3c2bbf14c1effb656cb51873a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3be3a1e3c2bbf14c1effb656cb51873a");
        } else {
            measure(this.b, this.c);
        }
    }
}
