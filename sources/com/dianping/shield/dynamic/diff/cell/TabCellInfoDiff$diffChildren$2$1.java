package com.dianping.shield.dynamic.diff.cell;

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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0015\u0010\u0003\u001a\u00110\u0002¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/dianping/shield/dynamic/items/viewitems/DynamicViewItem;", "Lcom/dianping/shield/dynamic/model/view/ExtraViewInfo;", VersionInfo.P1, "Lkotlin/ParameterName;", "name", DMKeys.KEY_VIEW_INFO, "invoke"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class TabCellInfoDiff$diffChildren$2$1 extends g implements b<ExtraViewInfo, DynamicViewItem<ExtraViewInfo>> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public TabCellInfoDiff$diffChildren$2$1(TabCellInfoDiff tabCellInfoDiff) {
        super(1, tabCellInfoDiff);
    }

    @Override // kotlin.jvm.internal.b, kotlin.reflect.b
    public final String getName() {
        return "createBgMaskItem";
    }

    @Override // kotlin.jvm.internal.b
    public final d getOwner() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1fd3854fd54f4d5c736f657e584fdda8", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1fd3854fd54f4d5c736f657e584fdda8") : u.a(TabCellInfoDiff.class);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2fb11cf281a9a0a51bf4b960226648d8", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2fb11cf281a9a0a51bf4b960226648d8");
        }
        h.b(extraViewInfo, VersionInfo.P1);
        return ((TabCellInfoDiff) this.receiver).createBgMaskItem(extraViewInfo);
    }
}
