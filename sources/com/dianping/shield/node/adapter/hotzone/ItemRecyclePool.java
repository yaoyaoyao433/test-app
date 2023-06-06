package com.dianping.shield.node.adapter.hotzone;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Stack;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ItemRecyclePool<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Stack<T> infoStack;
    @NonNull
    private ItemCreator<T> itemCreator;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface ItemCreator<T> {
        T createItem();
    }

    public ItemRecyclePool(@NonNull ItemCreator<T> itemCreator) {
        Object[] objArr = {itemCreator};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42c761a84e5b85343ec596a1348f8a2d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42c761a84e5b85343ec596a1348f8a2d");
            return;
        }
        this.infoStack = new Stack<>();
        this.itemCreator = itemCreator;
    }

    public void recyclerItem(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "227b63ded14d11056451bdbd98bb2429", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "227b63ded14d11056451bdbd98bb2429");
        } else {
            this.infoStack.push(t);
        }
    }

    public T getItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "98eef969293fcba4a96d36705f0ea0d8", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "98eef969293fcba4a96d36705f0ea0d8");
        }
        if (this.infoStack.isEmpty()) {
            return this.itemCreator.createItem();
        }
        return this.infoStack.pop();
    }
}
