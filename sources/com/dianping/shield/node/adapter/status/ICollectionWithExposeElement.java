package com.dianping.shield.node.adapter.status;

import android.util.Pair;
import com.dianping.shield.entity.ViewExtraInfo;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001a\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u00050\u0004H&¨\u0006\u0007"}, d2 = {"Lcom/dianping/shield/node/adapter/status/ICollectionWithExposeElement;", "T", "", "getCurrentElementAndViewExtraInfoList", "", "Landroid/util/Pair;", "Lcom/dianping/shield/entity/ViewExtraInfo;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface ICollectionWithExposeElement<T> {
    @NotNull
    List<Pair<T, ViewExtraInfo>> getCurrentElementAndViewExtraInfoList();
}
