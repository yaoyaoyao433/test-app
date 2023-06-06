package com.dianping.shield.node.cellnode;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R&\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/dianping/shield/node/cellnode/ShieldCellGroup;", "", "()V", "groupIndex", "", "shieldViewCells", "Ljava/util/ArrayList;", "Lcom/dianping/shield/node/cellnode/ShieldViewCell;", "Lkotlin/collections/ArrayList;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ShieldCellGroup {
    public static ChangeQuickRedirect changeQuickRedirect;
    @JvmField
    public int groupIndex;
    @JvmField
    @Nullable
    public ArrayList<ShieldViewCell> shieldViewCells;
}
