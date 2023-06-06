package com.meituan.android.common.aidata.ai.base;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class AbsStringRegisteredHolder<T> implements IRegisteredMember<String> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mKey;
    private T mValue;

    @Override // com.meituan.android.common.aidata.ai.base.IRegisteredMember
    public boolean isAllowed(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9511e365175815a1937b2fdf08e719c9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9511e365175815a1937b2fdf08e719c9")).booleanValue() : TextUtils.equals(this.mKey, str);
    }

    public AbsStringRegisteredHolder(@NonNull String str, @NonNull T t) {
        Object[] objArr = {str, t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "29bb9e925f85ce41e04f7fce1656f74f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "29bb9e925f85ce41e04f7fce1656f74f");
            return;
        }
        this.mKey = str;
        this.mValue = t;
    }

    @NonNull
    public T getValue() {
        return this.mValue;
    }
}
