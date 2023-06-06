package com.dianping.picassomodule.widget.scroll;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.dianping.picassomodule.widget.scroll.ScrollView;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.android.common.statistics.Constants;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0005H&J\u001c\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\b\u0010\r\u001a\u00020\u000eH&J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0014H&J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0005H&J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0012H&J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0005H&J\u0018\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0005H&J\u0010\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0012H&J\u0010\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020#H&J\u0010\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u0005H&J\u0010\u0010&\u001a\u00020\u00102\u0006\u0010'\u001a\u00020(H&J\u0018\u0010)\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u0005H&J\u0010\u0010,\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u0012H&J(\u0010.\u001a\u00020\u00102\u0006\u0010/\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005H&J\u0010\u00103\u001a\u00020\u00102\u0006\u00104\u001a\u000205H&J\u0010\u00106\u001a\u00020\u00102\u0006\u00107\u001a\u00020\u0012H&J\u0010\u00108\u001a\u00020\u00102\u0006\u00109\u001a\u00020\u0005H&J\u0010\u0010:\u001a\u00020\u00102\u0006\u0010;\u001a\u00020\u0012H&¨\u0006<"}, d2 = {"Lcom/dianping/picassomodule/widget/scroll/ScrollStyleEventStrategy;", "", "createItemView", "Landroid/view/View;", "position", "", "getElementChildCount", "getElementChildView", "getItemCount", "getItemGap", Constants.EventType.VIEW, "parent", "Landroid/support/v7/widget/RecyclerView;", "getPadding", "Landroid/graphics/Rect;", "setAutoHeight", "", "isAutoHeight", "", "heightList", "", "setAutoPlay", "isAutoPlay", "timeInterval", "setGallery", "isGallery", "setGalleryGap", DMKeys.KEY_SCROLL_GALLERY_GAP, "setGap", DMKeys.KEY_XGAP, DMKeys.KEY_YGAP, "setHasAttachView", "hasAttachView", "setItemClickListener", "itemClickListener", "Lcom/dianping/picassomodule/widget/scroll/OnItemClickListener;", "setItemCount", "itemCount", "setItemViewAdapter", "itemViewAdapter", "Lcom/dianping/picassomodule/widget/scroll/ScrollView$ScrollAdapter;", "setLayoutConfig", DMKeys.KEY_ROWCOUNT, DMKeys.KEY_COLCOUNT, "setLoop", "isLoop", "setPadding", "paddingLeft", "paddingRight", "paddingTop", "paddingBottom", "setPageSelectedListener", "onPageSelectedListener", "Lcom/dianping/picassomodule/widget/scroll/pager/OnPageSelectedListener;", "setScrollEnable", "scrollEnable", "setSelectedIndex", "selectedIndex", "setVertical", "isVertical", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface d {
    int a(@Nullable View view, @Nullable RecyclerView recyclerView);

    @NotNull
    Rect a();

    @Nullable
    View a(int i);

    void a(int i, int i2);

    void a(int i, int i2, int i3, int i4);

    void a(@NotNull ScrollView.f fVar);

    void a(@NotNull b bVar);

    void a(@NotNull com.dianping.picassomodule.widget.scroll.pager.b bVar);

    void a(boolean z);

    void a(boolean z, int i);

    void a(boolean z, @Nullable List<Integer> list);

    int b();

    void b(int i);

    void b(int i, int i2);

    void b(boolean z);

    int c();

    void c(int i);

    void c(boolean z);

    int d();

    @NotNull
    View d(int i);

    void d(boolean z);

    void e(int i);

    void e(boolean z);
}
