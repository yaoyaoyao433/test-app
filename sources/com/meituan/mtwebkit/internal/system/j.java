package com.meituan.mtwebkit.internal.system;

import android.webkit.WebBackForwardList;
import com.meituan.mtwebkit.MTWebBackForwardList;
import com.meituan.mtwebkit.MTWebHistoryItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class j extends MTWebBackForwardList {
    public static ChangeQuickRedirect a;
    private final List<k> b;
    private final int c;

    @Override // com.meituan.mtwebkit.MTWebBackForwardList
    /* renamed from: clone */
    public final MTWebBackForwardList mo11clone() {
        return null;
    }

    public j(WebBackForwardList webBackForwardList) {
        Object[] objArr = {webBackForwardList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa95ab873caa73f1920d5cece305de7d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa95ab873caa73f1920d5cece305de7d");
            return;
        }
        this.c = webBackForwardList.getCurrentIndex();
        this.b = new ArrayList(webBackForwardList.getSize());
        for (int i = 0; i < webBackForwardList.getSize(); i++) {
            this.b.add(new k(webBackForwardList.getItemAtIndex(i)));
        }
    }

    @Override // com.meituan.mtwebkit.MTWebBackForwardList
    public final MTWebHistoryItem getCurrentItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0670d3d8b3bcbfa602e60a9bd882ba60", RobustBitConfig.DEFAULT_VALUE)) {
            return (MTWebHistoryItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0670d3d8b3bcbfa602e60a9bd882ba60");
        }
        if (getSize() == 0) {
            return null;
        }
        return getItemAtIndex(getCurrentIndex());
    }

    @Override // com.meituan.mtwebkit.MTWebBackForwardList
    public final int getCurrentIndex() {
        return this.c;
    }

    @Override // com.meituan.mtwebkit.MTWebBackForwardList
    public final MTWebHistoryItem getItemAtIndex(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ecab33bd8582ded5c6899832432ff6d", RobustBitConfig.DEFAULT_VALUE)) {
            return (MTWebHistoryItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ecab33bd8582ded5c6899832432ff6d");
        }
        if (i < 0 || i >= getSize()) {
            return null;
        }
        return this.b.get(i);
    }

    @Override // com.meituan.mtwebkit.MTWebBackForwardList
    public final int getSize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "290fdee2bc21e7a9f9e9da6d022d77a3", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "290fdee2bc21e7a9f9e9da6d022d77a3")).intValue() : this.b.size();
    }
}
