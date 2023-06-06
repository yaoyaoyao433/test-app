package com.dianping.shield.dynamic.diff.module;

import com.dianping.shield.dynamic.agent.node.DynamicDiff;
import com.dianping.shield.dynamic.model.view.ViewInfo;
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
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004\"\b\b\u0001\u0010\u0005*\u00020\u00062\u0015\u0010\u0007\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b¢\u0006\u0002\b\f"}, d2 = {"<anonymous>", "Lcom/dianping/shield/dynamic/agent/node/DynamicDiff;", "Lcom/dianping/shield/dynamic/model/view/ViewInfo;", "T", "Lcom/dianping/shield/dynamic/model/module/BaseTabModuleInfo;", "V", "Lcom/dianping/shield/component/extensions/tabs/TabRowItem;", VersionInfo.P1, "", "Lkotlin/ParameterName;", "name", "id", "invoke"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class BaseTabModuleInfoDiff$diffChildren$6 extends g implements b<String, DynamicDiff<ViewInfo>> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public BaseTabModuleInfoDiff$diffChildren$6(BaseTabModuleInfoDiff baseTabModuleInfoDiff) {
        super(1, baseTabModuleInfoDiff);
    }

    @Override // kotlin.jvm.internal.b, kotlin.reflect.b
    public final String getName() {
        return "mappingSlideBarViewFuc";
    }

    @Override // kotlin.jvm.internal.b
    public final d getOwner() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b6761e1836872dc4c81bd851f963d92", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b6761e1836872dc4c81bd851f963d92") : u.a(BaseTabModuleInfoDiff.class);
    }

    @Override // kotlin.jvm.internal.b
    public final String getSignature() {
        return "mappingSlideBarViewFuc(Ljava/lang/String;)Lcom/dianping/shield/dynamic/agent/node/DynamicDiff;";
    }

    @Override // kotlin.jvm.functions.b
    @Nullable
    public final DynamicDiff<ViewInfo> invoke(@NotNull String str) {
        DynamicDiff<ViewInfo> mappingSlideBarViewFuc;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1085be156c6fe79c89bf38c0ecbd0fa", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicDiff) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1085be156c6fe79c89bf38c0ecbd0fa");
        }
        h.b(str, VersionInfo.P1);
        mappingSlideBarViewFuc = ((BaseTabModuleInfoDiff) this.receiver).mappingSlideBarViewFuc(str);
        return mappingSlideBarViewFuc;
    }
}
