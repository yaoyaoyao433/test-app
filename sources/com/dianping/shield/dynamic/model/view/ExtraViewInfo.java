package com.dianping.shield.dynamic.model.view;

import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/dianping/shield/dynamic/model/view/ExtraViewInfo;", "Lcom/dianping/shield/dynamic/model/view/FixedMarginViewInfo;", "Lcom/dianping/shield/dynamic/model/view/ExtraViewInfoProps;", "()V", DMKeys.KEY_USER_INTERACTION_ENABLED, "", "getUserInteractionEnabled", "()Ljava/lang/Boolean;", "setUserInteractionEnabled", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class ExtraViewInfo extends FixedMarginViewInfo implements ExtraViewInfoProps {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private Boolean userInteractionEnabled;

    @Override // com.dianping.shield.dynamic.model.view.ExtraViewInfoProps
    @Nullable
    public Boolean getUserInteractionEnabled() {
        return this.userInteractionEnabled;
    }

    @Override // com.dianping.shield.dynamic.model.view.ExtraViewInfoProps
    public void setUserInteractionEnabled(@Nullable Boolean bool) {
        this.userInteractionEnabled = bool;
    }
}
