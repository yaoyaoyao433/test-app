package com.dianping.shield.components.scrolltab;

import android.view.View;
import com.dianping.voyager.fragment.CommonShieldFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.h;
import kotlin.r;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007H\u0016R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/dianping/shield/components/scrolltab/LazyLoadShieldFragment;", "Lcom/dianping/voyager/fragment/CommonShieldFragment;", "()V", "firstUserVisibleListener", "Lkotlin/Function0;", "", "isEverUserVisible", "", "addOnFirstUserVisibleListener", "listener", "setUserVisibleHint", "isVisibleToUser", "shield_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class LazyLoadShieldFragment extends CommonShieldFragment {
    public static ChangeQuickRedirect changeQuickRedirect;
    private HashMap _$_findViewCache;
    private a<r> firstUserVisibleListener;
    private boolean isEverUserVisible;

    @Override // com.dianping.agentsdk.fragment.AgentManagerFragment
    public final void _$_clearFindViewByIdCache() {
        if (this._$_findViewCache != null) {
            this._$_findViewCache.clear();
        }
    }

    @Override // com.dianping.agentsdk.fragment.AgentManagerFragment
    public final View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            View findViewById = view2.findViewById(i);
            this._$_findViewCache.put(Integer.valueOf(i), findViewById);
            return findViewById;
        }
        return view;
    }

    @Override // com.dianping.agentsdk.fragment.AgentManagerFragment, android.support.v4.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // android.support.v4.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6502abd8dc9e19aafd06e11c7b44f302", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6502abd8dc9e19aafd06e11c7b44f302");
            return;
        }
        super.setUserVisibleHint(z);
        if (this.isEverUserVisible || !z) {
            return;
        }
        this.isEverUserVisible = z;
        a<r> aVar = this.firstUserVisibleListener;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void addOnFirstUserVisibleListener(@NotNull a<r> aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df9fa6e32809f763874ffc80b8e27ffa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df9fa6e32809f763874ffc80b8e27ffa");
            return;
        }
        h.b(aVar, "listener");
        this.firstUserVisibleListener = aVar;
    }

    public final boolean isEverUserVisible() {
        return this.isEverUserVisible;
    }
}
