package com.dianping.shield.dynamic.model.vc;

import com.dianping.shield.dynamic.model.vc.ModuleKeyUnionType;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.i;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ModuleKeyUnionType$StringKeyCallback$key$2 extends i implements a<String> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ ModuleKeyUnionType.StringKeyCallback this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModuleKeyUnionType$StringKeyCallback$key$2(ModuleKeyUnionType.StringKeyCallback stringKeyCallback) {
        super(0);
        this.this$0 = stringKeyCallback;
    }

    @Override // kotlin.jvm.functions.a
    @Nullable
    public final String invoke() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "75492db72b676c12af48c671c6b91cec", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "75492db72b676c12af48c671c6b91cec");
        }
        a<String> keyFunc = this.this$0.getKeyFunc();
        if (keyFunc != null) {
            return keyFunc.invoke();
        }
        return null;
    }
}
