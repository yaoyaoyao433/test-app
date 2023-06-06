package com.meituan.android.common.aidata.ai;

import android.support.annotation.Nullable;
import com.meituan.android.common.aidata.ai.base.IRegisteredMember;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RegisterManager<K, T extends IRegisteredMember<K>> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<T> mList;

    public RegisterManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35a5ce029f0d547341cd0fda1a6f89dd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35a5ce029f0d547341cd0fda1a6f89dd");
        } else {
            this.mList = new ArrayList();
        }
    }

    public synchronized void register(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "481a734673039aa33057d772c9d18c0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "481a734673039aa33057d772c9d18c0d");
            return;
        }
        if (t != null && !this.mList.contains(t)) {
            this.mList.add(0, t);
        }
    }

    @Nullable
    public synchronized T get(K k) {
        Object[] objArr = {k};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "73e0c1711b19aa0ed5beee19a1173854", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "73e0c1711b19aa0ed5beee19a1173854");
        }
        T t = null;
        Iterator<T> it = this.mList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (next != null && next.isAllowed(k)) {
                t = next;
                break;
            }
        }
        return t;
    }

    public Iterator<T> iterate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f5dc33c529a2ef2f5d930a4cf194cca", RobustBitConfig.DEFAULT_VALUE) ? (Iterator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f5dc33c529a2ef2f5d930a4cf194cca") : this.mList.iterator();
    }
}
