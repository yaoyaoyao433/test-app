package com.dianping.gcmrnmodule.protocols;

import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/dianping/gcmrnmodule/protocols/MRNModuleContainerProtocol;", "", "getHostInterface", "Lcom/dianping/gcmrnmodule/hostwrapper/MRNModuleBaseHostWrapper;", "getWhiteboard", "Lcom/dianping/agentsdk/framework/WhiteBoard;", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public interface i {

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a {
        public static ChangeQuickRedirect a;
    }

    @Nullable
    com.dianping.gcmrnmodule.hostwrapper.a getHostInterface();
}
