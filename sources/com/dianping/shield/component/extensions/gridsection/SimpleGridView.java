package com.dianping.shield.component.extensions.gridsection;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.dianping.picassomodule.utils.a;
import com.dianping.shield.component.extensions.gridsection.SimpleGridView;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.node.adapter.AttachStatusCollection;
import com.dianping.shield.node.adapter.ViewLocationChangeProcessor;
import com.dianping.shield.node.adapter.status.IElementContainerExpose;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0002()B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0012H\u0016J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u001a\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0012\u0010 \u001a\u00020\u001a2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u000e\u0010!\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\"\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u000eJ(\u0010#\u001a\u00020\u001a2\u001e\u0010$\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030&0%j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030&`'H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/dianping/shield/component/extensions/gridsection/SimpleGridView;", "Landroid/widget/LinearLayout;", "Lcom/dianping/shield/node/adapter/status/IElementContainerExpose;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "attachStatusCollection", "Lcom/dianping/shield/node/adapter/AttachStatusCollection;", "onItemClickListener", "Lcom/dianping/shield/component/extensions/gridsection/SimpleGridView$OnItemClickListener;", "onItemLongClickListener", "Lcom/dianping/shield/component/extensions/gridsection/SimpleGridView$OnItemLongClickListener;", "getContainerEdgeRect", "Landroid/graphics/Rect;", "getContainerSpanCount", "", "getElementChildCount", "getElementChildLayoutPosition", "child", "Landroid/view/View;", "getElementChildView", "position", "onAppear", "", DMKeys.KEY_SCROLL_DIRECTION, "Lcom/dianping/shield/entity/ScrollDirection;", "data", "", "onDisappear", "onViewAdded", "setOnItemClickListener", "setOnItemLongClickListener", "setViewLocationProcessors", "processorList", "Ljava/util/ArrayList;", "Lcom/dianping/shield/node/adapter/ViewLocationChangeProcessor;", "Lkotlin/collections/ArrayList;", "OnItemClickListener", "OnItemLongClickListener", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class SimpleGridView extends LinearLayout implements IElementContainerExpose {
    public static ChangeQuickRedirect changeQuickRedirect;
    private HashMap _$_findViewCache;
    private final AttachStatusCollection attachStatusCollection;
    private OnItemClickListener onItemClickListener;
    private OnItemLongClickListener onItemLongClickListener;

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/dianping/shield/component/extensions/gridsection/SimpleGridView$OnItemClickListener;", "", "onItemClick", "", "position", "", Constants.EventType.VIEW, "Landroid/view/View;", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public interface OnItemClickListener {
        void onItemClick(int i, @NotNull View view);
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/dianping/shield/component/extensions/gridsection/SimpleGridView$OnItemLongClickListener;", "", "onItemLongClick", "", "position", "", Constants.EventType.VIEW, "Landroid/view/View;", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public interface OnItemLongClickListener {
        void onItemLongClick(int i, @NotNull View view);
    }

    public final void _$_clearFindViewByIdCache() {
        if (this._$_findViewCache != null) {
            this._$_findViewCache.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view == null) {
            View findViewById = findViewById(i);
            this._$_findViewCache.put(Integer.valueOf(i), findViewById);
            return findViewById;
        }
        return view;
    }

    @Override // com.dianping.shield.node.adapter.status.ElementContainerCommonInterface
    public final int getContainerSpanCount() {
        return 1;
    }

    @Override // com.dianping.shield.node.adapter.status.ElementContainerCommonInterface
    public final int getElementChildLayoutPosition(@NotNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c796726ea3b99012080fc0e8e062e55f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c796726ea3b99012080fc0e8e062e55f")).intValue();
        }
        h.b(view, "child");
        return -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleGridView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        h.b(context, "context");
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c2723cc03e09eb1587b6af36c33f5ec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c2723cc03e09eb1587b6af36c33f5ec");
            return;
        }
        AttachStatusCollection attachStatusCollection = new AttachStatusCollection();
        attachStatusCollection.setElementContainerCommonFeature(this);
        this.attachStatusCollection = attachStatusCollection;
    }

    @Override // com.dianping.shield.node.adapter.status.IElementContainerExpose
    public final void setViewLocationProcessors(@NotNull ArrayList<ViewLocationChangeProcessor<?>> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "82c7850cfcafa81820531abcbcb8e140", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "82c7850cfcafa81820531abcbcb8e140");
            return;
        }
        h.b(arrayList, "processorList");
        AttachStatusCollection attachStatusCollection = this.attachStatusCollection;
        if (attachStatusCollection != null) {
            attachStatusCollection.removeAllViewLocationProcessors();
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                attachStatusCollection.addAttStatusManager((ViewLocationChangeProcessor) it.next());
            }
        }
    }

    @Override // com.dianping.shield.node.adapter.status.ElementContainerStatusInterface
    public final void onAppear(@NotNull final ScrollDirection scrollDirection, @Nullable Object obj) {
        Object[] objArr = {scrollDirection, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f79eb883724a0b3918c3147a1f71e9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f79eb883724a0b3918c3147a1f71e9b");
            return;
        }
        h.b(scrollDirection, DMKeys.KEY_SCROLL_DIRECTION);
        post(new Runnable() { // from class: com.dianping.shield.component.extensions.gridsection.SimpleGridView$onAppear$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public final void run() {
                AttachStatusCollection attachStatusCollection;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d768d530801ee3b9defc6526e910a511", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d768d530801ee3b9defc6526e910a511");
                    return;
                }
                attachStatusCollection = SimpleGridView.this.attachStatusCollection;
                a.a(attachStatusCollection, scrollDirection, true);
            }
        });
    }

    @Override // com.dianping.shield.node.adapter.status.ElementContainerStatusInterface
    public final void onDisappear(@NotNull ScrollDirection scrollDirection, @Nullable Object obj) {
        Object[] objArr = {scrollDirection, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe00740b6cc073480b6b57cd52311971", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe00740b6cc073480b6b57cd52311971");
            return;
        }
        h.b(scrollDirection, DMKeys.KEY_SCROLL_DIRECTION);
        a.c(this.attachStatusCollection, scrollDirection);
    }

    @Override // com.dianping.shield.node.adapter.status.ElementContainerCommonInterface
    public final int getElementChildCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68528b7d2bfa2b3915e59a9dfb39b86d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68528b7d2bfa2b3915e59a9dfb39b86d")).intValue() : getChildCount();
    }

    @Override // com.dianping.shield.node.adapter.status.ElementContainerCommonInterface
    @NotNull
    public final View getElementChildView(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c81f59c89da6ee98afd67aa6367f400", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c81f59c89da6ee98afd67aa6367f400");
        }
        View childAt = getChildAt(i);
        h.a((Object) childAt, "getChildAt(position)");
        return childAt;
    }

    @Override // com.dianping.shield.node.adapter.status.ElementContainerCommonInterface
    @NotNull
    public final Rect getContainerEdgeRect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b8135c9269df7d6cbf29aca8b2ae039", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b8135c9269df7d6cbf29aca8b2ae039");
        }
        Rect rect = new Rect();
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        rect.left = iArr[0];
        rect.top = iArr[1];
        rect.right = iArr[0] + getWidth();
        rect.bottom = iArr[1] + getHeight();
        return rect;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SimpleGridView(@NotNull Context context) {
        this(context, null);
        h.b(context, "context");
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fee6d77356b87533db6d97f27265054f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fee6d77356b87533db6d97f27265054f");
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(@Nullable final View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b05614d879bb99c0bfe69b6397f975c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b05614d879bb99c0bfe69b6397f975c5");
            return;
        }
        super.onViewAdded(view);
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.dianping.shield.component.extensions.gridsection.SimpleGridView$onViewAdded$1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SimpleGridView.OnItemClickListener onItemClickListener;
                    Object[] objArr2 = {view2};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "95029cdf13964bddea25802e8ddba07f", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "95029cdf13964bddea25802e8ddba07f");
                        return;
                    }
                    onItemClickListener = SimpleGridView.this.onItemClickListener;
                    if (onItemClickListener != null) {
                        int indexOfChild = SimpleGridView.this.indexOfChild(view2);
                        h.a((Object) view2, AdvanceSetting.NETWORK_TYPE);
                        onItemClickListener.onItemClick(indexOfChild, view2);
                    }
                }
            });
        }
        if (view != null) {
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.dianping.shield.component.extensions.gridsection.SimpleGridView$onViewAdded$2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(@Nullable View view2) {
                    SimpleGridView.OnItemLongClickListener onItemLongClickListener;
                    Object[] objArr2 = {view2};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7a7eb529dcd0adafdf6f7fdb9f475f5b", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7a7eb529dcd0adafdf6f7fdb9f475f5b")).booleanValue();
                    }
                    onItemLongClickListener = SimpleGridView.this.onItemLongClickListener;
                    if (onItemLongClickListener != null) {
                        onItemLongClickListener.onItemLongClick(SimpleGridView.this.indexOfChild(view), view);
                        return true;
                    }
                    return false;
                }
            });
        }
    }

    public final void setOnItemClickListener(@NotNull OnItemClickListener onItemClickListener) {
        Object[] objArr = {onItemClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b93ccc5b829f613c8958c86f160e741", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b93ccc5b829f613c8958c86f160e741");
            return;
        }
        h.b(onItemClickListener, "onItemClickListener");
        this.onItemClickListener = onItemClickListener;
    }

    public final void setOnItemLongClickListener(@NotNull OnItemLongClickListener onItemLongClickListener) {
        Object[] objArr = {onItemLongClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24ab19587d3e06d2cc9fd1b901c165f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24ab19587d3e06d2cc9fd1b901c165f5");
            return;
        }
        h.b(onItemLongClickListener, "onItemLongClickListener");
        this.onItemLongClickListener = onItemLongClickListener;
    }
}
