package com.dianping.shield.node.adapter.status;

import android.graphics.Rect;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H&J\b\u0010\u0006\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/dianping/shield/node/adapter/status/IScreenVisibleExposeEdge;", "", "getScreenInvisibleEdge", "Ljava/util/ArrayList;", "Landroid/graphics/Rect;", "Lkotlin/collections/ArrayList;", "getScreenVisibleEdge", "onShieldExtraVisibleNodeChange", "", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface IScreenVisibleExposeEdge {
    @NotNull
    ArrayList<Rect> getScreenInvisibleEdge();

    @NotNull
    Rect getScreenVisibleEdge();

    void onShieldExtraVisibleNodeChange();
}
