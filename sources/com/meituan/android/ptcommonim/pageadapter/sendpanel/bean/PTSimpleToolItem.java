package com.meituan.android.ptcommonim.pageadapter.sendpanel.bean;

import com.meituan.android.ptcommonim.pageadapter.event.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class PTSimpleToolItem {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final c event;
    public final String icon;
    public final String text;

    public PTSimpleToolItem(String str, String str2, c cVar) {
        this.icon = str;
        this.text = str2;
        this.event = cVar;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class Builder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private c event;
        private String icon;
        private String title;

        public Builder iconUrl(String str) {
            this.icon = str;
            return this;
        }

        public Builder title(String str) {
            this.title = str;
            return this;
        }

        public Builder clickEvent(c cVar) {
            this.event = cVar;
            return this;
        }

        public PTSimpleToolItem build() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c7d4e3d000de22d84442fed6f56c26e", RobustBitConfig.DEFAULT_VALUE) ? (PTSimpleToolItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c7d4e3d000de22d84442fed6f56c26e") : new PTSimpleToolItem(this.icon, this.title, this.event);
        }
    }
}
