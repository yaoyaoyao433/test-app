package com.dianping.shield.extensions;

import com.dianping.shield.node.processor.ShieldProcessor;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0013\u0010\u0004\u001a\u000f\u0012\u000b\b\u0001\u0012\u00070\u0003¢\u0006\u0002\b\u00060\u0005H&J2\u0010\u0007\u001a,\u0012\u0011\u0012\u000f\u0012\u000b\b\u0001\u0012\u00070\u0003¢\u0006\u0002\b\u00060\u00050\bj\u0015\u0012\u0011\u0012\u000f\u0012\u000b\b\u0001\u0012\u00070\u0003¢\u0006\u0002\b\u00060\u0005`\tH&¨\u0006\n"}, d2 = {"Lcom/dianping/shield/extensions/ExtensionProcessorBuilder;", "", "createExtensionProcessor", "Lcom/dianping/shield/node/processor/ShieldProcessor;", "processorClass", "Ljava/lang/Class;", "Lkotlin/jvm/JvmWildcard;", "extensionProcessorChain", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface ExtensionProcessorBuilder {
    @Nullable
    ShieldProcessor createExtensionProcessor(@NotNull Class<? extends ShieldProcessor> cls);

    @NotNull
    ArrayList<Class<? extends ShieldProcessor>> extensionProcessorChain();
}
