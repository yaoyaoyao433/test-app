package com.dianping.picassomodule.widget.scroll;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.dianping.picassomodule.widget.scroll.ScrollView;
import com.dianping.picassomodule.widget.scroll.pager.LoopLayoutManager;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000{\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\r*\u0001\r\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\u0010H\u0016J\b\u0010.\u001a\u00020\u0010H\u0016J\u0010\u0010/\u001a\u00020\t2\u0006\u0010-\u001a\u00020\u0010H\u0016J\n\u00100\u001a\u0004\u0018\u00010!H\u0002J\b\u00101\u001a\u00020\u0010H\u0016J\b\u00102\u001a\u00020\u0010H\u0016J\u001c\u00102\u001a\u00020\u00102\b\u00103\u001a\u0004\u0018\u00010\t2\b\u00104\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u00105\u001a\u000206H\u0016J\n\u00107\u001a\u0004\u0018\u00010!H\u0002J\b\u00108\u001a\u00020\u000bH\u0002J\b\u00109\u001a\u00020\u000bH\u0002J \u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u000b2\u000e\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010>H\u0016J\u0018\u0010?\u001a\u00020;2\u0006\u0010@\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020\u0010H\u0016J\u0010\u0010B\u001a\u00020;2\u0006\u0010\u0018\u001a\u00020\u000bH\u0016J\u0010\u0010C\u001a\u00020;2\u0006\u0010\u0016\u001a\u00020\u0010H\u0016J\u0018\u0010D\u001a\u00020;2\u0006\u0010*\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u0010H\u0016J\u0010\u0010E\u001a\u00020;2\u0006\u0010\u0017\u001a\u00020\u000bH\u0016J\u0010\u0010F\u001a\u00020;2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010G\u001a\u00020;2\u0006\u0010H\u001a\u00020\u0010H\u0016J\b\u0010I\u001a\u00020;H\u0002J\u0010\u0010J\u001a\u00020;2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010K\u001a\u00020;2\u0006\u0010(\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010L\u001a\u00020;2\u0006\u00108\u001a\u00020\u000bH\u0016J(\u0010M\u001a\u00020;2\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u0010H\u0016J\u0010\u0010N\u001a\u00020;2\u0006\u0010O\u001a\u00020PH\u0016J\u0010\u0010Q\u001a\u00020;2\u0006\u0010R\u001a\u00020\u0010H\u0002J\u0010\u0010S\u001a\u00020;2\u0006\u0010T\u001a\u00020\u000bH\u0016J\u0010\u0010U\u001a\u00020;2\u0006\u0010V\u001a\u00020\u0010H\u0016J\u0010\u0010W\u001a\u00020;2\u0006\u00109\u001a\u00020\u000bH\u0016J\u0019\u0010X\u001a\u00020;*\u0002062\u0006\u0010Y\u001a\u00020\u0010H\u0000¢\u0006\u0002\bZJ\u0019\u0010[\u001a\u00020;*\u0002062\u0006\u0010Y\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\\R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u000e\u0010(\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006]"}, d2 = {"Lcom/dianping/picassomodule/widget/scroll/PageModeStrategy;", "Lcom/dianping/picassomodule/widget/scroll/ScrollStyleEventStrategy;", "context", "Landroid/content/Context;", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "(Landroid/content/Context;Landroid/support/v7/widget/RecyclerView;)V", "addedItemViewMap", "Landroid/util/SparseArray;", "Landroid/view/View;", "autoHeight", "", "autoHeightChangeListener", "com/dianping/picassomodule/widget/scroll/PageModeStrategy$autoHeightChangeListener$1", "Lcom/dianping/picassomodule/widget/scroll/PageModeStrategy$autoHeightChangeListener$1;", DMKeys.KEY_COLCOUNT, "", "getContext", "()Landroid/content/Context;", "countPerPage", "fullHeights", "Ljava/util/ArrayList;", DMKeys.KEY_SCROLL_GALLERY_GAP, "hasAttachView", "isGallery", "itemClickListener", "Lcom/dianping/picassomodule/widget/scroll/OnItemClickListener;", "itemViewAdapter", "Lcom/dianping/picassomodule/widget/scroll/ScrollView$ScrollAdapter;", "loopLayoutManager", "Lcom/dianping/picassomodule/widget/scroll/pager/LoopLayoutManager;", "paddingBottom", "paddingDecoration", "Landroid/support/v7/widget/RecyclerView$ItemDecoration;", "paddingLeft", "paddingRight", "paddingTop", "pageCount", "getRecyclerView", "()Landroid/support/v7/widget/RecyclerView;", DMKeys.KEY_ROWCOUNT, "totalCount", DMKeys.KEY_XGAP, DMKeys.KEY_YGAP, "createItemView", "position", "getElementChildCount", "getElementChildView", "getGalleryPageGapDecoration", "getItemCount", "getItemGap", Constants.EventType.VIEW, "parent", "getPadding", "Landroid/graphics/Rect;", "getPageScrollPaddingDecoration", "isLoop", "isVertical", "setAutoHeight", "", "isAutoHeight", "heightList", "", "setAutoPlay", "isAutoPlay", "timeInterval", "setGallery", "setGalleryGap", "setGap", "setHasAttachView", "setItemClickListener", "setItemCount", "itemCount", "setItemPaddingDecoration", "setItemViewAdapter", "setLayoutConfig", "setLoop", "setPadding", "setPageSelectedListener", "onPageSelectedListener", "Lcom/dianping/picassomodule/widget/scroll/pager/OnPageSelectedListener;", "setPagerHeight", "height", "setScrollEnable", "scrollEnable", "setSelectedIndex", "selectedIndex", "setVertical", "bisectHorizontal", "value", "bisectHorizontal$shieldComponent_release", "bisectVertical", "bisectVertical$shieldComponent_release", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class c implements d {
    public static ChangeQuickRedirect a;
    boolean b;
    boolean c;
    final ArrayList<Integer> d;
    int e;
    int f;
    int g;
    int h;
    int i;
    com.dianping.picassomodule.widget.scroll.b j;
    @NotNull
    final RecyclerView k;
    private int l;
    private boolean m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private LoopLayoutManager t;
    private RecyclerView.f u;
    private ScrollView.f v;
    private final SparseArray<View> w;
    private final PageModeStrategy$autoHeightChangeListener$1 x;
    @NotNull
    private final Context y;

    @Override // com.dianping.picassomodule.widget.scroll.d
    public final void c(int i) {
    }

    /* JADX WARN: Type inference failed for: r13v3, types: [com.dianping.picassomodule.widget.scroll.PageModeStrategy$autoHeightChangeListener$1] */
    public c(@NotNull Context context, @NotNull RecyclerView recyclerView) {
        h.b(context, "context");
        h.b(recyclerView, "recyclerView");
        Object[] objArr = {context, recyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50c15f6855e2a846cd2d323bb80703b4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50c15f6855e2a846cd2d323bb80703b4");
            return;
        }
        this.y = context;
        this.k = recyclerView;
        this.d = new ArrayList<>();
        this.p = 1;
        this.q = 1;
        this.w = new SparseArray<>();
        this.x = new ViewPager.OnPageChangeListener() { // from class: com.dianping.picassomodule.widget.scroll.PageModeStrategy$autoHeightChangeListener$1
            public static ChangeQuickRedirect a;

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public final void onPageScrollStateChanged(int i) {
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public final void onPageSelected(int i) {
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public final void onPageScrolled(int i, float f, int i2) {
                Object[] objArr2 = {Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aa9e039971809f2adb329d7965ca8090", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aa9e039971809f2adb329d7965ca8090");
                } else if (!c.this.c || i == c.this.d.size() - 1 || c.this.d.size() == 0) {
                } else {
                    Integer num = c.this.d.get(i);
                    float intValue = ((num != null && num.intValue() == 0) ? c.this.d.get(0) : c.this.d.get(i)).intValue() * (1.0f - f);
                    int i3 = i + 1;
                    Integer num2 = c.this.d.get(i3);
                    int intValue2 = (int) (intValue + (((num2 != null && num2.intValue() == 0) ? c.this.d.get(0) : c.this.d.get(i3)).intValue() * f));
                    c cVar = c.this;
                    Object[] objArr3 = {Integer.valueOf(intValue2)};
                    ChangeQuickRedirect changeQuickRedirect3 = c.a;
                    if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "f23132c27d5cccc698abf71145d55215", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "f23132c27d5cccc698abf71145d55215");
                        return;
                    }
                    ViewGroup.LayoutParams layoutParams = cVar.k.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
                        layoutParams.height = intValue2;
                        cVar.k.requestLayout();
                    }
                }
            }
        };
        this.t = new LoopLayoutManager(this.y);
        this.k.setLayoutManager(this.t);
    }

    public static final /* synthetic */ boolean a(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "797b8587c4d92217a23eeed1b38233ba", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "797b8587c4d92217a23eeed1b38233ba")).booleanValue();
        }
        LoopLayoutManager loopLayoutManager = cVar.t;
        return loopLayoutManager != null && loopLayoutManager.i;
    }

    @Override // com.dianping.picassomodule.widget.scroll.d
    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e3a0bc11ee6404f500dff47bb5eab46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e3a0bc11ee6404f500dff47bb5eab46");
            return;
        }
        LoopLayoutManager loopLayoutManager = this.t;
        if (loopLayoutManager != null) {
            loopLayoutManager.l = z;
        }
    }

    @Override // com.dianping.picassomodule.widget.scroll.d
    public final void a(boolean z, int i) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fe8d883a12dc921dbe4e31d3741b62b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fe8d883a12dc921dbe4e31d3741b62b");
            return;
        }
        LoopLayoutManager loopLayoutManager = this.t;
        if (loopLayoutManager != null) {
            Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = LoopLayoutManager.a;
            if (PatchProxy.isSupport(objArr2, loopLayoutManager, changeQuickRedirect2, false, "055e8784fc441cd65983f115a82b6b6b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, loopLayoutManager, changeQuickRedirect2, false, "055e8784fc441cd65983f115a82b6b6b");
            } else if (i > 0) {
                loopLayoutManager.b = i;
                loopLayoutManager.c = z;
                loopLayoutManager.a();
            }
        }
    }

    @Override // com.dianping.picassomodule.widget.scroll.d
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4eb0b5d26cca90881b6c1d12726e6784", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4eb0b5d26cca90881b6c1d12726e6784");
            return;
        }
        LoopLayoutManager loopLayoutManager = this.t;
        if (loopLayoutManager != null) {
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = LoopLayoutManager.a;
            if (PatchProxy.isSupport(objArr2, loopLayoutManager, changeQuickRedirect2, false, "db1d9dae22d008c8b24a1d1a97676482", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, loopLayoutManager, changeQuickRedirect2, false, "db1d9dae22d008c8b24a1d1a97676482");
                return;
            }
            loopLayoutManager.h = com.dianping.picassomodule.widget.scroll.pager.c.UPDATE_PROPS;
            if (loopLayoutManager.g != null) {
                RecyclerView recyclerView = loopLayoutManager.g;
                if (recyclerView == null) {
                    h.a();
                }
                loopLayoutManager.smoothScrollToPosition(recyclerView, null, i);
            }
        }
    }

    @Override // com.dianping.picassomodule.widget.scroll.d
    public final void a(@NotNull com.dianping.picassomodule.widget.scroll.pager.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86bfe2f13718e3b5b720d605fb87f886", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86bfe2f13718e3b5b720d605fb87f886");
            return;
        }
        h.b(bVar, "onPageSelectedListener");
        LoopLayoutManager loopLayoutManager = this.t;
        if (loopLayoutManager != null) {
            Object[] objArr2 = {bVar};
            ChangeQuickRedirect changeQuickRedirect2 = LoopLayoutManager.a;
            if (PatchProxy.isSupport(objArr2, loopLayoutManager, changeQuickRedirect2, false, "9f6a89f16b8893c59c5d9863b07e0806", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, loopLayoutManager, changeQuickRedirect2, false, "9f6a89f16b8893c59c5d9863b07e0806");
                return;
            }
            h.b(bVar, "onPageSelectedListener");
            loopLayoutManager.f = bVar;
        }
    }

    @Override // com.dianping.picassomodule.widget.scroll.d
    public final void a(boolean z, @Nullable List<Integer> list) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09f1d521f0a8772556edae00d450596a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09f1d521f0a8772556edae00d450596a");
            return;
        }
        this.c = z;
        if (list == null || !z) {
            return;
        }
        this.d.clear();
        this.d.addAll(list);
        LoopLayoutManager loopLayoutManager = this.t;
        if (loopLayoutManager != null) {
            PageModeStrategy$autoHeightChangeListener$1 pageModeStrategy$autoHeightChangeListener$1 = this.x;
            Object[] objArr2 = {pageModeStrategy$autoHeightChangeListener$1};
            ChangeQuickRedirect changeQuickRedirect2 = LoopLayoutManager.a;
            if (PatchProxy.isSupport(objArr2, loopLayoutManager, changeQuickRedirect2, false, "ab63a43c145b0a470f0990649689cbd2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, loopLayoutManager, changeQuickRedirect2, false, "ab63a43c145b0a470f0990649689cbd2");
                return;
            }
            h.b(pageModeStrategy$autoHeightChangeListener$1, "l");
            if (loopLayoutManager.e.contains(pageModeStrategy$autoHeightChangeListener$1)) {
                return;
            }
            loopLayoutManager.e.add(pageModeStrategy$autoHeightChangeListener$1);
        }
    }

    @Override // com.dianping.picassomodule.widget.scroll.d
    public final void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4287942c96d5d460372e6c239e615349", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4287942c96d5d460372e6c239e615349");
            return;
        }
        LoopLayoutManager loopLayoutManager = this.t;
        if (loopLayoutManager != null) {
            loopLayoutManager.k = z;
        }
    }

    @Override // com.dianping.picassomodule.widget.scroll.d
    public final void d(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28ba9c9b8dc35dbbbf283faf90cd8f5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28ba9c9b8dc35dbbbf283faf90cd8f5a");
            return;
        }
        LoopLayoutManager loopLayoutManager = this.t;
        if (loopLayoutManager != null) {
            loopLayoutManager.i = z;
        }
    }

    @Override // com.dianping.picassomodule.widget.scroll.d
    public final void a(int i, int i2, int i3, int i4) {
        Object[] objArr;
        ChangeQuickRedirect changeQuickRedirect;
        String str;
        C0115c c0115c;
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "514e7b1645dbba22e8915a551c88d13d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "514e7b1645dbba22e8915a551c88d13d");
            return;
        }
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c38f9e1bdcd6cb6f2615011088b3b92d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c38f9e1bdcd6cb6f2615011088b3b92d");
            return;
        }
        if (this.u != null) {
            this.k.removeItemDecoration(this.u);
        }
        if (this.m) {
            objArr = new Object[0];
            changeQuickRedirect = a;
            str = "d92d60f2b31980bb9eec688d09120a2e";
            if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d92d60f2b31980bb9eec688d09120a2e", RobustBitConfig.DEFAULT_VALUE)) {
                c0115c = new b();
                this.u = c0115c;
                this.k.addItemDecoration(this.u);
            }
            c0115c = (RecyclerView.f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, str);
            this.u = c0115c;
            this.k.addItemDecoration(this.u);
        }
        objArr = new Object[0];
        changeQuickRedirect = a;
        str = "c824f79564c2758dac09f6c30a1cc1a5";
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c824f79564c2758dac09f6c30a1cc1a5", RobustBitConfig.DEFAULT_VALUE)) {
            c0115c = new C0115c();
            this.u = c0115c;
            this.k.addItemDecoration(this.u);
        }
        c0115c = (RecyclerView.f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, str);
        this.u = c0115c;
        this.k.addItemDecoration(this.u);
    }

    @Override // com.dianping.picassomodule.widget.scroll.d
    @NotNull
    public final Rect a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6fba9c9d410768186fa986cbc2d90a7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6fba9c9d410768186fa986cbc2d90a7");
        }
        Rect rect = new Rect();
        rect.left = this.e;
        rect.right = this.f;
        return rect;
    }

    final boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09d7ea43cd90d1b716b3c48f7ab7b3d2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09d7ea43cd90d1b716b3c48f7ab7b3d2")).booleanValue();
        }
        LoopLayoutManager loopLayoutManager = this.t;
        return loopLayoutManager != null && loopLayoutManager.k;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"com/dianping/picassomodule/widget/scroll/PageModeStrategy$getPageScrollPaddingDecoration$1", "Landroid/support/v7/widget/RecyclerView$ItemDecoration;", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", Constants.EventType.VIEW, "Landroid/view/View;", "parent", "Landroid/support/v7/widget/RecyclerView;", "state", "Landroid/support/v7/widget/RecyclerView$State;", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
    /* renamed from: com.dianping.picassomodule.widget.scroll.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0115c extends RecyclerView.f {
        public static ChangeQuickRedirect a;

        public C0115c() {
        }

        @Override // android.support.v7.widget.RecyclerView.f
        public final void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @Nullable RecyclerView.State state) {
            Object[] objArr = {rect, view, recyclerView, state};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d50321fdc355a07ed5a37c506ed3b08", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d50321fdc355a07ed5a37c506ed3b08");
                return;
            }
            h.b(rect, "outRect");
            h.b(view, Constants.EventType.VIEW);
            h.b(recyclerView, "parent");
            rect.left = c.this.e;
            rect.right = c.this.f;
            rect.top = c.this.g;
            rect.bottom = c.this.h;
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"com/dianping/picassomodule/widget/scroll/PageModeStrategy$getGalleryPageGapDecoration$1", "Landroid/support/v7/widget/RecyclerView$ItemDecoration;", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", Constants.EventType.VIEW, "Landroid/view/View;", "parent", "Landroid/support/v7/widget/RecyclerView;", "state", "Landroid/support/v7/widget/RecyclerView$State;", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class b extends RecyclerView.f {
        public static ChangeQuickRedirect a;

        public b() {
        }

        @Override // android.support.v7.widget.RecyclerView.f
        public final void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @Nullable RecyclerView.State state) {
            Object[] objArr = {rect, view, recyclerView, state};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "911faf8e967ec5b21937334cca778cc2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "911faf8e967ec5b21937334cca778cc2");
                return;
            }
            h.b(rect, "outRect");
            h.b(view, Constants.EventType.VIEW);
            h.b(recyclerView, "parent");
            if (!c.this.e()) {
                rect.top = c.this.g;
                rect.bottom = c.this.h;
                if (recyclerView.getChildAdapterPosition(view) != 0) {
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    h.a((Object) layoutManager, "parent.layoutManager");
                    if (childAdapterPosition == layoutManager.getItemCount() - 1 && !c.a(c.this)) {
                        rect.left = c.this.b ? c.this.f : c.this.i / 2;
                        rect.right = c.this.f;
                        return;
                    }
                } else if (!c.a(c.this)) {
                    rect.left = c.this.e;
                    rect.right = c.this.i / 2;
                    return;
                }
                c.a(rect, c.this.i);
                return;
            }
            rect.left = c.this.e;
            rect.right = c.this.f;
            if (recyclerView.getChildAdapterPosition(view) == 0) {
                if (c.a(c.this)) {
                    c.b(rect, c.this.i);
                    return;
                }
                rect.top = c.this.g;
                rect.bottom = c.this.i / 2;
                return;
            }
            int childAdapterPosition2 = recyclerView.getChildAdapterPosition(view);
            RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
            h.a((Object) layoutManager2, "parent.layoutManager");
            if (childAdapterPosition2 != layoutManager2.getItemCount() - 1) {
                c.b(rect, c.this.i);
            } else if (c.a(c.this)) {
                c.b(rect, c.this.i);
            } else {
                rect.top = c.this.i / 2;
                rect.bottom = c.this.h;
            }
        }
    }

    @Override // com.dianping.picassomodule.widget.scroll.d
    @NotNull
    public final View a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e707d5f8c1608ae731e1fdac377bab2c", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e707d5f8c1608ae731e1fdac377bab2c");
        }
        LinearLayout linearLayout = new LinearLayout(this.y);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        int i2 = i * this.r;
        int i3 = this.p;
        for (int i4 = 0; i4 < i3; i4++) {
            LinearLayout linearLayout2 = new LinearLayout(this.y);
            linearLayout2.setClipChildren(false);
            linearLayout2.setClipToPadding(false);
            linearLayout2.setOrientation(0);
            int i5 = this.q;
            int i6 = 0;
            while (true) {
                if (i6 >= i5) {
                    break;
                }
                int i7 = (this.q * i4) + i2 + i6;
                if (i7 < this.s) {
                    ScrollView.f fVar = this.v;
                    if (fVar == null) {
                        h.a();
                    }
                    View a2 = fVar.a(i7);
                    h.a((Object) a2, "v");
                    a2.setTag(Integer.valueOf(i7));
                    a2.setOnClickListener(new a());
                    linearLayout2.addView(a2);
                    this.w.put(i7, a2);
                    ViewGroup.LayoutParams layoutParams = a2.getLayoutParams();
                    if (layoutParams == null) {
                        throw new o("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (i6 < this.q - 1) {
                        marginLayoutParams.rightMargin = this.n;
                    }
                    if (i4 < this.p - 1) {
                        marginLayoutParams.bottomMargin = this.o;
                    }
                    a2.setLayoutParams(marginLayoutParams);
                    i6++;
                } else {
                    linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                    break;
                }
            }
            linearLayout.addView(linearLayout2);
        }
        return linearLayout;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect a;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed65311c118da15e05865ce8d408adaa", 4611686018427387906L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed65311c118da15e05865ce8d408adaa");
                return;
            }
            com.dianping.picassomodule.widget.scroll.b bVar = c.this.j;
            if (bVar != null) {
                h.a((Object) view, "v");
                Object tag = view.getTag();
                if (tag == null) {
                    throw new o("null cannot be cast to non-null type kotlin.Int");
                }
                bVar.onItemClick(view, ((Integer) tag).intValue());
            }
        }
    }

    @Override // com.dianping.picassomodule.widget.scroll.d
    public final void a(boolean z) {
        this.b = z;
    }

    @Override // com.dianping.picassomodule.widget.scroll.d
    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4802d7617613210b13f79115a4835f26", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4802d7617613210b13f79115a4835f26")).intValue() : this.w.size();
    }

    @Override // com.dianping.picassomodule.widget.scroll.d
    @NotNull
    public final View d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf37a68f8abcd82d9e7d87d72dfd21ec", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf37a68f8abcd82d9e7d87d72dfd21ec");
        }
        View view = this.w.get(i, new View(this.y));
        h.a((Object) view, "addedItemViewMap.get(position, View(context))");
        return view;
    }

    @Override // com.dianping.picassomodule.widget.scroll.d
    public final int c() {
        return this.m ? this.i / 2 : this.e;
    }

    @Override // com.dianping.picassomodule.widget.scroll.d
    public final int a(@Nullable View view, @Nullable RecyclerView recyclerView) {
        Object[] objArr = {view, recyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1a28734bb7749a0f7b3dbd122b094c4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1a28734bb7749a0f7b3dbd122b094c4")).intValue();
        }
        if (this.u == null || view == null || recyclerView == null) {
            return c();
        }
        Rect rect = new Rect();
        RecyclerView.f fVar = this.u;
        if (fVar == null) {
            h.a();
        }
        fVar.getItemOffsets(rect, view, recyclerView, null);
        int i = rect.left;
        if (e()) {
            i = rect.top;
        }
        return i <= 0 ? c() : i;
    }

    @Override // com.dianping.picassomodule.widget.scroll.d
    public final void e(boolean z) {
        this.m = z;
    }

    @Override // com.dianping.picassomodule.widget.scroll.d
    public final void a(int i, int i2) {
        this.p = i;
        this.q = i2;
    }

    @Override // com.dianping.picassomodule.widget.scroll.d
    public final void e(int i) {
        this.i = i;
    }

    @Override // com.dianping.picassomodule.widget.scroll.d
    public final int d() {
        return this.l;
    }

    @Override // com.dianping.picassomodule.widget.scroll.d
    public final void a(@NotNull ScrollView.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a9d01571f57c7a837552fdc2ef2e853", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a9d01571f57c7a837552fdc2ef2e853");
            return;
        }
        h.b(fVar, "itemViewAdapter");
        this.v = fVar;
        this.s = fVar.a();
        this.r = this.p * this.q;
        this.l = this.s % this.r == 0 ? this.s / this.r : (this.s / this.r) + 1;
    }

    @Override // com.dianping.picassomodule.widget.scroll.d
    public final void a(@NotNull com.dianping.picassomodule.widget.scroll.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db5eb9e8e88f1489ebf933a246db0698", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db5eb9e8e88f1489ebf933a246db0698");
            return;
        }
        h.b(bVar, "itemClickListener");
        this.j = bVar;
    }

    @Override // com.dianping.picassomodule.widget.scroll.d
    public final void b(int i, int i2) {
        this.n = i;
        this.o = i2;
    }

    public static void a(@NotNull Rect rect, int i) {
        h.b(rect, "receiver$0");
        int i2 = i / 2;
        rect.left = i2;
        rect.right = i2;
    }

    public static void b(@NotNull Rect rect, int i) {
        h.b(rect, "receiver$0");
        int i2 = i / 2;
        rect.top = i2;
        rect.bottom = i2;
    }
}
