package com.dianping.shield.components.scrolltab;

import com.dianping.shield.components.scrolltab.model.ScrollTabConfigModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.i;
import kotlin.r;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/dianping/shield/components/scrolltab/ConfigurableScrollTabAgent$configurableRefreshScrollTab$2$1"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ConfigurableScrollTabAgent$configurableRefreshScrollTab$$inlined$apply$lambda$1 extends i implements a<r> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ int $i$inlined;
    public final /* synthetic */ boolean $isLazyLoad$inlined;
    public final /* synthetic */ LazyLoadShieldFragment $this_apply;
    public final /* synthetic */ ConfigurableScrollTabAgent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigurableScrollTabAgent$configurableRefreshScrollTab$$inlined$apply$lambda$1(LazyLoadShieldFragment lazyLoadShieldFragment, ConfigurableScrollTabAgent configurableScrollTabAgent, boolean z, int i) {
        super(0);
        this.$this_apply = lazyLoadShieldFragment;
        this.this$0 = configurableScrollTabAgent;
        this.$isLazyLoad$inlined = z;
        this.$i$inlined = i;
    }

    @Override // kotlin.jvm.functions.a
    public final /* bridge */ /* synthetic */ r invoke() {
        invoke2();
        return r.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a98ca302690cd3cc643def9851f6dd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a98ca302690cd3cc643def9851f6dd6");
        } else if (this.$this_apply.getIndex() < this.this$0.currentConfigModels.size()) {
            this.$this_apply.setShieldConfigInfo(((ScrollTabConfigModel) this.this$0.currentConfigModels.get(this.$this_apply.getIndex())).getShieldKeys());
            this.$this_apply.resetAgents();
        }
    }
}
