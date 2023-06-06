package com.dianping.shield.dynamic.diff.module;

import com.dianping.shield.dynamic.items.viewitems.DynamicViewItem;
import com.dianping.shield.dynamic.model.view.ExtraViewInfo;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.android.uptodate.model.VersionInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.b;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.u;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004\"\b\b\u0001\u0010\u0005*\u00020\u00062\u0015\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n¢\u0006\u0002\b\u000b"}, d2 = {"<anonymous>", "Lcom/dianping/shield/dynamic/items/viewitems/DynamicViewItem;", "Lcom/dianping/shield/dynamic/model/view/ExtraViewInfo;", "T", "Lcom/dianping/shield/dynamic/model/module/BaseTabModuleInfo;", "V", "Lcom/dianping/shield/component/extensions/tabs/TabRowItem;", VersionInfo.P1, "Lkotlin/ParameterName;", "name", DMKeys.KEY_VIEW_INFO, "invoke"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class BaseTabModuleInfoDiff$diffChildren$3 extends g implements b<ExtraViewInfo, DynamicViewItem<ExtraViewInfo>> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public BaseTabModuleInfoDiff$diffChildren$3(BaseTabModuleInfoDiff baseTabModuleInfoDiff) {
        super(1, baseTabModuleInfoDiff);
    }

    @Override // kotlin.jvm.internal.b, kotlin.reflect.b
    public final String getName() {
        return "createBgMaskItem";
    }

    @Override // kotlin.jvm.internal.b
    public final d getOwner() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e67e9dd280909e4f8d8b60cc7f292bcc", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e67e9dd280909e4f8d8b60cc7f292bcc") : u.a(BaseTabModuleInfoDiff.class);
    }

    @Override // kotlin.jvm.internal.b
    public final String getSignature() {
        return "createBgMaskItem(Lcom/dianping/shield/dynamic/model/view/ExtraViewInfo;)Lcom/dianping/shield/dynamic/items/viewitems/DynamicViewItem;";
    }

    @Override // kotlin.jvm.functions.b
    @NotNull
    public final DynamicViewItem<ExtraViewInfo> invoke(@NotNull ExtraViewInfo extraViewInfo) {
        Object[] objArr = {extraViewInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "231a3bd7a8d5ec17700c9b41cfff08b4", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "231a3bd7a8d5ec17700c9b41cfff08b4");
        }
        h.b(extraViewInfo, VersionInfo.P1);
        return ((BaseTabModuleInfoDiff) this.receiver).createBgMaskItem(extraViewInfo);
    }
}
