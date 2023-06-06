package com.meituan.mtwebkit.internal.system;

import android.graphics.Bitmap;
import android.webkit.WebHistoryItem;
import com.meituan.mtwebkit.MTWebHistoryItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class k extends MTWebHistoryItem {
    public static ChangeQuickRedirect a;
    private WebHistoryItem b;

    @Override // com.meituan.mtwebkit.MTWebHistoryItem
    /* renamed from: clone */
    public final MTWebHistoryItem mo12clone() {
        return null;
    }

    @Override // com.meituan.mtwebkit.MTWebHistoryItem
    public final int getId() {
        return -1;
    }

    public k(WebHistoryItem webHistoryItem) {
        Object[] objArr = {webHistoryItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b18a707685d278267b77bb97daf2bdab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b18a707685d278267b77bb97daf2bdab");
        } else {
            this.b = webHistoryItem;
        }
    }

    @Override // com.meituan.mtwebkit.MTWebHistoryItem
    public final String getUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b38c9e1ed285cfb1e7d320fe99d6df2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b38c9e1ed285cfb1e7d320fe99d6df2") : this.b.getUrl();
    }

    @Override // com.meituan.mtwebkit.MTWebHistoryItem
    public final String getOriginalUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a340b1703300bbdc39d6b1384cf98b34", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a340b1703300bbdc39d6b1384cf98b34") : this.b.getOriginalUrl();
    }

    @Override // com.meituan.mtwebkit.MTWebHistoryItem
    public final String getTitle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0132d001abacb7d658fdcbd7debf5ca", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0132d001abacb7d658fdcbd7debf5ca") : this.b.getTitle();
    }

    @Override // com.meituan.mtwebkit.MTWebHistoryItem
    public final Bitmap getFavicon() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2d4ebe2d53f6b09da7dac1cb6ae6ed2", RobustBitConfig.DEFAULT_VALUE) ? (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2d4ebe2d53f6b09da7dac1cb6ae6ed2") : this.b.getFavicon();
    }
}
