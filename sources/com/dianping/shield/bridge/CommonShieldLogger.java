package com.dianping.shield.bridge;

import com.dianping.codelog.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J*\u0010\n\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\u000b"}, d2 = {"Lcom/dianping/shield/bridge/CommonShieldLogger;", "Lcom/dianping/shield/bridge/ShieldLogger;", "()V", "codeLogError", "", "clazz", "Ljava/lang/Class;", "message", "", "subTag", "codeLogInfo", "shield_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class CommonShieldLogger extends ShieldLogger {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.shield.bridge.ShieldLogger
    public final void codeLogInfo(@Nullable Class<?> cls, @Nullable String str, @Nullable String str2) {
        Object[] objArr = {cls, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a694881263e2c3220302f2d441889c86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a694881263e2c3220302f2d441889c86");
        } else {
            b.a(cls, str2, str);
        }
    }

    @Override // com.dianping.shield.bridge.ShieldLogger
    public final void codeLogError(@Nullable Class<?> cls, @Nullable String str, @Nullable String str2) {
        Object[] objArr = {cls, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7fca769d6bdab4bb052023eddec484e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7fca769d6bdab4bb052023eddec484e6");
        } else {
            b.b(cls, str2, str);
        }
    }
}
