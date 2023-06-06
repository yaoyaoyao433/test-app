package com.meituan.android.common.statistics.ad;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AdManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final AdManager instance = new AdManager();
    private IAdvertisement mIAdvertisement;

    public static AdManager getInstance() {
        return instance;
    }

    public void setAdvertisement(IAdvertisement iAdvertisement) {
        this.mIAdvertisement = iAdvertisement;
    }

    public IAdvertisement getAdvertisement() {
        return this.mIAdvertisement;
    }
}
