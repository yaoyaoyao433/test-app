package com.dianping.picassomodule.widget.scroll;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import com.dianping.picassomodule.widget.scroll.ScrollView;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001e\u001a\u00020\u0011H\u0016J\b\u0010\u001f\u001a\u00020\u0011H\u0016J\u0010\u0010 \u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0011H\u0016J\b\u0010!\u001a\u00020\u0011H\u0016J\b\u0010\"\u001a\u00020\u0011H\u0016J\u001c\u0010\"\u001a\u00020\u00112\b\u0010#\u001a\u0004\u0018\u00010\t2\b\u0010$\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010%\u001a\u00020\u0013H\u0002J\b\u0010&\u001a\u00020'H\u0016J \u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\r2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010,H\u0016J\u0018\u0010-\u001a\u00020)2\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\u0011H\u0016J\u0010\u00100\u001a\u00020)2\u0006\u00101\u001a\u00020\rH\u0016J\u0010\u00102\u001a\u00020)2\u0006\u00103\u001a\u00020\u0011H\u0016J\u0018\u00104\u001a\u00020)2\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0011H\u0016J\u0010\u00105\u001a\u00020)2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u00106\u001a\u00020)2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u00107\u001a\u00020)2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u00108\u001a\u00020)H\u0002J\b\u00109\u001a\u00020)H\u0002J\u0010\u0010:\u001a\u00020)2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010;\u001a\u00020)2\u0006\u0010<\u001a\u00020\u00112\u0006\u0010=\u001a\u00020\u0011H\u0016J\u0010\u0010>\u001a\u00020)2\u0006\u0010?\u001a\u00020\rH\u0016J(\u0010@\u001a\u00020)2\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0016J\u0010\u0010A\u001a\u00020)2\u0006\u0010B\u001a\u00020CH\u0016J\u0010\u0010D\u001a\u00020)2\u0006\u0010E\u001a\u00020\rH\u0016J\u0010\u0010F\u001a\u00020)2\u0006\u0010G\u001a\u00020\u0011H\u0016J\u0010\u0010H\u001a\u00020)2\u0006\u0010I\u001a\u00020\rH\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006J"}, d2 = {"Lcom/dianping/picassomodule/widget/scroll/NormalModeStrategy;", "Lcom/dianping/picassomodule/widget/scroll/ScrollStyleEventStrategy;", "context", "Landroid/content/Context;", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "(Landroid/content/Context;Landroid/support/v7/widget/RecyclerView;)V", "addedItemViewMap", "Landroid/util/SparseArray;", "Landroid/view/View;", "getContext", "()Landroid/content/Context;", "hasAttachView", "", "itemClickListener", "Lcom/dianping/picassomodule/widget/scroll/OnItemClickListener;", "itemCount", "", "itemGapDecoration", "Landroid/support/v7/widget/RecyclerView$ItemDecoration;", "itemViewAdapter", "Lcom/dianping/picassomodule/widget/scroll/ScrollView$ScrollAdapter;", "paddingBottom", "paddingDecoration", "paddingLeft", "paddingRight", "paddingTop", DMKeys.KEY_XGAP, DMKeys.KEY_YGAP, "createItemView", "position", "getElementChildCount", "getElementChildView", "getItemCount", "getItemGap", Constants.EventType.VIEW, "parent", "getNormalScrollPaddingDecoration", "getPadding", "Landroid/graphics/Rect;", "setAutoHeight", "", "isAutoHeight", "heightList", "", "setAutoPlay", "isAutoPlay", "timeInterval", "setGallery", "isGallery", "setGalleryGap", DMKeys.KEY_SCROLL_GALLERY_GAP, "setGap", "setHasAttachView", "setItemClickListener", "setItemCount", "setItemGapDecoration", "setItemPaddingDecoration", "setItemViewAdapter", "setLayoutConfig", DMKeys.KEY_ROWCOUNT, DMKeys.KEY_COLCOUNT, "setLoop", "isLoop", "setPadding", "setPageSelectedListener", "onPageSelectedListener", "Lcom/dianping/picassomodule/widget/scroll/pager/OnPageSelectedListener;", "setScrollEnable", "scrollEnable", "setSelectedIndex", "selectedIndex", "setVertical", "isVertical", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class a implements d {
    public static ChangeQuickRedirect a;
    int b;
    int c;
    int d;
    int e;
    int f;
    com.dianping.picassomodule.widget.scroll.b g;
    private boolean h;
    private int i;
    private int j;
    private RecyclerView.f k;
    private RecyclerView.f l;
    private ScrollView.f m;
    private final SparseArray<View> n;
    @NotNull
    private final Context o;
    private final RecyclerView p;

    @Override // com.dianping.picassomodule.widget.scroll.d
    public final void a(int i, int i2) {
    }

    @Override // com.dianping.picassomodule.widget.scroll.d
    public final void a(@NotNull com.dianping.picassomodule.widget.scroll.pager.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fda45713110c02d9f5473621887a6c99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fda45713110c02d9f5473621887a6c99");
        } else {
            h.b(bVar, "onPageSelectedListener");
        }
    }

    @Override // com.dianping.picassomodule.widget.scroll.d
    public final void a(boolean z, int i) {
    }

    @Override // com.dianping.picassomodule.widget.scroll.d
    public final void a(boolean z, @Nullable List<Integer> list) {
    }

    @Override // com.dianping.picassomodule.widget.scroll.d
    public final void b(int i) {
    }

    @Override // com.dianping.picassomodule.widget.scroll.d
    public final void b(boolean z) {
    }

    @Override // com.dianping.picassomodule.widget.scroll.d
    public final void c(boolean z) {
    }

    @Override // com.dianping.picassomodule.widget.scroll.d
    public final void d(boolean z) {
    }

    @Override // com.dianping.picassomodule.widget.scroll.d
    public final void e(int i) {
    }

    @Override // com.dianping.picassomodule.widget.scroll.d
    public final void e(boolean z) {
    }

    public a(@NotNull Context context, @NotNull RecyclerView recyclerView) {
        h.b(context, "context");
        h.b(recyclerView, "recyclerView");
        Object[] objArr = {context, recyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2b1ac08e80bbad9d5cb1d70c64cae73", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2b1ac08e80bbad9d5cb1d70c64cae73");
            return;
        }
        this.o = context;
        this.p = recyclerView;
        this.n = new SparseArray<>();
    }

    @Override // com.dianping.picassomodule.widget.scroll.d
    public final void a(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f013fabc976225eef6f32cb1d913ff77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f013fabc976225eef6f32cb1d913ff77");
            return;
        }
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7b6e474fd9391c254fc0cf0787964c8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7b6e474fd9391c254fc0cf0787964c8d");
            return;
        }
        if (this.k != null) {
            this.p.removeItemDecoration(this.k);
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        this.k = PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d8692d388a7f86f29022900ec2233e84", RobustBitConfig.DEFAULT_VALUE) ? (RecyclerView.f) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d8692d388a7f86f29022900ec2233e84") : new b();
        this.p.addItemDecoration(this.k);
    }

    @Override // com.dianping.picassomodule.widget.scroll.d
    @NotNull
    public final Rect a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef7aff8518b037f5640c8d4c23c47557", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef7aff8518b037f5640c8d4c23c47557");
        }
        Rect rect = new Rect();
        rect.left = this.b;
        rect.right = this.c;
        return rect;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"com/dianping/picassomodule/widget/scroll/NormalModeStrategy$getNormalScrollPaddingDecoration$1", "Landroid/support/v7/widget/RecyclerView$ItemDecoration;", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", Constants.EventType.VIEW, "Landroid/view/View;", "parent", "Landroid/support/v7/widget/RecyclerView;", "state", "Landroid/support/v7/widget/RecyclerView$State;", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class b extends RecyclerView.f {
        public static ChangeQuickRedirect a;

        public b() {
        }

        @Override // android.support.v7.widget.RecyclerView.f
        public final void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @Nullable RecyclerView.State state) {
            Object[] objArr = {rect, view, recyclerView, state};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e52a108ac4d0559cb3dd04bddfdc1fa", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e52a108ac4d0559cb3dd04bddfdc1fa");
                return;
            }
            h.b(rect, "outRect");
            h.b(view, Constants.EventType.VIEW);
            h.b(recyclerView, "parent");
            if (recyclerView.getChildAdapterPosition(view) == 0) {
                rect.left = a.this.b;
            }
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            h.a((Object) layoutManager, "parent.layoutManager");
            if (childAdapterPosition == layoutManager.getItemCount() - 1) {
                rect.right = a.this.c;
            }
            rect.top = a.this.d;
            rect.bottom = a.this.e;
        }
    }

    @Override // com.dianping.picassomodule.widget.scroll.d
    @Nullable
    public final View a(int i) {
        ScrollView.f fVar;
        View a2;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2e0c477b573eecab9d9e82d6ae97ccc", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2e0c477b573eecab9d9e82d6ae97ccc");
        }
        if (i >= 0) {
            ScrollView.f fVar2 = this.m;
            if (i >= (fVar2 != null ? fVar2.a() : 0) || (fVar = this.m) == null || (a2 = fVar.a(i)) == null) {
                return null;
            }
            a2.setTag(Integer.valueOf(i));
            a2.setOnClickListener(new View$OnClickListenerC0114a(i));
            this.n.put(i, a2);
            return a2;
        }
        return null;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/dianping/picassomodule/widget/scroll/NormalModeStrategy$createItemView$1$1"}, k = 3, mv = {1, 1, 13})
    /* renamed from: com.dianping.picassomodule.widget.scroll.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class View$OnClickListenerC0114a implements View.OnClickListener {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ int c;

        public View$OnClickListenerC0114a(int i) {
            this.c = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1c0f477e07fb92b660da7fb3e6f3179", 4611686018427387906L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1c0f477e07fb92b660da7fb3e6f3179");
                return;
            }
            com.dianping.picassomodule.widget.scroll.b bVar = a.this.g;
            if (bVar != null) {
                bVar.onItemClick(view, this.c);
            }
        }
    }

    @Override // com.dianping.picassomodule.widget.scroll.d
    public final void a(boolean z) {
        this.h = z;
    }

    @Override // com.dianping.picassomodule.widget.scroll.d
    public final void c(int i) {
        this.j = i;
    }

    @Override // com.dianping.picassomodule.widget.scroll.d
    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8061d82f13d5e40b301bef2f495d5f5f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8061d82f13d5e40b301bef2f495d5f5f")).intValue() : this.n.size();
    }

    @Override // com.dianping.picassomodule.widget.scroll.d
    @NotNull
    public final View d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d8cd50b2493045a6d759ddd3ce6c37f", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d8cd50b2493045a6d759ddd3ce6c37f");
        }
        View view = this.n.get(i, new View(this.o));
        h.a((Object) view, "addedItemViewMap.get(position, View(context))");
        return view;
    }

    @Override // com.dianping.picassomodule.widget.scroll.d
    public final int c() {
        return this.f;
    }

    @Override // com.dianping.picassomodule.widget.scroll.d
    public final int a(@Nullable View view, @Nullable RecyclerView recyclerView) {
        return this.f;
    }

    @Override // com.dianping.picassomodule.widget.scroll.d
    public final int d() {
        return this.j;
    }

    @Override // com.dianping.picassomodule.widget.scroll.d
    public final void a(@NotNull ScrollView.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc7860d593fb3ecf7d07c015a02f68c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc7860d593fb3ecf7d07c015a02f68c8");
            return;
        }
        h.b(fVar, "itemViewAdapter");
        this.m = fVar;
    }

    @Override // com.dianping.picassomodule.widget.scroll.d
    public final void a(@NotNull com.dianping.picassomodule.widget.scroll.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e31d8d455f3078bf3b3dc1c955f6dbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e31d8d455f3078bf3b3dc1c955f6dbc");
            return;
        }
        h.b(bVar, "itemClickListener");
        this.g = bVar;
    }

    @Override // com.dianping.picassomodule.widget.scroll.d
    public final void b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66ebce4ed93d67ceef5c6ae9565db308", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66ebce4ed93d67ceef5c6ae9565db308");
            return;
        }
        this.f = i;
        this.i = i2;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "248b3933f1f0561edac0f28542fa301b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "248b3933f1f0561edac0f28542fa301b");
            return;
        }
        if (this.l != null) {
            this.p.removeItemDecoration(this.l);
        }
        this.l = new c();
        this.p.addItemDecoration(this.l);
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"com/dianping/picassomodule/widget/scroll/NormalModeStrategy$setItemGapDecoration$1", "Landroid/support/v7/widget/RecyclerView$ItemDecoration;", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", Constants.EventType.VIEW, "Landroid/view/View;", "parent", "Landroid/support/v7/widget/RecyclerView;", "state", "Landroid/support/v7/widget/RecyclerView$State;", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class c extends RecyclerView.f {
        public static ChangeQuickRedirect a;

        public c() {
        }

        @Override // android.support.v7.widget.RecyclerView.f
        public final void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @Nullable RecyclerView.State state) {
            Object[] objArr = {rect, view, recyclerView, state};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfec10fb3a9f9151b1e41b2310da67b4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfec10fb3a9f9151b1e41b2310da67b4");
                return;
            }
            h.b(rect, "outRect");
            h.b(view, Constants.EventType.VIEW);
            h.b(recyclerView, "parent");
            if (recyclerView.getChildAdapterPosition(view) == 0) {
                return;
            }
            rect.left = a.this.f;
        }
    }
}
