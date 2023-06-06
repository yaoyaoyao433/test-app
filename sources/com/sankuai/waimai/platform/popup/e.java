package com.sankuai.waimai.platform.popup;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class e {
    public static ChangeQuickRedirect a;
    public static final String[] b = {"launch_screen", "privacy_alert", "version_update", "share_password", "guide_pop_high", "heaven_fall", "zim_intelligent_gpt_guide", "ugc_feed_guide"};
    public static final String[] c = {"version_update", "guide_pop_high", "heaven_fall", "zim_intelligent_gpt_guide", "ugc_feed_guide"};
    public static final String[] d = {"version_update", "account_notice", "guide_pop_high", "heaven_fall", "zim_intelligent_gpt_guide", "ugc_feed_guide"};
    public static e e;
    public WMBasePopup f;
    public a g;
    public boolean h;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void q();
    }

    public static e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2a2a27011cfaca08319c24c8c398d8fd", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2a2a27011cfaca08319c24c8c398d8fd");
        }
        if (e == null) {
            synchronized (e.class) {
                if (e == null) {
                    e = new e();
                }
            }
        }
        return e;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b68fe719f2ad655b6ec7dcff783d63d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b68fe719f2ad655b6ec7dcff783d63d5");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.c("WMPopup", "start ", new Object[0]);
        this.h = false;
        if (this.f == null || this.f.getNext() == null) {
            return;
        }
        this.f.getNext().handle();
    }
}
