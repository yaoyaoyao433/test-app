package com.dianping.shield.dynamic.agent.node;

import com.dianping.shield.dynamic.protocols.DynamicViewItemsHolderInterface;
import com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.text.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\u001a\u001c\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u0004\u0018\u00010\u0007H\u0080\b¨\u0006\b"}, d2 = {"findDynamicViewItem", "Lcom/dianping/shield/dynamic/protocols/IDynamicModuleViewItem;", "", "Lcom/dianping/shield/dynamic/protocols/DynamicViewItemsHolderInterface;", "identifier", "", "orBlank", "", "shieldDynamic_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DynamicDiffKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Nullable
    public static final CharSequence orBlank(@Nullable CharSequence charSequence) {
        boolean z = true;
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fa109e41b5841b6984efc192c6a3f00c", RobustBitConfig.DEFAULT_VALUE)) {
            return (CharSequence) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fa109e41b5841b6984efc192c6a3f00c");
        }
        if (charSequence != null && !g.a(charSequence)) {
            z = false;
        }
        if (z) {
            return null;
        }
        return charSequence;
    }

    @Nullable
    public static final IDynamicModuleViewItem findDynamicViewItem(@NotNull List<? extends DynamicViewItemsHolderInterface> list, @NotNull String str) {
        boolean z;
        Object[] objArr = {list, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        IDynamicModuleViewItem iDynamicModuleViewItem = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "17624be4bad3048a7e798cdde2a298e2", RobustBitConfig.DEFAULT_VALUE)) {
            return (IDynamicModuleViewItem) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "17624be4bad3048a7e798cdde2a298e2");
        }
        h.b(list, "receiver$0");
        h.b(str, "identifier");
        for (DynamicViewItemsHolderInterface dynamicViewItemsHolderInterface : list) {
            IDynamicModuleViewItem findPicassoViewItemByIdentifier = dynamicViewItemsHolderInterface.findPicassoViewItemByIdentifier(str);
            if (findPicassoViewItemByIdentifier != null) {
                iDynamicModuleViewItem = findPicassoViewItemByIdentifier;
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return iDynamicModuleViewItem;
    }
}
