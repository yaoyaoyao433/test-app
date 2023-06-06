package com.dianping.shield.dynamic.diff;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.i;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\u0004\"\b\b\u0000\u0010\u0005*\u00020\u0006\"\b\b\u0001\u0010\u0007*\u00020\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "T", "Lcom/dianping/shield/dynamic/model/cell/CellInfo$BaseCellInfo;", "V", "Lcom/dianping/shield/component/extensions/common/CommonContainerRowItem;", "invoke"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class CommonContainerInfoDiffCustom$mapOnScreen$2 extends i implements a<HashMap<String, Long>> {
    public static final CommonContainerInfoDiffCustom$mapOnScreen$2 INSTANCE = new CommonContainerInfoDiffCustom$mapOnScreen$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    public CommonContainerInfoDiffCustom$mapOnScreen$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.a
    @NotNull
    public final HashMap<String, Long> invoke() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a21193a8974639e35fdffdc12312912", RobustBitConfig.DEFAULT_VALUE) ? (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a21193a8974639e35fdffdc12312912") : new HashMap<>();
    }
}
