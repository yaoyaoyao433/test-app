package com.dianping.shield.node.adapter.status;

import com.dianping.shield.node.adapter.ViewLocationChangeProcessor;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002J(\u0010\u0003\u001a\u00020\u00042\u001e\u0010\u0005\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007`\bH&¨\u0006\t"}, d2 = {"Lcom/dianping/shield/node/adapter/status/IElementContainerExpose;", "Lcom/dianping/shield/node/adapter/status/ElementContainerStatusInterface;", "Lcom/dianping/shield/node/adapter/status/ElementContainerCommonInterface;", "setViewLocationProcessors", "", "processorList", "Ljava/util/ArrayList;", "Lcom/dianping/shield/node/adapter/ViewLocationChangeProcessor;", "Lkotlin/collections/ArrayList;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface IElementContainerExpose extends ElementContainerCommonInterface, ElementContainerStatusInterface {
    void setViewLocationProcessors(@NotNull ArrayList<ViewLocationChangeProcessor<?>> arrayList);
}
