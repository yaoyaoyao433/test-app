package com.dianping.shield.dynamic.utils;

import com.dianping.agentsdk.framework.z;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0004J\u0010\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/dianping/shield/dynamic/utils/LinkTypeUtil;", "", "()V", "AUTO", "", "DISABLE_LINK_NEXT", "DISABLE_LINK_PREVIOUS", "LINK_NEXT", "LINK_PREVIOUS", "getNextLinkType", "Lcom/dianping/agentsdk/framework/LinkType$Next;", "type", "getPreviousLinkType", "Lcom/dianping/agentsdk/framework/LinkType$Previous;", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class LinkTypeUtil {
    private static final int AUTO = 0;
    private static final int DISABLE_LINK_NEXT = 8;
    private static final int DISABLE_LINK_PREVIOUS = 4;
    public static final LinkTypeUtil INSTANCE = new LinkTypeUtil();
    private static final int LINK_NEXT = 2;
    private static final int LINK_PREVIOUS = 1;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Nullable
    public final z.b getPreviousLinkType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be803052fce519915a81f56c780e91c0", RobustBitConfig.DEFAULT_VALUE)) {
            return (z.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be803052fce519915a81f56c780e91c0");
        }
        if ((i & 4) != 0) {
            return z.b.DISABLE_LINK_TO_PREVIOUS;
        }
        if ((i & 1) != 0) {
            return z.b.LINK_TO_PREVIOUS;
        }
        return z.b.DEFAULT;
    }

    @Nullable
    public final z.a getNextLinkType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ffe12836cbd75f6a21a92d5886fefee", RobustBitConfig.DEFAULT_VALUE)) {
            return (z.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ffe12836cbd75f6a21a92d5886fefee");
        }
        if ((i & 8) != 0) {
            return z.a.DISABLE_LINK_TO_NEXT;
        }
        if ((i & 2) != 0) {
            return z.a.LINK_TO_NEXT;
        }
        return z.a.DEFAULT;
    }
}
