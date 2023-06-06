package com.dianping.shield.sectionrecycler.itemdecoration;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.node.StaggeredGridThemePackage;
import com.dianping.shield.preload.ShieldPreloadInterface;
import com.dianping.shield.sectionrecycler.ShieldRecyclerViewInterface;
import com.huawei.hms.opendevice.c;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.k;
import kotlin.o;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002PQB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u0005H\u0002J0\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010>2\b\u0010?\u001a\u0004\u0018\u00010@2\b\u0010A\u001a\u0004\u0018\u00010B2\b\u0010C\u001a\u0004\u0018\u00010DH\u0016J\u0018\u0010E\u001a\u00020\u00052\u0006\u0010A\u001a\u00020B2\u0006\u0010F\u001a\u00020@H\u0002J!\u0010G\u001a\u00020\u00052\b\u0010H\u001a\u0004\u0018\u00010\u00052\b\u0010I\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0002\u0010JJ&\u0010K\u001a\u00020<2\b\u0010L\u001a\u0004\u0018\u00010M2\b\u0010A\u001a\u0004\u0018\u00010B2\b\u0010C\u001a\u0004\u0018\u00010DH\u0016J\b\u0010N\u001a\u00020<H\u0016J\b\u0010O\u001a\u00020<H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0007\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017RF\u0010\u0018\u001a.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u001a\u0018\u00010\u0019j\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u001a\u0018\u0001`\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0007\"\u0004\b\"\u0010\u0011R\u001a\u0010#\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0007\"\u0004\b%\u0010\u0011R\u001a\u0010&\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0007\"\u0004\b(\u0010\u0011R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0007\"\u0004\b1\u0010\u0011R\u001a\u00102\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0007\"\u0004\b4\u0010\u0011R\u001a\u00105\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0007\"\u0004\b7\u0010\u0011¨\u0006R"}, d2 = {"Lcom/dianping/shield/sectionrecycler/itemdecoration/StaggeredGridSpaceDecoration;", "Landroid/support/v7/widget/RecyclerView$ItemDecoration;", "Lcom/dianping/shield/preload/ShieldPreloadInterface;", "()V", "NOT_DEFINED", "", "getNOT_DEFINED", "()I", "backgroundPaint", "Landroid/graphics/Paint;", "getBackgroundPaint", "()Landroid/graphics/Paint;", "setBackgroundPaint", "(Landroid/graphics/Paint;)V", DMKeys.KEY_MARGIN_BOTTOM_MARGIN, "getBottomMargin", "setBottomMargin", "(I)V", "gapProvider", "Lcom/dianping/shield/sectionrecycler/itemdecoration/StaggeredGridSpaceDecoration$GapProvider;", "getGapProvider", "()Lcom/dianping/shield/sectionrecycler/itemdecoration/StaggeredGridSpaceDecoration$GapProvider;", "setGapProvider", "(Lcom/dianping/shield/sectionrecycler/itemdecoration/StaggeredGridSpaceDecoration$GapProvider;)V", "itemLeftAndRightOffset", "Ljava/util/ArrayList;", "Lkotlin/Pair;", "Lkotlin/collections/ArrayList;", "getItemLeftAndRightOffset", "()Ljava/util/ArrayList;", "setItemLeftAndRightOffset", "(Ljava/util/ArrayList;)V", "leftMargin", "getLeftMargin", "setLeftMargin", "rightMargin", "getRightMargin", "setRightMargin", "screenWidth", "getScreenWidth", "setScreenWidth", "staggeredGridThemePackage", "Lcom/dianping/shield/node/StaggeredGridThemePackage;", "getStaggeredGridThemePackage", "()Lcom/dianping/shield/node/StaggeredGridThemePackage;", "setStaggeredGridThemePackage", "(Lcom/dianping/shield/node/StaggeredGridThemePackage;)V", DMKeys.KEY_MARGIN_TOP_MARGIN, "getTopMargin", "setTopMargin", DMKeys.KEY_XGAP, "getXGap", "setXGap", DMKeys.KEY_YGAP, "getYGap", "setYGap", "getGapParams", "Lcom/dianping/shield/sectionrecycler/itemdecoration/StaggeredGridSpaceDecoration$GapParams;", "position", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", Constants.EventType.VIEW, "Landroid/view/View;", "parent", "Landroid/support/v7/widget/RecyclerView;", "state", "Landroid/support/v7/widget/RecyclerView$State;", "getShieldPosition", "child", "getValue", "value", "defaultValue", "(Ljava/lang/Integer;Ljava/lang/Integer;)I", "onDraw", c.a, "Landroid/graphics/Canvas;", "shieldPreload", "shieldRecycle", "GapParams", "GapProvider", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class StaggeredGridSpaceDecoration extends RecyclerView.f implements ShieldPreloadInterface {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final int NOT_DEFINED;
    @Nullable
    private Paint backgroundPaint;
    private int bottomMargin;
    @Nullable
    private GapProvider gapProvider;
    @Nullable
    private ArrayList<k<Integer, Integer>> itemLeftAndRightOffset;
    private int leftMargin;
    private int rightMargin;
    private int screenWidth;
    @Nullable
    private StaggeredGridThemePackage staggeredGridThemePackage;
    private int topMargin;
    private int xGap;
    private int yGap;

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&¨\u0006\n"}, d2 = {"Lcom/dianping/shield/sectionrecycler/itemdecoration/StaggeredGridSpaceDecoration$GapProvider;", "", "getBottomMargin", "", "position", "getLeftMargin", "getRightMargin", "getTopMargin", "getXGap", "getYGap", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public interface GapProvider {
        int getBottomMargin(int i);

        int getLeftMargin(int i);

        int getRightMargin(int i);

        int getTopMargin(int i);

        int getXGap(int i);

        int getYGap(int i);
    }

    @Override // com.dianping.shield.preload.ShieldPreloadInterface
    public final void shieldPreload() {
    }

    public StaggeredGridSpaceDecoration() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4f0c06bcc2d30f1897b8e999274cd55", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4f0c06bcc2d30f1897b8e999274cd55");
            return;
        }
        this.staggeredGridThemePackage = new StaggeredGridThemePackage();
        this.NOT_DEFINED = -1;
        this.xGap = this.NOT_DEFINED;
        this.yGap = this.NOT_DEFINED;
        this.leftMargin = this.NOT_DEFINED;
        this.rightMargin = this.NOT_DEFINED;
        this.topMargin = this.NOT_DEFINED;
        this.bottomMargin = this.NOT_DEFINED;
        this.screenWidth = this.NOT_DEFINED;
    }

    @Nullable
    public final StaggeredGridThemePackage getStaggeredGridThemePackage() {
        return this.staggeredGridThemePackage;
    }

    public final void setStaggeredGridThemePackage(@Nullable StaggeredGridThemePackage staggeredGridThemePackage) {
        this.staggeredGridThemePackage = staggeredGridThemePackage;
    }

    public final int getNOT_DEFINED() {
        return this.NOT_DEFINED;
    }

    public final int getXGap() {
        return this.xGap;
    }

    public final void setXGap(int i) {
        this.xGap = i;
    }

    public final int getYGap() {
        return this.yGap;
    }

    public final void setYGap(int i) {
        this.yGap = i;
    }

    @Nullable
    public final GapProvider getGapProvider() {
        return this.gapProvider;
    }

    public final void setGapProvider(@Nullable GapProvider gapProvider) {
        this.gapProvider = gapProvider;
    }

    public final int getLeftMargin() {
        return this.leftMargin;
    }

    public final void setLeftMargin(int i) {
        this.leftMargin = i;
    }

    public final int getRightMargin() {
        return this.rightMargin;
    }

    public final void setRightMargin(int i) {
        this.rightMargin = i;
    }

    public final int getTopMargin() {
        return this.topMargin;
    }

    public final void setTopMargin(int i) {
        this.topMargin = i;
    }

    public final int getBottomMargin() {
        return this.bottomMargin;
    }

    public final void setBottomMargin(int i) {
        this.bottomMargin = i;
    }

    @Nullable
    public final ArrayList<k<Integer, Integer>> getItemLeftAndRightOffset() {
        return this.itemLeftAndRightOffset;
    }

    public final void setItemLeftAndRightOffset(@Nullable ArrayList<k<Integer, Integer>> arrayList) {
        this.itemLeftAndRightOffset = arrayList;
    }

    @Nullable
    public final Paint getBackgroundPaint() {
        return this.backgroundPaint;
    }

    public final void setBackgroundPaint(@Nullable Paint paint) {
        this.backgroundPaint = paint;
    }

    public final int getScreenWidth() {
        return this.screenWidth;
    }

    public final void setScreenWidth(int i) {
        this.screenWidth = i;
    }

    @Override // com.dianping.shield.preload.ShieldPreloadInterface
    public final void shieldRecycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3de37d90df93fc246d1225c02ccffe54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3de37d90df93fc246d1225c02ccffe54");
            return;
        }
        StaggeredGridThemePackage staggeredGridThemePackage = this.staggeredGridThemePackage;
        if (staggeredGridThemePackage != null) {
            staggeredGridThemePackage.reset();
        }
        this.xGap = this.NOT_DEFINED;
        this.yGap = this.NOT_DEFINED;
        this.gapProvider = null;
        this.leftMargin = this.NOT_DEFINED;
        this.rightMargin = this.NOT_DEFINED;
        this.topMargin = this.NOT_DEFINED;
        this.bottomMargin = this.NOT_DEFINED;
        ArrayList<k<Integer, Integer>> arrayList = this.itemLeftAndRightOffset;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.backgroundPaint = null;
        this.screenWidth = this.NOT_DEFINED;
    }

    @Override // android.support.v7.widget.RecyclerView.f
    public final void getItemOffsets(@Nullable Rect rect, @Nullable View view, @Nullable RecyclerView recyclerView, @Nullable RecyclerView.State state) {
        int childAdapterPosition;
        Integer num;
        Integer num2;
        int i = 0;
        Object[] objArr = {rect, view, recyclerView, state};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a489e6d871440c8eabaad22b74c62aad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a489e6d871440c8eabaad22b74c62aad");
            return;
        }
        super.getItemOffsets(rect, view, recyclerView, state);
        if ((recyclerView != null ? recyclerView.getLayoutManager() : null) instanceof StaggeredGridLayoutManager) {
            ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
            if (layoutParams == null) {
                throw new o("null cannot be cast to non-null type android.support.v7.widget.StaggeredGridLayoutManager.LayoutParams");
            }
            StaggeredGridLayoutManager.b bVar = (StaggeredGridLayoutManager.b) layoutParams;
            if (bVar.a()) {
                return;
            }
            if (recyclerView instanceof ShieldRecyclerViewInterface) {
                childAdapterPosition = ((ShieldRecyclerViewInterface) recyclerView).getShieldChildAdapterPosition(view);
            } else {
                childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            }
            if (rect != null) {
                int b = bVar.b();
                ArrayList<k<Integer, Integer>> arrayList = this.itemLeftAndRightOffset;
                k<Integer, Integer> kVar = arrayList != null ? arrayList.get(b) : null;
                rect.left = (kVar == null || (num2 = kVar.a) == null) ? 0 : num2.intValue();
                if (kVar != null && (num = kVar.b) != null) {
                    i = num.intValue();
                }
                rect.right = i;
                if (childAdapterPosition >= 0) {
                    rect.bottom = getGapParams(childAdapterPosition).getBottomMargin() > 0 ? getGapParams(childAdapterPosition).getBottomMargin() : getGapParams(childAdapterPosition).getYGap();
                    rect.top += getGapParams(childAdapterPosition).getTopMargin();
                    return;
                }
                Integer valueOf = Integer.valueOf(this.bottomMargin);
                StaggeredGridThemePackage staggeredGridThemePackage = this.staggeredGridThemePackage;
                rect.bottom = getValue(valueOf, staggeredGridThemePackage != null ? Integer.valueOf(staggeredGridThemePackage.defaultStaggeredBottomMargin) : null);
                Integer valueOf2 = Integer.valueOf(this.topMargin);
                StaggeredGridThemePackage staggeredGridThemePackage2 = this.staggeredGridThemePackage;
                rect.top = getValue(valueOf2, staggeredGridThemePackage2 != null ? Integer.valueOf(staggeredGridThemePackage2.defaultStaggeredTopMargin) : null);
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.f
    public final void onDraw(@Nullable Canvas canvas, @Nullable RecyclerView recyclerView, @Nullable RecyclerView.State state) {
        Object[] objArr = {canvas, recyclerView, state};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4127e85763f5a73340dccc44d3da8fcf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4127e85763f5a73340dccc44d3da8fcf");
            return;
        }
        super.onDraw(canvas, recyclerView, state);
        if (!((recyclerView != null ? recyclerView.getLayoutManager() : null) instanceof StaggeredGridLayoutManager) || this.backgroundPaint == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            h.a((Object) childAt, "childView");
            int shieldPosition = getShieldPosition(recyclerView, childAt);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams == null) {
                throw new o("null cannot be cast to non-null type android.support.v7.widget.StaggeredGridLayoutManager.LayoutParams");
            }
            StaggeredGridLayoutManager.b bVar = (StaggeredGridLayoutManager.b) layoutParams;
            if (shieldPosition >= 0 && !bVar.a()) {
                arrayList.add(childAt);
            }
        }
        if (arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.size() > 1) {
            kotlin.collections.h.a((List) arrayList2, new Comparator<T>() { // from class: com.dianping.shield.sectionrecycler.itemdecoration.StaggeredGridSpaceDecoration$onDraw$$inlined$sortBy$1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    Object[] objArr2 = {t, t2};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8420301bcff599e81e75c38ef7f152fa", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8420301bcff599e81e75c38ef7f152fa")).intValue();
                    }
                    Integer valueOf = Integer.valueOf(((View) t).getBottom());
                    Integer valueOf2 = Integer.valueOf(((View) t2).getBottom());
                    if (valueOf == valueOf2) {
                        return 0;
                    }
                    if (valueOf == null) {
                        return -1;
                    }
                    if (valueOf2 == null) {
                        return 1;
                    }
                    return valueOf.compareTo(valueOf2);
                }
            });
        }
        Object obj = arrayList.get(0);
        h.a(obj, "childViewList[0]");
        View view = (View) obj;
        int shieldPosition2 = getShieldPosition(recyclerView, view);
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            throw new o("null cannot be cast to non-null type android.support.v7.widget.RecyclerView.LayoutParams");
        }
        RecyclerView.g gVar = (RecyclerView.g) layoutParams2;
        Object obj2 = arrayList.get(arrayList.size() - 1);
        h.a(obj2, "childViewList[childViewList.size-1]");
        View view2 = (View) obj2;
        int shieldPosition3 = getShieldPosition(recyclerView, view2);
        ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
        if (layoutParams3 == null) {
            throw new o("null cannot be cast to non-null type android.support.v7.widget.RecyclerView.LayoutParams");
        }
        RecyclerView.g gVar2 = (RecyclerView.g) layoutParams3;
        int top = (view.getTop() - gVar.topMargin) - getGapParams(shieldPosition2).getTopMargin();
        int bottom = view2.getBottom() + gVar2.bottomMargin + (getGapParams(shieldPosition3).getBottomMargin() > 0 ? getGapParams(shieldPosition3).getBottomMargin() : getGapParams(shieldPosition3).getYGap());
        int i2 = this.screenWidth != this.NOT_DEFINED ? this.screenWidth : 0;
        if (canvas != null) {
            canvas.drawRect(0.0f, top, i2, bottom, this.backgroundPaint);
        }
    }

    private final int getShieldPosition(RecyclerView recyclerView, View view) {
        Object[] objArr = {recyclerView, view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3bff90bbda00514239e02c5590dca822", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3bff90bbda00514239e02c5590dca822")).intValue();
        }
        if (recyclerView instanceof ShieldRecyclerViewInterface) {
            return ((ShieldRecyclerViewInterface) recyclerView).getShieldChildAdapterPosition(view);
        }
        return recyclerView.getChildAdapterPosition(view);
    }

    private final GapParams getGapParams(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a08aa2b5ae23d49b995b5ff275b046aa", RobustBitConfig.DEFAULT_VALUE)) {
            return (GapParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a08aa2b5ae23d49b995b5ff275b046aa");
        }
        if (this.gapProvider != null) {
            GapProvider gapProvider = this.gapProvider;
            Integer valueOf = gapProvider != null ? Integer.valueOf(gapProvider.getXGap(i)) : null;
            StaggeredGridThemePackage staggeredGridThemePackage = this.staggeredGridThemePackage;
            int value = getValue(valueOf, staggeredGridThemePackage != null ? Integer.valueOf(staggeredGridThemePackage.defaultXStaggeredGridGap) : null);
            GapProvider gapProvider2 = this.gapProvider;
            Integer valueOf2 = gapProvider2 != null ? Integer.valueOf(gapProvider2.getYGap(i)) : null;
            StaggeredGridThemePackage staggeredGridThemePackage2 = this.staggeredGridThemePackage;
            int value2 = getValue(valueOf2, staggeredGridThemePackage2 != null ? Integer.valueOf(staggeredGridThemePackage2.defaultYStaggeredGridGap) : null);
            GapProvider gapProvider3 = this.gapProvider;
            Integer valueOf3 = gapProvider3 != null ? Integer.valueOf(gapProvider3.getLeftMargin(i)) : null;
            StaggeredGridThemePackage staggeredGridThemePackage3 = this.staggeredGridThemePackage;
            int value3 = getValue(valueOf3, staggeredGridThemePackage3 != null ? Integer.valueOf(staggeredGridThemePackage3.defaultStaggeredLeftMargin) : null);
            GapProvider gapProvider4 = this.gapProvider;
            Integer valueOf4 = gapProvider4 != null ? Integer.valueOf(gapProvider4.getRightMargin(i)) : null;
            StaggeredGridThemePackage staggeredGridThemePackage4 = this.staggeredGridThemePackage;
            int value4 = getValue(valueOf4, staggeredGridThemePackage4 != null ? Integer.valueOf(staggeredGridThemePackage4.defaultStaggeredRightMargin) : null);
            GapProvider gapProvider5 = this.gapProvider;
            Integer valueOf5 = gapProvider5 != null ? Integer.valueOf(gapProvider5.getTopMargin(i)) : null;
            StaggeredGridThemePackage staggeredGridThemePackage5 = this.staggeredGridThemePackage;
            int value5 = getValue(valueOf5, staggeredGridThemePackage5 != null ? Integer.valueOf(staggeredGridThemePackage5.defaultStaggeredTopMargin) : null);
            GapProvider gapProvider6 = this.gapProvider;
            Integer valueOf6 = gapProvider6 != null ? Integer.valueOf(gapProvider6.getBottomMargin(i)) : null;
            StaggeredGridThemePackage staggeredGridThemePackage6 = this.staggeredGridThemePackage;
            return new GapParams(value, value2, value3, value4, value5, getValue(valueOf6, staggeredGridThemePackage6 != null ? Integer.valueOf(staggeredGridThemePackage6.defaultStaggeredBottomMargin) : null));
        }
        Integer valueOf7 = Integer.valueOf(this.xGap);
        StaggeredGridThemePackage staggeredGridThemePackage7 = this.staggeredGridThemePackage;
        int value6 = getValue(valueOf7, staggeredGridThemePackage7 != null ? Integer.valueOf(staggeredGridThemePackage7.defaultYStaggeredGridGap) : null);
        Integer valueOf8 = Integer.valueOf(this.yGap);
        StaggeredGridThemePackage staggeredGridThemePackage8 = this.staggeredGridThemePackage;
        int value7 = getValue(valueOf8, staggeredGridThemePackage8 != null ? Integer.valueOf(staggeredGridThemePackage8.defaultYStaggeredGridGap) : null);
        Integer valueOf9 = Integer.valueOf(this.leftMargin);
        StaggeredGridThemePackage staggeredGridThemePackage9 = this.staggeredGridThemePackage;
        int value8 = getValue(valueOf9, staggeredGridThemePackage9 != null ? Integer.valueOf(staggeredGridThemePackage9.defaultStaggeredLeftMargin) : null);
        Integer valueOf10 = Integer.valueOf(this.rightMargin);
        StaggeredGridThemePackage staggeredGridThemePackage10 = this.staggeredGridThemePackage;
        int value9 = getValue(valueOf10, staggeredGridThemePackage10 != null ? Integer.valueOf(staggeredGridThemePackage10.defaultStaggeredRightMargin) : null);
        Integer valueOf11 = Integer.valueOf(this.topMargin);
        StaggeredGridThemePackage staggeredGridThemePackage11 = this.staggeredGridThemePackage;
        int value10 = getValue(valueOf11, staggeredGridThemePackage11 != null ? Integer.valueOf(staggeredGridThemePackage11.defaultStaggeredTopMargin) : null);
        Integer valueOf12 = Integer.valueOf(this.bottomMargin);
        StaggeredGridThemePackage staggeredGridThemePackage12 = this.staggeredGridThemePackage;
        return new GapParams(value6, value7, value8, value9, value10, getValue(valueOf12, staggeredGridThemePackage12 != null ? Integer.valueOf(staggeredGridThemePackage12.defaultStaggeredBottomMargin) : null));
    }

    private final int getValue(Integer num, Integer num2) {
        Object[] objArr = {num, num2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "230382582de623e2f474781dfd157c62", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "230382582de623e2f474781dfd157c62")).intValue();
        }
        if (num == null || num.intValue() < 0) {
            if (num2 != null) {
                return num2.intValue();
            }
            return 0;
        }
        return num.intValue();
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/dianping/shield/sectionrecycler/itemdecoration/StaggeredGridSpaceDecoration$GapParams;", "", DMKeys.KEY_XGAP, "", DMKeys.KEY_YGAP, "leftMargin", "rightMargin", DMKeys.KEY_MARGIN_TOP_MARGIN, DMKeys.KEY_MARGIN_BOTTOM_MARGIN, "(IIIIII)V", "getBottomMargin", "()I", "getLeftMargin", "getRightMargin", "getTopMargin", "getXGap", "getYGap", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class GapParams {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final int bottomMargin;
        private final int leftMargin;
        private final int rightMargin;
        private final int topMargin;
        private final int xGap;
        private final int yGap;

        public GapParams(int i, int i2, int i3, int i4, int i5, int i6) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28d133ac01ac418b6b2e806840bccb2c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28d133ac01ac418b6b2e806840bccb2c");
                return;
            }
            this.xGap = i;
            this.yGap = i2;
            this.leftMargin = i3;
            this.rightMargin = i4;
            this.topMargin = i5;
            this.bottomMargin = i6;
        }

        public final int getLeftMargin() {
            return this.leftMargin;
        }

        public final int getXGap() {
            return this.xGap;
        }

        public final int getYGap() {
            return this.yGap;
        }

        public final int getRightMargin() {
            return this.rightMargin;
        }

        public final int getTopMargin() {
            return this.topMargin;
        }

        public final int getBottomMargin() {
            return this.bottomMargin;
        }
    }
}
