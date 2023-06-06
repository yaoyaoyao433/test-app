package com.dianping.gcmrnmodule.wrapperviews.shadow;

import com.dianping.shield.env.ShieldEnvironment;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.yoga.YogaNodeJNIBase;
import com.facebook.yoga.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/shadow/ReflectUtil;", "", "()V", "getYogaNode", "Lcom/facebook/yoga/YogaNode;", "shadowNode", "Lcom/facebook/react/uimanager/ReactShadowNodeImpl;", "getYogaNodePointer", "", "yogaNode", "(Lcom/facebook/yoga/YogaNode;)Ljava/lang/Long;", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static final a b = new a();

    @Nullable
    public final d a(@Nullable ReactShadowNodeImpl reactShadowNodeImpl) {
        Object[] objArr = {reactShadowNodeImpl};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87f30811f92f101f07586821d5f2aed8", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87f30811f92f101f07586821d5f2aed8");
        }
        try {
            Field declaredField = ReactShadowNodeImpl.class.getDeclaredField("mYogaNode");
            h.a((Object) declaredField, "yogaNodeField");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(reactShadowNodeImpl);
            if (!(obj instanceof d)) {
                obj = null;
            }
            return (d) obj;
        } catch (Exception unused) {
            ShieldEnvironment.INSTANCE.getShieldLogger().codeLogError(a.class, "MRNModule reflect getYogaNode fail！！", "mrnmodule-yoga");
            return null;
        }
    }

    @Nullable
    public final Long a(@Nullable d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2878c4a184b56182d874affb0056e04f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2878c4a184b56182d874affb0056e04f");
        }
        if (((YogaNodeJNIBase) (!(dVar instanceof YogaNodeJNIBase) ? null : dVar)) != null) {
            try {
                Field declaredField = YogaNodeJNIBase.class.getDeclaredField("a");
                h.a((Object) declaredField, "pointerField");
                declaredField.setAccessible(true);
                return Long.valueOf(declaredField.getLong(dVar));
            } catch (Exception unused) {
                ShieldEnvironment.INSTANCE.getShieldLogger().codeLogError(a.class, "MRNModule reflect getYogaNodePointer fail！！", "mrnmodule-yoga-pointer");
                return null;
            }
        }
        return null;
    }
}
