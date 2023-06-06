package com.dianping.shield.node.adapter;

import android.util.SparseArray;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.d;
import kotlin.e;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\rR!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/dianping/shield/node/adapter/ShieldViewHolder;", "", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "childViewMap", "Landroid/util/SparseArray;", "getChildViewMap", "()Landroid/util/SparseArray;", "childViewMap$delegate", "Lkotlin/Lazy;", "getView", "id", "", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class ShieldViewHolder {
    public static final /* synthetic */ i[] $$delegatedProperties = {u.a(new s(u.a(ShieldViewHolder.class), "childViewMap", "getChildViewMap()Landroid/util/SparseArray;"))};
    public static ChangeQuickRedirect changeQuickRedirect;
    private final d childViewMap$delegate;
    @JvmField
    @NotNull
    public final View itemView;

    private final SparseArray<View> getChildViewMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (SparseArray) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a44597f5a5e3a4692c9dfc38a7aa4d61", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a44597f5a5e3a4692c9dfc38a7aa4d61") : this.childViewMap$delegate.a());
    }

    public ShieldViewHolder(@NotNull View view) {
        h.b(view, "itemView");
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15b4600146afb95bb9ccdb99996747c7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15b4600146afb95bb9ccdb99996747c7");
            return;
        }
        this.itemView = view;
        this.childViewMap$delegate = e.a(kotlin.i.NONE, ShieldViewHolder$childViewMap$2.INSTANCE);
    }

    @Nullable
    public final View getView(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d6f8a38cb75d16ba4a5c712a5ba232a", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d6f8a38cb75d16ba4a5c712a5ba232a");
        }
        View view = getChildViewMap().get(i);
        if (view == null) {
            view = this.itemView.findViewById(i);
            if (!(view instanceof View)) {
                view = null;
            }
            getChildViewMap().put(i, view);
        }
        return view;
    }
}
