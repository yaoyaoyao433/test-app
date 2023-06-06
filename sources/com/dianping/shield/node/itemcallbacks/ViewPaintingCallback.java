package com.dianping.shield.node.itemcallbacks;

import android.content.Context;
import android.view.ViewGroup;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.dianping.shield.node.cellnode.NodePath;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000*\u000f\b\u0000\u0010\u0001 \u0001*\u00070\u0002¢\u0006\u0002\b\u00032\u00020\u0004J)\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\nH&¢\u0006\u0002\u0010\u000bJ)\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H&¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/dianping/shield/node/itemcallbacks/ViewPaintingCallback;", "T", "Lcom/dianping/shield/node/adapter/ShieldViewHolder;", "Lkotlin/jvm/JvmWildcard;", "", "bindViewHolder", "", "viewHolder", "data", "path", "Lcom/dianping/shield/node/cellnode/NodePath;", "(Lcom/dianping/shield/node/adapter/ShieldViewHolder;Ljava/lang/Object;Lcom/dianping/shield/node/cellnode/NodePath;)V", "createViewHolder", "context", "Landroid/content/Context;", "parent", "Landroid/view/ViewGroup;", DMKeys.KEY_VIEW_TYPE, "", "(Landroid/content/Context;Landroid/view/ViewGroup;Ljava/lang/String;)Lcom/dianping/shield/node/adapter/ShieldViewHolder;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface ViewPaintingCallback<T extends ShieldViewHolder> {
    void bindViewHolder(@NotNull T t, @Nullable Object obj, @Nullable NodePath nodePath);

    @NotNull
    T createViewHolder(@NotNull Context context, @Nullable ViewGroup viewGroup, @Nullable String str);
}
